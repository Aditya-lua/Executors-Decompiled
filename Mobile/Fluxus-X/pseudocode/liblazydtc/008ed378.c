/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008ed378
 */

/* cpr::Session::SetWriteCallback(cpr::WriteCallback const&) */

void __thiscall cpr::Session::SetWriteCallback(Session *this,WriteCallback *param_1)

{
  long lVar1;
  WriteCallback *pWVar2;
  code *pcVar3;
  function<bool(std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,long)>
  afStack_80 [32];
  long *local_60;
  long local_48;
  
  lVar1 = tpidr_el0;
  local_48 = *(long *)(lVar1 + 0x28);
  curl_easy_setopt(**(undefined8 **)(this + 0x18),0x4e2b,util::writeUserFunction);
  *(undefined8 *)(this + 0x160) = *(undefined8 *)param_1;
  pWVar2 = *(WriteCallback **)(param_1 + 0x30);
  if (pWVar2 == (WriteCallback *)0x0) {
    local_60 = (long *)0x0;
  }
  else if (param_1 + 0x10 == pWVar2) {
    local_60 = (long *)afStack_80;
    (**(code **)(*(long *)pWVar2 + 0x18))(pWVar2,afStack_80);
  }
  else {
    local_60 = (long *)(**(code **)(*(long *)pWVar2 + 0x10))();
  }
  std::__ndk1::
  function<bool(std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,long)>
  ::swap(afStack_80,(function *)(this + 0x170));
  if (afStack_80 ==
      (function<bool(std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,long)>
       *)local_60) {
    pcVar3 = *(code **)(*local_60 + 0x20);
  }
  else {
    if (local_60 == (long *)0x0) goto LAB_008ed44c;
    pcVar3 = *(code **)(*local_60 + 0x28);
  }
  (*pcVar3)();
LAB_008ed44c:
  curl_easy_setopt(**(undefined8 **)(this + 0x18),0x2711,this + 0x160);
  if (*(long *)(lVar1 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

