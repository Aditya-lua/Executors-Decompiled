
void FUN_006884c0(undefined8 *param_1)

{
  *param_1 = &UNK_009b2ec8;
  if (*(char *)((long)param_1 + 0x27) < '\0') {
    __ZdlPv(param_1[2]);
  }
                    /* WARNING: Could not recover jumptable at 0x007b2f20. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR___ZNSt9exceptionD2Ev_00a24ad0)(param_1);
  return;
}

