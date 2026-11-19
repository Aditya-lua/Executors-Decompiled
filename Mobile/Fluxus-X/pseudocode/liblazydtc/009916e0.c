/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009916e0
 */

void _INIT_183(void)

{
  DAT_00d216c0 = 0;
  DAT_00d216c8 = 0;
  DAT_00d216d0 = 0;
  __cxa_atexit(std::__ndk1::
               basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
               ~basic_string,&DAT_00d216c0,&PTR_LOOP_00c48880);
  ix::WebSocket::_onTrafficTrackerCallback._32_8_ = 0;
  __cxa_atexit(std::__ndk1::function<void(unsigned_long,bool)>::~function,
               ix::WebSocket::_onTrafficTrackerCallback,&PTR_LOOP_00c48880);
  return;
}

