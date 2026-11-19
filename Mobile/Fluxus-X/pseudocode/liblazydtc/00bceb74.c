/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bceb74
 */

/* std::__ndk1::basic_streambuf<char, std::__ndk1::char_traits<char> >::gbump(int) */

void __thiscall
std::__ndk1::basic_streambuf<char,std::__ndk1::char_traits<char>>::gbump
          (basic_streambuf<char,std::__ndk1::char_traits<char>> *this,int param_1)

{
  *(long *)(this + 0x18) = *(long *)(this + 0x18) + (long)param_1;
  return;
}

