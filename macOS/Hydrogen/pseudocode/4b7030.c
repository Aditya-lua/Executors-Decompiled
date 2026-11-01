
void FUN_004b7030(long param_1)

{
  long unaff_x19;
  long unaff_x23;
  
  while (unaff_x23 = unaff_x23 + -1, unaff_x23 != 0) {
    func_0x00488078(param_1);
    param_1 = param_1 + 0x40;
  }
  if (*(long *)(unaff_x19 + 0x18) == 0) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)();
  return;
}

