
void FUN_00090ab4(undefined8 param_1)

{
  long *plVar1;
  
  plVar1 = (long *)func_0x006e33ec(param_1,1);
                    /* WARNING: Could not recover jumptable at 0x00090ad0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(*plVar1 + 8))();
  return;
}

