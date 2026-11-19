/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00824e38
 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_00824e38(void)

{
  int iVar1;
  
  if (((DAT_00d1cea8 & 1) == 0) && (iVar1 = __cxa_guard_acquire(&DAT_00d1cea8), iVar1 != 0)) {
    _DAT_00d1cea0 = 0x1c98628;
    __cxa_atexit(&LAB_008274cc,&DAT_00d1cea0,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1cea8);
    return;
  }
  return;
}

