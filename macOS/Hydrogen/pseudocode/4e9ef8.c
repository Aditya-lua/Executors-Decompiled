
void FUN_004e9ef8(void)

{
  long *plVar1;
  
  plVar1 = (long *)__Unwind_Resume();
  if (*plVar1 == 0) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(plVar1[1],*plVar1,1);
  return;
}

