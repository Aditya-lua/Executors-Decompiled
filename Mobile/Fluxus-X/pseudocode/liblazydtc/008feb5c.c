/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008feb5c
 */

/* std::__ndk1::__shared_ptr_pointer<std::__ndk1::thread*,
   std::__ndk1::default_delete<std::__ndk1::thread>, std::__ndk1::allocator<std::__ndk1::thread>
   >::__on_zero_shared() */

void __thiscall
std::__ndk1::
__shared_ptr_pointer<std::__ndk1::thread*,std::__ndk1::default_delete<std::__ndk1::thread>,std::__ndk1::allocator<std::__ndk1::thread>>
::__on_zero_shared(__shared_ptr_pointer<std::__ndk1::thread*,std::__ndk1::default_delete<std::__ndk1::thread>,std::__ndk1::allocator<std::__ndk1::thread>>
                   *this)

{
  thread *this_00;
  
  this_00 = *(thread **)(this + 0x18);
  if (this_00 == (thread *)0x0) {
    return;
  }
  thread::~thread(this_00);
  operator_delete(this_00);
  return;
}

