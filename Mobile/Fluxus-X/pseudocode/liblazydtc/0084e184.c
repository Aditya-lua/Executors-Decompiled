/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0084e184
 */

void FUN_0084e184(void)

{
  int iVar1;
  
  if (((DAT_00d1e808 & 1) == 0) && (iVar1 = __cxa_guard_acquire(&DAT_00d1e808), iVar1 != 0)) {
    DAT_00d1e804 = 1;
    DAT_00d1e800 = 0x85f57904;
    __cxa_atexit(&LAB_0084e770,&DAT_00d1e800,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1e808);
    return;
  }
  return;
}

