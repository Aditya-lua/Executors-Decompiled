
void FUN_00713ed4(long *param_1)

{
  long extraout_x8;
  long *plVar1;
  long in_x9;
  long lVar2;
  undefined8 extraout_x9;
  long unaff_x29;
  long *in_stack_00000070;
  long in_stack_00000078;
  
  lVar2 = *param_1 + in_x9 * 0x28;
  if (lVar2 != param_1[1]) goto LAB_00713f6c;
  do {
    while( true ) {
      __Unwind_Resume();
      *(undefined8 *)(extraout_x8 + 8) = extraout_x9;
      lVar2 = *in_stack_00000070 + in_stack_00000078 * 8;
      if (lVar2 != in_stack_00000070[1]) break;
      plVar1 = *(long **)(unaff_x29 + -0x70);
      lVar2 = *plVar1 + *(long *)(unaff_x29 + -0x68) * 8;
      if (lVar2 != plVar1[1]) goto code_r0x00713fb4;
code_r0x00713f54:
      param_1 = *(long **)(unaff_x29 + -0x88);
      lVar2 = *param_1 + *(long *)(unaff_x29 + -0x80) * 0x28;
      if (lVar2 != param_1[1]) goto LAB_00713f6c;
    }
    in_stack_00000070[1] = lVar2;
    plVar1 = *(long **)(unaff_x29 + -0x70);
    lVar2 = *plVar1 + *(long *)(unaff_x29 + -0x68) * 8;
    if (lVar2 == plVar1[1]) goto code_r0x00713f54;
code_r0x00713fb4:
    plVar1[1] = lVar2;
    param_1 = *(long **)(unaff_x29 + -0x88);
    lVar2 = *param_1 + *(long *)(unaff_x29 + -0x80) * 0x28;
    if (lVar2 != param_1[1]) {
LAB_00713f6c:
      param_1[1] = lVar2;
    }
  } while( true );
}

