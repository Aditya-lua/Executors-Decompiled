
undefined8 FUN_0068e6f8(void)

{
  long unaff_x19;
  ulong in_stack_00000018;
  ulong in_stack_00000020;
  long in_stack_00000028;
  
  func_0x00611644();
  if (in_stack_00000020 <= in_stack_00000018) {
    in_stack_00000018 = in_stack_00000020;
  }
  if (in_stack_00000028 != 0) {
    if (in_stack_00000018 != 0) {
      do {
        *(undefined8 *)(in_stack_00000028 + -8 + in_stack_00000018 * 8) = 0;
        in_stack_00000018 = in_stack_00000018 - 1;
      } while (in_stack_00000018 != 0);
    }
    func_0x00611644();
  }
  *(long *)(unaff_x19 + 0x98) = *(long *)(unaff_x19 + 0x98) + 1;
  return 1;
}

