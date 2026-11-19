/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009fbfa0
 */

void BIO_clear_flags(BIO *b,int flags)

{
  *(uint *)&b->ptr = *(uint *)&b->ptr & (flags ^ 0xffffffffU);
  return;
}

