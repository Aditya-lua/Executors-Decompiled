
void FUN_00659d04(void)

{
  ulong in_stack_00000020;
  ulong in_stack_00000028;
  long in_stack_00000030;
  ulong in_stack_00000050;
  ulong in_stack_00000058;
  long in_stack_00000060;
  
  func_0x00659e44();
  if (in_stack_00000058 <= in_stack_00000050) {
    in_stack_00000050 = in_stack_00000058;
  }
  if (in_stack_00000060 != 0) {
    if (in_stack_00000050 != 0) {
      do {
        *(undefined8 *)(in_stack_00000060 + -8 + in_stack_00000050 * 8) = 0;
        in_stack_00000050 = in_stack_00000050 - 1;
      } while (in_stack_00000050 != 0);
    }
    func_0x00611644();
  }
  if (in_stack_00000028 <= in_stack_00000020) {
    in_stack_00000020 = in_stack_00000028;
  }
  if (in_stack_00000030 != 0) {
    if (in_stack_00000020 != 0) {
      do {
        *(undefined8 *)(in_stack_00000030 + -8 + in_stack_00000020 * 8) = 0;
        in_stack_00000020 = in_stack_00000020 - 1;
      } while (in_stack_00000020 != 0);
    }
    func_0x00611644();
  }
  return;
}

