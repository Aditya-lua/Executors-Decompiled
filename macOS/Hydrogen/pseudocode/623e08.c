
void FUN_00623e08(long *param_1)

{
  long *plVar1;
  undefined8 uVar2;
  long *unaff_x20;
  
  plVar1 = (long *)(**(code **)(*param_1 + 0x90))();
  uVar2 = (**(code **)(*unaff_x20 + 0x88))();
                    /* WARNING: Could not recover jumptable at 0x00623e4c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(*plVar1 + 0x40))(plVar1,uVar2);
  return;
}

