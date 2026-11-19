/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009873f8
 */

/* std::__ndk1::__shared_ptr_pointer<addrinfo*, void (*)(addrinfo*),
   std::__ndk1::allocator<addrinfo> >::__get_deleter(std::type_info const&) const */

__shared_ptr_pointer<addrinfo*,void(*)(addrinfo*),std::__ndk1::allocator<addrinfo>> * __thiscall
std::__ndk1::__shared_ptr_pointer<addrinfo*,void(*)(addrinfo*),std::__ndk1::allocator<addrinfo>>::
__get_deleter(__shared_ptr_pointer<addrinfo*,void(*)(addrinfo*),std::__ndk1::allocator<addrinfo>>
              *this,type_info *param_1)

{
  __shared_ptr_pointer<addrinfo*,void(*)(addrinfo*),std::__ndk1::allocator<addrinfo>> *p_Var1;
  
  p_Var1 = this + 0x20;
  if (*(char **)(param_1 + 8) != "PFvP8addrinfoE") {
    p_Var1 = (__shared_ptr_pointer<addrinfo*,void(*)(addrinfo*),std::__ndk1::allocator<addrinfo>> *)
             0x0;
  }
  return p_Var1;
}

