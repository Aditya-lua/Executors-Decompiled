/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00828bb0
 */

void FUN_00828bb0(void)

{
  int iVar1;
  
  if (((DAT_00d1d120 & 1) == 0) && (iVar1 = __cxa_guard_acquire(&DAT_00d1d120), iVar1 != 0)) {
    DAT_00d1d118 = 1;
    DAT_00d1d110 = 0x27bf3296d3ede35d;
    __cxa_atexit(&LAB_00828c50,&DAT_00d1d110,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1d120);
    return;
  }
  return;
}

