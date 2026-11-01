
void FUN_00195680(void)

{
  long unaff_x20;
  long unaff_x22;
  long in_stack_00000018;
  undefined8 in_stack_00000020;
  
  while( true ) {
    func_0x0019e6a4(unaff_x20 + 8);
    if (unaff_x22 == 0) break;
    func_0x0019fb28(unaff_x20 + 0x10);
    unaff_x22 = unaff_x22 + -1;
    unaff_x20 = unaff_x20 + 0x10;
  }
  if (in_stack_00000018 != 0) {
    func_0x00187bd4(in_stack_00000020,in_stack_00000018 << 4,8);
  }
  return;
}

