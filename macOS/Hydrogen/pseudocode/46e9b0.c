
undefined8 FUN_0046e9b0(undefined8 param_1)

{
  ulong uVar1;
  long unaff_x19;
  long unaff_x22;
  undefined8 uVar2;
  long unaff_x29;
  undefined1 uStack0000000000000008;
  undefined8 uStack0000000000000018;
  undefined *in_stack_00000020;
  undefined8 *in_stack_00000028;
  undefined8 in_stack_00000030;
  undefined *in_stack_00000038;
  undefined8 in_stack_00000040;
  undefined8 uStack0000000000000048;
  undefined *in_stack_00000050;
  undefined8 in_stack_00000058;
  undefined2 in_stack_00000060;
  undefined4 uStack0000000000000062;
  undefined2 uStack0000000000000066;
  
  *(undefined8 *)(unaff_x29 + -0x50) = param_1;
  func_0x007a2420(unaff_x29 + -0x60,&UNK_009e0a40);
  in_stack_00000060 = *(undefined2 *)(unaff_x22 + 0x16);
  uStack0000000000000048 = &uStack0000000000000008;
  in_stack_00000050 = &DAT_00477a40;
  in_stack_00000058 = 0;
  uStack0000000000000062 = *(undefined4 *)(unaff_x29 + -0x66);
  uStack0000000000000066 = *(undefined2 *)(unaff_x29 + -0x62);
  uVar2 = 1;
  uStack0000000000000018 = &UNK_009e0a20;
  in_stack_00000020 = (undefined *)0x1;
  in_stack_00000038 = &UNK_00894518;
  in_stack_00000040 = 1;
  in_stack_00000028 = &uStack0000000000000048;
  in_stack_00000030 = 2;
  uVar1 = func_0x0046849c();
  if ((uVar1 & 1) == 0) {
    uStack0000000000000018 = *(undefined **)(unaff_x19 + 0x28);
    in_stack_00000020 = &DAT_00477a40;
    *(undefined **)(unaff_x29 + -0x60) = &UNK_007fc120;
    *(undefined8 *)(unaff_x29 + -0x58) = 1;
    *(undefined8 *)(unaff_x29 + -0x48) = 1;
    *(undefined8 *)(unaff_x29 + -0x40) = 0;
    *(undefined8 **)(unaff_x29 + -0x50) = &uStack0000000000000018;
    uVar2 = func_0x0046849c();
  }
  return uVar2;
}

