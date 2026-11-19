/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bd2a14
 */

/* std::__ndk1::basic_streambuf<wchar_t, std::__ndk1::char_traits<wchar_t> >::setg(wchar_t*,
   wchar_t*, wchar_t*) */

void __thiscall
std::__ndk1::basic_streambuf<wchar_t,std::__ndk1::char_traits<wchar_t>>::setg
          (basic_streambuf<wchar_t,std::__ndk1::char_traits<wchar_t>> *this,wchar_t *param_1,
          wchar_t *param_2,wchar_t *param_3)

{
  *(wchar_t **)(this + 0x10) = param_1;
  *(wchar_t **)(this + 0x18) = param_2;
  *(wchar_t **)(this + 0x20) = param_3;
  return;
}

