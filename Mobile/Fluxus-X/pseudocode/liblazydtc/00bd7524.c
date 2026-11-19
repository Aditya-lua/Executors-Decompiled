/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bd7524
 */

/* std::__ndk1::basic_stringbuf<char, std::__ndk1::char_traits<char>, std::__ndk1::allocator<char>
   >::basic_stringbuf(std::__ndk1::basic_stringbuf<char, std::__ndk1::char_traits<char>,
   std::__ndk1::allocator<char> >&&) */

void __thiscall
std::__ndk1::basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
basic_stringbuf(basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
                *this,basic_stringbuf *param_1)

{
  undefined4 uVar1;
  
  *(undefined ***)this = &PTR__basic_streambuf_00c4e728;
  locale::locale((locale *)(this + 8));
  *(undefined8 *)(this + 0x40) = 0;
  *(undefined8 *)(this + 0x28) = 0;
  *(undefined8 *)(this + 0x20) = 0;
  *(undefined8 *)(this + 0x38) = 0;
  *(undefined8 *)(this + 0x30) = 0;
  *(undefined8 *)(this + 0x18) = 0;
  *(undefined8 *)(this + 0x10) = 0;
  *(undefined8 *)(this + 0x48) = 0;
  *(undefined8 *)(this + 0x50) = 0;
  uVar1 = *(undefined4 *)(param_1 + 0x60);
  *(undefined ***)this = &PTR_LAB_00c4e678;
  *(undefined4 *)(this + 0x60) = uVar1;
                    /* try { // try from 00bd7584 to 00bd758f has its CatchHandler @ 00bd75a4 */
  FUN_00bd75d8(this,param_1);
  return;
}

