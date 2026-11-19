/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008e9978
 */

/* std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>, std::__ndk1::allocator<char>
   >::append(unsigned long, char) */

basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> * __thiscall
std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::append
          (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *this,
          ulong param_1,char param_2)

{
  long lVar1;
  ulong uVar2;
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> bVar3;
  void *__dest;
  ulong uVar4;
  size_t __n;
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *pbVar5;
  ulong uVar6;
  
  if (param_1 != 0) {
    bVar3 = *this;
    if (((byte)bVar3 & 1) == 0) {
      __n = (size_t)((byte)bVar3 >> 1);
      uVar6 = 0x16;
      uVar4 = (ulong)(byte)bVar3;
    }
    else {
      uVar4 = *(ulong *)this;
      __n = *(size_t *)(this + 8);
      uVar6 = (uVar4 & 0xfffffffffffffffe) - 1;
    }
    if (uVar6 - __n < param_1) {
      uVar4 = __n + param_1;
      if (-uVar6 - 0x11 < uVar4 - uVar6) {
                    /* WARNING: Subroutine does not return */
        __basic_string_common<true>::__throw_length_error();
      }
      if (((byte)bVar3 & 1) == 0) {
        pbVar5 = this + 1;
      }
      else {
        pbVar5 = *(basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> **
                  )(this + 0x10);
      }
      if (uVar6 < 0x7fffffffffffffe7) {
        uVar2 = uVar6 << 1;
        if (uVar6 << 1 <= uVar4) {
          uVar2 = uVar4;
        }
        if (uVar2 < 0x17) {
          uVar4 = 0x17;
        }
        else {
          uVar4 = uVar2 + 0x10 & 0xfffffffffffffff0;
        }
      }
      else {
        uVar4 = 0xffffffffffffffef;
      }
      __dest = operator_new(uVar4);
      if (__n != 0) {
        memcpy(__dest,pbVar5,__n);
      }
      if (uVar6 != 0x16) {
        operator_delete(pbVar5);
      }
      uVar4 = uVar4 | 1;
      *(void **)(this + 0x10) = __dest;
      *(ulong *)this = uVar4;
    }
    if ((uVar4 & 1) == 0) {
      pbVar5 = this + 1;
    }
    else {
      pbVar5 = *(basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> **)
                (this + 0x10);
    }
    memset(pbVar5 + __n,(uint)(byte)param_2,param_1);
    lVar1 = __n + param_1;
    if (((byte)*this & 1) == 0) {
      *this = SUB41((int)lVar1 << 1,0);
    }
    else {
      *(long *)(this + 8) = lVar1;
    }
    pbVar5[lVar1] =
         (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>)0x0;
  }
  return this;
}

