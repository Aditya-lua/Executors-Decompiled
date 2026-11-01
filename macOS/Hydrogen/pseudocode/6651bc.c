
long FUN_006651bc(void)

{
  long unaff_x19;
  ulong in_stack_00000028;
  ulong in_stack_00000030;
  long in_stack_00000038;
  
  func_0x00611644();
  if (in_stack_00000030 <= in_stack_00000028) {
    in_stack_00000028 = in_stack_00000030;
  }
  if (in_stack_00000038 != 0) {
    if (in_stack_00000028 != 0) {
      do {
        *(undefined8 *)(in_stack_00000038 + -8 + in_stack_00000028 * 8) = 0;
        in_stack_00000028 = in_stack_00000028 - 1;
      } while (in_stack_00000028 != 0);
    }
    func_0x00611644();
  }
  return unaff_x19 + 0x58;
}

