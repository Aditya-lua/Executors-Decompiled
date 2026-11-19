/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00994964
 */

/* std::__ndk1::__shared_ptr_emplace<ix::WebSocket, std::__ndk1::allocator<ix::WebSocket>
   >::__on_zero_shared_weak() */

void __thiscall
std::__ndk1::__shared_ptr_emplace<ix::WebSocket,std::__ndk1::allocator<ix::WebSocket>>::
__on_zero_shared_weak
          (__shared_ptr_emplace<ix::WebSocket,std::__ndk1::allocator<ix::WebSocket>> *this)

{
  operator_delete(this);
  return;
}

