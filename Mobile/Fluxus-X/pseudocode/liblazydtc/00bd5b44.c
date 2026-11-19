/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bd5b44
 */

/* std::__ndk1::basic_ostream<wchar_t, std::__ndk1::char_traits<wchar_t>
   >::TEMPNAMEPLACEHOLDERVALUE(std::__ndk1::basic_ostream<wchar_t, std::__ndk1::char_traits<wchar_t>
   >& (*)(std::__ndk1::basic_ostream<wchar_t, std::__ndk1::char_traits<wchar_t> >&)) */

void __thiscall
std::__ndk1::basic_ostream<wchar_t,std::__ndk1::char_traits<wchar_t>>::operator<<
          (basic_ostream<wchar_t,std::__ndk1::char_traits<wchar_t>> *this,
          _func_basic_ostream_ptr_basic_ostream_ptr *param_1)

{
                    /* WARNING: Could not recover jumptable at 0x00bd5b4c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*param_1)((basic_ostream *)this);
  return;
}

