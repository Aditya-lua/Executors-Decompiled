
void FUN_005c9c8c(long param_1)

{
  long *unaff_x20;
  long unaff_x22;
  long unaff_x23;
  
  while( true ) {
    func_0x0059ce88(param_1);
    unaff_x23 = unaff_x23 + -1;
    if (unaff_x23 == 0) break;
    param_1 = unaff_x22;
    unaff_x22 = unaff_x22 + 0x40;
  }
  if (*unaff_x20 == 0) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)();
  return;
}

