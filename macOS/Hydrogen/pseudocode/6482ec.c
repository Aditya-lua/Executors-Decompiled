
void FUN_006482ec(undefined8 param_1,long *param_2,undefined8 param_3,undefined8 param_4)

{
  long *plVar1;
  long *plVar2;
  undefined8 uVar3;
  undefined8 uVar4;
  
  plVar1 = (long *)(**(code **)(*param_2 + 0x10))();
  plVar2 = (long *)(**(code **)(*plVar1 + 0x90))();
  uVar3 = (**(code **)(*plVar1 + 0x88))(plVar1);
  uVar4 = (**(code **)(*param_2 + 0x40))(param_2);
                    /* WARNING: Could not recover jumptable at 0x00648384. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(*plVar2 + 0x48))(param_1,plVar2,uVar3,param_3,uVar4,param_4);
  return;
}

