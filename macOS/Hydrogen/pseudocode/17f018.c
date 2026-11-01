
void FUN_0017f018(void)

{
  long *unaff_x19;
  
  DataMemoryBarrier(2,1);
  func_0x001f9f08();
  if (*unaff_x19 == 0) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(unaff_x19[1],*unaff_x19 << 4,8);
  return;
}

