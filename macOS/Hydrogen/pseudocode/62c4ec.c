
undefined8 FUN_0062c4ec(void)

{
  undefined8 uVar1;
  long unaff_x19;
  ulong in_stack_00000008;
  ulong in_stack_00000010;
  long in_stack_00000018;
  
  uVar1 = func_0x00677180(unaff_x19 + 0x38);
  if (in_stack_00000010 <= in_stack_00000008) {
    in_stack_00000008 = in_stack_00000010;
  }
  if (in_stack_00000018 != 0) {
    if (in_stack_00000008 != 0) {
      do {
        *(undefined8 *)(in_stack_00000018 + -8 + in_stack_00000008 * 8) = 0;
        in_stack_00000008 = in_stack_00000008 - 1;
      } while (in_stack_00000008 != 0);
    }
    func_0x00611644();
  }
  return uVar1;
}

