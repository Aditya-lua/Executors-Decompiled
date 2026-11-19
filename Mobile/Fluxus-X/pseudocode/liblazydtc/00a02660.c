/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a02660
 */

int BN_cmp(BIGNUM *a,BIGNUM *b)

{
  int iVar1;
  int iVar2;
  int iVar3;
  uint uVar4;
  long lVar5;
  long lVar6;
  int iVar7;
  
  if ((a == (BIGNUM *)0x0) || (b == (BIGNUM *)0x0)) {
    uVar4 = (uint)(b != (BIGNUM *)0x0);
    if (a != (BIGNUM *)0x0) {
      uVar4 = 0xffffffff;
    }
    return uVar4;
  }
  iVar1 = a->neg;
  iVar7 = -1;
  if (iVar1 == 0) {
    iVar7 = 1;
  }
  if (iVar1 == b->neg) {
    iVar2 = a->top;
    lVar5 = (long)iVar2;
    iVar3 = 1;
    if (iVar1 == 0) {
      iVar3 = -1;
    }
    if (iVar2 <= b->top) {
      if (b->top <= iVar2) {
        do {
          lVar6 = lVar5 + -1;
          if (lVar5 < 1) {
            return 0;
          }
          if (b->d[lVar6] < a->d[lVar6]) {
            return iVar7;
          }
          lVar5 = lVar6;
        } while (b->d[lVar6] <= a->d[lVar6]);
      }
      iVar7 = iVar3;
    }
  }
  return iVar7;
}

