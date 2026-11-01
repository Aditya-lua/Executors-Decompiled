
/* WARNING: Possible PIC construction at 0x00529a68: Changing call to branch */

void FUN_00529a54(undefined8 param_1)

{
  long *plVar1;
  long unaff_x20;
  
  if ((*(long *)(unaff_x20 + 8) == 0) && (plVar1 = (long *)__Unwind_Resume(param_1), *plVar1 == 0))
  {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)();
  return;
}

