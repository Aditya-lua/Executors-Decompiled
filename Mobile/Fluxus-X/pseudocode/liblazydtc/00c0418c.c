/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c0418c
 */

/* std::__ndk1::__time_get_c_storage<char>::__X() const */

undefined * std::__ndk1::__time_get_c_storage<char>::__X(void)

{
  int iVar1;
  
  if (((DAT_00d27388 & 1) == 0) && (iVar1 = __cxa_guard_acquire(&DAT_00d27388), iVar1 != 0)) {
    __cxa_atexit(basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
                 ~basic_string,&DAT_00cca620,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d27388);
  }
  return &DAT_00cca620;
}

