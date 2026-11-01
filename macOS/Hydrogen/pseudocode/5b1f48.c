
void FUN_005b1f48(undefined8 *param_1,undefined8 param_2,long param_3)

{
  undefined8 in_x9;
  
  *param_1 = in_x9;
  param_1[1] = 0x2a;
  *(undefined1 *)(param_1 + 2) = 0x10;
  if (param_3 + 0x8000000000000000U < 5 && param_3 + 0x8000000000000000U != 3 || param_3 == 0) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(param_2,param_3,1);
  return;
}

