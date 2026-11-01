
void FUN_002caa58(ulong param_1)

{
  long *plVar1;
  ulong in_x9;
  ulong *in_x10;
  long in_x11;
  ulong *in_x12;
  ulong in_x13;
  ulong in_x14;
  long unaff_x29;
  
  while( true ) {
    *in_x10 = in_x14 | in_x13;
    in_x11 = in_x11 + -1;
    if (in_x11 == 0) break;
    in_x13 = *in_x12 & param_1;
    in_x14 = in_x10[1] & in_x9;
    in_x10 = in_x10 + 1;
    in_x12 = in_x12 + 1;
  }
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x28)) {
    return;
  }
  ___stack_chk_fail(1);
  plVar1 = (long *)_abort();
                    /* WARNING: Could not recover jumptable at 0x002caab0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(*plVar1 + 0x68))();
  return;
}

