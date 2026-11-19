/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bc490c
 */

/* std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>, std::__ndk1::allocator<char>
   >::append(std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>,
   std::__ndk1::allocator<char> > const&, unsigned long, unsigned long) */

basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> * __thiscall
std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::append
          (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *this,
          basic_string_conflict *param_1,ulong param_2,ulong param_3)

{
  long lVar1;
  ulong __n;
  ulong uVar2;
  ulong uVar3;
  ulong uVar4;
  basic_string_conflict bVar5;
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *pbVar6;
  basic_string_conflict *pbVar7;
  
  bVar5 = *param_1;
  uVar2 = (ulong)((byte)bVar5 >> 1);
  if (((byte)bVar5 & 1) != 0) {
    uVar2 = *(ulong *)(param_1 + 8);
  }
  if (uVar2 < param_2) {
                    /* WARNING: Subroutine does not return */
    FUN_00814f80();
  }
  uVar4 = *(ulong *)this;
  pbVar7 = *(basic_string_conflict **)(param_1 + 0x10);
  if (((byte)bVar5 & 1) == 0) {
    pbVar7 = param_1 + 1;
  }
  __n = uVar2 - param_2;
  if (param_3 <= uVar2 - param_2) {
    __n = param_3;
  }
  uVar2 = 0x16;
  if (((byte)*this & 1) != 0) {
    uVar2 = (uVar4 & 0xfffffffffffffffe) - 1;
  }
  uVar3 = uVar4 >> 1 & 0x7f;
  if ((uVar4 & 1) != 0) {
    uVar3 = *(ulong *)(this + 8);
  }
  if (uVar2 - uVar3 < __n) {
    __grow_by_and_replace
              (this,uVar2,(__n - uVar2) + uVar3,uVar3,uVar3,0,__n,(char *)(pbVar7 + param_2));
  }
  else if (__n != 0) {
    pbVar6 = *(basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> **)
              (this + 0x10);
    if ((uVar4 & 1) == 0) {
      pbVar6 = this + 1;
    }
    memmove(pbVar6 + uVar3,pbVar7 + param_2,__n);
    lVar1 = uVar3 + __n;
    if (((byte)*this & 1) == 0) {
      *this = SUB41((int)lVar1 << 1,0);
    }
    else {
      *(long *)(this + 8) = lVar1;
    }
    pbVar6[lVar1] =
         (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>)0x0;
  }
  return this;
}

