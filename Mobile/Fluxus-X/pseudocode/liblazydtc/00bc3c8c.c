/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bc3c8c
 */

/* std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>, std::__ndk1::allocator<char>
   >::~basic_string() */

void __thiscall
std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
~basic_string(basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *this)

{
  if (((byte)*this & 1) == 0) {
    return;
  }
  operator_delete(*(void **)(this + 0x10),*(ulong *)this & 0xfffffffffffffffe);
  return;
}

