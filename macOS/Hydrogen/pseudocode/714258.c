
void FUN_00714258(long param_1)

{
  ulong in_x9;
  ulong in_x10;
  long in_x11;
  long lVar1;
  long lVar2;
  long unaff_x19;
  long unaff_x20;
  undefined8 unaff_x21;
  long *in_stack_00000030;
  long in_stack_00000038;
  long *in_stack_00000048;
  long in_stack_00000050;
  
  lVar2 = *(long *)(param_1 + in_x9 * 0x10);
  if (lVar2 != in_x11) {
    lVar1 = 1;
    do {
      if (lVar2 == unaff_x20) goto LAB_007142a4;
      in_x9 = in_x9 + lVar1 & in_x10;
      lVar2 = *(long *)(param_1 + in_x9 * 0x10);
      lVar1 = lVar1 + 1;
    } while (lVar2 != in_x11);
  }
  *(long *)(param_1 + in_x9 * 0x10) = unaff_x20;
  *(long *)(unaff_x19 + 0x428) = *(long *)(unaff_x19 + 0x428) + 1;
LAB_007142a4:
  *(undefined8 *)(param_1 + in_x9 * 0x10 + 8) = unaff_x21;
  lVar2 = *in_stack_00000030 + in_stack_00000038 * 8;
  if (lVar2 != in_stack_00000030[1]) {
    in_stack_00000030[1] = lVar2;
  }
  lVar2 = *in_stack_00000048 + in_stack_00000050 * 8;
  if (lVar2 != in_stack_00000048[1]) {
    in_stack_00000048[1] = lVar2;
  }
  return;
}

