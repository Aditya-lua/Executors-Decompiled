
void FUN_0070f4dc(void)

{
  undefined8 *puVar1;
  int in_w8;
  undefined8 in_stack_00000000;
  undefined8 in_stack_00000020;
  long in_stack_00000030;
  
  if (-1 < in_w8) {
    do {
      __Unwind_Resume();
      __ZdlPv(in_stack_00000000);
    } while (-1 < in_stack_00000030);
  }
  __ZdlPv(in_stack_00000020);
  puVar1 = (undefined8 *)__Unwind_Resume();
  *puVar1 = &UNK_00a1df28;
  if (*(char *)((long)puVar1 + 0x2f) < '\0') {
    __ZdlPv(puVar1[3]);
  }
                    /* WARNING: Could not recover jumptable at 0x007b2f20. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR___ZNSt9exceptionD2Ev_00a24ad0)(puVar1);
  return;
}

