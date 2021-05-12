import argparse
from os import path
from antlr4 import FileStream, CommonTokenStream

from .parser import globVisitor
from .parser.build.tajaLexer import tajaLexer
from .parser.build.tajaParser import tajaParser

def main():
    # Argument parser
    parser_args = argparse.ArgumentParser(prog='Taja', description='Taja interpreter')
    parser_args.add_argument('input', type=str, help='source code')
    args = parser_args.parse_args()

    input_stream = FileStream(args.input)

    lexer = tajaLexer(input_stream)
    stream = CommonTokenStream(lexer)
    parser = tajaParser(stream)

    tree = parser.start()

    visitor = globVisitor(args.input)
    glob = visitor.visitStart(tree)

    glob['main'](glob=glob)

if __name__ == '__main__':
    main()