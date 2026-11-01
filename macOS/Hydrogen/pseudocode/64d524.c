
void FUN_0064d524(long *param_1)

{
  long *plVar1;
  undefined8 uVar2;
  ulong extraout_x1;
  
  plVar1 = (long *)(**(code **)(*param_1 + 0x90))();
  (**(code **)(*param_1 + 0x98))(param_1);
  uVar2 = (**(code **)(*param_1 + 0xa0))(param_1);
                    /* WARNING: Could not recover jumptable at 0x0064d590. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(*plVar1 + 0x18))(plVar1,0,extraout_x1 & 0xffffffff,uVar2);
  return;
}

