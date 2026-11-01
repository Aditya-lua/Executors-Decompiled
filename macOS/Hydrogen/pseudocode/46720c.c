
void FUN_0046720c(void)

{
  undefined8 unaff_x22;
  undefined8 unaff_x23;
  long unaff_x29;
  undefined1 auVar1 [16];
  long in_stack_00000400;
  undefined8 in_stack_00000408;
  undefined8 in_stack_00000410;
  undefined1 auStack_7ffffffe [2147483646];
  
  func_0x004607dc(auStack_7ffffffe + 0x800003fe,unaff_x29 + -0x60);
  if (in_stack_00000400 == 0) {
    func_0x0045f3e4(unaff_x29 + -0x80,unaff_x29 + -0x60);
  }
  else {
    *(undefined8 *)(unaff_x29 + -0x78) = in_stack_00000408;
    *(long *)(unaff_x29 + -0x80) = in_stack_00000400;
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

