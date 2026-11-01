
void FUN_00079598(undefined8 param_1,undefined8 *param_2)

{
  *param_2 = param_1;
  __ZNSt13runtime_errorD1Ev(param_2 + 2);
                    /* WARNING: Could not recover jumptable at 0x007b2f20. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR___ZNSt9exceptionD2Ev_00a24ad0)();
  return;
}

