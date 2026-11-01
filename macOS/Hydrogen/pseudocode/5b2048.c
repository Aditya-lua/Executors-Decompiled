
void thunk_FUN_005b205c(void)

{
  long unaff_x20;
  long unaff_x22;
  long *unaff_x24;
  
  for (; unaff_x20 != 0; unaff_x20 = unaff_x20 + -1) {
    if (*unaff_x24 != 0xc) {
      func_0x0059ce88(unaff_x24);
    }
    func_0x0059ce88(unaff_x24 + 8);
    unaff_x24 = unaff_x24 + 0x10;
  }
  if (unaff_x22 == 0) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)();
  return;
}

