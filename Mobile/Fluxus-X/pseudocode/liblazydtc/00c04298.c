/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c04298
 */

/* std::__ndk1::__time_get_c_storage<char>::__c() const */

char * std::__ndk1::__time_get_c_storage<char>::__c(void)

{
  int iVar1;
  
  if (((DAT_00d273b0 & 1) == 0) && (iVar1 = __cxa_guard_acquire(&DAT_00d273b0), iVar1 != 0)) {
    __cxa_atexit(basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
                 ~basic_string,s___a__b__d__H__M__S__Y_00cca638,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d273b0);
  }
  return s___a__b__d__H__M__S__Y_00cca638;
}

