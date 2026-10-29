/* 7ff70c80a070 FUN_7ff70c80a070 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

ulonglong FUN_7ff70c80a070(int param_1)

{
  float *pfVar1;
  code *pcVar2;
  ulonglong uVar3;
  undefined1 auVar4 [16];
  undefined1 auVar5 [16];
  undefined1 auVar6 [16];
  undefined1 in_XMM1 [16];
  undefined1 auVar7 [16];
  undefined1 auVar8 [16];
  undefined1 auVar9 [16];
  undefined1 auStack_28 [32];
  ulonglong uStack_8;
  
  uStack_8 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_28;
  pfVar1 = (float *)(_DAT_7ff70cc1a3c0 + 0xd54 + (longlong)param_1 * 0x10);
  auVar7._4_12_ = in_XMM1._4_12_;
  auVar7._0_4_ = in_XMM1._0_4_ * *(float *)(_DAT_7ff70cc1a3c0 + 0xc4c);
  auVar4 = insertps(_DAT_7ff70cb1d610,auVar7,0x30);
  auVar5._0_4_ = auVar4._0_4_ * *pfVar1;
  auVar5._4_4_ = auVar4._4_4_ * pfVar1[1];
  auVar5._8_4_ = auVar4._8_4_ * pfVar1[2];
  auVar5._12_4_ = auVar4._12_4_ * pfVar1[3];
  auVar7 = minps(_DAT_7ff70cb1b2a0,auVar5);
  auVar4._4_4_ = -(uint)(auVar5._4_4_ < 0.0);
  auVar4._0_4_ = -(uint)(auVar5._0_4_ < 0.0);
  auVar4._8_4_ = -(uint)(auVar5._8_4_ < 0.0);
  auVar4._12_4_ = -(uint)(auVar5._12_4_ < 0.0);
  auVar8._0_4_ = auVar7._0_4_ * _DAT_7ff70cb1d5d0 + (float)DAT_7ff70cb1b5a0;
  auVar8._4_4_ = auVar7._4_4_ * _UNK_7ff70cb1d5d4 + DAT_7ff70cb1b5a0._4_4_;
  auVar8._8_4_ = auVar7._8_4_ * _UNK_7ff70cb1d5d8 + DAT_7ff70cb1b5a0._8_4_;
  auVar8._12_4_ = auVar7._12_4_ * _UNK_7ff70cb1d5dc + DAT_7ff70cb1b5a0._12_4_;
  auVar4 = blendvps(auVar8,_DAT_7ff70cb1b5a0,auVar4);
  if (_DAT_7ff70cbebd80 == (uStack_8 ^ (ulonglong)auStack_28)) {
    auVar6._0_4_ = (int)auVar4._0_4_;
    auVar6._4_4_ = (int)auVar4._4_4_;
    auVar6._8_4_ = (int)auVar4._8_4_;
    auVar6._12_4_ = (int)auVar4._12_4_;
    auVar4 = pmulld(auVar6,_DAT_7ff70cb1d5e0);
    auVar9._0_8_ = auVar4._8_8_;
    auVar9._8_4_ = auVar4._8_4_;
    auVar9._12_4_ = auVar4._12_4_;
    return (ulonglong)(SUB164(auVar9 | auVar4,4) | SUB164(auVar9 | auVar4,0));
  }
  FUN_7ff70caa97e0(uStack_8 ^ (ulonglong)auStack_28);
  pcVar2 = (code *)swi(3);
  uVar3 = (*pcVar2)();
  return uVar3;
}


