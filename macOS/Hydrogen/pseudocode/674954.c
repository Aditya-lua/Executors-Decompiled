
void FUN_00674954(long *param_1)

{
  long *plVar1;
  
  plVar1 = (long *)(**(code **)(*param_1 + 0x160))();
                    /* WARNING: Could not recover jumptable at 0x00674978. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(*plVar1 + 0x80))();
  return;
}

