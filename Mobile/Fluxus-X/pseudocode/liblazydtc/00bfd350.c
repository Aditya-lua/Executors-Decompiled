/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bfd350
 */

/* std::__ndk1::ctype_byname<char>::do_tolower(char) const */

uint __thiscall std::__ndk1::ctype_byname<char>::do_tolower(ctype_byname<char> *this,char param_1)

{
  uint uVar1;
  
  uVar1 = (uint)(byte)param_1;
  if (0xffffffe5 < (byte)param_1 - 0x5b) {
    uVar1 = (byte)param_1 | 0x20;
  }
  return uVar1;
}

