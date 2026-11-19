/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008f6b8c
 */

/* std::__ndk1::packaged_task<cpr::Response ()>::TEMPNAMEPLACEHOLDERVALUE() */

void __thiscall
std::__ndk1::packaged_task<cpr::Response()>::operator()(packaged_task<cpr::Response()> *this)

{
  long lVar1;
  __assoc_state<cpr::Response> *this_00;
  future_error *pfVar2;
  undefined8 uVar3;
  long lVar4;
  undefined8 local_158 [34];
  long local_48;
  
  lVar1 = tpidr_el0;
  local_48 = *(long *)(lVar1 + 0x28);
  lVar4 = *(long *)(this + 0x30);
  if (lVar4 == 0) {
    pfVar2 = (future_error *)__cxa_allocate_exception(0x20);
    uVar3 = future_category();
                    /* try { // try from 008f6c68 to 008f6c73 has its CatchHandler @ 008f6ce0 */
    future_error::future_error(pfVar2,3,uVar3);
  }
  else {
    if ((*(byte *)(lVar4 + 0x70) & 1) == 0) {
      local_158[0] = 0;
      lVar4 = *(long *)(lVar4 + 0x10);
      exception_ptr::~exception_ptr((exception_ptr *)local_158);
      if (lVar4 == 0) {
                    /* try { // try from 008f6be8 to 008f6bef has its CatchHandler @ 008f6d0c */
        (**(code **)(**(long **)(this + 0x20) + 0x28))(local_158);
        this_00 = *(__assoc_state<cpr::Response> **)(this + 0x30);
        if (this_00 == (__assoc_state<cpr::Response> *)0x0) {
          pfVar2 = (future_error *)__cxa_allocate_exception(0x20);
          uVar3 = future_category();
                    /* try { // try from 008f6ca8 to 008f6cb3 has its CatchHandler @ 008f6cd0 */
          future_error::future_error(pfVar2,3,uVar3);
                    /* try { // try from 008f6cb4 to 008f6ccf has its CatchHandler @ 008f6cf8 */
                    /* WARNING: Subroutine does not return */
          __cxa_throw(pfVar2,&future_error::typeinfo,future_error::~future_error);
        }
                    /* try { // try from 008f6bf8 to 008f6bff has its CatchHandler @ 008f6cf8 */
        __assoc_state<cpr::Response>::set_value<cpr::Response>(this_00,(Response *)local_158);
        FUN_008247c0(local_158);
        if (*(long *)(lVar1 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
          __stack_chk_fail();
        }
        return;
      }
    }
    pfVar2 = (future_error *)__cxa_allocate_exception(0x20);
    uVar3 = future_category();
                    /* try { // try from 008f6c44 to 008f6c4f has its CatchHandler @ 008f6ce4 */
    future_error::future_error(pfVar2,2,uVar3);
  }
                    /* WARNING: Subroutine does not return */
  __cxa_throw(pfVar2,&future_error::typeinfo,future_error::~future_error);
}

