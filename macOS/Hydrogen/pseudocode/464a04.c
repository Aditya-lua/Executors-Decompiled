
void FUN_00464a04(ulong param_1)

{
  ulong uVar1;
  undefined2 uVar2;
  undefined2 *unaff_x19;
  long unaff_x20;
  long in_stack_00000008;
  undefined8 uStack0000000000000030;
  ulong in_stack_00000038;
  ulong in_stack_00000040;
  ulong in_stack_00000048;
  
  if ((param_1 & 0xffff) != 1) {
    in_stack_00000008 = unaff_x20;
  }
  if ((param_1 & 1) == 0) {
    func_0x00464124(&uStack0000000000000030);
    uVar1 = in_stack_00000038;
    if (((int)uStack0000000000000030 == 1) && (in_stack_00000008 == 0)) {
      param_1 = (uStack0000000000000030 >> 0x20) << 0x10;
      in_stack_00000038 = in_stack_00000040;
      uStack0000000000000030 = uVar1;
      in_stack_00000040 = in_stack_00000048;
      uVar2 = 1;
      goto LAB_00464a7c;
    }
  }
  else if (in_stack_00000008 == 0) {
    param_1 = param_1 >> 0x10;
    uVar2 = 0;
LAB_00464a7c:
    *(ulong *)(unaff_x19 + 8) = in_stack_00000038;
    *(ulong *)(unaff_x19 + 4) = uStack0000000000000030;
    *(ulong *)(unaff_x19 + 0xc) = in_stack_00000040;
    *unaff_x19 = uVar2;
    *(int *)(unaff_x19 + 1) = (int)param_1;
    unaff_x19[3] = (short)(param_1 >> 0x20);
    return;
  }
  *(undefined1 *)(unaff_x19 + 1) = 3;
  *unaff_x19 = 2;
  return;
}

