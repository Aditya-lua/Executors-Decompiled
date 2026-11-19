/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bd2320
 */

/* std::__ndk1::basic_iostream<char, std::__ndk1::char_traits<char>
   >::basic_iostream(std::__ndk1::basic_streambuf<char, std::__ndk1::char_traits<char> >*) */

void __thiscall
std::__ndk1::basic_iostream<char,std::__ndk1::char_traits<char>>::basic_iostream
          (basic_iostream<char,std::__ndk1::char_traits<char>> *this,basic_streambuf *param_1)

{
  *(undefined8 *)(this + 0x48) = 0;
  *(undefined ***)(this + 0x18) = &PTR__basic_istream_00cacf78;
  *(undefined ***)this = &PTR__basic_istream_00cacf50;
  *(undefined8 *)(this + 8) = 0;
                    /* try { // try from 00bd2354 to 00bd235b has its CatchHandler @ 00bd2394 */
  ios_base::init((ios_base *)(this + 0x18),param_1);
  *(undefined4 *)(this + 0xa8) = 0xffffffff;
  *(undefined8 *)(this + 0xa0) = 0;
  *(undefined ***)this = &PTR__basic_iostream_00cacd40;
  *(undefined ***)(this + 0x10) = &PTR__basic_iostream_00cacd68;
  *(undefined ***)(this + 0x18) = &PTR__basic_iostream_00cacd90;
  return;
}

