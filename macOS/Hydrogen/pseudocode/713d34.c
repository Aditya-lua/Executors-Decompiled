
void FUN_00713d34(long param_1)

{
  long *plVar1;
  ulong in_x9;
  ulong in_x10;
  long in_x11;
  long in_x12;
  long lVar2;
  long lVar3;
  long unaff_x19;
  long unaff_x20;
  undefined8 unaff_x21;
  long unaff_x29;
  long *in_stack_00000058;
  long in_stack_00000060;
  long *in_stack_00000070;
  long in_stack_00000078;
  
  lVar3 = *(long *)(param_1 + in_x12);
  if (lVar3 != in_x11) {
    lVar2 = 1;
    do {
      if (lVar3 == unaff_x20) goto LAB_00713d7c;
      in_x9 = in_x9 + lVar2 & in_x10;
      lVar3 = *(long *)(param_1 + in_x9 * 0x10);
      lVar2 = lVar2 + 1;
    } while (lVar3 != in_x11);
  }
  *(long *)(param_1 + in_x9 * 0x10) = unaff_x20;
  *(long *)(unaff_x19 + 0x428) = *(long *)(unaff_x19 + 0x428) + 1;
LAB_00713d7c:
  *(undefined8 *)(param_1 + in_x9 * 0x10 + 8) = unaff_x21;
  lVar3 = *in_stack_00000058 + in_stack_00000060 * 8;
  if (lVar3 != in_stack_00000058[1]) {
    in_stack_00000058[1] = lVar3;
  }
  lVar3 = *in_stack_00000070 + in_stack_00000078 * 8;
  if (lVar3 != in_stack_00000070[1]) {
    in_stack_00000070[1] = lVar3;
  }
  plVar1 = *(long **)(unaff_x29 + -0x70);
  lVar3 = *plVar1 + *(long *)(unaff_x29 + -0x68) * 8;
  if (lVar3 != plVar1[1]) {
    plVar1[1] = lVar3;
  }
  plVar1 = *(long **)(unaff_x29 + -0x88);
  lVar3 = *plVar1 + *(long *)(unaff_x29 + -0x80) * 0x28;
  if (lVar3 != plVar1[1]) {
    plVar1[1] = lVar3;
  }
  return;
}

