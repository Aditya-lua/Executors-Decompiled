/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008e73e0
 */

/* cpr::CancellationCallback::TEMPNAMEPLACEHOLDERVALUE(long, long, long, long) const */

byte __thiscall
cpr::CancellationCallback::operator()
          (CancellationCallback *this,long param_1,long param_2,long param_3,long param_4)

{
  long lVar1;
  byte bVar2;
  long *plVar3;
  undefined8 *puVar4;
  undefined8 local_50;
  long local_48;
  long lStack_40;
  long local_38;
  long lStack_30;
  long local_28;
  
  lVar1 = tpidr_el0;
  local_28 = *(long *)(lVar1 + 0x28);
  bVar2 = this[0x18] == (CancellationCallback)0x0 && (**(byte **)this & 1) == 0;
  if (((**(byte **)this & 1) == 0) && (this[0x18] != (CancellationCallback)0x0)) {
    local_50 = **(undefined8 **)(this + 0x10);
    plVar3 = (long *)(*(undefined8 **)(this + 0x10))[6];
    local_48 = param_4;
    lStack_40 = param_3;
    local_38 = param_2;
    lStack_30 = param_1;
    if (plVar3 == (long *)0x0) {
      puVar4 = (undefined8 *)__cxa_allocate_exception(8);
      *puVar4 = &PTR__bad_function_call_00cac7b8;
                    /* WARNING: Subroutine does not return */
      __cxa_throw(puVar4,&std::__ndk1::bad_function_call::typeinfo,
                  std::bad_exception::~bad_exception);
    }
    bVar2 = (**(code **)(*plVar3 + 0x30))
                      (plVar3,&lStack_30,&local_38,&lStack_40,&local_48,&local_50);
  }
  if (*(long *)(lVar1 + 0x28) != local_28) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return bVar2 & 1;
}

