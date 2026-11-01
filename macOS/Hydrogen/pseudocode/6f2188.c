
undefined8 FUN_006f2188(undefined8 param_1,undefined8 param_2,undefined8 param_3,long param_4)

{
  undefined8 uVar1;
  
  if (param_4 == 0) {
    _free();
    return 0;
  }
                    /* WARNING: Could not recover jumptable at 0x007b3c4c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  uVar1 = (*(code *)PTR__realloc_00a25378)(param_1,param_4);
  return uVar1;
}

