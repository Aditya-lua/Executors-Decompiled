/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0099495c
 */

/* std::__ndk1::__shared_ptr_emplace<ix::WebSocket, std::__ndk1::allocator<ix::WebSocket>
   >::__on_zero_shared() */

void __thiscall
std::__ndk1::__shared_ptr_emplace<ix::WebSocket,std::__ndk1::allocator<ix::WebSocket>>::
__on_zero_shared(__shared_ptr_emplace<ix::WebSocket,std::__ndk1::allocator<ix::WebSocket>> *this)

{
  ix::WebSocket::~WebSocket((WebSocket *)(this + 0x20));
  return;
}

