
void FUN_00515f38(void)

{
  long *plVar1;
  
  plVar1 = (long *)func_0x007a2668();
  if (*plVar1 == 0) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(plVar1[1],*plVar1 << 4,8);
  return;
}

