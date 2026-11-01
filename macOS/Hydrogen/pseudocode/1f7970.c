
void FUN_001f7970(void)

{
  long *unaff_x19;
  
  func_0x00243d10();
  if (*unaff_x19 == 0) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(unaff_x19[1],*unaff_x19 << 5,8);
  return;
}

