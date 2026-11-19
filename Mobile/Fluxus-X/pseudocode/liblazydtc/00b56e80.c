/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b56e80
 */

bool FUN_00b56e80(long param_1,long param_2)

{
  uint uVar1;
  int iVar2;
  long lVar3;
  
  if (param_2 == 0) {
    return false;
  }
  lVar3 = *(long *)(param_1 + 0xf8);
  uVar1 = *(byte *)(lVar3 + 99) + 1;
  *(char *)(lVar3 + 99) = (char)uVar1;
  uVar1 = (uint)*(byte *)(lVar3 + 0x62) + (uVar1 >> 8);
  *(char *)(lVar3 + 0x62) = (char)uVar1;
  uVar1 = (uint)*(byte *)(lVar3 + 0x61) + (uVar1 >> 8);
  *(char *)(lVar3 + 0x61) = (char)uVar1;
  uVar1 = (uint)*(byte *)(lVar3 + 0x60) + (uVar1 >> 8);
  *(char *)(lVar3 + 0x60) = (char)uVar1;
  uVar1 = (uint)*(byte *)(lVar3 + 0x5f) + (uVar1 >> 8);
  *(char *)(lVar3 + 0x5f) = (char)uVar1;
  uVar1 = (uint)*(byte *)(lVar3 + 0x5e) + (uVar1 >> 8);
  *(char *)(lVar3 + 0x5e) = (char)uVar1;
  uVar1 = (uint)*(byte *)(lVar3 + 0x5d) + (uVar1 >> 8);
  *(char *)(lVar3 + 0x5d) = (char)uVar1;
  uVar1 = (uint)*(byte *)(lVar3 + 0x5c) + (uVar1 >> 8);
  *(char *)(lVar3 + 0x5c) = (char)uVar1;
  uVar1 = (uint)*(byte *)(lVar3 + 0x5b) + (uVar1 >> 8);
  *(char *)(lVar3 + 0x5b) = (char)uVar1;
  uVar1 = (uint)*(byte *)(lVar3 + 0x5a) + (uVar1 >> 8);
  *(char *)(lVar3 + 0x5a) = (char)uVar1;
  uVar1 = (uint)*(byte *)(lVar3 + 0x59) + (uVar1 >> 8);
  *(char *)(lVar3 + 0x59) = (char)uVar1;
  uVar1 = (uint)*(byte *)(lVar3 + 0x58) + (uVar1 >> 8);
  *(char *)(lVar3 + 0x58) = (char)uVar1;
  uVar1 = (uint)*(byte *)(lVar3 + 0x57) + (uVar1 >> 8);
  *(char *)(lVar3 + 0x57) = (char)uVar1;
  uVar1 = (uint)*(byte *)(lVar3 + 0x56) + (uVar1 >> 8);
  *(char *)(lVar3 + 0x56) = (char)uVar1;
  iVar2 = (uint)*(byte *)(lVar3 + 0x55) + (uVar1 >> 8);
  *(char *)(lVar3 + 0x55) = (char)iVar2;
  *(char *)(lVar3 + 0x54) = *(char *)(lVar3 + 0x54) + (char)((uint)iVar2 >> 8);
  iVar2 = FUN_00b57484();
  return iVar2 != 0;
}

