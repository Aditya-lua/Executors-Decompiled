
long FUN_0060fa50(undefined8 param_1,undefined8 param_2,undefined8 param_3)

{
  long unaff_x19;
  ulong in_stack_00000010;
  ulong in_stack_00000018;
  long in_stack_00000020;
  
  func_0x00607398(param_2,param_3);
  func_0x005ffccc(unaff_x19 + 0x48);
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
  return unaff_x19 + 0x48;
}

