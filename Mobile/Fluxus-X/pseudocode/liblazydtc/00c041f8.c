/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c041f8
 */

/* std::__ndk1::__time_get_c_storage<wchar_t>::__X() const */

undefined * std::__ndk1::__time_get_c_storage<wchar_t>::__X(void)

{
  int iVar1;
  
  if (((DAT_00d273a8 & 1) == 0) && (iVar1 = __cxa_guard_acquire(&DAT_00d273a8), iVar1 != 0)) {
                    /* try { // try from 00c04240 to 00c04253 has its CatchHandler @ 00c04280 */
    FUN_00c01f1c(&DAT_00d27390,&DAT_00789f38);
    __cxa_atexit(basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                 ::~basic_string,&DAT_00d27390,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d273a8);
  }
  return &DAT_00d27390;
}

