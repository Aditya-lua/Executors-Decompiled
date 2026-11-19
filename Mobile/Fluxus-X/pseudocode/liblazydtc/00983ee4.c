/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00983ee4
 */

/* std::__ndk1::__shared_ptr_emplace<ix::HttpRequest, std::__ndk1::allocator<ix::HttpRequest>
   >::__on_zero_shared_weak() */

void __thiscall
std::__ndk1::__shared_ptr_emplace<ix::HttpRequest,std::__ndk1::allocator<ix::HttpRequest>>::
__on_zero_shared_weak
          (__shared_ptr_emplace<ix::HttpRequest,std::__ndk1::allocator<ix::HttpRequest>> *this)

{
  operator_delete(this);
  return;
}

