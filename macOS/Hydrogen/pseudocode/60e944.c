
void FUN_0060e944(long param_1)

{
  ulong in_x9;
  ulong in_stack_00000010;
  
  if (in_x9 <= in_stack_00000010) {
    in_stack_00000010 = in_x9;
  }
  if (param_1 != 0) {
    if (in_stack_00000010 != 0) {
      do {
        *(undefined8 *)(param_1 + -8 + in_stack_00000010 * 8) = 0;
        in_stack_00000010 = in_stack_00000010 - 1;
      } while (in_stack_00000010 != 0);
    }
    func_0x00611644();
  }
  return;
}

