/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0098dbd8
 */

/* ix::WebSocket::close(unsigned short, std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> > const&) */

void __thiscall ix::WebSocket::close(WebSocket *this,ushort param_1,basic_string_conflict *param_2)

{
  WebSocketTransport::close((WebSocketTransport *)this,param_1,param_2,0,false);
  return;
}

