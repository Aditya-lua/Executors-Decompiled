/* 7ff70c80d060 FUN_7ff70c80d060 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c80d060(float *param_1,float *param_2,char *param_3,ulonglong param_4,
                     longlong *param_5,float *param_6,float *param_7)

{
  float fVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  bool bVar4;
  code *pcVar5;
  float *pfVar6;
  bool bVar7;
  longlong lVar8;
  char *pcVar9;
  float *pfVar10;
  char *pcVar11;
  char *pcVar12;
  float fVar13;
  undefined1 auVar14 [16];
  undefined1 auVar15 [16];
  undefined1 auVar16 [16];
  undefined1 auVar17 [16];
  undefined1 auVar18 [16];
  undefined1 auVar19 [16];
  undefined1 auVar20 [16];
  undefined1 auVar21 [16];
  undefined1 auVar22 [16];
  undefined1 auVar23 [16];
  float fVar24;
  float fVar25;
  undefined1 auStack_c8 [32];
  uint uStack_a8;
  char *pcStack_a0;
  char *pcStack_98;
  ulonglong uStack_90;
  undefined8 *puStack_88;
  undefined8 uStack_80;
  float fStack_78;
  float fStack_74;
  undefined8 uStack_70;
  undefined8 uStack_68;
  ulonglong uStack_60;
  
  lVar8 = _DAT_7ff70cc1a3c0;
  uStack_60 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_c8;
  pcVar9 = (char *)(-(ulonglong)(param_4 == 0) | param_4);
  pcVar12 = param_3;
  pcVar11 = param_3;
  if (param_3 < pcVar9) {
    do {
      pcVar12 = pcVar11;
      if (*pcVar11 == '#') {
        if (pcVar11[1] == '#') break;
      }
      else if (*pcVar11 == '\0') break;
      pcVar11 = pcVar11 + 1;
      pcVar12 = pcVar9;
    } while (pcVar11 != pcVar9);
  }
  if ((int)pcVar12 == (int)param_3) goto LAB_7ff70c80d40e;
  uVar2 = *(undefined8 *)(*(longlong *)(_DAT_7ff70cc1a3c0 + 0x1440) + 0x2c8);
  uVar3 = *(undefined8 *)param_1;
  fVar25 = (float)uVar3;
  uStack_68 = uVar3;
  if (param_5 == (longlong *)0x0) {
    if (param_3 == pcVar12) {
      uStack_70 = (ulonglong)*(uint *)(_DAT_7ff70cc1a3c0 + 0x1130) << 0x20;
      fVar24 = 0.0;
    }
    else {
      uStack_90 = 0;
      uStack_a8 = 0;
      pcStack_a0 = param_3;
      pcStack_98 = pcVar12;
      FUN_7ff70c7f97b0(*(undefined8 *)(_DAT_7ff70cc1a3c0 + 0x1120),&uStack_70);
      fVar24 = (float)(int)((float)uStack_70 + _DAT_7ff70cb1d650);
      uStack_70 = CONCAT44(uStack_70._4_4_,fVar24);
    }
  }
  else {
    uStack_70 = *param_5;
    fVar24 = (float)uStack_70;
  }
  fVar13 = (float)((ulonglong)uVar3 >> 0x20);
  pfVar10 = param_7 + 2;
  pfVar6 = param_7;
  if (param_7 == (float *)0x0) {
    pfVar10 = param_2;
    pfVar6 = param_1;
  }
  bVar4 = true;
  if (fVar24 + fVar25 < *pfVar10) {
    bVar4 = pfVar10[1] <= uStack_70._4_4_ + fVar13;
  }
  bVar7 = bVar4;
  if (param_7 == (float *)0x0) {
LAB_7ff70c80d2e1:
    fVar1 = *param_6;
    if (fVar1 <= 0.0) goto LAB_7ff70c80d216;
LAB_7ff70c80d2f5:
    fVar24 = fVar1 * ((*param_2 - fVar25) - fVar24) + fVar25;
    auVar14 = blendvps(ZEXT416((uint)fVar24),ZEXT416((uint)fVar25),
                       ZEXT416(-(uint)(fVar24 <= fVar25)));
    uStack_68 = CONCAT44(uStack_68._4_4_,auVar14._0_4_);
    fVar25 = param_6[1];
    if (0.0 < fVar25) goto LAB_7ff70c80d32b;
LAB_7ff70c80d225:
    if (bVar7) goto LAB_7ff70c80d22e;
LAB_7ff70c80d35e:
    auVar14 = insertps(_DAT_7ff70cb1d610,*(undefined4 *)(_DAT_7ff70cc1a3c0 + 0xc4c),0x30);
    auVar18._0_4_ = auVar14._0_4_ * *(float *)(_DAT_7ff70cc1a3c0 + 0xd54);
    auVar18._4_4_ = auVar14._4_4_ * *(float *)(_DAT_7ff70cc1a3c0 + 0xd58);
    auVar18._8_4_ = auVar14._8_4_ * *(float *)(_DAT_7ff70cc1a3c0 + 0xd5c);
    auVar18._12_4_ = auVar14._12_4_ * *(float *)(_DAT_7ff70cc1a3c0 + 0xd60);
    auVar22 = minps(_DAT_7ff70cb1b2a0,auVar18);
    auVar14._4_4_ = -(uint)(auVar18._4_4_ < 0.0);
    auVar14._0_4_ = -(uint)(auVar18._0_4_ < 0.0);
    auVar14._8_4_ = -(uint)(auVar18._8_4_ < 0.0);
    auVar14._12_4_ = -(uint)(auVar18._12_4_ < 0.0);
    auVar23._0_4_ = auVar22._0_4_ * _DAT_7ff70cb1d5d0 + (float)DAT_7ff70cb1b5a0;
    auVar23._4_4_ = auVar22._4_4_ * _UNK_7ff70cb1d5d4 + DAT_7ff70cb1b5a0._4_4_;
    auVar23._8_4_ = auVar22._8_4_ * _UNK_7ff70cb1d5d8 + DAT_7ff70cb1b5a0._8_4_;
    auVar23._12_4_ = auVar22._12_4_ * _UNK_7ff70cb1d5dc + DAT_7ff70cb1b5a0._12_4_;
    auVar14 = blendvps(auVar23,_DAT_7ff70cb1b5a0,auVar14);
    auVar22._0_4_ = (int)auVar14._0_4_;
    auVar22._4_4_ = (int)auVar14._4_4_;
    auVar22._8_4_ = (int)auVar14._8_4_;
    auVar22._12_4_ = (int)auVar14._12_4_;
    auVar14 = pmulld(auVar22,_DAT_7ff70cb1d5e0);
    auVar20._0_8_ = auVar14._8_8_;
    auVar20._8_4_ = auVar14._8_4_;
    auVar20._12_4_ = auVar14._12_4_;
    uStack_a8 = SUB164(auVar20 | auVar14,4) | SUB164(auVar20 | auVar14,0);
    puStack_88 = (undefined8 *)0x0;
  }
  else {
    bVar7 = true;
    if (*param_7 <= fVar25) {
      bVar7 = (bool)(bVar4 | fVar13 < param_7[1]);
      goto LAB_7ff70c80d2e1;
    }
    fVar1 = *param_6;
    if (0.0 < fVar1) goto LAB_7ff70c80d2f5;
LAB_7ff70c80d216:
    fVar25 = param_6[1];
    if (fVar25 <= 0.0) goto LAB_7ff70c80d225;
LAB_7ff70c80d32b:
    fVar25 = fVar25 * ((param_2[1] - fVar13) - uStack_70._4_4_) + fVar13;
    auVar14 = blendvps(ZEXT416((uint)fVar25),ZEXT416((uint)fVar13),
                       ZEXT416(-(uint)(fVar25 <= fVar13)));
    uStack_68 = CONCAT44(auVar14._0_4_,(undefined4)uStack_68);
    if (!bVar7) goto LAB_7ff70c80d35e;
LAB_7ff70c80d22e:
    fStack_74 = pfVar10[1];
    uStack_80 = *(undefined8 *)pfVar6;
    auVar14 = insertps(_DAT_7ff70cb1d610,*(undefined4 *)(_DAT_7ff70cc1a3c0 + 0xc4c),0x30);
    auVar15._0_4_ = auVar14._0_4_ * *(float *)(_DAT_7ff70cc1a3c0 + 0xd54);
    auVar15._4_4_ = auVar14._4_4_ * *(float *)(_DAT_7ff70cc1a3c0 + 0xd58);
    auVar15._8_4_ = auVar14._8_4_ * *(float *)(_DAT_7ff70cc1a3c0 + 0xd5c);
    auVar15._12_4_ = auVar14._12_4_ * *(float *)(_DAT_7ff70cc1a3c0 + 0xd60);
    auVar14 = minps(_DAT_7ff70cb1b2a0,auVar15);
    auVar16._4_4_ = -(uint)(auVar15._4_4_ < 0.0);
    auVar16._0_4_ = -(uint)(auVar15._0_4_ < 0.0);
    auVar16._8_4_ = -(uint)(auVar15._8_4_ < 0.0);
    auVar16._12_4_ = -(uint)(auVar15._12_4_ < 0.0);
    auVar21._0_4_ = auVar14._0_4_ * _DAT_7ff70cb1d5d0 + (float)DAT_7ff70cb1b5a0;
    auVar21._4_4_ = auVar14._4_4_ * _UNK_7ff70cb1d5d4 + DAT_7ff70cb1b5a0._4_4_;
    auVar21._8_4_ = auVar14._8_4_ * _UNK_7ff70cb1d5d8 + DAT_7ff70cb1b5a0._8_4_;
    auVar21._12_4_ = auVar14._12_4_ * _UNK_7ff70cb1d5dc + DAT_7ff70cb1b5a0._12_4_;
    auVar14 = blendvps(auVar21,_DAT_7ff70cb1b5a0,auVar16);
    auVar17._0_4_ = (int)auVar14._0_4_;
    auVar17._4_4_ = (int)auVar14._4_4_;
    auVar17._8_4_ = (int)auVar14._8_4_;
    auVar17._12_4_ = (int)auVar14._12_4_;
    auVar14 = pmulld(auVar17,_DAT_7ff70cb1d5e0);
    auVar19._0_8_ = auVar14._8_8_;
    auVar19._8_4_ = auVar14._8_4_;
    auVar19._12_4_ = auVar14._12_4_;
    uStack_a8 = SUB164(auVar19 | auVar14,4) | SUB164(auVar19 | auVar14,0);
    puStack_88 = &uStack_80;
    fStack_78 = *pfVar10;
  }
  uStack_90 = uStack_90 & 0xffffffff00000000;
  pcStack_a0 = param_3;
  pcStack_98 = pcVar12;
  FUN_7ff70c7c1190(uVar2,0,pfVar6,&uStack_68);
  if (*(char *)(lVar8 + 0x2720) == '\x01') {
    FUN_7ff70c80c840(param_1,param_3,pcVar12);
  }
LAB_7ff70c80d40e:
  if (_DAT_7ff70cbebd80 == (uStack_60 ^ (ulonglong)auStack_c8)) {
    return;
  }
  FUN_7ff70caa97e0(uStack_60 ^ (ulonglong)auStack_c8);
  pcVar5 = (code *)swi(3);
  (*pcVar5)();
  return;
}


