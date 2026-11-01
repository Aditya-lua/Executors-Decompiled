
void FUN_0064d53c(long param_1)

{
  long *plVar1;
  undefined8 uVar2;
  ulong extraout_x1;
  long *unaff_x19;
  
  plVar1 = (long *)(**(code **)(param_1 + 0x90))();
  (**(code **)(*unaff_x19 + 0x98))();
  uVar2 = (**(code **)(*unaff_x19 + 0xa0))();
                    /* WARNING: Could not recover jumptable at 0x0064d590. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(*plVar1 + 0x18))(plVar1,0,extraout_x1 & 0xffffffff,uVar2);
  return;
}

