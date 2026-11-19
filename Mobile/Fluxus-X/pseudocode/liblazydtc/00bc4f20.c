/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bc4f20
 */

/* std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>, std::__ndk1::allocator<char>
   >::insert(std::__ndk1::__wrap_iter<char const*>, char) */

basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> * __thiscall
std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::insert
          (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *this,
          basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *param_2,
          basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> param_3)

{
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *pbVar1;
  long lVar2;
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *__src;
  ulong uVar3;
  ulong uVar4;
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> bVar5;
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *pbVar6;
  bool bVar7;
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *__dest;
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *pbVar8;
  ulong uVar9;
  size_t __n;
  
  uVar9 = *(ulong *)this;
  uVar4 = *(ulong *)(this + 8);
  pbVar8 = *(basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> **)
            (this + 0x10);
  pbVar1 = this + 1;
  bVar7 = ((byte)*this & 1) == 0;
  if (bVar7) {
    uVar4 = (ulong)((byte)*this >> 1);
    pbVar6 = this + 1;
  }
  else {
    pbVar6 = pbVar8;
  }
  uVar3 = 0x16;
  if (!bVar7) {
    uVar3 = (uVar9 & 0xfffffffffffffffe) - 1;
  }
  __n = (long)param_2 - (long)pbVar6;
  if (uVar3 == uVar4) {
    if (uVar4 == 0xfffffffffffffff7) {
                    /* WARNING: Subroutine does not return */
      FUN_007fe124();
    }
    __src = pbVar1;
    if ((uVar9 & 1) != 0) {
      __src = pbVar8;
    }
    if (uVar4 < 0x7ffffffffffffff3) {
      uVar9 = uVar4 << 1 | 7;
      uVar3 = 0x1a;
      if (uVar9 != 0x17) {
        uVar3 = uVar9 + 1;
      }
      uVar9 = 0x17;
      if (0xb < uVar4) {
        uVar9 = uVar3;
      }
    }
    else {
      uVar9 = 0xfffffffffffffff7;
    }
    __dest = operator_new(uVar9);
    if (param_2 != pbVar6) {
      memmove(__dest,__src,__n);
    }
    if (uVar4 - __n != 0) {
      memmove(__dest + __n + 1,__src + __n,uVar4 - __n);
    }
    uVar3 = uVar4 + 1;
    if (uVar3 != 0x17) {
      operator_delete(__src,uVar3);
    }
    *(ulong *)(this + 8) = uVar3;
    *(basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> **)
     (this + 0x10) = __dest;
    *(ulong *)this = uVar9 | 1;
  }
  else {
    __dest = pbVar1;
    if ((uVar9 & 1) != 0) {
      __dest = pbVar8;
    }
    if (uVar4 - __n != 0) {
      memmove(__dest + __n + 1,__dest + __n,uVar4 - __n);
    }
  }
  lVar2 = uVar4 + 1;
  __dest[__n] = param_3;
  __dest[lVar2] =
       (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>)0x0;
  bVar5 = *this;
  if (((byte)bVar5 & 1) == 0) {
    *this = SUB41((int)lVar2 << 1,0);
  }
  else {
    *(long *)(this + 8) = lVar2;
  }
  if (((byte)bVar5 & 1) != 0) {
    pbVar1 = *(basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> **)
              (this + 0x10);
  }
  return pbVar1 + __n;
}

