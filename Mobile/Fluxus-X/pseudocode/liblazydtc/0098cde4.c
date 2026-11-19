/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0098cde4
 */

/* std::__ndk1::__vector_base<std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>,
   std::__ndk1::allocator<char> >, std::__ndk1::allocator<std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> > > >::~__vector_base() */

void __thiscall
std::__ndk1::
__vector_base<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::allocator<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>
::~__vector_base(__vector_base<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::allocator<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>
                 *this)

{
  byte *pbVar1;
  byte *pbVar2;
  byte *pbVar3;
  
  pbVar2 = *(byte **)this;
  if (pbVar2 == (byte *)0x0) {
    return;
  }
  if (*(byte **)(this + 8) == pbVar2) {
    pbVar1 = pbVar2;
  }
  else {
    pbVar1 = *(byte **)(this + 8);
    do {
      pbVar3 = pbVar1 + -0x18;
      if ((*pbVar3 & 1) != 0) {
        operator_delete(*(void **)(pbVar1 + -8));
      }
      pbVar1 = pbVar3;
    } while (pbVar2 != pbVar3);
    pbVar1 = *(byte **)this;
  }
  *(byte **)(this + 8) = pbVar2;
  operator_delete(pbVar1);
  return;
}

