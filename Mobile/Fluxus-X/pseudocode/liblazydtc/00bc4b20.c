/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bc4b20
 */

/* std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>, std::__ndk1::allocator<char>
   >::compare(unsigned long, unsigned long, char const*) const */

uint __thiscall
std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::compare
          (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *this,
          ulong param_1,ulong param_2,char *param_3)

{
  ulong uVar1;
  ulong uVar2;
  size_t __n;
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> bVar3;
  uint uVar4;
  size_t sVar5;
  uint uVar6;
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *pbVar7;
  
  sVar5 = strlen(param_3);
  bVar3 = *this;
  uVar1 = (ulong)((byte)bVar3 >> 1);
  if (((byte)bVar3 & 1) != 0) {
    uVar1 = *(ulong *)(this + 8);
  }
  if ((sVar5 == 0xffffffffffffffff) || (uVar1 < param_1)) {
                    /* WARNING: Subroutine does not return */
    FUN_00814f80();
  }
  pbVar7 = *(basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> **)
            (this + 0x10);
  uVar2 = uVar1 - param_1;
  if (param_2 <= uVar1 - param_1) {
    uVar2 = param_2;
  }
  if (((byte)bVar3 & 1) == 0) {
    pbVar7 = this + 1;
  }
  __n = sVar5;
  if (uVar2 <= sVar5) {
    __n = uVar2;
  }
  uVar4 = memcmp(pbVar7 + param_1,param_3,__n);
  uVar6 = (uint)(sVar5 < uVar2);
  if (uVar2 < sVar5) {
    uVar6 = 0xffffffff;
  }
  if (uVar4 != 0) {
    uVar6 = uVar4;
  }
  return uVar6;
}

