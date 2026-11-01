
void FUN_00686c34(long param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,
                 undefined8 param_5)

{
  long *plVar1;
  
  plVar1 = (long *)(*(long *)(param_1 + 8) + 8);
                    /* WARNING: Could not recover jumptable at 0x00686c4c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(*plVar1 + 0x58))(plVar1,param_3,0,param_4,param_5,0x10);
  return;
}

