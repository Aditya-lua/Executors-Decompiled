/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 007fc83c
 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void _INIT_13(void)

{
  int iVar1;
  
  if (((DAT_00cca930 & 1) == 0) && (iVar1 = __cxa_guard_acquire(&DAT_00cca930), iVar1 != 0)) {
    DAT_00cca928 = 0x3f800000;
    uRam0000000000cca910 = 0;
    _DAT_00cca908 = 0;
    DAT_00cca920 = 0;
    DAT_00cca918 = 0;
    __cxa_atexit(FUN_007fc8a8,&DAT_00cca908,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00cca930);
    return;
  }
  return;
}

