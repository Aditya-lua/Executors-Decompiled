
void FUN_001d47b0(undefined8 *param_1,undefined1 param_2 [16],undefined8 param_3,undefined8 param_4,
                 undefined8 param_5)

{
  ulong in_x9;
  ulong in_x10;
  
  param_1[1] = param_2._8_8_;
  *param_1 = param_2._0_8_;
  param_1[2] = 1;
  param_1[3] = 0;
  *(char *)(param_1 + 4) = (char)(in_x10 >> (in_x9 & 0x3f));
  func_0x001be974(param_5);
  func_0x001bf718();
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)();
  return;
}

