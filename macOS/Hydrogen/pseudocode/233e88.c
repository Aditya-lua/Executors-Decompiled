
undefined1  [16] FUN_00233e88(undefined8 *param_1)

{
  code *pcVar1;
  undefined8 uVar2;
  undefined8 unaff_x19;
  undefined8 unaff_x20;
  undefined8 unaff_x21;
  undefined8 unaff_x24;
  long unaff_x29;
  undefined1 auVar3 [16];
  undefined8 in_stack_000000b8;
  undefined8 in_stack_000000c0;
  undefined8 in_stack_000000c8;
  undefined8 in_stack_000000d0;
  undefined8 in_stack_000000d8;
  undefined8 in_stack_000000e0;
  undefined8 in_stack_000000e8;
  undefined8 in_stack_000000f0;
  undefined8 in_stack_000000f8;
  undefined8 in_stack_00000100;
  
  if (param_1 == (undefined8 *)0x0) {
    func_0x007a1f18(8,0x20);
  }
  else {
    param_1[1] = 1;
    *param_1 = 1;
    param_1[2] = unaff_x21;
    param_1[3] = unaff_x19;
    uVar2 = *(undefined8 *)(unaff_x29 + -0x48);
    auVar3._0_8_ = (undefined8 *)func_0x00187bd0(0x70,8);
    if (auVar3._0_8_ != (undefined8 *)0x0) {
      auVar3._0_8_[9] = in_stack_000000e8;
      auVar3._0_8_[8] = in_stack_000000e0;
      auVar3._0_8_[0xb] = in_stack_000000f8;
      auVar3._0_8_[10] = in_stack_000000f0;
      auVar3._0_8_[0xd] = uVar2;
      auVar3._0_8_[0xc] = in_stack_00000100;
      auVar3._0_8_[1] = unaff_x24;
      *auVar3._0_8_ = unaff_x20;
      auVar3._0_8_[3] = in_stack_000000b8;
      auVar3._0_8_[2] = param_1;
      auVar3._0_8_[5] = in_stack_000000c8;
      auVar3._0_8_[4] = in_stack_000000c0;
      auVar3._0_8_[7] = in_stack_000000d8;
      auVar3._0_8_[6] = in_stack_000000d0;
      func_0x00278a58(unaff_x29 + -0xa0);
      auVar3._8_8_ = &UNK_009c9260;
      return auVar3;
    }
    func_0x007a1f18(8,0x70);
  }
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x233fb0);
  (*pcVar1)();
}

