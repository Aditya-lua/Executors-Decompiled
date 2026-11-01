
void FUN_001881c4(code *param_1)

{
  long unaff_x20;
  
  (*param_1)();
  if (*(long *)(unaff_x20 + 8) == 0) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)();
  return;
}

