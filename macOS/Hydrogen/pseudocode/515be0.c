
/* WARNING: Possible PIC construction at 0x00515c18: Changing call to branch */

void FUN_00515be0(undefined8 param_1)

{
  long *plVar1;
  long unaff_x20;
  long unaff_x22;
  long unaff_x23;
  
  while (unaff_x23 = unaff_x23 + -1, unaff_x23 != 0) {
    func_0x004dfd4c(unaff_x22);
    unaff_x22 = unaff_x22 + 0x68;
  }
  if (*(long *)(unaff_x20 + 0x18) == 0) {
    __Unwind_Resume(param_1);
    plVar1 = (long *)func_0x007a2668();
    if (*plVar1 == 0) {
      return;
    }
  }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)();
  return;
}

