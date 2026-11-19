/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008ed264
 */

/* cpr::Session::SetHeaderCallback(cpr::HeaderCallback const&) */

void __thiscall cpr::Session::SetHeaderCallback(Session *this,HeaderCallback *param_1)

{
  long lVar1;
  HeaderCallback *pHVar2;
  code *pcVar3;
  function<bool(std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,long)>
  afStack_80 [32];
  long *local_60;
  long local_48;
  
  lVar1 = tpidr_el0;
  local_48 = *(long *)(lVar1 + 0x28);
  curl_easy_setopt(**(undefined8 **)(this + 0x18),0x4e6f,util::headerUserFunction);
  *(undefined8 *)(this + 0x120) = *(undefined8 *)param_1;
  pHVar2 = *(HeaderCallback **)(param_1 + 0x30);
  if (pHVar2 == (HeaderCallback *)0x0) {
    local_60 = (long *)0x0;
  }
  else if (param_1 + 0x10 == pHVar2) {
    local_60 = (long *)afStack_80;
    (**(code **)(*(long *)pHVar2 + 0x18))(pHVar2,afStack_80);
  }
  else {
    local_60 = (long *)(**(code **)(*(long *)pHVar2 + 0x10))();
  }
  std::__ndk1::
  function<bool(std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,long)>
  ::swap(afStack_80,(function *)(this + 0x130));
  if (afStack_80 ==
      (function<bool(std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,long)>
       *)local_60) {
    pcVar3 = *(code **)(*local_60 + 0x20);
  }
  else {
    if (local_60 == (long *)0x0) goto LAB_008ed338;
    pcVar3 = *(code **)(*local_60 + 0x28);
  }
  (*pcVar3)();
LAB_008ed338:
  curl_easy_setopt(**(undefined8 **)(this + 0x18),0x272d,this + 0x120);
  if (*(long *)(lVar1 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

