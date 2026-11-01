
void FUN_00648824(code *param_1)

{
  long *plVar1;
  long *plVar2;
  undefined8 uVar3;
  undefined8 uVar4;
  long *unaff_x20;
  
  plVar1 = (long *)(*param_1)();
  (**(code **)(*plVar1 + 0x48))();
  plVar1 = (long *)(**(code **)(*unaff_x20 + 0x48))();
  plVar2 = (long *)(**(code **)(*unaff_x20 + 0x10))();
  uVar3 = (**(code **)(*plVar2 + 0x88))();
  plVar2 = (long *)(**(code **)(*unaff_x20 + 0x10))();
  (**(code **)(*plVar2 + 0xa0))();
  uVar4 = func_0x00602288();
                    /* WARNING: Could not recover jumptable at 0x006488b4. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(*plVar1 + 0x28))(plVar1,uVar3,uVar4);
  return;
}

