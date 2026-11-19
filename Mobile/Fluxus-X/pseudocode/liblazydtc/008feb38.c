/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008feb38
 */

/* std::__ndk1::__shared_ptr_pointer<std::__ndk1::thread*,
   std::__ndk1::default_delete<std::__ndk1::thread>, std::__ndk1::allocator<std::__ndk1::thread>
   >::~__shared_ptr_pointer() */

void __thiscall
std::__ndk1::
__shared_ptr_pointer<std::__ndk1::thread*,std::__ndk1::default_delete<std::__ndk1::thread>,std::__ndk1::allocator<std::__ndk1::thread>>
::~__shared_ptr_pointer
          (__shared_ptr_pointer<std::__ndk1::thread*,std::__ndk1::default_delete<std::__ndk1::thread>,std::__ndk1::allocator<std::__ndk1::thread>>
           *this)

{
  __shared_weak_count::~__shared_weak_count((__shared_weak_count *)this);
  operator_delete(this);
  return;
}

