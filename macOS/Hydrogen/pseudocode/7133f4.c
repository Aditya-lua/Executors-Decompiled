
void FUN_007133f4(long param_1)

{
  long lVar1;
  long lVar2;
  long *plVar3;
  long extraout_x8;
  undefined8 extraout_x9;
  undefined8 in_x9;
  long unaff_x29;
  long *in_stack_000000a0;
  long in_stack_000000a8;
  long *in_stack_000000b8;
  long in_stack_000000c0;
  
  do {
    *(undefined8 *)(param_1 + 8) = in_x9;
    lVar1 = *in_stack_000000a0 + in_stack_000000a8 * 8;
    if (lVar1 == in_stack_000000a0[1]) {
      lVar1 = *in_stack_000000b8 + in_stack_000000c0 * 8;
      if (lVar1 != in_stack_000000b8[1]) goto code_r0x00713428;
LAB_007133c8:
      plVar3 = *(long **)(unaff_x29 + -200);
      lVar1 = plVar3[1];
      lVar2 = *plVar3 + *(long *)(unaff_x29 + -0xc0) * 0x28;
      if (lVar2 != lVar1) {
LAB_007133e0:
        func_0x007b1e7c(lVar1,lVar2,plVar3 + 1);
      }
    }
    else {
      in_stack_000000a0[1] = lVar1;
      lVar1 = *in_stack_000000b8 + in_stack_000000c0 * 8;
      if (lVar1 == in_stack_000000b8[1]) goto LAB_007133c8;
code_r0x00713428:
      in_stack_000000b8[1] = lVar1;
      plVar3 = *(long **)(unaff_x29 + -200);
      lVar1 = plVar3[1];
      lVar2 = *plVar3 + *(long *)(unaff_x29 + -0xc0) * 0x28;
      if (lVar2 != lVar1) goto LAB_007133e0;
    }
    __Unwind_Resume();
    param_1 = extraout_x8;
    in_x9 = extraout_x9;
  } while( true );
}

