
undefined8 FUN_0051e820(undefined8 param_1,undefined8 param_2)

{
  int iVar1;
  undefined8 uVar2;
  long unaff_x21;
  undefined1 uStack0000000000000008;
  undefined8 *in_stack_00000020;
  
  uVar2 = func_0x00536054(&uStack0000000000000008,param_2,unaff_x21 + 8);
  iVar1 = *(int *)(in_stack_00000020 + 2);
  *(int *)(in_stack_00000020 + 2) = iVar1 + -1;
  if (iVar1 + -1 == 0) {
    in_stack_00000020[1] = 0;
    func_0x00430048(*in_stack_00000020);
  }
  return uVar2;
}

