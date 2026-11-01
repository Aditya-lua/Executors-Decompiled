
undefined8 FUN_005eeedc(long param_1)

{
  ulong uVar1;
  ulong *unaff_x19;
  undefined8 in_stack_00000000;
  ulong in_stack_00000028;
  ulong in_stack_00000030;
  long in_stack_00000038;
  
  uVar1 = (**(code **)(param_1 + 0x48))();
  *unaff_x19 = uVar1 & 0xffffffff;
  if (in_stack_00000030 <= in_stack_00000028) {
    in_stack_00000028 = in_stack_00000030;
  }
  if (in_stack_00000038 != 0) {
    if (in_stack_00000028 != 0) {
      do {
        *(undefined1 *)(in_stack_00000038 + -1 + in_stack_00000028) = 0;
        in_stack_00000028 = in_stack_00000028 - 1;
      } while (in_stack_00000028 != 0);
    }
    func_0x00611644();
  }
  return in_stack_00000000;
}

