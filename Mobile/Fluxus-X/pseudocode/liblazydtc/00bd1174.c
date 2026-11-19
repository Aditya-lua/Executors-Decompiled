/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bd1174
 */

/* std::__ndk1::basic_ostream<char, std::__ndk1::char_traits<char>
   >::TEMPNAMEPLACEHOLDERVALUE(std::__ndk1::ios_base& (*)(std::__ndk1::ios_base&)) */

basic_ostream<char,std::__ndk1::char_traits<char>> * __thiscall
std::__ndk1::basic_ostream<char,std::__ndk1::char_traits<char>>::operator<<
          (basic_ostream<char,std::__ndk1::char_traits<char>> *this,
          _func_ios_base_ptr_ios_base_ptr *param_1)

{
  (*param_1)((ios_base *)(this + *(long *)(*(long *)this + -0x18)));
  return this;
}

