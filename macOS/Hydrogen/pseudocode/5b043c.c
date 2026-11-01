
void FUN_005b043c(undefined8 *param_1)

{
  undefined8 in_x9;
  long *unaff_x19;
  long unaff_x20;
  long unaff_x22;
  
  param_1[1] = in_x9;
  param_1[2] = 0x28;
  *param_1 = 0x8000000000000000;
  for (; unaff_x20 != 0; unaff_x20 = unaff_x20 + -1) {
    if (*unaff_x19 != 0xc) {
      func_0x0059ce88(unaff_x19);
    }
    func_0x0059ce88(unaff_x19 + 8);
    unaff_x19 = unaff_x19 + 0x10;
  }
  if (unaff_x22 == 0) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)();
  return;
}

