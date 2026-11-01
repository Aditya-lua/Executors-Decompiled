
undefined1  [16] FUN_00547fbc(void)

{
  long lVar1;
  long *unaff_x19;
  long *unaff_x20;
  undefined1 auVar2 [16];
  undefined8 uStack0000000000000008;
  undefined8 uStack0000000000000018;
  undefined1 uStack0000000000000030;
  
  func_0x00490fcc(&uStack0000000000000030);
  lVar1 = *unaff_x20;
  *unaff_x20 = lVar1 + -1;
  LORelease();
  if (lVar1 == 1) {
    func_0x005d2ac4(&uStack0000000000000018);
  }
  else {
    __Unwind_Resume();
    func_0x007a2668();
    func_0x007a2668();
    lVar1 = *unaff_x19;
    *unaff_x19 = lVar1 + -1;
    LORelease();
    if (lVar1 == 1) {
      func_0x005d2ac4(&uStack0000000000000008);
    }
  }
  __Unwind_Resume();
  func_0x007a2668();
  auVar2._8_8_ = 0x161eb1ece5b56964;
  auVar2._0_8_ = 0x99b9139e4c2ecc4b;
  return auVar2;
}

