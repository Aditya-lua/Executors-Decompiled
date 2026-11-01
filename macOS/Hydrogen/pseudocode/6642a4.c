
undefined8 FUN_006642a4(void)

{
  ulong in_stack_00000030;
  ulong in_stack_00000038;
  long in_stack_00000040;
  
  func_0x00677180();
  if (in_stack_00000038 <= in_stack_00000030) {
    in_stack_00000030 = in_stack_00000038;
  }
  if (in_stack_00000040 != 0) {
    if (in_stack_00000030 != 0) {
      do {
        *(undefined8 *)(in_stack_00000040 + -8 + in_stack_00000030 * 8) = 0;
        in_stack_00000030 = in_stack_00000030 - 1;
      } while (in_stack_00000030 != 0);
    }
    func_0x00611644();
  }
  return 1;
}

