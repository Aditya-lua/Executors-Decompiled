/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008e97d4
 */

/* std::__ndk1::basic_streambuf<char, std::__ndk1::char_traits<char> >::~basic_streambuf() */

void __thiscall
std::__ndk1::basic_streambuf<char,std::__ndk1::char_traits<char>>::~basic_streambuf
          (basic_streambuf<char,std::__ndk1::char_traits<char>> *this)

{
  *(undefined ***)this = &PTR__basic_streambuf_00c4e728;
  locale::~locale((locale *)(this + 8));
  return;
}

