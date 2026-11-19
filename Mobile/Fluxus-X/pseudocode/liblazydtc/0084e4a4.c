/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0084e4a4
 */

void FUN_0084e4a4(void)

{
  int iVar1;
  
  if (((DAT_00d1e838 & 1) == 0) && (iVar1 = __cxa_guard_acquire(&DAT_00d1e838), iVar1 != 0)) {
    DAT_00d1e828 = 0xdb1414a8ff0ef0f6;
    DAT_00d1e830 = 0x1bf;
    __cxa_atexit(&LAB_0084e778,&DAT_00d1e828,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1e838);
    return;
  }
  return;
}

