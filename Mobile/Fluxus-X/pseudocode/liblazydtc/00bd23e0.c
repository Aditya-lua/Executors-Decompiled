/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bd23e0
 */

/* std::__ndk1::basic_iostream<char, std::__ndk1::char_traits<char> >::~basic_iostream() */

void __thiscall
std::__ndk1::basic_iostream<char,std::__ndk1::char_traits<char>>::~basic_iostream
          (basic_iostream<char,std::__ndk1::char_traits<char>> *this)

{
  ios_base::~ios_base((ios_base *)(this + 0x18));
  operator_delete(this,0xb0);
  return;
}

