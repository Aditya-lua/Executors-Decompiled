/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bc39fc
 */

/* std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>, std::__ndk1::allocator<char>
   >::rfind(char const*, unsigned long, unsigned long) const */

long __thiscall
std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::rfind
          (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *this,
          char *param_1,ulong param_2,ulong param_3)

{
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *pbVar1;
  ulong uVar2;
  ulong uVar3;
  ulong uVar4;
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *pbVar5;
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> bVar6;
  long lVar7;
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *pbVar8;
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *pbVar9;
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *pbVar10;
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *pbVar11;
  
  uVar4 = *(ulong *)(this + 8);
  pbVar5 = *(basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> **)
            (this + 0x10);
  if (((byte)*this & 1) == 0) {
    pbVar5 = this + 1;
    uVar4 = (ulong)((byte)*this >> 1);
  }
  uVar2 = uVar4;
  if (param_2 <= uVar4) {
    uVar2 = param_2;
  }
  uVar3 = uVar2 + param_3;
  if (uVar4 - uVar2 <= param_3) {
    uVar3 = uVar4;
  }
  pbVar1 = pbVar5 + uVar3;
  pbVar8 = pbVar1;
  if ((param_3 != 0) && (uVar3 != 0)) {
    pbVar9 = pbVar5;
    do {
      pbVar10 = pbVar9;
      while( true ) {
        pbVar10 = pbVar10 + 1;
        uVar4 = param_3;
        pbVar11 = (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)
                  param_1;
        if (*pbVar9 ==
            (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>)*param_1
           ) break;
        pbVar9 = pbVar9 + 1;
        if (pbVar9 == pbVar1) goto LAB_00bc3ab4;
      }
      do {
        pbVar11 = pbVar11 + 1;
        if (uVar4 - 1 == 0) {
          pbVar8 = pbVar9;
          break;
        }
        if (pbVar10 == pbVar1) goto LAB_00bc3ab4;
        bVar6 = *pbVar10;
        pbVar10 = pbVar10 + 1;
        uVar4 = uVar4 - 1;
      } while (bVar6 == *pbVar11);
      pbVar9 = pbVar9 + 1;
    } while (pbVar9 != pbVar1);
  }
LAB_00bc3ab4:
  lVar7 = (long)pbVar8 - (long)pbVar5;
  if (pbVar8 == pbVar1 && param_3 != 0) {
    lVar7 = -1;
  }
  return lVar7;
}

