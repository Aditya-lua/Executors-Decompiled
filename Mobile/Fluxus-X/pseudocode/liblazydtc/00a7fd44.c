/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a7fd44
 */

ulong OPENSSL_LH_strhash(byte *param_1)

{
  uint uVar1;
  byte bVar2;
  ulong uVar3;
  ulong uVar4;
  ulong uVar5;
  
  uVar3 = 0;
  if (param_1 != (byte *)0x0) {
    bVar2 = *param_1;
    if (bVar2 == 0) {
      return 0;
    }
    uVar3 = 0;
    uVar4 = 0x100;
    do {
      uVar5 = (ulong)bVar2;
      param_1 = param_1 + 1;
      uVar1 = (byte)(bVar2 ^ bVar2 >> 2) & 0xf;
      bVar2 = *param_1;
      uVar5 = uVar4 | uVar5;
      uVar4 = uVar4 + 0x100;
      uVar3 = (ulong)((uint)(uVar3 >> ((ulong)(0x20 - uVar1) & 0x3f)) | (int)uVar3 << (ulong)uVar1)
              ^ uVar5 * uVar5;
    } while (bVar2 != 0);
    uVar3 = uVar3 ^ uVar3 >> 0x10;
  }
  return uVar3;
}

