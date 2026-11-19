/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008e8f68
 */

/* std::__ndk1::basic_istream<char, std::__ndk1::char_traits<char> >::~basic_istream() */

void __thiscall
std::__ndk1::basic_istream<char,std::__ndk1::char_traits<char>>::~basic_istream
          (basic_istream<char,std::__ndk1::char_traits<char>> *this)

{
  ios_base::~ios_base((ios_base *)(this + 0x10));
  return;
}

