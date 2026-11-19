/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008e9420
 */

/* std::__ndk1::basic_stringbuf<char, std::__ndk1::char_traits<char>, std::__ndk1::allocator<char>
   >::underflow() */

ulong __thiscall
std::__ndk1::basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
underflow(basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *this)

{
  byte *pbVar1;
  byte *pbVar2;
  
  pbVar2 = *(byte **)(this + 0x30);
  pbVar1 = *(byte **)(this + 0x58);
  if (*(byte **)(this + 0x58) < pbVar2) {
    *(byte **)(this + 0x58) = pbVar2;
    pbVar1 = pbVar2;
  }
  if (((byte)this[0x60] >> 3 & 1) == 0) {
    return 0xffffffff;
  }
  pbVar2 = *(byte **)(this + 0x20);
  if (*(byte **)(this + 0x20) < pbVar1) {
    *(byte **)(this + 0x20) = pbVar1;
    pbVar2 = pbVar1;
  }
  if (*(byte **)(this + 0x18) < pbVar2) {
    return (ulong)**(byte **)(this + 0x18);
  }
  return 0xffffffff;
}

