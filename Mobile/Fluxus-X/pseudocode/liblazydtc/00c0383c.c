/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c0383c
 */

/* std::__ndk1::__time_get_c_storage<wchar_t>::__months() const */

undefined * std::__ndk1::__time_get_c_storage<wchar_t>::__months(void)

{
  int iVar1;
  
  if (((DAT_00d27338 & 1) == 0) && (iVar1 = __cxa_guard_acquire(&DAT_00d27338), iVar1 != 0)) {
                    /* try { // try from 00c03884 to 00c03887 has its CatchHandler @ 00c038a4 */
    FUN_00c038bc();
    DAT_00d27330 = &DAT_00d278f8;
    __cxa_guard_release(&DAT_00d27338);
  }
  return DAT_00d27330;
}

