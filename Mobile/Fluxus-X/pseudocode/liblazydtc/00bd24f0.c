/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bd24f0
 */

/* std::__ndk1::basic_ios<wchar_t, std::__ndk1::char_traits<wchar_t> >::~basic_ios() */

void __thiscall
std::__ndk1::basic_ios<wchar_t,std::__ndk1::char_traits<wchar_t>>::~basic_ios
          (basic_ios<wchar_t,std::__ndk1::char_traits<wchar_t>> *this)

{
  ios_base::~ios_base((ios_base *)this);
  return;
}

