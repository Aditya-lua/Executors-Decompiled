
void FUN_00713f08(void)

{
  undefined8 uVar1;
  long *plVar2;
  long *extraout_x8;
  long lVar3;
  long extraout_x9;
  long unaff_x29;
  long *in_stack_00000058;
  long in_stack_00000060;
  long *in_stack_00000070;
  long in_stack_00000078;
  
  uVar1 = __Unwind_Resume();
  lVar3 = *in_stack_00000058 + in_stack_00000060 * 8;
  if (lVar3 != in_stack_00000058[1]) goto LAB_00713f7c;
  lVar3 = *in_stack_00000070 + in_stack_00000078 * 8;
  if (lVar3 != in_stack_00000070[1]) goto LAB_00713f98;
LAB_00713f40:
  plVar2 = *(long **)(unaff_x29 + -0x70);
  lVar3 = *plVar2 + *(long *)(unaff_x29 + -0x68) * 8;
  if (lVar3 != plVar2[1]) goto code_r0x00713fb4;
code_r0x00713f54:
  plVar2 = *(long **)(unaff_x29 + -0x88);
  lVar3 = *plVar2 + *(long *)(unaff_x29 + -0x80) * 0x28;
  if (lVar3 == plVar2[1]) goto code_r0x00713f74;
  do {
    plVar2[1] = lVar3;
code_r0x00713f74:
    do {
      __Unwind_Resume(uVar1);
      in_stack_00000058 = extraout_x8;
      lVar3 = extraout_x9;
LAB_00713f7c:
      in_stack_00000058[1] = lVar3;
      lVar3 = *in_stack_00000070 + in_stack_00000078 * 8;
      if (lVar3 == in_stack_00000070[1]) goto LAB_00713f40;
LAB_00713f98:
      in_stack_00000070[1] = lVar3;
      plVar2 = *(long **)(unaff_x29 + -0x70);
      lVar3 = *plVar2 + *(long *)(unaff_x29 + -0x68) * 8;
      if (lVar3 == plVar2[1]) goto code_r0x00713f54;
code_r0x00713fb4:
      plVar2[1] = lVar3;
      plVar2 = *(long **)(unaff_x29 + -0x88);
      lVar3 = *plVar2 + *(long *)(unaff_x29 + -0x80) * 0x28;
    } while (lVar3 == plVar2[1]);
  } while( true );
}

