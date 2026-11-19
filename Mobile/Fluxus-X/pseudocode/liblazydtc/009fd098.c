/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009fd098
 */

void BIO_free_all(BIO *a)

{
  ulong uVar1;
  BIO *pBVar2;
  
  if (a != (BIO *)0x0) {
    do {
      uVar1 = a->num_write;
      pBVar2 = *(BIO **)&a->references;
      BIO_free(a);
      if (1 < (int)uVar1) {
        return;
      }
      a = pBVar2;
    } while (pBVar2 != (BIO *)0x0);
  }
  return;
}

