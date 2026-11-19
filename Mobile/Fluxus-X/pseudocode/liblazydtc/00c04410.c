/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c04410
 */

/* std::__ndk1::__time_get_c_storage<wchar_t>::__r() const */

undefined * std::__ndk1::__time_get_c_storage<wchar_t>::__r(void)

{
  int iVar1;
  
  if (((DAT_00d273f8 & 1) == 0) && (iVar1 = __cxa_guard_acquire(&DAT_00d273f8), iVar1 != 0)) {
                    /* try { // try from 00c04458 to 00c0446b has its CatchHandler @ 00c04498 */
    FUN_00c01f1c(&DAT_00d273e0,&DAT_00789e60);
    __cxa_atexit(basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                 ::~basic_string,&DAT_00d273e0,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d273f8);
  }
  return &DAT_00d273e0;
}

