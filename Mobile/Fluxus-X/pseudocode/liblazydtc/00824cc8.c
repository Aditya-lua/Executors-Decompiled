/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00824cc8
 */

void FUN_00824cc8(void)

{
  int iVar1;
  
  if (((DAT_00d1ce98 & 1) == 0) && (iVar1 = __cxa_guard_acquire(&DAT_00d1ce98), iVar1 != 0)) {
    DAT_00d1ce90 = 0xc9dacc73;
    DAT_00d1ce94 = 499;
    __cxa_atexit(&LAB_008274c0,&DAT_00d1ce90,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1ce98);
    return;
  }
  return;
}

