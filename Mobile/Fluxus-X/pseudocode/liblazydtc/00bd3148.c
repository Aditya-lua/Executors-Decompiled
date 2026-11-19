/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bd3148
 */

/* std::__ndk1::basic_istream<wchar_t, std::__ndk1::char_traits<wchar_t>
   >::TEMPNAMEPLACEHOLDERVALUE(std::__ndk1::basic_istream<wchar_t, std::__ndk1::char_traits<wchar_t>
   >& (*)(std::__ndk1::basic_istream<wchar_t, std::__ndk1::char_traits<wchar_t> >&)) */

void __thiscall
std::__ndk1::basic_istream<wchar_t,std::__ndk1::char_traits<wchar_t>>::operator>>
          (basic_istream<wchar_t,std::__ndk1::char_traits<wchar_t>> *this,
          _func_basic_istream_ptr_basic_istream_ptr *param_1)

{
                    /* WARNING: Could not recover jumptable at 0x00bd3150. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*param_1)((basic_istream *)this);
  return;
}

