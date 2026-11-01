
void FUN_00466ee4(long param_1)

{
  undefined8 unaff_x22;
  undefined8 unaff_x23;
  long unaff_x29;
  undefined1 auVar1 [16];
  undefined8 in_stack_00000400;
  undefined8 in_stack_00000408;
  undefined8 in_stack_00000410;
  
  if (param_1 == 0) {
    func_0x0045f3e4(unaff_x29 + -0x80,unaff_x29 + -0x60);
  }
  else {
    *(undefined8 *)(unaff_x29 + -0x78) = in_stack_00000408;
    *(undefined8 *)(unaff_x29 + -0x80) = in_stack_00000400;
    *(undefined8 *)(unaff_x29 + -0x70) = in_stack_00000410;
  }
  auVar1 = func_0x00461074(*(undefined8 *)(unaff_x29 + -0x80),*(undefined8 *)(unaff_x29 + -0x78),
                           *(undefined2 *)(unaff_x29 + -0x70));
  *(undefined8 *)(unaff_x29 + -0x80) = unaff_x23;
  *(undefined8 *)(unaff_x29 + -0x78) = unaff_x22;
  *(undefined1 (*) [16])(unaff_x29 + -0x70) = auVar1;
  func_0x00468db8();
  return;
}

