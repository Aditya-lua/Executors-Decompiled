
void FUN_005f2af4(void)

{
  undefined8 *puVar1;
  undefined8 in_stack_00000000;
  long in_stack_00000010;
  undefined8 in_stack_00000018;
  long in_stack_00000028;
  undefined8 in_stack_00000030;
  
  if (in_stack_00000010 < 0) goto LAB_005f2b2c;
  while (-1 < in_stack_00000028) {
    while( true ) {
      __Unwind_Resume();
      __ZdlPv(in_stack_00000030);
      if (-1 < in_stack_00000010) break;
LAB_005f2b2c:
      __ZdlPv(in_stack_00000000);
      if (in_stack_00000028 < 0) goto LAB_005f2b4c;
    }
  }
LAB_005f2b4c:
  __ZdlPv(in_stack_00000018);
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

