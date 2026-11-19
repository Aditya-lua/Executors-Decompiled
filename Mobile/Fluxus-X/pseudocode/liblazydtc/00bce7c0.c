/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bce7c0
 */

/* std::__ndk1::basic_streambuf<char, std::__ndk1::char_traits<char> >::getloc() const */

void std::__ndk1::basic_streambuf<char,std::__ndk1::char_traits<char>>::getloc(void)

{
  long in_x0;
  locale *in_x8;
  
  locale::locale(in_x8,(locale *)(in_x0 + 8));
  return;
}

