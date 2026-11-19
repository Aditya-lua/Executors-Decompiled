/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bd2a68
 */

/* std::__ndk1::basic_streambuf<wchar_t, std::__ndk1::char_traits<wchar_t>
   >::seekpos(std::__ndk1::fpos<mbstate_t>, unsigned int) */

undefined1  [16]
std::__ndk1::basic_streambuf<wchar_t,std::__ndk1::char_traits<wchar_t>>::seekpos(void)

{
  return ZEXT816(0xffffffffffffffff) << 0x40;
}

