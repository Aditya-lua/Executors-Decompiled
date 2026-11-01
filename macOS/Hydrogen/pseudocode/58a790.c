
uint FUN_0058a790(void)

{
  uint uVar1;
  long unaff_x22;
  undefined1 auVar2 [16];
  undefined1 uStack0000000000000050;
  
  if (unaff_x22 != 0) {
    func_0x00187bd4();
  }
  func_0x005876a4(&uStack0000000000000050);
  __Unwind_Resume();
  auVar2 = func_0x007a2668();
  uVar1 = (uint)(*auVar2._8_8_ < *auVar2._0_8_);
  if (*auVar2._0_8_ < *auVar2._8_8_) {
    uVar1 = 0xffffffff;
  }
  return uVar1;
}

