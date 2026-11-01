
void FUN_0061b5e8(long param_1)

{
  long *plVar1;
  
  plVar1 = (long *)(**(code **)(param_1 + 0x80))();
                    /* WARNING: Could not recover jumptable at 0x0061b5fc. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(*plVar1 + 0x10))();
  return;
}

