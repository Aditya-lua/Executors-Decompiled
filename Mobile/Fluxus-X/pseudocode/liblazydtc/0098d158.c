/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0098d158
 */

/* ix::WebSocket::stop(unsigned short, std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> > const&) */

void __thiscall ix::WebSocket::stop(WebSocket *this,ushort param_1,basic_string_conflict *param_2)

{
  WebSocketTransport::close((WebSocketTransport *)this,param_1,param_2,0,false);
  if (*(long *)(this + 0x408) != 0) {
    this[0x400] = (WebSocket)0x1;
    std::__ndk1::condition_variable::notify_one((condition_variable *)(this + 0x46c));
    std::__ndk1::thread::join((thread *)(this + 0x408));
    this[0x400] = (WebSocket)0x0;
  }
  return;
}

