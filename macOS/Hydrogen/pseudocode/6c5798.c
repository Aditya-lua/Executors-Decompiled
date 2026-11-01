
void FUN_006c5798(void)

{
  undefined4 uVar1;
  long unaff_x19;
  undefined8 *unaff_x20;
  ulong unaff_x21;
  long unaff_x22;
  undefined8 unaff_x26;
  long in_stack_00000008;
  undefined4 in_stack_00000010;
  
  if (unaff_x22 != 0) {
    __ZdlPv();
  }
  *(undefined8 *)(unaff_x19 + 8) = unaff_x26;
  uVar1 = 0x19;
  if ((unaff_x21 & 1) == 0) {
    uVar1 = 0x1a;
  }
  func_0x006b1f78(*unaff_x20,uVar1);
  *(undefined4 *)(in_stack_00000008 + 0x484) = in_stack_00000010;
  return;
}

