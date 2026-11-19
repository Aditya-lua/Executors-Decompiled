/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c02da8
 */

/* std::__ndk1::__time_get_c_storage<wchar_t>::__weeks() const */

undefined * std::__ndk1::__time_get_c_storage<wchar_t>::__weeks(void)

{
  int iVar1;
  
  if (((DAT_00d27318 & 1) == 0) && (iVar1 = __cxa_guard_acquire(&DAT_00d27318), iVar1 != 0)) {
                    /* try { // try from 00c02df0 to 00c02df3 has its CatchHandler @ 00c02e10 */
    FUN_00c02e28();
    DAT_00d27310 = &DAT_00d27558;
    __cxa_guard_release(&DAT_00d27318);
  }
  return DAT_00d27310;
}

