
void FUN_001239ac(void)

{
  int iVar1;
  undefined1 *unaff_x19;
  undefined8 *unaff_x22;
  undefined8 in_stack_00000010;
  undefined8 in_stack_00000018;
  undefined8 in_stack_00000020;
  undefined8 in_stack_00000028;
  undefined8 in_stack_00000030;
  undefined8 in_stack_00000038;
  undefined8 in_stack_00000040;
  undefined8 in_stack_00000048;
  undefined4 uStack0000000000000050;
  undefined8 uStack0000000000000054;
  
  iVar1 = func_0x0010c1d4();
  if (iVar1 != 0) {
    *unaff_x19 = 0;
  }
  unaff_x22[5] = in_stack_00000038;
  unaff_x22[4] = in_stack_00000030;
  unaff_x22[7] = in_stack_00000048;
  unaff_x22[6] = in_stack_00000040;
  *(undefined8 *)((long)unaff_x22 + 0x44) = uStack0000000000000054;
  *(ulong *)((long)unaff_x22 + 0x3c) = CONCAT44(uStack0000000000000050,in_stack_00000048._4_4_);
  unaff_x22[1] = in_stack_00000018;
  *unaff_x22 = in_stack_00000010;
  unaff_x22[3] = in_stack_00000028;
  unaff_x22[2] = in_stack_00000020;
  return;
}

