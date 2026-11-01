
void FUN_0003f3fc(undefined8 *param_1)

{
  *param_1 = &UNK_009b2ec8;
  if (*(char *)((long)param_1 + 0x27) < '\0') {
    __ZdlPv(param_1[2]);
    __ZNSt9exceptionD2Ev(param_1);
  }
  else {
    __ZNSt9exceptionD2Ev(param_1);
  }
                    /* WARNING: Could not recover jumptable at 0x007b2f68. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR___ZdlPv_009b01b8)();
  return;
}

