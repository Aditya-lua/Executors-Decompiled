/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bd5b88
 */

/* std::__ndk1::basic_ostream<wchar_t, std::__ndk1::char_traits<wchar_t>
   >::TEMPNAMEPLACEHOLDERVALUE(std::__ndk1::ios_base& (*)(std::__ndk1::ios_base&)) */

basic_ostream<wchar_t,std::__ndk1::char_traits<wchar_t>> * __thiscall
std::__ndk1::basic_ostream<wchar_t,std::__ndk1::char_traits<wchar_t>>::operator<<
          (basic_ostream<wchar_t,std::__ndk1::char_traits<wchar_t>> *this,
          _func_ios_base_ptr_ios_base_ptr *param_1)

{
  (*param_1)((ios_base *)(this + *(long *)(*(long *)this + -0x18)));
  return this;
}

