/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a02550
 */

int BN_ucmp(BIGNUM *a,BIGNUM *b)

{
  uint uVar1;
  uint uVar2;
  int iVar3;
  ulong *puVar4;
  ulong *puVar5;
  ulong uVar6;
  long lVar7;
  long lVar8;
  uint uVar9;
  ulong uVar10;
  uint uVar11;
  ulong uVar12;
  
  uVar11 = a->top;
  uVar6 = (ulong)uVar11;
  if ((((uint)a->flags >> 2 & 1) == 0) || (uVar11 != b->top)) {
    uVar2 = uVar11 - b->top;
    if (uVar2 == 0) {
      lVar8 = (long)(int)uVar11;
      do {
        lVar7 = lVar8 + -1;
        if (lVar8 < 1) {
          return 0;
        }
        uVar10 = a->d[lVar7];
        uVar6 = b->d[lVar7];
        lVar8 = lVar7;
      } while (uVar10 == uVar6);
      iVar3 = -1;
      if (uVar6 < uVar10) {
        iVar3 = 1;
      }
      return iVar3;
    }
  }
  else {
    if ((int)uVar11 < 1) {
      return 0;
    }
    uVar2 = 0;
    puVar4 = a->d;
    puVar5 = b->d;
    do {
      uVar10 = *puVar4;
      uVar12 = *puVar5;
      uVar6 = uVar6 - 1;
      uVar11 = (uint)(uVar12 >> 0x20);
      uVar1 = (uint)(uVar10 >> 0x20);
      uVar9 = (int)(((uint)(uVar10 - uVar12 >> 0x20) ^ uVar11 | uVar11 ^ uVar1) ^ uVar1) >> 0x1f;
      uVar11 = (int)(((uint)(uVar12 - uVar10 >> 0x20) ^ uVar1 | uVar11 ^ uVar1) ^ uVar11) >> 0x1f;
      uVar2 = ~uVar11 & (~uVar9 & uVar2 | uVar9) | uVar11 & 1;
      puVar4 = puVar4 + 1;
      puVar5 = puVar5 + 1;
    } while (uVar6 != 0);
  }
  return uVar2;
}

