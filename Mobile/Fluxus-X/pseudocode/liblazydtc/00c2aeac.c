/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c2aeac
 */

undefined1  [16] FUN_00c2aeac(undefined1 param_1 [16],undefined1 param_2 [16])

{
  int iVar1;
  uint uVar2;
  undefined1 auVar3 [16];
  undefined1 auVar4 [16];
  undefined1 auVar5 [16];
  undefined1 auVar6 [16];
  undefined1 auVar7 [16];
  undefined1 auVar8 [16];
  undefined1 auVar9 [16];
  undefined1 auVar10 [16];
  undefined1 auVar11 [16];
  bool bVar12;
  ulong uVar13;
  ulong uVar14;
  ulong uVar15;
  ulong uVar16;
  ulong uVar17;
  ulong uVar18;
  ulong uVar19;
  ulong uVar20;
  ulong uVar21;
  ulong uVar22;
  uint uVar23;
  uint uVar24;
  ulong uVar25;
  ulong uVar26;
  ulong uVar27;
  ulong uVar28;
  ulong uVar29;
  int iVar30;
  ulong uVar31;
  ulong uVar32;
  ulong uVar33;
  ulong uVar34;
  ulong uVar35;
  ulong uVar36;
  ulong uVar37;
  
  uVar16 = param_2._8_8_;
  uVar26 = param_2._0_8_;
  uVar32 = param_1._8_8_;
  uVar29 = param_1._0_8_;
  uVar23 = param_1._14_2_ & 0x7fff;
  uVar31 = uVar32 >> 0x20 & 0xffff;
  uVar24 = param_2._14_2_ & 0x7fff;
  uVar22 = (uVar16 ^ uVar32) & 0x8000000000000000;
  uVar25 = uVar32 & 0xffffffffffff;
  uVar27 = uVar16 & 0xffffffffffff;
  if ((uVar23 - 0x7fff < 0xffff8002) || (uVar24 - 0x7fff < 0xffff8002)) {
    uVar14 = uVar32 & 0x7fffffffffffffff;
    if (0x7fff000000000000 < uVar14 || CARRY8(uVar14 + 0x8000ffffffffffff,(ulong)(uVar29 != 0))) {
      auVar3._8_8_ = uVar32 | 0x800000000000;
      auVar3._0_8_ = uVar29;
      return auVar3;
    }
    uVar32 = uVar16 & 0x7fffffffffffffff;
    if (0x7fff000000000000 < uVar32 || CARRY8(uVar32 + 0x8000ffffffffffff,(ulong)(uVar26 != 0))) {
      auVar4._8_8_ = uVar16 | 0x800000000000;
      auVar4._0_8_ = uVar26;
      return auVar4;
    }
    if (uVar29 == 0 && uVar14 == 0x7fff000000000000) {
      if (uVar26 != 0 || uVar32 != 0) {
        auVar7._8_8_ = 0;
        auVar7._0_8_ = uVar22 | 0x7fff000000000000;
        return auVar7 << 0x40;
      }
LAB_00c2b254:
      return ZEXT816(0x7fff800000000000) << 0x40;
    }
    if (uVar26 == 0 && uVar32 == 0x7fff000000000000) {
      if (uVar29 != 0 || uVar14 != 0) {
        auVar8._8_8_ = 0;
        auVar8._0_8_ = uVar22 | 0x7fff000000000000;
        return auVar8 << 0x40;
      }
      goto LAB_00c2b254;
    }
    if (uVar29 == 0 && uVar14 == 0) {
      auVar10._8_8_ = 0;
      auVar10._0_8_ = uVar22;
      return auVar10 << 0x40;
    }
    if (uVar26 == 0 && uVar32 == 0) {
      auVar11._8_8_ = 0;
      auVar11._0_8_ = uVar22;
      return auVar11 << 0x40;
    }
    if (uVar14 >> 0x30 == 0) {
      uVar31 = uVar29;
      if (uVar25 != 0) {
        uVar31 = uVar25;
      }
      iVar30 = (int)LZCOUNT(uVar31) + (uint)(uVar25 == 0) * 0x40;
      uVar2 = iVar30 - 0xf;
      uVar16 = uVar25 << ((ulong)uVar2 & 0x3f);
      uVar31 = uVar29 << ((ulong)uVar2 & 0x3f);
      bVar12 = (uVar2 & 0x40) == 0;
      uVar25 = uVar31;
      if (bVar12) {
        uVar25 = uVar16 | (uVar29 >> 1) >> ((ulong)~uVar2 & 0x3f);
      }
      uVar29 = 0;
      if (bVar12) {
        uVar29 = uVar31;
      }
      iVar30 = 0x10 - iVar30;
      uVar31 = uVar25 >> 0x20;
    }
    else {
      iVar30 = 0;
    }
    if (uVar32 >> 0x30 == 0) {
      uVar16 = uVar26 >> 1;
      uVar32 = uVar26;
      if (uVar27 != 0) {
        uVar32 = uVar27;
      }
      iVar1 = (int)LZCOUNT(uVar32) + (uint)(uVar27 == 0) * 0x40;
      uVar2 = iVar1 - 0xf;
      uVar14 = uVar26 << ((ulong)uVar2 & 0x3f);
      uVar32 = uVar27 << ((ulong)uVar2 & 0x3f);
      bVar12 = (uVar2 & 0x40) == 0;
      iVar30 = (iVar30 - iVar1) + 0x10;
      uVar26 = 0;
      if (bVar12) {
        uVar26 = uVar14;
      }
      uVar27 = uVar14;
      if (bVar12) {
        uVar27 = uVar32 | uVar16 >> ((ulong)~uVar2 & 0x3f);
      }
    }
  }
  else {
    iVar30 = 0;
  }
  uVar33 = uVar26 << 0xf;
  uVar13 = uVar26 >> 0x11 & 0xffffffff;
  uVar17 = uVar29 >> 0x20;
  uVar31 = uVar31 | 0x10000;
  uVar26 = uVar26 >> 0x31;
  uVar34 = uVar27 << 0xf;
  uVar36 = uVar13 * (uVar29 & 0xffffffff);
  uVar20 = (uVar33 & 0xffffffff) * uVar31;
  uVar15 = uVar26 | uVar34 & 0xffffffff;
  uVar18 = (uVar33 & 0xffffffff) * uVar17;
  uVar28 = uVar27 >> 0x11 & 0xffffffff | 0x80000000;
  uVar16 = (uVar33 & 0xffffffff) * (uVar25 & 0xffffffff);
  uVar27 = uVar18 + uVar36;
  uVar14 = uVar13 * (uVar25 & 0xffffffff);
  uVar35 = uVar28 * (uVar29 & 0xffffffff);
  uVar32 = uVar16 + uVar13 * uVar17;
  uVar19 = uVar15 * uVar31;
  uVar37 = (ulong)CARRY8(uVar16,uVar13 * uVar17);
  uVar15 = uVar15 * uVar17;
  uVar16 = uVar20 + uVar14;
  uVar21 = uVar28 * (uVar25 & 0xffffffff);
  uVar20 = (ulong)CARRY8(uVar20,uVar14);
  uVar14 = uVar16 + uVar35;
  if (CARRY8(uVar16,uVar35)) {
    uVar20 = uVar20 + 1;
  }
  uVar16 = uVar14 + uVar15;
  uVar25 = (uVar26 | uVar34 & 0xffffffff) * (uVar25 & 0xffffffff);
  if (CARRY8(uVar14,uVar15)) {
    uVar20 = uVar20 + 1;
  }
  uVar14 = uVar19 + uVar21;
  uVar15 = (uVar26 | uVar34 & 0xffffffff) * (uVar29 & 0xffffffff);
  uVar26 = uVar28 * uVar17 + uVar13 * uVar31;
  uVar13 = (ulong)CARRY8(uVar28 * uVar17,uVar13 * uVar31);
  uVar34 = uVar26 + uVar25;
  uVar17 = uVar27 >> 0x20 | (ulong)CARRY8(uVar18,uVar36) << 0x20;
  if (CARRY8(uVar26,uVar25)) {
    uVar13 = uVar13 + 1;
  }
  uVar18 = (uVar33 & 0xffffffff) * (uVar29 & 0xffffffff);
  uVar33 = uVar34 + uVar37 + (ulong)CARRY8(uVar32,uVar15);
  uVar29 = uVar32 + uVar15 + uVar17;
  uVar20 = uVar16 >> 0x20 | uVar20 << 0x20;
  uVar17 = (ulong)CARRY8(uVar32 + uVar15,uVar17);
  uVar25 = uVar14 << 0x20;
  uVar26 = uVar33 + uVar25;
  uVar31 = uVar13 + uVar28 * uVar31 +
           (ulong)(CARRY8(uVar34,uVar37) || CARRY8(uVar34 + uVar37,(ulong)CARRY8(uVar32,uVar15))) +
           (uVar14 >> 0x20 | (ulong)CARRY8(uVar19,uVar21) << 0x20) + (ulong)CARRY8(uVar33,uVar25);
  uVar25 = uVar26 + uVar20;
  if (CARRY8(uVar26,uVar20)) {
    uVar31 = uVar31 + 1;
  }
  uVar16 = uVar16 << 0x20;
  uVar26 = uVar29 + uVar16;
  uVar32 = uVar25 + uVar17 + (ulong)CARRY8(uVar29,uVar16);
  if (CARRY8(uVar25,uVar17) || CARRY8(uVar25 + uVar17,(ulong)CARRY8(uVar29,uVar16))) {
    uVar31 = uVar31 + 1;
  }
  uVar27 = uVar27 << 0x20;
  uVar29 = uVar18 + uVar27;
  bVar12 = CARRY8(uVar26,(ulong)CARRY8(uVar18,uVar27));
  uVar26 = uVar26 + CARRY8(uVar18,uVar27);
  uVar25 = uVar32 + bVar12;
  if (CARRY8(uVar32,(ulong)bVar12)) {
    uVar31 = uVar31 + 1;
  }
  uVar23 = uVar23 + uVar24 + iVar30 + -0x3fff;
  if ((uVar31 >> 0x30 & 1) == 0) {
    uVar31 = uVar25 >> 0x3f | uVar31 << 1;
    uVar25 = uVar26 >> 0x3f | uVar25 * 2;
    uVar26 = uVar29 >> 0x3f | uVar26 * 2;
    uVar29 = uVar29 * 2;
  }
  else {
    uVar23 = uVar23 + 1;
  }
  if (0x7ffe < (int)uVar23) {
    auVar6._8_8_ = 0;
    auVar6._0_8_ = uVar22 | 0x7fff000000000000;
    return auVar6 << 0x40;
  }
  if ((int)uVar23 < 1) {
    uVar24 = 1 - uVar23;
    uVar27 = (ulong)uVar24;
    if (0x7f < uVar24) {
      auVar9._8_8_ = 0;
      auVar9._0_8_ = uVar22;
      return auVar9 << 0x40;
    }
    uVar23 = uVar23 + 0x7f;
    uVar16 = (ulong)uVar23;
    bVar12 = (uVar23 & 0x40) == 0;
    uVar34 = uVar29 << (uVar16 & 0x3f);
    uVar20 = uVar26 >> (uVar27 & 0x3f);
    uVar14 = uVar25 << (uVar16 & 0x3f);
    uVar32 = uVar34;
    if (bVar12) {
      uVar32 = uVar26 << (uVar16 & 0x3f) | (uVar29 >> 1) >> ((ulong)~uVar23 & 0x3f);
    }
    uVar13 = 0;
    if (bVar12) {
      uVar13 = uVar34;
    }
    uVar15 = uVar25 >> (uVar27 & 0x3f);
    uVar34 = uVar14;
    if (bVar12) {
      uVar34 = uVar31 << (uVar16 & 0x3f) | (uVar25 >> 1) >> ((ulong)~uVar23 & 0x3f);
    }
    uVar25 = 0;
    if (bVar12) {
      uVar25 = uVar14;
    }
    bVar12 = (uVar24 & 0x40) == 0;
    uVar16 = uVar20;
    if (bVar12) {
      uVar16 = (uVar26 << 1) << ((ulong)~uVar24 & 0x3f) | uVar29 >> (uVar27 & 0x3f);
    }
    uVar27 = uVar31 >> (uVar27 & 0x3f);
    uVar26 = 0;
    if (bVar12) {
      uVar26 = uVar20;
    }
    uVar26 = uVar34 | uVar26;
    uVar29 = uVar25 | uVar16 | (ulong)(uVar13 != 0 || uVar32 != 0);
    uVar25 = uVar27;
    if (bVar12) {
      uVar25 = (uVar31 << 1) << ((ulong)~uVar24 & 0x3f) | uVar15;
    }
    uVar31 = 0;
    if (bVar12) {
      uVar31 = uVar27;
    }
    uVar22 = uVar31 | uVar22;
    if (!(0x8000000000000000 < uVar26 || CARRY8(uVar26 + 0x7fffffffffffffff,(ulong)(uVar29 != 0))))
    goto LAB_00c2b1dc;
LAB_00c2b050:
    bVar12 = 0xfffffffffffffffe < uVar25;
    uVar25 = uVar25 + 1;
  }
  else {
    uVar22 = uVar31 & 0xffffffffffff | (ulong)uVar23 << 0x30 | uVar22;
    if (!(uVar26 < 0x8000000000000001 && !CARRY8(uVar26 + 0x7fffffffffffffff,(ulong)(uVar29 != 0))))
    goto LAB_00c2b050;
LAB_00c2b1dc:
    if (uVar29 != 0 || uVar26 != 0x8000000000000000) goto LAB_00c2b1f4;
    bVar12 = CARRY8(uVar25,uVar25 & 1);
    uVar25 = uVar25 + (uVar25 & 1);
  }
  if (bVar12) {
    uVar22 = uVar22 + 1;
  }
LAB_00c2b1f4:
  auVar5._8_8_ = uVar22;
  auVar5._0_8_ = uVar25;
  return auVar5;
}

