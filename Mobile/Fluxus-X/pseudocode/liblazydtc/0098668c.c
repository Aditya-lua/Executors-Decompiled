/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0098668c
 */

/* std::__ndk1::__shared_ptr_emplace<ix::DNSLookup, std::__ndk1::allocator<ix::DNSLookup>
   >::__on_zero_shared() */

void __thiscall
std::__ndk1::__shared_ptr_emplace<ix::DNSLookup,std::__ndk1::allocator<ix::DNSLookup>>::
__on_zero_shared(__shared_ptr_emplace<ix::DNSLookup,std::__ndk1::allocator<ix::DNSLookup>> *this)

{
  ix::DNSLookup::~DNSLookup((DNSLookup *)(this + 0x18));
  return;
}

