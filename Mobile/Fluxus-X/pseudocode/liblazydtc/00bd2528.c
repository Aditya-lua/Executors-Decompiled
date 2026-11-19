/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bd2528
 */

/* std::__ndk1::basic_ios<wchar_t, std::__ndk1::char_traits<wchar_t>
   >::copyfmt(std::__ndk1::basic_ios<wchar_t, std::__ndk1::char_traits<wchar_t> > const&) */

basic_ios<wchar_t,std::__ndk1::char_traits<wchar_t>> * __thiscall
std::__ndk1::basic_ios<wchar_t,std::__ndk1::char_traits<wchar_t>>::copyfmt
          (basic_ios<wchar_t,std::__ndk1::char_traits<wchar_t>> *this,basic_ios *param_1)

{
  undefined4 uVar1;
  
  if (this != (basic_ios<wchar_t,std::__ndk1::char_traits<wchar_t>> *)param_1) {
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

