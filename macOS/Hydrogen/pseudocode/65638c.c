
void FUN_0065638c(void)

{
  long *plVar1;
  undefined8 uVar2;
  long *unaff_x19;
  long *unaff_x20;
  
  func_0x005febd4();
  plVar1 = (long *)(**(code **)(*unaff_x20 + 0xa0))();
  uVar2 = (**(code **)(*unaff_x19 + 0xa0))();
                    /* WARNING: Could not recover jumptable at 0x006563e0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(*plVar1 + 0x28))(plVar1,uVar2,unaff_x19[0x10],unaff_x19[0xf]);
  return;
}

