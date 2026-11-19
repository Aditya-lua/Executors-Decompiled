/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bceec8
 */

/* std::__ndk1::basic_istream<char, std::__ndk1::char_traits<char>
   >::TEMPNAMEPLACEHOLDERVALUE(std::__ndk1::basic_istream<char, std::__ndk1::char_traits<char> >&
   (*)(std::__ndk1::basic_istream<char, std::__ndk1::char_traits<char> >&)) */

void __thiscall
std::__ndk1::basic_istream<char,std::__ndk1::char_traits<char>>::operator>>
          (basic_istream<char,std::__ndk1::char_traits<char>> *this,
          _func_basic_istream_ptr_basic_istream_ptr *param_1)

{
                    /* WARNING: Could not recover jumptable at 0x00bceed0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*param_1)((basic_istream *)this);
  return;
}

