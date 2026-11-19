/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bd58cc
 */

/* std::__ndk1::basic_ostream<wchar_t, std::__ndk1::char_traits<wchar_t>
   >::basic_ostream(std::__ndk1::basic_streambuf<wchar_t, std::__ndk1::char_traits<wchar_t> >*) */

void __thiscall
std::__ndk1::basic_ostream<wchar_t,std::__ndk1::char_traits<wchar_t>>::basic_ostream
          (basic_ostream<wchar_t,std::__ndk1::char_traits<wchar_t>> *this,basic_streambuf *param_1)

{
  *(undefined8 *)(this + 0x38) = 0;
  *(undefined ***)(this + 8) = &PTR__basic_ostream_00cacef8;
  *(undefined ***)this = &PTR__basic_ostream_00caced0;
                    /* try { // try from 00bd5900 to 00bd5907 has its CatchHandler @ 00bd5924 */
  ios_base::init((ios_base *)(this + 8),param_1);
  *(undefined8 *)(this + 0x90) = 0;
  *(undefined4 *)(this + 0x98) = 0xffffffff;
  return;
}

