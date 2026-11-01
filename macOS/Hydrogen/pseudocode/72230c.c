
void FUN_0072230c(long param_1)

{
  ulong in_x9;
  ulong in_x10;
  long in_x11;
  long lVar1;
  long in_x13;
  long unaff_x19;
  long unaff_x20;
  undefined8 unaff_x22;
  long *in_stack_00000048;
  long in_stack_00000050;
  long *in_stack_00000060;
  long in_stack_00000068;
  
  lVar1 = 1;
  do {
    if (in_x13 == unaff_x20) goto LAB_00722348;
    in_x9 = in_x9 + lVar1 & in_x10;
    in_x13 = *(long *)(param_1 + in_x9 * 0x10);
    lVar1 = lVar1 + 1;
  } while (in_x13 != in_x11);
  *(long *)(param_1 + in_x9 * 0x10) = unaff_x20;
  *(long *)(unaff_x19 + 0x428) = *(long *)(unaff_x19 + 0x428) + 1;
LAB_00722348:
  *(undefined8 *)(param_1 + in_x9 * 0x10 + 8) = unaff_x22;
  lVar1 = *in_stack_00000048 + in_stack_00000050 * 8;
  if (lVar1 != in_stack_00000048[1]) {
    in_stack_00000048[1] = lVar1;
  }
  lVar1 = *in_stack_00000060 + in_stack_00000068 * 8;
  if (lVar1 != in_stack_00000060[1]) {
    in_stack_00000060[1] = lVar1;
  }
  return;
}

