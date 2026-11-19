/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00978c60
 */

/* std::__ndk1::basic_ostream<char, std::__ndk1::char_traits<char> >::~basic_ostream() */

void __thiscall
std::__ndk1::basic_ostream<char,std::__ndk1::char_traits<char>>::~basic_ostream
          (basic_ostream<char,std::__ndk1::char_traits<char>> *this)

{
  ios_base::~ios_base((ios_base *)(this + 8));
  operator_delete(this);
  return;
}

