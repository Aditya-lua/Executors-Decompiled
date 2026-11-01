
undefined8 FUN_0067e5c8(long param_1)

{
  undefined8 uVar1;
  ulong in_stack_00000070;
  ulong in_stack_00000078;
  long in_stack_00000080;
  
  uVar1 = (**(code **)(param_1 + 0xf8))();
  if (in_stack_00000078 <= in_stack_00000070) {
    in_stack_00000070 = in_stack_00000078;
  }
  if (in_stack_00000080 != 0) {
    if (in_stack_00000070 != 0) {
      do {
        *(undefined8 *)(in_stack_00000080 + -8 + in_stack_00000070 * 8) = 0;
        in_stack_00000070 = in_stack_00000070 - 1;
      } while (in_stack_00000070 != 0);
    }
    func_0x00611644();
  }
  return uVar1;
}

