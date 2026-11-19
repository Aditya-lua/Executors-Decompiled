/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008240e0
 */

void FUN_008240e0(void)

{
  int iVar1;
  
  if (((DAT_00d1cb20 & 1) == 0) && (iVar1 = __cxa_guard_acquire(&DAT_00d1cb20), iVar1 != 0)) {
    DAT_00d1cb18 = 0x15f826c;
    __cxa_atexit(&LAB_00824fac,&DAT_00d1cb18,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1cb20);
    return;
  }
  return;
}

