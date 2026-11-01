
void FUN_00713d9c(long param_1)

{
  long *plVar1;
  undefined8 in_x9;
  long lVar2;
  long unaff_x29;
  long *in_stack_00000070;
  long in_stack_00000078;
  
  *(undefined8 *)(param_1 + 8) = in_x9;
  lVar2 = *in_stack_00000070 + in_stack_00000078 * 8;
  if (lVar2 != in_stack_00000070[1]) {
    in_stack_00000070[1] = lVar2;
  }
  plVar1 = *(long **)(unaff_x29 + -0x70);
  lVar2 = *plVar1 + *(long *)(unaff_x29 + -0x68) * 8;
  if (lVar2 != plVar1[1]) {
    plVar1[1] = lVar2;
  }
  plVar1 = *(long **)(unaff_x29 + -0x88);
  lVar2 = *plVar1 + *(long *)(unaff_x29 + -0x80) * 0x28;
  if (lVar2 != plVar1[1]) {
    plVar1[1] = lVar2;
  }
  return;
}

