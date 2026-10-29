/* 7ff70c7e6320 FUN_7ff70c7e6320 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

int * FUN_7ff70c7e6320(longlong param_1,int param_2,int param_3)

{
  ulonglong uVar1;
  longlong *plVar2;
  undefined4 *puVar3;
  longlong lVar4;
  int *piVar5;
  int *piVar6;
  undefined8 *puVar7;
  undefined8 uVar8;
  int iVar9;
  int iVar10;
  int *piVar11;
  longlong lVar12;
  undefined8 uVar13;
  longlong lVar14;
  longlong lVar15;
  int iVar16;
  longlong *plVar17;
  undefined8 *puVar18;
  undefined8 *puVar19;
  undefined8 *puVar20;
  int iVar21;
  int iVar22;
  undefined1 auVar23 [16];
  undefined4 uStack_78;
  undefined4 uStack_74;
  undefined4 uStack_70;
  undefined4 uStack_6c;
  
  lVar4 = *(longlong *)(param_1 + 0x38);
  piVar11 = (int *)FUN_7ff70c802100(0x58);
  piVar11[0] = 0;
  piVar11[1] = 0;
  piVar11[2] = 0;
  piVar11[3] = 0;
  piVar11[4] = 0;
  piVar11[5] = 0;
  piVar11[6] = 0;
  piVar11[7] = 0;
  piVar11[8] = 0;
  piVar11[9] = 0;
  piVar11[10] = 0;
  piVar11[0xb] = 0;
  piVar11[0xc] = 0;
  piVar11[0xd] = 0;
  piVar11[0xe] = 0;
  piVar11[0xf] = 0;
  piVar11[0x10] = 0;
  piVar11[0x11] = 0;
  piVar11[0x12] = 0;
  piVar11[0x13] = 0;
  piVar11[0x14] = 0;
  piVar11[0x15] = 0;
  iVar9 = *(int *)(param_1 + 0x298);
  *(int *)(param_1 + 0x298) = iVar9 + 1;
  *piVar11 = iVar9;
  iVar9 = *(int *)(param_1 + 0x40);
  if (iVar9 == *(int *)(param_1 + 0x44)) {
    if (iVar9 == 0) {
      iVar16 = 8;
    }
    else {
      iVar16 = iVar9 / 2 + iVar9;
    }
    iVar21 = iVar9 + 1;
    if (iVar9 + 1 < iVar16) {
      iVar21 = iVar16;
    }
    lVar12 = FUN_7ff70c802100((longlong)iVar21 << 3);
    if (*(longlong *)(param_1 + 0x48) != 0) {
      FUN_7ff70cb12b60(lVar12,*(longlong *)(param_1 + 0x48),(longlong)*(int *)(param_1 + 0x40) << 3)
      ;
      FUN_7ff70c802510(*(undefined8 *)(param_1 + 0x48));
    }
    *(longlong *)(param_1 + 0x48) = lVar12;
    *(int *)(param_1 + 0x44) = iVar21;
    iVar9 = *(int *)(param_1 + 0x40);
  }
  else {
    lVar12 = *(longlong *)(param_1 + 0x48);
  }
  *(int **)(lVar12 + (longlong)iVar9 * 8) = piVar11;
  *(int *)(param_1 + 0x40) = *(int *)(param_1 + 0x40) + 1;
  if (lVar4 != 0) {
    *(undefined1 *)(lVar4 + 0x57) = 1;
  }
  iVar9 = *(int *)(param_1 + 4);
  if (*(longlong *)(piVar11 + 10) != 0) {
    FUN_7ff70c802510();
  }
  piVar11[10] = 0;
  piVar11[0xb] = 0;
  piVar11[6] = iVar9;
  piVar11[7] = param_2;
  piVar11[8] = param_3;
  iVar16 = (uint)(iVar9 == 0) << 2;
  if (iVar9 == 1) {
    iVar16 = 1;
  }
  piVar11[9] = iVar16;
  *(undefined1 *)((longlong)piVar11 + 0x56) = 0;
  uVar13 = FUN_7ff70c802100((longlong)(param_3 * param_2 * iVar16));
  *(undefined8 *)(piVar11 + 10) = uVar13;
  FUN_7ff70cb12b80(uVar13,0,(longlong)piVar11[9] * (longlong)piVar11[8] * (longlong)piVar11[7]);
  piVar11[0xc] = 0;
  piVar11[0xd] = 0;
  piVar11[0xe] = -1;
  piVar11[0xf] = 0;
  piVar11[1] = 2;
  *(undefined1 *)(param_1 + 0x52) = 0;
  piVar5 = *(int **)(param_1 + 0x28);
  lVar4 = *(longlong *)(param_1 + 0x30);
  *(int **)(param_1 + 0x38) = piVar11;
  auVar23._4_4_ = (float)(int)((ulonglong)*(undefined8 *)(piVar11 + 7) >> 0x20);
  auVar23._0_4_ = (float)(int)*(undefined8 *)(piVar11 + 7);
  auVar23._8_8_ = 0;
  auVar23 = divps(_DAT_7ff70cb1bb60,auVar23);
  *(longlong *)(param_1 + 0x54) = auVar23._0_8_;
  *(int **)(param_1 + 0x28) = piVar11;
  if ((longlong)*(int *)(param_1 + 0x2a0) != 0) {
    plVar17 = *(longlong **)(param_1 + 0x2a8);
    plVar2 = plVar17 + *(int *)(param_1 + 0x2a0);
    do {
      lVar12 = (longlong)*(int *)(*plVar17 + 0x58);
      if (lVar12 != 0) {
        puVar19 = *(undefined8 **)(*plVar17 + 0x60);
        puVar20 = puVar19 + lVar12;
        do {
          piVar6 = (int *)*puVar19;
          if ((((*piVar6 < 1) || (*(longlong *)(piVar6 + 0x1e) != lVar4)) ||
              (*(int **)(piVar6 + 0x1c) != piVar5)) || (*(int **)(piVar6 + 0x1c) == piVar11)) {
LAB_7ff70c7e66f0:
            iVar9 = piVar6[0x2c];
          }
          else {
            *(int **)(piVar6 + 0x1c) = piVar11;
            *(longlong *)(piVar6 + 0x1e) = lVar4;
            lVar12 = *(longlong *)(piVar6 + 0x2e);
            iVar9 = piVar6[0x2c];
            *(int **)(lVar12 + -0x10 + (longlong)iVar9 * 0x10) = piVar11;
            *(longlong *)(lVar12 + -8 + (longlong)iVar9 * 0x10) = lVar4;
            lVar15 = *(longlong *)(piVar6 + 2);
            iVar9 = *piVar6;
            lVar14 = (longlong)iVar9;
            lVar12 = lVar15 + lVar14 * 0x48;
            iVar16 = *(int *)(lVar15 + -0x20 + lVar14 * 0x48);
            if ((iVar16 != 0) &&
               ((*(longlong *)(lVar12 + -0x30) != *(longlong *)(piVar6 + 0x1e) ||
                (*(longlong *)(lVar12 + -0x38) != *(longlong *)(piVar6 + 0x1c))))) {
              uVar13 = *(undefined8 *)(piVar6 + 0x18);
              uVar8 = *(undefined8 *)(piVar6 + 0x1a);
              auVar23 = *(undefined1 (*) [16])(piVar6 + 0x1c);
              iVar16 = piVar6[4];
              iVar21 = piVar6[0x20];
              if (iVar9 == piVar6[1]) {
                if (iVar9 == 0) {
                  iVar10 = 8;
                }
                else {
                  iVar10 = iVar9 / 2 + iVar9;
                }
                iVar22 = iVar9 + 1;
                if (iVar9 + 1 < iVar10) {
                  iVar22 = iVar10;
                }
                lVar15 = FUN_7ff70c802100((longlong)iVar22 * 0x48);
                if (*(longlong *)(piVar6 + 2) != 0) {
                  FUN_7ff70cb12b60(lVar15,*(longlong *)(piVar6 + 2),(longlong)*piVar6 * 0x48);
                  FUN_7ff70c802510(*(undefined8 *)(piVar6 + 2));
                }
                *(longlong *)(piVar6 + 2) = lVar15;
                piVar6[1] = iVar22;
                lVar14 = (longlong)*piVar6;
              }
              uStack_78 = (undefined4)uVar13;
              uStack_74 = (undefined4)((ulonglong)uVar13 >> 0x20);
              uStack_70 = (undefined4)uVar8;
              uStack_6c = (undefined4)((ulonglong)uVar8 >> 0x20);
              *(undefined1 (*) [16])(lVar15 + 0x10 + lVar14 * 0x48) = auVar23;
              puVar3 = (undefined4 *)(lVar15 + lVar14 * 0x48);
              *puVar3 = uStack_78;
              puVar3[1] = uStack_74;
              puVar3[2] = uStack_70;
              puVar3[3] = uStack_6c;
              *(int *)(lVar15 + 0x20 + lVar14 * 0x48) = iVar21;
              *(int *)(lVar15 + 0x24 + lVar14 * 0x48) = iVar16;
              puVar18 = (undefined8 *)(lVar15 + 0x28 + lVar14 * 0x48);
              *puVar18 = 0;
              puVar18[1] = 0;
              puVar18 = (undefined8 *)(lVar15 + 0x38 + lVar14 * 0x48);
              *puVar18 = 0;
              puVar18[1] = 0;
              *piVar6 = *piVar6 + 1;
              goto LAB_7ff70c7e66f0;
            }
            if (*(longlong *)(lVar12 + -0x18) != 0) goto LAB_7ff70c7e66f0;
            if (((iVar9 < 2) || (iVar16 != 0)) ||
               ((iVar16 = FUN_7ff70cb12b50(piVar6 + 0x18,lVar12 + -0x90,0x24), iVar16 != 0 ||
                ((*(int *)(lVar12 + -0x68) + *(int *)(lVar12 + -0x6c) != *(int *)(lVar12 + -0x24) ||
                 (*(longlong *)(lVar12 + -0x60) != 0)))))) {
              iVar9 = piVar6[0x1d];
              iVar16 = piVar6[0x1e];
              iVar21 = piVar6[0x1f];
              *(int *)(lVar12 + -0x38) = *(int *)*(undefined1 (*) [16])(piVar6 + 0x1c);
              *(int *)(lVar12 + -0x34) = iVar9;
              *(int *)(lVar12 + -0x30) = iVar16;
              *(int *)(lVar12 + -0x2c) = iVar21;
              iVar9 = piVar6[0x2c];
            }
            else {
              *piVar6 = iVar9 + -1;
              iVar9 = piVar6[0x2c];
            }
          }
          lVar12 = (longlong)iVar9;
          if (lVar12 != 0) {
            puVar7 = *(undefined8 **)(piVar6 + 0x2e);
            uVar1 = lVar12 * 0x10 - 0x10;
            puVar18 = puVar7;
            if ((uVar1 & 0x10) == 0) {
              if ((puVar7[1] == lVar4) && ((int *)*puVar7 == piVar5)) {
                *puVar7 = piVar11;
                puVar7[1] = lVar4;
              }
              puVar18 = puVar7 + 2;
            }
            if (uVar1 != 0) {
              do {
                if ((puVar18[1] == lVar4) && ((int *)*puVar18 == piVar5)) {
                  *puVar18 = piVar11;
                  puVar18[1] = lVar4;
                }
                if ((puVar18[3] == lVar4) && ((int *)puVar18[2] == piVar5)) {
                  puVar18[2] = piVar11;
                  puVar18[3] = lVar4;
                }
                puVar18 = puVar18 + 4;
              } while (puVar18 != puVar7 + lVar12 * 2);
            }
          }
          puVar19 = puVar19 + 1;
        } while (puVar19 != puVar20);
      }
      plVar17 = plVar17 + 1;
    } while (plVar17 != plVar2);
  }
  return piVar11;
}


