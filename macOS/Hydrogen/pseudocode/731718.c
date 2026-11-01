
undefined8 FUN_00731718(undefined8 param_1,long *param_2)

{
  undefined8 uVar1;
  
  while( true ) {
    if (param_2 == (long *)0x0) {
      return 0;
    }
    if ((*(byte *)((long)param_2 + 0x24) & 1) != 0) break;
    param_2 = (long *)param_2[1];
  }
                    /* WARNING: Could not recover jumptable at 0x00731730. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  uVar1 = (**(code **)(*param_2 + 0x40))(param_2,param_1);
  return uVar1;
}

