
void FUN_005b4590(undefined8 *param_1)

{
  undefined8 in_x9;
  undefined8 in_x10;
  long *unaff_x19;
  
  param_1[1] = in_x9;
  param_1[2] = in_x10;
  *param_1 = 0x8000000000000000;
  if (*unaff_x19 == 0) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(unaff_x19[1],*unaff_x19,1);
  return;
}

