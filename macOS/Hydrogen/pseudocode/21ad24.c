
void FUN_0021ad24(undefined8 param_1,undefined1 param_2 [16],undefined1 param_3 [16],
                 undefined1 param_4 [16],undefined1 param_5 [16],undefined1 param_6 [16])

{
  ulong uVar1;
  long *unaff_x19;
  long unaff_x20;
  long unaff_x21;
  long unaff_x23;
  long in_stack_00000000;
  undefined8 in_stack_00000008;
  undefined8 uStack0000000000000020;
  undefined8 uStack0000000000000028;
  undefined8 uStack0000000000000030;
  undefined8 uStack0000000000000038;
  undefined8 uStack0000000000000040;
  undefined8 uStack0000000000000048;
  undefined8 uStack0000000000000050;
  undefined8 uStack0000000000000058;
  undefined8 uStack0000000000000060;
  undefined8 uStack0000000000000068;
  undefined8 uStack0000000000000070;
  undefined8 uStack0000000000000078;
  undefined8 uStack0000000000000080;
  undefined8 uStack0000000000000108;
  undefined8 uStack0000000000000110;
  undefined8 uStack0000000000000118;
  undefined8 uStack0000000000000120;
  undefined8 uStack0000000000000128;
  undefined8 uStack0000000000000130;
  undefined8 uStack0000000000000138;
  undefined8 uStack0000000000000140;
  undefined8 uStack0000000000000170;
  undefined8 uStack0000000000000178;
  undefined8 in_stack_00000190;
  undefined8 in_stack_00000198;
  undefined8 in_stack_000001a0;
  undefined8 in_stack_000001a8;
  undefined8 in_stack_000001b0;
  undefined8 in_stack_000001b8;
  undefined8 in_stack_000001c0;
  undefined8 uStack00000000000001c8;
  undefined8 in_stack_000001d0;
  
  *(long *)(unaff_x23 + 0xb8) = param_6._8_8_;
  *(long *)(unaff_x23 + 0xb0) = param_6._0_8_;
  *(long *)(unaff_x23 + 200) = param_2._8_8_;
  *(long *)(unaff_x23 + 0xc0) = param_2._0_8_;
  uStack0000000000000060 = *(undefined8 *)(unaff_x23 + 0x1f8);
  uStack0000000000000058 = *(undefined8 *)(unaff_x23 + 0x1f0);
  uStack0000000000000070 = *(undefined8 *)(unaff_x23 + 0x208);
  uStack0000000000000068 = *(undefined8 *)(unaff_x23 + 0x200);
  uStack0000000000000080 = *(undefined8 *)(unaff_x23 + 0x218);
  uStack0000000000000078 = *(undefined8 *)(unaff_x23 + 0x210);
  *(undefined8 *)(unaff_x23 + 0x78) = *(undefined8 *)(unaff_x23 + 0x228);
  *(undefined8 *)(unaff_x23 + 0x70) = *(undefined8 *)(unaff_x23 + 0x220);
  *(long *)(unaff_x23 + 0x88) = param_3._8_8_;
  *(long *)(unaff_x23 + 0x80) = param_3._0_8_;
  uStack0000000000000178 = in_stack_000001b8;
  uStack0000000000000170 = in_stack_000001b0;
  uStack0000000000000118 = in_stack_00000198;
  uStack0000000000000110 = in_stack_00000190;
  uStack0000000000000128 = in_stack_000001a8;
  uStack0000000000000120 = in_stack_000001a0;
  uStack0000000000000138 = in_stack_000001b8;
  uStack0000000000000130 = in_stack_000001b0;
  uStack0000000000000140 = in_stack_000001c0;
  uStack0000000000000028 = in_stack_00000198;
  uStack0000000000000020 = in_stack_00000190;
  uStack0000000000000038 = in_stack_000001a8;
  uStack0000000000000030 = in_stack_000001a0;
  uStack0000000000000050 = in_stack_000001c0;
  uStack0000000000000048 = in_stack_000001b8;
  uStack0000000000000040 = in_stack_000001b0;
  uStack0000000000000108 = param_1;
  func_0x0026c21c(&uStack00000000000001c8,(long)register0x00000008 + 0x18);
  uVar1 = func_0x003f1cb4();
  if ((uVar1 & 1) == 0) {
    *(undefined1 *)(unaff_x19 + 1) = 0;
    *unaff_x19 = unaff_x21 + 0x10;
  }
  else {
    *unaff_x19 = unaff_x21 + 0x12;
  }
  if ((unaff_x20 != -0x8000000000000000) && (unaff_x20 != 0)) {
    func_0x00187bd4(uStack0000000000000020,unaff_x20,1);
  }
  if ((in_stack_00000000 != -0x8000000000000000) && (in_stack_00000000 != 0)) {
    func_0x00187bd4(in_stack_00000008,in_stack_00000000,1);
  }
  if ((uStack00000000000001c8 != -0x8000000000000000) && (uStack00000000000001c8 != 0)) {
    func_0x00187bd4(in_stack_000001d0,uStack00000000000001c8,1);
  }
  return;
}

