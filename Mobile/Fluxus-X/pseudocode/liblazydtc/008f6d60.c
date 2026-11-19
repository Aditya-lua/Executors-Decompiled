/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008f6d60
 */

/* std::__ndk1::promise<cpr::Response>::set_exception(std::exception_ptr) */

void __thiscall
std::__ndk1::promise<cpr::Response>::set_exception
          (promise<cpr::Response> *this,exception_ptr *param_2)

{
  long lVar1;
  future_error *pfVar2;
  undefined8 uVar3;
  __assoc_sub_state *p_Var4;
  exception_ptr aeStack_30 [8];
  long local_28;
  
  lVar1 = tpidr_el0;
  local_28 = *(long *)(lVar1 + 0x28);
  p_Var4 = *(__assoc_sub_state **)this;
  if (p_Var4 == (__assoc_sub_state *)0x0) {
    pfVar2 = (future_error *)__cxa_allocate_exception(0x20);
    uVar3 = future_category();
                    /* try { // try from 008f6dd4 to 008f6ddf has its CatchHandler @ 008f6dfc */
    future_error::future_error(pfVar2,3,uVar3);
                    /* WARNING: Subroutine does not return */
    __cxa_throw(pfVar2,&future_error::typeinfo,future_error::~future_error);
  }
  exception_ptr::exception_ptr(aeStack_30,param_2);
                    /* try { // try from 008f6d8c to 008f6d97 has its CatchHandler @ 008f6e10 */
  __assoc_sub_state::set_exception(p_Var4,aeStack_30);
  exception_ptr::~exception_ptr(aeStack_30);
  if (*(long *)(lVar1 + 0x28) != local_28) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

