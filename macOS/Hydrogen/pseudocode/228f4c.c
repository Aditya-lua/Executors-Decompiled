
void FUN_00228f4c(void)

{
  undefined8 *unaff_x19;
  long unaff_x25;
  long unaff_x29;
  undefined8 uVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  long in_stack_00000008;
  undefined8 in_stack_00000010;
  undefined8 in_stack_000001b0;
  
  func_0x001d9f3c(unaff_x29 + -0x88);
  uVar1 = *(undefined8 *)(unaff_x25 + 0x80);
  uVar3 = *(undefined8 *)(unaff_x25 + 0x98);
  uVar2 = *(undefined8 *)(unaff_x25 + 0x90);
  unaff_x19[1] = *(undefined8 *)(unaff_x25 + 0x88);
  *unaff_x19 = uVar1;
  unaff_x19[3] = uVar3;
  unaff_x19[2] = uVar2;
  uVar1 = *(undefined8 *)(unaff_x25 + 0xa0);
  unaff_x19[5] = *(undefined8 *)(unaff_x25 + 0xa8);
  unaff_x19[4] = uVar1;
  unaff_x19[6] = in_stack_000001b0;
  if ((in_stack_00000008 != -0x8000000000000000) && (in_stack_00000008 != 0)) {
    func_0x00187bd4(in_stack_00000010,in_stack_00000008,1);
  }
  return;
}

