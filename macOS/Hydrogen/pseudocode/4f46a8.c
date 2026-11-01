
void FUN_004f46a8(long param_1)

{
  long lVar1;
  ulong in_x9;
  undefined2 in_w10;
  long *plVar2;
  long unaff_x21;
  undefined8 unaff_x22;
  long unaff_x26;
  ulong unaff_x27;
  long unaff_x28;
  undefined8 in_stack_00000000;
  undefined8 in_stack_00000008;
  undefined8 in_stack_00000010;
  undefined8 *in_stack_00000018;
  
  *(undefined8 *)(param_1 + 0x170) = unaff_x22;
  *(undefined2 *)(unaff_x28 + 0x16a) = in_w10;
  if (unaff_x27 < in_x9) {
    lVar1 = unaff_x26 + 0x2f;
    do {
      plVar2 = *(long **)(unaff_x28 + lVar1 * 8);
      *plVar2 = unaff_x28;
      *(short *)(plVar2 + 0x2d) = (short)lVar1 + -0x2e;
      lVar1 = lVar1 + 1;
    } while (lVar1 - unaff_x21 != 0x30);
  }
  *in_stack_00000018 = in_stack_00000008;
  in_stack_00000018[1] = in_stack_00000000;
  in_stack_00000018[2] = in_stack_00000010;
  return;
}

