
void FUN_0064a29c(undefined8 param_1,long *param_2)

{
  long *plVar1;
  long *plVar2;
  undefined8 uVar3;
  long *unaff_x21;
  
  plVar1 = (long *)(**(code **)(*param_2 + 0x10))();
  plVar2 = (long *)(**(code **)(*plVar1 + 0x90))();
  uVar3 = (**(code **)(*plVar1 + 0x88))(plVar1);
  (**(code **)(*unaff_x21 + 0x40))();
                    /* WARNING: Could not recover jumptable at 0x0064a314. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(*plVar2 + 0x48))(param_1,plVar2,uVar3);
  return;
}

