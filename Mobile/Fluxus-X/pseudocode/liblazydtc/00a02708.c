/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a02708
 */

int BN_set_bit(BIGNUM *a,int n)

{
  uint uVar1;
  BIGNUM *pBVar2;
  int iVar3;
  
  if (n < 0) {
    iVar3 = 0;
  }
  else {
    iVar3 = a->top;
    uVar1 = (uint)n >> 6;
    if (iVar3 <= (int)uVar1) {
      if (a->dmax <= (int)uVar1) {
        pBVar2 = bn_expand2(a,uVar1 + 1);
        if (pBVar2 == (BIGNUM *)0x0) {
          return 0;
        }
        iVar3 = a->top;
      }
      if (iVar3 <= (int)uVar1) {
        memset(a->d + iVar3,0,(ulong)(uVar1 - iVar3) * 8 + 8);
      }
      a->top = uVar1 + 1;
    }
    iVar3 = 1;
    a->d[uVar1] = a->d[uVar1] | 1L << (n & 0x3fU);
  }
  return iVar3;
}

