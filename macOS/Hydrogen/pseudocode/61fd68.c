
undefined8 FUN_0061fd68(void)

{
  undefined8 uVar1;
  long *unaff_x19;
  ulong in_stack_00000010;
  ulong in_stack_00000018;
  long in_stack_00000020;
  
  func_0x005fe0b4();
  (**(code **)(*unaff_x19 + 0x28))();
  uVar1 = (**(code **)(*unaff_x19 + 0x20))();
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
  return uVar1;
}

