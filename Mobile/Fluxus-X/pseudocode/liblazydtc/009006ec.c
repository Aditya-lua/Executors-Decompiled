/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009006ec
 */

/* cpr::HeaderCallback::TEMPNAMEPLACEHOLDERVALUE(std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> >) const */

uint __thiscall cpr::HeaderCallback::operator()(HeaderCallback *this,ulong *param_2)

{
  long lVar1;
  uint uVar2;
  long *plVar3;
  undefined8 *puVar4;
  ulong local_50;
  ulong uStack_48;
  void *local_40;
  undefined8 local_30;
  long local_28;
  
  lVar1 = tpidr_el0;
  local_28 = *(long *)(lVar1 + 0x28);
  local_40 = (void *)param_2[2];
  uStack_48 = param_2[1];
  local_50 = *param_2;
  param_2[1] = 0;
  param_2[2] = 0;
  *param_2 = 0;
  local_30 = *(undefined8 *)this;
  plVar3 = *(long **)(this + 0x30);
  if (plVar3 == (long *)0x0) {
    puVar4 = (undefined8 *)__cxa_allocate_exception(8);
    *puVar4 = &PTR__bad_function_call_00cac7b8;
                    /* try { // try from 00900794 to 009007a7 has its CatchHandler @ 009007ac */
                    /* WARNING: Subroutine does not return */
    __cxa_throw(puVar4,&std::__ndk1::bad_function_call::typeinfo,std::bad_exception::~bad_exception)
    ;
  }
                    /* try { // try from 00900738 to 00900743 has its CatchHandler @ 009007ac */
  uVar2 = (**(code **)(*plVar3 + 0x30))(plVar3,&local_50,&local_30);
  if ((local_50 & 1) != 0) {
    operator_delete(local_40);
  }
  if (*(long *)(lVar1 + 0x28) != local_28) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return uVar2 & 1;
}

