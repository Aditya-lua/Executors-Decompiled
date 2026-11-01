
void FUN_00587478(void)

{
  long lVar1;
  long *plVar2;
  long unaff_x19;
  long unaff_x20;
  long unaff_x21;
  long unaff_x22;
  long unaff_x23;
  
  do {
    plVar2 = *(long **)(unaff_x19 + unaff_x21);
    if (plVar2 != (long *)0x0) {
      lVar1 = *plVar2;
      *plVar2 = lVar1 + unaff_x23;
      LORelease();
      if (lVar1 == 1) {
        func_0x005d2ac4(unaff_x19 + unaff_x21);
      }
    }
    unaff_x21 = unaff_x21 + 8;
    unaff_x22 = unaff_x22 + 1;
  } while (unaff_x22 != 1);
  if (unaff_x20 == 0) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)();
  return;
}

