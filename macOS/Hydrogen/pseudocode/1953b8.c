
void FUN_001953b8(void)

{
  long unaff_x19;
  long unaff_x22;
  long in_stack_00000008;
  
  _CFRelease();
  for (; unaff_x22 != 0; unaff_x22 = unaff_x22 + -1) {
    func_0x0019fb28(unaff_x19);
    func_0x0019e6a4(unaff_x19 + 8);
    unaff_x19 = unaff_x19 + 0x10;
  }
  if (in_stack_00000008 != 0) {
    func_0x00187bd4();
  }
  return;
}

