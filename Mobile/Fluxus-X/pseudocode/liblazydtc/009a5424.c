/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009a5424
 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void _INIT_186(void)

{
  void *__dest;
  
  _DAT_00d21870 = 0;
  DAT_00d21878 = 0;
  DAT_00d21880 = (void *)0x0;
  __dest = operator_new(0x1d0);
  DAT_00d21878 = 0x1c0;
  _DAT_00d21870 = 0x1d1;
  DAT_00d21880 = __dest;
  memcpy(__dest,
         "ECDHE-ECDSA-AES128-GCM-SHA256 ECDHE-ECDSA-AES256-GCM-SHA384 ECDHE-ECDSA-AES128-SHA ECDHE-ECDSA-AES256-SHA ECDHE-ECDSA-AES128-SHA256 ECDHE-ECDSA-AES256-SHA384 ECDHE-RSA-AES128-GCM-SHA256 ECDHE-RSA-AES256-GCM-SHA384 ECDHE-RSA-AES128-SHA ECDHE-RSA-AES256-SHA ECDHE-RSA-AES128-SHA256 ECDHE-RSA-AES256-SHA384 DHE-RSA-AES128-GCM-SHA256 DHE-RSA-AES256-GCM-SHA384 DHE-RSA-AES128-SHA DHE-RSA-AES256-SHA DHE-RSA-AES128-SHA256 DHE-RSA-AES256-SHA256 AES128-SHA"
         ,0x1c0);
  *(undefined1 *)((long)__dest + 0x1c0) = 0;
  __cxa_atexit(std::__ndk1::
               basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
               ~basic_string,&DAT_00d21870,&PTR_LOOP_00c48880);
  DAT_00d218a0 = 0;
  DAT_00d218a8 = 0;
  ix::openSSLMutexes = 0;
  __cxa_atexit(std::__ndk1::
               __vector_base<std::__ndk1::unique_ptr<std::__ndk1::mutex,std::__ndk1::default_delete<std::__ndk1::mutex>>,std::__ndk1::allocator<std::__ndk1::unique_ptr<std::__ndk1::mutex,std::__ndk1::default_delete<std::__ndk1::mutex>>>>
               ::~__vector_base,&ix::openSSLMutexes,&PTR_LOOP_00c48880);
  return;
}

