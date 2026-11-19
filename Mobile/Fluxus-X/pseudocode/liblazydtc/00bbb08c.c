/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bbb08c
 */

undefined8 FUN_00bbb08c(long param_1,int param_2)

{
  byte bVar1;
  uint uVar2;
  uint uVar3;
  uint uVar4;
  int iVar5;
  uint uVar6;
  
  if (param_2 == 0) {
    return 0;
  }
  iVar5 = 0;
  uVar4 = 0;
  uVar6 = 1;
  do {
    uVar3 = uVar6 - 1;
    uVar2 = uVar6 >> (ulong)(*(uint *)(param_1 + 4) & 0x1f);
    uVar6 = uVar6 + 1;
    bVar1 = *(byte *)(param_1 + 10 + (ulong)uVar3 * 8);
    if (uVar4 <= bVar1) {
      uVar4 = (uint)bVar1;
    }
    if (0x16 < bVar1) {
      iVar5 = iVar5 + 1;
    }
  } while (uVar2 == 0);
  return CONCAT44(uVar4,iVar5 << (ulong)(8 - *(uint *)(param_1 + 4) & 0x1f));
}

