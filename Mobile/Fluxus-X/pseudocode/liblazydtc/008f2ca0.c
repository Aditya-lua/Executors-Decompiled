/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008f2ca0
 */

/* cpr::Session::SetOption(cpr::Url const&) */

void __thiscall cpr::Session::SetOption(Session *this,Url *param_1)

{
  ulong uVar1;
  Url *pUVar2;
  
  if (this + 0x28 != (Session *)param_1) {
    uVar1 = *(ulong *)(param_1 + 0x10);
    pUVar2 = *(Url **)(param_1 + 0x18);
    if (((byte)param_1[8] & 1) == 0) {
      pUVar2 = param_1 + 9;
      uVar1 = (ulong)((byte)param_1[8] >> 1);
    }
    std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
    assign((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)
           (this + 0x30),(char *)pUVar2,uVar1);
  }
  return;
}

