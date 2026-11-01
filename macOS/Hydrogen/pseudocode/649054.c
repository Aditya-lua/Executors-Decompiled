
void FUN_00649054(long *param_1)

{
  long *plVar1;
  
  plVar1 = (long *)(**(code **)(*param_1 + 0x88))();
                    /* WARNING: Could not recover jumptable at 0x00649074. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(*plVar1 + 0xc0))(plVar1,1);
  return;
}

