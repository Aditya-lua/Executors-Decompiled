/* 7ff70c80dff0 FUN_7ff70c80dff0 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c80dff0(undefined1 (*param_1) [16],int param_2,uint param_3)

{
  undefined1 *puVar1;
  longlong lVar2;
  code *pcVar3;
  float fVar4;
  float fVar5;
  float fVar6;
  undefined8 uVar7;
  int iVar8;
  undefined1 auVar9 [16];
  undefined1 auVar10 [16];
  undefined1 auVar11 [16];
  undefined1 auVar12 [16];
  undefined1 auVar13 [16];
  undefined1 auVar14 [16];
  undefined1 auVar15 [16];
  undefined1 auVar16 [16];
  float fVar19;
  float fVar20;
  undefined1 auVar17 [16];
  undefined1 auVar18 [16];
  float fVar21;
  float fVar25;
  float fVar26;
  undefined1 auVar22 [16];
  undefined1 auVar23 [16];
  undefined1 auVar24 [16];
  undefined1 auStack_88 [32];
  undefined4 uStack_68;
  undefined4 uStack_60;
  undefined4 uStack_58;
  undefined1 auStack_48 [8];
  float fStack_40;
  float fStack_3c;
  ulonglong uStack_30;
  
  uStack_30 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_88;
  if ((((param_2 == *(int *)(_DAT_7ff70cc1a3c0 + 0x1f94)) &&
       (((param_3 & 4) != 0 || (*(char *)(_DAT_7ff70cc1a3c0 + 0x1f90) != '\0')))) &&
      ((param_2 != *(int *)(_DAT_7ff70cc1a3c0 + 0x1e20) ||
       ((*(byte *)(_DAT_7ff70cc1a3c0 + 0x1e24) & 2) == 0)))) &&
     (lVar2 = *(longlong *)(_DAT_7ff70cc1a3c0 + 0x1440), *(char *)(lVar2 + 0x179) == '\0')) {
    uStack_68 = 0;
    if ((param_3 & 8) == 0) {
      uStack_68 = *(undefined4 *)(_DAT_7ff70cc1a3c0 + 0xc94);
    }
    puVar1 = auStack_48 + 8;
    fVar21 = (float)*(undefined8 *)*param_1;
    fVar25 = (float)((ulonglong)*(undefined8 *)*param_1 >> 0x20);
    fVar26 = (float)*(undefined8 *)(*param_1 + 8);
    fVar4 = (float)((ulonglong)*(undefined8 *)(*param_1 + 8) >> 0x20);
    auVar10 = *(undefined1 (*) [16])(lVar2 + 0x260);
    fVar5 = auVar10._0_4_;
    fVar6 = auVar10._12_4_;
    fVar19 = auVar10._4_4_;
    fVar20 = auVar10._8_4_;
    auVar22._4_4_ = -(uint)(fVar19 <= fVar25);
    auVar22._0_4_ = -(uint)(fVar5 <= fVar21);
    auVar22._8_4_ = -(uint)(fVar20 <= fVar26);
    auVar22._12_4_ = -(uint)(fVar6 <= fVar4);
    auVar9._4_4_ = -(uint)(fVar25 < fVar19);
    auVar9._0_4_ = -(uint)(fVar21 < fVar5);
    auVar9._8_4_ = -(uint)(fVar26 < fVar20);
    auVar9._12_4_ = -(uint)(fVar4 < fVar6);
    auVar9 = blendps(auVar9,auVar22,3);
    _auStack_48 = blendvps(auVar10,*param_1,auVar9);
    if ((param_3 & 2) == 0) {
      fVar21 = auStack_48._0_4_ + _DAT_7ff70cb1d660;
      fVar25 = auStack_48._4_4_ + _UNK_7ff70cb1d664;
      fVar26 = auStack_48._8_4_ + _UNK_7ff70cb1d668;
      fStack_3c = auStack_48._12_4_ + _UNK_7ff70cb1d66c;
      auStack_48._4_4_ = fVar25;
      auStack_48._0_4_ = fVar21;
      fStack_40 = fVar26;
      auVar10._4_4_ = -(uint)(fStack_3c <= fVar6);
      auVar10._0_4_ = -(uint)(fVar26 <= fVar20);
      auVar10._8_4_ = -(uint)(fVar5 <= fVar21);
      auVar10._12_4_ = -(uint)(fVar19 <= fVar25);
      iVar8 = movmskps(param_3,auVar10);
      uVar7 = *(undefined8 *)(lVar2 + 0x2c8);
      if (iVar8 != 0xf) {
        FUN_7ff70c7b7c50(uVar7,auStack_48,puVar1,0);
        auVar10 = insertps(_DAT_7ff70cb1d610,*(undefined4 *)(_DAT_7ff70cc1a3c0 + 0xc4c),0x30);
        auVar11._0_4_ = auVar10._0_4_ * *(float *)(_DAT_7ff70cc1a3c0 + 0x10b4);
        auVar11._4_4_ = auVar10._4_4_ * *(float *)(_DAT_7ff70cc1a3c0 + 0x10b8);
        auVar11._8_4_ = auVar10._8_4_ * *(float *)(_DAT_7ff70cc1a3c0 + 0x10bc);
        auVar11._12_4_ = auVar10._12_4_ * *(float *)(_DAT_7ff70cc1a3c0 + 0x10c0);
        auVar10 = minps(_DAT_7ff70cb1b2a0,auVar11);
        auVar12._4_4_ = -(uint)(auVar11._4_4_ < 0.0);
        auVar12._0_4_ = -(uint)(auVar11._0_4_ < 0.0);
        auVar12._8_4_ = -(uint)(auVar11._8_4_ < 0.0);
        auVar12._12_4_ = -(uint)(auVar11._12_4_ < 0.0);
        auVar23._0_4_ = auVar10._0_4_ * _DAT_7ff70cb1d5d0 + (float)DAT_7ff70cb1b5a0;
        auVar23._4_4_ = auVar10._4_4_ * _UNK_7ff70cb1d5d4 + DAT_7ff70cb1b5a0._4_4_;
        auVar23._8_4_ = auVar10._8_4_ * _UNK_7ff70cb1d5d8 + DAT_7ff70cb1b5a0._8_4_;
        auVar23._12_4_ = auVar10._12_4_ * _UNK_7ff70cb1d5dc + DAT_7ff70cb1b5a0._12_4_;
        auVar10 = blendvps(auVar23,_DAT_7ff70cb1b5a0,auVar12);
        auVar13._0_4_ = (int)auVar10._0_4_;
        auVar13._4_4_ = (int)auVar10._4_4_;
        auVar13._8_4_ = (int)auVar10._8_4_;
        auVar13._12_4_ = (int)auVar10._12_4_;
        auVar10 = pmulld(auVar13,_DAT_7ff70cb1d5e0);
        auVar17._0_8_ = auVar10._8_8_;
        auVar17._8_4_ = auVar10._8_4_;
        auVar17._12_4_ = auVar10._12_4_;
        uStack_58 = 0x40000000;
        uStack_60 = 0;
        FUN_7ff70c7bd870(*(undefined8 *)(lVar2 + 0x2c8),auStack_48,puVar1,
                         SUB164(auVar17 | auVar10,4) | SUB164(auVar17 | auVar10,0));
        FUN_7ff70c7b8130(*(undefined8 *)(lVar2 + 0x2c8));
        goto LAB_7ff70c80e225;
      }
    }
    else {
      uVar7 = *(undefined8 *)(lVar2 + 0x2c8);
    }
    auVar10 = insertps(_DAT_7ff70cb1d610,*(undefined4 *)(_DAT_7ff70cc1a3c0 + 0xc4c),0x30);
    auVar14._0_4_ = auVar10._0_4_ * *(float *)(_DAT_7ff70cc1a3c0 + 0x10b4);
    auVar14._4_4_ = auVar10._4_4_ * *(float *)(_DAT_7ff70cc1a3c0 + 0x10b8);
    auVar14._8_4_ = auVar10._8_4_ * *(float *)(_DAT_7ff70cc1a3c0 + 0x10bc);
    auVar14._12_4_ = auVar10._12_4_ * *(float *)(_DAT_7ff70cc1a3c0 + 0x10c0);
    auVar10 = minps(_DAT_7ff70cb1b2a0,auVar14);
    auVar15._4_4_ = -(uint)(auVar14._4_4_ < 0.0);
    auVar15._0_4_ = -(uint)(auVar14._0_4_ < 0.0);
    auVar15._8_4_ = -(uint)(auVar14._8_4_ < 0.0);
    auVar15._12_4_ = -(uint)(auVar14._12_4_ < 0.0);
    auVar24._0_4_ = auVar10._0_4_ * _DAT_7ff70cb1d5d0 + (float)DAT_7ff70cb1b5a0;
    auVar24._4_4_ = auVar10._4_4_ * _UNK_7ff70cb1d5d4 + DAT_7ff70cb1b5a0._4_4_;
    auVar24._8_4_ = auVar10._8_4_ * _UNK_7ff70cb1d5d8 + DAT_7ff70cb1b5a0._8_4_;
    auVar24._12_4_ = auVar10._12_4_ * _UNK_7ff70cb1d5dc + DAT_7ff70cb1b5a0._12_4_;
    auVar10 = blendvps(auVar24,_DAT_7ff70cb1b5a0,auVar15);
    auVar16._0_4_ = (int)auVar10._0_4_;
    auVar16._4_4_ = (int)auVar10._4_4_;
    auVar16._8_4_ = (int)auVar10._8_4_;
    auVar16._12_4_ = (int)auVar10._12_4_;
    auVar10 = pmulld(auVar16,_DAT_7ff70cb1d5e0);
    auVar18._0_8_ = auVar10._8_8_;
    auVar18._8_4_ = auVar10._8_4_;
    auVar18._12_4_ = auVar10._12_4_;
    uStack_58 = 0x40000000;
    uStack_60 = 0;
    FUN_7ff70c7bd870(uVar7,auStack_48,puVar1,
                     SUB164(auVar18 | auVar10,4) | SUB164(auVar18 | auVar10,0));
  }
LAB_7ff70c80e225:
  if (_DAT_7ff70cbebd80 == (uStack_30 ^ (ulonglong)auStack_88)) {
    return;
  }
  FUN_7ff70caa97e0(uStack_30 ^ (ulonglong)auStack_88);
  pcVar3 = (code *)swi(3);
  (*pcVar3)();
  return;
}


