/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008f5688
 */

/* std::__ndk1::__shared_ptr_emplace<std::__ndk1::packaged_task<cpr::Response ()>,
   std::__ndk1::allocator<std::__ndk1::packaged_task<cpr::Response ()> > >::__on_zero_shared() */

void __thiscall
std::__ndk1::
__shared_ptr_emplace<std::__ndk1::packaged_task<cpr::Response()>,std::__ndk1::allocator<std::__ndk1::packaged_task<cpr::Response()>>>
::__on_zero_shared(__shared_ptr_emplace<std::__ndk1::packaged_task<cpr::Response()>,std::__ndk1::allocator<std::__ndk1::packaged_task<cpr::Response()>>>
                   *this)

{
  __shared_ptr_emplace<std::__ndk1::packaged_task<cpr::Response()>,std::__ndk1::allocator<std::__ndk1::packaged_task<cpr::Response()>>>
  *p_Var1;
  
  promise<cpr::Response>::~promise((promise<cpr::Response> *)(this + 0x50));
  p_Var1 = *(__shared_ptr_emplace<std::__ndk1::packaged_task<cpr::Response()>,std::__ndk1::allocator<std::__ndk1::packaged_task<cpr::Response()>>>
             **)(this + 0x40);
  if (p_Var1 == this + 0x20) {
    (**(code **)(*(long *)p_Var1 + 0x18))();
  }
  else if (p_Var1 != (__shared_ptr_emplace<std::__ndk1::packaged_task<cpr::Response()>,std::__ndk1::allocator<std::__ndk1::packaged_task<cpr::Response()>>>
                      *)0x0) {
                    /* try { // try from 008f56bc to 008f56cf has its CatchHandler @ 008f56dc */
    (**(code **)(*(long *)p_Var1 + 0x20))();
  }
  return;
}

