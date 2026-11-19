/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008ed674
 */

/* cpr::Session::SetDebugCallback(cpr::DebugCallback const&) */

void __thiscall cpr::Session::SetDebugCallback(Session *this,DebugCallback *param_1)

{
  long lVar1;
  DebugCallback *pDVar2;
  code *pcVar3;
  function<void(cpr::DebugCallback::InfoType,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,long)>
  afStack_80 [32];
  long *local_60;
  long local_48;
  
  lVar1 = tpidr_el0;
  local_48 = *(long *)(lVar1 + 0x28);
  curl_easy_setopt(**(undefined8 **)(this + 0x18),0x4e7e,util::debugUserFunction);
  *(undefined8 *)(this + 0x1e0) = *(undefined8 *)param_1;
  pDVar2 = *(DebugCallback **)(param_1 + 0x30);
  if (pDVar2 == (DebugCallback *)0x0) {
    local_60 = (long *)0x0;
  }
  else if (param_1 + 0x10 == pDVar2) {
    local_60 = (long *)afStack_80;
    (**(code **)(*(long *)pDVar2 + 0x18))(pDVar2,afStack_80);
  }
  else {
    local_60 = (long *)(**(code **)(*(long *)pDVar2 + 0x10))();
  }
  std::__ndk1::
  function<void(cpr::DebugCallback::InfoType,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,long)>
  ::swap(afStack_80,(function *)(this + 0x1f0));
  if (afStack_80 ==
      (function<void(cpr::DebugCallback::InfoType,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,long)>
       *)local_60) {
    pcVar3 = *(code **)(*local_60 + 0x20);
  }
  else {
    if (local_60 == (long *)0x0) goto LAB_008ed748;
    pcVar3 = *(code **)(*local_60 + 0x28);
  }
  (*pcVar3)();
LAB_008ed748:
  curl_easy_setopt(**(undefined8 **)(this + 0x18),0x276f,this + 0x1e0);
  curl_easy_setopt(**(undefined8 **)(this + 0x18),0x29,1);
  if (*(long *)(lVar1 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

