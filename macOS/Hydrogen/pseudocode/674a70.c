
void FUN_00674a70(long *param_1)

{
  long *plVar1;
  
  plVar1 = (long *)(**(code **)(*param_1 + 0x160))();
                    /* WARNING: Could not recover jumptable at 0x00674ab0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(*plVar1 + 0x138))();
  return;
}

