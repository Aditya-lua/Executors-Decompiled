/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bd27e0
 */

/* std::__ndk1::basic_streambuf<wchar_t, std::__ndk1::char_traits<wchar_t> >::sungetc() */

ulong __thiscall
std::__ndk1::basic_streambuf<wchar_t,std::__ndk1::char_traits<wchar_t>>::sungetc
          (basic_streambuf<wchar_t,std::__ndk1::char_traits<wchar_t>> *this)

{
  uint uVar1;
  ulong uVar2;
  uint *puVar3;
  
  if (*(long *)(this + 0x10) == *(long *)(this + 0x18)) {
                    /* WARNING: Could not recover jumptable at 0x00bd2810. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    uVar2 = (**(code **)(*(long *)this + 0x58))(this,0xffffffff);
    return uVar2;
  }
  puVar3 = (uint *)(*(long *)(this + 0x18) + -4);
  uVar1 = *puVar3;
  *(uint **)(this + 0x18) = puVar3;
  return (ulong)uVar1;
}

