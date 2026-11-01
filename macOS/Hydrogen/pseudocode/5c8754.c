
undefined8 FUN_005c8754(void)

{
  undefined8 uVar1;
  undefined8 *unaff_x19;
  long unaff_x29;
  undefined8 uStack0000000000000030;
  undefined *in_stack_00000038;
  undefined8 in_stack_00000040;
  undefined8 uStack0000000000000060;
  undefined8 in_stack_00000068;
  undefined8 in_stack_00000070;
  long in_stack_00000090;
  undefined8 in_stack_00000098;
  
  func_0x00459f08(&uStack0000000000000030,unaff_x29 + -0x78);
  if (*(long *)(unaff_x29 + -0x90) != 0) {
    func_0x00187bd4(*(undefined8 *)(unaff_x29 + -0x88),*(long *)(unaff_x29 + -0x90),1);
  }
  if (in_stack_00000090 != 0) {
    func_0x00187bd4(in_stack_00000098,in_stack_00000090,1);
  }
  in_stack_00000068 = in_stack_00000038;
  uStack0000000000000060 = (long)uStack0000000000000030;
  in_stack_00000070 = in_stack_00000040;
  uStack0000000000000030 = &uStack0000000000000060;
  in_stack_00000038 = &DAT_005d2920;
  *(undefined **)(unaff_x29 + -0x78) = &UNK_007fc120;
  *(undefined8 *)(unaff_x29 + -0x70) = 1;
  *(undefined8 *)(unaff_x29 + -0x60) = 1;
  *(undefined8 *)(unaff_x29 + -0x58) = 0;
  *(undefined8 **)(unaff_x29 + -0x68) = &uStack0000000000000030;
  uVar1 = func_0x0046849c(*unaff_x19,unaff_x19[1],unaff_x29 + -0x78);
  if ((uStack0000000000000060 != -0x8000000000000000) && (uStack0000000000000060 != 0)) {
    func_0x00187bd4(in_stack_00000068,uStack0000000000000060,1);
  }
  return uVar1;
}

