/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a01cc4
 */

BIGNUM * BN_copy(BIGNUM *a,BIGNUM *b)

{
  long lVar1;
  int iVar2;
  BIGNUM *pBVar3;
  int iVar4;
  
  lVar1 = 8;
  if ((b->flags & 4) != 0) {
    lVar1 = 0xc;
  }
  if (a == b) {
    a = b;
  }
  else {
    iVar2 = *(int *)((long)&b->d + lVar1);
    if ((a->dmax < iVar2) && (pBVar3 = bn_expand2(a,iVar2), pBVar3 == (BIGNUM *)0x0)) {
      a = (BIGNUM *)0x0;
    }
    else {
      iVar4 = b->top;
      if (0 < iVar4) {
        memcpy(a->d,b->d,(long)iVar2 << 3);
        iVar4 = b->top;
      }
      iVar2 = b->neg;
      a->top = iVar4;
      a->neg = iVar2;
    }
  }
  return a;
}

