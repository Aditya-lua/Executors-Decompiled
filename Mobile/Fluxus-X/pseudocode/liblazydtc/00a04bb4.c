/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a04bb4
 */

void bn_sqr_words(ulong *rp,ulong *ap,int num)

{
  uint uVar1;
  uint uVar2;
  uint uVar3;
  ulong uVar4;
  ulong uVar5;
  ulong uVar6;
  ulong uVar7;
  ulong uVar8;
  ulong uVar9;
  ulong uVar10;
  ulong uVar11;
  ulong uVar12;
  ulong uVar13;
  ulong uVar14;
  ulong uVar15;
  ulong uVar16;
  ulong uVar17;
  ulong uVar18;
  ulong *puVar25;
  ulong *puVar24;
  ulong *puVar23;
  ulong *puVar22;
  ulong *puVar21;
  ulong *puVar20;
  ulong *puVar19;
  ulong *puVar26;
  ulong *puVar27;
  ulong uVar28;
  ulong uVar29;
  long lVar30;
  long lVar31;
  ulong uVar32;
  ulong *puVar33;
  ulong *puVar34;
  ulong uVar35;
  ulong uVar36;
  ulong uVar37;
  ulong uVar38;
  ulong uVar39;
  ulong uVar40;
  ulong uVar41;
  ulong uVar42;
  ulong uVar43;
  ulong uVar44;
  ulong uVar45;
  ulong uVar46;
  ulong uVar47;
  ulong uVar48;
  ulong uVar49;
  ulong uVar50;
  
  if (num < 1) {
    return;
  }
  uVar3 = num - 4;
  if ((uint)num < 4) goto LAB_00a04ccc;
  uVar2 = uVar3 >> 2;
  uVar1 = uVar2 + 1;
  if ((uVar1 < 2) ||
     ((rp < ap + (ulong)(uVar3 & 0xfffffffc) + 4 && (ap < rp + (ulong)uVar2 * 8 + 8)))) {
    puVar27 = rp;
    puVar26 = ap;
LAB_00a04c00:
    do {
      num = num - 4;
      uVar32 = *puVar26 & 0xffffffff;
      uVar28 = *puVar26 >> 0x20;
      uVar29 = uVar28 * uVar28 + (uVar32 * uVar28 >> 0x1f);
      uVar28 = uVar32 * uVar28 << 0x21;
      if (CARRY8(uVar32 * uVar32,uVar28)) {
        uVar29 = uVar29 + 1;
      }
      *puVar27 = uVar32 * uVar32 + uVar28;
      puVar27[1] = uVar29;
      uVar32 = puVar26[1] & 0xffffffff;
      uVar28 = puVar26[1] >> 0x20;
      uVar29 = uVar28 * uVar28 + (uVar32 * uVar28 >> 0x1f);
      uVar28 = uVar32 * uVar28 << 0x21;
      if (CARRY8(uVar32 * uVar32,uVar28)) {
        uVar29 = uVar29 + 1;
      }
      puVar27[2] = uVar32 * uVar32 + uVar28;
      puVar27[3] = uVar29;
      uVar32 = puVar26[2] & 0xffffffff;
      uVar28 = puVar26[2] >> 0x20;
      uVar29 = uVar28 * uVar28 + (uVar32 * uVar28 >> 0x1f);
      uVar28 = uVar32 * uVar28 << 0x21;
      if (CARRY8(uVar32 * uVar32,uVar28)) {
        uVar29 = uVar29 + 1;
      }
      puVar27[4] = uVar32 * uVar32 + uVar28;
      puVar27[5] = uVar29;
      puVar33 = puVar26 + 3;
      puVar26 = puVar26 + 4;
      uVar32 = *puVar33 & 0xffffffff;
      uVar28 = *puVar33 >> 0x20;
      uVar29 = uVar28 * uVar28 + (uVar32 * uVar28 >> 0x1f);
      uVar28 = uVar32 * uVar28 << 0x21;
      if (CARRY8(uVar32 * uVar32,uVar28)) {
        uVar29 = uVar29 + 1;
      }
      puVar27[6] = uVar32 * uVar32 + uVar28;
      puVar27[7] = uVar29;
      puVar27 = puVar27 + 8;
    } while (3 < (uint)num);
  }
  else {
    uVar29 = (ulong)uVar1 & 0x7ffffffe;
    puVar27 = rp + uVar29 * 8;
    puVar26 = ap + uVar29 * 4;
    num = ((~uVar3 & 4) + num + -4) - (uVar3 & 0xfffffffc);
    uVar28 = uVar29;
    puVar33 = rp;
    puVar34 = ap;
    do {
      uVar32 = *puVar34;
      puVar19 = puVar34 + 1;
      puVar20 = puVar34 + 2;
      puVar21 = puVar34 + 3;
      puVar22 = puVar34 + 4;
      puVar23 = puVar34 + 5;
      puVar24 = puVar34 + 6;
      puVar25 = puVar34 + 7;
      puVar34 = puVar34 + 8;
      uVar28 = uVar28 - 2;
      uVar35 = uVar32 >> 0x20;
      uVar36 = *puVar22 >> 0x20;
      uVar32 = uVar32 & 0xffffffff;
      uVar13 = *puVar21 & 0xffffffff;
      uVar17 = *puVar21 >> 0x20;
      uVar47 = *puVar20 >> 0x20;
      uVar49 = *puVar24 >> 0x20;
      uVar10 = *puVar22 & 0xffffffff;
      uVar37 = *puVar19 & 0xffffffff;
      uVar39 = *puVar23 & 0xffffffff;
      uVar41 = *puVar19 >> 0x20;
      uVar43 = *puVar23 >> 0x20;
      uVar18 = *puVar25 >> 0x20;
      uVar45 = *puVar20 & 0xffffffff;
      uVar46 = *puVar24 & 0xffffffff;
      uVar14 = *puVar25 & 0xffffffff;
      uVar4 = uVar32 * uVar35 << 0x21;
      uVar6 = uVar10 * uVar36 << 0x21;
      uVar7 = uVar37 * uVar41 << 0x21;
      uVar9 = uVar39 * uVar43 << 0x21;
      uVar38 = uVar45 * uVar47 << 0x21;
      uVar40 = uVar46 * uVar49 << 0x21;
      uVar48 = uVar13 * uVar17 << 0x21;
      uVar50 = uVar14 * uVar18 << 0x21;
      uVar8 = uVar4 + uVar32 * uVar32;
      uVar5 = uVar6 + uVar10 * uVar10;
      uVar11 = uVar7 + uVar37 * uVar37;
      uVar12 = uVar9 + uVar39 * uVar39;
      uVar42 = uVar38 + uVar45 * uVar45;
      uVar44 = uVar40 + uVar46 * uVar46;
      uVar15 = uVar48 + uVar13 * uVar13;
      uVar16 = uVar50 + uVar14 * uVar14;
      puVar33[0xd] = uVar49 * uVar49 + (uVar46 * uVar49 >> 0x1f) + (ulong)(uVar44 < uVar40);
      puVar33[0xc] = uVar44;
      puVar33[0xf] = uVar18 * uVar18 + (uVar14 * uVar18 >> 0x1f) + (ulong)(uVar16 < uVar50);
      puVar33[0xe] = uVar16;
      puVar33[9] = uVar36 * uVar36 + (uVar10 * uVar36 >> 0x1f) + (ulong)(uVar5 < uVar6);
      puVar33[8] = uVar5;
      puVar33[0xb] = uVar43 * uVar43 + (uVar39 * uVar43 >> 0x1f) + (ulong)(uVar12 < uVar9);
      puVar33[10] = uVar12;
      puVar33[5] = uVar47 * uVar47 + (uVar45 * uVar47 >> 0x1f) + (ulong)(uVar42 < uVar38);
      puVar33[4] = uVar42;
      puVar33[7] = uVar17 * uVar17 + (uVar13 * uVar17 >> 0x1f) + (ulong)(uVar15 < uVar48);
      puVar33[6] = uVar15;
      puVar33[1] = uVar35 * uVar35 + (uVar32 * uVar35 >> 0x1f) + (ulong)(uVar8 < uVar4);
      *puVar33 = uVar8;
      puVar33[3] = uVar41 * uVar41 + (uVar37 * uVar41 >> 0x1f) + (ulong)(uVar11 < uVar7);
      puVar33[2] = uVar11;
      puVar33 = puVar33 + 0x10;
    } while (uVar28 != 0);
    if (uVar29 != uVar1) goto LAB_00a04c00;
  }
  num = uVar3 & 3;
  if (num == 0) {
    return;
  }
  rp = rp + (ulong)uVar2 * 8 + 8;
  ap = ap + (ulong)(uVar3 & 0xfffffffc) + 4;
LAB_00a04ccc:
  uVar28 = (ulong)(num - 1U);
  if ((uVar28 + 1 < 2) || ((rp < ap + uVar28 + 1 && (ap < rp + uVar28 * 2 + 2)))) {
    puVar26 = rp;
    puVar27 = ap;
  }
  else {
    uVar3 = ~(num - 1U) & 1;
    lVar31 = (uVar28 + 1) - (ulong)uVar3;
    lVar30 = (uVar28 + 1) - (ulong)uVar3;
    puVar26 = rp + lVar31 * 2;
    puVar27 = ap + lVar31;
    num = num - (int)lVar31;
    do {
      lVar30 = lVar30 + -2;
      uVar32 = *ap & 0xffffffff;
      uVar5 = *ap >> 0x20;
      uVar4 = ap[1] & 0xffffffff;
      uVar7 = ap[1] >> 0x20;
      uVar28 = uVar32 * uVar5 << 0x21;
      uVar29 = uVar4 * uVar7 << 0x21;
      uVar6 = uVar28 + uVar32 * uVar32;
      uVar8 = uVar29 + uVar4 * uVar4;
      *rp = uVar6;
      rp[1] = uVar5 * uVar5 + (uVar32 * uVar5 >> 0x1f) + (ulong)(uVar6 < uVar28);
      rp[2] = uVar8;
      rp[3] = uVar7 * uVar7 + (uVar4 * uVar7 >> 0x1f) + (ulong)(uVar8 < uVar29);
      rp = rp + 4;
      ap = ap + 2;
    } while (lVar30 != 0);
    if (uVar3 == 0) {
      return;
    }
  }
  do {
    uVar32 = *puVar27 & 0xffffffff;
    uVar28 = *puVar27 >> 0x20;
    uVar29 = uVar28 * uVar28 + (uVar32 * uVar28 >> 0x1f);
    uVar28 = uVar32 * uVar28 << 0x21;
    if (CARRY8(uVar32 * uVar32,uVar28)) {
      uVar29 = uVar29 + 1;
    }
    num = num - 1;
    *puVar26 = uVar32 * uVar32 + uVar28;
    puVar26[1] = uVar29;
    puVar26 = puVar26 + 2;
    puVar27 = puVar27 + 1;
  } while (num != 0);
  return;
}

