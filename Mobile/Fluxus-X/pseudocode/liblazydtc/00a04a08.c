/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a04a08
 */

ulong bn_mul_words(ulong *rp,ulong *ap,int num,ulong w)

{
  ulong uVar1;
  ulong *puVar2;
  long lVar3;
  ulong *puVar4;
  ulong uVar5;
  ulong uVar6;
  uint uVar7;
  ulong uVar8;
  ulong uVar9;
  ulong uVar10;
  ulong *puVar11;
  ulong uVar12;
  ulong uVar13;
  ulong uVar14;
  ulong uVar15;
  
  if (num < 1) {
    return 0;
  }
  uVar9 = w & 0xffffffff;
  uVar7 = num - 4;
  uVar10 = w >> 0x20;
  uVar8 = 0;
  if (3 < (uint)num) {
    lVar3 = (ulong)(uVar7 & 0xfffffffc) + 4;
    puVar4 = rp + lVar3;
    puVar11 = ap;
    do {
      num = num - 4;
      uVar13 = *puVar11 & 0xffffffff;
      uVar12 = *puVar11 >> 0x20;
      uVar14 = uVar13 * uVar10;
      uVar15 = uVar12 * uVar9;
      uVar5 = uVar14 + uVar15;
      uVar13 = uVar13 * uVar9;
      uVar1 = uVar5 << 0x20;
      uVar6 = uVar13 + uVar1;
      uVar5 = uVar12 * uVar10 + (uVar5 >> 0x20) + ((ulong)CARRY8(uVar14,uVar15) << 0x20);
      if (CARRY8(uVar13,uVar1)) {
        uVar5 = uVar5 + 1;
      }
      *rp = uVar6 + uVar8;
      if (CARRY8(uVar6,uVar8)) {
        uVar5 = uVar5 + 1;
      }
      uVar13 = puVar11[1] & 0xffffffff;
      uVar12 = puVar11[1] >> 0x20;
      uVar14 = uVar13 * uVar10;
      uVar15 = uVar12 * uVar9;
      uVar1 = uVar14 + uVar15;
      uVar13 = uVar13 * uVar9;
      uVar8 = uVar1 << 0x20;
      uVar6 = uVar13 + uVar8;
      uVar1 = uVar12 * uVar10 + (uVar1 >> 0x20) + ((ulong)CARRY8(uVar14,uVar15) << 0x20);
      if (CARRY8(uVar13,uVar8)) {
        uVar1 = uVar1 + 1;
      }
      rp[1] = uVar5 + uVar6;
      if (CARRY8(uVar5,uVar6)) {
        uVar1 = uVar1 + 1;
      }
      uVar13 = puVar11[2] & 0xffffffff;
      uVar12 = puVar11[2] >> 0x20;
      uVar14 = uVar13 * uVar10;
      uVar15 = uVar12 * uVar9;
      uVar5 = uVar14 + uVar15;
      uVar13 = uVar13 * uVar9;
      uVar8 = uVar5 << 0x20;
      uVar6 = uVar13 + uVar8;
      uVar5 = uVar12 * uVar10 + (uVar5 >> 0x20) + ((ulong)CARRY8(uVar14,uVar15) << 0x20);
      if (CARRY8(uVar13,uVar8)) {
        uVar5 = uVar5 + 1;
      }
      rp[2] = uVar1 + uVar6;
      puVar2 = puVar11 + 3;
      if (CARRY8(uVar1,uVar6)) {
        uVar5 = uVar5 + 1;
      }
      puVar11 = puVar11 + 4;
      uVar13 = *puVar2 & 0xffffffff;
      uVar12 = *puVar2 >> 0x20;
      uVar14 = uVar13 * uVar10;
      uVar15 = uVar12 * uVar9;
      uVar8 = uVar14 + uVar15;
      uVar13 = uVar13 * uVar9;
      uVar1 = uVar8 << 0x20;
      uVar6 = uVar13 + uVar1;
      uVar8 = uVar12 * uVar10 + (uVar8 >> 0x20) + ((ulong)CARRY8(uVar14,uVar15) << 0x20);
      if (CARRY8(uVar13,uVar1)) {
        uVar8 = uVar8 + 1;
      }
      if (CARRY8(uVar5,uVar6)) {
        uVar8 = uVar8 + 1;
      }
      rp[3] = uVar5 + uVar6;
      rp = rp + 4;
    } while (3 < (uint)num);
    num = uVar7 & 3;
    if (num == 0) {
      return uVar8;
    }
    ap = ap + lVar3;
    rp = puVar4;
  }
  do {
    uVar13 = *ap & 0xffffffff;
    uVar12 = *ap >> 0x20;
    uVar14 = uVar13 * uVar10;
    uVar15 = uVar12 * uVar9;
    uVar5 = uVar14 + uVar15;
    uVar13 = uVar13 * uVar9;
    uVar1 = uVar5 << 0x20;
    uVar6 = uVar13 + uVar1;
    uVar5 = uVar12 * uVar10 + (uVar5 >> 0x20) + ((ulong)CARRY8(uVar14,uVar15) << 0x20);
    if (CARRY8(uVar13,uVar1)) {
      uVar5 = uVar5 + 1;
    }
    if (CARRY8(uVar6,uVar8)) {
      uVar5 = uVar5 + 1;
    }
    num = num - 1;
    *rp = uVar6 + uVar8;
    ap = ap + 1;
    uVar8 = uVar5;
    rp = rp + 1;
  } while (num != 0);
  return uVar5;
}

