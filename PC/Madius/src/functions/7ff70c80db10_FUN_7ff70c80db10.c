/* 7ff70c80db10 FUN_7ff70c80db10 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c80db10(undefined8 param_1,undefined8 param_2,undefined4 param_3,char param_4,
                     undefined4 param_5)

{
  float fVar1;
  longlong lVar2;
  code *pcVar3;
  float fVar4;
  float fVar5;
  float fVar6;
  float fVar7;
  float fVar8;
  float fVar9;
  float fVar10;
  float fVar11;
  longlong lVar12;
  undefined1 auVar13 [16];
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
  undefined1 auStack_f8 [32];
  undefined4 uStack_d8;
  undefined4 uStack_d0;
  float fStack_c8;
  undefined8 uStack_c0;
  undefined8 uStack_b8;
  undefined8 uStack_b0;
  undefined8 uStack_a8;
  ulonglong uStack_a0;
  
  lVar12 = _DAT_7ff70cc1a3c0;
  uStack_a0 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_f8;
  lVar2 = *(longlong *)(_DAT_7ff70cc1a3c0 + 0x1440);
  uStack_d8 = param_5;
  uStack_d0 = 0;
  uStack_b0 = param_2;
  uStack_a8 = param_1;
  FUN_7ff70c7bd960(*(undefined8 *)(lVar2 + 0x2c8),&uStack_a8,&uStack_b0,param_3);
  auVar20 = _DAT_7ff70cb1d610;
  auVar19 = _DAT_7ff70cb1d5e0;
  fVar11 = _UNK_7ff70cb1d5dc;
  fVar10 = _UNK_7ff70cb1d5d8;
  fVar9 = _UNK_7ff70cb1d5d4;
  fVar8 = _DAT_7ff70cb1d5d0;
  auVar15 = _DAT_7ff70cb1b5a0;
  auVar23 = _DAT_7ff70cb1b2a0;
  if ((param_4 != '\0') && (fVar1 = *(float *)(lVar12 + 0xc98), 0.0 < fVar1)) {
    auVar13 = insertps(_DAT_7ff70cb1d610,*(undefined4 *)(_DAT_7ff70cc1a3c0 + 0xc4c),0x30);
    auVar14._0_4_ = auVar13._0_4_ * *(float *)(_DAT_7ff70cc1a3c0 + 0xdb4);
    auVar14._4_4_ = auVar13._4_4_ * *(float *)(_DAT_7ff70cc1a3c0 + 0xdb8);
    auVar14._8_4_ = auVar13._8_4_ * *(float *)(_DAT_7ff70cc1a3c0 + 0xdbc);
    auVar14._12_4_ = auVar13._12_4_ * *(float *)(_DAT_7ff70cc1a3c0 + 0xdc0);
    auVar16 = minps(_DAT_7ff70cb1b2a0,auVar14);
    auVar13._4_4_ = -(uint)(auVar14._4_4_ < 0.0);
    auVar13._0_4_ = -(uint)(auVar14._0_4_ < 0.0);
    auVar13._8_4_ = -(uint)(auVar14._8_4_ < 0.0);
    auVar13._12_4_ = -(uint)(auVar14._12_4_ < 0.0);
    fVar4 = (float)DAT_7ff70cb1b5a0;
    fVar5 = DAT_7ff70cb1b5a0._4_4_;
    fVar6 = DAT_7ff70cb1b5a0._8_4_;
    fVar7 = DAT_7ff70cb1b5a0._12_4_;
    auVar17._0_4_ = auVar16._0_4_ * _DAT_7ff70cb1d5d0 + fVar4;
    auVar17._4_4_ = auVar16._4_4_ * _UNK_7ff70cb1d5d4 + fVar5;
    auVar17._8_4_ = auVar16._8_4_ * _UNK_7ff70cb1d5d8 + fVar6;
    auVar17._12_4_ = auVar16._12_4_ * _UNK_7ff70cb1d5dc + fVar7;
    auVar13 = blendvps(auVar17,_DAT_7ff70cb1b5a0,auVar13);
    auVar16._0_4_ = (int)auVar13._0_4_;
    auVar16._4_4_ = (int)auVar13._4_4_;
    auVar16._8_4_ = (int)auVar13._8_4_;
    auVar16._12_4_ = (int)auVar13._12_4_;
    auVar13 = pmulld(auVar16,_DAT_7ff70cb1d5e0);
    auVar18._0_8_ = auVar13._8_8_;
    auVar18._8_4_ = auVar13._8_4_;
    auVar18._12_4_ = auVar13._12_4_;
    uStack_b8 = CONCAT44((float)((ulonglong)uStack_b0 >> 0x20) + _UNK_7ff70cb1bb64,
                         (float)uStack_b0 + _DAT_7ff70cb1bb60);
    uStack_c0 = CONCAT44((float)((ulonglong)uStack_a8 >> 0x20) + _UNK_7ff70cb1bb64,
                         (float)uStack_a8 + _DAT_7ff70cb1bb60);
    uStack_d8 = param_5;
    uStack_d0 = 0;
    fStack_c8 = fVar1;
    FUN_7ff70c7bd870(*(undefined8 *)(lVar2 + 0x2c8),&uStack_c0,&uStack_b8,
                     SUB164(auVar18 | auVar13,4) | SUB164(auVar18 | auVar13,0));
    auVar20 = insertps(auVar20,*(undefined4 *)(_DAT_7ff70cc1a3c0 + 0xc4c),0x30);
    auVar21._0_4_ = auVar20._0_4_ * *(float *)(_DAT_7ff70cc1a3c0 + 0xda4);
    auVar21._4_4_ = auVar20._4_4_ * *(float *)(_DAT_7ff70cc1a3c0 + 0xda8);
    auVar21._8_4_ = auVar20._8_4_ * *(float *)(_DAT_7ff70cc1a3c0 + 0xdac);
    auVar21._12_4_ = auVar20._12_4_ * *(float *)(_DAT_7ff70cc1a3c0 + 0xdb0);
    auVar20 = minps(auVar23,auVar21);
    auVar23._4_4_ = -(uint)(auVar21._4_4_ < 0.0);
    auVar23._0_4_ = -(uint)(auVar21._0_4_ < 0.0);
    auVar22._0_4_ = auVar20._0_4_ * fVar8 + fVar4;
    auVar22._4_4_ = auVar20._4_4_ * fVar9 + fVar5;
    auVar22._8_4_ = auVar20._8_4_ * fVar10 + fVar6;
    auVar22._12_4_ = auVar20._12_4_ * fVar11 + fVar7;
    auVar23._8_4_ = -(uint)(auVar21._8_4_ < 0.0);
    auVar23._12_4_ = -(uint)(auVar21._12_4_ < 0.0);
    auVar23 = blendvps(auVar22,auVar15,auVar23);
    auVar15._0_4_ = (int)auVar23._0_4_;
    auVar15._4_4_ = (int)auVar23._4_4_;
    auVar15._8_4_ = (int)auVar23._8_4_;
    auVar15._12_4_ = (int)auVar23._12_4_;
    auVar23 = pmulld(auVar15,auVar19);
    auVar19._0_8_ = auVar23._8_8_;
    auVar19._8_4_ = auVar23._8_4_;
    auVar19._12_4_ = auVar23._12_4_;
    uStack_d8 = param_5;
    uStack_d0 = 0;
    fStack_c8 = fVar1;
    FUN_7ff70c7bd870(*(undefined8 *)(lVar2 + 0x2c8),&uStack_a8,&uStack_b0,
                     SUB164(auVar19 | auVar23,4) | SUB164(auVar19 | auVar23,0));
  }
  if (_DAT_7ff70cbebd80 == (uStack_a0 ^ (ulonglong)auStack_f8)) {
    return;
  }
  FUN_7ff70caa97e0(uStack_a0 ^ (ulonglong)auStack_f8);
  pcVar3 = (code *)swi(3);
  (*pcVar3)();
  return;
}


