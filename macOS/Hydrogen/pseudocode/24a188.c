
/* WARNING: Removing unreachable block (ram,0x00248378) */
/* WARNING: Removing unreachable block (ram,0x00248388) */

ulong FUN_0024a188(undefined8 param_1,ulong param_2)

{
  undefined8 uVar1;
  bool bVar2;
  long lVar3;
  long lVar4;
  ulong uVar5;
  long lVar6;
  int *piVar7;
  long *plVar8;
  ulong uVar9;
  long *plVar10;
  ulong uVar11;
  ulong uVar12;
  ulong uVar13;
  ulong uVar14;
  ulong uVar15;
  ulong uVar16;
  long lVar17;
  ulong uVar18;
  ulong uVar19;
  ulong uVar20;
  long lVar21;
  long lVar22;
  long lVar23;
  undefined1 auVar24 [16];
  long lStack_98;
  long lStack_90;
  long lStack_88;
  long lStack_80;
  ulong uStack_78;
  ulong uStack_70;
  undefined8 uStack_68;
  
  if ((param_2 | 0x8000000000000000) == 0x8000000000000000) {
    __Unwind_Resume();
  }
  piVar7 = (int *)((long)&MACH_HEADER.magic + 1);
  func_0x00187bd4();
  auVar24 = __Unwind_Resume();
  plVar8 = auVar24._8_8_;
  lVar17 = auVar24._0_8_;
  lVar21 = *(long *)(lVar17 + 0x308);
  *(undefined8 *)(lVar17 + 0x308) = 0x8000000000000000;
  if (lVar21 != -0x8000000000000000) {
    lVar22 = *(long *)(lVar17 + 0x310);
    lVar23 = *(long *)(lVar17 + 0x318);
    if (lVar23 == 0) {
      if (lVar21 != 0) {
        func_0x00187bd4(lVar22,lVar21,1);
      }
    }
    else {
      uVar9 = *(ulong *)(lVar17 + 0x98);
      uVar11 = *(ulong *)(lVar17 + 0xb0);
      if (uVar11 == uVar9) {
        func_0x00242e68((ulong *)(lVar17 + 0x98),&UNK_009c2c40);
        uVar11 = *(ulong *)(lVar17 + 0xb0);
        uVar9 = *(ulong *)(lVar17 + 0x98);
      }
      uVar11 = *(long *)(lVar17 + 0xa8) + uVar11;
      uVar20 = 0;
      if (uVar9 <= uVar11) {
        uVar20 = uVar9;
      }
      plVar10 = (long *)(*(long *)(lVar17 + 0xa0) + (uVar11 - uVar20) * 0x18);
      *plVar10 = lVar21;
      plVar10[1] = lVar22;
      plVar10[2] = lVar23;
      *(long *)(lVar17 + 0xb0) = *(long *)(lVar17 + 0xb0) + 1;
    }
  }
  if (*(char *)(lVar17 + 0x332) == '\x01') {
    lVar21 = plVar8[2];
    if (*plVar8 != 0) {
      lVar21 = plVar8[3] - plVar8[2];
    }
    if (lVar21 == 0) {
      return 0;
    }
    lVar21 = *plVar8;
    uVar20 = plVar8[2];
    uVar9 = plVar8[3];
    uVar11 = uVar20;
    if (lVar21 != 0) {
      uVar11 = uVar9 - uVar20;
    }
    uVar12 = uVar11;
    if (*(int *)(lVar17 + 0x88) != 1) goto code_r0x00248574;
    uVar12 = *(ulong *)(lVar17 + 0xb0);
    if (uVar12 == 0) {
      lVar22 = 0;
    }
    else {
      lVar22 = 0;
      lVar23 = *(long *)(lVar17 + 0xa0);
      uVar15 = *(ulong *)(lVar17 + 0xa8);
      uVar19 = *(ulong *)(lVar17 + 0x98);
      uVar13 = 0;
      if (uVar19 <= uVar15) {
        uVar13 = uVar19;
      }
      lVar3 = uVar15 - uVar13;
      uVar14 = uVar19 - lVar3;
      if (uVar12 <= uVar14) {
        uVar19 = lVar3 + uVar12;
      }
      uVar18 = 0;
      if (uVar14 <= uVar12) {
        uVar18 = uVar12 - uVar14;
      }
      if (uVar19 - lVar3 != 0) {
        uVar16 = (uVar19 - lVar3) * 0x18;
        uVar19 = uVar16 / 0x18;
        if (uVar16 < 0x60) {
          lVar22 = 0;
          uVar5 = 0;
        }
        else {
          lVar22 = 0;
          lVar3 = 0;
          lVar4 = 0;
          lVar6 = 0;
          uVar5 = uVar19 & 0xffffffffffffffc;
          plVar10 = (long *)(uVar15 * 0x18 + uVar13 * -0x18 + lVar23 + 0x40);
          uVar16 = uVar5;
          do {
            lVar22 = plVar10[-6] + lVar22;
            lVar3 = plVar10[-3] + lVar3;
            lVar4 = *plVar10 + lVar4;
            lVar6 = plVar10[3] + lVar6;
            plVar10 = plVar10 + 0xc;
            uVar16 = uVar16 - 4;
          } while (uVar16 != 0);
          lVar22 = lVar6 + lVar4 + lVar3 + lVar22;
          if (uVar19 == uVar5) goto code_r0x002484c0;
        }
        lVar3 = uVar5 - uVar19;
        plVar10 = (long *)(uVar15 * 0x18 + uVar5 * 0x18 + uVar13 * -0x18 + lVar23 + 0x10);
        do {
          lVar22 = *plVar10 + lVar22;
          bVar2 = lVar3 != -1;
          lVar3 = lVar3 + 1;
          plVar10 = plVar10 + 3;
        } while (bVar2);
      }
code_r0x002484c0:
      if (uVar14 < uVar12) {
        if (uVar18 < 4) {
          uVar19 = 0;
        }
        else {
          lVar3 = 0;
          lVar4 = 0;
          lVar6 = 0;
          uVar19 = uVar18 & 0xfffffffffffffffc;
          plVar10 = (long *)(lVar23 + 0x40);
          uVar13 = uVar19;
          do {
            lVar22 = plVar10[-6] + lVar22;
            lVar3 = plVar10[-3] + lVar3;
            lVar4 = *plVar10 + lVar4;
            lVar6 = plVar10[3] + lVar6;
            plVar10 = plVar10 + 0xc;
            uVar13 = uVar13 - 4;
          } while (uVar13 != 0);
          lVar22 = lVar6 + lVar4 + lVar3 + lVar22;
          if (uVar18 == uVar19) goto code_r0x0024855c;
        }
        uVar13 = uVar12;
        if (uVar14 <= uVar12) {
          uVar13 = uVar14;
        }
        lVar3 = (uVar19 + uVar13) - uVar12;
        plVar10 = (long *)(lVar23 + uVar19 * 0x18 + 0x10);
        do {
          lVar22 = *plVar10 + lVar22;
          bVar2 = lVar3 != -1;
          lVar3 = lVar3 + 1;
          plVar10 = plVar10 + 3;
        } while (bVar2);
      }
    }
code_r0x0024855c:
    uVar13 = lVar22 - *(long *)(lVar17 + 0xb8);
    uVar12 = 0;
    if (uVar13 <= *(ulong *)(lVar17 + 0x90)) {
      uVar12 = *(ulong *)(lVar17 + 0x90) - uVar13;
    }
    if (uVar11 <= uVar12) {
      uVar12 = uVar11;
    }
code_r0x00248574:
    uVar11 = *(ulong *)(lVar17 + 800);
    if (lVar21 == 0) {
      if (uVar12 <= uVar20) {
        uVar20 = uVar12;
      }
      if (uVar20 != 0) {
        lStack_80 = plVar8[1];
        do {
          uVar9 = uStack_68;
          uStack_78 = uVar20;
          if (uVar11 <= uVar20) {
            uStack_78 = uVar11;
          }
          uVar20 = uVar20 - uStack_78;
          lStack_88 = 0;
          lVar21 = uStack_78 + lStack_80;
          uStack_68 = CONCAT71(uStack_68._1_7_,3);
          uVar1 = uStack_68;
          uStack_68._4_4_ = SUB84(uVar9,4);
          uStack_68._0_2_ = (undefined2)uVar1;
          uStack_68._0_4_ = CONCAT22(4,(undefined2)uStack_68);
          func_0x00248644(lVar17,&lStack_88);
          lStack_80 = lVar21;
        } while (uVar20 != 0);
      }
    }
    else {
      if (uVar20 + uVar12 <= uVar9) {
        uVar9 = uVar20 + uVar12;
      }
      if (uVar9 != uVar20) {
        lVar22 = plVar8[1];
        uStack_78 = uVar20;
        do {
          uVar19 = uStack_68;
          uVar20 = uStack_78 + uVar11;
          uVar13 = uVar9;
          if (uVar20 <= uVar9) {
            uVar13 = uVar20;
          }
          uStack_68 = CONCAT71(uStack_68._1_7_,3);
          uVar1 = uStack_68;
          uStack_68._4_4_ = SUB84(uVar19,4);
          uStack_68._0_2_ = (undefined2)uVar1;
          uStack_68._0_4_ = CONCAT22(4,(undefined2)uStack_68);
          lStack_88 = lVar21;
          lStack_80 = lVar22;
          uStack_70 = uVar13;
          func_0x00248644(lVar17,&lStack_88);
          uStack_78 = uVar13;
        } while (uVar20 < uVar9);
      }
    }
    return uVar12;
  }
  lStack_80 = *plVar8;
  uStack_70 = plVar8[2];
  uVar9 = plVar8[3];
  uVar11 = uStack_70;
  if (lStack_80 != 0) {
    uVar11 = uVar9 - uStack_70;
  }
  uVar20 = uVar11;
  if (*piVar7 != 1) goto code_r0x001cc7f4;
  uVar20 = *(ulong *)(piVar7 + 10);
  if (uVar20 == 0) {
    lVar17 = 0;
  }
  else {
    lVar17 = 0;
    lVar21 = *(long *)(piVar7 + 6);
    uVar19 = *(ulong *)(piVar7 + 8);
    uVar13 = *(ulong *)(piVar7 + 4);
    uVar12 = 0;
    if (uVar13 <= uVar19) {
      uVar12 = uVar13;
    }
    lVar22 = uVar19 - uVar12;
    uVar15 = uVar13 - lVar22;
    if (uVar20 <= uVar15) {
      uVar13 = lVar22 + uVar20;
    }
    uVar14 = 0;
    if (uVar15 <= uVar20) {
      uVar14 = uVar20 - uVar15;
    }
    if (uVar13 - lVar22 != 0) {
      uVar18 = (uVar13 - lVar22) * 0x18;
      uVar13 = uVar18 / 0x18;
      if (uVar18 < 0x60) {
        lVar17 = 0;
        uVar16 = 0;
      }
      else {
        lVar17 = 0;
        lVar22 = 0;
        lVar23 = 0;
        lVar3 = 0;
        uVar16 = uVar13 & 0xffffffffffffffc;
        plVar10 = (long *)(uVar19 * 0x18 + uVar12 * -0x18 + lVar21 + 0x40);
        uVar18 = uVar16;
        do {
          lVar17 = plVar10[-6] + lVar17;
          lVar22 = plVar10[-3] + lVar22;
          lVar23 = *plVar10 + lVar23;
          lVar3 = plVar10[3] + lVar3;
          plVar10 = plVar10 + 0xc;
          uVar18 = uVar18 - 4;
        } while (uVar18 != 0);
        lVar17 = lVar3 + lVar23 + lVar22 + lVar17;
        if (uVar13 == uVar16) goto code_r0x001cc740;
      }
      lVar22 = uVar16 - uVar13;
      plVar10 = (long *)(uVar19 * 0x18 + uVar16 * 0x18 + uVar12 * -0x18 + lVar21 + 0x10);
      do {
        lVar17 = *plVar10 + lVar17;
        bVar2 = lVar22 != -1;
        lVar22 = lVar22 + 1;
        plVar10 = plVar10 + 3;
      } while (bVar2);
    }
code_r0x001cc740:
    if (uVar15 < uVar20) {
      if (uVar14 < 4) {
        uVar13 = 0;
      }
      else {
        lVar22 = 0;
        lVar23 = 0;
        lVar3 = 0;
        uVar13 = uVar14 & 0xfffffffffffffffc;
        plVar10 = (long *)(lVar21 + 0x40);
        uVar12 = uVar13;
        do {
          lVar17 = plVar10[-6] + lVar17;
          lVar22 = plVar10[-3] + lVar22;
          lVar23 = *plVar10 + lVar23;
          lVar3 = plVar10[3] + lVar3;
          plVar10 = plVar10 + 0xc;
          uVar12 = uVar12 - 4;
        } while (uVar12 != 0);
        lVar17 = lVar3 + lVar23 + lVar22 + lVar17;
        if (uVar14 == uVar13) goto code_r0x001cc7dc;
      }
      uVar12 = uVar20;
      if (uVar15 <= uVar20) {
        uVar12 = uVar15;
      }
      lVar22 = (uVar13 + uVar12) - uVar20;
      plVar10 = (long *)(lVar21 + uVar13 * 0x18 + 0x10);
      do {
        lVar17 = *plVar10 + lVar17;
        bVar2 = lVar22 != -1;
        lVar22 = lVar22 + 1;
        plVar10 = plVar10 + 3;
      } while (bVar2);
    }
  }
code_r0x001cc7dc:
  uVar20 = 0;
  if ((ulong)(lVar17 - *(long *)(piVar7 + 0xc)) <= *(ulong *)(piVar7 + 2)) {
    uVar20 = *(ulong *)(piVar7 + 2) - (lVar17 - *(long *)(piVar7 + 0xc));
  }
  if (uVar11 <= uVar20) {
    uVar20 = uVar11;
  }
code_r0x001cc7f4:
  if (lStack_80 == 0) {
    uStack_78 = plVar8[1];
    if (uVar20 <= uStack_70) {
      uStack_70 = uVar20;
    }
  }
  else {
    uStack_78 = plVar8[1];
    uStack_68 = uVar9;
    if (uVar20 + uStack_70 <= uVar9) {
      uStack_68 = uVar20 + uStack_70;
    }
  }
  func_0x00256290(&lStack_98,&lStack_80);
  if (lStack_88 == 0) {
    if (lStack_98 != 0) {
      func_0x00187bd4(lStack_90,lStack_98,1);
    }
  }
  else {
    uVar11 = *(ulong *)(piVar7 + 4);
    uVar9 = *(ulong *)(piVar7 + 10);
    if (uVar9 == uVar11) {
      func_0x00242e68(piVar7 + 4,&UNK_009c2c40);
      uVar9 = *(ulong *)(piVar7 + 10);
      uVar11 = *(ulong *)(piVar7 + 4);
    }
    uVar12 = 0;
    if (uVar11 <= *(long *)(piVar7 + 8) + uVar9) {
      uVar12 = uVar11;
    }
    plVar8 = (long *)(*(long *)(piVar7 + 6) + ((*(long *)(piVar7 + 8) + uVar9) - uVar12) * 0x18);
    *plVar8 = lStack_98;
    plVar8[1] = lStack_90;
    plVar8[2] = lStack_88;
    *(long *)(piVar7 + 10) = *(long *)(piVar7 + 10) + 1;
  }
  return uVar20;
}

