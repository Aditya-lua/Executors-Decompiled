
void FUN_006290e8(void)

{
  long *plVar1;
  undefined1 auVar2 [16];
  
  auVar2 = func_0x0001753c();
  plVar1 = (long *)(**(code **)(*auVar2._0_8_ + 0x20))();
                    /* WARNING: Could not recover jumptable at 0x0062911c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(*plVar1 + 0x18))(plVar1,auVar2._8_8_);
  return;
}

