/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0098b1d4
 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void _INIT_182(void)

{
  uRam0000000000d216ab = 0;
  ix::SocketServer::kDefaultHost = 0x12;
  _DAT_00d216a9 = 0x31;
  DAT_00d216a1._0_7_ = 0x302e302e373231;
  DAT_00d216a1._7_1_ = 0x2e;
  DAT_00d216b0 = 0;
  __cxa_atexit(std::__ndk1::
               basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
               ~basic_string,&ix::SocketServer::kDefaultHost,&PTR_LOOP_00c48880);
  return;
}

