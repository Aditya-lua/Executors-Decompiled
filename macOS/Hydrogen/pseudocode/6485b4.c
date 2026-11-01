
void FUN_006485b4(long param_1)

{
  long *plVar1;
  long *unaff_x21;
  
  plVar1 = (long *)(**(code **)(param_1 + 0x10))();
  (**(code **)(*plVar1 + 0x88))();
                    /* WARNING: Could not recover jumptable at 0x006485ec. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(*unaff_x21 + 0x30))();
  return;
}

