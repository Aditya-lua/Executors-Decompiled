/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a05130
 */

ulong bn_add_words(ulong *rp,ulong *ap,ulong *bp,int num)

{
  ulong *puVar1;
  long lVar2;
  ulong *puVar3;
  ulong *puVar4;
  uint uVar5;
  ulong uVar6;
  ulong *puVar7;
  ulong uVar8;
  ulong uVar9;
  ulong uVar10;
  ulong uVar11;
  ulong uVar12;
  ulong uVar13;
  
  if (num < 1) {
    return 0;
  }
  uVar6 = 0;
  uVar5 = num - 4;
  if (3 < (uint)num) {
    lVar2 = (ulong)(uVar5 & 0xfffffffc) + 4;
    puVar3 = ap + lVar2;
    puVar4 = rp + lVar2;
    puVar7 = bp;
    do {
      uVar8 = *ap;
      uVar11 = *puVar7;
      num = num - 4;
      uVar12 = 2;
      if (!CARRY8(uVar8,uVar6)) {
        uVar12 = 1;
      }
      *rp = uVar8 + uVar6 + uVar11;
      uVar9 = ap[1];
      uVar10 = (ulong)CARRY8(uVar8,uVar6);
      if (CARRY8(uVar8 + uVar6,uVar11)) {
        uVar10 = uVar12;
      }
      uVar12 = puVar7[1];
      uVar6 = 2;
      if (!CARRY8(uVar10,uVar9)) {
        uVar6 = 1;
      }
      rp[1] = uVar10 + uVar9 + uVar12;
      uVar11 = ap[2];
      uVar13 = puVar7[2];
      uVar8 = (ulong)CARRY8(uVar10,uVar9);
      if (CARRY8(uVar10 + uVar9,uVar12)) {
        uVar8 = uVar6;
      }
      uVar6 = 2;
      if (!CARRY8(uVar8,uVar11)) {
        uVar6 = 1;
      }
      rp[2] = uVar8 + uVar11 + uVar13;
      uVar10 = ap[3];
      puVar1 = puVar7 + 3;
      uVar12 = (ulong)CARRY8(uVar8,uVar11);
      if (CARRY8(uVar8 + uVar11,uVar13)) {
        uVar12 = uVar6;
      }
      ap = ap + 4;
      uVar8 = 2;
      if (!CARRY8(uVar12,uVar10)) {
        uVar8 = 1;
      }
      puVar7 = puVar7 + 4;
      uVar6 = (ulong)CARRY8(uVar12,uVar10);
      if (CARRY8(uVar12 + uVar10,*puVar1)) {
        uVar6 = uVar8;
      }
      rp[3] = uVar12 + uVar10 + *puVar1;
      rp = rp + 4;
    } while (3 < (uint)num);
    num = uVar5 & 3;
    if (num == 0) {
      return uVar6;
    }
    bp = bp + lVar2;
    ap = puVar3;
    rp = puVar4;
  }
  do {
    uVar11 = *ap;
    uVar12 = uVar11 + uVar6;
    uVar8 = 2;
    if (!CARRY8(uVar11,uVar6)) {
      uVar8 = 1;
    }
    uVar6 = (ulong)CARRY8(uVar11,uVar6);
    if (CARRY8(uVar12,*bp)) {
      uVar6 = uVar8;
    }
    num = num - 1;
    *rp = uVar12 + *bp;
    bp = bp + 1;
    ap = ap + 1;
    rp = rp + 1;
  } while (num != 0);
  return uVar6;
}

