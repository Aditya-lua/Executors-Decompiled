/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0098145c
 */

/* std::__ndk1::__shared_ptr_emplace<ix::ConnectionState,
   std::__ndk1::allocator<ix::ConnectionState> >::__on_zero_shared_weak() */

void __thiscall
std::__ndk1::__shared_ptr_emplace<ix::ConnectionState,std::__ndk1::allocator<ix::ConnectionState>>::
__on_zero_shared_weak
          (__shared_ptr_emplace<ix::ConnectionState,std::__ndk1::allocator<ix::ConnectionState>>
           *this)

{
  operator_delete(this);
  return;
}

