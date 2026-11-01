
void FUN_004f4d04(void)

{
  long lVar1;
  long lVar2;
  long unaff_x19;
  long unaff_x20;
  long unaff_x21;
  long unaff_x23;
  long unaff_x24;
  long unaff_x25;
  ulong unaff_x26;
  undefined8 unaff_x27;
  undefined8 unaff_x28;
  undefined8 in_stack_00000010;
  undefined2 in_stack_00000028;
  undefined8 *in_stack_00000030;
  undefined8 in_stack_00000048;
  undefined8 in_stack_00000050;
  
  _memmove();
  *(undefined8 *)(unaff_x19 + unaff_x24) = in_stack_00000048;
  _memmove(unaff_x21 + 0x1c8 + unaff_x24 + 0x10,unaff_x21 + 0x1c8 + unaff_x25);
  *(undefined8 *)(unaff_x21 + unaff_x26 * 8 + 0x1c8) = in_stack_00000050;
  *(undefined2 *)(unaff_x21 + 0x1c2) = in_stack_00000028;
  if (unaff_x26 < unaff_x23 + 2U) {
    lVar1 = unaff_x20 + 0x3a;
    do {
      lVar2 = *(long *)(unaff_x21 + lVar1 * 8);
      *(long *)(lVar2 + 0x160) = unaff_x21;
      *(short *)(lVar2 + 0x1c0) = (short)lVar1 + -0x39;
      lVar1 = lVar1 + 1;
    } while (lVar1 - unaff_x23 != 0x3b);
  }
  *in_stack_00000030 = unaff_x27;
  in_stack_00000030[1] = in_stack_00000010;
  in_stack_00000030[2] = unaff_x28;
  return;
}

