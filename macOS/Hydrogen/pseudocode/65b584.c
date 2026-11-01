
void FUN_0065b584(undefined8 *param_1)

{
  param_1[-2] = &UNK_00a082b0;
  param_1[-1] = &UNK_00a08398;
  *param_1 = &UNK_00a083f0;
  param_1[1] = &UNK_009ff3a0;
  param_1[2] = &UNK_009ff440;
  param_1[3] = &UNK_009ff510;
  func_0x00621dd4(param_1 + 0x20);
  param_1[2] = &UNK_009ff600;
  param_1[3] = &UNK_009ff6d0;
  func_0x0065a978(param_1 + 4);
                    /* WARNING: Could not recover jumptable at 0x007b2f68. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR___ZdlPv_009b01b8)(param_1 + -2);
  return;
}

