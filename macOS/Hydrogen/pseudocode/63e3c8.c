
void FUN_0063e3c8(long *param_1)

{
  int iVar1;
  long *plVar2;
  long *unaff_x20;
  
  iVar1 = (**(code **)(*param_1 + 0x20))();
  if (iVar1 == 0) {
    return;
  }
  plVar2 = (long *)(**(code **)(*unaff_x20 + 0x10))();
  (**(code **)(*unaff_x20 + 0x20))();
  (**(code **)(*unaff_x20 + 0x40))();
                    /* WARNING: Could not recover jumptable at 0x0063e43c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(*plVar2 + 0xe8))(plVar2);
  return;
}

