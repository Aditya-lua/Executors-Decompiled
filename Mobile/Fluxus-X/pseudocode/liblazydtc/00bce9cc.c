/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bce9cc
 */

/* std::__ndk1::basic_streambuf<char, std::__ndk1::char_traits<char> >::basic_streambuf() */

void __thiscall
std::__ndk1::basic_streambuf<char,std::__ndk1::char_traits<char>>::basic_streambuf
          (basic_streambuf<char,std::__ndk1::char_traits<char>> *this)

{
  *(undefined ***)this = &PTR__basic_streambuf_00c4e728;
  locale::locale((locale *)(this + 8));
  *(undefined8 *)(this + 0x28) = 0;
  *(undefined8 *)(this + 0x20) = 0;
  *(undefined8 *)(this + 0x38) = 0;
  *(undefined8 *)(this + 0x30) = 0;
  *(undefined8 *)(this + 0x18) = 0;
  *(undefined8 *)(this + 0x10) = 0;
  return;
}

