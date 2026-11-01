
void FUN_00713368(long *param_1,long param_2,long param_3)

{
  long extraout_x8;
  undefined8 extraout_x9;
  long lVar1;
  long unaff_x29;
  long *in_stack_000000a0;
  long in_stack_000000a8;
  long *in_stack_000000b8;
  long in_stack_000000c0;
  
  if (param_3 != param_2) goto LAB_007133e0;
  do {
    while( true ) {
      __Unwind_Resume();
      *(undefined8 *)(extraout_x8 + 8) = extraout_x9;
      lVar1 = *in_stack_000000a0 + in_stack_000000a8 * 8;
      if (lVar1 != in_stack_000000a0[1]) break;
      lVar1 = *in_stack_000000b8 + in_stack_000000c0 * 8;
      if (lVar1 != in_stack_000000b8[1]) goto LAB_00713428;
LAB_007133c8:
      param_1 = *(long **)(unaff_x29 + -200);
      param_2 = param_1[1];
      param_3 = *param_1 + *(long *)(unaff_x29 + -0xc0) * 0x28;
      if (param_3 != param_2) goto LAB_007133e0;
    }
    in_stack_000000a0[1] = lVar1;
    lVar1 = *in_stack_000000b8 + in_stack_000000c0 * 8;
    if (lVar1 == in_stack_000000b8[1]) goto LAB_007133c8;
LAB_00713428:
    in_stack_000000b8[1] = lVar1;
    param_1 = *(long **)(unaff_x29 + -200);
    param_2 = param_1[1];
    param_3 = *param_1 + *(long *)(unaff_x29 + -0xc0) * 0x28;
    if (param_3 != param_2) {
LAB_007133e0:
      func_0x007b1e7c(param_2,param_3,param_1 + 1);
    }
  } while( true );
}

