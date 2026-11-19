/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008f59bc
 */

/* std::__ndk1::promise<cpr::Response>::~promise() */

void __thiscall std::__ndk1::promise<cpr::Response>::~promise(promise<cpr::Response> *this)

{
  long *plVar1;
  char cVar2;
  bool bVar3;
  long lVar4;
  undefined8 uVar5;
  long *plVar6;
  long lVar7;
  __assoc_sub_state *p_Var8;
  future_error afStack_68 [32];
  exception_ptr aeStack_48 [8];
  undefined8 local_40;
  long local_38;
  
  lVar4 = tpidr_el0;
  local_38 = *(long *)(lVar4 + 0x28);
  lVar7 = *(long *)this;
  if (lVar7 != 0) {
    if ((*(byte *)(lVar7 + 0x70) & 1) == 0) {
      local_40 = 0;
      lVar7 = *(long *)(lVar7 + 0x10);
      exception_ptr::~exception_ptr((exception_ptr *)&local_40);
      if ((lVar7 == 0) && (p_Var8 = *(__assoc_sub_state **)this, 0 < *(long *)(p_Var8 + 8))) {
        uVar5 = future_category();
                    /* try { // try from 008f5a1c to 008f5a27 has its CatchHandler @ 008f5abc */
        future_error::future_error(afStack_68,4,uVar5);
        make_exception_ptr<std::__ndk1::future_error>(aeStack_48,afStack_68);
                    /* try { // try from 008f5a34 to 008f5a3f has its CatchHandler @ 008f5aa0 */
        __assoc_sub_state::set_exception(p_Var8,aeStack_48);
        exception_ptr::~exception_ptr(aeStack_48);
        future_error::~future_error(afStack_68);
      }
    }
    plVar6 = *(long **)this;
    plVar1 = plVar6 + 1;
    do {
      lVar7 = *plVar1;
      cVar2 = '\x01';
      bVar3 = (bool)ExclusiveMonitorPass(plVar1,0x10);
      if (bVar3) {
        *plVar1 = lVar7 + -1;
        cVar2 = ExclusiveMonitorsStatus();
      }
    } while (cVar2 != '\0');
    if (lVar7 == 0) {
      (**(code **)(*plVar6 + 0x10))();
    }
  }
  if (*(long *)(lVar4 + 0x28) != local_38) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

