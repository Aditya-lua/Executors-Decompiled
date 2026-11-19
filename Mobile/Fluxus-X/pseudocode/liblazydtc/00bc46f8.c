/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bc46f8
 */

/* std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>, std::__ndk1::allocator<char>
   >::rfind(char, unsigned long) const */

ulong __thiscall
std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::rfind
          (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *this,
          char param_1,ulong param_2)

{
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *pbVar1;
  long lVar2;
  ulong uVar3;
  
  pbVar1 = *(basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> **)
            (this + 0x10);
  uVar3 = (ulong)((byte)*this >> 1);
  if (((byte)*this & 1) == 0) {
    pbVar1 = this + 1;
  }
  else {
    uVar3 = *(ulong *)(this + 8);
  }
  if (uVar3 != 0) {
    if (param_2 < uVar3) {
      uVar3 = param_2 + 1;
    }
    while (uVar3 != 0) {
      lVar2 = uVar3 - 1;
      uVar3 = uVar3 - 1;
      if (pbVar1[lVar2] ==
          (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>)param_1) {
        return uVar3;
      }
    }
  }
  return 0xffffffffffffffff;
}

