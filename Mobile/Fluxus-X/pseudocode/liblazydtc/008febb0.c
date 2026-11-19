/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008febb0
 */

/* std::__ndk1::__shared_ptr_pointer<std::__ndk1::thread*,
   std::__ndk1::default_delete<std::__ndk1::thread>, std::__ndk1::allocator<std::__ndk1::thread>
   >::__on_zero_shared_weak() */

void __thiscall
std::__ndk1::
__shared_ptr_pointer<std::__ndk1::thread*,std::__ndk1::default_delete<std::__ndk1::thread>,std::__ndk1::allocator<std::__ndk1::thread>>
::__on_zero_shared_weak
          (__shared_ptr_pointer<std::__ndk1::thread*,std::__ndk1::default_delete<std::__ndk1::thread>,std::__ndk1::allocator<std::__ndk1::thread>>
           *this)

{
  operator_delete(this);
  return;
}

