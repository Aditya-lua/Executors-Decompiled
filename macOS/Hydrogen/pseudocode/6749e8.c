
void FUN_006749e8(long param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4)

{
  undefined4 uVar1;
  long *plVar2;
  undefined4 unaff_w20;
  
  plVar2 = (long *)(**(code **)(**(long **)(param_1 + 0x18) + 0x160))();
  uVar1 = 0;
  if (*(char *)(param_1 + 0x20) != '\0') {
    uVar1 = unaff_w20;
  }
                    /* WARNING: Could not recover jumptable at 0x00674a3c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(*plVar2 + 0x130))(plVar2,param_2,param_3,param_4,uVar1);
  return;
}

