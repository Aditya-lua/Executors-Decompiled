
undefined8 FUN_006c5d0c(void)

{
  undefined8 uVar1;
  undefined8 uVar2;
  undefined4 in_w8;
  undefined4 in_w9;
  undefined8 *unaff_x19;
  long unaff_x20;
  int unaff_w21;
  undefined8 unaff_x22;
  long in_stack_00000000;
  undefined4 in_stack_00000008;
  
  if (unaff_w21 == 0) {
    in_w9 = in_w8;
  }
  uVar1 = func_0x006c5ed4();
  uVar2 = func_0x006b2784(*unaff_x19);
  if ((*(uint *)(unaff_x20 + 0x1c) & 0xfffffffe) == 0xc) {
    func_0x006b1f78(*unaff_x19,in_w9,uVar1,0);
    uVar1 = unaff_x22;
  }
  else {
    func_0x006b1f78(*unaff_x19,in_w9);
  }
  func_0x006b24c4(*unaff_x19,uVar1);
  *(undefined4 *)(in_stack_00000000 + 0x484) = in_stack_00000008;
  return uVar2;
}

