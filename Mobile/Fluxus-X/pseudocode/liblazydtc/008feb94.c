/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008feb94
 */

/* std::__ndk1::__shared_ptr_pointer<std::__ndk1::thread*,
   std::__ndk1::default_delete<std::__ndk1::thread>, std::__ndk1::allocator<std::__ndk1::thread>
   >::__get_deleter(std::type_info const&) const */

__shared_ptr_pointer<std::__ndk1::thread*,std::__ndk1::default_delete<std::__ndk1::thread>,std::__ndk1::allocator<std::__ndk1::thread>>
* __thiscall
std::__ndk1::
__shared_ptr_pointer<std::__ndk1::thread*,std::__ndk1::default_delete<std::__ndk1::thread>,std::__ndk1::allocator<std::__ndk1::thread>>
::__get_deleter(__shared_ptr_pointer<std::__ndk1::thread*,std::__ndk1::default_delete<std::__ndk1::thread>,std::__ndk1::allocator<std::__ndk1::thread>>
                *this,type_info *param_1)

{
  __shared_ptr_pointer<std::__ndk1::thread*,std::__ndk1::default_delete<std::__ndk1::thread>,std::__ndk1::allocator<std::__ndk1::thread>>
  *p_Var1;
  
  p_Var1 = this + 0x18;
  if (*(char **)(param_1 + 8) != "NSt6__ndk114default_deleteINS_6threadEEE") {
    p_Var1 = (__shared_ptr_pointer<std::__ndk1::thread*,std::__ndk1::default_delete<std::__ndk1::thread>,std::__ndk1::allocator<std::__ndk1::thread>>
              *)0x0;
  }
  return p_Var1;
}

