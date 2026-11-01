
void FUN_005a7a3c(void)

{
  long lVar1;
  long *plVar2;
  long unaff_x19;
  undefined8 unaff_x20;
  long unaff_x21;
  undefined8 *unaff_x23;
  long unaff_x25;
  undefined8 *unaff_x26;
  ulong unaff_x28;
  long in_stack_00000010;
  undefined8 in_stack_00000018;
  undefined8 in_stack_00000020;
  undefined2 in_stack_00000028;
  undefined8 in_stack_00000030;
  undefined8 in_stack_00000038;
  
  _memmove(unaff_x21 + 0x380 + unaff_x19 * 8 + 0x10,unaff_x21 + 0x380 + in_stack_00000010);
  *unaff_x23 = unaff_x20;
  *(undefined8 *)(unaff_x21 + unaff_x28 * 8 + 0x380) = in_stack_00000038;
  *(undefined2 *)(unaff_x21 + 0x37a) = in_stack_00000028;
  if (unaff_x28 < unaff_x25 + 2U) {
    lVar1 = unaff_x19 + 0x71;
    do {
      plVar2 = *(long **)(unaff_x21 + lVar1 * 8);
      *plVar2 = unaff_x21;
      *(short *)(plVar2 + 0x6f) = (short)lVar1 + -0x70;
      lVar1 = lVar1 + 1;
    } while (lVar1 - unaff_x25 != 0x72);
  }
  *unaff_x26 = in_stack_00000020;
  unaff_x26[1] = in_stack_00000030;
  unaff_x26[2] = in_stack_00000018;
  return;
}

