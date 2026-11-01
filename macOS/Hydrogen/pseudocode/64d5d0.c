
void FUN_0064d5d0(code *param_1)

{
  long *plVar1;
  
  plVar1 = (long *)(*param_1)();
                    /* WARNING: Could not recover jumptable at 0x0064d5e0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(*plVar1 + 0x20))();
  return;
}

