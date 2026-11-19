/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c04304
 */

/* std::__ndk1::__time_get_c_storage<wchar_t>::__c() const */

undefined * std::__ndk1::__time_get_c_storage<wchar_t>::__c(void)

{
  int iVar1;
  
  if (((DAT_00d273d0 & 1) == 0) && (iVar1 = __cxa_guard_acquire(&DAT_00d273d0), iVar1 != 0)) {
                    /* try { // try from 00c0434c to 00c0435f has its CatchHandler @ 00c0438c */
    FUN_00c01f1c(&DAT_00d273b8,L"%a %b %d %H:%M:%S %Y");
    __cxa_atexit(basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                 ::~basic_string,&DAT_00d273b8,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d273d0);
  }
  return &DAT_00d273b8;
}

