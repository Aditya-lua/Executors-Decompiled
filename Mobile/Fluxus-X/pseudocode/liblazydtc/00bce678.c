/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bce678
 */

/* std::__ndk1::basic_ios<char, std::__ndk1::char_traits<char> >::~basic_ios() */

void __thiscall
std::__ndk1::basic_ios<char,std::__ndk1::char_traits<char>>::~basic_ios
          (basic_ios<char,std::__ndk1::char_traits<char>> *this)

{
  ~basic_ios(this);
  operator_delete(this,0x98);
  return;
}

