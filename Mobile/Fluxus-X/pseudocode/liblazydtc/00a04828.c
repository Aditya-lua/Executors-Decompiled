/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a04828
 */

ulong bn_mul_add_words(ulong *rp,ulong *ap,int num,ulong w)

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
  ulong uVar11;
  ulong uVar12;
  ulong *puVar13;
  ulong uVar14;
  ulong uVar15;
  ulong uVar16;
  ulong uVar17;
  
  if (num < 1) {
    return 0;
  }
  uVar11 = w & 0xffffffff;
  uVar7 = num - 4;
  uVar12 = w >> 0x20;
  uVar8 = 0;
  if (3 < (uint)num) {
    lVar3 = (ulong)(uVar7 & 0xfffffffc) + 4;
    puVar4 = rp + lVar3;
    puVar13 = ap;
    do {
      num = num - 4;
      uVar15 = *puVar13 & 0xffffffff;
      uVar14 = *puVar13 >> 0x20;
      uVar16 = uVar15 * uVar12;
      uVar17 = uVar14 * uVar11;
      uVar15 = uVar15 * uVar11;
      uVar5 = uVar16 + uVar17;
      uVar1 = uVar5 << 0x20;
      uVar6 = uVar15 + uVar1;
      uVar9 = *rp;
      uVar10 = rp[1];
      uVar5 = uVar14 * uVar12 + (uVar5 >> 0x20) + ((ulong)CARRY8(uVar16,uVar17) << 0x20);
      if (CARRY8(uVar15,uVar1)) {
        uVar5 = uVar5 + 1;
      }
      uVar1 = uVar6 + uVar8;
      if (CARRY8(uVar6,uVar8)) {
        uVar5 = uVar5 + 1;
      }
      *rp = uVar1 + uVar9;
      if (CARRY8(uVar1,uVar9)) {
        uVar5 = uVar5 + 1;
      }
      uVar15 = puVar13[1] & 0xffffffff;
      uVar14 = puVar13[1] >> 0x20;
      uVar16 = uVar15 * uVar12;
      uVar9 = uVar14 * uVar11;
      uVar1 = uVar16 + uVar9;
      uVar15 = uVar15 * uVar11;
      uVar8 = uVar1 << 0x20;
      uVar6 = uVar15 + uVar8;
      uVar1 = uVar14 * uVar12 + (uVar1 >> 0x20) + ((ulong)CARRY8(uVar16,uVar9) << 0x20);
      if (CARRY8(uVar15,uVar8)) {
        uVar1 = uVar1 + 1;
      }
      uVar8 = uVar5 + uVar6;
      if (CARRY8(uVar5,uVar6)) {
        uVar1 = uVar1 + 1;
      }
      rp[1] = uVar8 + uVar10;
      if (CARRY8(uVar8,uVar10)) {
        uVar1 = uVar1 + 1;
      }
      uVar15 = puVar13[2] & 0xffffffff;
      uVar14 = puVar13[2] >> 0x20;
      uVar16 = uVar15 * uVar12;
      uVar10 = uVar14 * uVar11;
      uVar15 = uVar15 * uVar11;
      uVar5 = uVar16 + uVar10;
      uVar8 = uVar5 << 0x20;
      uVar6 = uVar15 + uVar8;
      uVar9 = rp[2];
      uVar5 = uVar14 * uVar12 + (uVar5 >> 0x20) + ((ulong)CARRY8(uVar16,uVar10) << 0x20);
      if (CARRY8(uVar15,uVar8)) {
        uVar5 = uVar5 + 1;
      }
      uVar8 = uVar1 + uVar6;
      if (CARRY8(uVar1,uVar6)) {
        uVar5 = uVar5 + 1;
      }
      rp[2] = uVar8 + uVar9;
      puVar2 = puVar13 + 3;
      if (CARRY8(uVar8,uVar9)) {
        uVar5 = uVar5 + 1;
      }
      puVar13 = puVar13 + 4;
      uVar14 = *puVar2 & 0xffffffff;
      uVar10 = *puVar2 >> 0x20;
      uVar15 = uVar14 * uVar12;
      uVar9 = uVar10 * uVar11;
      uVar8 = uVar15 + uVar9;
      uVar14 = uVar14 * uVar11;
      uVar1 = uVar8 << 0x20;
      uVar6 = uVar14 + uVar1;
      uVar8 = uVar10 * uVar12 + (uVar8 >> 0x20) + ((ulong)CARRY8(uVar15,uVar9) << 0x20);
      if (CARRY8(uVar14,uVar1)) {
        uVar8 = uVar8 + 1;
      }
      uVar1 = uVar5 + uVar6;
      if (CARRY8(uVar5,uVar6)) {
        uVar8 = uVar8 + 1;
      }
      if (CARRY8(uVar1,rp[3])) {
        uVar8 = uVar8 + 1;
      }
      rp[3] = uVar1 + rp[3];
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
    uVar10 = *ap & 0xffffffff;
    uVar9 = *ap >> 0x20;
    uVar14 = uVar10 * uVar12;
    uVar15 = uVar9 * uVar11;
    uVar5 = uVar14 + uVar15;
    uVar10 = uVar10 * uVar11;
    uVar1 = uVar5 << 0x20;
    uVar6 = uVar10 + uVar1;
    uVar5 = uVar9 * uVar12 + (uVar5 >> 0x20) + ((ulong)CARRY8(uVar14,uVar15) << 0x20);
    if (CARRY8(uVar10,uVar1)) {
      uVar5 = uVar5 + 1;
    }
    uVar1 = uVar6 + uVar8;
    if (CARRY8(uVar6,uVar8)) {
      uVar5 = uVar5 + 1;
    }
    if (CARRY8(uVar1,*rp)) {
      uVar5 = uVar5 + 1;
    }
    num = num - 1;
    *rp = uVar1 + *rp;
    uVar8 = uVar5;
    ap = ap + 1;
    rp = rp + 1;
  } while (num != 0);
  return uVar5;
}

