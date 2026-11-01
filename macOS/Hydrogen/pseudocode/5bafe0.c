
void FUN_005bafe0(undefined8 *param_1)

{
  long *unaff_x19;
  
  param_1[1] = &UNK_008b4788;
  param_1[2] = 0x28;
  *param_1 = 0xd;
  if (*unaff_x19 == 0) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(unaff_x19[1],*unaff_x19,1);
  return;
}

