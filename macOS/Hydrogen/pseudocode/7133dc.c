
void FUN_007133dc(long *param_1,long param_2,long param_3)

{
  undefined1 in_ZR;
  long extraout_x8;
  undefined8 extraout_x9;
  long lVar1;
  long unaff_x29;
  long *in_stack_000000a0;
  long in_stack_000000a8;
  long *in_stack_000000b8;
  long in_stack_000000c0;
  
code_r0x007133dc:
  if ((bool)in_ZR) goto LAB_007133e8;
  do {
    func_0x007b1e7c(param_2,param_3,param_1 + 1);
LAB_007133e8:
    do {
      __Unwind_Resume();
      *(undefined8 *)(extraout_x8 + 8) = extraout_x9;
      lVar1 = *in_stack_000000a0 + in_stack_000000a8 * 8;
      if (lVar1 == in_stack_000000a0[1]) {
        lVar1 = *in_stack_000000b8 + in_stack_000000c0 * 8;
        if (lVar1 == in_stack_000000b8[1]) goto code_r0x007133c8;
      }
      else {
        in_stack_000000a0[1] = lVar1;
        lVar1 = *in_stack_000000b8 + in_stack_000000c0 * 8;
        if (lVar1 == in_stack_000000b8[1]) {
code_r0x007133c8:
          param_1 = *(long **)(unaff_x29 + -200);
          param_2 = param_1[1];
          param_3 = *param_1 + *(long *)(unaff_x29 + -0xc0) * 0x28;
          in_ZR = param_3 == param_2;
          goto code_r0x007133dc;
        }
      }
      in_stack_000000b8[1] = lVar1;
      param_1 = *(long **)(unaff_x29 + -200);
      param_2 = param_1[1];
      param_3 = *param_1 + *(long *)(unaff_x29 + -0xc0) * 0x28;
    } while (param_3 == param_2);
  } while( true );
}

