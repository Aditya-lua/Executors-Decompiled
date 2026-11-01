
undefined1  [16] FUN_0022b848(undefined8 param_1)

{
  code *pcVar1;
  long unaff_x19;
  long unaff_x29;
  undefined8 in_d4;
  undefined1 auVar2 [16];
  undefined8 in_stack_00000008;
  undefined1 uStack0000000000000010;
  undefined8 uStack0000000000000018;
  undefined8 uStack0000000000000020;
  undefined8 uStack0000000000000028;
  undefined8 uStack0000000000000030;
  undefined8 uStack0000000000000038;
  undefined8 uStack0000000000000040;
  undefined8 uStack00000000000000d0;
  undefined8 uStack00000000000000e0;
  undefined8 uStack00000000000000e8;
  undefined8 uStack00000000000000f0;
  undefined8 uStack00000000000000f8;
  undefined8 uStack0000000000000100;
  undefined8 uStack0000000000000130;
  
  uStack00000000000000e8 = *(undefined8 *)(unaff_x19 + 0xd8);
  uStack00000000000000e0 = *(undefined8 *)(unaff_x19 + 0xd0);
  uStack00000000000000f8 = *(undefined8 *)(unaff_x19 + 0xe8);
  uStack00000000000000f0 = *(undefined8 *)(unaff_x19 + 0xe0);
  uStack0000000000000100 = *(undefined8 *)(unaff_x19 + 0xf0);
  uStack0000000000000130 = in_stack_00000008;
  uStack0000000000000018 = *(undefined8 *)(unaff_x29 + -0xa8);
  _uStack0000000000000010 = *(undefined8 *)(unaff_x29 + -0xb0);
  uStack0000000000000028 = *(undefined8 *)(unaff_x29 + -0x98);
  uStack0000000000000020 = *(undefined8 *)(unaff_x29 + -0xa0);
  uStack0000000000000038 = *(undefined8 *)(unaff_x29 + -0x88);
  uStack0000000000000030 = *(undefined8 *)(unaff_x29 + -0x90);
  uStack0000000000000040 = param_1;
  uStack00000000000000d0 = in_d4;
  auVar2._0_8_ = func_0x00187bd0(0x198,8);
  if (auVar2._0_8_ == 0) {
    func_0x007a1f18(8,0x198);
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x22b8f4);
    (*pcVar1)();
  }
  _memcpy(auVar2._0_8_,&uStack0000000000000010,0x198);
  func_0x00187bd4();
  auVar2._8_8_ = &UNK_009c8550;
  return auVar2;
}

