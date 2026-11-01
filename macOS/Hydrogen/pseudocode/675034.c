
void FUN_00675034(undefined8 *param_1)

{
  long unaff_x19;
  
  *param_1 = &UNK_009b2ec8;
  if (*(char *)((long)param_1 + 0x27) < '\0') {
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

