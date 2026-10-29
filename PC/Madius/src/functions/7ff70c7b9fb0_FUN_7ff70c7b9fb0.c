/* 7ff70c7b9fb0 FUN_7ff70c7b9fb0 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c7b9fb0(int *param_1,longlong param_2,uint param_3,uint param_4)

{
  int *piVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  code *pcVar4;
  undefined1 auVar5 [16];
  int iVar6;
  uint uVar7;
  longlong lVar8;
  undefined8 uVar9;
  int iVar10;
  longlong lVar11;
  ulonglong uVar12;
  short *psVar13;
  undefined2 *puVar14;
  int iVar15;
  int iVar16;
  int iVar17;
  uint uVar18;
  undefined8 *puVar19;
  ulonglong uVar20;
  short sVar21;
  short sVar22;
  short sVar23;
  float fVar24;
  float fVar25;
  float fVar26;
  float fVar27;
  undefined1 auVar28 [16];
  float fVar29;
  float fVar30;
  float fVar31;
  float fVar32;
  float fVar33;
  float fVar34;
  undefined1 auStack_d8 [44];
  int iStack_ac;
  ulonglong uStack_a8;
  longlong lStack_a0;
  undefined8 uStack_98;
  undefined8 uStack_90;
  int iStack_88;
  int iStack_84;
  int iStack_80;
  int iStack_7c;
  ulonglong uStack_70;
  
  uStack_70 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_d8;
  if (param_4 < 0x1000000 || (int)param_3 < 3) goto LAB_7ff70c7ba855;
  uVar12 = (ulonglong)param_3;
  uVar3 = **(undefined8 **)(param_1 + 0xe);
  uVar7 = param_1[0xc];
  if ((uVar7 & 4) == 0) {
    iVar17 = param_3 * 3 + -6;
    iVar6 = *param_1;
    if (((uVar7 & 8) != 0) && (0xffff < param_1[0xd] + param_3)) {
      lVar11 = (longlong)iVar6;
      iVar16 = param_1[8];
      param_1[0x20] = iVar16;
      param_1[0xd] = 0;
      lVar8 = *(longlong *)(param_1 + 2);
      if (*(int *)(lVar8 + -0x20 + lVar11 * 0x48) == 0) {
        *(int *)(lVar8 + lVar11 * 0x48 + -0x28) = iVar16;
        iVar6 = *param_1;
      }
      else {
        uStack_98 = *(undefined8 *)(param_1 + 0x18);
        uStack_90 = *(undefined8 *)(param_1 + 0x1a);
        iStack_88 = param_1[0x1c];
        iStack_84 = param_1[0x1d];
        iStack_80 = param_1[0x1e];
        iStack_7c = param_1[0x1f];
        iVar10 = param_1[4];
        if (iVar6 == param_1[1]) {
          uStack_a8 = CONCAT44(uStack_a8._4_4_,param_1[4]);
          if (iVar6 == 0) {
            iVar10 = 8;
          }
          else {
            iVar10 = iVar6 / 2 + iVar6;
          }
          iVar15 = iVar6 + 1;
          if (iVar6 + 1 < iVar10) {
            iVar15 = iVar10;
          }
          iStack_ac = iVar17;
          lVar8 = FUN_7ff70c802100((longlong)iVar15 * 0x48);
          if (*(longlong *)(param_1 + 2) != 0) {
            FUN_7ff70cb12b60(lVar8,*(longlong *)(param_1 + 2),(longlong)*param_1 * 0x48);
            FUN_7ff70c802510(*(undefined8 *)(param_1 + 2));
          }
          *(longlong *)(param_1 + 2) = lVar8;
          param_1[1] = iVar15;
          lVar11 = (longlong)*param_1;
          iVar17 = iStack_ac;
          iVar10 = (int)uStack_a8;
        }
        piVar1 = (int *)(lVar8 + 0x10 + lVar11 * 0x48);
        *piVar1 = iStack_88;
        piVar1[1] = iStack_84;
        piVar1[2] = iStack_80;
        piVar1[3] = iStack_7c;
        puVar19 = (undefined8 *)(lVar8 + lVar11 * 0x48);
        *puVar19 = uStack_98;
        puVar19[1] = uStack_90;
        *(int *)(lVar8 + 0x20 + lVar11 * 0x48) = iVar16;
        *(int *)(lVar8 + 0x24 + lVar11 * 0x48) = iVar10;
        puVar19 = (undefined8 *)(lVar8 + 0x28 + lVar11 * 0x48);
        *puVar19 = 0;
        puVar19[1] = 0;
        puVar19 = (undefined8 *)(lVar8 + 0x38 + lVar11 * 0x48);
        *puVar19 = 0;
        puVar19[1] = 0;
        iVar6 = *param_1 + 1;
        *param_1 = iVar6;
      }
    }
    piVar1 = (int *)(*(longlong *)(param_1 + 2) + -0x20 + (longlong)iVar6 * 0x48);
    *piVar1 = *piVar1 + iVar17;
    uVar12 = (ulonglong)param_1[8];
    iVar16 = param_1[8] + param_3;
    iVar6 = param_1[9];
    if (iVar6 < iVar16) {
      if (iVar6 == 0) {
        iVar6 = 8;
      }
      else {
        iVar6 = iVar6 / 2 + iVar6;
      }
      if (iVar6 <= iVar16) {
        iVar6 = iVar16;
      }
      iStack_ac = iVar17;
      uStack_a8 = uVar12;
      lVar8 = FUN_7ff70c802100((longlong)iVar6 * 0x14);
      if (*(longlong *)(param_1 + 10) != 0) {
        FUN_7ff70cb12b60(lVar8,*(longlong *)(param_1 + 10),(longlong)param_1[8] * 0x14);
        FUN_7ff70c802510(*(undefined8 *)(param_1 + 10));
      }
      *(longlong *)(param_1 + 10) = lVar8;
      param_1[9] = iVar6;
      uVar12 = uStack_a8;
      iVar17 = iStack_ac;
    }
    else {
      lVar8 = *(longlong *)(param_1 + 10);
    }
    param_1[8] = iVar16;
    *(ulonglong *)(param_1 + 0x10) = lVar8 + uVar12 * 0x14;
    iVar6 = param_1[4];
    iVar17 = iVar17 + iVar6;
    iVar16 = param_1[5];
    if (iVar16 < iVar17) {
      if (iVar16 == 0) {
        iVar16 = 8;
      }
      else {
        iVar16 = iVar16 / 2 + iVar16;
      }
      if (iVar16 <= iVar17) {
        iVar16 = iVar17;
      }
      iStack_ac = iVar17;
      lVar8 = FUN_7ff70c802100((longlong)iVar16 * 2);
      if (*(longlong *)(param_1 + 6) != 0) {
        FUN_7ff70cb12b60(lVar8,*(longlong *)(param_1 + 6),(longlong)param_1[4] * 2);
        FUN_7ff70c802510(*(undefined8 *)(param_1 + 6));
      }
      *(longlong *)(param_1 + 6) = lVar8;
      param_1[5] = iVar16;
      iVar17 = iStack_ac;
    }
    else {
      lVar8 = *(longlong *)(param_1 + 6);
    }
    param_1[4] = iVar17;
    *(longlong *)(param_1 + 0x12) = lVar8 + (longlong)iVar6 * 2;
    puVar19 = *(undefined8 **)(param_1 + 0x10);
    lVar8 = 0;
    do {
      *puVar19 = *(undefined8 *)(param_2 + lVar8);
      *(undefined8 *)(*(longlong *)(param_1 + 0x10) + 8) = uVar3;
      *(uint *)(*(longlong *)(param_1 + 0x10) + 0x10) = param_4;
      lVar11 = *(longlong *)(param_1 + 0x10);
      *(longlong *)(param_1 + 0x10) = lVar11 + 0x14;
      *(undefined8 *)(lVar11 + 0x14) = *(undefined8 *)(param_2 + 8 + lVar8);
      *(undefined8 *)(*(longlong *)(param_1 + 0x10) + 8) = uVar3;
      *(uint *)(*(longlong *)(param_1 + 0x10) + 0x10) = param_4;
      puVar19 = (undefined8 *)(*(longlong *)(param_1 + 0x10) + 0x14);
      *(undefined8 **)(param_1 + 0x10) = puVar19;
      lVar8 = lVar8 + 0x10;
    } while ((ulonglong)(param_3 >> 1 & 0x3fffffff) << 4 != lVar8);
    if ((param_3 & 1) != 0) {
      *puVar19 = *(undefined8 *)(param_2 + lVar8);
      *(undefined8 *)(*(longlong *)(param_1 + 0x10) + 8) = uVar3;
      *(uint *)(*(longlong *)(param_1 + 0x10) + 0x10) = param_4;
      *(longlong *)(param_1 + 0x10) = *(longlong *)(param_1 + 0x10) + 0x14;
    }
    puVar14 = *(undefined2 **)(param_1 + 0x12);
    uVar7 = 2;
    sVar23 = 1;
    do {
      *puVar14 = (short)param_1[0xd];
      *(short *)(*(longlong *)(param_1 + 0x12) + 2) = sVar23 + (short)param_1[0xd];
      *(short *)(*(longlong *)(param_1 + 0x12) + 4) = (short)param_1[0xd] + (short)uVar7;
      puVar14 = (undefined2 *)(*(longlong *)(param_1 + 0x12) + 6);
      *(undefined2 **)(param_1 + 0x12) = puVar14;
      uVar7 = uVar7 + 1;
      sVar23 = sVar23 + 1;
    } while (param_3 != uVar7);
    param_1[0xd] = param_1[0xd] + (param_3 & 0xffff);
    goto LAB_7ff70c7ba855;
  }
  fVar34 = (float)param_1[0x34];
  iVar17 = param_3 * 9 + -6;
  uVar18 = param_3 * 2;
  uStack_a8 = (ulonglong)uVar18;
  iVar6 = *param_1;
  if (((uVar7 & 8) != 0) && (0xffff < param_1[0xd] + uVar18)) {
    lVar11 = (longlong)iVar6;
    iVar16 = param_1[8];
    param_1[0x20] = iVar16;
    param_1[0xd] = 0;
    lVar8 = *(longlong *)(param_1 + 2);
    if (*(int *)(lVar8 + -0x20 + lVar11 * 0x48) == 0) {
      *(int *)(lVar8 + lVar11 * 0x48 + -0x28) = iVar16;
      iVar6 = *param_1;
    }
    else {
      uStack_98 = *(undefined8 *)(param_1 + 0x18);
      uStack_90 = *(undefined8 *)(param_1 + 0x1a);
      iStack_88 = param_1[0x1c];
      iStack_84 = param_1[0x1d];
      iStack_80 = param_1[0x1e];
      iStack_7c = param_1[0x1f];
      iVar10 = param_1[4];
      if (iVar6 == param_1[1]) {
        lStack_a0 = CONCAT44(lStack_a0._4_4_,param_1[4]);
        if (iVar6 == 0) {
          iVar10 = 8;
        }
        else {
          iVar10 = iVar6 / 2 + iVar6;
        }
        iVar15 = iVar6 + 1;
        if (iVar6 + 1 < iVar10) {
          iVar15 = iVar10;
        }
        iStack_ac = iVar17;
        lVar8 = FUN_7ff70c802100((longlong)iVar15 * 0x48);
        if (*(longlong *)(param_1 + 2) != 0) {
          FUN_7ff70cb12b60(lVar8,*(longlong *)(param_1 + 2),(longlong)*param_1 * 0x48);
          FUN_7ff70c802510(*(undefined8 *)(param_1 + 2));
        }
        *(longlong *)(param_1 + 2) = lVar8;
        param_1[1] = iVar15;
        lVar11 = (longlong)*param_1;
        iVar17 = iStack_ac;
        iVar10 = (int)lStack_a0;
      }
      uVar18 = (uint)uStack_a8;
      piVar1 = (int *)(lVar8 + 0x10 + lVar11 * 0x48);
      *piVar1 = iStack_88;
      piVar1[1] = iStack_84;
      piVar1[2] = iStack_80;
      piVar1[3] = iStack_7c;
      puVar19 = (undefined8 *)(lVar8 + lVar11 * 0x48);
      *puVar19 = uStack_98;
      puVar19[1] = uStack_90;
      *(int *)(lVar8 + 0x20 + lVar11 * 0x48) = iVar16;
      *(int *)(lVar8 + 0x24 + lVar11 * 0x48) = iVar10;
      puVar19 = (undefined8 *)(lVar8 + 0x28 + lVar11 * 0x48);
      *puVar19 = 0;
      puVar19[1] = 0;
      puVar19 = (undefined8 *)(lVar8 + 0x38 + lVar11 * 0x48);
      *puVar19 = 0;
      puVar19[1] = 0;
      iVar6 = *param_1 + 1;
      *param_1 = iVar6;
    }
  }
  piVar1 = (int *)(*(longlong *)(param_1 + 2) + -0x20 + (longlong)iVar6 * 0x48);
  *piVar1 = *piVar1 + iVar17;
  lVar8 = (longlong)param_1[8];
  iVar16 = param_1[8] + uVar18;
  iVar6 = param_1[9];
  if (iVar6 < iVar16) {
    if (iVar6 == 0) {
      iVar6 = 8;
    }
    else {
      iVar6 = iVar6 / 2 + iVar6;
    }
    if (iVar6 <= iVar16) {
      iVar6 = iVar16;
    }
    iStack_ac = iVar17;
    lStack_a0 = lVar8;
    lVar11 = FUN_7ff70c802100((longlong)iVar6 * 0x14);
    if (*(longlong *)(param_1 + 10) != 0) {
      FUN_7ff70cb12b60(lVar11);
      FUN_7ff70c802510(*(undefined8 *)(param_1 + 10));
    }
    *(longlong *)(param_1 + 10) = lVar11;
    param_1[9] = iVar6;
    lVar8 = lStack_a0;
    iVar17 = iStack_ac;
  }
  else {
    lVar11 = *(longlong *)(param_1 + 10);
  }
  param_1[8] = iVar16;
  *(longlong *)(param_1 + 0x10) = lVar11 + lVar8 * 0x14;
  iVar6 = param_1[4];
  iVar17 = iVar17 + iVar6;
  iVar16 = param_1[5];
  if (iVar16 < iVar17) {
    if (iVar16 == 0) {
      iVar16 = 8;
    }
    else {
      iVar16 = iVar16 / 2 + iVar16;
    }
    if (iVar16 <= iVar17) {
      iVar16 = iVar17;
    }
    iStack_ac = iVar17;
    lVar8 = FUN_7ff70c802100((longlong)iVar16 * 2);
    if (*(longlong *)(param_1 + 6) != 0) {
      FUN_7ff70cb12b60(lVar8);
      FUN_7ff70c802510(*(undefined8 *)(param_1 + 6));
    }
    *(longlong *)(param_1 + 6) = lVar8;
    param_1[5] = iVar16;
    iVar17 = iStack_ac;
  }
  else {
    lVar8 = *(longlong *)(param_1 + 6);
  }
  param_1[4] = iVar17;
  psVar13 = (short *)(lVar8 + (longlong)iVar6 * 2);
  *(short **)(param_1 + 0x12) = psVar13;
  iVar6 = param_1[0xd];
  uVar7 = 2;
  sVar23 = (short)iVar6;
  if (param_3 == 3) {
LAB_7ff70c7ba62e:
    *psVar13 = sVar23;
    *(short *)(*(longlong *)(param_1 + 0x12) + 2) = sVar23 + -2 + (short)uVar7 * 2;
    *(short *)(*(longlong *)(param_1 + 0x12) + 4) = sVar23 + (short)uVar7 * 2;
    *(longlong *)(param_1 + 0x12) = *(longlong *)(param_1 + 0x12) + 6;
  }
  else {
    uVar7 = 2;
    iVar17 = iVar6;
    do {
      iVar17 = iVar17 + 4;
      *psVar13 = sVar23;
      sVar21 = (short)iVar17;
      *(short *)(*(longlong *)(param_1 + 0x12) + 2) = sVar21 + -2;
      *(short *)(*(longlong *)(param_1 + 0x12) + 4) = sVar21;
      lVar8 = *(longlong *)(param_1 + 0x12);
      *(longlong *)(param_1 + 0x12) = lVar8 + 6;
      *(short *)(lVar8 + 6) = sVar23;
      *(short *)(*(longlong *)(param_1 + 0x12) + 2) = sVar21;
      *(short *)(*(longlong *)(param_1 + 0x12) + 4) = sVar21 + 2;
      psVar13 = (short *)(*(longlong *)(param_1 + 0x12) + 6);
      *(short **)(param_1 + 0x12) = psVar13;
      uVar7 = uVar7 + 2;
    } while ((param_3 & 0x7ffffffe) != uVar7);
    if ((param_3 & 1) != 0) goto LAB_7ff70c7ba62e;
  }
  lVar8 = *(longlong *)(param_1 + 0xe);
  if (*(int *)(lVar8 + 0x4c) < (int)param_3) {
    if (*(longlong *)(lVar8 + 0x50) != 0) {
      FUN_7ff70c802510();
    }
    uVar9 = FUN_7ff70c802100(uVar12 * 8);
    *(undefined8 *)(lVar8 + 0x50) = uVar9;
    *(uint *)(lVar8 + 0x4c) = param_3;
    lVar8 = *(longlong *)(param_1 + 0xe);
  }
  uVar7 = _DAT_7ff70cb1ba60;
  lVar8 = *(longlong *)(lVar8 + 0x50);
  iVar16 = param_3 - 1;
  uVar20 = 0;
  iVar17 = iVar16;
  do {
    lVar11 = (longlong)iVar17;
    uVar9 = *(undefined8 *)(param_2 + uVar20 * 8);
    uVar2 = *(undefined8 *)(param_2 + lVar11 * 8);
    fVar24 = (float)uVar9 - (float)uVar2;
    fVar25 = (float)((ulonglong)uVar9 >> 0x20) - (float)((ulonglong)uVar2 >> 0x20);
    fVar26 = 0.0;
    fVar27 = 0.0;
    fVar30 = fVar25 * fVar25;
    auVar28._0_4_ = fVar30 + fVar24 * fVar24;
    auVar28._4_4_ = fVar30 + fVar30;
    auVar28._8_8_ = 0;
    if (0.0 < auVar28._0_4_) {
      auVar28 = rsqrtss(auVar28,auVar28);
      fVar24 = fVar24 * auVar28._0_4_;
      fVar25 = fVar25 * auVar28._0_4_;
      fVar26 = auVar28._8_4_ * 0.0;
      fVar27 = auVar28._8_4_ * 0.0;
    }
    auVar5._4_4_ = fVar25;
    auVar5._0_4_ = fVar24;
    auVar5._8_4_ = fVar26;
    auVar5._12_4_ = fVar27;
    uVar9 = extractps(auVar5,1);
    *(undefined8 *)(lVar8 + lVar11 * 8) = uVar9;
    *(uint *)(lVar8 + 4 + lVar11 * 8) = (uint)fVar24 ^ uVar7;
    fVar30 = _DAT_7ff70cb1ba94;
    fVar27 = _DAT_7ff70cb1ba90;
    fVar26 = _UNK_7ff70cb1ba84;
    fVar25 = _DAT_7ff70cb1ba80;
    fVar24 = _DAT_7ff70cb1ba2c;
    iVar17 = (int)uVar20;
    uVar20 = uVar20 + 1;
  } while (uVar12 != uVar20);
  fVar34 = fVar34 * _DAT_7ff70cb1ba70;
  uVar20 = 0;
  do {
    uVar9 = *(undefined8 *)(lVar8 + (longlong)iVar16 * 8);
    uVar2 = *(undefined8 *)(lVar8 + uVar20 * 8);
    fVar29 = ((float)uVar2 + (float)uVar9) * fVar25;
    fVar31 = ((float)((ulonglong)uVar2 >> 0x20) + (float)((ulonglong)uVar9 >> 0x20)) * fVar26;
    fVar32 = fVar31 * fVar31 + fVar29 * fVar29;
    if (fVar27 < fVar32) {
      fVar32 = fVar24 / fVar32;
      fVar33 = fVar30;
      if (fVar32 <= fVar30) {
        fVar33 = fVar32;
      }
      fVar29 = fVar29 * fVar33;
      fVar31 = fVar31 * fVar33;
    }
    fVar29 = fVar34 * fVar29;
    fVar31 = fVar31 * fVar34;
    **(float **)(param_1 + 0x10) = *(float *)(param_2 + uVar20 * 8) - fVar29;
    *(float *)(*(longlong *)(param_1 + 0x10) + 4) = *(float *)(param_2 + 4 + uVar20 * 8) - fVar31;
    *(undefined8 *)(*(longlong *)(param_1 + 0x10) + 8) = uVar3;
    *(uint *)(*(longlong *)(param_1 + 0x10) + 0x10) = param_4;
    *(float *)(*(longlong *)(param_1 + 0x10) + 0x14) = fVar29 + *(float *)(param_2 + uVar20 * 8);
    *(float *)(*(longlong *)(param_1 + 0x10) + 0x18) = fVar31 + *(float *)(param_2 + 4 + uVar20 * 8)
    ;
    *(undefined8 *)(*(longlong *)(param_1 + 0x10) + 0x1c) = uVar3;
    *(uint *)(*(longlong *)(param_1 + 0x10) + 0x24) = param_4 & 0xffffff;
    *(longlong *)(param_1 + 0x10) = *(longlong *)(param_1 + 0x10) + 0x28;
    sVar21 = (short)iVar6;
    **(short **)(param_1 + 0x12) = sVar21;
    *(short *)(*(longlong *)(param_1 + 0x12) + 2) = sVar23 + (short)iVar16 * 2;
    sVar22 = sVar23 + 1 + (short)iVar16 * 2;
    *(short *)(*(longlong *)(param_1 + 0x12) + 4) = sVar22;
    *(short *)(*(longlong *)(param_1 + 0x12) + 6) = sVar22;
    *(short *)(*(longlong *)(param_1 + 0x12) + 8) = sVar21 + 1;
    *(short *)(*(longlong *)(param_1 + 0x12) + 10) = sVar21;
    *(longlong *)(param_1 + 0x12) = *(longlong *)(param_1 + 0x12) + 0xc;
    iVar16 = (int)uVar20;
    uVar20 = uVar20 + 1;
    iVar6 = iVar6 + 2;
  } while (uVar12 != uVar20);
  param_1[0xd] = param_1[0xd] + ((uint)uStack_a8 & 0xfffe);
LAB_7ff70c7ba855:
  if (_DAT_7ff70cbebd80 == (uStack_70 ^ (ulonglong)auStack_d8)) {
    return;
  }
  FUN_7ff70caa97e0(uStack_70 ^ (ulonglong)auStack_d8);
  pcVar4 = (code *)swi(3);
  (*pcVar4)();
  return;
}


