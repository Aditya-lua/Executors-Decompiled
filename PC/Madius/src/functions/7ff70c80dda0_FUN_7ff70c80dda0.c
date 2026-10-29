/* 7ff70c80dda0 FUN_7ff70c80dda0 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c80dda0(undefined8 param_1,undefined8 param_2,undefined4 param_3)

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
  undefined1 auVar12 [16];
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
  undefined1 auStack_e8 [32];
  undefined4 uStack_c8;
  undefined4 uStack_c0;
  float fStack_b8;
  undefined8 uStack_b0;
  undefined8 uStack_a8;
  undefined8 uStack_a0;
  undefined8 uStack_98;
  ulonglong uStack_90;
  
  auVar19 = _DAT_7ff70cb1d610;
  auVar18 = _DAT_7ff70cb1d5e0;
  fVar11 = _UNK_7ff70cb1d5dc;
  fVar10 = _UNK_7ff70cb1d5d8;
  fVar9 = _UNK_7ff70cb1d5d4;
  fVar8 = _DAT_7ff70cb1d5d0;
  auVar14 = _DAT_7ff70cb1b5a0;
  auVar22 = _DAT_7ff70cb1b2a0;
  uStack_90 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_e8;
  fVar1 = *(float *)(_DAT_7ff70cc1a3c0 + 0xc98);
  uStack_a0 = param_2;
  uStack_98 = param_1;
  if (0.0 < fVar1) {
    lVar2 = *(longlong *)(_DAT_7ff70cc1a3c0 + 0x1440);
    auVar12 = insertps(_DAT_7ff70cb1d610,*(undefined4 *)(_DAT_7ff70cc1a3c0 + 0xc4c),0x30);
    auVar13._0_4_ = auVar12._0_4_ * *(float *)(_DAT_7ff70cc1a3c0 + 0xdb4);
    auVar13._4_4_ = auVar12._4_4_ * *(float *)(_DAT_7ff70cc1a3c0 + 0xdb8);
    auVar13._8_4_ = auVar12._8_4_ * *(float *)(_DAT_7ff70cc1a3c0 + 0xdbc);
    auVar13._12_4_ = auVar12._12_4_ * *(float *)(_DAT_7ff70cc1a3c0 + 0xdc0);
    auVar15 = minps(_DAT_7ff70cb1b2a0,auVar13);
    auVar12._4_4_ = -(uint)(auVar13._4_4_ < 0.0);
    auVar12._0_4_ = -(uint)(auVar13._0_4_ < 0.0);
    auVar12._8_4_ = -(uint)(auVar13._8_4_ < 0.0);
    auVar12._12_4_ = -(uint)(auVar13._12_4_ < 0.0);
    fVar4 = (float)DAT_7ff70cb1b5a0;
    fVar5 = DAT_7ff70cb1b5a0._4_4_;
    fVar6 = DAT_7ff70cb1b5a0._8_4_;
    fVar7 = DAT_7ff70cb1b5a0._12_4_;
    auVar16._0_4_ = auVar15._0_4_ * _DAT_7ff70cb1d5d0 + fVar4;
    auVar16._4_4_ = auVar15._4_4_ * _UNK_7ff70cb1d5d4 + fVar5;
    auVar16._8_4_ = auVar15._8_4_ * _UNK_7ff70cb1d5d8 + fVar6;
    auVar16._12_4_ = auVar15._12_4_ * _UNK_7ff70cb1d5dc + fVar7;
    auVar12 = blendvps(auVar16,_DAT_7ff70cb1b5a0,auVar12);
    auVar15._0_4_ = (int)auVar12._0_4_;
    auVar15._4_4_ = (int)auVar12._4_4_;
    auVar15._8_4_ = (int)auVar12._8_4_;
    auVar15._12_4_ = (int)auVar12._12_4_;
    auVar12 = pmulld(auVar15,_DAT_7ff70cb1d5e0);
    auVar17._0_8_ = auVar12._8_8_;
    auVar17._8_4_ = auVar12._8_4_;
    auVar17._12_4_ = auVar12._12_4_;
    uStack_a8 = CONCAT44((float)((ulonglong)param_2 >> 0x20) + _UNK_7ff70cb1bb64,
                         (float)param_2 + _DAT_7ff70cb1bb60);
    uStack_b0 = CONCAT44((float)((ulonglong)param_1 >> 0x20) + _UNK_7ff70cb1bb64,
                         (float)param_1 + _DAT_7ff70cb1bb60);
    uStack_c0 = 0;
    uStack_c8 = param_3;
    fStack_b8 = fVar1;
    FUN_7ff70c7bd870(*(undefined8 *)(lVar2 + 0x2c8),&uStack_b0,&uStack_a8,
                     SUB164(auVar17 | auVar12,4) | SUB164(auVar17 | auVar12,0));
    auVar19 = insertps(auVar19,*(undefined4 *)(_DAT_7ff70cc1a3c0 + 0xc4c),0x30);
    auVar20._0_4_ = auVar19._0_4_ * *(float *)(_DAT_7ff70cc1a3c0 + 0xda4);
    auVar20._4_4_ = auVar19._4_4_ * *(float *)(_DAT_7ff70cc1a3c0 + 0xda8);
    auVar20._8_4_ = auVar19._8_4_ * *(float *)(_DAT_7ff70cc1a3c0 + 0xdac);
    auVar20._12_4_ = auVar19._12_4_ * *(float *)(_DAT_7ff70cc1a3c0 + 0xdb0);
    auVar19 = minps(auVar22,auVar20);
    auVar22._4_4_ = -(uint)(auVar20._4_4_ < 0.0);
    auVar22._0_4_ = -(uint)(auVar20._0_4_ < 0.0);
    auVar21._0_4_ = auVar19._0_4_ * fVar8 + fVar4;
    auVar21._4_4_ = auVar19._4_4_ * fVar9 + fVar5;
    auVar21._8_4_ = auVar19._8_4_ * fVar10 + fVar6;
    auVar21._12_4_ = auVar19._12_4_ * fVar11 + fVar7;
    auVar22._8_4_ = -(uint)(auVar20._8_4_ < 0.0);
    auVar22._12_4_ = -(uint)(auVar20._12_4_ < 0.0);
    auVar22 = blendvps(auVar21,auVar14,auVar22);
    auVar14._0_4_ = (int)auVar22._0_4_;
    auVar14._4_4_ = (int)auVar22._4_4_;
    auVar14._8_4_ = (int)auVar22._8_4_;
    auVar14._12_4_ = (int)auVar22._12_4_;
    auVar22 = pmulld(auVar14,auVar18);
    auVar18._0_8_ = auVar22._8_8_;
    auVar18._8_4_ = auVar22._8_4_;
    auVar18._12_4_ = auVar22._12_4_;
    uStack_c0 = 0;
    uStack_c8 = param_3;
    fStack_b8 = fVar1;
    FUN_7ff70c7bd870(*(undefined8 *)(lVar2 + 0x2c8),&uStack_98,&uStack_a0,
                     SUB164(auVar18 | auVar22,4) | SUB164(auVar18 | auVar22,0));
  }
  if (_DAT_7ff70cbebd80 == (uStack_90 ^ (ulonglong)auStack_e8)) {
    return;
  }
  FUN_7ff70caa97e0(uStack_90 ^ (ulonglong)auStack_e8);
  pcVar3 = (code *)swi(3);
  (*pcVar3)();
  return;
}


