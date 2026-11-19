/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009813bc
 */

/* std::__ndk1::__shared_ptr_emplace<ix::ConnectionState,
   std::__ndk1::allocator<ix::ConnectionState> >::~__shared_ptr_emplace() */

void __thiscall
std::__ndk1::__shared_ptr_emplace<ix::ConnectionState,std::__ndk1::allocator<ix::ConnectionState>>::
~__shared_ptr_emplace
          (__shared_ptr_emplace<ix::ConnectionState,std::__ndk1::allocator<ix::ConnectionState>>
           *this)

{
  __shared_ptr_emplace<ix::ConnectionState,std::__ndk1::allocator<ix::ConnectionState>> *p_Var1;
  code *pcVar2;
  
  *(undefined ***)this = &PTR____shared_ptr_emplace_00c51d88;
  *(undefined ***)(this + 0x20) = &PTR__ConnectionState_00c51d48;
  if (((byte)this[0x80] & 1) != 0) {
    operator_delete(*(void **)(this + 0x90));
  }
  p_Var1 = *(__shared_ptr_emplace<ix::ConnectionState,std::__ndk1::allocator<ix::ConnectionState>>
             **)(this + 0x70);
  if (this + 0x50 == p_Var1) {
    pcVar2 = *(code **)(*(long *)p_Var1 + 0x20);
  }
  else {
    if (p_Var1 == (__shared_ptr_emplace<ix::ConnectionState,std::__ndk1::allocator<ix::ConnectionState>>
                   *)0x0) goto LAB_00981428;
    pcVar2 = *(code **)(*(long *)p_Var1 + 0x28);
  }
  (*pcVar2)();
LAB_00981428:
  if (((byte)this[0x30] & 1) != 0) {
    operator_delete(*(void **)(this + 0x40));
  }
  __shared_weak_count::~__shared_weak_count((__shared_weak_count *)this);
  operator_delete(this);
  return;
}

