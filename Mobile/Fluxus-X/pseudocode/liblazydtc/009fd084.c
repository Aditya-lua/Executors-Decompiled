/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009fd084
 */

BIO * BIO_next(BIO *b)

{
  BIO *pBVar1;
  
  pBVar1 = (BIO *)0x0;
  if (b != (BIO *)0x0) {
    pBVar1 = *(BIO **)&b->references;
  }
  return pBVar1;
}

