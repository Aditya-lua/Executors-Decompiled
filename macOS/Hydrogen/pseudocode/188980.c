
void FUN_00188980(undefined8 param_1,undefined1 param_2 [16],undefined1 param_3 [16])

{
  undefined8 *unaff_x20;
  long unaff_x29;
  undefined8 uVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  undefined8 uVar4;
  undefined8 uVar5;
  undefined8 uVar6;
  undefined1 uStack0000000000000008;
  undefined8 in_stack_00000068;
  undefined8 in_stack_00000070;
  undefined8 in_stack_00000078;
  undefined8 in_stack_00000080;
  undefined8 in_stack_000000f0;
  
  *(long *)(unaff_x29 + -0x70) = param_3._8_8_;
  *(long *)(unaff_x29 + -0x78) = param_3._0_8_;
  *(undefined8 *)(unaff_x29 + -0x50) = in_stack_00000080;
  *(undefined8 *)(unaff_x29 + -0x58) = in_stack_00000078;
  *(undefined8 *)(unaff_x29 + -0x60) = in_stack_00000070;
  *(undefined8 *)(unaff_x29 + -0x68) = in_stack_00000068;
  uVar2 = unaff_x20[1];
  uVar1 = *unaff_x20;
  uVar4 = unaff_x20[3];
  uVar3 = unaff_x20[2];
  uVar6 = unaff_x20[5];
  uVar5 = unaff_x20[4];
  *(undefined8 *)(unaff_x29 + -200) = param_1;
  *(undefined8 *)(unaff_x29 + -0x90) = in_stack_000000f0;
  unaff_x20[0xb] = uVar4;
  unaff_x20[10] = uVar3;
  unaff_x20[0xd] = uVar6;
  unaff_x20[0xc] = uVar5;
  unaff_x20[9] = uVar2;
  unaff_x20[8] = uVar1;
  func_0x001892a0(&uStack0000000000000008,unaff_x29 + -200);
  func_0x001fb160(&uStack0000000000000008);
  return;
}

