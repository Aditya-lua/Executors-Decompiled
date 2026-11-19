/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008f931c
 */

/* std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>, std::__ndk1::allocator<char>
   >::assign(char const*, unsigned long) */

basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> * __thiscall
std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::assign
          (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *this,
          char *param_1,ulong param_2)

{
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> bVar1;
  void *__dest;
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *pbVar2;
  ulong uVar3;
  ulong uVar4;
  
  bVar1 = *this;
  if (((byte)bVar1 & 1) == 0) {
    uVar4 = 0x16;
    if (0x16 < param_2) {
LAB_008f9378:
      if (-uVar4 - 0x12 < param_2 - uVar4) {
                    /* WARNING: Subroutine does not return */
        __basic_string_common<true>::__throw_length_error();
      }
      if (((byte)bVar1 & 1) == 0) {
        pbVar2 = this + 1;
      }
      else {
        pbVar2 = *(basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> **
                  )(this + 0x10);
      }
      if (uVar4 < 0x7fffffffffffffe7) {
        uVar3 = uVar4 * 2;
        if (uVar4 * 2 <= param_2) {
          uVar3 = param_2;
        }
        if (uVar3 < 0x17) {
          uVar3 = 0x17;
        }
        else {
          uVar3 = uVar3 + 0x10 & 0xfffffffffffffff0;
        }
      }
      else {
        uVar3 = 0xffffffffffffffef;
      }
      __dest = operator_new(uVar3);
      memcpy(__dest,param_1,param_2);
      if (uVar4 != 0x16) {
        operator_delete(pbVar2);
      }
      *(ulong *)(this + 8) = param_2;
      *(void **)(this + 0x10) = __dest;
      *(ulong *)this = uVar3 | 1;
      *(undefined1 *)((long)__dest + param_2) = 0;
      return this;
    }
  }
  else {
    uVar4 = (*(ulong *)this & 0xfffffffffffffffe) - 1;
    if (uVar4 < param_2) goto LAB_008f9378;
  }
  if (((byte)bVar1 & 1) == 0) {
    pbVar2 = this + 1;
  }
  else {
    pbVar2 = *(basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> **)
              (this + 0x10);
  }
  if (param_2 != 0) {
    memmove(pbVar2,param_1,param_2);
  }
  pbVar2[param_2] =
       (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>)0x0;
  if (((byte)*this & 1) == 0) {
    *this = SUB41((int)param_2 << 1,0);
  }
  else {
    *(ulong *)(this + 8) = param_2;
  }
  return this;
}

