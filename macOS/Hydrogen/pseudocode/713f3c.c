
void FUN_00713f3c(long *param_1)

{
  bool in_ZR;
  long *plVar1;
  long extraout_x8;
  long in_x9;
  long lVar2;
  undefined8 extraout_x9;
  long unaff_x29;
  long *in_stack_00000070;
  long in_stack_00000078;
  
  if (!in_ZR) goto LAB_00713f98;
code_r0x00713f40:
  plVar1 = *(long **)(unaff_x29 + -0x70);
  lVar2 = *plVar1 + *(long *)(unaff_x29 + -0x68) * 8;
  if (lVar2 != plVar1[1]) goto LAB_00713fb4;
LAB_00713f54:
  plVar1 = *(long **)(unaff_x29 + -0x88);
  lVar2 = *plVar1 + *(long *)(unaff_x29 + -0x80) * 0x28;
  if (lVar2 == plVar1[1]) goto LAB_00713f74;
  do {
    plVar1[1] = lVar2;
LAB_00713f74:
    do {
      __Unwind_Resume();
      *(undefined8 *)(extraout_x8 + 8) = extraout_x9;
      in_x9 = *in_stack_00000070 + in_stack_00000078 * 8;
      param_1 = in_stack_00000070;
      if (in_x9 == in_stack_00000070[1]) goto code_r0x00713f40;
LAB_00713f98:
      param_1[1] = in_x9;
      plVar1 = *(long **)(unaff_x29 + -0x70);
      lVar2 = *plVar1 + *(long *)(unaff_x29 + -0x68) * 8;
      if (lVar2 == plVar1[1]) goto LAB_00713f54;
LAB_00713fb4:
      plVar1[1] = lVar2;
      plVar1 = *(long **)(unaff_x29 + -0x88);
      lVar2 = *plVar1 + *(long *)(unaff_x29 + -0x80) * 0x28;
    } while (lVar2 == plVar1[1]);
  } while( true );
}

