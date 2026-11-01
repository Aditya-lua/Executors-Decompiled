
void FUN_00400a1c(void)

{
  long lVar1;
  undefined8 in_x10;
  long *plVar2;
  undefined8 *in_x12;
  ulong unaff_x19;
  long unaff_x20;
  ulong unaff_x21;
  long unaff_x22;
  long unaff_x23;
  long unaff_x25;
  long unaff_x26;
  undefined2 in_stack_00000010;
  
  _memmove(unaff_x23 + unaff_x22 * 8 + 0x10,unaff_x23 + unaff_x19 * 8,(unaff_x20 - unaff_x22) * 8);
  *(undefined8 *)(unaff_x23 + unaff_x19 * 8) = in_x10;
  *(undefined2 *)(unaff_x26 + 0x21a) = in_stack_00000010;
  if (unaff_x19 < unaff_x21) {
    lVar1 = unaff_x22 + 0x45;
    do {
      plVar2 = *(long **)(unaff_x26 + lVar1 * 8);
      *plVar2 = unaff_x26;
      *(short *)(plVar2 + 0x43) = (short)lVar1 + -0x44;
      lVar1 = lVar1 + 1;
    } while (lVar1 - unaff_x20 != 0x46);
  }
  *(long *)(unaff_x25 + 0x10) = *(long *)(unaff_x25 + 0x10) + 1;
  *in_x12 = 0x8000000000000000;
  return;
}

