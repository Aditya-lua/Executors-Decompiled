/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00919a0c
 */

void FUN_00919a0c(byte *param_1)

{
  byte bVar1;
  byte *pbVar2;
  size_t sVar3;
  byte *__s;
  
  do {
    __s = param_1;
    bVar1 = *__s;
    param_1 = __s + 1;
  } while ((bVar1 == 0) != (bVar1 != 0x3a));
  if (bVar1 != 0) {
    __s = __s + 1;
  }
  for (; ((bVar1 = *__s, bVar1 == 9 || (bVar1 == 0x20)) || ((bVar1 != 0 && (bVar1 - 10 < 4))));
      __s = __s + 1) {
  }
  pbVar2 = (byte *)strchr((char *)__s,0xd);
  if ((pbVar2 == (byte *)0x0) && (pbVar2 = (byte *)strchr((char *)__s,10), pbVar2 == (byte *)0x0)) {
    sVar3 = strlen((char *)__s);
    pbVar2 = __s + sVar3;
    if (pbVar2 == (byte *)0x0) {
      return;
    }
  }
  for (; (__s < pbVar2 && (((bVar1 = *pbVar2, bVar1 == 9 || (bVar1 == 0x20)) || (bVar1 - 10 < 4))));
      pbVar2 = pbVar2 + -1) {
  }
  FUN_00941948(__s,pbVar2 + (1 - (long)__s));
  return;
}

