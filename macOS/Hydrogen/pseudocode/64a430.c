
void FUN_0064a430(long *param_1,undefined8 param_2)

{
  long *plVar1;
  long *plVar2;
  undefined8 uVar3;
  
  plVar1 = (long *)(**(code **)(*param_1 + 0x48))();
  plVar2 = (long *)(**(code **)(*param_1 + 0x10))(param_1);
  uVar3 = (**(code **)(*plVar2 + 0x88))();
                    /* WARNING: Could not recover jumptable at 0x0064a48c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(*plVar1 + 0x18))(plVar1,uVar3,param_2);
  return;
}

