
void FUN_005b7000(void)

{
  long lVar1;
  long unaff_x19;
  long *in_stack_00000040;
  
  func_0x005adc80();
  lVar1 = *in_stack_00000040;
  *in_stack_00000040 = lVar1 + -1;
  LORelease();
  if (lVar1 == 1) {
    func_0x005d2c74(unaff_x19 + 0x40);
  }
  return;
}

