
void FUN_00609b3c(long param_1)

{
  long lStack0000000000000000;
  ulong in_stack_00000010;
  ulong in_stack_00000018;
  long in_stack_00000020;
  
  lStack0000000000000000 = param_1 + 0xd60;
  if (in_stack_00000018 <= in_stack_00000010) {
    in_stack_00000010 = in_stack_00000018;
  }
  if (in_stack_00000020 != 0) {
    if (in_stack_00000010 != 0) {
      do {
        *(undefined8 *)(in_stack_00000020 + -8 + in_stack_00000010 * 8) = 0;
        in_stack_00000010 = in_stack_00000010 - 1;
      } while (in_stack_00000010 != 0);
    }
    func_0x00611644();
  }
  return;
}

