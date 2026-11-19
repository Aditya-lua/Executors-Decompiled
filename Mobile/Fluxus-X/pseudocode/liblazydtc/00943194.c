/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00943194
 */

void FUN_00943194(long param_1)

{
  uint uVar1;
  byte bVar2;
  long lVar3;
  
  lVar3 = *(long *)(param_1 + 0x20);
  bVar2 = FUN_00932de0();
  if (((*(byte *)(lVar3 + 0x3a2) >> 6 & 1) == 0) &&
     ((*(byte *)(lVar3 + 0x574) < 0x14 & (bVar2 ^ 0xff)) != 0)) {
    bVar2 = 1;
    *(undefined8 *)(lVar3 + 0x3c8) = 0xffffffffffffffff;
  }
  else {
    *(undefined8 *)(lVar3 + 0x3c8) = 0xffffffffffffffff;
    bVar2 = bVar2 ^ 1;
  }
  uVar1 = *(uint *)(param_1 + 0x1b1);
  *(undefined8 *)(param_1 + 0xd8) = 0xffffffffffffffff;
  *(uint *)(param_1 + 0x1b1) = uVar1 & 0xfffbbffe;
  if (((bVar2 & 1) == 0) && ((uVar1 >> 0xf & 1) == 0)) {
    *(uint *)(param_1 + 0x128) = *(uint *)(param_1 + 0x128) | 2;
  }
  return;
}

