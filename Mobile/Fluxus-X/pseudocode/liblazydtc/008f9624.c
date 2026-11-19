/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008f9624
 */

/* std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>, std::__ndk1::allocator<char>
   >::insert(unsigned long, char const*, unsigned long) */

basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> * __thiscall
std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::insert
          (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *this,
          ulong param_1,char *param_2,ulong param_3)

{
  ulong uVar1;
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *__src;
  long lVar2;
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> bVar3;
  void *__dest;
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *pbVar4;
  char *__src_00;
  ulong uVar5;
  ulong uVar6;
  ulong uVar7;
  
  bVar3 = *this;
  if (((byte)bVar3 & 1) == 0) {
    uVar6 = (ulong)((byte)bVar3 >> 1);
  }
  else {
    uVar6 = *(ulong *)(this + 8);
  }
  if (uVar6 < param_1) {
    __basic_string_common<true>::__throw_out_of_range();
LAB_008f9818:
                    /* WARNING: Subroutine does not return */
    __basic_string_common<true>::__throw_length_error();
  }
  if (((byte)bVar3 & 1) == 0) {
    uVar7 = 0x16;
  }
  else {
    uVar7 = (*(ulong *)this & 0xfffffffffffffffe) - 1;
  }
  if (uVar7 - uVar6 < param_3) {
    uVar1 = uVar6 + param_3;
    if (-uVar7 - 0x12 < uVar1 - uVar7) goto LAB_008f9818;
    if (((byte)bVar3 & 1) == 0) {
      pbVar4 = this + 1;
    }
    else {
      pbVar4 = *(basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> **)
                (this + 0x10);
    }
    if (uVar7 < 0x7fffffffffffffe7) {
      uVar5 = uVar7 << 1;
      if (uVar7 << 1 <= uVar1) {
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
    if (param_1 != 0) {
      memcpy(__dest,pbVar4,param_1);
    }
    memcpy((void *)((long)__dest + param_1),param_2,param_3);
    if (uVar6 - param_1 != 0) {
      memcpy((void *)((long)((long)__dest + param_1) + param_3),pbVar4 + param_1,uVar6 - param_1);
    }
    if (uVar7 != 0x16) {
      operator_delete(pbVar4);
    }
    *(ulong *)this = uVar5 | 1;
    pbVar4 = (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)
             ((long)__dest + uVar1);
    *(ulong *)(this + 8) = uVar1;
    *(void **)(this + 0x10) = __dest;
  }
  else {
    if (param_3 == 0) {
      return this;
    }
    if (((byte)bVar3 & 1) == 0) {
      pbVar4 = this + 1;
    }
    else {
      pbVar4 = *(basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> **)
                (this + 0x10);
    }
    __src = pbVar4 + param_1;
    __src_00 = param_2;
    if (uVar6 - param_1 != 0) {
      __src_00 = param_2 + param_3;
      if (pbVar4 + uVar6 <= param_2 || param_2 < __src) {
        __src_00 = param_2;
      }
      memmove(__src + param_3,__src,uVar6 - param_1);
    }
    memmove(__src,__src_00,param_3);
    lVar2 = uVar6 + param_3;
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

