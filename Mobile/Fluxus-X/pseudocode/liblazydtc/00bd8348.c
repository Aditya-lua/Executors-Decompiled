/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bd8348
 */

/* std::__ndk1::basic_filebuf<char, std::__ndk1::char_traits<char> >::~basic_filebuf() */

void __thiscall
std::__ndk1::basic_filebuf<char,std::__ndk1::char_traits<char>>::~basic_filebuf
          (basic_filebuf<char,std::__ndk1::char_traits<char>> *this)

{
  FILE *__stream;
  
  __stream = *(FILE **)(this + 0x78);
  *(undefined ***)this = &PTR__basic_filebuf_00c51ca8;
  if (__stream != (FILE *)0x0) {
                    /* try { // try from 00bd8378 to 00bd837f has its CatchHandler @ 00bd8404 */
    sync(this);
    fclose(__stream);
    *(undefined8 *)(this + 0x78) = 0;
                    /* try { // try from 00bd8394 to 00bd83a3 has its CatchHandler @ 00bd83fc */
    (**(code **)(*(long *)this + 0x18))(this,0,0);
  }
  if ((this[0xa0] == (basic_filebuf<char,std::__ndk1::char_traits<char>>)0x1) &&
     (*(void **)(this + 0x40) != (void *)0x0)) {
    operator_delete__(*(void **)(this + 0x40));
  }
  if ((this[0xa1] == (basic_filebuf<char,std::__ndk1::char_traits<char>>)0x1) &&
     (*(void **)(this + 0x68) != (void *)0x0)) {
    operator_delete__(*(void **)(this + 0x68));
  }
  *(undefined ***)this = &PTR__basic_streambuf_00c4e728;
  locale::~locale((locale *)(this + 8));
  return;
}

