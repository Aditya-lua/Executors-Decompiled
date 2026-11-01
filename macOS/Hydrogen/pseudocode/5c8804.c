
undefined8 FUN_005c8804(undefined8 param_1)

{
  undefined8 uVar1;
  undefined8 in_x9;
  undefined8 in_x10;
  undefined8 in_x11;
  undefined8 *unaff_x19;
  long unaff_x29;
  undefined8 uStack0000000000000018;
  undefined8 in_stack_00000020;
  undefined8 in_stack_00000028;
  undefined8 uStack0000000000000030;
  undefined *in_stack_00000038;
  undefined8 *in_stack_00000040;
  undefined8 in_stack_00000048;
  undefined8 in_stack_00000050;
  undefined8 uStack0000000000000060;
  undefined *in_stack_00000068;
  long in_stack_00000070;
  undefined *in_stack_00000078;
  long in_stack_00000080;
  undefined *in_stack_00000088;
  undefined8 uStack0000000000000090;
  undefined8 in_stack_00000098;
  
  *(undefined8 *)(unaff_x29 + -0x68) = param_1;
  *(undefined8 *)(unaff_x29 + -0x60) = in_x9;
  *(undefined8 *)(unaff_x29 + -0x58) = in_x11;
  *(undefined8 *)(unaff_x29 + -0x50) = 0;
  *(undefined8 *)(unaff_x29 + -0x48) = param_1;
  *(undefined8 *)(unaff_x29 + -0x40) = in_x9;
  *(undefined8 *)(unaff_x29 + -0x38) = in_x10;
  func_0x005d3050(unaff_x29 + -0x90,unaff_x29 + -0x78,&UNK_008b5821,2);
  uStack0000000000000060 = &uStack0000000000000090;
  in_stack_00000068 = &DAT_005c73c0;
  in_stack_00000070 = unaff_x29 + -0xa0;
  in_stack_00000078 = &DAT_005d1a0c;
  in_stack_00000088 = &DAT_005c73c0;
  uStack0000000000000030 = (undefined8 *)&UNK_009f2860;
  in_stack_00000038 = (undefined *)0x4;
  in_stack_00000040 = &uStack0000000000000060;
  in_stack_00000048 = 3;
  in_stack_00000050 = 0;
  in_stack_00000080 = unaff_x29 + -0x90;
  func_0x00459f08(&uStack0000000000000018,&uStack0000000000000030);
  if (*(long *)(unaff_x29 + -0x90) != 0) {
    func_0x00187bd4(*(undefined8 *)(unaff_x29 + -0x88),*(long *)(unaff_x29 + -0x90),1);
  }
  if (uStack0000000000000090 != 0) {
    func_0x00187bd4(in_stack_00000098,uStack0000000000000090,1);
  }
  in_stack_00000068 = (undefined *)in_stack_00000020;
  uStack0000000000000060 = (undefined8 *)uStack0000000000000018;
  in_stack_00000070 = in_stack_00000028;
  uStack0000000000000030 = &uStack0000000000000060;
  in_stack_00000038 = &DAT_005d2920;
  *(undefined **)(unaff_x29 + -0x78) = &UNK_007fc120;
  *(undefined8 *)(unaff_x29 + -0x70) = 1;
  *(undefined8 *)(unaff_x29 + -0x60) = 1;
  *(undefined8 *)(unaff_x29 + -0x58) = 0;
  *(undefined8 **)(unaff_x29 + -0x68) = &uStack0000000000000030;
  uVar1 = func_0x0046849c(*unaff_x19,unaff_x19[1],unaff_x29 + -0x78);
  if ((uStack0000000000000060 != (undefined8 *)0x8000000000000000) &&
     (uStack0000000000000060 != (undefined8 *)0x0)) {
    func_0x00187bd4(in_stack_00000068,uStack0000000000000060,1);
  }
  return uVar1;
}

