/* 7ff70c7c22e0 FUN_7ff70c7c22e0 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c7c22e0(int *param_1,longlong *param_2,undefined8 *param_3,undefined8 *param_4,
                     undefined8 *param_5,undefined8 *param_6,uint param_7)

{
  longlong *plVar1;
  undefined4 *puVar2;
  undefined8 *puVar3;
  int *piVar4;
  undefined4 uVar5;
  undefined4 uVar6;
  undefined4 uVar7;
  undefined4 uVar8;
  undefined4 uVar9;
  undefined4 uVar10;
  undefined4 uVar11;
  undefined4 uVar12;
  code *pcVar13;
  undefined8 uVar14;
  int iVar15;
  longlong lVar16;
  longlong lVar17;
  int iVar18;
  int iVar19;
  int iVar20;
  short sVar21;
  int iVar22;
  longlong lVar23;
  undefined1 auStack_a8 [44];
  int iStack_7c;
  longlong lStack_78;
  longlong lStack_70;
  longlong lStack_68;
  longlong lStack_60;
  undefined8 uStack_58;
  undefined8 uStack_50;
  ulonglong uStack_48;
  
  uStack_48 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_a8;
  if (param_7 < 0x1000000) goto LAB_7ff70c7c2d23;
  if ((param_2[1] == *(longlong *)(param_1 + 0x1e)) && (*param_2 == *(longlong *)(param_1 + 0x1c)))
  {
    if ((param_1[0xd] - 0xfffcU < 0xffff0000) && ((*(byte *)(param_1 + 0xc) & 8) != 0)) {
      iVar15 = param_1[8];
      param_1[0x20] = iVar15;
      param_1[0xd] = 0;
      lVar17 = *(longlong *)(param_1 + 2);
      iVar22 = *param_1;
      lVar16 = (longlong)iVar22;
      if (*(int *)(lVar17 + -0x20 + lVar16 * 0x48) == 0) {
        *(int *)(lVar17 + lVar16 * 0x48 + -0x28) = iVar15;
      }
      else {
        lStack_68 = *(longlong *)(param_1 + 0x18);
        lStack_60 = *(longlong *)(param_1 + 0x1a);
        uStack_58 = *(longlong *)(param_1 + 0x1c);
        uStack_50 = *(longlong *)(param_1 + 0x1e);
        iVar20 = param_1[4];
        if (iVar22 == param_1[1]) {
          if (iVar22 == 0) {
            iVar18 = 8;
          }
          else {
            iVar18 = iVar22 / 2 + iVar22;
          }
          iVar19 = iVar22 + 1;
          if (iVar22 + 1 < iVar18) {
            iVar19 = iVar18;
          }
          lVar17 = FUN_7ff70c802100((longlong)iVar19 * 0x48);
          if (*(longlong *)(param_1 + 2) != 0) {
            FUN_7ff70cb12b60(lVar17,*(longlong *)(param_1 + 2),(longlong)*param_1 * 0x48);
            FUN_7ff70c802510(*(undefined8 *)(param_1 + 2));
          }
          *(longlong *)(param_1 + 2) = lVar17;
          param_1[1] = iVar19;
          lVar16 = (longlong)*param_1;
        }
        puVar2 = (undefined4 *)(lVar17 + 0x10 + lVar16 * 0x48);
        *puVar2 = (undefined4)uStack_58;
        puVar2[1] = uStack_58._4_4_;
        puVar2[2] = (undefined4)uStack_50;
        puVar2[3] = uStack_50._4_4_;
        plVar1 = (longlong *)(lVar17 + lVar16 * 0x48);
        *plVar1 = lStack_68;
        plVar1[1] = lStack_60;
        *(int *)(lVar17 + 0x20 + lVar16 * 0x48) = iVar15;
        *(int *)(lVar17 + 0x24 + lVar16 * 0x48) = iVar20;
        puVar3 = (undefined8 *)(lVar17 + 0x28 + lVar16 * 0x48);
        *puVar3 = 0;
        puVar3[1] = 0;
        puVar3 = (undefined8 *)(lVar17 + 0x38 + lVar16 * 0x48);
        *puVar3 = 0;
        puVar3[1] = 0;
        *param_1 = *param_1 + 1;
      }
    }
    piVar4 = (int *)(*(longlong *)(param_1 + 2) + -0x20 + (longlong)*param_1 * 0x48);
    *piVar4 = *piVar4 + 6;
    iVar15 = param_1[8];
    iVar20 = iVar15 + 4;
    iVar22 = param_1[9];
    if (iVar22 < iVar20) {
      if (iVar22 == 0) {
        iVar22 = 8;
      }
      else {
        iVar22 = iVar22 / 2 + iVar22;
      }
      if (iVar22 <= iVar20) {
        iVar22 = iVar20;
      }
      lVar17 = FUN_7ff70c802100((longlong)iVar22 * 0x14);
      if (*(longlong *)(param_1 + 10) != 0) {
        FUN_7ff70cb12b60(lVar17,*(longlong *)(param_1 + 10),(longlong)param_1[8] * 0x14);
        FUN_7ff70c802510(*(undefined8 *)(param_1 + 10));
      }
      *(longlong *)(param_1 + 10) = lVar17;
      param_1[9] = iVar22;
    }
    else {
      lVar17 = *(longlong *)(param_1 + 10);
    }
    param_1[8] = iVar20;
    *(longlong *)(param_1 + 0x10) = lVar17 + (longlong)iVar15 * 0x14;
    iVar15 = param_1[4];
    iVar20 = iVar15 + 6;
    iVar22 = param_1[5];
    if (iVar22 < iVar20) {
      if (iVar22 == 0) {
        iVar22 = 8;
      }
      else {
        iVar22 = iVar22 / 2 + iVar22;
      }
      if (iVar22 <= iVar20) {
        iVar22 = iVar20;
      }
      lVar17 = FUN_7ff70c802100((longlong)iVar22 * 2);
      if (*(longlong *)(param_1 + 6) != 0) {
        FUN_7ff70cb12b60(lVar17,*(longlong *)(param_1 + 6),(longlong)param_1[4] * 2);
        FUN_7ff70c802510(*(undefined8 *)(param_1 + 6));
      }
      *(longlong *)(param_1 + 6) = lVar17;
      param_1[5] = iVar22;
    }
    else {
      lVar17 = *(longlong *)(param_1 + 6);
    }
    param_1[4] = iVar20;
    *(longlong *)(param_1 + 0x12) = lVar17 + (longlong)iVar15 * 2;
    uVar5 = *(undefined4 *)param_3;
    uVar6 = *(undefined4 *)((longlong)param_3 + 4);
    uVar7 = *(undefined4 *)param_4;
    uVar8 = *(undefined4 *)((longlong)param_4 + 4);
    uVar9 = *(undefined4 *)param_5;
    uVar10 = *(undefined4 *)((longlong)param_5 + 4);
    uVar11 = *(undefined4 *)param_6;
    uVar12 = *(undefined4 *)((longlong)param_6 + 4);
    sVar21 = (short)param_1[0xd];
    *(short *)(lVar17 + (longlong)iVar15 * 2) = sVar21;
    *(short *)(*(longlong *)(param_1 + 0x12) + 2) = sVar21 + 1;
    *(short *)(*(longlong *)(param_1 + 0x12) + 4) = sVar21 + 2;
    *(short *)(*(longlong *)(param_1 + 0x12) + 6) = sVar21;
    *(short *)(*(longlong *)(param_1 + 0x12) + 8) = sVar21 + 2;
    *(short *)(*(longlong *)(param_1 + 0x12) + 10) = sVar21 + 3;
    **(undefined8 **)(param_1 + 0x10) = *param_3;
    *(undefined8 *)(*(longlong *)(param_1 + 0x10) + 8) = *param_5;
    *(uint *)(*(longlong *)(param_1 + 0x10) + 0x10) = param_7;
    lVar17 = *(longlong *)(param_1 + 0x10);
    *(undefined4 *)(lVar17 + 0x14) = uVar7;
    *(undefined4 *)(lVar17 + 0x18) = uVar6;
    lVar17 = *(longlong *)(param_1 + 0x10);
    *(undefined4 *)(lVar17 + 0x1c) = uVar11;
    *(undefined4 *)(lVar17 + 0x20) = uVar10;
    *(uint *)(*(longlong *)(param_1 + 0x10) + 0x24) = param_7;
    *(undefined8 *)(*(longlong *)(param_1 + 0x10) + 0x28) = *param_4;
    *(undefined8 *)(*(longlong *)(param_1 + 0x10) + 0x30) = *param_6;
    *(uint *)(*(longlong *)(param_1 + 0x10) + 0x38) = param_7;
    lVar17 = *(longlong *)(param_1 + 0x10);
    *(undefined4 *)(lVar17 + 0x3c) = uVar5;
    *(undefined4 *)(lVar17 + 0x40) = uVar8;
    lVar17 = *(longlong *)(param_1 + 0x10);
    *(undefined4 *)(lVar17 + 0x44) = uVar9;
    *(undefined4 *)(lVar17 + 0x48) = uVar12;
    *(uint *)(*(longlong *)(param_1 + 0x10) + 0x4c) = param_7;
    param_1[0xd] = param_1[0xd] + 4;
    lVar17 = *(longlong *)(param_1 + 0x12) + _UNK_7ff70cb1ba48;
    *(longlong *)(param_1 + 0x10) = *(longlong *)(param_1 + 0x10) + _DAT_7ff70cb1ba40;
    *(longlong *)(param_1 + 0x12) = lVar17;
    goto LAB_7ff70c7c2d23;
  }
  lStack_78 = *param_2;
  lStack_70 = param_2[1];
  iVar15 = param_1[0x2c];
  if (iVar15 == param_1[0x2d]) {
    if (iVar15 == 0) {
      iVar22 = 8;
    }
    else {
      iVar22 = iVar15 / 2 + iVar15;
    }
    iVar20 = iVar15 + 1;
    if (iVar15 + 1 < iVar22) {
      iVar20 = iVar22;
    }
    lVar17 = FUN_7ff70c802100((longlong)iVar20 << 4);
    if (*(longlong *)(param_1 + 0x2e) != 0) {
      FUN_7ff70cb12b60(lVar17,*(longlong *)(param_1 + 0x2e),(longlong)param_1[0x2c] << 4);
      FUN_7ff70c802510(*(undefined8 *)(param_1 + 0x2e));
    }
    *(longlong *)(param_1 + 0x2e) = lVar17;
    param_1[0x2d] = iVar20;
    iVar15 = param_1[0x2c];
  }
  else {
    lVar17 = *(longlong *)(param_1 + 0x2e);
  }
  plVar1 = (longlong *)(lVar17 + (longlong)iVar15 * 0x10);
  *plVar1 = lStack_78;
  plVar1[1] = lStack_70;
  param_1[0x2c] = param_1[0x2c] + 1;
  *(longlong *)(param_1 + 0x1c) = lStack_78;
  *(longlong *)(param_1 + 0x1e) = lStack_70;
  lVar16 = *(longlong *)(param_1 + 2);
  iVar15 = *param_1;
  lVar23 = (longlong)iVar15;
  lVar17 = lVar16 + lVar23 * 0x48;
  iVar22 = *(int *)(lVar16 + -0x20 + lVar23 * 0x48);
  if ((iVar22 == 0) ||
     ((*(longlong *)(lVar17 + -0x30) == *(longlong *)(param_1 + 0x1e) &&
      (*(longlong *)(lVar17 + -0x38) == *(longlong *)(param_1 + 0x1c))))) {
    if (*(longlong *)(lVar17 + -0x18) != 0) goto LAB_7ff70c7c25e3;
    if ((((iVar15 < 2) || (iVar22 != 0)) ||
        (iVar22 = FUN_7ff70cb12b50(param_1 + 0x18,lVar17 + -0x90,0x24), iVar22 != 0)) ||
       ((*(int *)(lVar17 + -0x68) + *(int *)(lVar17 + -0x6c) != *(int *)(lVar17 + -0x24) ||
        (*(longlong *)(lVar17 + -0x60) != 0)))) {
      *(longlong *)(lVar17 + -0x38) = lStack_78;
      *(longlong *)(lVar17 + -0x30) = lStack_70;
      iVar15 = param_1[0xd];
    }
    else {
      *param_1 = iVar15 + -1;
      iVar15 = param_1[0xd];
    }
  }
  else {
    lStack_68 = *(longlong *)(param_1 + 0x18);
    lStack_60 = *(longlong *)(param_1 + 0x1a);
    uStack_58 = lStack_78;
    uStack_50 = lStack_70;
    iVar22 = param_1[4];
    iVar20 = param_1[0x20];
    if (iVar15 == param_1[1]) {
      if (iVar15 == 0) {
        iVar20 = 8;
      }
      else {
        iVar20 = iVar15 / 2 + iVar15;
      }
      iVar18 = iVar15 + 1;
      if (iVar15 + 1 < iVar20) {
        iVar18 = iVar20;
      }
      iStack_7c = param_1[0x20];
      lVar16 = FUN_7ff70c802100((longlong)iVar18 * 0x48);
      if (*(longlong *)(param_1 + 2) != 0) {
        FUN_7ff70cb12b60(lVar16,*(longlong *)(param_1 + 2),(longlong)*param_1 * 0x48);
        FUN_7ff70c802510(*(undefined8 *)(param_1 + 2));
      }
      *(longlong *)(param_1 + 2) = lVar16;
      param_1[1] = iVar18;
      lVar23 = (longlong)*param_1;
      iVar20 = iStack_7c;
    }
    plVar1 = (longlong *)(lVar16 + 0x10 + lVar23 * 0x48);
    *plVar1 = uStack_58;
    plVar1[1] = uStack_50;
    plVar1 = (longlong *)(lVar16 + lVar23 * 0x48);
    *plVar1 = lStack_68;
    plVar1[1] = lStack_60;
    *(int *)(lVar16 + 0x20 + lVar23 * 0x48) = iVar20;
    *(int *)(lVar16 + 0x24 + lVar23 * 0x48) = iVar22;
    puVar3 = (undefined8 *)(lVar16 + 0x28 + lVar23 * 0x48);
    *puVar3 = 0;
    puVar3[1] = 0;
    puVar3 = (undefined8 *)(lVar16 + 0x38 + lVar23 * 0x48);
    *puVar3 = 0;
    puVar3[1] = 0;
    *param_1 = *param_1 + 1;
LAB_7ff70c7c25e3:
    iVar15 = param_1[0xd];
  }
  if ((iVar15 - 0xfffcU < 0xffff0000) && ((*(byte *)(param_1 + 0xc) & 8) != 0)) {
    iVar15 = param_1[8];
    param_1[0x20] = iVar15;
    param_1[0xd] = 0;
    lVar17 = *(longlong *)(param_1 + 2);
    iVar22 = *param_1;
    lVar16 = (longlong)iVar22;
    if (*(int *)(lVar17 + -0x20 + lVar16 * 0x48) == 0) {
      *(int *)(lVar17 + lVar16 * 0x48 + -0x28) = iVar15;
    }
    else {
      lStack_68 = *(longlong *)(param_1 + 0x18);
      lStack_60 = *(longlong *)(param_1 + 0x1a);
      uStack_58 = *(longlong *)(param_1 + 0x1c);
      uStack_50 = *(longlong *)(param_1 + 0x1e);
      iVar20 = param_1[4];
      if (iVar22 == param_1[1]) {
        if (iVar22 == 0) {
          iVar18 = 8;
        }
        else {
          iVar18 = iVar22 / 2 + iVar22;
        }
        iVar19 = iVar22 + 1;
        if (iVar22 + 1 < iVar18) {
          iVar19 = iVar18;
        }
        lVar17 = FUN_7ff70c802100((longlong)iVar19 * 0x48);
        if (*(longlong *)(param_1 + 2) != 0) {
          FUN_7ff70cb12b60(lVar17,*(longlong *)(param_1 + 2),(longlong)*param_1 * 0x48);
          FUN_7ff70c802510(*(undefined8 *)(param_1 + 2));
        }
        *(longlong *)(param_1 + 2) = lVar17;
        param_1[1] = iVar19;
        lVar16 = (longlong)*param_1;
      }
      plVar1 = (longlong *)(lVar17 + 0x10 + lVar16 * 0x48);
      *plVar1 = uStack_58;
      plVar1[1] = uStack_50;
      plVar1 = (longlong *)(lVar17 + lVar16 * 0x48);
      *plVar1 = lStack_68;
      plVar1[1] = lStack_60;
      *(int *)(lVar17 + 0x20 + lVar16 * 0x48) = iVar15;
      *(int *)(lVar17 + 0x24 + lVar16 * 0x48) = iVar20;
      puVar3 = (undefined8 *)(lVar17 + 0x28 + lVar16 * 0x48);
      *puVar3 = 0;
      puVar3[1] = 0;
      puVar3 = (undefined8 *)(lVar17 + 0x38 + lVar16 * 0x48);
      *puVar3 = 0;
      puVar3[1] = 0;
      *param_1 = *param_1 + 1;
    }
  }
  piVar4 = (int *)(*(longlong *)(param_1 + 2) + -0x20 + (longlong)*param_1 * 0x48);
  *piVar4 = *piVar4 + 6;
  iVar15 = param_1[8];
  iVar20 = iVar15 + 4;
  iVar22 = param_1[9];
  if (iVar22 < iVar20) {
    if (iVar22 == 0) {
      iVar22 = 8;
    }
    else {
      iVar22 = iVar22 / 2 + iVar22;
    }
    if (iVar22 <= iVar20) {
      iVar22 = iVar20;
    }
    lVar17 = FUN_7ff70c802100((longlong)iVar22 * 0x14);
    if (*(longlong *)(param_1 + 10) != 0) {
      FUN_7ff70cb12b60(lVar17,*(longlong *)(param_1 + 10),(longlong)param_1[8] * 0x14);
      FUN_7ff70c802510(*(undefined8 *)(param_1 + 10));
    }
    *(longlong *)(param_1 + 10) = lVar17;
    param_1[9] = iVar22;
  }
  else {
    lVar17 = *(longlong *)(param_1 + 10);
  }
  param_1[8] = iVar20;
  *(longlong *)(param_1 + 0x10) = lVar17 + (longlong)iVar15 * 0x14;
  iVar15 = param_1[4];
  iVar20 = iVar15 + 6;
  iVar22 = param_1[5];
  if (iVar22 < iVar20) {
    if (iVar22 == 0) {
      iVar22 = 8;
    }
    else {
      iVar22 = iVar22 / 2 + iVar22;
    }
    if (iVar22 <= iVar20) {
      iVar22 = iVar20;
    }
    lVar17 = FUN_7ff70c802100((longlong)iVar22 * 2);
    if (*(longlong *)(param_1 + 6) != 0) {
      FUN_7ff70cb12b60(lVar17,*(longlong *)(param_1 + 6),(longlong)param_1[4] * 2);
      FUN_7ff70c802510(*(undefined8 *)(param_1 + 6));
    }
    *(longlong *)(param_1 + 6) = lVar17;
    param_1[5] = iVar22;
  }
  else {
    lVar17 = *(longlong *)(param_1 + 6);
  }
  param_1[4] = iVar20;
  *(longlong *)(param_1 + 0x12) = lVar17 + (longlong)iVar15 * 2;
  uVar5 = *(undefined4 *)param_3;
  uVar6 = *(undefined4 *)((longlong)param_3 + 4);
  uVar7 = *(undefined4 *)param_4;
  uVar8 = *(undefined4 *)((longlong)param_4 + 4);
  uVar9 = *(undefined4 *)param_5;
  uVar10 = *(undefined4 *)((longlong)param_5 + 4);
  uVar11 = *(undefined4 *)param_6;
  uVar12 = *(undefined4 *)((longlong)param_6 + 4);
  sVar21 = (short)param_1[0xd];
  *(short *)(lVar17 + (longlong)iVar15 * 2) = sVar21;
  *(short *)(*(longlong *)(param_1 + 0x12) + 2) = sVar21 + 1;
  *(short *)(*(longlong *)(param_1 + 0x12) + 4) = sVar21 + 2;
  *(short *)(*(longlong *)(param_1 + 0x12) + 6) = sVar21;
  *(short *)(*(longlong *)(param_1 + 0x12) + 8) = sVar21 + 2;
  *(short *)(*(longlong *)(param_1 + 0x12) + 10) = sVar21 + 3;
  **(undefined8 **)(param_1 + 0x10) = *param_3;
  *(undefined8 *)(*(longlong *)(param_1 + 0x10) + 8) = *param_5;
  *(uint *)(*(longlong *)(param_1 + 0x10) + 0x10) = param_7;
  lVar17 = *(longlong *)(param_1 + 0x10);
  *(undefined4 *)(lVar17 + 0x14) = uVar7;
  *(undefined4 *)(lVar17 + 0x18) = uVar6;
  lVar17 = *(longlong *)(param_1 + 0x10);
  *(undefined4 *)(lVar17 + 0x1c) = uVar11;
  *(undefined4 *)(lVar17 + 0x20) = uVar10;
  *(uint *)(*(longlong *)(param_1 + 0x10) + 0x24) = param_7;
  *(undefined8 *)(*(longlong *)(param_1 + 0x10) + 0x28) = *param_4;
  *(undefined8 *)(*(longlong *)(param_1 + 0x10) + 0x30) = *param_6;
  *(uint *)(*(longlong *)(param_1 + 0x10) + 0x38) = param_7;
  lVar17 = *(longlong *)(param_1 + 0x10);
  *(undefined4 *)(lVar17 + 0x3c) = uVar5;
  *(undefined4 *)(lVar17 + 0x40) = uVar8;
  lVar17 = *(longlong *)(param_1 + 0x10);
  *(undefined4 *)(lVar17 + 0x44) = uVar9;
  *(undefined4 *)(lVar17 + 0x48) = uVar12;
  *(uint *)(*(longlong *)(param_1 + 0x10) + 0x4c) = param_7;
  param_1[0xd] = param_1[0xd] + 4;
  lVar17 = *(longlong *)(param_1 + 0x12) + _UNK_7ff70cb1ba48;
  *(longlong *)(param_1 + 0x10) = *(longlong *)(param_1 + 0x10) + _DAT_7ff70cb1ba40;
  *(longlong *)(param_1 + 0x12) = lVar17;
  iVar15 = param_1[0x2c];
  iVar22 = (int)((longlong)iVar15 + -1);
  param_1[0x2c] = iVar22;
  if (iVar22 == 0) {
    lStack_68 = 0;
    lStack_60 = 0;
  }
  else {
    plVar1 = (longlong *)(*(longlong *)(param_1 + 0x2e) + -0x10 + ((longlong)iVar15 + -1) * 0x10);
    lStack_68 = *plVar1;
    lStack_60 = plVar1[1];
  }
  plVar1 = (longlong *)(param_1 + 0x1c);
  *plVar1 = lStack_68;
  *(longlong *)(param_1 + 0x1e) = lStack_60;
  lVar16 = *(longlong *)(param_1 + 2);
  iVar15 = *param_1;
  lVar23 = (longlong)iVar15;
  lVar17 = lVar16 + lVar23 * 0x48;
  iVar22 = *(int *)(lVar16 + -0x20 + lVar23 * 0x48);
  if ((iVar22 == 0) ||
     ((*(longlong *)(lVar17 + -0x30) == *(longlong *)(param_1 + 0x1e) &&
      (*(longlong *)(lVar17 + -0x38) == *(longlong *)(param_1 + 0x1c))))) {
    if (*(longlong *)(lVar17 + -0x18) == 0) {
      if ((((iVar15 < 2) || (iVar22 != 0)) ||
          (iVar22 = FUN_7ff70cb12b50(param_1 + 0x18,lVar17 + -0x90,0x24), iVar22 != 0)) ||
         ((*(int *)(lVar17 + -0x68) + *(int *)(lVar17 + -0x6c) != *(int *)(lVar17 + -0x24) ||
          (*(longlong *)(lVar17 + -0x60) != 0)))) {
        uVar14 = *(undefined8 *)(param_1 + 0x1e);
        *(longlong *)(lVar17 + -0x38) = *plVar1;
        *(undefined8 *)(lVar17 + -0x30) = uVar14;
      }
      else {
        *param_1 = iVar15 + -1;
      }
    }
  }
  else {
    lStack_68 = *(longlong *)(param_1 + 0x18);
    lStack_60 = *(longlong *)(param_1 + 0x1a);
    uStack_58 = *plVar1;
    uStack_50 = *(longlong *)(param_1 + 0x1e);
    iVar22 = param_1[4];
    iVar20 = param_1[0x20];
    if (iVar15 == param_1[1]) {
      if (iVar15 == 0) {
        iVar18 = 8;
      }
      else {
        iVar18 = iVar15 / 2 + iVar15;
      }
      iVar19 = iVar15 + 1;
      if (iVar15 + 1 < iVar18) {
        iVar19 = iVar18;
      }
      lVar16 = FUN_7ff70c802100((longlong)iVar19 * 0x48);
      if (*(longlong *)(param_1 + 2) != 0) {
        FUN_7ff70cb12b60(lVar16,*(longlong *)(param_1 + 2),(longlong)*param_1 * 0x48);
        FUN_7ff70c802510(*(undefined8 *)(param_1 + 2));
      }
      *(longlong *)(param_1 + 2) = lVar16;
      param_1[1] = iVar19;
      lVar23 = (longlong)*param_1;
    }
    plVar1 = (longlong *)(lVar16 + 0x10 + lVar23 * 0x48);
    *plVar1 = uStack_58;
    plVar1[1] = uStack_50;
    plVar1 = (longlong *)(lVar16 + lVar23 * 0x48);
    *plVar1 = lStack_68;
    plVar1[1] = lStack_60;
    *(int *)(lVar16 + 0x20 + lVar23 * 0x48) = iVar20;
    *(int *)(lVar16 + 0x24 + lVar23 * 0x48) = iVar22;
    *(undefined1 (*) [16])(lVar16 + 0x28 + lVar23 * 0x48) = (undefined1  [16])0x0;
    *(undefined1 (*) [16])(lVar16 + 0x38 + lVar23 * 0x48) = (undefined1  [16])0x0;
    *param_1 = *param_1 + 1;
  }
LAB_7ff70c7c2d23:
  if (_DAT_7ff70cbebd80 == (uStack_48 ^ (ulonglong)auStack_a8)) {
    return;
  }
  FUN_7ff70caa97e0(uStack_48 ^ (ulonglong)auStack_a8);
  pcVar13 = (code *)swi(3);
  (*pcVar13)();
  return;
}


