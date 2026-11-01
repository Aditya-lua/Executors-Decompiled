
void FUN_001817a8(undefined8 param_1,undefined8 param_2)

{
  undefined8 uVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  undefined8 *unaff_x23;
  undefined4 uStack0000000000000020;
  undefined8 uStack0000000000000028;
  undefined8 in_stack_00000030;
  undefined8 in_stack_00000038;
  undefined8 in_stack_00000040;
  undefined8 in_stack_00000048;
  undefined8 in_stack_00000050;
  
  uVar3 = in_stack_00000050;
  uVar2 = in_stack_00000048;
  uVar1 = in_stack_00000040;
  func_0x0016bfa0(&uStack0000000000000028,param_2,&UNK_009bfd70);
  *unaff_x23 = uStack0000000000000028;
  unaff_x23[2] = in_stack_00000038;
  unaff_x23[1] = in_stack_00000030;
  *(undefined1 *)(unaff_x23 + 3) = 0;
  *(undefined4 *)((long)unaff_x23 + 0x19) = uStack0000000000000020;
  *(int *)((long)unaff_x23 + 0x1c) = (int)((ulong)_uStack0000000000000020 >> 0x18);
  unaff_x23[4] = uVar1;
  unaff_x23[5] = uVar2;
  unaff_x23[6] = uVar3;
  return;
}

