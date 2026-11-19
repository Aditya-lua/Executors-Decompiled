/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bd25bc
 */

/* std::__ndk1::basic_streambuf<wchar_t, std::__ndk1::char_traits<wchar_t> >::~basic_streambuf() */

void __thiscall
std::__ndk1::basic_streambuf<wchar_t,std::__ndk1::char_traits<wchar_t>>::~basic_streambuf
          (basic_streambuf<wchar_t,std::__ndk1::char_traits<wchar_t>> *this)

{
  ~basic_streambuf(this);
  operator_delete(this,0x40);
  return;
}

