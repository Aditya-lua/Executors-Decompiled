/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bce980
 */

/* std::__ndk1::basic_streambuf<char, std::__ndk1::char_traits<char> >::sputc(char) */

ulong __thiscall
std::__ndk1::basic_streambuf<char,std::__ndk1::char_traits<char>>::sputc
          (basic_streambuf<char,std::__ndk1::char_traits<char>> *this,char param_1)

{
  char *pcVar1;
  ulong uVar2;
  
  pcVar1 = *(char **)(this + 0x30);
  if (pcVar1 == *(char **)(this + 0x38)) {
                    /* WARNING: Could not recover jumptable at 0x00bce9b8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    uVar2 = (**(code **)(*(long *)this + 0x68))(this,param_1);
    return uVar2;
  }
  *(char **)(this + 0x30) = pcVar1 + 1;
  *pcVar1 = param_1;
  return (ulong)(byte)param_1;
}

