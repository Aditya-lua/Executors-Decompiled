
void FUN_0027c14c(void)

{
  undefined8 *unaff_x20;
  undefined8 unaff_x23;
  undefined8 unaff_x24;
  long in_stack_00000010;
  undefined8 in_stack_00000018;
  undefined8 in_stack_00000020;
  undefined8 in_stack_00000028;
  
  func_0x0026fec8();
  if (in_stack_00000010 == 0) {
    func_0x002d8de8();
    unaff_x20[1] = &UNK_0082e4ad;
    unaff_x20[2] = 0xf;
    *unaff_x20 = 0;
  }
  else {
    unaff_x20[2] = in_stack_00000018;
    unaff_x20[1] = in_stack_00000010;
    unaff_x20[4] = in_stack_00000028;
    unaff_x20[3] = in_stack_00000020;
    *unaff_x20 = unaff_x23;
    unaff_x20[5] = unaff_x24;
  }
  func_0x0029bc0c();
  func_0x002c7740();
  func_0x002c6434();
  return;
}

