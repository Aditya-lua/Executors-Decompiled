/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c03f30
 */

/* std::__ndk1::__time_get_c_storage<wchar_t>::__am_pm() const */

undefined1 * std::__ndk1::__time_get_c_storage<wchar_t>::__am_pm(void)

{
  int iVar1;
  
  if (((DAT_00d27358 & 1) == 0) && (iVar1 = __cxa_guard_acquire(&DAT_00d27358), iVar1 != 0)) {
    FUN_00c03f9c();
    DAT_00d27350 = &DAT_00d27b78;
    __cxa_guard_release(&DAT_00d27358);
  }
  return DAT_00d27350;
}

