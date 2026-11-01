
void FUN_00648324(long param_1)

{
  long *plVar1;
  undefined8 uVar2;
  long *unaff_x21;
  long *unaff_x23;
  
  plVar1 = (long *)(**(code **)(param_1 + 0x90))();
  uVar2 = (**(code **)(*unaff_x23 + 0x88))();
  (**(code **)(*unaff_x21 + 0x40))();
                    /* WARNING: Could not recover jumptable at 0x00648384. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(*plVar1 + 0x48))(plVar1,uVar2);
  return;
}

