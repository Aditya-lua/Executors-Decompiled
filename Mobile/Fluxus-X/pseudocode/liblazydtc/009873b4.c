/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009873b4
 */

/* std::__ndk1::__shared_ptr_pointer<addrinfo*, void (*)(addrinfo*),
   std::__ndk1::allocator<addrinfo> >::~__shared_ptr_pointer() */

void __thiscall
std::__ndk1::__shared_ptr_pointer<addrinfo*,void(*)(addrinfo*),std::__ndk1::allocator<addrinfo>>::
~__shared_ptr_pointer
          (__shared_ptr_pointer<addrinfo*,void(*)(addrinfo*),std::__ndk1::allocator<addrinfo>> *this
          )

{
  __shared_weak_count::~__shared_weak_count((__shared_weak_count *)this);
  operator_delete(this);
  return;
}

