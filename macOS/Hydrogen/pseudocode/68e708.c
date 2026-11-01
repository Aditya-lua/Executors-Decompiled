
undefined8 FUN_0068e708(long param_1)

{
  ulong in_x9;
  long unaff_x19;
  ulong in_stack_00000018;
  
  if (in_x9 <= in_stack_00000018) {
    in_stack_00000018 = in_x9;
  }
  if (param_1 != 0) {
    if (in_stack_00000018 != 0) {
      do {
        *(undefined8 *)(param_1 + -8 + in_stack_00000018 * 8) = 0;
        in_stack_00000018 = in_stack_00000018 - 1;
      } while (in_stack_00000018 != 0);
    }
    func_0x00611644();
  }
  *(long *)(unaff_x19 + 0x98) = *(long *)(unaff_x19 + 0x98) + 1;
  return 1;
}

