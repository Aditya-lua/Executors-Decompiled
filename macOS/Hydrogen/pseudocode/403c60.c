
void FUN_00403c60(void)

{
  bool in_ZR;
  long lVar1;
  long unaff_x19;
  
  if (!in_ZR) {
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

