
undefined8 FUN_004620e0(void)

{
  ulong uVar1;
  code *pcVar2;
  long unaff_x21;
  long unaff_x23;
  long unaff_x24;
  long unaff_x27;
  undefined1 uStack0000000000000020;
  long lStack0000000000000030;
  undefined8 uStack0000000000000040;
  
  do {
    _uStack0000000000000020 = &UNK_007fc120;
    uStack0000000000000040 = 0;
    lStack0000000000000030 = (long)register0x00000008 + 0x50;
    uVar1 = func_0x0046849c();
    if ((uVar1 & 1) != 0) {
      return 1;
    }
    unaff_x24 = unaff_x24 + -1;
  } while (unaff_x24 != 0);
  func_0x0046daac(&uStack0000000000000020,(long)register0x00000008 + 0x50);
  if (_uStack0000000000000020 != (undefined *)0x0) {
    pcVar2 = *(code **)(unaff_x21 + 0x18);
    do {
      uVar1 = (*pcVar2)();
      if ((uVar1 & 1) != 0) {
        return 1;
      }
      if ((unaff_x27 != 0) && (uVar1 = (*pcVar2)(), (uVar1 & 1) != 0)) {
        return 1;
      }
      func_0x0046daac(&uStack0000000000000020,(long)register0x00000008 + 0x50);
    } while (_uStack0000000000000020 != (undefined *)0x0);
  }
  if (unaff_x23 != 0) {
    do {
      _uStack0000000000000020 = &UNK_007fc120;
      uStack0000000000000040 = 0;
      lStack0000000000000030 = (long)register0x00000008 + 0x50;
      uVar1 = func_0x0046849c();
      if ((uVar1 & 1) != 0) {
        return 1;
      }
      unaff_x23 = unaff_x23 + -1;
    } while (unaff_x23 != 0);
  }
  return 0;
}

