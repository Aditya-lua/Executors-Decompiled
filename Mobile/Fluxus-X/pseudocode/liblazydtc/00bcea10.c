/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bcea10
 */

/* std::__ndk1::basic_streambuf<char, std::__ndk1::char_traits<char>
   >::basic_streambuf(std::__ndk1::basic_streambuf<char, std::__ndk1::char_traits<char> > const&) */

void __thiscall
std::__ndk1::basic_streambuf<char,std::__ndk1::char_traits<char>>::basic_streambuf
          (basic_streambuf<char,std::__ndk1::char_traits<char>> *this,basic_streambuf *param_1)

{
  undefined8 uVar1;
  
  *(undefined ***)this = &PTR__basic_streambuf_00c4e728;
  locale::locale((locale *)(this + 8),(locale *)(param_1 + 8));
  uVar1 = *(undefined8 *)(param_1 + 0x10);
  *(undefined8 *)(this + 0x18) = *(undefined8 *)(param_1 + 0x18);
  *(undefined8 *)(this + 0x10) = uVar1;
  uVar1 = *(undefined8 *)(param_1 + 0x20);
  *(undefined8 *)(this + 0x28) = *(undefined8 *)(param_1 + 0x28);
  *(undefined8 *)(this + 0x20) = uVar1;
  uVar1 = *(undefined8 *)(param_1 + 0x30);
  *(undefined8 *)(this + 0x38) = *(undefined8 *)(param_1 + 0x38);
  *(undefined8 *)(this + 0x30) = uVar1;
  return;
}

