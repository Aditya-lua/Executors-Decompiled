
void FUN_0064827c(undefined8 param_1,long *param_2,undefined8 param_3)

{
  long *plVar1;
  long *plVar2;
  undefined8 uVar3;
  
  plVar1 = (long *)(**(code **)(*param_2 + 0x10))();
  plVar2 = (long *)(**(code **)(*param_2 + 0x40))(param_2);
  uVar3 = (**(code **)(*plVar1 + 0x88))(plVar1);
                    /* WARNING: Could not recover jumptable at 0x006482e8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(*plVar2 + 0x40))(param_1,plVar2,uVar3,param_3);
  return;
}

