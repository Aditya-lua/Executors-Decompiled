
void thunk_FUN_00713354(undefined8 param_1)

{
  long lVar1;
  long lVar2;
  long *plVar3;
  long extraout_x8;
  undefined8 extraout_x9;
  long unaff_x29;
  long *in_stack_000000a0;
  long in_stack_000000a8;
  long *in_stack_000000b8;
  long in_stack_000000c0;
  
  plVar3 = *(long **)(unaff_x29 + -200);
  lVar1 = plVar3[1];
  lVar2 = *plVar3 + *(long *)(unaff_x29 + -0xc0) * 0x28;
  if (lVar2 != lVar1) goto LAB_007133e0;
  do {
    while( true ) {
      __Unwind_Resume(param_1);
      *(undefined8 *)(extraout_x8 + 8) = extraout_x9;
      lVar1 = *in_stack_000000a0 + in_stack_000000a8 * 8;
      if (lVar1 != in_stack_000000a0[1]) break;
      lVar1 = *in_stack_000000b8 + in_stack_000000c0 * 8;
      if (lVar1 != in_stack_000000b8[1]) goto LAB_00713428;
LAB_007133c8:
      plVar3 = *(long **)(unaff_x29 + -200);
      lVar1 = plVar3[1];
      lVar2 = *plVar3 + *(long *)(unaff_x29 + -0xc0) * 0x28;
      if (lVar2 != lVar1) goto LAB_007133e0;
    }
    in_stack_000000a0[1] = lVar1;
    lVar1 = *in_stack_000000b8 + in_stack_000000c0 * 8;
    if (lVar1 == in_stack_000000b8[1]) goto LAB_007133c8;
LAB_00713428:
    in_stack_000000b8[1] = lVar1;
    plVar3 = *(long **)(unaff_x29 + -200);
    lVar1 = plVar3[1];
    lVar2 = *plVar3 + *(long *)(unaff_x29 + -0xc0) * 0x28;
    if (lVar2 != lVar1) {
LAB_007133e0:
      func_0x007b1e7c(lVar1,lVar2,plVar3 + 1);
    }
  } while( true );
}

