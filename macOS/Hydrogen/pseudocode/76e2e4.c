
undefined8 FUN_0076e2e4(void)

{
  long unaff_x19;
  long unaff_x21;
  undefined8 unaff_x22;
  undefined1 auVar1 [16];
  long in_stack_00000008;
  
  func_0x0073c8fc();
  if (unaff_x21 - in_stack_00000008 == 0) {
    *(undefined8 *)(unaff_x19 + 0x10) = 0;
    *(undefined8 *)(unaff_x19 + 0x18) = 0;
    *(undefined8 *)(unaff_x19 + 0x20) = 0;
    auVar1 = func_0x00782d28();
    *(undefined1 (*) [16])(unaff_x19 + 0x28) = auVar1;
    return 0;
  }
  *(long *)(unaff_x19 + 0x18) = unaff_x21 - in_stack_00000008;
  *(long *)(unaff_x19 + 0x20) = unaff_x21;
  *(undefined8 *)(unaff_x19 + 0x10) = unaff_x22;
  return 0;
}

