/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bc3cb0
 */

/* std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>, std::__ndk1::allocator<char>
   >::find_first_not_of(char const*, unsigned long, unsigned long) const */

long __thiscall
std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
find_first_not_of(basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
                  *this,char *param_1,ulong param_2,ulong param_3)

{
  ulong uVar1;
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *pbVar2;
  void *pvVar3;
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *pbVar4;
  long lVar5;
  
  uVar1 = *(ulong *)(this + 8);
  pbVar2 = *(basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> **)
            (this + 0x10);
  if (((byte)*this & 1) == 0) {
    pbVar2 = this + 1;
    uVar1 = (ulong)((byte)*this >> 1);
  }
  lVar5 = uVar1 - param_2;
  if (param_2 <= uVar1 && lVar5 != 0) {
    pbVar4 = pbVar2 + param_2;
    if (param_3 == 0) {
LAB_00bc3d20:
      return (long)pbVar4 - (long)pbVar2;
    }
    do {
      pvVar3 = memchr(param_1,(uint)(byte)*pbVar4,param_3);
      if (pvVar3 == (void *)0x0) goto LAB_00bc3d20;
      lVar5 = lVar5 + -1;
      pbVar4 = pbVar4 + 1;
    } while (lVar5 != 0);
  }
  return -1;
}

