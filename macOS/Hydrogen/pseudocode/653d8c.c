
void FUN_00653d8c(long param_1)

{
  ulong in_stack_00000020;
  ulong in_stack_00000028;
  long in_stack_00000030;
  long *in_stack_00000040;
  
  (**(code **)(param_1 + 0x1a8))();
  if (in_stack_00000040 != (long *)0x0) {
    (**(code **)(*in_stack_00000040 + 8))();
  }
  if (in_stack_00000028 <= in_stack_00000020) {
    in_stack_00000020 = in_stack_00000028;
  }
  if (in_stack_00000030 != 0) {
    if (in_stack_00000020 != 0) {
      do {
        *(undefined1 *)(in_stack_00000030 + -1 + in_stack_00000020) = 0;
        in_stack_00000020 = in_stack_00000020 - 1;
      } while (in_stack_00000020 != 0);
    }
    func_0x00611644();
  }
  return;
}

