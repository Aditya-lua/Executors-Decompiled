
void FUN_005b1cb8(void)

{
  long *plVar1;
  long *unaff_x21;
  long unaff_x22;
  long unaff_x23;
  
  while( true ) {
    unaff_x23 = unaff_x23 + -1;
    plVar1 = unaff_x21 + 0x10;
    func_0x0059ce88(unaff_x21 + 8);
    if (unaff_x23 == 0) break;
    unaff_x21 = plVar1;
    if (*plVar1 != 0xc) {
      func_0x0059ce88(plVar1);
    }
  }
  if (unaff_x22 == 0) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)();
  return;
}

