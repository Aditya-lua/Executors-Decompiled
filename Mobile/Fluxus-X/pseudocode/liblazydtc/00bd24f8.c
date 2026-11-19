/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bd24f8
 */

/* std::__ndk1::basic_ios<wchar_t, std::__ndk1::char_traits<wchar_t> >::~basic_ios() */

void __thiscall
std::__ndk1::basic_ios<wchar_t,std::__ndk1::char_traits<wchar_t>>::~basic_ios
          (basic_ios<wchar_t,std::__ndk1::char_traits<wchar_t>> *this)

{
  ~basic_ios(this);
  operator_delete(this,0x98);
  return;
}

