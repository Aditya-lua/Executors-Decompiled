
void FUN_006db4dc(undefined8 *param_1)

{
  *param_1 = &UNK_00a1b8f0;
  if (param_1[0xd] != 0) {
    __ZdlPv();
    param_1[0xd] = 0;
    param_1[0xe] = 0;
  }
  if (param_1[7] != 0) {
    __ZdlPv();
    param_1[7] = 0;
    param_1[8] = 0;
  }
  if (param_1[2] != 0) {
    __ZdlPv();
  }
                    /* WARNING: Could not recover jumptable at 0x007b2f68. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR___ZdlPv_009b01b8)(param_1);
  return;
}

