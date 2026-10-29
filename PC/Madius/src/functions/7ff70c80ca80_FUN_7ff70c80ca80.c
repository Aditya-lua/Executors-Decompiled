/* 7ff70c80ca80 FUN_7ff70c80ca80 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c80ca80(undefined8 param_1,longlong param_2,longlong param_3,undefined4 param_4)

{
  longlong lVar1;
  code *pcVar2;
  longlong lVar3;
  undefined1 auVar4 [16];
  undefined1 auVar5 [16];
  undefined1 auVar6 [16];
  undefined1 auVar7 [16];
  undefined1 auVar8 [16];
  undefined1 auStack_98 [32];
  uint uStack_78;
  longlong lStack_70;
  longlong lStack_68;
  undefined4 uStack_60;
  undefined8 uStack_58;
  undefined8 uStack_48;
  ulonglong uStack_40;
  
  lVar3 = _DAT_7ff70cc1a3c0;
  uStack_40 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_98;
  lVar1 = *(longlong *)(_DAT_7ff70cc1a3c0 + 0x1440);
  uStack_48 = param_1;
  if (param_3 == 0) {
    param_3 = FUN_7ff70cb12e80(param_2);
    param_3 = param_3 + param_2;
  }
  if (param_2 != param_3) {
    auVar4 = insertps(_DAT_7ff70cb1d610,*(undefined4 *)(lVar3 + 0xc4c),0x30);
    auVar5._0_4_ = auVar4._0_4_ * *(float *)(lVar3 + 0xd54);
    auVar5._4_4_ = auVar4._4_4_ * *(float *)(lVar3 + 0xd58);
    auVar5._8_4_ = auVar4._8_4_ * *(float *)(lVar3 + 0xd5c);
    auVar5._12_4_ = auVar4._12_4_ * *(float *)(lVar3 + 0xd60);
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
    auVar7._0_4_ = (int)auVar4._0_4_;
    auVar7._4_4_ = (int)auVar4._4_4_;
    auVar7._8_4_ = (int)auVar4._8_4_;
    auVar7._12_4_ = (int)auVar4._12_4_;
    auVar4 = pmulld(auVar7,_DAT_7ff70cb1d5e0);
    auVar6._0_8_ = auVar4._8_8_;
    auVar6._8_4_ = auVar4._8_4_;
    auVar6._12_4_ = auVar4._12_4_;
    uStack_78 = SUB164(auVar6 | auVar4,4) | SUB164(auVar6 | auVar4,0);
    uStack_58 = 0;
    lStack_70 = param_2;
    lStack_68 = param_3;
    uStack_60 = param_4;
    FUN_7ff70c7c1190(*(undefined8 *)(lVar1 + 0x2c8),*(undefined8 *)(lVar3 + 0x1120));
    if (*(char *)(lVar3 + 0x2720) == '\x01') {
      FUN_7ff70c80c840(&uStack_48,param_2,param_3);
    }
  }
  if (_DAT_7ff70cbebd80 == (uStack_40 ^ (ulonglong)auStack_98)) {
    return;
  }
  FUN_7ff70caa97e0(uStack_40 ^ (ulonglong)auStack_98);
  pcVar2 = (code *)swi(3);
  (*pcVar2)();
  return;
}


