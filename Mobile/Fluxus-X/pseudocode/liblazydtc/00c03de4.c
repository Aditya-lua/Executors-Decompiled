/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c03de4
 */

/* std::__ndk1::__time_get_c_storage<char>::__am_pm() const */

undefined1 * std::__ndk1::__time_get_c_storage<char>::__am_pm(void)

{
  int iVar1;
  
  if (((DAT_00d27348 & 1) == 0) && (iVar1 = __cxa_guard_acquire(&DAT_00d27348), iVar1 != 0)) {
    FUN_00c03e50();
    DAT_00d27340 = &DAT_00d27b40;
    __cxa_guard_release(&DAT_00d27348);
  }
  return DAT_00d27340;
}

