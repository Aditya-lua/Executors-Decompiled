/* 7ff70c80c6b0 FUN_7ff70c80c6b0 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c80c6b0(undefined8 param_1,char *param_2,char *param_3,char param_4)

{
  longlong lVar1;
  code *pcVar2;
  longlong lVar3;
  char *pcVar4;
  longlong lVar5;
  char *pcVar6;
  undefined1 auVar7 [16];
  undefined1 auVar8 [16];
  undefined1 auVar9 [16];
  undefined1 auVar10 [16];
  undefined1 auVar11 [16];
  undefined1 auStack_78 [32];
  uint uStack_58;
  char *pcStack_50;
  char *pcStack_48;
  undefined4 uStack_40;
  undefined8 uStack_38;
  undefined8 uStack_30;
  ulonglong uStack_28;
  
  lVar3 = _DAT_7ff70cc1a3c0;
  uStack_28 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_78;
  lVar1 = *(longlong *)(_DAT_7ff70cc1a3c0 + 0x1440);
  uStack_30 = param_1;
  if (param_4 == '\0') {
    if (param_3 == (char *)0x0) {
      lVar5 = FUN_7ff70cb12e80(param_2);
      param_3 = param_2 + lVar5;
    }
  }
  else {
    pcVar4 = (char *)(-(ulonglong)(param_3 == (char *)0x0) | (ulonglong)param_3);
    pcVar6 = param_2;
    if (pcVar4 <= param_2) goto LAB_7ff70c80c7f7;
    do {
      param_3 = pcVar6;
      if (*pcVar6 == '#') {
        if (pcVar6[1] == '#') break;
      }
      else if (*pcVar6 == '\0') break;
      pcVar6 = pcVar6 + 1;
      param_3 = pcVar4;
    } while (pcVar6 != pcVar4);
  }
  if (param_2 != param_3) {
    auVar7 = insertps(_DAT_7ff70cb1d610,*(undefined4 *)(lVar3 + 0xc4c),0x30);
    auVar8._0_4_ = auVar7._0_4_ * *(float *)(lVar3 + 0xd54);
    auVar8._4_4_ = auVar7._4_4_ * *(float *)(lVar3 + 0xd58);
    auVar8._8_4_ = auVar7._8_4_ * *(float *)(lVar3 + 0xd5c);
    auVar8._12_4_ = auVar7._12_4_ * *(float *)(lVar3 + 0xd60);
    auVar10 = minps(_DAT_7ff70cb1b2a0,auVar8);
    auVar7._4_4_ = -(uint)(auVar8._4_4_ < 0.0);
    auVar7._0_4_ = -(uint)(auVar8._0_4_ < 0.0);
    auVar7._8_4_ = -(uint)(auVar8._8_4_ < 0.0);
    auVar7._12_4_ = -(uint)(auVar8._12_4_ < 0.0);
    auVar11._0_4_ = auVar10._0_4_ * _DAT_7ff70cb1d5d0 + (float)DAT_7ff70cb1b5a0;
    auVar11._4_4_ = auVar10._4_4_ * _UNK_7ff70cb1d5d4 + DAT_7ff70cb1b5a0._4_4_;
    auVar11._8_4_ = auVar10._8_4_ * _UNK_7ff70cb1d5d8 + DAT_7ff70cb1b5a0._8_4_;
    auVar11._12_4_ = auVar10._12_4_ * _UNK_7ff70cb1d5dc + DAT_7ff70cb1b5a0._12_4_;
    auVar7 = blendvps(auVar11,_DAT_7ff70cb1b5a0,auVar7);
    auVar10._0_4_ = (int)auVar7._0_4_;
    auVar10._4_4_ = (int)auVar7._4_4_;
    auVar10._8_4_ = (int)auVar7._8_4_;
    auVar10._12_4_ = (int)auVar7._12_4_;
    auVar7 = pmulld(auVar10,_DAT_7ff70cb1d5e0);
    auVar9._0_8_ = auVar7._8_8_;
    auVar9._8_4_ = auVar7._8_4_;
    auVar9._12_4_ = auVar7._12_4_;
    uStack_58 = SUB164(auVar9 | auVar7,4) | SUB164(auVar9 | auVar7,0);
    uStack_38 = 0;
    uStack_40 = 0;
    pcStack_50 = param_2;
    pcStack_48 = param_3;
    FUN_7ff70c7c1190(*(undefined8 *)(lVar1 + 0x2c8),*(undefined8 *)(lVar3 + 0x1120));
    if (*(char *)(lVar3 + 0x2720) == '\x01') {
      FUN_7ff70c80c840(&uStack_30,param_2,param_3);
    }
  }
LAB_7ff70c80c7f7:
  if (_DAT_7ff70cbebd80 != (uStack_28 ^ (ulonglong)auStack_78)) {
    FUN_7ff70caa97e0(uStack_28 ^ (ulonglong)auStack_78);
    pcVar2 = (code *)swi(3);
    (*pcVar2)();
    return;
  }
  return;
}


