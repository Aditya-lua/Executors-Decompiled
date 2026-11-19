/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bd2640
 */

/* std::__ndk1::basic_streambuf<wchar_t, std::__ndk1::char_traits<wchar_t> >::getloc() const */

void std::__ndk1::basic_streambuf<wchar_t,std::__ndk1::char_traits<wchar_t>>::getloc(void)

{
  long in_x0;
  locale *in_x8;
  
  locale::locale(in_x8,(locale *)(in_x0 + 8));
  return;
}

