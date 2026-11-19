/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 007fbe84
 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void _INIT_5(void)

{
  int iVar1;
  
  if (((DAT_00cca890 & 1) != 0) || (iVar1 = __cxa_guard_acquire(&DAT_00cca890), iVar1 == 0)) {
    return;
  }
  if (((DAT_00cca9a0 & 1) == 0) && (iVar1 = __cxa_guard_acquire(&DAT_00cca9a0), iVar1 != 0)) {
    DAT_00cca99e = '\x01';
    DAT_00cca998 = 0x257d592c;
    _DAT_00cca99c = 0x38f;
    __cxa_atexit(&LAB_007fdd48,&DAT_00cca998,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00cca9a0);
  }
  if (DAT_00cca99e == '\x01') {
    DAT_00cca99e = '\0';
    _DAT_00cca99c = _DAT_00cca99c ^ 0x3bf;
    DAT_00cca998 = DAT_00cca998 ^ 0xb4d771d;
  }
  DAT_00cca888 = &DAT_00cca998;
  __cxa_guard_release(&DAT_00cca890);
  return;
}

