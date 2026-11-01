
void FUN_000795c8(undefined8 param_1,undefined8 *param_2)

{
  *param_2 = param_1;
  __ZNSt13runtime_errorD1Ev(param_2 + 2);
  __ZNSt9exceptionD2Ev();
                    /* WARNING: Could not recover jumptable at 0x007b2f68. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR___ZdlPv_009b01b8)();
  return;
}

