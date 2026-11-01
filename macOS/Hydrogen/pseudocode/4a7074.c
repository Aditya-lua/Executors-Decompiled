
void FUN_004a7074(undefined8 param_1)

{
  undefined8 uVar1;
  undefined8 in_x9;
  undefined8 *unaff_x19;
  undefined8 unaff_x20;
  undefined8 unaff_x21;
  undefined8 unaff_x22;
  undefined8 unaff_x26;
  long unaff_x29;
  undefined8 in_stack_00000000;
  undefined8 in_stack_00000008;
  undefined8 in_stack_00000010;
  undefined8 in_stack_00000018;
  undefined8 in_stack_00000020;
  undefined8 in_stack_00000028;
  undefined8 in_stack_00000030;
  undefined8 uStack00000000000000b0;
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
  undefined8 in_stack_00000108;
  undefined8 in_stack_00000110;
  
  *(undefined8 *)(unaff_x29 + -0x80) = in_stack_00000008;
  *(undefined8 *)(unaff_x29 + -0x88) = in_stack_00000000;
  *(undefined8 *)(unaff_x29 + -0x70) = in_stack_00000018;
  *(undefined8 *)(unaff_x29 + -0x78) = in_stack_00000010;
  *(undefined8 *)(unaff_x29 + -0x60) = in_stack_00000028;
  *(undefined8 *)(unaff_x29 + -0x68) = in_stack_00000020;
  *(undefined8 *)(unaff_x29 + -0x58) = in_stack_00000030;
  *(undefined8 *)(unaff_x29 + -0xb8) = in_x9;
  *(undefined8 *)(unaff_x29 + -0xb0) = param_1;
  *(undefined8 *)(unaff_x29 + -0xa8) = unaff_x21;
  *(undefined8 *)(unaff_x29 + -0xa0) = unaff_x22;
  *(undefined8 *)(unaff_x29 + -0x98) = unaff_x20;
  *(undefined8 *)(unaff_x29 + -0x90) = unaff_x26;
  uVar1 = func_0x00512da0(unaff_x29 + -0xb8);
  in_stack_000000f8 = *(undefined8 *)(unaff_x29 + -0x70);
  in_stack_000000f0 = *(undefined8 *)(unaff_x29 + -0x78);
  in_stack_00000108 = *(undefined8 *)(unaff_x29 + -0x60);
  in_stack_00000100 = *(undefined8 *)(unaff_x29 + -0x68);
  in_stack_00000110 = *(undefined8 *)(unaff_x29 + -0x58);
  in_stack_000000b8 = *(undefined8 *)(unaff_x29 + -0xb0);
  uStack00000000000000b0 = *(undefined8 *)(unaff_x29 + -0xb8);
  in_stack_000000c8 = *(undefined8 *)(unaff_x29 + -0xa0);
  in_stack_000000c0 = *(undefined8 *)(unaff_x29 + -0xa8);
  in_stack_000000d8 = *(undefined8 *)(unaff_x29 + -0x90);
  in_stack_000000d0 = *(undefined8 *)(unaff_x29 + -0x98);
  in_stack_000000e8 = *(undefined8 *)(unaff_x29 + -0x80);
  in_stack_000000e0 = *(undefined8 *)(unaff_x29 + -0x88);
  func_0x005129bc(unaff_x19 + 2,&uStack00000000000000b0);
  unaff_x19[0xe] = uVar1;
  unaff_x19[1] = &DAT_004a7194;
  *unaff_x19 = 0;
  return;
}

