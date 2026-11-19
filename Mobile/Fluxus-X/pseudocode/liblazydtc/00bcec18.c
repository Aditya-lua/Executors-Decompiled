/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bcec18
 */

/* std::__ndk1::basic_istream<char, std::__ndk1::char_traits<char>
   >::basic_istream(std::__ndk1::basic_streambuf<char, std::__ndk1::char_traits<char> >*) */

void __thiscall
std::__ndk1::basic_istream<char,std::__ndk1::char_traits<char>>::basic_istream
          (basic_istream<char,std::__ndk1::char_traits<char>> *this,basic_streambuf *param_1)

{
  *(undefined8 *)(this + 0x40) = 0;
  *(undefined ***)(this + 0x10) = &PTR__basic_istream_00cacca8;
  *(undefined ***)this = &PTR__basic_istream_00cacc80;
  *(undefined8 *)(this + 8) = 0;
                    /* try { // try from 00bcec4c to 00bcec53 has its CatchHandler @ 00bcec70 */
  ios_base::init((ios_base *)(this + 0x10),param_1);
  *(undefined8 *)(this + 0x98) = 0;
  *(undefined4 *)(this + 0xa0) = 0xffffffff;
  return;
}

