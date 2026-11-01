
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_004b59dc(undefined8 param_1,undefined8 *param_2,undefined8 param_3)

{
  undefined8 uVar1;
  undefined8 uVar2;
  undefined8 extraout_x8;
  undefined8 extraout_x9;
  undefined8 *unaff_x19;
  undefined8 *unaff_x20;
  code *unaff_x22;
  long unaff_x29;
  undefined1 auVar3 [16];
  undefined8 in_stack_00000000;
  undefined8 in_stack_00000008;
  undefined8 in_stack_00000010;
  undefined8 in_stack_00000018;
  undefined8 in_stack_00000020;
  undefined8 in_stack_00000028;
  undefined8 uStack0000000000000030;
  undefined8 in_stack_00000038;
  undefined8 in_stack_00000040;
  undefined8 in_stack_00000048;
  
  *param_2 = 1;
  param_2[1] = param_1;
  param_2[2] = param_3;
  auVar3 = (*unaff_x22)();
  in_stack_00000028 = auVar3._8_8_;
  *(undefined8 *)(auVar3._0_8_ + 8) = extraout_x9;
  in_stack_00000008 = _UNK_009e54c0;
  in_stack_00000000 = _UNK_009e54b8;
  in_stack_00000018 = _UNK_009e54d0;
  in_stack_00000010 = _UNK_009e54c8;
  in_stack_00000020 = extraout_x8;
  if (unaff_x20[3] != unaff_x20[1]) {
    func_0x007af088();
  }
  uVar1 = unaff_x20[4];
  uVar2 = unaff_x20[5];
  in_stack_00000038 = unaff_x20[1];
  uStack0000000000000030 = *unaff_x20;
  in_stack_00000048 = unaff_x20[3];
  in_stack_00000040 = unaff_x20[2];
  *(BADSPACEBASE **)(unaff_x29 + -0x38) = register0x00000008;
  *(undefined8 *)(unaff_x29 + -0x30) = uVar2;
  *(undefined8 *)(unaff_x29 + -0x28) = uVar1;
  func_0x004b56a4(&uStack0000000000000030,unaff_x29 + -0x38);
  unaff_x19[1] = in_stack_00000008;
  *unaff_x19 = in_stack_00000000;
  unaff_x19[3] = in_stack_00000018;
  unaff_x19[2] = in_stack_00000010;
  unaff_x19[5] = in_stack_00000028;
  unaff_x19[4] = in_stack_00000020;
  return;
}

