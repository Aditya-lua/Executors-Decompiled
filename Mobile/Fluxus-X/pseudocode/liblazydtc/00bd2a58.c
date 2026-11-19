/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bd2a58
 */

/* std::__ndk1::basic_streambuf<wchar_t, std::__ndk1::char_traits<wchar_t> >::seekoff(long long,
   std::__ndk1::ios_base::seekdir, unsigned int) */

undefined1  [16]
std::__ndk1::basic_streambuf<wchar_t,std::__ndk1::char_traits<wchar_t>>::seekoff(void)

{
  return ZEXT816(0xffffffffffffffff) << 0x40;
}

