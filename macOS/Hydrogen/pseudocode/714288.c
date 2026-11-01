
void FUN_00714288(long param_1)

{
  long lVar1;
  ulong in_x9;
  ulong in_x10;
  long in_x11;
  long in_x12;
  long in_x13;
  long unaff_x19;
  long unaff_x20;
  undefined8 unaff_x21;
  long *in_stack_00000030;
  long in_stack_00000038;
  long *in_stack_00000048;
  long in_stack_00000050;
  
  while (in_x13 != in_x11) {
    if (in_x13 == unaff_x20) goto code_r0x007142a4;
    in_x9 = in_x9 + in_x12 & in_x10;
    in_x12 = in_x12 + 1;
    in_x13 = *(long *)(param_1 + in_x9 * 0x10);
  }
  *(long *)(param_1 + in_x9 * 0x10) = unaff_x20;
  *(long *)(unaff_x19 + 0x428) = *(long *)(unaff_x19 + 0x428) + 1;
code_r0x007142a4:
  *(undefined8 *)(param_1 + in_x9 * 0x10 + 8) = unaff_x21;
  lVar1 = *in_stack_00000030 + in_stack_00000038 * 8;
  if (lVar1 != in_stack_00000030[1]) {
    in_stack_00000030[1] = lVar1;
  }
  lVar1 = *in_stack_00000048 + in_stack_00000050 * 8;
  if (lVar1 != in_stack_00000048[1]) {
    in_stack_00000048[1] = lVar1;
  }
  return;
}

