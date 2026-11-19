/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0084e1f4
 */

void FUN_0084e1f4(void)

{
  int iVar1;
  
  if (((DAT_00d1e820 & 1) == 0) && (iVar1 = __cxa_guard_acquire(&DAT_00d1e820), iVar1 != 0)) {
    DAT_00d1e81c = 1;
    DAT_00d1e810 = 0x923ae6bc8859f8ba;
    DAT_00d1e818 = 0xc55ef89a;
    __cxa_atexit(&LAB_00830c54,&DAT_00d1e810,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1e820);
    return;
  }
  return;
}

