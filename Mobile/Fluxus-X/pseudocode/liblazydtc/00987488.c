/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00987488
 */

/* std::__ndk1::__shared_ptr_emplace<std::__ndk1::thread,
   std::__ndk1::allocator<std::__ndk1::thread> >::__on_zero_shared() */

void __thiscall
std::__ndk1::__shared_ptr_emplace<std::__ndk1::thread,std::__ndk1::allocator<std::__ndk1::thread>>::
__on_zero_shared(__shared_ptr_emplace<std::__ndk1::thread,std::__ndk1::allocator<std::__ndk1::thread>>
                 *this)

{
  thread::~thread((thread *)(this + 0x18));
  return;
}

