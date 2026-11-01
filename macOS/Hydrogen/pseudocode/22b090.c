
undefined1  [16] FUN_0022b090(void)

{
  code *pcVar1;
  long unaff_x19;
  long unaff_x29;
  undefined1 auVar2 [16];
  undefined8 in_stack_00000000;
  undefined8 in_stack_00000008;
  undefined1 uStack0000000000000010;
  undefined8 uStack0000000000000018;
  undefined8 uStack0000000000000020;
  undefined8 uStack00000000000000e8;
  undefined8 uStack0000000000000110;
  undefined8 uStack0000000000000118;
  undefined8 uStack0000000000000140;
  
  uStack0000000000000140 = *(undefined8 *)(unaff_x19 + 0x130);
  uStack00000000000000e8 = *(undefined8 *)(unaff_x19 + 0xd8);
  uStack0000000000000118 = in_stack_00000008;
  uStack0000000000000110 = in_stack_00000000;
  uStack0000000000000018 = *(undefined8 *)(unaff_x29 + -0x60);
  _uStack0000000000000010 = *(undefined8 *)(unaff_x29 + -0x68);
  uStack0000000000000020 = *(undefined8 *)(unaff_x29 + -0x58);
  auVar2._0_8_ = func_0x00187bd0(0x180,8);
  if (auVar2._0_8_ == 0) {
    func_0x007a1f18(8,0x180);
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x22b138);
    (*pcVar1)();
  }
  _memcpy(auVar2._0_8_,&uStack0000000000000010,0x180);
  func_0x00187bd4();
  auVar2._8_8_ = &UNK_009c85e0;
  return auVar2;
}

