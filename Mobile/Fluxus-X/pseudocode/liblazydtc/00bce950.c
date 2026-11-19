/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bce950
 */

/* std::__ndk1::basic_streambuf<char, std::__ndk1::char_traits<char> >::sungetc() */

ulong __thiscall
std::__ndk1::basic_streambuf<char,std::__ndk1::char_traits<char>>::sungetc
          (basic_streambuf<char,std::__ndk1::char_traits<char>> *this)

{
  long lVar1;
  ulong uVar2;
  
  lVar1 = *(long *)(this + 0x18);
  if (*(long *)(this + 0x10) == lVar1) {
                    /* WARNING: Could not recover jumptable at 0x00bce97c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    uVar2 = (**(code **)(*(long *)this + 0x58))(this,0xffffffff);
    return uVar2;
  }
  *(long *)(this + 0x18) = lVar1 + -1;
  return (ulong)*(byte *)(lVar1 + -1);
}

