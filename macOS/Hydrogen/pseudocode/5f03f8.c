
void FUN_005f03f8(void)

{
  long *plVar1;
  undefined8 in_stack_00000018;
  
  __ZdlPv(in_stack_00000018);
  ___cxa_free_exception();
  plVar1 = (long *)__Unwind_Resume();
  plVar1 = (long *)(**(code **)(*plVar1 + 0x168))();
  if (plVar1 == (long *)0x0) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x005f043c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(*plVar1 + 0x48))();
  return;
}

