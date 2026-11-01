
void FUN_0067503c(undefined8 param_1,undefined8 *param_2)

{
  long unaff_x19;
  
  *param_2 = param_1;
  if (*(char *)((long)param_2 + 0x27) < '\0') {
    __ZdlPv(*(undefined8 *)(unaff_x19 + 0x10));
    __ZNSt9exceptionD2Ev();
  }
  else {
    __ZNSt9exceptionD2Ev();
  }
                    /* WARNING: Could not recover jumptable at 0x007b2f68. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR___ZdlPv_009b01b8)();
  return;
}

