/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00987418
 */

/* std::__ndk1::__shared_ptr_emplace<std::__ndk1::thread,
   std::__ndk1::allocator<std::__ndk1::thread> >::~__shared_ptr_emplace() */

void __thiscall
std::__ndk1::__shared_ptr_emplace<std::__ndk1::thread,std::__ndk1::allocator<std::__ndk1::thread>>::
~__shared_ptr_emplace
          (__shared_ptr_emplace<std::__ndk1::thread,std::__ndk1::allocator<std::__ndk1::thread>>
           *this)

{
  *(undefined ***)this = &PTR____shared_ptr_emplace_00c51fe8;
  thread::~thread((thread *)(this + 0x18));
  __shared_weak_count::~__shared_weak_count((__shared_weak_count *)this);
  return;
}

