/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bc4a98
 */

/* std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>, std::__ndk1::allocator<char>
   >::compare(unsigned long, unsigned long, char const*, unsigned long) const */

uint __thiscall
std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::compare
          (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *this,
          ulong param_1,ulong param_2,char *param_3,ulong param_4)

{
  ulong uVar1;
  ulong uVar2;
  size_t __n;
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> bVar3;
  uint uVar4;
  uint uVar5;
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *pbVar6;
  
  bVar3 = *this;
  uVar1 = (ulong)((byte)bVar3 >> 1);
  if (((byte)bVar3 & 1) != 0) {
    uVar1 = *(ulong *)(this + 8);
  }
  if ((param_4 == 0xffffffffffffffff) || (uVar1 < param_1)) {
                    /* WARNING: Subroutine does not return */
    FUN_00814f80();
  }
  pbVar6 = *(basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> **)
            (this + 0x10);
  uVar2 = uVar1 - param_1;
  if (param_2 <= uVar1 - param_1) {
    uVar2 = param_2;
  }
  if (((byte)bVar3 & 1) == 0) {
    pbVar6 = this + 1;
  }
  __n = param_4;
  if (uVar2 <= param_4) {
    __n = uVar2;
  }
  uVar4 = memcmp(pbVar6 + param_1,param_3,__n);
  uVar5 = (uint)(param_4 < uVar2);
  if (uVar2 < param_4) {
    uVar5 = 0xffffffff;
  }
  if (uVar4 != 0) {
    uVar5 = uVar4;
  }
  return uVar5;
}

