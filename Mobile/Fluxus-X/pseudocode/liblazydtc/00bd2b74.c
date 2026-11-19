/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bd2b74
 */

/* std::__ndk1::basic_streambuf<wchar_t, std::__ndk1::char_traits<wchar_t> >::uflow() */

ulong __thiscall
std::__ndk1::basic_streambuf<wchar_t,std::__ndk1::char_traits<wchar_t>>::uflow
          (basic_streambuf<wchar_t,std::__ndk1::char_traits<wchar_t>> *this)

{
  ulong uVar1;
  
  uVar1 = (**(code **)(*(long *)this + 0x48))();
  if ((int)uVar1 != -1) {
    uVar1 = (ulong)**(uint **)(this + 0x18);
    *(uint **)(this + 0x18) = *(uint **)(this + 0x18) + 1;
  }
  return uVar1;
}

