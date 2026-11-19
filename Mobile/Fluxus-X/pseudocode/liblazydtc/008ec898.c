/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008ec898
 */

/* std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>, std::__ndk1::allocator<char>
   >::reserve(unsigned long) */

void __thiscall
std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::reserve
          (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *this,
          ulong param_1)

{
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> bVar1;
  bool bVar2;
  bool bVar3;
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *__dest;
  ulong uVar4;
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *__src;
  ulong uVar5;
  ulong uVar6;
  
  if (0xffffffffffffffef < param_1) {
                    /* WARNING: Subroutine does not return */
    __basic_string_common<true>::__throw_length_error();
  }
  bVar1 = *this;
  if (((byte)bVar1 & 1) == 0) {
    uVar5 = (ulong)((byte)bVar1 >> 1);
    uVar4 = 0x16;
  }
  else {
    uVar5 = *(ulong *)(this + 8);
    uVar4 = (*(ulong *)this & 0xfffffffffffffffe) - 1;
  }
  uVar6 = uVar5;
  if (uVar5 <= param_1) {
    uVar6 = param_1;
  }
  if (uVar6 < 0x17) {
    uVar6 = 0x16;
    if (uVar4 == 0x16) {
      return;
    }
  }
  else {
    uVar6 = (uVar6 + 0x10 & 0xfffffffffffffff0) - 1;
    if (uVar6 == uVar4) {
      return;
    }
  }
  if (uVar6 == 0x16) {
    __src = *(basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> **)
             (this + 0x10);
    __dest = this + 1;
    bVar3 = false;
    if (((byte)bVar1 & 1) == 0) {
      bVar2 = true;
LAB_008ec964:
      uVar4 = (ulong)((byte)bVar1 >> 1);
      goto joined_r0x008ec988;
    }
  }
  else {
    if (uVar4 < uVar6) {
      __dest = operator_new(uVar6 + 1);
    }
    else {
                    /* try { // try from 008ec94c to 008ec94f has its CatchHandler @ 008ec9e4 */
      __dest = operator_new(uVar6 + 1);
    }
    if (((byte)bVar1 & 1) == 0) {
      bVar2 = false;
      __src = this + 1;
      bVar3 = true;
      goto LAB_008ec964;
    }
    __src = *(basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> **)
             (this + 0x10);
    bVar3 = true;
  }
  uVar4 = *(ulong *)(this + 8);
  bVar2 = true;
joined_r0x008ec988:
  if (uVar4 + 1 != 0) {
    memcpy(__dest,__src,uVar4 + 1);
  }
  if (bVar2) {
    operator_delete(__src);
  }
  if (bVar3) {
    *(ulong *)this = uVar6 + 1 | 1;
    *(ulong *)(this + 8) = uVar5;
    *(basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> **)
     (this + 0x10) = __dest;
  }
  else {
    *this = SUB41((int)uVar5 << 1,0);
  }
  return;
}

