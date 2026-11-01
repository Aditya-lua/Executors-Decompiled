
void FUN_006425a8(long *param_1,undefined8 param_2)

{
  long *plVar1;
  
  plVar1 = (long *)(**(code **)(*param_1 + 0x10))();
                    /* WARNING: Could not recover jumptable at 0x006425d0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(*plVar1 + 0x58))(plVar1,param_2);
  return;
}

