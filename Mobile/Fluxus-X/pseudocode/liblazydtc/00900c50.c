/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00900c50
 */

/* cpr::DebugCallback::TEMPNAMEPLACEHOLDERVALUE(cpr::DebugCallback::InfoType,
   std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> >)
   const */

void __thiscall
cpr::DebugCallback::operator()(DebugCallback *this,undefined4 param_2,ulong *param_3)

{
  long lVar1;
  long *plVar2;
  undefined8 *puVar3;
  ulong local_50;
  ulong uStack_48;
  void *local_40;
  undefined8 local_38;
  undefined4 local_2c;
  long local_28;
  
  lVar1 = tpidr_el0;
  local_28 = *(long *)(lVar1 + 0x28);
  local_40 = (void *)param_3[2];
  uStack_48 = param_3[1];
  local_50 = *param_3;
  param_3[1] = 0;
  param_3[2] = 0;
  *param_3 = 0;
  local_38 = *(undefined8 *)this;
  plVar2 = *(long **)(this + 0x30);
  local_2c = param_2;
  if (plVar2 == (long *)0x0) {
    puVar3 = (undefined8 *)__cxa_allocate_exception(8);
    *puVar3 = &PTR__bad_function_call_00cac7b8;
                    /* try { // try from 00900cf8 to 00900d0b has its CatchHandler @ 00900d10 */
                    /* WARNING: Subroutine does not return */
    __cxa_throw(puVar3,&std::__ndk1::bad_function_call::typeinfo,std::bad_exception::~bad_exception)
    ;
  }
                    /* try { // try from 00900ca0 to 00900caf has its CatchHandler @ 00900d10 */
  (**(code **)(*plVar2 + 0x30))(plVar2,&local_2c,&local_50,&local_38);
  if ((local_50 & 1) != 0) {
    operator_delete(local_40);
  }
  if (*(long *)(lVar1 + 0x28) != local_28) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

