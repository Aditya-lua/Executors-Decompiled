/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a803ec
 */

ulong ossl_lh_strcasehash(char *param_1)

{
  uint uVar1;
  char cVar2;
  uint uVar3;
  ulong uVar4;
  ulong uVar5;
  
  uVar4 = 0;
  if (param_1 != (char *)0x0) {
    cVar2 = *param_1;
    if (cVar2 == '\0') {
      return 0;
    }
    uVar4 = 0;
    uVar5 = 0x100;
    do {
      param_1 = param_1 + 1;
      uVar3 = ossl_tolower(cVar2);
      uVar1 = (uVar3 ^ uVar3 >> 2) & 0xf;
      cVar2 = *param_1;
      uVar4 = (ulong)((uint)(uVar4 >> ((ulong)(0x20 - uVar1) & 0x3f)) | (int)uVar4 << (ulong)uVar1)
              ^ (uVar5 | (long)(int)uVar3) * (uVar5 | (long)(int)uVar3);
      uVar5 = uVar5 + 0x100;
    } while (cVar2 != '\0');
    uVar4 = uVar4 ^ uVar4 >> 0x10;
  }
  return uVar4;
}

