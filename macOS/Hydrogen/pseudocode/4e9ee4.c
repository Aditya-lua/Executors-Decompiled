
/* WARNING: Possible PIC construction at 0x004e9ef0: Changing call to branch */

void FUN_004e9ee4(undefined8 param_1,long param_2)

{
  long *plVar1;
  
  if ((param_2 == 0) && (plVar1 = (long *)__Unwind_Resume(), *plVar1 == 0)) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)();
  return;
}

