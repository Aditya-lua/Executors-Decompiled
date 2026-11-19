/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bd0f4c
 */

/* std::__ndk1::basic_ostream<char, std::__ndk1::char_traits<char>
   >::basic_ostream(std::__ndk1::basic_streambuf<char, std::__ndk1::char_traits<char> >*) */

void __thiscall
std::__ndk1::basic_ostream<char,std::__ndk1::char_traits<char>>::basic_ostream
          (basic_ostream<char,std::__ndk1::char_traits<char>> *this,basic_streambuf *param_1)

{
  *(undefined8 *)(this + 0x38) = 0;
  *(undefined ***)(this + 8) = &PTR__basic_ostream_00cacd08;
  *(undefined ***)this = &PTR__basic_ostream_00cacce0;
                    /* try { // try from 00bd0f80 to 00bd0f87 has its CatchHandler @ 00bd0fa4 */
  ios_base::init((ios_base *)(this + 8),param_1);
  *(undefined8 *)(this + 0x90) = 0;
  *(undefined4 *)(this + 0x98) = 0xffffffff;
  return;
}

