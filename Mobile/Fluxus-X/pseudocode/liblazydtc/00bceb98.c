/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bceb98
 */

/* std::__ndk1::basic_streambuf<char, std::__ndk1::char_traits<char> >::pbump(int) */

void __thiscall
std::__ndk1::basic_streambuf<char,std::__ndk1::char_traits<char>>::pbump
          (basic_streambuf<char,std::__ndk1::char_traits<char>> *this,int param_1)

{
  *(long *)(this + 0x30) = *(long *)(this + 0x30) + (long)param_1;
  return;
}

