/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ad16e0
 */

uint ossl_ifc_ffc_compute_security_bits(int param_1)

{
  ulong uVar1;
  bool bVar2;
  bool bVar3;
  bool bVar4;
  bool bVar5;
  bool bVar6;
  bool bVar7;
  bool bVar8;
  bool bVar9;
  bool bVar10;
  bool bVar11;
  bool bVar12;
  bool bVar13;
  bool bVar14;
  bool bVar15;
  bool bVar16;
  bool bVar17;
  bool bVar18;
  uint uVar19;
  uint uVar20;
  ulong uVar21;
  ulong uVar22;
  long lVar23;
  ulong uVar24;
  int iVar25;
  ulong uVar26;
  
  if (param_1 < 0x1800) {
    if (param_1 == 0x800) {
      return 0x70;
    }
    if (param_1 == 0xc00) {
      return 0x80;
    }
    if (param_1 == 0x1000) {
      return 0x98;
    }
  }
  else if (param_1 < 0x2000) {
    if (param_1 == 0x1800) {
      return 0xb0;
    }
    if (param_1 == 0x1e00) {
      return 0xc0;
    }
  }
  else {
    if (param_1 == 0x2000) {
      return 200;
    }
    if (param_1 == 0x3c00) {
      return 0x100;
    }
  }
  if (0xa7e78 < param_1) {
    return 0x4b0;
  }
  uVar19 = 0;
  if (7 < param_1) {
    uVar21 = (long)param_1 * 0x2c5c8;
    uVar20 = 0x100;
    if (0x3c00 < param_1) {
      uVar20 = 0x4b0;
    }
    uVar19 = 0xc0;
    if (0x1e00 < param_1) {
      uVar19 = uVar20;
    }
    if (uVar21 < 0x80000) {
      iVar25 = 0;
      uVar22 = uVar21;
    }
    else {
      iVar25 = 0;
      uVar24 = uVar21;
      do {
        uVar22 = uVar24 >> 1;
        uVar26 = uVar24 >> 0x14;
        iVar25 = iVar25 + 0x40000;
        uVar24 = uVar22;
      } while (uVar26 != 0);
    }
    bVar2 = uVar22 * uVar22 >> 0x25 != 0;
    lVar23 = 0x12;
    if (bVar2) {
      lVar23 = 0x13;
    }
    uVar22 = uVar22 * uVar22 >> lVar23;
    uVar22 = uVar22 * uVar22;
    bVar3 = uVar22 >> 0x25 != 0;
    lVar23 = 0x12;
    if (bVar3) {
      lVar23 = 0x13;
    }
    uVar22 = uVar22 >> lVar23;
    uVar22 = uVar22 * uVar22;
    bVar4 = uVar22 >> 0x25 != 0;
    lVar23 = 0x12;
    if (bVar4) {
      lVar23 = 0x13;
    }
    uVar22 = uVar22 >> lVar23;
    uVar22 = uVar22 * uVar22;
    bVar5 = uVar22 >> 0x25 != 0;
    lVar23 = 0x12;
    if (bVar5) {
      lVar23 = 0x13;
    }
    uVar22 = uVar22 >> lVar23;
    uVar22 = uVar22 * uVar22;
    bVar6 = uVar22 >> 0x25 != 0;
    lVar23 = 0x12;
    if (bVar6) {
      lVar23 = 0x13;
    }
    uVar22 = uVar22 >> lVar23;
    uVar22 = uVar22 * uVar22;
    bVar7 = uVar22 >> 0x25 != 0;
    lVar23 = 0x12;
    if (bVar7) {
      lVar23 = 0x13;
    }
    uVar22 = uVar22 >> lVar23;
    uVar22 = uVar22 * uVar22;
    bVar8 = uVar22 >> 0x25 != 0;
    lVar23 = 0x12;
    if (bVar8) {
      lVar23 = 0x13;
    }
    uVar22 = uVar22 >> lVar23;
    uVar22 = uVar22 * uVar22;
    bVar9 = uVar22 >> 0x25 != 0;
    lVar23 = 0x12;
    if (bVar9) {
      lVar23 = 0x13;
    }
    uVar22 = uVar22 >> lVar23;
    uVar22 = uVar22 * uVar22;
    bVar10 = uVar22 >> 0x25 != 0;
    lVar23 = 0x12;
    if (bVar10) {
      lVar23 = 0x13;
    }
    uVar22 = uVar22 >> lVar23;
    uVar22 = uVar22 * uVar22;
    bVar11 = uVar22 >> 0x25 != 0;
    lVar23 = 0x12;
    if (bVar11) {
      lVar23 = 0x13;
    }
    uVar22 = uVar22 >> lVar23;
    uVar22 = uVar22 * uVar22;
    bVar12 = uVar22 >> 0x25 != 0;
    lVar23 = 0x12;
    if (bVar12) {
      lVar23 = 0x13;
    }
    uVar22 = uVar22 >> lVar23;
    uVar22 = uVar22 * uVar22;
    bVar13 = uVar22 >> 0x25 != 0;
    lVar23 = 0x12;
    if (bVar13) {
      lVar23 = 0x13;
    }
    uVar22 = uVar22 >> lVar23;
    uVar22 = uVar22 * uVar22;
    bVar14 = uVar22 >> 0x25 != 0;
    lVar23 = 0x12;
    if (bVar14) {
      lVar23 = 0x13;
    }
    uVar22 = uVar22 >> lVar23;
    uVar22 = uVar22 * uVar22;
    bVar15 = uVar22 >> 0x25 != 0;
    lVar23 = 0x12;
    if (bVar15) {
      lVar23 = 0x13;
    }
    uVar22 = uVar22 >> lVar23;
    uVar22 = uVar22 * uVar22;
    bVar16 = uVar22 >> 0x25 != 0;
    lVar23 = 0x12;
    if (bVar16) {
      lVar23 = 0x13;
    }
    uVar22 = uVar22 >> lVar23;
    uVar22 = uVar22 * uVar22;
    bVar17 = uVar22 >> 0x25 != 0;
    lVar23 = 0x12;
    if (bVar17) {
      lVar23 = 0x13;
    }
    uVar22 = uVar22 >> lVar23;
    uVar22 = uVar22 * uVar22;
    bVar18 = uVar22 >> 0x25 != 0;
    lVar23 = 0x12;
    if (bVar18) {
      lVar23 = 0x13;
    }
    uVar22 = uVar22 >> lVar23;
    uVar20 = iVar25 + (uint)bVar2 * 0x20000 + (uint)bVar3 * 0x10000 + (uint)bVar4 * 0x8000 +
             (uint)bVar5 * 0x4000 + (uint)bVar6 * 0x2000 + (uint)bVar7 * 0x1000 +
             (uint)bVar8 * 0x800 + (uint)bVar9 * 0x400 + (uint)bVar10 * 0x200 + (uint)bVar11 * 0x100
             + (uint)bVar12 * 0x80 + (uint)bVar13 * 0x40 + (uint)bVar14 * 0x20 + (uint)bVar15 * 0x10
             + (uint)bVar16 * 8 + (uint)bVar17 * 4 + (uint)bVar18 * 2;
    if (uVar22 * uVar22 >> 0x25 != 0) {
      uVar20 = uVar20 + 1;
    }
    lVar23 = SUB168((ZEXT416(uVar20) * (undefined1  [16])0x40000) / (undefined1  [16])0x5c551,0);
    uVar22 = 0;
    uVar21 = (lVar23 * uVar21 >> 0x12) * lVar23 >> 0x12;
    uVar24 = 0x42;
    do {
      uVar26 = uVar22 << 1 | 1;
      uVar24 = uVar24 - 3;
      uVar1 = uVar22 * uVar26 * 6 | 1;
      bVar2 = uVar1 <= uVar21 >> (uVar24 & 0x3f);
      uVar22 = uVar22 << 1;
      if (bVar2) {
        uVar22 = uVar26;
      }
      lVar23 = 0;
      if (bVar2) {
        lVar23 = uVar1 << (uVar24 & 0x3f);
      }
      uVar21 = uVar21 - lVar23;
    } while (2 < uVar24);
    uVar20 = (int)(((uVar22 * 0x7b126000 >> 0x12) - 0x12c28f) / 0x2c5c8) + 4;
    if ((uVar20 & 0xfff8) <= uVar19) {
      uVar19 = uVar20 & 0xfffffff8;
    }
  }
  return uVar19;
}

