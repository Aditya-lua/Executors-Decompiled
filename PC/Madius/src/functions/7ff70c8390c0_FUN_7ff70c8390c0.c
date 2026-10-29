/* 7ff70c8390c0 FUN_7ff70c8390c0 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c8390c0(undefined8 *param_1,longlong param_2,ulonglong param_3)

{
  float fVar1;
  undefined1 auVar2 [16];
  code *pcVar3;
  float fVar4;
  float fVar6;
  undefined1 auVar5 [16];
  undefined1 auVar7 [16];
  undefined1 auVar8 [16];
  float fVar9;
  float fVar10;
  undefined1 auVar11 [16];
  undefined1 auStack_78 [40];
  undefined8 uStack_50;
  undefined8 uStack_48;
  undefined8 uStack_40;
  undefined4 uStack_38;
  undefined4 uStack_34;
  ulonglong uStack_30;
  
  uStack_30 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_78;
  auVar5._8_8_ = 0;
  auVar5._0_8_ = param_3;
  if ((*(byte *)(_DAT_7ff70cc1a3c0 + 0x1e70) & 0x10) != 0) {
    fVar9 = *(float *)(_DAT_7ff70cc1a3c0 + 0x1eb4);
    fVar10 = *(float *)(_DAT_7ff70cc1a3c0 + 0x1eb8);
    fVar6 = (float)(param_3 >> 0x20);
    if ((fVar9 < 0.0) || (fVar1 = *(float *)(_DAT_7ff70cc1a3c0 + 0x1ebc), fVar1 < 0.0)) {
      auVar5 = ZEXT416(*(uint *)(param_2 + 0x38));
      if (0.0 <= fVar10) goto LAB_7ff70c839140;
LAB_7ff70c839173:
      auVar8 = ZEXT416(*(uint *)(param_2 + 0x3c));
      pcVar3 = *(code **)(_DAT_7ff70cc1a3c0 + 0x1ec8);
      if (pcVar3 != (code *)0x0) goto LAB_7ff70c839184;
LAB_7ff70c83916b:
      auVar7 = insertps(auVar5,auVar8,0x10);
    }
    else {
      fVar4 = (float)param_3;
      if (fVar4 <= fVar1) {
        fVar1 = fVar4;
      }
      auVar8._4_4_ = fVar6;
      auVar8._0_4_ = -(uint)(fVar4 < fVar9);
      auVar8._8_8_ = 0;
      auVar5 = blendvps(ZEXT416((uint)fVar1),ZEXT416((uint)fVar9),auVar8);
      if (fVar10 < 0.0) goto LAB_7ff70c839173;
LAB_7ff70c839140:
      fVar9 = *(float *)(_DAT_7ff70cc1a3c0 + 0x1ec0);
      if (fVar9 < 0.0) goto LAB_7ff70c839173;
      if (fVar6 <= fVar9) {
        fVar9 = fVar6;
      }
      auVar11._4_4_ = fVar6;
      auVar11._0_4_ = -(uint)(fVar6 < fVar10);
      auVar11._8_8_ = 0;
      auVar8 = blendvps(ZEXT416((uint)fVar9),ZEXT416((uint)fVar10),auVar11);
      pcVar3 = *(code **)(_DAT_7ff70cc1a3c0 + 0x1ec8);
      if (pcVar3 == (code *)0x0) goto LAB_7ff70c83916b;
LAB_7ff70c839184:
      uStack_50 = *(undefined8 *)(_DAT_7ff70cc1a3c0 + 0x1ed0);
      uStack_48 = *(undefined8 *)(param_2 + 0x28);
      uStack_40 = *(undefined8 *)(param_2 + 0x38);
      uStack_38 = auVar5._0_4_;
      uStack_34 = auVar8._0_4_;
      (*pcVar3)(&uStack_50);
      auVar7._4_4_ = uStack_34;
      auVar7._0_4_ = uStack_38;
      auVar7._8_8_ = 0;
    }
    auVar5._0_4_ = (float)(int)auVar7._0_4_;
    auVar5._4_4_ = (float)(int)auVar7._4_4_;
    auVar5._8_4_ = (float)(int)auVar7._8_4_;
    auVar5._12_4_ = (float)(int)auVar7._12_4_;
  }
  fVar9 = _DAT_7ff70cb1bae4;
  if ((*(uint *)(param_2 + 0x14) & 0x5000000) == 0x1000000) {
    fVar10 = _DAT_7ff70cb1bae4;
    if ((*(uint *)(param_2 + 0x18) & 4) != 0) {
      fVar10 = *(float *)(_DAT_7ff70cc1a3c0 + 0xc68);
    }
    auVar8 = ZEXT416((uint)fVar10);
    if ((*(uint *)(param_2 + 0x18) & 8) == 0) goto LAB_7ff70c839238;
  }
  else {
    if ((*(uint *)(param_2 + 0x14) & 0x40) != 0) {
      auVar8 = ZEXT416((uint)_DAT_7ff70cb1bae4);
      goto LAB_7ff70c839238;
    }
    auVar8 = ZEXT416(*(uint *)(_DAT_7ff70cc1a3c0 + 0xc68));
  }
  fVar9 = *(float *)(_DAT_7ff70cc1a3c0 + 0xc6c);
LAB_7ff70c839238:
  fVar10 = *(float *)(_DAT_7ff70cc1a3c0 + 0xc5c) + _DAT_7ff70cb1bae8;
  fVar10 = (float)(~-(uint)(fVar10 <= 0.0) & (uint)fVar10) +
           *(float *)(param_2 + 0x68) + *(float *)(param_2 + 0x6c);
  auVar11 = blendvps(ZEXT416((uint)fVar10),ZEXT416((uint)fVar9),ZEXT416(-(uint)(fVar10 <= fVar9)));
  auVar8 = insertps(auVar8,auVar11,0x10);
  auVar2._4_4_ = -(uint)(auVar8._4_4_ <= auVar5._4_4_);
  auVar2._0_4_ = -(uint)(auVar8._0_4_ <= auVar5._0_4_);
  auVar2._8_4_ = -(uint)(auVar8._8_4_ <= auVar5._8_4_);
  auVar2._12_4_ = -(uint)(auVar8._12_4_ <= auVar5._12_4_);
  auVar5 = blendvps(auVar8,auVar5,auVar2);
  *param_1 = auVar5._0_8_;
  if (_DAT_7ff70cbebd80 != (uStack_30 ^ (ulonglong)auStack_78)) {
    FUN_7ff70caa97e0(uStack_30 ^ (ulonglong)auStack_78);
    pcVar3 = (code *)swi(3);
    (*pcVar3)();
    return;
  }
  return;
}


