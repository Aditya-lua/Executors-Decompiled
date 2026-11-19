/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bc4078
 */

/* std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>, std::__ndk1::allocator<char>
   >::replace(unsigned long, unsigned long, unsigned long, char) */

basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> * __thiscall
std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::replace
          (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *this,
          ulong param_1,ulong param_2,ulong param_3,char param_4)

{
  long lVar1;
  ulong uVar2;
  ulong uVar3;
  ulong uVar4;
  ulong uVar5;
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> bVar6;
  size_t __n;
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *__dest;
  ulong uVar7;
  ulong uVar8;
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *__src;
  
  bVar6 = *this;
  uVar2 = (ulong)((byte)bVar6 >> 1);
  if (((byte)bVar6 & 1) != 0) {
    uVar2 = *(ulong *)(this + 8);
  }
  uVar7 = uVar2 - param_1;
  if (uVar2 < param_1) {
                    /* WARNING: Subroutine does not return */
    FUN_00814f80();
  }
  uVar8 = *(ulong *)this;
  uVar3 = uVar7;
  if (param_2 <= uVar7) {
    uVar3 = param_2;
  }
  uVar4 = 0x16;
  if (((byte)bVar6 & 1) != 0) {
    uVar4 = (uVar8 & 0xfffffffffffffffe) - 1;
  }
  if ((uVar3 - uVar2) + uVar4 < param_3) {
    uVar7 = ((uVar2 + param_3) - uVar4) - uVar3;
    if (-uVar4 - 9 < uVar7) {
                    /* WARNING: Subroutine does not return */
      FUN_007fe124();
    }
    __src = *(basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> **)
             (this + 0x10);
    if ((uVar8 & 1) == 0) {
      __src = this + 1;
    }
    if (uVar4 < 0x7ffffffffffffff3) {
      uVar7 = uVar7 + uVar4;
      if (uVar7 <= uVar4 * 2) {
        uVar7 = uVar4 * 2;
      }
      uVar5 = 0x1a;
      if ((uVar7 | 7) != 0x17) {
        uVar5 = (uVar7 | 7) + 1;
      }
      uVar8 = 0x17;
      if (0x16 < uVar7) {
        uVar8 = uVar5;
      }
    }
    else {
      uVar8 = 0xfffffffffffffff7;
    }
    __dest = operator_new(uVar8);
    if (param_1 != 0) {
      memmove(__dest,__src,param_1);
    }
    __n = uVar2 - (uVar3 + param_1);
    if (__n != 0) {
      memmove(__dest + param_3 + param_1,__src + uVar3 + param_1,__n);
    }
    if (uVar4 + 1 != 0x17) {
      operator_delete(__src,uVar4 + 1);
    }
    *(ulong *)this = uVar8 | 1;
    *(ulong *)(this + 8) = (uVar2 + param_3) - uVar3;
    *(basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> **)
     (this + 0x10) = __dest;
  }
  else {
    __dest = *(basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> **)
              (this + 0x10);
    if ((uVar8 & 1) == 0) {
      __dest = this + 1;
    }
    if ((param_2 < uVar7) && (param_3 != uVar3)) {
      memmove(__dest + param_3 + param_1,__dest + uVar3 + param_1,uVar7 - uVar3);
    }
    if (param_3 == 0) goto LAB_00bc4220;
  }
  memset(__dest + param_1,(uint)(byte)param_4,param_3);
LAB_00bc4220:
  lVar1 = (param_3 - uVar3) + uVar2;
  if (((byte)*this & 1) == 0) {
    *this = SUB41((int)lVar1 << 1,0);
  }
  else {
    *(long *)(this + 8) = lVar1;
  }
  __dest[lVar1] =
       (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>)0x0;
  return this;
}

