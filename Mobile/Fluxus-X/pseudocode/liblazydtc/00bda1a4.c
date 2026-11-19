/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bda1a4
 */

/* std::__ndk1::collate<char>::do_hash(char const*, char const*) const */

ulong __thiscall
std::__ndk1::collate<char>::do_hash(collate<char> *this,char *param_1,char *param_2)

{
  ulong uVar1;
  byte *pbVar2;
  ulong uVar3;
  
  if (param_1 == param_2) {
    return 0;
  }
  uVar1 = 0;
  do {
    pbVar2 = (byte *)(param_1 + 1);
    uVar1 = (ulong)(byte)*param_1 + uVar1 * 0x10;
    uVar3 = uVar1 & 0xf000000000000000;
    uVar1 = (uVar3 | uVar3 >> 0x38) ^ uVar1;
    param_1 = (char *)pbVar2;
  } while (pbVar2 != (byte *)param_2);
  return uVar1;
}

