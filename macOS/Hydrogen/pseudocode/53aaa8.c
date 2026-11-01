
void FUN_0053aaa8(long param_1)

{
  long lVar1;
  long *unaff_x19;
  long unaff_x20;
  
  lVar1 = unaff_x20 * param_1 + 0x31;
  if (lVar1 == 0) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(*unaff_x19 + unaff_x20 * -0x28 + -0x28,lVar1,8);
  return;
}

