
void FUN_0070ff38(undefined1 param_1 [16])

{
  undefined8 in_x9;
  long unaff_x19;
  long in_stack_00000008;
  long in_stack_00000030;
  char in_stack_00000050;
  undefined1 uStack0000000000000080;
  undefined8 in_stack_00000160;
  undefined8 in_stack_00000168;
  undefined8 uStack0000000000000170;
  undefined8 uStack0000000000000178;
  undefined8 in_stack_00000238;
  undefined8 in_stack_00000498;
  undefined8 in_stack_000004a0;
  undefined8 in_stack_000004a8;
  undefined8 in_stack_000004b0;
  
  *(long *)(unaff_x19 + 0x30) = param_1._8_8_;
  *(long *)(unaff_x19 + 0x28) = param_1._0_8_;
  *(undefined8 *)(unaff_x19 + 0x38) = in_stack_00000238;
  *(undefined8 *)(unaff_x19 + 0x48) = in_stack_00000168;
  *(undefined8 *)(unaff_x19 + 0x40) = in_stack_00000160;
  in_stack_00000160 = 0;
  in_stack_00000168 = 0;
  uStack0000000000000170 = 0;
  uStack0000000000000178 = 0;
  *(undefined8 *)(unaff_x19 + 0x50) = in_x9;
  *(undefined8 *)(unaff_x19 + 0x58) = in_stack_00000498;
  *(undefined8 *)(unaff_x19 + 0x68) = in_stack_000004a8;
  *(undefined8 *)(unaff_x19 + 0x60) = in_stack_000004a0;
  *(undefined8 *)(unaff_x19 + 0x70) = in_stack_000004b0;
  func_0x007253a4(&uStack0000000000000080);
  if (in_stack_00000050 != '\0') {
    if (in_stack_00000030 != 0) {
      __ZdlPv();
    }
    if (in_stack_00000008 != 0) {
      __ZdlPv();
    }
  }
  return;
}

