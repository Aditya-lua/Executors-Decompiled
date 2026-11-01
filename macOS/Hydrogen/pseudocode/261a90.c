
undefined8 FUN_00261a90(void)

{
  ulong uVar1;
  undefined8 *unaff_x19;
  long unaff_x20;
  undefined8 uStack0000000000000008;
  undefined8 uStack0000000000000018;
  undefined1 *puStack0000000000000020;
  undefined8 uStack0000000000000028;
  undefined8 uStack0000000000000030;
  undefined1 uStack0000000000000040;
  
  _uStack0000000000000040 = &uStack0000000000000008;
  uStack0000000000000018 = 1;
  uStack0000000000000028 = 1;
  uStack0000000000000030 = 0;
  puStack0000000000000020 = &uStack0000000000000040;
  uVar1 = func_0x0046849c(*unaff_x19,unaff_x19[1],(long)register0x00000008 + 0x10);
  if ((uVar1 & 1) == 0) {
    uStack0000000000000008 = unaff_x20 + 2;
    uVar1 = func_0x0046920c();
    if ((uVar1 & 1) == 0) {
      _uStack0000000000000040 = &uStack0000000000000008;
      uStack0000000000000018 = 1;
      uStack0000000000000028 = 1;
      uStack0000000000000030 = 0;
      puStack0000000000000020 = &uStack0000000000000040;
      uVar1 = func_0x0046849c(*unaff_x19,unaff_x19[1],(long)register0x00000008 + 0x10);
      if ((uVar1 & 1) == 0) {
        uStack0000000000000008 = unaff_x20 + 3;
        uVar1 = func_0x0046920c();
        if ((uVar1 & 1) == 0) {
          _uStack0000000000000040 = &uStack0000000000000008;
          uStack0000000000000018 = 1;
          uStack0000000000000028 = 1;
          uStack0000000000000030 = 0;
          puStack0000000000000020 = &uStack0000000000000040;
          uVar1 = func_0x0046849c(*unaff_x19,unaff_x19[1],(long)register0x00000008 + 0x10);
          if ((uVar1 & 1) == 0) {
            return 0;
          }
        }
      }
    }
  }
  return 1;
}

