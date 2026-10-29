/* 7ff70c7d8260 FUN_7ff70c7d8260 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c7d8260(undefined8 param_1,undefined8 param_2,undefined4 param_3,undefined8 param_4,
                     longlong param_5,longlong param_6)

{
  code *pcVar1;
  undefined1 auVar2 [12];
  undefined1 auVar4 [16];
  undefined4 in_XMM3_Dc;
  undefined4 in_XMM3_Dd;
  undefined1 auStack_f8 [32];
  undefined8 uStack_d8;
  undefined8 uStack_d0;
  undefined8 uStack_c8;
  undefined8 uStack_c0;
  undefined8 uStack_b8;
  undefined8 uStack_b0;
  undefined4 uStack_a8;
  undefined4 uStack_a4;
  undefined8 uStack_a0;
  longlong lStack_98;
  undefined8 uStack_90;
  undefined8 uStack_88;
  undefined8 uStack_80;
  undefined8 uStack_78;
  undefined4 uStack_70;
  undefined4 uStack_6c;
  undefined4 uStack_68;
  undefined4 uStack_64;
  undefined8 uStack_60;
  undefined8 uStack_58;
  undefined8 uStack_50;
  ulonglong uStack_40;
  undefined1 auVar3 [16];
  
  uStack_40 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_f8;
  if (param_5 == 0) {
    uStack_a0 = 0;
    uStack_88 = 0;
    uStack_64 = 0;
    uStack_60 = 0;
    uStack_78 = 0;
    uStack_70 = 0;
    uStack_58 = 0;
    uStack_50 = 0;
    lStack_98 = 0;
    uStack_90 = 0;
    uStack_b8 = 0;
    uStack_c8 = 0;
    uStack_c0 = 0;
    uStack_d8 = 0;
    uStack_d0 = 0;
    uStack_a4 = 1;
    uStack_80 = 0x7f7fffff00000000;
    uStack_6c = (undefined4)_DAT_7ff70cb1bb60;
    uStack_68 = (undefined4)((ulonglong)_DAT_7ff70cb1bb60 >> 0x20);
    auVar2 = ZEXT812(0);
  }
  else {
    FUN_7ff70cb12b60(&uStack_d8,param_5,0x90);
    auVar2._4_8_ = 0;
    auVar2._0_4_ = uStack_a0._4_4_;
  }
  auVar3._12_4_ = 0;
  auVar3._0_12_ = auVar2;
  _uStack_a8 = CONCAT44(uStack_a4,param_3);
  auVar4._8_4_ = in_XMM3_Dc;
  auVar4._0_8_ = param_4;
  auVar4._12_4_ = in_XMM3_Dd;
  auVar4 = blendvps(auVar3,auVar4,ZEXT416(-(uint)(0.0 < (float)param_4)));
  uStack_a0 = CONCAT44(auVar4._0_4_,(undefined4)uStack_a0);
  if (param_6 != 0) {
    lStack_98 = param_6;
  }
  uStack_b0 = param_2;
  FUN_7ff70c7cb410(param_1,&uStack_d8);
  if (_DAT_7ff70cbebd80 == (uStack_40 ^ (ulonglong)auStack_f8)) {
    return;
  }
  FUN_7ff70caa97e0(uStack_40 ^ (ulonglong)auStack_f8);
  pcVar1 = (code *)swi(3);
  (*pcVar1)();
  return;
}


