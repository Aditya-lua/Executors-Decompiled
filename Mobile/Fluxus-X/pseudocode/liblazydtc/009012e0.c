/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009012e0
 */

/* WARNING: Type propagation algorithm not settling */
/* std::__ndk1::basic_stringbuf<char, std::__ndk1::char_traits<char>, std::__ndk1::allocator<char>
   >::str(std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>,
   std::__ndk1::allocator<char> > const&) */

void __thiscall
std::__ndk1::basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::str
          (basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *this,
          basic_string_conflict *param_1)

{
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *this_00;
  basic_string_conflict *pbVar1;
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> bVar2;
  basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *pbVar3;
  ulong uVar4;
  ulong uVar5;
  ulong uVar6;
  
  this_00 = (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)
            (this + 0x40);
  if (this_00 !=
      (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)param_1) {
    uVar6 = *(ulong *)(param_1 + 8);
    pbVar1 = *(basic_string_conflict **)(param_1 + 0x10);
    if (((byte)*param_1 & 1) == 0) {
      pbVar1 = param_1 + 1;
      uVar6 = (ulong)((byte)*param_1 >> 1);
    }
    basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::assign
              (this_00,(char *)pbVar1,uVar6);
  }
  *(undefined8 *)(this + 0x58) = 0;
  if ((*(uint *)(this + 0x60) >> 3 & 1) != 0) {
    if (((byte)*this_00 & 1) == 0) {
      uVar6 = (ulong)((byte)*this_00 >> 1);
      pbVar3 = this + 0x41;
    }
    else {
      uVar6 = *(ulong *)(this + 0x48);
      pbVar3 = *(basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
                 **)(this + 0x50);
    }
    *(basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> **)
     (this + 0x58) = pbVar3 + uVar6;
    *(basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> **)
     (this + 0x10) = pbVar3;
    *(basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> **)
     (this + 0x18) = pbVar3;
    *(basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> **)
     (this + 0x20) = pbVar3 + uVar6;
  }
  if ((*(uint *)(this + 0x60) >> 4 & 1) == 0) {
    return;
  }
  bVar2 = *this_00;
  if (((byte)bVar2 & 1) == 0) {
    uVar6 = (ulong)((byte)bVar2 >> 1);
    *(basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> **)
     (this + 0x58) = this_00 + uVar6 + 1;
    uVar4 = 0x16;
    uVar5 = 0x16 - uVar6;
    if (uVar6 < 0x17 && uVar5 != 0) goto LAB_009013bc;
  }
  else {
    uVar6 = *(ulong *)(this + 0x48);
    *(ulong *)(this + 0x58) = *(long *)(this + 0x50) + uVar6;
    uVar4 = (*(ulong *)(this + 0x40) & 0xfffffffffffffffe) - 1;
    uVar5 = uVar4 - uVar6;
    if (uVar6 <= uVar4 && uVar5 != 0) {
LAB_009013bc:
      basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::append
                (this_00,uVar5,'\0');
      bVar2 = *this_00;
      goto joined_r0x009013cc;
    }
  }
  if (((byte)bVar2 & 1) == 0) {
    this_00[uVar4 + 1] =
         (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>)0x0;
    *this_00 = SUB41((int)uVar4 << 1,0);
    bVar2 = *this_00;
  }
  else {
    *(undefined1 *)(*(long *)(this + 0x50) + uVar4) = 0;
    *(ulong *)(this + 0x48) = uVar4;
    bVar2 = *this_00;
  }
joined_r0x009013cc:
  if (((byte)bVar2 & 1) == 0) {
    pbVar3 = this + 0x41;
    uVar5 = (ulong)((byte)bVar2 >> 1);
  }
  else {
    uVar5 = *(ulong *)(this + 0x48);
    pbVar3 = *(basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> **)
              (this + 0x50);
  }
  *(basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> **)
   (this + 0x28) = pbVar3;
  *(basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> **)
   (this + 0x30) = pbVar3;
  *(basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> **)
   (this + 0x38) = pbVar3 + uVar5;
  if (((byte)this[0x60] & 3) != 0) {
    if (uVar6 >> 0x1f != 0) {
      uVar5 = (uVar6 - 0x80000000) / 0x7fffffff;
      pbVar3 = pbVar3 + uVar5 * 0x7fffffff + 0x7fffffff;
      uVar6 = (uVar6 - 0x7fffffff) + uVar5 * -0x7fffffff;
      *(basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> **)
       (this + 0x30) = pbVar3;
    }
    if (uVar6 != 0) {
      *(basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> **)
       (this + 0x30) = pbVar3 + (int)uVar6;
    }
  }
  return;
}

