/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bce6a8
 */

/* std::__ndk1::basic_ios<char, std::__ndk1::char_traits<char>
   >::copyfmt(std::__ndk1::basic_ios<char, std::__ndk1::char_traits<char> > const&) */

basic_ios<char,std::__ndk1::char_traits<char>> * __thiscall
std::__ndk1::basic_ios<char,std::__ndk1::char_traits<char>>::copyfmt
          (basic_ios<char,std::__ndk1::char_traits<char>> *this,basic_ios *param_1)

{
  undefined4 uVar1;
  
  if (this != (basic_ios<char,std::__ndk1::char_traits<char>> *)param_1) {
    ios_base::__call_callbacks((ios_base *)this,0);
    ios_base::copyfmt((ios_base *)this,(ios_base *)param_1);
    uVar1 = *(undefined4 *)(param_1 + 0x90);
    *(undefined8 *)(this + 0x88) = *(undefined8 *)(param_1 + 0x88);
    *(undefined4 *)(this + 0x90) = uVar1;
    ios_base::__call_callbacks((ios_base *)this,2);
    *(undefined4 *)(this + 0x24) = *(undefined4 *)(param_1 + 0x24);
    ios_base::clear((ios_base *)this,*(uint *)(this + 0x20));
  }
  return this;
}

