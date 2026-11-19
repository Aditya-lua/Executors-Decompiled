/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009fc008
 */

int BIO_method_type(BIO *b)

{
  return *(int *)b->callback;
}

