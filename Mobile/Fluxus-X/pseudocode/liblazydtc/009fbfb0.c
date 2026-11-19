/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009fbfb0
 */

int BIO_test_flags(BIO *b,int flags)

{
  return *(uint *)&b->ptr & flags;
}

