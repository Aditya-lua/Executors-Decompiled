/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0098661c
 */

/* std::__ndk1::__shared_ptr_emplace<ix::DNSLookup, std::__ndk1::allocator<ix::DNSLookup>
   >::~__shared_ptr_emplace() */

void __thiscall
std::__ndk1::__shared_ptr_emplace<ix::DNSLookup,std::__ndk1::allocator<ix::DNSLookup>>::
~__shared_ptr_emplace
          (__shared_ptr_emplace<ix::DNSLookup,std::__ndk1::allocator<ix::DNSLookup>> *this)

{
  *(undefined ***)this = &PTR____shared_ptr_emplace_00c51f48;
  ix::DNSLookup::~DNSLookup((DNSLookup *)(this + 0x18));
  __shared_weak_count::~__shared_weak_count((__shared_weak_count *)this);
  return;
}

