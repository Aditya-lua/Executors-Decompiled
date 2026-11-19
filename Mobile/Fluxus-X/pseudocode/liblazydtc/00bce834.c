/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bce834
 */

/* std::__ndk1::basic_streambuf<char, std::__ndk1::char_traits<char> >::snextc() */

ulong __thiscall
std::__ndk1::basic_streambuf<char,std::__ndk1::char_traits<char>>::snextc
          (basic_streambuf<char,std::__ndk1::char_traits<char>> *this)

{
  ulong uVar1;
  byte *pbVar2;
  
  if (*(byte **)(this + 0x18) == *(byte **)(this + 0x20)) {
    uVar1 = (**(code **)(*(long *)this + 0x50))();
    if ((int)uVar1 == -1) {
      return uVar1;
    }
    pbVar2 = *(byte **)(this + 0x18);
    if (pbVar2 == *(byte **)(this + 0x20)) goto LAB_00bce890;
  }
  else {
    pbVar2 = *(byte **)(this + 0x18) + 1;
    *(byte **)(this + 0x18) = pbVar2;
    if (pbVar2 == *(byte **)(this + 0x20)) {
LAB_00bce890:
                    /* WARNING: Could not recover jumptable at 0x00bce8a4. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      uVar1 = (**(code **)(*(long *)this + 0x48))();
      return uVar1;
    }
  }
  return (ulong)*pbVar2;
}

