/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bd2a24
 */

/* std::__ndk1::basic_streambuf<wchar_t, std::__ndk1::char_traits<wchar_t> >::pbump(int) */

void __thiscall
std::__ndk1::basic_streambuf<wchar_t,std::__ndk1::char_traits<wchar_t>>::pbump
          (basic_streambuf<wchar_t,std::__ndk1::char_traits<wchar_t>> *this,int param_1)

{
  *(long *)(this + 0x30) = *(long *)(this + 0x30) + (long)param_1 * 4;
  return;
}

