/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0097a290
 */

/* std::__ndk1::__shared_ptr_emplace<ix::HttpResponse, std::__ndk1::allocator<ix::HttpResponse>
   >::__on_zero_shared_weak() */

void __thiscall
std::__ndk1::__shared_ptr_emplace<ix::HttpResponse,std::__ndk1::allocator<ix::HttpResponse>>::
__on_zero_shared_weak
          (__shared_ptr_emplace<ix::HttpResponse,std::__ndk1::allocator<ix::HttpResponse>> *this)

{
  operator_delete(this);
  return;
}

