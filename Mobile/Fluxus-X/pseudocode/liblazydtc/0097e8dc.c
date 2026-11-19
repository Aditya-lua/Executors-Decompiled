/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0097e8dc
 */

/* std::__ndk1::basic_filebuf<char, std::__ndk1::char_traits<char> >::~basic_filebuf() */

void __thiscall
std::__ndk1::basic_filebuf<char,std::__ndk1::char_traits<char>>::~basic_filebuf
          (basic_filebuf<char,std::__ndk1::char_traits<char>> *this)

{
  ~basic_filebuf(this);
  operator_delete(this);
  return;
}

