/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bceb88
 */

/* std::__ndk1::basic_streambuf<char, std::__ndk1::char_traits<char> >::setg(char*, char*, char*) */

void __thiscall
std::__ndk1::basic_streambuf<char,std::__ndk1::char_traits<char>>::setg
          (basic_streambuf<char,std::__ndk1::char_traits<char>> *this,char *param_1,char *param_2,
          char *param_3)

{
  *(char **)(this + 0x10) = param_1;
  *(char **)(this + 0x18) = param_2;
  *(char **)(this + 0x20) = param_3;
  return;
}

