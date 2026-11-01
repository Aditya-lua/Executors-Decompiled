
undefined1  [16] FUN_0027be78(void)

{
  undefined8 uVar1;
  undefined8 unaff_x20;
  undefined1 auVar2 [16];
  undefined8 uStack_58;
  long alStack_50 [2];
  undefined8 uStack_40;
  long lStack_38;
  undefined8 uStack_30;
  undefined8 uStack_28;
  
  __Unwind_Resume();
  func_0x0027bc2c(alStack_50);
  if (alStack_50[0] == 0) {
    uVar1 = 0;
  }
  else {
    uStack_58 = uStack_28;
    auVar2 = func_0x00275e94(&uStack_58,0);
    unaff_x20 = auVar2._8_8_;
    uVar1 = auVar2._0_8_;
    func_0x002d8de8(uStack_58);
    func_0x002d8de8(uStack_30);
    if (lStack_38 != 0) {
      func_0x00187bd4(uStack_40,lStack_38,1);
    }
  }
  auVar2._8_8_ = unaff_x20;
  auVar2._0_8_ = uVar1;
  return auVar2;
}

