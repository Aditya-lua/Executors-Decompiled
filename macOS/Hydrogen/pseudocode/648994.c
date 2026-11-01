
void FUN_00648994(code *param_1)

{
  long *plVar1;
  long *plVar2;
  undefined8 uVar3;
  long *unaff_x20;
  
  plVar1 = (long *)(*param_1)();
  plVar2 = (long *)(**(code **)(*unaff_x20 + 0x10))();
  uVar3 = (**(code **)(*plVar2 + 0x88))();
                    /* WARNING: Could not recover jumptable at 0x006489dc. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(*plVar1 + 0x38))(plVar1,uVar3);
  return;
}

