
void FUN_004bccd4(void)

{
  long lVar1;
  long unaff_x19;
  long *unaff_x20;
  long unaff_x21;
  long unaff_x22;
  long unaff_x23;
  
  while( true ) {
    unaff_x22 = unaff_x22 + 8;
    unaff_x21 = unaff_x21 + 1;
    if (unaff_x21 == 1) break;
    lVar1 = **(long **)(unaff_x19 + unaff_x22);
    **(long **)(unaff_x19 + unaff_x22) = lVar1 + unaff_x23;
    LORelease();
    if (lVar1 == 1) {
      func_0x005d2ac4(unaff_x19 + unaff_x22);
    }
  }
  if (*unaff_x20 == 0) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)();
  return;
}

