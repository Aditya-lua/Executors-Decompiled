
void FUN_00694ff0(void)

{
  undefined8 *puVar1;
  uint unaff_w21;
  
  if ((unaff_w21 & 1) != 0) {
    ___cxa_free_exception();
  }
  puVar1 = (undefined8 *)__Unwind_Resume();
  *puVar1 = &UNK_009b2ec8;
  if (*(char *)((long)puVar1 + 0x27) < '\0') {
    __ZdlPv(puVar1[2]);
  }
                    /* WARNING: Could not recover jumptable at 0x007b2f20. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR___ZNSt9exceptionD2Ev_00a24ad0)(puVar1);
  return;
}

