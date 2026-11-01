
void FUN_006496e4(long *param_1,undefined8 param_2)

{
  long *plVar1;
  undefined8 uVar2;
  
  plVar1 = (long *)(**(code **)(*param_1 + 0x90))();
  uVar2 = (**(code **)(*param_1 + 0x88))(param_1);
                    /* WARNING: Could not recover jumptable at 0x0064972c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(*plVar1 + 0x38))(plVar1,uVar2,param_2);
  return;
}

