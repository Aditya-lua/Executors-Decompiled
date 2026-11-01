
void FUN_006488d8(void)

{
  long *plVar1;
  long *plVar2;
  undefined8 uVar3;
  long *unaff_x20;
  
  plVar1 = (long *)(**(code **)(*unaff_x20 + 0x18))();
  (**(code **)(*plVar1 + 0x50))();
  plVar1 = (long *)(**(code **)(*unaff_x20 + 0x48))();
  plVar2 = (long *)(**(code **)(*unaff_x20 + 0x10))();
  uVar3 = (**(code **)(*plVar2 + 0x88))();
                    /* WARNING: Could not recover jumptable at 0x00648948. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(*plVar1 + 0x30))(plVar1,uVar3);
  return;
}

