
undefined8 FUN_004c22ac(void)

{
  long lVar1;
  long unaff_x19;
  long unaff_x20;
  long unaff_x21;
  long in_stack_00000120;
  undefined8 in_stack_00000128;
  
  lVar1 = **(long **)(unaff_x21 + 0x48);
  **(long **)(unaff_x21 + 0x48) = lVar1 + unaff_x20;
  LORelease();
  if (lVar1 == 1) {
    func_0x005d2c74(unaff_x19 + 0x48);
  }
  if (in_stack_00000120 != 0) {
    func_0x00187bd4(in_stack_00000128,in_stack_00000120 << 2,4);
  }
  return 1;
}

