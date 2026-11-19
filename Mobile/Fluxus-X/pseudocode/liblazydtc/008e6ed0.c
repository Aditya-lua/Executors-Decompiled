/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008e6ed0
 */

/* std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>, std::__ndk1::allocator<char>
   >::append(char const*, unsigned long) */

basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> * __thiscall
std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::append
          (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *this,
          char *param_1,ulong param_2)

{
  ulong uVar1;
  long lVar2;
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> bVar3;
  void *__dest;
  size_t __n;
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *pbVar4;
  ulong uVar5;
  ulong uVar6;
  
  bVar3 = *this;
  if (((byte)bVar3 & 1) == 0) {
    __n = (size_t)((byte)bVar3 >> 1);
    uVar6 = 0x16;
  }
  else {
    __n = *(size_t *)(this + 8);
    uVar6 = (*(ulong *)this & 0xfffffffffffffffe) - 1;
  }
  if (uVar6 - __n < param_2) {
    uVar1 = __n + param_2;
    if (-uVar6 - 0x12 < uVar1 - uVar6) {
                    /* WARNING: Subroutine does not return */
      __basic_string_common<true>::__throw_length_error();
    }
    if (((byte)bVar3 & 1) == 0) {
      pbVar4 = this + 1;
    }
    else {
      pbVar4 = *(basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> **)
                (this + 0x10);
    }
    if (uVar6 < 0x7fffffffffffffe7) {
      uVar5 = uVar6 << 1;
      if (uVar6 << 1 <= uVar1) {
        uVar5 = uVar1;
      }
      if (uVar5 < 0x17) {
        uVar5 = 0x17;
      }
      else {
        uVar5 = uVar5 + 0x10 & 0xfffffffffffffff0;
      }
    }
    else {
      uVar5 = 0xffffffffffffffef;
    }
    __dest = operator_new(uVar5);
    if (__n != 0) {
      memcpy(__dest,pbVar4,__n);
    }
    memcpy((void *)((long)__dest + __n),param_1,param_2);
    if (uVar6 != 0x16) {
      operator_delete(pbVar4);
    }
    *(ulong *)this = uVar5 | 1;
    pbVar4 = (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)
             ((long)__dest + uVar1);
    *(ulong *)(this + 8) = uVar1;
    *(void **)(this + 0x10) = __dest;
  }
  else {
    if (param_2 == 0) {
      return this;
    }
    if (((byte)bVar3 & 1) == 0) {
      pbVar4 = this + 1;
    }
    else {
      pbVar4 = *(basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> **)
                (this + 0x10);
    }
    memcpy(pbVar4 + __n,param_1,param_2);
    lVar2 = __n + param_2;
    if (((byte)*this & 1) == 0) {
      *this = SUB41((int)lVar2 << 1,0);
      pbVar4 = pbVar4 + lVar2;
    }
    else {
      *(long *)(this + 8) = lVar2;
      pbVar4 = pbVar4 + lVar2;
    }
  }
  *pbVar4 = (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>)0x0;
  return this;
}

