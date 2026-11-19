/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bc4a10
 */

/* std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>, std::__ndk1::allocator<char>
   >::compare(char const*) const */

uint __thiscall
std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::compare
          (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *this,
          char *param_1)

{
  size_t __n;
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *__s1;
  uint uVar1;
  size_t sVar2;
  uint uVar3;
  ulong uVar4;
  
  sVar2 = strlen(param_1);
  if (sVar2 == 0xffffffffffffffff) {
                    /* WARNING: Subroutine does not return */
                    /* try { // try from 00bc4a90 to 00bc4a93 has its CatchHandler @ 00bc4a94 */
    FUN_00814f80();
  }
  uVar4 = (ulong)((byte)*this >> 1);
  __s1 = *(basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> **)
          (this + 0x10);
  if (((byte)*this & 1) == 0) {
    __s1 = this + 1;
  }
  else {
    uVar4 = *(ulong *)(this + 8);
  }
  __n = sVar2;
  if (uVar4 <= sVar2) {
    __n = uVar4;
  }
  uVar1 = memcmp(__s1,param_1,__n);
  uVar3 = (uint)(sVar2 < uVar4);
  if (uVar4 < sVar2) {
    uVar3 = 0xffffffff;
  }
  if (uVar1 != 0) {
    uVar3 = uVar1;
  }
  return uVar3;
}

