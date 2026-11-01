
void FUN_00523624(undefined1 param_1 [16])

{
  undefined8 *in_stack_00000008;
  ulong in_stack_00000010;
  undefined8 in_stack_00000038;
  long in_stack_00000040;
  undefined8 in_stack_00000048;
  
  in_stack_00000008[1] = param_1._8_8_;
  *in_stack_00000008 = param_1._0_8_;
  in_stack_00000008[2] = in_stack_00000038;
  if (((in_stack_00000010 & 0x100000000) != 0) && (in_stack_00000040 != 0)) {
    func_0x00187bd4(in_stack_00000048,in_stack_00000040 << 4,8);
  }
  return;
}

