/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00978fdc
 */

/* std::__ndk1::__shared_ptr_emplace<ix::HttpRequestArgs,
   std::__ndk1::allocator<ix::HttpRequestArgs> >::__on_zero_shared_weak() */

void __thiscall
std::__ndk1::__shared_ptr_emplace<ix::HttpRequestArgs,std::__ndk1::allocator<ix::HttpRequestArgs>>::
__on_zero_shared_weak
          (__shared_ptr_emplace<ix::HttpRequestArgs,std::__ndk1::allocator<ix::HttpRequestArgs>>
           *this)

{
  operator_delete(this);
  return;
}

