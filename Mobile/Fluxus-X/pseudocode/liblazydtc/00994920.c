/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00994920
 */

/* std::__ndk1::__shared_ptr_emplace<ix::WebSocket, std::__ndk1::allocator<ix::WebSocket>
   >::~__shared_ptr_emplace() */

void __thiscall
std::__ndk1::__shared_ptr_emplace<ix::WebSocket,std::__ndk1::allocator<ix::WebSocket>>::
~__shared_ptr_emplace
          (__shared_ptr_emplace<ix::WebSocket,std::__ndk1::allocator<ix::WebSocket>> *this)

{
  *(undefined ***)this = &PTR____shared_ptr_emplace_00c52448;
  ix::WebSocket::~WebSocket((WebSocket *)(this + 0x20));
  __shared_weak_count::~__shared_weak_count((__shared_weak_count *)this);
  operator_delete(this);
  return;
}

