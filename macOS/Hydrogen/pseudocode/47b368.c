
/* WARNING: Possible PIC construction at 0x0047b378: Changing call to branch */

void FUN_0047b368(long param_1)

{
  long *plVar1;
  
  if (param_1 == 0) {
    __Unwind_Resume();
    plVar1 = (long *)func_0x007a2668();
    if (*plVar1 < -0x7ffffffffffffffb || *plVar1 == 0) {
      return;
    }
  }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)();
  return;
}

