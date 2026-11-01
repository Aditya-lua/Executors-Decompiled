
void FUN_0008d614(undefined1 param_1 [16],undefined8 param_2,undefined8 param_3,undefined8 param_4)

{
  long unaff_x20;
  undefined8 uVar1;
  undefined1 auVar2 [16];
  
  func_0x007b61a0(*(undefined8 *)(unaff_x20 + 0x458));
  uVar1 = func_0x007b63e0(*(undefined8 *)(unaff_x20 + 0x458));
  auVar2 = _objc_alloc(uRam0000000000a274d8);
  lRam0000000000a33460 = func_0x007b6b60(uVar1,param_2,param_3,param_4,auVar2._0_8_,auVar2._8_8_,0);
  if (lRam0000000000a33460 != 0) {
    auVar2 = _objc_alloc(uRam0000000000a274e0);
    lRam0000000000a33468 = func_0x007b6b80(auVar2._0_8_,auVar2._8_8_,lRam0000000000a33460);
    if (lRam0000000000a33468 != 0) {
      uRam0000000000a33988 = 1;
      return;
    }
    func_0x007b7200(lRam0000000000a33460);
    lRam0000000000a33460 = 0;
  }
  return;
}

