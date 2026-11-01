
void FUN_004fd2d0(long param_1,undefined8 *param_2)

{
  if (param_1 != 0) {
    if ((code *)*param_2 != (code *)0x0) {
      (*(code *)*param_2)(param_1);
    }
    if (param_2[1] != 0) {
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*(code *)PTR__free_00a24e58)(param_1,param_2[1],param_2[2]);
      return;
    }
  }
  return;
}

