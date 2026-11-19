/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bd2744
 */

/* std::__ndk1::basic_streambuf<wchar_t, std::__ndk1::char_traits<wchar_t> >::sbumpc() */

ulong __thiscall
std::__ndk1::basic_streambuf<wchar_t,std::__ndk1::char_traits<wchar_t>>::sbumpc
          (basic_streambuf<wchar_t,std::__ndk1::char_traits<wchar_t>> *this)

{
  uint *puVar1;
  uint uVar2;
  ulong uVar3;
  
  puVar1 = *(uint **)(this + 0x18);
  if (puVar1 == *(uint **)(this + 0x20)) {
                    /* WARNING: Could not recover jumptable at 0x00bd2770. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    uVar3 = (**(code **)(*(long *)this + 0x50))(this);
    return uVar3;
  }
  uVar2 = *puVar1;
  *(uint **)(this + 0x18) = puVar1 + 1;
  return (ulong)uVar2;
}

