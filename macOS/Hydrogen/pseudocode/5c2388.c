
undefined8 FUN_005c2388(undefined8 param_1)

{
  undefined8 uVar1;
  undefined8 in_x9;
  undefined8 in_x10;
  undefined8 *unaff_x19;
  long unaff_x29;
  undefined1 uStack0000000000000008;
  undefined8 uStack0000000000000010;
  long lStack0000000000000018;
  undefined8 uStack0000000000000020;
  undefined8 uStack0000000000000028;
  long in_stack_00000038;
  undefined8 in_stack_00000040;
  undefined8 uStack0000000000000050;
  undefined8 in_stack_00000058;
  
  *(undefined8 *)(unaff_x29 + -0x50) = param_1;
  *(undefined8 *)(unaff_x29 + -0x48) = in_x10;
  *(undefined8 **)(unaff_x29 + -0x40) = &uStack0000000000000050;
  *(undefined8 *)(unaff_x29 + -0x38) = in_x9;
  _uStack0000000000000008 = &UNK_009f2370;
  uStack0000000000000010 = 3;
  uStack0000000000000020 = 3;
  uStack0000000000000028 = 0;
  lStack0000000000000018 = unaff_x29 + -0x60;
  uVar1 = func_0x0046849c(*unaff_x19,unaff_x19[1],&uStack0000000000000008);
  if (uStack0000000000000050 != 0) {
    func_0x00187bd4(in_stack_00000058,uStack0000000000000050,1);
  }
  if (in_stack_00000038 != 0) {
    func_0x00187bd4(in_stack_00000040,in_stack_00000038,1);
  }
  return uVar1;
}

