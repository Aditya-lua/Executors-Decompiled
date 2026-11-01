
void FUN_001f9ac0(void)

{
  long lVar1;
  long unaff_x19;
  
  func_0x001f8d14();
  if (unaff_x19 != -1) {
    lVar1 = *(long *)(unaff_x19 + 8);
    *(long *)(unaff_x19 + 8) = lVar1 + -1;
    LORelease();
    if (lVar1 == 1) {
      DataMemoryBarrier(2,1);
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*(code *)PTR__free_00a24e58)();
      return;
    }
  }
  return;
}

