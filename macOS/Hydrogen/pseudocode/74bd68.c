
undefined8 FUN_0074bd68(undefined8 param_1,long *param_2)

{
  undefined8 uVar1;
  
  if (param_2 == (long *)0x0) {
    return 0x17;
  }
                    /* WARNING: Could not recover jumptable at 0x00773bf0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  uVar1 = (**(code **)(*param_2 + 0x18))();
  return uVar1;
}

