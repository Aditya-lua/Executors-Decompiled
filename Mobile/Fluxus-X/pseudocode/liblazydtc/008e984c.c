/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008e984c
 */

/* std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>, std::__ndk1::allocator<char>
   >::push_back(char) */

void __thiscall
std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
push_back(basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *this,
         char param_1)

{
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> bVar1;
  ulong uVar2;
  ulong __n;
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *__src;
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *__dest;
  ulong uVar3;
  
  bVar1 = *this;
  if (((byte)bVar1 & 1) == 0) {
    uVar3 = (ulong)((byte)bVar1 >> 1);
    __n = 0x16;
    if (uVar3 == 0x16) goto LAB_008e98a4;
LAB_008e9888:
    if (((byte)bVar1 & 1) == 0) {
      __dest = this + 1;
      *this = (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>)
              ((char)uVar3 * '\x02' + '\x02');
      goto LAB_008e994c;
    }
    __dest = *(basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> **)
              (this + 0x10);
  }
  else {
    uVar3 = *(ulong *)(this + 8);
    __n = (*(ulong *)this & 0xfffffffffffffffe) - 1;
    if (uVar3 != __n) goto LAB_008e9888;
LAB_008e98a4:
    if (__n == 0xffffffffffffffef) {
                    /* WARNING: Subroutine does not return */
      __basic_string_common<true>::__throw_length_error();
    }
    if (((byte)bVar1 & 1) == 0) {
      __src = this + 1;
    }
    else {
      __src = *(basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> **)
               (this + 0x10);
    }
    if (__n < 0x7fffffffffffffe7) {
      uVar2 = __n << 1;
      if (uVar2 <= __n + 1) {
        uVar2 = __n + 1;
      }
      if (uVar2 < 0x17) {
        uVar2 = 0x17;
      }
      else {
        uVar2 = uVar2 + 0x10 & 0xfffffffffffffff0;
      }
    }
    else {
      uVar2 = 0xffffffffffffffef;
    }
    __dest = operator_new(uVar2);
    memcpy(__dest,__src,__n);
    if (__n != 0x16) {
      operator_delete(__src);
    }
    *(basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> **)
     (this + 0x10) = __dest;
    *(ulong *)this = uVar2 | 1;
  }
  *(ulong *)(this + 8) = uVar3 + 1;
LAB_008e994c:
  __dest[uVar3] =
       (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>)param_1;
  (__dest + uVar3)[1] =
       (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>)0x0;
  return;
}

