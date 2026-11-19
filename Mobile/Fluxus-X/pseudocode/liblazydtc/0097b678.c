/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0097b678
 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void _INIT_181(void)

{
  DAT_00d20270 = 0;
  DAT_00d20278 = 0;
  _kPost = 0x54534f5008;
  __cxa_atexit(std::__ndk1::
               basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
               ~basic_string,&ix::HttpClient::kPost,&PTR_LOOP_00c48880);
  _DAT_00d20288 = 0;
  _DAT_00d20290 = 0;
  _kGet = 0x54454706;
  __cxa_atexit(std::__ndk1::
               basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
               ~basic_string,&ix::HttpClient::kGet,&PTR_LOOP_00c48880);
  _DAT_00d202a0 = 0;
  _DAT_00d202a8 = 0;
  _kHead = 0x4441454808;
  __cxa_atexit(std::__ndk1::
               basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
               ~basic_string,&ix::HttpClient::kHead,&PTR_LOOP_00c48880);
  _DAT_00d202b8 = 0;
  _DAT_00d202c0 = 0;
  ix::HttpClient::kDelete = 0xc;
  DAT_00d202b5 = 0x4554;
  DAT_00d202b1 = 0x454c4544;
  DAT_00d202b7 = 0;
  __cxa_atexit(std::__ndk1::
               basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
               ~basic_string,&ix::HttpClient::kDelete,&PTR_LOOP_00c48880);
  DAT_00d202d0 = 0;
  DAT_00d202d8 = 0;
  _kPut = 0x54555006;
  __cxa_atexit(std::__ndk1::
               basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
               ~basic_string,&ix::HttpClient::kPut,&PTR_LOOP_00c48880);
  DAT_00d202e8 = 0;
  DAT_00d202f0 = 0;
  _kPatch = 0x48435441500a;
  __cxa_atexit(std::__ndk1::
               basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
               ~basic_string,&ix::HttpClient::kPatch,&PTR_LOOP_00c48880);
  return;
}

