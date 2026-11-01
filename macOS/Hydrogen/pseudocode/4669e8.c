
void FUN_004669e8(void)

{
  undefined2 unaff_w19;
  long unaff_x20;
  undefined8 unaff_x21;
  undefined8 unaff_x22;
  long unaff_x29;
  undefined1 auVar1 [16];
  undefined1 uStack000000000000000f;
  undefined8 uStack0000000000000020;
  undefined8 in_stack_00000028;
  undefined8 in_stack_00000030;
  
  if (uStack0000000000000020 == 0) {
    func_0x0045e7ec(unaff_x29 + -0x70,unaff_x29 + -0x50,&uStack000000000000000f,0x11);
  }
  else {
    *(undefined8 *)(unaff_x29 + -0x68) = in_stack_00000028;
    *(long *)(unaff_x29 + -0x70) = uStack0000000000000020;
    *(undefined8 *)(unaff_x20 + 0x10) = in_stack_00000030;
  }
  auVar1 = func_0x00460f28(*(undefined8 *)(unaff_x29 + -0x70),*(undefined8 *)(unaff_x29 + -0x68),
                           *(undefined2 *)(unaff_x20 + 0x10),unaff_w19,&uStack0000000000000020,4);
  *(undefined8 *)(unaff_x29 + -0x70) = unaff_x22;
  *(undefined8 *)(unaff_x29 + -0x68) = unaff_x21;
  *(undefined1 (*) [16])(unaff_x20 + 0x10) = auVar1;
  func_0x00468db8();
  return;
}

