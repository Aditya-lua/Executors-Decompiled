/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bcebac
 */

/* std::__ndk1::basic_streambuf<char, std::__ndk1::char_traits<char> >::setp(char*, char*) */

void __thiscall
std::__ndk1::basic_streambuf<char,std::__ndk1::char_traits<char>>::setp
          (basic_streambuf<char,std::__ndk1::char_traits<char>> *this,char *param_1,char *param_2)

{
  *(char **)(this + 0x28) = param_1;
  *(char **)(this + 0x30) = param_1;
  *(char **)(this + 0x38) = param_2;
  return;
}

