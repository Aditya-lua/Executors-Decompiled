/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bd5964
 */

/* std::__ndk1::basic_ostream<wchar_t, std::__ndk1::char_traits<wchar_t> >::~basic_ostream() */

void __thiscall
std::__ndk1::basic_ostream<wchar_t,std::__ndk1::char_traits<wchar_t>>::~basic_ostream
          (basic_ostream<wchar_t,std::__ndk1::char_traits<wchar_t>> *this)

{
  ios_base::~ios_base((ios_base *)(this + 8));
  operator_delete(this,0xa0);
  return;
}

