/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bd2414
 */

/* non-virtual thunk to std::__ndk1::basic_iostream<char, std::__ndk1::char_traits<char>
   >::~basic_iostream() */

void __thiscall
std::__ndk1::basic_iostream<char,std::__ndk1::char_traits<char>>::~basic_iostream
          (basic_iostream<char,std::__ndk1::char_traits<char>> *this)

{
  ios_base::~ios_base((ios_base *)(this + 8));
  operator_delete(this + -0x10,0xb0);
  return;
}

