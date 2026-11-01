
void FUN_00422a78(undefined1 param_1 [16])

{
  ulong in_x9;
  long in_x10;
  undefined2 in_w11;
  long unaff_x22;
  undefined8 in_stack_00000010;
  undefined8 in_stack_00000018;
  undefined8 in_stack_00000020;
  undefined8 in_stack_00000028;
  undefined8 uStack0000000000000030;
  undefined8 uStack0000000000000038;
  undefined8 uStack0000000000000040;
  undefined8 in_stack_00000050;
  undefined8 in_stack_00000058;
  undefined8 in_stack_00000060;
  undefined8 in_stack_00000068;
  undefined4 in_stack_00000070;
  ulong in_stack_00000080;
  undefined4 uStack00000000000000ec;
  
  uStack0000000000000040 = param_1._0_8_;
  uStack0000000000000038 = *(undefined8 *)(unaff_x22 + 0x30);
  uStack0000000000000030 = *(undefined8 *)(unaff_x22 + 0x28);
  *(long *)(unaff_x22 + 0x44) = param_1._8_8_;
  *(undefined8 *)(unaff_x22 + 0x3c) = uStack0000000000000040;
  *(undefined8 *)(unaff_x22 + 0x54) = in_stack_00000058;
  *(undefined8 *)(unaff_x22 + 0x4c) = in_stack_00000050;
  *(undefined8 *)(unaff_x22 + 100) = in_stack_00000068;
  *(undefined8 *)(unaff_x22 + 0x5c) = in_stack_00000060;
  *(undefined8 *)(unaff_x22 + 0x14) = in_stack_00000018;
  *(undefined8 *)(unaff_x22 + 0xc) = in_stack_00000010;
  *(undefined8 *)(unaff_x22 + 0x24) = in_stack_00000028;
  *(undefined8 *)(unaff_x22 + 0x1c) = in_stack_00000020;
  in_stack_00000070 = CONCAT22(in_stack_00000070._2_2_,in_w11);
  *(ulong *)(unaff_x22 + 4) =
       in_x9 | in_x10 << 8 |
       (ulong)*(uint *)(unaff_x22 + 2) << 0x10 | in_stack_00000080 & 0xffff000000000000;
  uStack00000000000000ec = in_stack_00000070;
  *(undefined8 *)(unaff_x22 + 0x34) = uStack0000000000000038;
  *(undefined8 *)(unaff_x22 + 0x2c) = uStack0000000000000030;
  func_0x004653b0();
  func_0x00465628();
  return;
}

