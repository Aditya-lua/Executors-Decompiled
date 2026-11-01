
undefined1  [16] FUN_00252344(ulong param_1)

{
  undefined8 uVar1;
  code *pcVar2;
  long unaff_x23;
  long unaff_x29;
  undefined1 auVar3 [16];
  undefined1 auVar4 [16];
  undefined8 uStack0000000000000048;
  undefined8 in_stack_00000050;
  undefined8 in_stack_00000058;
  
  if (param_1 < 0x41) {
    func_0x002526b8(&uStack0000000000000048);
    uVar1 = in_stack_00000050;
    auVar3 = (**(code **)(unaff_x23 + 0x18))();
    *(undefined1 (*) [16])(unaff_x29 + -0x40) = auVar3;
    auVar4._0_8_ = (undefined1 (*) [16])func_0x00187bd0(0x10,8);
    if (auVar4._0_8_ != (undefined1 (*) [16])0x0) {
      *auVar4._0_8_ = auVar3;
      if (uStack0000000000000048 != 0) {
        func_0x00187bd4(uVar1,uStack0000000000000048,1);
      }
      auVar4._8_8_ = &UNK_009ca578;
      return auVar4;
    }
  }
  else {
    func_0x007a28b0(param_1,0x40,&UNK_009ca560);
  }
  func_0x007a1f18(8,0x10);
                    /* WARNING: Does not return */
  pcVar2 = (code *)SoftwareBreakpoint(1,0x252408);
  (*pcVar2)();
}

