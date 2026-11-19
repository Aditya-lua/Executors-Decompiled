/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008f5618
 */

/* std::__ndk1::__shared_ptr_emplace<std::__ndk1::packaged_task<cpr::Response ()>,
   std::__ndk1::allocator<std::__ndk1::packaged_task<cpr::Response ()> > >::~__shared_ptr_emplace()
    */

void __thiscall
std::__ndk1::
__shared_ptr_emplace<std::__ndk1::packaged_task<cpr::Response()>,std::__ndk1::allocator<std::__ndk1::packaged_task<cpr::Response()>>>
::~__shared_ptr_emplace
          (__shared_ptr_emplace<std::__ndk1::packaged_task<cpr::Response()>,std::__ndk1::allocator<std::__ndk1::packaged_task<cpr::Response()>>>
           *this)

{
  __shared_ptr_emplace<std::__ndk1::packaged_task<cpr::Response()>,std::__ndk1::allocator<std::__ndk1::packaged_task<cpr::Response()>>>
  *p_Var1;
  
  *(undefined ***)this = &PTR____shared_ptr_emplace_00c4e7d8;
  promise<cpr::Response>::~promise((promise<cpr::Response> *)(this + 0x50));
  p_Var1 = *(__shared_ptr_emplace<std::__ndk1::packaged_task<cpr::Response()>,std::__ndk1::allocator<std::__ndk1::packaged_task<cpr::Response()>>>
             **)(this + 0x40);
  if (p_Var1 == this + 0x20) {
    (**(code **)(*(long *)p_Var1 + 0x18))();
  }
  else if (p_Var1 != (__shared_ptr_emplace<std::__ndk1::packaged_task<cpr::Response()>,std::__ndk1::allocator<std::__ndk1::packaged_task<cpr::Response()>>>
                      *)0x0) {
                    /* try { // try from 008f5658 to 008f566b has its CatchHandler @ 008f5684 */
    (**(code **)(*(long *)p_Var1 + 0x20))();
  }
  __shared_weak_count::~__shared_weak_count((__shared_weak_count *)this);
  operator_delete(this);
  return;
}

