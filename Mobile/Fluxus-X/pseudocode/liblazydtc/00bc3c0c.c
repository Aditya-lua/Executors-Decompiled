/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bc3c0c
 */

/* std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>, std::__ndk1::allocator<char>
   >::find_last_not_of(char const*, unsigned long, unsigned long) const */

ulong __thiscall
std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
find_last_not_of(basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
                 *this,char *param_1,ulong param_2,ulong param_3)

{
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *pbVar1;
  void *pvVar2;
  ulong uVar3;
  
  uVar3 = *(ulong *)(this + 8);
  pbVar1 = *(basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> **)
            (this + 0x10);
  if (((byte)*this & 1) == 0) {
    pbVar1 = this + 1;
    uVar3 = (ulong)((byte)*this >> 1);
  }
  if (param_2 < uVar3) {
    uVar3 = param_2 + 1;
  }
  while( true ) {
    uVar3 = uVar3 - 1;
    if (uVar3 == 0xffffffffffffffff) {
      return 0xffffffffffffffff;
    }
    if (param_3 == 0) break;
    pvVar2 = memchr(param_1,(uint)(byte)pbVar1[uVar3],param_3);
    if (pvVar2 == (void *)0x0) {
      return uVar3;
    }
  }
  return uVar3;
}

