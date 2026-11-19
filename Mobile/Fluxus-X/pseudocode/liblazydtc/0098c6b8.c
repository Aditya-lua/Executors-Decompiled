/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0098c6b8
 */

/* std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> >
   std::__ndk1::TEMPNAMEPLACEHOLDERVALUE(char, std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> > const&) */

void __thiscall std::__ndk1::operator+(__ndk1 *this,char param_1,basic_string_conflict *param_2)

{
  ulong uVar1;
  byte bVar2;
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *pbVar3;
  byte *pbVar4;
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *in_x8;
  byte *pbVar5;
  ulong uVar6;
  
  pbVar4 = (byte *)(ulong)(byte)param_1;
  *(undefined8 *)in_x8 = 0;
  *(undefined8 *)(in_x8 + 8) = 0;
  *(undefined8 *)(in_x8 + 0x10) = 0;
  bVar2 = *pbVar4;
  uVar1 = (ulong)(bVar2 >> 1);
  if ((bVar2 & 1) != 0) {
    uVar1 = *(ulong *)(pbVar4 + 8);
  }
  if (0xffffffffffffffef < uVar1 + 1) {
                    /* WARNING: Subroutine does not return */
    __basic_string_common<true>::__throw_length_error();
  }
  if (uVar1 + 1 < 0x17) {
    pbVar3 = in_x8 + 1;
    *in_x8 = (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>)0x2;
  }
  else {
    uVar6 = uVar1 + 0x11 & 0xfffffffffffffff0;
                    /* try { // try from 0098c720 to 0098c773 has its CatchHandler @ 0098c774 */
    pbVar3 = operator_new(uVar6);
    *(ulong *)in_x8 = uVar6 | 1;
    *(undefined8 *)(in_x8 + 8) = 1;
    *(basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> **)
     (in_x8 + 0x10) = pbVar3;
  }
  *pbVar3 = SUB81(this,0);
  pbVar3[1] = (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>)0x0;
  pbVar5 = *(byte **)(pbVar4 + 0x10);
  if ((bVar2 & 1) == 0) {
    pbVar5 = pbVar4 + 1;
  }
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::append
            (in_x8,(char *)pbVar5,uVar1);
  return;
}

