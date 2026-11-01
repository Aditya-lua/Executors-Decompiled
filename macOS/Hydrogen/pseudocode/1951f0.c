
void FUN_001951f0(long param_1)

{
  long unaff_x19;
  long unaff_x22;
  long in_stack_00000008;
  undefined8 in_stack_00000010;
  
  for (; func_0x0019e6a4(param_1), unaff_x22 != 0; unaff_x22 = unaff_x22 + -1) {
    func_0x0019fb28(unaff_x19);
    param_1 = unaff_x19 + 8;
    unaff_x19 = unaff_x19 + 0x10;
  }
  if (in_stack_00000008 != 0) {
    func_0x00187bd4(in_stack_00000010,in_stack_00000008 << 4,8);
  }
  return;
}

