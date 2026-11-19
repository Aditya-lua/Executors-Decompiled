/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009a3068
 */

/* std::__ndk1::enable_if<__is_forward_iterator<unsigned
   char*>::value&&__libcpp_string_gets_noexcept_iterator<unsigned char*>::value,
   std::__ndk1::__wrap_iter<char*> >::type std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> >::insert<unsigned
   char*>(std::__ndk1::__wrap_iter<char const*>, unsigned char*, unsigned char*) */

basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> * __thiscall
std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
insert<unsigned_char*>
          (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *this,
          long param_2,
          basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *param_3,
          basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *param_4)

{
  ulong uVar1;
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> bVar2;
  ulong uVar3;
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *pbVar4;
  size_t __n;
  ulong uVar5;
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *pbVar6;
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *pbVar7;
  size_t __n_00;
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *pbVar8;
  ulong uVar9;
  ulong uVar10;
  undefined8 uVar11;
  undefined8 uVar12;
  undefined8 uVar13;
  
  bVar2 = *this;
  uVar5 = (ulong)(byte)bVar2;
  if (((byte)bVar2 & 1) == 0) {
    pbVar8 = this + 1;
  }
  else {
    pbVar8 = *(basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> **)
              (this + 0x10);
  }
  uVar3 = (long)param_4 - (long)param_3;
  __n_00 = param_2 - (long)pbVar8;
  if (uVar3 == 0) goto LAB_009a3288;
  if (((byte)bVar2 & 1) == 0) {
    uVar10 = (ulong)((byte)bVar2 >> 1);
    uVar9 = 0x16;
  }
  else {
    uVar5 = *(ulong *)this;
    uVar10 = *(ulong *)(this + 8);
    uVar9 = (uVar5 & 0xfffffffffffffffe) - 1;
  }
  if (uVar9 - uVar10 < uVar3) {
    uVar5 = uVar10 + uVar3;
    if (-uVar9 - 0x11 < uVar5 - uVar9) {
                    /* WARNING: Subroutine does not return */
      __basic_string_common<true>::__throw_length_error();
    }
    if (((byte)bVar2 & 1) == 0) {
      pbVar6 = this + 1;
    }
    else {
      pbVar6 = *(basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> **)
                (this + 0x10);
    }
    if (uVar9 < 0x7fffffffffffffe7) {
      uVar1 = uVar9 << 1;
      if (uVar9 << 1 <= uVar5) {
        uVar1 = uVar5;
      }
      if (uVar1 < 0x17) {
        uVar5 = 0x17;
      }
      else {
        uVar5 = uVar1 + 0x10 & 0xfffffffffffffff0;
      }
    }
    else {
      uVar5 = 0xffffffffffffffef;
    }
    pbVar4 = operator_new(uVar5);
    if (__n_00 != 0) {
      memcpy(pbVar4,pbVar6,__n_00);
    }
    if (uVar10 - __n_00 != 0) {
      memcpy(pbVar4 + uVar3 + __n_00,pbVar6 + __n_00,uVar10 - __n_00);
    }
    if (uVar9 != 0x16) {
      operator_delete(pbVar6);
    }
    *(basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> **)
     (this + 0x10) = pbVar4;
    *(ulong *)this = uVar5 | 1;
LAB_009a31fc:
    *(ulong *)(this + 8) = uVar10 + uVar3;
  }
  else {
    if (((byte)bVar2 & 1) == 0) {
      pbVar4 = this + 1;
      __n = uVar10 - __n_00;
      if (__n != 0) goto LAB_009a3138;
LAB_009a3118:
      if ((uVar5 & 1) != 0) goto LAB_009a31fc;
    }
    else {
      pbVar4 = *(basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> **)
                (this + 0x10);
      __n = uVar10 - __n_00;
      if (__n == 0) goto LAB_009a3118;
LAB_009a3138:
      memmove(pbVar4 + __n_00 + uVar3,pbVar4 + __n_00,__n);
      if (((byte)*this & 1) != 0) goto LAB_009a31fc;
    }
    *this = (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>)
            (((char)uVar10 + (char)uVar3) * '\x02');
  }
  pbVar4[uVar10 + uVar3] =
       (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>)0x0;
  if (param_3 != param_4) {
    pbVar6 = pbVar4 + __n_00;
    if ((0x1f < uVar3) &&
       ((param_4 <= pbVar6 ||
        (pbVar4 + (long)(param_4 + ((param_2 - (long)param_3) - (long)pbVar8)) <= param_3)))) {
      uVar10 = uVar3 & 0xffffffffffffffe0;
      pbVar7 = param_3 + 0x10;
      pbVar4 = pbVar4 + ((param_2 + 0x10) - (long)pbVar8);
      uVar5 = uVar10;
      do {
        pbVar8 = pbVar7 + -8;
        uVar11 = *(undefined8 *)(pbVar7 + -0x10);
        uVar13 = *(undefined8 *)(pbVar7 + 8);
        uVar12 = *(undefined8 *)pbVar7;
        pbVar7 = pbVar7 + 0x20;
        uVar5 = uVar5 - 0x20;
        *(undefined8 *)(pbVar4 + -8) = *(undefined8 *)pbVar8;
        *(undefined8 *)(pbVar4 + -0x10) = uVar11;
        *(undefined8 *)(pbVar4 + 8) = uVar13;
        *(undefined8 *)pbVar4 = uVar12;
        pbVar4 = pbVar4 + 0x20;
      } while (uVar5 != 0);
      pbVar6 = pbVar6 + uVar10;
      param_3 = param_3 + uVar10;
      if (uVar3 == uVar10) goto LAB_009a3288;
    }
    do {
      pbVar8 = param_3 + 1;
      *pbVar6 = *param_3;
      pbVar6 = pbVar6 + 1;
      param_3 = pbVar8;
    } while (param_4 != pbVar8);
  }
LAB_009a3288:
  if (((byte)*this & 1) == 0) {
    this = this + 1;
  }
  else {
    this = *(basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> **)
            (this + 0x10);
  }
  return this + __n_00;
}

