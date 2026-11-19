/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bc3ffc
 */

/* std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>, std::__ndk1::allocator<char>
   >::find_first_of(char const*, unsigned long, unsigned long) const */

long __thiscall
std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
find_first_of(basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *this,
             char *param_1,ulong param_2,ulong param_3)

{
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *pbVar1;
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *pbVar2;
  long lVar3;
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *pbVar4;
  ulong uVar5;
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *pbVar6;
  
  lVar3 = -1;
  uVar5 = *(ulong *)(this + 8);
  pbVar2 = *(basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> **)
            (this + 0x10);
  if (((byte)*this & 1) == 0) {
    pbVar2 = this + 1;
    uVar5 = (ulong)((byte)*this >> 1);
  }
  if ((param_3 != 0) && (param_2 < uVar5)) {
    pbVar1 = pbVar2 + uVar5;
    pbVar4 = pbVar2 + param_2;
    do {
      uVar5 = param_3;
      pbVar6 = (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)
               param_1;
      do {
        if (*pbVar4 == *pbVar6) goto LAB_00bc4068;
        uVar5 = uVar5 - 1;
        pbVar6 = pbVar6 + 1;
      } while (uVar5 != 0);
      pbVar4 = pbVar4 + 1;
    } while (pbVar4 != pbVar1);
    pbVar4 = pbVar1;
LAB_00bc4068:
    lVar3 = (long)pbVar4 - (long)pbVar2;
    if (pbVar4 == pbVar1) {
      lVar3 = -1;
    }
  }
  return lVar3;
}

