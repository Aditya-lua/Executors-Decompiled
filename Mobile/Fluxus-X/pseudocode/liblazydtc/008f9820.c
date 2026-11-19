/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008f9820
 */

/* std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> >
   std::__ndk1::TEMPNAMEPLACEHOLDERVALUE(std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> > const&,
   std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> >
   const&) */

void __thiscall
std::__ndk1::operator+(__ndk1 *this,basic_string_conflict *param_1,basic_string_conflict *param_2)

{
  ulong uVar1;
  size_t __n;
  __ndk1 *__src;
  basic_string_conflict bVar2;
  bool bVar3;
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *in_x8;
  basic_string_conflict *pbVar4;
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *__dest;
  ulong uVar5;
  
  *(undefined8 *)(in_x8 + 8) = 0;
  *(undefined8 *)(in_x8 + 0x10) = 0;
  *(undefined8 *)in_x8 = 0;
  bVar2 = *param_1;
  __src = *(__ndk1 **)(this + 0x10);
  uVar1 = (ulong)((byte)bVar2 >> 1);
  if (((byte)bVar2 & 1) != 0) {
    uVar1 = *(ulong *)(param_1 + 8);
  }
  bVar3 = ((byte)*this & 1) != 0;
  __n = (ulong)((byte)*this >> 1);
  if (bVar3) {
    __n = *(size_t *)(this + 8);
  }
  uVar5 = uVar1 + __n;
  if (!bVar3) {
    __src = this + 1;
  }
  if (0xffffffffffffffef < uVar5) {
                    /* WARNING: Subroutine does not return */
    __basic_string_common<true>::__throw_length_error();
  }
  if (uVar5 < 0x17) {
    __dest = in_x8 + 1;
    *in_x8 = SUB41((int)__n << 1,0);
  }
  else {
    uVar5 = uVar5 + 0x10 & 0xfffffffffffffff0;
    __dest = operator_new(uVar5);
    *(size_t *)(in_x8 + 8) = __n;
    *(basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> **)
     (in_x8 + 0x10) = __dest;
    *(ulong *)in_x8 = uVar5 | 1;
  }
  if (__n != 0) {
    memcpy(__dest,__src,__n);
  }
  __dest[__n] = (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>)0x0;
  pbVar4 = *(basic_string_conflict **)(param_1 + 0x10);
  if (((byte)bVar2 & 1) == 0) {
    pbVar4 = param_1 + 1;
  }
                    /* try { // try from 008f98b8 to 008f990b has its CatchHandler @ 008f990c */
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::append
            (in_x8,(char *)pbVar4,uVar1);
  return;
}

