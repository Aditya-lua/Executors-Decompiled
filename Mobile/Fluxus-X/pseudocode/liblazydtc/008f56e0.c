/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008f56e0
 */

/* std::__ndk1::__shared_ptr_emplace<std::__ndk1::packaged_task<cpr::Response ()>,
   std::__ndk1::allocator<std::__ndk1::packaged_task<cpr::Response ()> > >::__on_zero_shared_weak()
    */

void __thiscall
std::__ndk1::
__shared_ptr_emplace<std::__ndk1::packaged_task<cpr::Response()>,std::__ndk1::allocator<std::__ndk1::packaged_task<cpr::Response()>>>
::__on_zero_shared_weak
          (__shared_ptr_emplace<std::__ndk1::packaged_task<cpr::Response()>,std::__ndk1::allocator<std::__ndk1::packaged_task<cpr::Response()>>>
           *this)

{
  operator_delete(this);
  return;
}

