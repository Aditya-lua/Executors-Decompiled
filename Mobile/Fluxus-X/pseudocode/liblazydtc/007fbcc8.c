/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 007fbcc8
 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void _INIT_3(void)

{
  int iVar1;
  
  if (((DAT_00cca870 & 1) == 0) && (iVar1 = __cxa_guard_acquire(&DAT_00cca870), iVar1 != 0)) {
    DAT_00cca868 = 0x3f800000;
    DAT_00cca850 = 0;
    DAT_00cca848 = 0;
    uRam0000000000cca860 = 0;
    _DAT_00cca858 = 0;
    __cxa_atexit(FUN_007fbd34,&DAT_00cca848,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00cca870);
    return;
  }
  return;
}

