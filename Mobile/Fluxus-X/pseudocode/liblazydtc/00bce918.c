/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bce918
 */

/* std::__ndk1::basic_streambuf<char, std::__ndk1::char_traits<char> >::sputbackc(char) */

ulong __thiscall
std::__ndk1::basic_streambuf<char,std::__ndk1::char_traits<char>>::sputbackc
          (basic_streambuf<char,std::__ndk1::char_traits<char>> *this,char param_1)

{
  ulong uVar1;
  byte *pbVar2;
  
  if ((*(long *)(this + 0x10) == *(long *)(this + 0x18)) ||
     (pbVar2 = (byte *)(*(long *)(this + 0x18) + -1), *pbVar2 != param_1)) {
                    /* WARNING: Could not recover jumptable at 0x00bce94c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    uVar1 = (**(code **)(*(long *)this + 0x58))(this,param_1);
    return uVar1;
  }
  *(byte **)(this + 0x18) = pbVar2;
  return (ulong)*pbVar2;
}

