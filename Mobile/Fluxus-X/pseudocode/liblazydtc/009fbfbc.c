/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009fbfbc
 */

void BIO_set_flags(BIO *b,int flags)

{
  *(uint *)&b->ptr = *(uint *)&b->ptr | flags;
  return;
}

