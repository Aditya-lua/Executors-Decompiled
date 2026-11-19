/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00986694
 */

/* std::__ndk1::__shared_ptr_emplace<ix::DNSLookup, std::__ndk1::allocator<ix::DNSLookup>
   >::__on_zero_shared_weak() */

void __thiscall
std::__ndk1::__shared_ptr_emplace<ix::DNSLookup,std::__ndk1::allocator<ix::DNSLookup>>::
__on_zero_shared_weak
          (__shared_ptr_emplace<ix::DNSLookup,std::__ndk1::allocator<ix::DNSLookup>> *this)

{
  operator_delete(this);
  return;
}

