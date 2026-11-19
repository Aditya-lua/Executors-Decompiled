/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bce8e4
 */

/* std::__ndk1::basic_streambuf<char, std::__ndk1::char_traits<char> >::sgetc() */

ulong __thiscall
std::__ndk1::basic_streambuf<char,std::__ndk1::char_traits<char>>::sgetc
          (basic_streambuf<char,std::__ndk1::char_traits<char>> *this)

{
  ulong uVar1;
  
  if (*(byte **)(this + 0x18) == *(byte **)(this + 0x20)) {
                    /* WARNING: Could not recover jumptable at 0x00bce904. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    uVar1 = (**(code **)(*(long *)this + 0x48))();
    return uVar1;
  }
  return (ulong)**(byte **)(this + 0x18);
}

