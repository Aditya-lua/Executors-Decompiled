/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bc3d3c
 */

/* std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>, std::__ndk1::allocator<char>
   >::insert(unsigned long, unsigned long, char) */

basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> * __thiscall
std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::insert
          (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *this,
          ulong param_1,ulong param_2,char param_3)

{
  ulong uVar1;
  long lVar2;
  ulong uVar3;
  ulong uVar4;
  ulong uVar5;
  ulong uVar6;
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> bVar7;
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *__dest;
  ulong uVar8;
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *__src;
  
  bVar7 = *this;
  uVar3 = (ulong)((byte)bVar7 >> 1);
  if (((byte)bVar7 & 1) != 0) {
    uVar3 = *(ulong *)(this + 8);
  }
  if (uVar3 < param_1) {
                    /* WARNING: Subroutine does not return */
    FUN_00814f80();
  }
  if (param_2 != 0) {
    uVar8 = *(ulong *)this;
    uVar4 = 0x16;
    if (((byte)bVar7 & 1) != 0) {
      uVar4 = (uVar8 & 0xfffffffffffffffe) - 1;
    }
    if (uVar4 - uVar3 < param_2) {
      uVar1 = uVar3 + param_2;
      if (-uVar4 - 9 < uVar1 - uVar4) {
                    /* WARNING: Subroutine does not return */
        FUN_007fe124();
      }
      __src = *(basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> **)
               (this + 0x10);
      if ((uVar8 & 1) == 0) {
        __src = this + 1;
      }
      if (uVar4 < 0x7ffffffffffffff3) {
        uVar5 = uVar1;
        if (uVar1 <= uVar4 * 2) {
          uVar5 = uVar4 * 2;
        }
        uVar6 = 0x1a;
        if ((uVar5 | 7) != 0x17) {
          uVar6 = (uVar5 | 7) + 1;
        }
        uVar8 = 0x17;
        if (0x16 < uVar5) {
          uVar8 = uVar6;
        }
      }
      else {
        uVar8 = 0xfffffffffffffff7;
      }
      __dest = operator_new(uVar8);
      if (param_1 != 0) {
        memmove(__dest,__src,param_1);
      }
      if (uVar3 - param_1 != 0) {
        memmove(__dest + param_2 + param_1,__src + param_1,uVar3 - param_1);
      }
      if (uVar4 + 1 != 0x17) {
        operator_delete(__src,uVar4 + 1);
      }
      *(ulong *)(this + 8) = uVar1;
      *(basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> **)
       (this + 0x10) = __dest;
      *(ulong *)this = uVar8 | 1;
    }
    else {
      __dest = *(basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> **)
                (this + 0x10);
      if ((uVar8 & 1) == 0) {
        __dest = this + 1;
      }
      if (uVar3 - param_1 != 0) {
        memmove(__dest + param_1 + param_2,__dest + param_1,uVar3 - param_1);
      }
    }
    memset(__dest + param_1,(uint)(byte)param_3,param_2);
    lVar2 = uVar3 + param_2;
    if (((byte)*this & 1) == 0) {
      *this = SUB41((int)lVar2 << 1,0);
    }
    else {
      *(long *)(this + 8) = lVar2;
    }
    __dest[lVar2] =
         (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>)0x0;
  }
  return this;
}

