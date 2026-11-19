/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009fbff4
 */

char * BIO_get_callback_arg(BIO *b)

{
  return *(char **)&b->flags;
}

