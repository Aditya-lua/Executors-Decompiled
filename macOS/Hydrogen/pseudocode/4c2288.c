
undefined8 FUN_004c2288(long *param_1)

{
  long lVar1;
  long unaff_x19;
  long unaff_x21;
  long in_stack_00000120;
  undefined8 in_stack_00000128;
  
  lVar1 = *param_1;
  *param_1 = lVar1 + -1;
  LORelease();
  if (lVar1 == 1) {
    func_0x005d2c74(unaff_x19 + 0x40);
  }
  lVar1 = **(long **)(unaff_x21 + 0x48);
  **(long **)(unaff_x21 + 0x48) = lVar1 + -1;
  LORelease();
  if (lVar1 == 1) {
    func_0x005d2c74(unaff_x19 + 0x48);
  }
  if (in_stack_00000120 != 0) {
    func_0x00187bd4(in_stack_00000128,in_stack_00000120 << 2,4);
  }
  return 1;
}

