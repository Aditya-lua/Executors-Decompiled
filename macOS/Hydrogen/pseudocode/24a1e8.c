
/* WARNING: Removing unreachable block (ram,0x00248378) */
/* WARNING: Removing unreachable block (ram,0x00248388) */

ulong FUN_0024a1e8(void)

{
  undefined8 uVar1;
  bool bVar2;
  long lVar3;
  long lVar4;
  long lVar5;
  ulong uVar6;
  long lVar7;
  ulong uVar8;
  long *plVar9;
  ulong uVar10;
  ulong uVar11;
  ulong uVar12;
  ulong uVar13;
  ulong uVar14;
  ulong uVar15;
  ulong uVar16;
  ulong uVar17;
  long *unaff_x19;
  long unaff_x20;
  ulong uVar18;
  int *unaff_x21;
  long unaff_x22;
  long lVar19;
  long lVar20;
  long lStack_58;
  long lStack_50;
  long lStack_48;
  long lStack_40;
  ulong uStack_38;
  ulong uStack_30;
  undefined8 uStack_28;
  
  lVar19 = *(long *)(unaff_x20 + 0x310);
  lVar20 = *(long *)(unaff_x20 + 0x318);
  if (lVar20 == 0) {
    if (unaff_x22 != 0) {
      func_0x00187bd4(lVar19);
    }
  }
  else {
    uVar8 = *(ulong *)(unaff_x20 + 0x98);
    uVar10 = *(ulong *)(unaff_x20 + 0xb0);
    if (uVar10 == uVar8) {
      func_0x00242e68((ulong *)(unaff_x20 + 0x98),&UNK_009c2c40);
      uVar10 = *(ulong *)(unaff_x20 + 0xb0);
      uVar8 = *(ulong *)(unaff_x20 + 0x98);
    }
    uVar10 = *(long *)(unaff_x20 + 0xa8) + uVar10;
    uVar18 = 0;
    if (uVar8 <= uVar10) {
      uVar18 = uVar8;
    }
    plVar9 = (long *)(*(long *)(unaff_x20 + 0xa0) + (uVar10 - uVar18) * 0x18);
    *plVar9 = unaff_x22;
    plVar9[1] = lVar19;
    plVar9[2] = lVar20;
    *(long *)(unaff_x20 + 0xb0) = *(long *)(unaff_x20 + 0xb0) + 1;
  }
  if (*(char *)(unaff_x20 + 0x332) == '\x01') {
    lVar19 = unaff_x19[2];
    if (*unaff_x19 != 0) {
      lVar19 = unaff_x19[3] - unaff_x19[2];
    }
    if (lVar19 == 0) {
      return 0;
    }
    lVar19 = *unaff_x19;
    uVar18 = unaff_x19[2];
    uVar8 = unaff_x19[3];
    uVar10 = uVar18;
    if (lVar19 != 0) {
      uVar10 = uVar8 - uVar18;
    }
    uVar11 = uVar10;
    if (*(int *)(unaff_x20 + 0x88) != 1) goto code_r0x00248574;
    uVar11 = *(ulong *)(unaff_x20 + 0xb0);
    if (uVar11 == 0) {
      lVar20 = 0;
    }
    else {
      lVar20 = 0;
      lVar5 = *(long *)(unaff_x20 + 0xa0);
      uVar14 = *(ulong *)(unaff_x20 + 0xa8);
      uVar17 = *(ulong *)(unaff_x20 + 0x98);
      uVar12 = 0;
      if (uVar17 <= uVar14) {
        uVar12 = uVar17;
      }
      lVar3 = uVar14 - uVar12;
      uVar13 = uVar17 - lVar3;
      if (uVar11 <= uVar13) {
        uVar17 = lVar3 + uVar11;
      }
      uVar16 = 0;
      if (uVar13 <= uVar11) {
        uVar16 = uVar11 - uVar13;
      }
      if (uVar17 - lVar3 != 0) {
        uVar15 = (uVar17 - lVar3) * 0x18;
        uVar17 = uVar15 / 0x18;
        if (uVar15 < 0x60) {
          lVar20 = 0;
          uVar6 = 0;
        }
        else {
          lVar20 = 0;
          lVar3 = 0;
          lVar4 = 0;
          lVar7 = 0;
          uVar6 = uVar17 & 0xffffffffffffffc;
          plVar9 = (long *)(uVar14 * 0x18 + uVar12 * -0x18 + lVar5 + 0x40);
          uVar15 = uVar6;
          do {
            lVar20 = plVar9[-6] + lVar20;
            lVar3 = plVar9[-3] + lVar3;
            lVar4 = *plVar9 + lVar4;
            lVar7 = plVar9[3] + lVar7;
            plVar9 = plVar9 + 0xc;
            uVar15 = uVar15 - 4;
          } while (uVar15 != 0);
          lVar20 = lVar7 + lVar4 + lVar3 + lVar20;
          if (uVar17 == uVar6) goto code_r0x002484c0;
        }
        lVar3 = uVar6 - uVar17;
        plVar9 = (long *)(uVar14 * 0x18 + uVar6 * 0x18 + uVar12 * -0x18 + lVar5 + 0x10);
        do {
          lVar20 = *plVar9 + lVar20;
          bVar2 = lVar3 != -1;
          lVar3 = lVar3 + 1;
          plVar9 = plVar9 + 3;
        } while (bVar2);
      }
code_r0x002484c0:
      if (uVar13 < uVar11) {
        if (uVar16 < 4) {
          uVar17 = 0;
        }
        else {
          lVar3 = 0;
          lVar4 = 0;
          lVar7 = 0;
          uVar17 = uVar16 & 0xfffffffffffffffc;
          plVar9 = (long *)(lVar5 + 0x40);
          uVar12 = uVar17;
          do {
            lVar20 = plVar9[-6] + lVar20;
            lVar3 = plVar9[-3] + lVar3;
            lVar4 = *plVar9 + lVar4;
            lVar7 = plVar9[3] + lVar7;
            plVar9 = plVar9 + 0xc;
            uVar12 = uVar12 - 4;
          } while (uVar12 != 0);
          lVar20 = lVar7 + lVar4 + lVar3 + lVar20;
          if (uVar16 == uVar17) goto code_r0x0024855c;
        }
        uVar12 = uVar11;
        if (uVar13 <= uVar11) {
          uVar12 = uVar13;
        }
        lVar3 = (uVar17 + uVar12) - uVar11;
        plVar9 = (long *)(lVar5 + uVar17 * 0x18 + 0x10);
        do {
          lVar20 = *plVar9 + lVar20;
          bVar2 = lVar3 != -1;
          lVar3 = lVar3 + 1;
          plVar9 = plVar9 + 3;
        } while (bVar2);
      }
    }
code_r0x0024855c:
    uVar12 = lVar20 - *(long *)(unaff_x20 + 0xb8);
    uVar11 = 0;
    if (uVar12 <= *(ulong *)(unaff_x20 + 0x90)) {
      uVar11 = *(ulong *)(unaff_x20 + 0x90) - uVar12;
    }
    if (uVar10 <= uVar11) {
      uVar11 = uVar10;
    }
code_r0x00248574:
    uVar10 = *(ulong *)(unaff_x20 + 800);
    if (lVar19 == 0) {
      if (uVar11 <= uVar18) {
        uVar18 = uVar11;
      }
      if (uVar18 != 0) {
        lStack_40 = unaff_x19[1];
        do {
          uVar8 = uStack_28;
          uStack_38 = uVar18;
          if (uVar10 <= uVar18) {
            uStack_38 = uVar10;
          }
          uVar18 = uVar18 - uStack_38;
          lStack_48 = 0;
          lVar19 = uStack_38 + lStack_40;
          uStack_28 = CONCAT71(uStack_28._1_7_,3);
          uVar1 = uStack_28;
          uStack_28._4_4_ = SUB84(uVar8,4);
          uStack_28._0_2_ = (undefined2)uVar1;
          uStack_28._0_4_ = CONCAT22(4,(undefined2)uStack_28);
          func_0x00248644();
          lStack_40 = lVar19;
        } while (uVar18 != 0);
      }
    }
    else {
      if (uVar18 + uVar11 <= uVar8) {
        uVar8 = uVar18 + uVar11;
      }
      if (uVar8 != uVar18) {
        lVar20 = unaff_x19[1];
        uStack_38 = uVar18;
        do {
          uVar17 = uStack_28;
          uVar18 = uStack_38 + uVar10;
          uVar12 = uVar8;
          if (uVar18 <= uVar8) {
            uVar12 = uVar18;
          }
          uStack_28 = CONCAT71(uStack_28._1_7_,3);
          uVar1 = uStack_28;
          uStack_28._4_4_ = SUB84(uVar17,4);
          uStack_28._0_2_ = (undefined2)uVar1;
          uStack_28._0_4_ = CONCAT22(4,(undefined2)uStack_28);
          lStack_48 = lVar19;
          lStack_40 = lVar20;
          uStack_30 = uVar12;
          func_0x00248644();
          uStack_38 = uVar12;
        } while (uVar18 < uVar8);
      }
    }
    return uVar11;
  }
  lStack_40 = *unaff_x19;
  uStack_30 = unaff_x19[2];
  uVar8 = unaff_x19[3];
  uVar10 = uStack_30;
  if (lStack_40 != 0) {
    uVar10 = uVar8 - uStack_30;
  }
  uVar18 = uVar10;
  if (*unaff_x21 != 1) goto code_r0x001cc7f4;
  uVar18 = *(ulong *)(unaff_x21 + 10);
  if (uVar18 == 0) {
    lVar19 = 0;
  }
  else {
    lVar19 = 0;
    lVar20 = *(long *)(unaff_x21 + 6);
    uVar17 = *(ulong *)(unaff_x21 + 8);
    uVar12 = *(ulong *)(unaff_x21 + 4);
    uVar11 = 0;
    if (uVar12 <= uVar17) {
      uVar11 = uVar12;
    }
    lVar5 = uVar17 - uVar11;
    uVar14 = uVar12 - lVar5;
    if (uVar18 <= uVar14) {
      uVar12 = lVar5 + uVar18;
    }
    uVar13 = 0;
    if (uVar14 <= uVar18) {
      uVar13 = uVar18 - uVar14;
    }
    if (uVar12 - lVar5 != 0) {
      uVar16 = (uVar12 - lVar5) * 0x18;
      uVar12 = uVar16 / 0x18;
      if (uVar16 < 0x60) {
        lVar19 = 0;
        uVar15 = 0;
      }
      else {
        lVar19 = 0;
        lVar5 = 0;
        lVar3 = 0;
        lVar4 = 0;
        uVar15 = uVar12 & 0xffffffffffffffc;
        plVar9 = (long *)(uVar17 * 0x18 + uVar11 * -0x18 + lVar20 + 0x40);
        uVar16 = uVar15;
        do {
          lVar19 = plVar9[-6] + lVar19;
          lVar5 = plVar9[-3] + lVar5;
          lVar3 = *plVar9 + lVar3;
          lVar4 = plVar9[3] + lVar4;
          plVar9 = plVar9 + 0xc;
          uVar16 = uVar16 - 4;
        } while (uVar16 != 0);
        lVar19 = lVar4 + lVar3 + lVar5 + lVar19;
        if (uVar12 == uVar15) goto code_r0x001cc740;
      }
      lVar5 = uVar15 - uVar12;
      plVar9 = (long *)(uVar17 * 0x18 + uVar15 * 0x18 + uVar11 * -0x18 + lVar20 + 0x10);
      do {
        lVar19 = *plVar9 + lVar19;
        bVar2 = lVar5 != -1;
        lVar5 = lVar5 + 1;
        plVar9 = plVar9 + 3;
      } while (bVar2);
    }
code_r0x001cc740:
    if (uVar14 < uVar18) {
      if (uVar13 < 4) {
        uVar12 = 0;
      }
      else {
        lVar5 = 0;
        lVar3 = 0;
        lVar4 = 0;
        uVar12 = uVar13 & 0xfffffffffffffffc;
        plVar9 = (long *)(lVar20 + 0x40);
        uVar11 = uVar12;
        do {
          lVar19 = plVar9[-6] + lVar19;
          lVar5 = plVar9[-3] + lVar5;
          lVar3 = *plVar9 + lVar3;
          lVar4 = plVar9[3] + lVar4;
          plVar9 = plVar9 + 0xc;
          uVar11 = uVar11 - 4;
        } while (uVar11 != 0);
        lVar19 = lVar4 + lVar3 + lVar5 + lVar19;
        if (uVar13 == uVar12) goto code_r0x001cc7dc;
      }
      uVar11 = uVar18;
      if (uVar14 <= uVar18) {
        uVar11 = uVar14;
      }
      lVar5 = (uVar12 + uVar11) - uVar18;
      plVar9 = (long *)(lVar20 + uVar12 * 0x18 + 0x10);
      do {
        lVar19 = *plVar9 + lVar19;
        bVar2 = lVar5 != -1;
        lVar5 = lVar5 + 1;
        plVar9 = plVar9 + 3;
      } while (bVar2);
    }
  }
code_r0x001cc7dc:
  uVar18 = 0;
  if ((ulong)(lVar19 - *(long *)(unaff_x21 + 0xc)) <= *(ulong *)(unaff_x21 + 2)) {
    uVar18 = *(ulong *)(unaff_x21 + 2) - (lVar19 - *(long *)(unaff_x21 + 0xc));
  }
  if (uVar10 <= uVar18) {
    uVar18 = uVar10;
  }
code_r0x001cc7f4:
  if (lStack_40 == 0) {
    uStack_38 = unaff_x19[1];
    if (uVar18 <= uStack_30) {
      uStack_30 = uVar18;
    }
  }
  else {
    uStack_38 = unaff_x19[1];
    uStack_28 = uVar8;
    if (uVar18 + uStack_30 <= uVar8) {
      uStack_28 = uVar18 + uStack_30;
    }
  }
  func_0x00256290(&lStack_58,&lStack_40);
  if (lStack_48 == 0) {
    if (lStack_58 != 0) {
      func_0x00187bd4(lStack_50,lStack_58,1);
    }
  }
  else {
    uVar10 = *(ulong *)(unaff_x21 + 4);
    uVar8 = *(ulong *)(unaff_x21 + 10);
    if (uVar8 == uVar10) {
      func_0x00242e68(unaff_x21 + 4,&UNK_009c2c40);
      uVar8 = *(ulong *)(unaff_x21 + 10);
      uVar10 = *(ulong *)(unaff_x21 + 4);
    }
    uVar11 = 0;
    if (uVar10 <= *(long *)(unaff_x21 + 8) + uVar8) {
      uVar11 = uVar10;
    }
    plVar9 = (long *)(*(long *)(unaff_x21 + 6) +
                     ((*(long *)(unaff_x21 + 8) + uVar8) - uVar11) * 0x18);
    *plVar9 = lStack_58;
    plVar9[1] = lStack_50;
    plVar9[2] = lStack_48;
    *(long *)(unaff_x21 + 10) = *(long *)(unaff_x21 + 10) + 1;
  }
  return uVar18;
}

