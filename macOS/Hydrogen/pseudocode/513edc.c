
void FUN_00513edc(void)

{
  undefined8 uVar1;
  long unaff_x19;
  undefined8 *unaff_x20;
  undefined8 in_stack_00000008;
  undefined8 in_stack_00000010;
  undefined8 in_stack_00000018;
  
  func_0x004f39c8();
  *(long *)(*(long *)(unaff_x19 + 0x20) + 0x10) = *(long *)(*(long *)(unaff_x19 + 0x20) + 0x10) + 1;
  uVar1 = *(undefined8 *)(unaff_x19 + 0x20);
  *unaff_x20 = in_stack_00000008;
  unaff_x20[2] = in_stack_00000018;
  unaff_x20[1] = in_stack_00000010;
  unaff_x20[3] = uVar1;
  return;
}

