/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bd2d04
 */

/* std::__ndk1::basic_istream<wchar_t, std::__ndk1::char_traits<wchar_t>
   >::basic_istream(std::__ndk1::basic_streambuf<wchar_t, std::__ndk1::char_traits<wchar_t> >*) */

void __thiscall
std::__ndk1::basic_istream<wchar_t,std::__ndk1::char_traits<wchar_t>>::basic_istream
          (basic_istream<wchar_t,std::__ndk1::char_traits<wchar_t>> *this,basic_streambuf *param_1)

{
  *(undefined8 *)(this + 0x40) = 0;
  *(undefined ***)(this + 0x10) = &PTR__basic_istream_00cace98;
  *(undefined ***)this = &PTR__basic_istream_00cace70;
  *(undefined8 *)(this + 8) = 0;
                    /* try { // try from 00bd2d38 to 00bd2d3f has its CatchHandler @ 00bd2d5c */
  ios_base::init((ios_base *)(this + 0x10),param_1);
  *(undefined8 *)(this + 0x98) = 0;
  *(undefined4 *)(this + 0xa0) = 0xffffffff;
  return;
}

