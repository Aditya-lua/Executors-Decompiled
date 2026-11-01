
void FUN_005f04e0(code *param_1)

{
  long *plVar1;
  
  plVar1 = (long *)(*param_1)();
  if (plVar1 == (long *)0x0) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x005f0500. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(*plVar1 + 0x50))();
  return;
}

