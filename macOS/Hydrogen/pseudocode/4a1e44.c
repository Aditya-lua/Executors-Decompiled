
void FUN_004a1e44(void)

{
  long lVar1;
  long unaff_x19;
  long unaff_x20;
  long unaff_x21;
  long unaff_x22;
  long unaff_x23;
  
  do {
    lVar1 = **(long **)(unaff_x20 + unaff_x22);
    **(long **)(unaff_x20 + unaff_x22) = lVar1 + unaff_x23;
    LORelease();
    if (lVar1 == 1) {
      DataMemoryBarrier(2,1);
      func_0x00525414(unaff_x20 + unaff_x22);
    }
    unaff_x22 = unaff_x22 + 0x20;
    unaff_x21 = unaff_x21 + 1;
  } while (unaff_x21 != 1);
  if (*(long *)(unaff_x19 + 0x18) == 0) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)();
  return;
}

