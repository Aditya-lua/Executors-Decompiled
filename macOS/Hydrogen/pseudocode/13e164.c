
void FUN_0013e164(void)

{
  undefined8 *unaff_x20;
  long unaff_x21;
  undefined8 *unaff_x23;
  undefined8 uVar1;
  undefined8 in_stack_00000008;
  undefined8 in_stack_00000010;
  undefined8 in_stack_00000018;
  undefined8 in_stack_00000040;
  long in_stack_00000050;
  undefined8 in_stack_00000068;
  long in_stack_00000078;
  
  if (in_stack_00000078 < 0) {
    __ZdlPv(in_stack_00000068);
  }
  unaff_x20[1] = in_stack_00000010;
  *unaff_x20 = in_stack_00000008;
  unaff_x20[2] = in_stack_00000018;
  func_0x00143318();
  uVar1 = *unaff_x23;
  *(undefined8 *)(unaff_x21 + 0x70) = unaff_x23[1];
  *(undefined8 *)(unaff_x21 + 0x68) = uVar1;
  func_0x00139988();
  if (in_stack_00000078 < 0) {
    __ZdlPv(in_stack_00000068);
  }
  if (in_stack_00000050 < 0) {
    __ZdlPv(in_stack_00000040);
  }
  return;
}

