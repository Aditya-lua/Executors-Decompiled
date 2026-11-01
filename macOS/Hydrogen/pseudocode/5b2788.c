
void FUN_005b2788(undefined8 *param_1)

{
  undefined8 in_x9;
  
  param_1[1] = in_x9;
  param_1[2] = 0x28;
  *param_1 = 0x8000000000000002;
  func_0x005adc80();
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)();
  return;
}

