/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00978fd4
 */

/* std::__ndk1::__shared_ptr_emplace<ix::HttpRequestArgs,
   std::__ndk1::allocator<ix::HttpRequestArgs> >::__on_zero_shared() */

void __thiscall
std::__ndk1::__shared_ptr_emplace<ix::HttpRequestArgs,std::__ndk1::allocator<ix::HttpRequestArgs>>::
__on_zero_shared(__shared_ptr_emplace<ix::HttpRequestArgs,std::__ndk1::allocator<ix::HttpRequestArgs>>
                 *this)

{
  ix::HttpRequestArgs::~HttpRequestArgs((HttpRequestArgs *)(this + 0x20));
  return;
}

