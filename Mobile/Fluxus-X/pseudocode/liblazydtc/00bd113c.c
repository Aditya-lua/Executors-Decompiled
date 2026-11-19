/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bd113c
 */

/* std::__ndk1::basic_ostream<char, std::__ndk1::char_traits<char>
   >::TEMPNAMEPLACEHOLDERVALUE(std::__ndk1::basic_ios<char, std::__ndk1::char_traits<char> >&
   (*)(std::__ndk1::basic_ios<char, std::__ndk1::char_traits<char> >&)) */

basic_ostream<char,std::__ndk1::char_traits<char>> * __thiscall
std::__ndk1::basic_ostream<char,std::__ndk1::char_traits<char>>::operator<<
          (basic_ostream<char,std::__ndk1::char_traits<char>> *this,
          _func_basic_ios_ptr_basic_ios_ptr *param_1)

{
  (*param_1)((basic_ios *)(this + *(long *)(*(long *)this + -0x18)));
  return this;
}

