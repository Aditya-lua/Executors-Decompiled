
void FUN_0071343c(long *param_1,long param_2)

{
  long lVar1;
  long extraout_x8;
  undefined8 extraout_x9;
  long in_x9;
  long in_x10;
  long in_x11;
  long unaff_x29;
  long *in_stack_000000a0;
  long in_stack_000000a8;
  long *in_stack_000000b8;
  long in_stack_000000c0;
  
code_r0x0071343c:
  lVar1 = in_x11 + in_x9 * in_x10;
  if (lVar1 != param_2) goto LAB_007133e0;
LAB_007133e8:
  __Unwind_Resume();
  *(undefined8 *)(extraout_x8 + 8) = extraout_x9;
  lVar1 = *in_stack_000000a0 + in_stack_000000a8 * 8;
  if (lVar1 == in_stack_000000a0[1]) {
    lVar1 = *in_stack_000000b8 + in_stack_000000c0 * 8;
    if (lVar1 != in_stack_000000b8[1]) goto code_r0x00713428;
  }
  else {
    in_stack_000000a0[1] = lVar1;
    lVar1 = *in_stack_000000b8 + in_stack_000000c0 * 8;
    if (lVar1 != in_stack_000000b8[1]) goto code_r0x00713428;
  }
  param_1 = *(long **)(unaff_x29 + -200);
  param_2 = param_1[1];
  lVar1 = *param_1 + *(long *)(unaff_x29 + -0xc0) * 0x28;
  if (lVar1 != param_2) {
LAB_007133e0:
    func_0x007b1e7c(param_2,lVar1,param_1 + 1);
  }
  goto LAB_007133e8;
code_r0x00713428:
  in_stack_000000b8[1] = lVar1;
  param_1 = *(long **)(unaff_x29 + -200);
  in_x9 = *(long *)(unaff_x29 + -0xc0);
  in_x10 = 0x28;
  in_x11 = *param_1;
  param_2 = param_1[1];
  goto code_r0x0071343c;
}

