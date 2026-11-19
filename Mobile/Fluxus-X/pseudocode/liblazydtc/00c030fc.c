/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c030fc
 */

/* std::__ndk1::__time_get_c_storage<char>::__months() const */

undefined1 * std::__ndk1::__time_get_c_storage<char>::__months(void)

{
  int iVar1;
  
  if (((DAT_00d27328 & 1) == 0) && (iVar1 = __cxa_guard_acquire(&DAT_00d27328), iVar1 != 0)) {
    FUN_00c03168();
    DAT_00d27320 = &DAT_00d276b0;
    __cxa_guard_release(&DAT_00d27328);
  }
  return DAT_00d27320;
}

