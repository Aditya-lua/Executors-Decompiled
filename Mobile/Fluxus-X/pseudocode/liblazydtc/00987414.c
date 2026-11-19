/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00987414
 */

/* std::__ndk1::__shared_ptr_pointer<addrinfo*, void (*)(addrinfo*),
   std::__ndk1::allocator<addrinfo> >::__on_zero_shared_weak() */

void __thiscall
std::__ndk1::__shared_ptr_pointer<addrinfo*,void(*)(addrinfo*),std::__ndk1::allocator<addrinfo>>::
__on_zero_shared_weak
          (__shared_ptr_pointer<addrinfo*,void(*)(addrinfo*),std::__ndk1::allocator<addrinfo>> *this
          )

{
  operator_delete(this);
  return;
}

