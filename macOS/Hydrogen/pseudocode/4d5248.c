
void FUN_004d5248(long param_1)

{
  long *unaff_x20;
  long unaff_x23;
  
  do {
    func_0x004caae8(param_1);
    unaff_x23 = unaff_x23 + -1;
    param_1 = param_1 + 0x108;
  } while (unaff_x23 != 0);
  if (*unaff_x20 == 0) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)();
  return;
}

