
void FUN_0056e51c(long param_1)

{
  undefined1 in_ZR;
  long *unaff_x19;
  long unaff_x23;
  
  while (!(bool)in_ZR) {
    func_0x00553cb8(param_1);
    unaff_x23 = unaff_x23 + -1;
    param_1 = param_1 + 0x40;
    in_ZR = unaff_x23 == 0;
  }
  if (*unaff_x19 == 0) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)();
  return;
}

