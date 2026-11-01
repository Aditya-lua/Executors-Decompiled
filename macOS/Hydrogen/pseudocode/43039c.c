
void FUN_0043039c(undefined8 param_1,undefined8 param_2)

{
  ulong uVar1;
  undefined1 auVar2 [16];
  undefined8 uStack_90;
  undefined8 uStack_88;
  undefined8 uStack_80;
  undefined8 uStack_78;
  undefined8 uStack_70;
  undefined8 uStack_68;
  undefined8 uStack_60;
  undefined8 uStack_58;
  undefined8 uStack_50;
  undefined8 uStack_48;
  undefined8 uStack_40;
  undefined8 uStack_38;
  undefined8 uStack_30;
  undefined8 uStack_28;
  undefined8 uStack_20;
  undefined8 uStack_18;
  
  func_0x00187bd4(param_1,param_2,8);
  func_0x003f718c();
  func_0x007a2650();
  auVar2 = func_0x007a2650();
  uStack_28 = 0;
  uStack_30 = 0;
  uStack_18 = 0;
  uStack_20 = 0;
  uStack_48 = 0;
  uStack_50 = 0;
  uStack_38 = 0;
  uStack_40 = 0;
  uVar1 = auVar2._8_8_ - 1;
  if (uVar1 != 0) {
    if (0x3e < uVar1) {
      uVar1 = 0x3f;
    }
    if (uVar1 < 2) {
      uVar1 = 1;
    }
    _memcpy(&uStack_50,auVar2._0_8_,uVar1);
  }
  uStack_88 = uStack_48;
  uStack_90 = uStack_50;
  uStack_78 = uStack_38;
  uStack_80 = uStack_40;
  uStack_68 = uStack_28;
  uStack_70 = uStack_30;
  uStack_58 = uStack_18;
  uStack_60 = uStack_20;
  _pthread_setname_np(&uStack_90);
  return;
}

