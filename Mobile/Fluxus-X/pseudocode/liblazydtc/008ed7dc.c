/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008ed7dc
 */

/* cpr::Session::SetResolve(cpr::Resolve const&) */

void __thiscall cpr::Session::SetResolve(Session *this,Resolve *param_1)

{
  long lVar1;
  Resolve *this_00;
  Resolve local_80 [16];
  void *local_70;
  byte local_68;
  void *local_58;
  __tree<unsigned_short,std::__ndk1::less<unsigned_short>,std::__ndk1::allocator<unsigned_short>>
  a_Stack_50 [8];
  __tree_node *local_48;
  long local_38;
  
  lVar1 = tpidr_el0;
  local_38 = *(long *)(lVar1 + 0x28);
                    /* try { // try from 008ed800 to 008ed807 has its CatchHandler @ 008ed964 */
  Resolve::Resolve(local_80,param_1);
                    /* try { // try from 008ed810 to 008ed817 has its CatchHandler @ 008ed918 */
  this_00 = operator_new(0x48);
                    /* try { // try from 008ed828 to 008ed82f has its CatchHandler @ 008ed904 */
  Resolve::Resolve(this_00,local_80);
                    /* try { // try from 008ed834 to 008ed83f has its CatchHandler @ 008ed8d0 */
  SetResolves((vector *)this);
  std::__ndk1::
  __tree<unsigned_short,std::__ndk1::less<unsigned_short>,std::__ndk1::allocator<unsigned_short>>::
  destroy((__tree<unsigned_short,std::__ndk1::less<unsigned_short>,std::__ndk1::allocator<unsigned_short>>
           *)(this_00 + 0x30),*(__tree_node **)(this_00 + 0x38));
  if (((byte)this_00[0x18] & 1) != 0) {
    operator_delete(*(void **)(this_00 + 0x28));
  }
  if (((byte)*this_00 & 1) != 0) {
    operator_delete(*(void **)(this_00 + 0x10));
  }
  operator_delete(this_00);
  std::__ndk1::
  __tree<unsigned_short,std::__ndk1::less<unsigned_short>,std::__ndk1::allocator<unsigned_short>>::
  destroy(a_Stack_50,local_48);
  if ((local_68 & 1) != 0) {
    operator_delete(local_58);
  }
  if (((byte)local_80[0] & 1) != 0) {
    operator_delete(local_70);
  }
  if (*(long *)(lVar1 + 0x28) != local_38) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

