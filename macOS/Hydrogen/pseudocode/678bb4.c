
void FUN_00678bb4(long param_1)

{
  ulong in_stack_00000008;
  ulong in_stack_00000010;
  long in_stack_00000018;
  
  if (param_1 != in_stack_00000018) {
    _memcpy();
    param_1 = in_stack_00000018;
  }
  if (in_stack_00000010 <= in_stack_00000008) {
    in_stack_00000008 = in_stack_00000010;
  }
  if (param_1 != 0) {
    if (in_stack_00000008 != 0) {
      do {
        *(undefined8 *)(param_1 + -8 + in_stack_00000008 * 8) = 0;
        in_stack_00000008 = in_stack_00000008 - 1;
      } while (in_stack_00000008 != 0);
    }
    func_0x00611644();
  }
  return;
}

