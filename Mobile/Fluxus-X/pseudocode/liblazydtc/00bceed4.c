/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bceed4
 */

/* std::__ndk1::basic_istream<char, std::__ndk1::char_traits<char>
   >::TEMPNAMEPLACEHOLDERVALUE(std::__ndk1::basic_ios<char, std::__ndk1::char_traits<char> >&
   (*)(std::__ndk1::basic_ios<char, std::__ndk1::char_traits<char> >&)) */

basic_istream<char,std::__ndk1::char_traits<char>> * __thiscall
std::__ndk1::basic_istream<char,std::__ndk1::char_traits<char>>::operator>>
          (basic_istream<char,std::__ndk1::char_traits<char>> *this,
          _func_basic_ios_ptr_basic_ios_ptr *param_1)

{
  (*param_1)((basic_ios *)(this + *(long *)(*(long *)this + -0x18)));
  return this;
}

