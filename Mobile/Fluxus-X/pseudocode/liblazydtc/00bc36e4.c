/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bc36e4
 */

/* std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>, std::__ndk1::allocator<char>
   >::replace(unsigned long, unsigned long, char const*, unsigned long) */

basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> * __thiscall
std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::replace
          (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *this,
          ulong param_1,ulong param_2,char *param_3,ulong param_4)

{
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *__dest;
  ulong uVar1;
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> bVar2;
  ulong uVar3;
  long lVar4;
  ulong uVar5;
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *pbVar6;
  ulong __n;
  size_t __n_00;
  
  bVar2 = *this;
  uVar1 = (ulong)((byte)bVar2 >> 1);
  if (((byte)bVar2 & 1) != 0) {
    uVar1 = *(ulong *)(this + 8);
  }
  uVar3 = uVar1 - param_1;
  if (uVar1 < param_1) {
                    /* WARNING: Subroutine does not return */
    FUN_00814f80();
  }
  __n = uVar3;
  if (param_2 <= uVar3) {
    __n = param_2;
  }
  uVar5 = 0x16;
  if (((byte)bVar2 & 1) != 0) {
    uVar5 = (*(ulong *)this & 0xfffffffffffffffe) - 1;
  }
  if ((__n - uVar1) + uVar5 < param_4) {
    __grow_by_and_replace
              (this,uVar5,((uVar1 + param_4) - uVar5) - __n,uVar1,param_1,__n,param_4,param_3);
    return this;
  }
  pbVar6 = *(basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> **)
            (this + 0x10);
  if ((*(ulong *)this & 1) == 0) {
    pbVar6 = this + 1;
  }
  if (param_4 == __n) {
    __n = param_4;
  }
  else if (param_2 < uVar3) {
    uVar5 = param_4 - __n;
    __n_00 = uVar3 - __n;
    __dest = pbVar6 + param_1;
    if (param_4 < __n) {
      if (param_4 != 0) {
        memmove(__dest,param_3,param_4);
      }
      memmove(__dest + param_4,__dest + __n,__n_00);
      bVar2 = *this;
      goto joined_r0x00bc37ec;
    }
    if ((param_3 < pbVar6 + uVar1) && (__dest + 1 <= param_3)) {
      if (param_3 < __dest + __n) {
        if (param_2 != 0) {
          memmove(__dest,param_3,__n);
        }
        param_1 = __n + param_1;
        param_3 = param_3 + param_4;
        __n = 0;
        param_4 = uVar5;
      }
      else {
        param_3 = param_3 + uVar5;
      }
    }
    memmove(pbVar6 + param_4 + param_1,pbVar6 + __n + param_1,__n_00);
  }
  if (param_4 != 0) {
    memmove(pbVar6 + param_1,param_3,param_4);
  }
  bVar2 = *this;
  uVar5 = param_4 - __n;
joined_r0x00bc37ec:
  lVar4 = uVar5 + uVar1;
  if (((byte)bVar2 & 1) == 0) {
    *this = SUB41((int)lVar4 << 1,0);
  }
  else {
    *(long *)(this + 8) = lVar4;
  }
  pbVar6[lVar4] =
       (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>)0x0;
  return this;
}

