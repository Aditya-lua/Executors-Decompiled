/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bce8b8
 */

/* std::__ndk1::basic_streambuf<char, std::__ndk1::char_traits<char> >::sbumpc() */

ulong __thiscall
std::__ndk1::basic_streambuf<char,std::__ndk1::char_traits<char>>::sbumpc
          (basic_streambuf<char,std::__ndk1::char_traits<char>> *this)

{
  byte *pbVar1;
  ulong uVar2;
  
  pbVar1 = *(byte **)(this + 0x18);
  if (pbVar1 == *(byte **)(this + 0x20)) {
                    /* WARNING: Could not recover jumptable at 0x00bce8e0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    uVar2 = (**(code **)(*(long *)this + 0x50))();
    return uVar2;
  }
  *(byte **)(this + 0x18) = pbVar1 + 1;
  return (ulong)*pbVar1;
}

