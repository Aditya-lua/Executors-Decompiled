/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009fbffc
 */

char * BIO_method_name(BIO *b)

{
  return *(char **)(b->callback + 8);
}

