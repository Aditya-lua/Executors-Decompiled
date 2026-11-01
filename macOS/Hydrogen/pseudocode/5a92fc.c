
void FUN_005a92fc(long param_1)

{
  long *plVar1;
  long unaff_x19;
  long *unaff_x20;
  long unaff_x21;
  long unaff_x22;
  long unaff_x23;
  
  while( true ) {
    if (param_1 == 1) {
      func_0x005d2ac4();
    }
    unaff_x21 = unaff_x21 + 1;
    unaff_x22 = unaff_x22 + 0x10;
    if (unaff_x21 == 1) break;
    plVar1 = *(long **)(unaff_x19 + unaff_x22 + 8);
    param_1 = *plVar1;
    *plVar1 = param_1 + unaff_x23;
    LORelease();
  }
  if (*unaff_x20 == 0) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)();
  return;
}

