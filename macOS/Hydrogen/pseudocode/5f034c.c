
/* WARNING: Removing unreachable block (ram,0x005f0354) */
/* WARNING: Removing unreachable block (ram,0x005f0378) */

void FUN_005f034c(void)

{
  long *plVar1;
  uint unaff_w21;
  undefined8 in_stack_00000000;
  long in_stack_00000010;
  undefined8 in_stack_00000018;
  long in_stack_00000028;
  undefined8 in_stack_00000030;
  long in_stack_00000040;
  undefined8 in_stack_00000048;
  long in_stack_00000058;
  
  if (in_stack_00000010 < 0) {
    __ZdlPv(in_stack_00000000);
  }
  if (in_stack_00000058 < 0) {
    __ZdlPv(in_stack_00000048);
  }
  if (in_stack_00000040 < 0) {
    __ZdlPv(in_stack_00000030);
  }
  if (in_stack_00000028 < 0) {
    __ZdlPv(in_stack_00000018);
    unaff_w21 = unaff_w21 & 1;
  }
  if (unaff_w21 != 0) {
    ___cxa_free_exception();
  }
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

