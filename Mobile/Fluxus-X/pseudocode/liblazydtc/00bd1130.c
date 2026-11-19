/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bd1130
 */

/* std::__ndk1::basic_ostream<char, std::__ndk1::char_traits<char>
   >::TEMPNAMEPLACEHOLDERVALUE(std::__ndk1::basic_ostream<char, std::__ndk1::char_traits<char> >&
   (*)(std::__ndk1::basic_ostream<char, std::__ndk1::char_traits<char> >&)) */

void __thiscall
std::__ndk1::basic_ostream<char,std::__ndk1::char_traits<char>>::operator<<
          (basic_ostream<char,std::__ndk1::char_traits<char>> *this,
          _func_basic_ostream_ptr_basic_ostream_ptr *param_1)

{
                    /* WARNING: Could not recover jumptable at 0x00bd1138. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*param_1)((basic_ostream *)this);
  return;
}

