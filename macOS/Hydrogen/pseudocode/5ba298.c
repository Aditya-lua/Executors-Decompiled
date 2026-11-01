
undefined1  [16] FUN_005ba298(undefined8 param_1,undefined8 param_2)

{
  long lVar1;
  long unaff_x19;
  undefined1 auVar2 [16];
  undefined8 uStack0000000000000000;
  undefined8 uStack0000000000000008;
  undefined8 uStack0000000000000010;
  undefined8 uStack0000000000000018;
  undefined8 uStack0000000000000020;
  undefined8 uStack0000000000000030;
  undefined1 uStack0000000000000040;
  
  _uStack0000000000000040 = *(long **)(unaff_x19 + 0x60);
  uStack0000000000000008 = *(undefined8 *)(unaff_x19 + 0x28);
  uStack0000000000000000 = *(undefined8 *)(unaff_x19 + 0x20);
  uStack0000000000000018 = *(undefined8 *)(unaff_x19 + 0x38);
  uStack0000000000000010 = *(undefined8 *)(unaff_x19 + 0x30);
  uStack0000000000000020 = param_1;
  uStack0000000000000030 = param_2;
  func_0x005adc80();
  lVar1 = *_uStack0000000000000040;
  *_uStack0000000000000040 = lVar1 + -1;
  LORelease();
  if (lVar1 == 1) {
    func_0x005d2c74(&uStack0000000000000040);
  }
  auVar2._8_8_ = 0x27;
  auVar2._0_8_ = &UNK_008b4153;
  return auVar2;
}

