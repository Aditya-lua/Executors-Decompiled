/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bd25a4
 */

/* std::__ndk1::basic_streambuf<wchar_t, std::__ndk1::char_traits<wchar_t> >::~basic_streambuf() */

void __thiscall
std::__ndk1::basic_streambuf<wchar_t,std::__ndk1::char_traits<wchar_t>>::~basic_streambuf
          (basic_streambuf<wchar_t,std::__ndk1::char_traits<wchar_t>> *this)

{
  *(undefined ***)this = &PTR__basic_streambuf_00cacde8;
  locale::~locale((locale *)(this + 8));
  return;
}

