
void FUN_005901f4(long param_1,undefined8 *param_2,undefined8 *param_3)

{
  long lVar1;
  long in_x9;
  long in_x10;
  undefined4 in_w11;
  long in_x13;
  
  while( true ) {
    lVar1 = in_x13 + 0x18;
    *(undefined4 *)(in_x10 + param_1 * 4) = in_w11;
    param_1 = param_1 + 1;
    if (lVar1 == in_x9) break;
    in_w11 = *(undefined4 *)(in_x13 + 0x28);
    in_x13 = lVar1;
  }
  param_2[1] = lVar1;
  param_3[1] = param_1;
  *(long *)*param_3 = param_1;
  if (param_2[2] == 0) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(*param_2,param_2[2] * 0x18,8);
  return;
}

