/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bce76c
 */

/* std::__ndk1::basic_streambuf<char, std::__ndk1::char_traits<char> >::pubimbue(std::__ndk1::locale
   const&) */

void std::__ndk1::basic_streambuf<char,std::__ndk1::char_traits<char>>::pubimbue(locale *param_1)

{
  locale *in_x1;
  locale *in_x8;
  
  (**(code **)(*(long *)param_1 + 0x10))();
  locale::locale(in_x8,param_1 + 8);
  locale::operator=(param_1 + 8,in_x1);
  return;
}

