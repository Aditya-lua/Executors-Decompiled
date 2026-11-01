
undefined8 FUN_00700eb4(void)

{
  long unaff_x24;
  undefined8 unaff_x25;
  undefined8 in_stack_00000000;
  long in_stack_00000008;
  long in_stack_00000010;
  undefined8 in_stack_00000018;
  long in_stack_00000020;
  long in_stack_00000028;
  
  func_0x006e3964();
  if (in_stack_00000020 != 0) {
    func_0x006f3a2c(in_stack_00000018,in_stack_00000020,in_stack_00000028 << 3,0);
  }
  if (in_stack_00000008 != 0) {
    func_0x006f3a2c(in_stack_00000000,in_stack_00000008,in_stack_00000010 << 3,0);
  }
  *(undefined8 *)(unaff_x24 + 0x40) = unaff_x25;
  return 1;
}

