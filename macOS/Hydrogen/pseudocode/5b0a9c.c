
void FUN_005b0a9c(long *param_1,undefined8 param_2,long param_3)

{
  long in_x10;
  
  *param_1 = in_x10;
  if ((ulong)(param_3 + in_x10) < 5 && param_3 + in_x10 != 3 || param_3 == 0) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(param_2,param_3,1);
  return;
}

