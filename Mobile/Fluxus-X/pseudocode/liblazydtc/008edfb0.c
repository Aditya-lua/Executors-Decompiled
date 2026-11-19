/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008edfb0
 */

/* std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> >
   std::__ndk1::TEMPNAMEPLACEHOLDERVALUE(std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> > const&, char const*) */

void __thiscall std::__ndk1::operator+(__ndk1 *this,basic_string_conflict *param_1,char *param_2)

{
  size_t sVar1;
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *in_x8;
  size_t __n;
  __ndk1 *__src;
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *__dest;
  ulong uVar2;
  
  *(undefined8 *)in_x8 = 0;
  *(undefined8 *)(in_x8 + 8) = 0;
  *(undefined8 *)(in_x8 + 0x10) = 0;
  if (((byte)*this & 1) == 0) {
    __n = (size_t)((byte)*this >> 1);
    sVar1 = strlen((char *)param_1);
    __src = this + 1;
  }
  else {
    __n = *(size_t *)(this + 8);
    sVar1 = strlen((char *)param_1);
    __src = *(__ndk1 **)(this + 0x10);
  }
  uVar2 = __n + sVar1;
  if (0xffffffffffffffef < uVar2) {
                    /* WARNING: Subroutine does not return */
    __basic_string_common<true>::__throw_length_error();
  }
  if (uVar2 < 0x17) {
    __dest = in_x8 + 1;
    *in_x8 = SUB41((int)__n << 1,0);
  }
  else {
    uVar2 = uVar2 + 0x10 & 0xfffffffffffffff0;
    __dest = operator_new(uVar2);
    *(size_t *)(in_x8 + 8) = __n;
    *(basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> **)
     (in_x8 + 0x10) = __dest;
    *(ulong *)in_x8 = uVar2 | 1;
  }
  if (__n != 0) {
    memcpy(__dest,__src,__n);
  }
  __dest[__n] = (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>)0x0;
                    /* try { // try from 008ee048 to 008ee09f has its CatchHandler @ 008ee0a0 */
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::append
            (in_x8,(char *)param_1,sVar1);
  return;
}

