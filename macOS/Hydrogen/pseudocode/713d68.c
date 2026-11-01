
void FUN_00713d68(long param_1)

{
  long *plVar1;
  long in_x9;
  long lVar2;
  long unaff_x19;
  undefined8 unaff_x20;
  undefined8 unaff_x21;
  long unaff_x29;
  long *in_stack_00000058;
  long in_stack_00000060;
  long *in_stack_00000070;
  long in_stack_00000078;
  
  *(undefined8 *)(param_1 + in_x9 * 0x10) = unaff_x20;
  *(long *)(unaff_x19 + 0x428) = *(long *)(unaff_x19 + 0x428) + 1;
  *(undefined8 *)(param_1 + in_x9 * 0x10 + 8) = unaff_x21;
  lVar2 = *in_stack_00000058 + in_stack_00000060 * 8;
  if (lVar2 != in_stack_00000058[1]) {
    in_stack_00000058[1] = lVar2;
  }
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

