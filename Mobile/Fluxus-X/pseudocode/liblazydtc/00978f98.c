/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00978f98
 */

/* std::__ndk1::__shared_ptr_emplace<ix::HttpRequestArgs,
   std::__ndk1::allocator<ix::HttpRequestArgs> >::~__shared_ptr_emplace() */

void __thiscall
std::__ndk1::__shared_ptr_emplace<ix::HttpRequestArgs,std::__ndk1::allocator<ix::HttpRequestArgs>>::
~__shared_ptr_emplace
          (__shared_ptr_emplace<ix::HttpRequestArgs,std::__ndk1::allocator<ix::HttpRequestArgs>>
           *this)

{
  *(undefined ***)this = &PTR____shared_ptr_emplace_00c51828;
  ix::HttpRequestArgs::~HttpRequestArgs((HttpRequestArgs *)(this + 0x20));
  __shared_weak_count::~__shared_weak_count((__shared_weak_count *)this);
  operator_delete(this);
  return;
}

