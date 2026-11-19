/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bc4550
 */

/* std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>, std::__ndk1::allocator<char>
   >::find_last_of(char const*, unsigned long, unsigned long) const */

ulong __thiscall
std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
find_last_of(basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *this,
            char *param_1,ulong param_2,ulong param_3)

{
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> bVar1;
  void *pvVar2;
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *pbVar3;
  ulong uVar4;
  
  bVar1 = *this;
  pbVar3 = *(basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> **)
            (this + 0x10);
  if (((byte)bVar1 & 1) == 0) {
    pbVar3 = this + 1;
  }
  if (param_3 == 0) {
LAB_00bc45bc:
    uVar4 = 0xffffffffffffffff;
  }
  else {
    uVar4 = (ulong)((byte)bVar1 >> 1);
    if (((byte)bVar1 & 1) != 0) {
      uVar4 = *(ulong *)(this + 8);
    }
    if (param_2 < uVar4) {
      uVar4 = param_2 + 1;
    }
    do {
      if (uVar4 == 0) goto LAB_00bc45bc;
      pvVar2 = memchr(param_1,(uint)(byte)pbVar3[uVar4 - 1],param_3);
      uVar4 = uVar4 - 1;
    } while (pvVar2 == (void *)0x0);
  }
  return uVar4;
}

