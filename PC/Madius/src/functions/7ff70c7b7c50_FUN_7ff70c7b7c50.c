/* 7ff70c7b7c50 FUN_7ff70c7b7c50 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c7b7c50(int *param_1,ulonglong *param_2,ulonglong *param_3,char param_4)

{
  undefined1 (*pauVar1) [16];
  float *pfVar2;
  undefined8 *puVar3;
  ulonglong uVar4;
  ulonglong uVar5;
  ulonglong uVar6;
  code *pcVar7;
  undefined1 auVar8 [16];
  undefined1 auVar9 [16];
  undefined1 auVar10 [16];
  undefined1 auVar11 [16];
  undefined8 uVar12;
  uint uVar13;
  int iVar14;
  longlong lVar15;
  longlong lVar16;
  int iVar17;
  longlong lVar18;
  int iVar19;
  undefined1 (*pauVar20) [16];
  int iVar21;
  int iVar22;
  float fVar24;
  undefined1 auVar23 [16];
  float fVar25;
  float fVar30;
  undefined1 auVar27 [16];
  undefined1 auVar28 [16];
  undefined1 auVar29 [16];
  float fVar31;
  undefined1 auVar32 [16];
  undefined1 auStack_a8 [32];
  undefined8 uStack_88;
  undefined8 uStack_80;
  undefined8 uStack_78;
  undefined8 uStack_70;
  ulonglong uStack_60;
  undefined1 auVar26 [16];
  
  uStack_60 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_a8;
  uVar4 = *param_3;
  auVar32._8_8_ = 0;
  auVar32._0_8_ = uVar4;
  uVar5 = *param_2;
  fVar25 = (float)uVar5;
  fVar24 = (float)(uVar5 >> 0x20);
  fVar30 = 0.0;
  fVar31 = 0.0;
  if (param_4 != '\0') {
    uVar6 = *(ulonglong *)(param_1 + 0x1a);
    auVar29._8_8_ = 0;
    auVar29._0_8_ = uVar6;
    fVar24 = (float)(uVar6 >> 0x20);
    fVar30 = (float)(uVar4 >> 0x20);
    iVar21 = -(uint)((float)uVar6 < (float)uVar4);
    iVar22 = -(uint)(fVar24 < fVar30);
    auVar27._4_4_ = iVar22;
    auVar27._0_4_ = iVar21;
    auVar27._8_4_ = iVar22;
    auVar27._12_4_ = iVar22;
    auVar26._8_8_ = auVar27._8_8_;
    auVar26._4_4_ = iVar21;
    auVar26._0_4_ = iVar21;
    uVar13 = movmskpd((int)uStack_60,auVar26);
    fVar25 = (float)uVar6;
    if ((uVar13 & 1) == 0) {
      fVar25 = (float)uVar4;
      fVar24 = fVar30;
    }
    auVar28._8_8_ = 0;
    auVar28._0_8_ = *(ulonglong *)(param_1 + 0x18);
    if ((uVar13 & 2) == 0) {
      auVar8._4_4_ = fVar24;
      auVar8._0_4_ = fVar25;
      auVar8._8_8_ = 0;
      auVar32 = blendps(auVar32,auVar8,1);
    }
    else {
      auVar9._4_4_ = fVar24;
      auVar9._0_4_ = fVar25;
      auVar9._8_8_ = 0;
      auVar32 = blendps(auVar29,auVar9,1);
    }
    auVar10._8_8_ = 0;
    auVar10._0_8_ = uVar5;
    auVar29 = maxps(auVar28,auVar10);
    fVar25 = auVar29._0_4_;
    fVar24 = auVar29._4_4_;
    fVar30 = auVar29._8_4_;
    fVar31 = auVar29._12_4_;
  }
  auVar23._4_4_ = -(uint)(auVar32._4_4_ <= fVar24);
  auVar23._0_4_ = -(uint)(auVar32._0_4_ <= fVar25);
  auVar23._8_4_ = -(uint)(auVar32._8_4_ <= fVar30);
  auVar23._12_4_ = -(uint)(auVar32._12_4_ <= fVar31);
  auVar11._4_4_ = fVar24;
  auVar11._0_4_ = fVar25;
  auVar11._8_4_ = fVar30;
  auVar11._12_4_ = fVar31;
  auVar32 = blendvps(auVar32,auVar11,auVar23);
  iVar21 = param_1[0x28];
  if (iVar21 == param_1[0x29]) {
    if (iVar21 == 0) {
      iVar22 = 8;
    }
    else {
      iVar22 = iVar21 / 2 + iVar21;
    }
    iVar17 = iVar21 + 1;
    if (iVar21 + 1 < iVar22) {
      iVar17 = iVar22;
    }
    lVar15 = FUN_7ff70c802100((longlong)iVar17 << 4);
    if (*(longlong *)(param_1 + 0x2a) != 0) {
      FUN_7ff70cb12b60(lVar15,*(longlong *)(param_1 + 0x2a),(longlong)param_1[0x28] << 4);
      FUN_7ff70c802510(*(undefined8 *)(param_1 + 0x2a));
    }
    *(longlong *)(param_1 + 0x2a) = lVar15;
    param_1[0x29] = iVar17;
    iVar21 = param_1[0x28];
  }
  else {
    lVar15 = *(longlong *)(param_1 + 0x2a);
  }
  pfVar2 = (float *)(lVar15 + (longlong)iVar21 * 0x10);
  *pfVar2 = fVar25;
  pfVar2[1] = fVar24;
  pfVar2[2] = auVar32._0_4_;
  pfVar2[3] = auVar32._4_4_;
  param_1[0x28] = param_1[0x28] + 1;
  pauVar1 = (undefined1 (*) [16])(param_1 + 0x18);
  param_1[0x18] = (int)fVar25;
  param_1[0x19] = (int)fVar24;
  param_1[0x1a] = (int)auVar32._0_4_;
  param_1[0x1b] = (int)auVar32._4_4_;
  lVar16 = *(longlong *)(param_1 + 2);
  iVar21 = *param_1;
  lVar18 = (longlong)iVar21;
  lVar15 = lVar16 + lVar18 * 0x48;
  pauVar20 = (undefined1 (*) [16])(lVar15 + -0x48);
  if (*(int *)(lVar16 + -0x20 + lVar18 * 0x48) == 0) {
    if (1 < iVar21) {
      lVar16 = lVar16 + lVar18 * 0x48;
      iVar22 = FUN_7ff70cb12b50(pauVar1,lVar16 + -0x90,0x24);
      if (((iVar22 == 0) &&
          (*(int *)(lVar16 + -0x68) + *(int *)(lVar16 + -0x6c) == *(int *)(lVar16 + -0x24))) &&
         (*(longlong *)(lVar16 + -0x60) == 0)) {
        *param_1 = iVar21 + -1;
        goto LAB_7ff70c7b7e96;
      }
    }
  }
  else if (*pauVar1 != *pauVar20) {
    uStack_88 = *(undefined8 *)*pauVar1;
    uStack_80 = *(undefined8 *)(param_1 + 0x1a);
    uStack_78 = *(undefined8 *)(param_1 + 0x1c);
    uStack_70 = *(undefined8 *)(param_1 + 0x1e);
    iVar22 = param_1[4];
    iVar17 = param_1[0x20];
    if (iVar21 == param_1[1]) {
      if (iVar21 == 0) {
        iVar14 = 8;
      }
      else {
        iVar14 = iVar21 / 2 + iVar21;
      }
      iVar19 = iVar21 + 1;
      if (iVar21 + 1 < iVar14) {
        iVar19 = iVar14;
      }
      lVar16 = FUN_7ff70c802100((longlong)iVar19 * 0x48);
      if (*(longlong *)(param_1 + 2) != 0) {
        FUN_7ff70cb12b60(lVar16,*(longlong *)(param_1 + 2),(longlong)*param_1 * 0x48);
        FUN_7ff70c802510(*(undefined8 *)(param_1 + 2));
      }
      *(longlong *)(param_1 + 2) = lVar16;
      param_1[1] = iVar19;
      lVar18 = (longlong)*param_1;
    }
    puVar3 = (undefined8 *)(lVar16 + 0x10 + lVar18 * 0x48);
    *puVar3 = uStack_78;
    puVar3[1] = uStack_70;
    puVar3 = (undefined8 *)(lVar16 + lVar18 * 0x48);
    *puVar3 = uStack_88;
    puVar3[1] = uStack_80;
    *(int *)(lVar16 + 0x20 + lVar18 * 0x48) = iVar17;
    *(int *)(lVar16 + 0x24 + lVar18 * 0x48) = iVar22;
    puVar3 = (undefined8 *)(lVar16 + 0x28 + lVar18 * 0x48);
    *puVar3 = 0;
    puVar3[1] = 0;
    puVar3 = (undefined8 *)(lVar16 + 0x38 + lVar18 * 0x48);
    *puVar3 = 0;
    puVar3[1] = 0;
    *param_1 = *param_1 + 1;
    goto LAB_7ff70c7b7e96;
  }
  uVar12 = *(undefined8 *)(param_1 + 0x1a);
  *(undefined8 *)*pauVar20 = *(undefined8 *)*pauVar1;
  *(undefined8 *)(lVar15 + -0x40) = uVar12;
LAB_7ff70c7b7e96:
  if (_DAT_7ff70cbebd80 == (uStack_60 ^ (ulonglong)auStack_a8)) {
    return;
  }
  FUN_7ff70caa97e0(uStack_60 ^ (ulonglong)auStack_a8);
  pcVar7 = (code *)swi(3);
  (*pcVar7)();
  return;
}


