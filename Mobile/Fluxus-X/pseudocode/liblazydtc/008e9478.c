/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008e9478
 */

/* std::__ndk1::basic_streambuf<char, std::__ndk1::char_traits<char> >::uflow() */

ulong __thiscall
std::__ndk1::basic_streambuf<char,std::__ndk1::char_traits<char>>::uflow
          (basic_streambuf<char,std::__ndk1::char_traits<char>> *this)

{
  ulong uVar1;
  byte *pbVar2;
  
  uVar1 = (**(code **)(*(long *)this + 0x48))();
  if ((int)uVar1 != -1) {
    pbVar2 = *(byte **)(this + 0x18);
    *(byte **)(this + 0x18) = pbVar2 + 1;
    uVar1 = (ulong)*pbVar2;
  }
  return uVar1;
}

