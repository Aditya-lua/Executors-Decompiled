
void FUN_00515b8c(long param_1)

{
  undefined1 in_ZR;
  long unaff_x20;
  long unaff_x23;
  
  while (!(bool)in_ZR) {
    func_0x004dfd4c(param_1);
    unaff_x23 = unaff_x23 + -1;
    param_1 = param_1 + 0x68;
    in_ZR = unaff_x23 == 0;
  }
  if (*(long *)(unaff_x20 + 0x18) == 0) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)();
  return;
}

