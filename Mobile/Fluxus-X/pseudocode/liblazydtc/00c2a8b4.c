/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c2a8b4
 */

undefined1  [16] FUN_00c2a8b4(undefined1 param_1 [16],undefined1 param_2 [16])

{
  uint uVar1;
  ulong uVar2;
  bool bVar3;
  int iVar4;
  ulong uVar5;
  ulong uVar6;
  ulong uVar7;
  ulong uVar8;
  ulong uVar9;
  ulong uVar10;
  long lVar11;
  ulong uVar12;
  ulong uVar13;
  ulong uVar14;
  ulong uVar15;
  uint uVar16;
  ulong uVar17;
  undefined1 auVar18 [16];
  
  uVar9 = param_2._8_8_;
  uVar12 = param_2._0_8_;
  uVar10 = param_1._8_8_;
  uVar14 = param_1._0_8_;
  uVar6 = uVar10 & 0x7fffffffffffffff;
  uVar7 = uVar9 & 0x7fffffffffffffff;
  if ((uVar6 + 0x8001000000000000 < 0x8001000000000001 && !CARRY8(uVar6 - 1,(ulong)(uVar14 != 0)))
     || (0x7ffeffffffffffff < ~(uVar7 + 0x8001000000000000) ||
         CARRY8(~(uVar7 + 0x8001000000000000) + 0x8001000000000000,(ulong)(uVar12 == 0)))) {
    if (0x7fff000000000000 < uVar6 || CARRY8(uVar6 + 0x8000ffffffffffff,(ulong)(uVar14 != 0))) {
      uVar13 = uVar14;
      uVar15 = uVar10 | 0x800000000000;
      goto LAB_00c2acac;
    }
    uVar13 = uVar12;
    if (0x7fff000000000000 < uVar7 || CARRY8(uVar7 + 0x8000ffffffffffff,(ulong)(uVar12 != 0))) {
      uVar15 = uVar9 | 0x800000000000;
      goto LAB_00c2acac;
    }
    if (uVar14 == 0 && uVar6 == 0x7fff000000000000) {
      if (uVar12 == uVar14 && (uVar9 ^ uVar10) == 0x8000000000000000) {
        uVar10 = 0x7fff800000000000;
        uVar14 = 0;
      }
      uVar13 = uVar14;
      uVar15 = uVar10;
      goto LAB_00c2acac;
    }
    uVar15 = uVar9;
    if (uVar12 == 0 && uVar7 == 0x7fff000000000000) goto LAB_00c2acac;
    if (uVar14 == 0 && uVar6 == 0) {
      if (uVar12 == 0 && uVar7 == 0) {
        uVar13 = uVar12 & uVar14;
        uVar15 = uVar9 & uVar10;
      }
      goto LAB_00c2acac;
    }
    uVar13 = uVar14;
    uVar15 = uVar10;
    if (uVar12 == 0 && uVar7 == 0) goto LAB_00c2acac;
  }
  uVar7 = ~uVar7;
  bVar3 = CARRY8(uVar6 + uVar7,(ulong)(uVar12 <= uVar14));
  uVar13 = uVar14;
  uVar15 = uVar10;
  uVar17 = uVar9;
  if (CARRY8(uVar6,uVar7) || bVar3) {
    uVar13 = uVar12;
    uVar15 = uVar9;
    uVar17 = uVar10;
  }
  uVar8 = uVar17 >> 0x30 & 0x7fff;
  uVar16 = (ushort)(uVar15 >> 0x30) & 0x7fff;
  if (CARRY8(uVar6,uVar7) || bVar3) {
    uVar12 = uVar14;
  }
  uVar7 = uVar17 & 0xffffffffffff;
  if ((int)uVar8 == 0) {
    uVar14 = uVar12 >> 1;
    uVar6 = uVar12;
    if (uVar7 != 0) {
      uVar6 = uVar7;
    }
    iVar4 = (int)LZCOUNT(uVar6) + (uint)(uVar7 == 0) * 0x40;
    uVar1 = iVar4 - 0xf;
    uVar6 = uVar12 << ((ulong)uVar1 & 0x3f);
    uVar8 = uVar7 << ((ulong)uVar1 & 0x3f);
    bVar3 = (uVar1 & 0x40) == 0;
    uVar12 = 0;
    if (bVar3) {
      uVar12 = uVar6;
    }
    uVar7 = uVar6;
    if (bVar3) {
      uVar7 = uVar8 | uVar14 >> ((ulong)~uVar1 & 0x3f);
    }
    uVar8 = (ulong)(0x10 - iVar4);
  }
  uVar6 = uVar15 & 0xffffffffffff;
  if ((uVar15 & 0x7fff000000000000) == 0) {
    uVar15 = uVar15 & 0xffffffffffff;
    uVar14 = uVar13 >> 1;
    uVar6 = uVar13;
    if (uVar15 != 0) {
      uVar6 = uVar15;
    }
    iVar4 = (int)LZCOUNT(uVar6) + (uint)(uVar15 == 0) * 0x40;
    uVar16 = iVar4 - 0xf;
    uVar6 = uVar13 << ((ulong)uVar16 & 0x3f);
    bVar3 = (uVar16 & 0x40) == 0;
    uVar13 = 0;
    if (bVar3) {
      uVar13 = uVar6;
    }
    if (bVar3) {
      uVar6 = uVar15 << ((ulong)uVar16 & 0x3f) | uVar14 >> ((ulong)~uVar16 & 0x3f);
    }
    uVar16 = 0x10 - iVar4;
  }
  uVar14 = uVar12 >> 0x3d | uVar7 << 3;
  uVar15 = uVar13 << 3;
  iVar4 = (int)uVar8;
  uVar16 = iVar4 - uVar16;
  uVar7 = uVar13 >> 0x3d | uVar6 << 3 | 0x8000000000000;
  if (uVar16 == 0) {
LAB_00c2a9b4:
    if (-1 < (long)(uVar9 ^ uVar10)) goto LAB_00c2a9c0;
LAB_00c2aad0:
    uVar14 = uVar14 | 0x8000000000000;
    uVar12 = uVar12 * 8;
    uVar6 = uVar12 - uVar15;
    uVar10 = uVar14 - (uVar7 + (uVar12 < uVar15));
    if (uVar14 == uVar7 && uVar12 == uVar15) {
      uVar13 = 0;
      uVar15 = 0;
      goto LAB_00c2acac;
    }
    if (uVar10 >> 0x33 == 0) {
      uVar12 = uVar6;
      if (uVar10 != 0) {
        uVar12 = uVar10;
      }
      uVar7 = uVar6 >> 1;
      uVar16 = ((int)LZCOUNT(uVar12) + (uint)(uVar10 == 0) * 0x40) - 0xc;
      uVar12 = uVar10 << ((ulong)uVar16 & 0x3f);
      uVar10 = uVar6 << ((ulong)uVar16 & 0x3f);
      bVar3 = (uVar16 & 0x40) == 0;
      uVar8 = (ulong)(iVar4 - uVar16);
      uVar6 = 0;
      if (bVar3) {
        uVar6 = uVar10;
      }
      if (bVar3) {
        uVar10 = uVar12 | uVar7 >> ((ulong)~uVar16 & 0x3f);
      }
    }
  }
  else {
    if (uVar16 < 0x80) {
      uVar1 = 0x80 - uVar16;
      uVar5 = uVar15 << ((ulong)uVar1 & 0x3f);
      uVar6 = uVar5;
      uVar2 = 0;
      if ((uVar1 & 0x40) == 0) {
        uVar6 = uVar7 << ((ulong)uVar1 & 0x3f) |
                ((uVar13 & 0x1fffffffffffffff) << 2) >> ((ulong)~uVar1 & 0x3f);
        uVar2 = uVar5;
      }
      uVar5 = uVar7 >> ((ulong)uVar16 & 0x3f);
      bVar3 = (uVar16 & 0x40) == 0;
      uVar13 = uVar5;
      if (bVar3) {
        uVar13 = (uVar7 << 1) << ((ulong)~uVar16 & 0x3f) | uVar15 >> ((ulong)uVar16 & 0x3f);
      }
      uVar7 = 0;
      if (bVar3) {
        uVar7 = uVar5;
      }
      uVar15 = uVar13 | (uVar2 != 0 || uVar6 != 0);
      goto LAB_00c2a9b4;
    }
    uVar7 = 0;
    uVar15 = 1;
    if ((long)(uVar9 ^ uVar10) < 0) goto LAB_00c2aad0;
LAB_00c2a9c0:
    uVar6 = uVar15 + uVar12 * 8;
    uVar10 = uVar7 + (uVar14 | 0x8000000000000) + (ulong)CARRY8(uVar15,uVar12 * 8);
    if ((uVar10 >> 0x34 & 1) != 0) {
      uVar12 = uVar10 << 0x3f;
      uVar10 = uVar10 >> 1;
      uVar8 = (ulong)(iVar4 + 1);
      uVar6 = uVar6 >> 1 | uVar12 | uVar15 & 1;
    }
  }
  uVar17 = uVar17 & 0x8000000000000000;
  iVar4 = (int)uVar8;
  if (0x7ffe < iVar4) {
    uVar13 = 0;
    uVar15 = uVar17 | 0x7fff000000000000;
    goto LAB_00c2acac;
  }
  if (iVar4 < 1) {
    uVar16 = 1 - iVar4;
    uVar14 = (ulong)uVar16;
    uVar9 = 0x80 - uVar14;
    uVar13 = uVar6 << (uVar9 & 0x3f);
    lVar11 = uVar10 << 1;
    uVar12 = uVar13;
    uVar7 = 0;
    if ((uVar9 & 0x40) == 0) {
      uVar12 = uVar10 << (uVar9 & 0x3f) | (uVar6 >> 1) >> ((ulong)~(uint)uVar9 & 0x3f);
      uVar7 = uVar13;
    }
    uVar13 = uVar10 >> (uVar14 & 0x3f);
    uVar9 = uVar13;
    uVar10 = 0;
    if ((uVar16 & 0x40) == 0) {
      uVar9 = lVar11 << ((ulong)~uVar16 & 0x3f) | uVar6 >> (uVar14 & 0x3f);
      uVar10 = uVar13;
    }
    uVar8 = 0;
    uVar6 = uVar9 | (uVar7 != 0 || uVar12 != 0);
  }
  uVar7 = uVar6 >> 3 | uVar10 << 0x3d;
  uVar16 = (uint)uVar6 & 7;
  uVar15 = uVar10 >> 3 & 0xffffffffffff | uVar8 << 0x30 | uVar17;
  iVar4 = FUN_00c2b8b8();
  uVar12 = uVar15;
  if (iVar4 == 2) {
    bVar3 = true;
    if (uVar17 == 0) {
      bVar3 = (uVar6 & 7) == 0;
    }
LAB_00c2ac90:
    uVar13 = uVar7 + !bVar3;
    if (CARRY8(uVar7,(ulong)!bVar3)) {
      uVar12 = uVar15 + 1;
    }
joined_r0x00c2ac9c:
    uVar15 = uVar12;
    if ((uVar6 & 7) != 0) goto LAB_00c2aca0;
  }
  else {
    if (iVar4 == 1) {
      bVar3 = uVar17 == 0 || (uVar6 & 7) == 0;
      goto LAB_00c2ac90;
    }
    uVar13 = uVar7;
    if (iVar4 != 0) goto joined_r0x00c2ac9c;
    uVar14 = (ulong)(4 < uVar16);
    uVar13 = uVar7 + uVar14;
    if (CARRY8(uVar7,uVar14)) {
      uVar12 = uVar15 + 1;
    }
    if (uVar16 != 4) goto joined_r0x00c2ac9c;
    uVar12 = uVar6 >> 3 & 1;
    uVar13 = uVar7 + uVar12;
    if (CARRY8(uVar7,uVar12)) {
      uVar15 = uVar15 + 1;
    }
LAB_00c2aca0:
    FUN_00c2b8d4();
  }
LAB_00c2acac:
  auVar18._8_8_ = uVar15;
  auVar18._0_8_ = uVar13;
  return auVar18;
}

