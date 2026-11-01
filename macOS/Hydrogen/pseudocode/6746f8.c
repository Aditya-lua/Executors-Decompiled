
void FUN_006746f8(void)

{
  undefined8 *puVar1;
  
  __ZdlPv();
  puVar1 = (undefined8 *)__Unwind_Resume();
  *puVar1 = &UNK_009b2ec8;
  if (*(char *)((long)puVar1 + 0x27) < '\0') {
    __ZdlPv(puVar1[2]);
    __ZNSt9exceptionD2Ev(puVar1);
  }
  else {
    __ZNSt9exceptionD2Ev(puVar1);
  }
                    /* WARNING: Could not recover jumptable at 0x007b2f68. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR___ZdlPv_009b01b8)();
  return;
}

