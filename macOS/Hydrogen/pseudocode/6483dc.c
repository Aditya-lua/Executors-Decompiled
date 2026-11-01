
void FUN_006483dc(long param_1)

{
  long *plVar1;
  long *unaff_x20;
  
  plVar1 = (long *)(**(code **)(param_1 + 0x10))();
  (**(code **)(*unaff_x20 + 0x20))();
  (**(code **)(*unaff_x20 + 0x40))();
                    /* WARNING: Could not recover jumptable at 0x00648434. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(*plVar1 + 0xe8))(plVar1);
  return;
}

