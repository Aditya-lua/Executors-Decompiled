/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008e6218
 */

/* std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> >
   std::__ndk1::TEMPNAMEPLACEHOLDERVALUE(char const*, std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> > const&) */

void __thiscall std::__ndk1::operator+(__ndk1 *this,char *param_1,basic_string_conflict *param_2)

{
  ulong uVar1;
  byte bVar2;
  size_t __n;
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *in_x8;
  char *pcVar3;
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *__dest;
  ulong uVar4;
  
  *(undefined8 *)in_x8 = 0;
  *(undefined8 *)(in_x8 + 8) = 0;
  *(undefined8 *)(in_x8 + 0x10) = 0;
  __n = strlen((char *)this);
  bVar2 = *param_1;
  uVar1 = (ulong)(bVar2 >> 1);
  if ((bVar2 & 1) != 0) {
    uVar1 = *(ulong *)(param_1 + 8);
  }
  uVar4 = uVar1 + __n;
  if (0xffffffffffffffef < uVar4) {
                    /* WARNING: Subroutine does not return */
    __basic_string_common<true>::__throw_length_error();
  }
  if (uVar4 < 0x17) {
    __dest = in_x8 + 1;
    *in_x8 = SUB41((int)__n << 1,0);
  }
  else {
    uVar4 = uVar4 + 0x10 & 0xfffffffffffffff0;
    __dest = operator_new(uVar4);
    *(size_t *)(in_x8 + 8) = __n;
    *(basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> **)
     (in_x8 + 0x10) = __dest;
    *(ulong *)in_x8 = uVar4 | 1;
  }
  if (__n != 0) {
    memcpy(__dest,this,__n);
  }
  __dest[__n] = (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>)0x0;
  pcVar3 = *(char **)(param_1 + 0x10);
  if ((bVar2 & 1) == 0) {
    pcVar3 = param_1 + 1;
  }
                    /* try { // try from 008e62a4 to 008e62f7 has its CatchHandler @ 008e62f8 */
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::append
            (in_x8,pcVar3,uVar1);
  return;
}

