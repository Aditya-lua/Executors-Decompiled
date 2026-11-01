
void FUN_0069247c(void)

{
  ulong in_stack_00000070;
  ulong in_stack_00000078;
  long in_stack_00000080;
  
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
  return;
}

