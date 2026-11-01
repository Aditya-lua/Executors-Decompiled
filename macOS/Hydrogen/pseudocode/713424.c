
void FUN_00713424(long *param_1)

{
  undefined1 in_ZR;
  long lVar1;
  long lVar2;
  long *plVar3;
  long extraout_x8;
  undefined8 extraout_x9;
  long in_x9;
  long unaff_x29;
  long *in_stack_000000a0;
  long in_stack_000000a8;
  long *in_stack_000000b8;
  long in_stack_000000c0;
  
code_r0x00713424:
  if ((bool)in_ZR) goto LAB_007133c8;
  do {
    param_1[1] = in_x9;
    plVar3 = *(long **)(unaff_x29 + -200);
    lVar1 = plVar3[1];
    lVar2 = *plVar3 + *(long *)(unaff_x29 + -0xc0) * 0x28;
    if (lVar2 != lVar1) goto LAB_007133e0;
    while( true ) {
      __Unwind_Resume();
      *(undefined8 *)(extraout_x8 + 8) = extraout_x9;
      lVar1 = *in_stack_000000a0 + in_stack_000000a8 * 8;
      param_1 = in_stack_000000b8;
      if (lVar1 != in_stack_000000a0[1]) {
        in_stack_000000a0[1] = lVar1;
        in_x9 = *in_stack_000000b8 + in_stack_000000c0 * 8;
        in_ZR = in_x9 == in_stack_000000b8[1];
        goto code_r0x00713424;
      }
      in_x9 = *in_stack_000000b8 + in_stack_000000c0 * 8;
      if (in_x9 != in_stack_000000b8[1]) break;
LAB_007133c8:
      plVar3 = *(long **)(unaff_x29 + -200);
      lVar1 = plVar3[1];
      lVar2 = *plVar3 + *(long *)(unaff_x29 + -0xc0) * 0x28;
      if (lVar2 != lVar1) {
LAB_007133e0:
        func_0x007b1e7c(lVar1,lVar2,plVar3 + 1);
      }
    }
  } while( true );
}

