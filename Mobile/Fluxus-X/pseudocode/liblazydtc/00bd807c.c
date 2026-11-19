/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bd807c
 */

/* std::__ndk1::basic_filebuf<char, std::__ndk1::char_traits<char> >::basic_filebuf() */

void __thiscall
std::__ndk1::basic_filebuf<char,std::__ndk1::char_traits<char>>::basic_filebuf
          (basic_filebuf<char,std::__ndk1::char_traits<char>> *this)

{
  byte bVar1;
  ulong uVar2;
  undefined8 uVar3;
  locale alStack_18 [8];
  
  *(undefined ***)this = &PTR__basic_streambuf_00c4e728;
  locale::locale((locale *)(this + 8));
  *(undefined8 *)(this + 0x48) = 0;
  *(undefined8 *)(this + 0x50) = 0;
  *(undefined8 *)(this + 0x40) = 0;
  *(undefined2 *)(this + 0xa0) = 0;
  *(undefined ***)this = &PTR__basic_filebuf_00c51ca8;
  *(undefined8 *)(this + 0x28) = 0;
  *(undefined8 *)(this + 0x20) = 0;
  *(undefined8 *)(this + 0x38) = 0;
  *(undefined8 *)(this + 0x30) = 0;
  *(undefined8 *)(this + 0x18) = 0;
  *(undefined8 *)(this + 0x10) = 0;
  *(undefined8 *)(this + 0x68) = 0;
  *(undefined8 *)(this + 0x60) = 0;
  *(undefined8 *)(this + 0x78) = 0;
  *(undefined8 *)(this + 0x70) = 0;
  *(undefined8 *)(this + 0x88) = 0;
  *(undefined8 *)(this + 0x80) = 0;
  *(undefined8 *)(this + 0x94) = 0;
  *(undefined8 *)(this + 0x8c) = 0;
  *(undefined4 *)(this + 0x9c) = 0x20;
  this[0xa2] = (basic_filebuf<char,std::__ndk1::char_traits<char>>)0x0;
  locale::locale(alStack_18,(locale *)(this + 8));
                    /* try { // try from 00bd80f4 to 00bd8103 has its CatchHandler @ 00bd81ac */
  uVar2 = locale::has_facet(alStack_18,(id *)&codecvt<char,char,mbstate_t>::id);
  locale::~locale(alStack_18);
  if ((uVar2 & 1) != 0) {
    locale::locale(alStack_18,(locale *)(this + 8));
                    /* try { // try from 00bd8120 to 00bd812f has its CatchHandler @ 00bd8180 */
    uVar3 = locale::use_facet(alStack_18,(id *)&codecvt<char,char,mbstate_t>::id);
    *(undefined8 *)(this + 0x80) = uVar3;
    locale::~locale(alStack_18);
    bVar1 = (**(code **)(**(long **)(this + 0x80) + 0x38))();
    this[0xa2] = (basic_filebuf<char,std::__ndk1::char_traits<char>>)(bVar1 & 1);
  }
                    /* try { // try from 00bd815c to 00bd816b has its CatchHandler @ 00bd8190 */
  (**(code **)(*(long *)this + 0x18))(this,0,0x1000);
  return;
}

