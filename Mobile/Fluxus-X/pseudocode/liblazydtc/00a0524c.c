/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a0524c
 */

ulong bn_sub_words(ulong *rp,ulong *ap,ulong *bp,int num)

{
  long lVar1;
  ulong *puVar2;
  ulong *puVar3;
  uint uVar4;
  ulong uVar5;
  uint uVar6;
  uint uVar7;
  ulong *puVar8;
  ulong uVar9;
  ulong uVar10;
  ulong uVar11;
  ulong uVar12;
  
  if (num < 1) {
    return 0;
  }
  uVar4 = 0;
  uVar6 = num - 4;
  if (3 < (uint)num) {
    lVar1 = (ulong)(uVar6 & 0xfffffffc) + 4;
    puVar2 = ap + lVar1;
    puVar3 = rp + lVar1;
    puVar8 = bp;
    do {
      uVar9 = *ap;
      uVar11 = *puVar8;
      num = num - 4;
      uVar5 = uVar9 - (long)(int)uVar4;
      *rp = uVar5 - uVar11;
      uVar12 = ap[1];
      uVar10 = puVar8[1];
      uVar5 = (uVar12 - (uVar9 < uVar5)) - (ulong)(uVar5 < uVar5 - uVar11);
      rp[1] = uVar5 - uVar10;
      uVar11 = ap[2];
      uVar9 = puVar8[2];
      uVar5 = (uVar11 - (uVar12 < uVar5)) - (ulong)(uVar5 < uVar5 - uVar10);
      rp[2] = uVar5 - uVar9;
      uVar10 = ap[3];
      uVar12 = puVar8[3];
      ap = ap + 4;
      uVar5 = (uVar10 - (uVar11 < uVar5)) - (ulong)(uVar5 < uVar5 - uVar9);
      uVar7 = 2;
      if (uVar5 <= uVar10) {
        uVar7 = 1;
      }
      puVar8 = puVar8 + 4;
      rp[3] = uVar5 - uVar12;
      uVar4 = (uint)(uVar10 < uVar5);
      if (uVar5 < uVar5 - uVar12) {
        uVar4 = uVar7;
      }
      rp = rp + 4;
    } while (3 < (uint)num);
    num = uVar6 & 3;
    if (num == 0) goto LAB_00a05388;
    bp = bp + lVar1;
    ap = puVar2;
    rp = puVar3;
  }
  do {
    uVar9 = *ap;
    uVar5 = uVar9 - (long)(int)uVar4;
    uVar6 = 2;
    if (uVar5 <= uVar9) {
      uVar6 = 1;
    }
    uVar4 = (uint)(uVar9 < uVar5);
    if (uVar5 < uVar5 - *bp) {
      uVar4 = uVar6;
    }
    num = num - 1;
    *rp = uVar5 - *bp;
    bp = bp + 1;
    ap = ap + 1;
    rp = rp + 1;
  } while (num != 0);
LAB_00a05388:
  return (long)(int)uVar4;
}

