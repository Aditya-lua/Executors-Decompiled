/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bd5b50
 */

/* std::__ndk1::basic_ostream<wchar_t, std::__ndk1::char_traits<wchar_t>
   >::TEMPNAMEPLACEHOLDERVALUE(std::__ndk1::basic_ios<wchar_t, std::__ndk1::char_traits<wchar_t> >&
   (*)(std::__ndk1::basic_ios<wchar_t, std::__ndk1::char_traits<wchar_t> >&)) */

basic_ostream<wchar_t,std::__ndk1::char_traits<wchar_t>> * __thiscall
std::__ndk1::basic_ostream<wchar_t,std::__ndk1::char_traits<wchar_t>>::operator<<
          (basic_ostream<wchar_t,std::__ndk1::char_traits<wchar_t>> *this,
          _func_basic_ios_ptr_basic_ios_ptr *param_1)

{
  (*param_1)((basic_ios *)(this + *(long *)(*(long *)this + -0x18)));
  return this;
}

