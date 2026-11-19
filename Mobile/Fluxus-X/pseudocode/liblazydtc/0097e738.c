/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0097e738
 */

/* std::__ndk1::basic_filebuf<char, std::__ndk1::char_traits<char> >::~basic_filebuf() */

void __thiscall
std::__ndk1::basic_filebuf<char,std::__ndk1::char_traits<char>>::~basic_filebuf
          (basic_filebuf<char,std::__ndk1::char_traits<char>> *this)

{
  int iVar1;
  FILE *__stream;
  
  __stream = *(FILE **)(this + 0x78);
  *(undefined ***)this = &PTR__basic_filebuf_00c51ca8;
  if (__stream != (FILE *)0x0) {
                    /* try { // try from 0097e764 to 0097e76b has its CatchHandler @ 0097e7c8 */
    sync(this);
    iVar1 = fclose(__stream);
    if (iVar1 == 0) {
      *(undefined8 *)(this + 0x78) = 0;
    }
  }
  if ((this[0xa0] != (basic_filebuf<char,std::__ndk1::char_traits<char>>)0x0) &&
     (*(void **)(this + 0x40) != (void *)0x0)) {
    operator_delete__(*(void **)(this + 0x40));
  }
  if ((this[0xa1] != (basic_filebuf<char,std::__ndk1::char_traits<char>>)0x0) &&
     (*(void **)(this + 0x68) != (void *)0x0)) {
    operator_delete__(*(void **)(this + 0x68));
  }
  *(undefined ***)this = &PTR__basic_streambuf_00c4e728;
  locale::~locale((locale *)(this + 8));
  return;
}

