/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009975b0
 */

/* ix::WebSocketTransport::setOnCloseCallback(std::__ndk1::function<void (unsigned short,
   std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> >
   const&, unsigned long, bool)> const&) */

void __thiscall
ix::WebSocketTransport::setOnCloseCallback(WebSocketTransport *this,function *param_1)

{
  long lVar1;
  function *pfVar2;
  code *pcVar3;
  function<void(unsigned_short,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>const&,unsigned_long,bool)>
  afStack_70 [32];
  long *local_50;
  long local_38;
  
  local_50 = (long *)afStack_70;
  lVar1 = tpidr_el0;
  local_38 = *(long *)(lVar1 + 0x28);
  pfVar2 = *(function **)(param_1 + 0x20);
  if (pfVar2 == (function *)0x0) {
    local_50 = (long *)0x0;
  }
  else if (param_1 == pfVar2) {
    (**(code **)(*(long *)pfVar2 + 0x18))(pfVar2,afStack_70);
  }
  else {
    local_50 = (long *)(**(code **)(*(long *)pfVar2 + 0x10))(pfVar2);
  }
  std::__ndk1::
  function<void(unsigned_short,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>const&,unsigned_long,bool)>
  ::swap(afStack_70,(function *)(this + 0xf0));
  if (afStack_70 ==
      (function<void(unsigned_short,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>const&,unsigned_long,bool)>
       *)local_50) {
    pcVar3 = *(code **)(*local_50 + 0x20);
  }
  else {
    if (local_50 == (long *)0x0) goto LAB_00997658;
    pcVar3 = *(code **)(*local_50 + 0x28);
  }
  (*pcVar3)();
LAB_00997658:
  if (*(long *)(lVar1 + 0x28) != local_38) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

