/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008b63c4
 */

void FUN_008b63c4(long param_1,long param_2)

{
  byte bVar1;
  byte bVar2;
  long lVar3;
  long lVar4;
  
  bVar1 = *(byte *)(param_2 + 2);
  if ((bVar1 & 7) != 0) {
    return;
  }
  if (*(byte *)(*(long *)(param_1 + 0x60) + 1) - 1 < 3) {
    *(byte *)(param_2 + 2) = bVar1 | 4;
    if (*(int *)((long)*(long **)(param_2 + 8) + 0xc) < 5) {
      return;
    }
    lVar4 = **(long **)(param_2 + 8);
    if ((*(byte *)(lVar4 + 2) & 3) == 0) {
      return;
    }
    lVar3 = *(long *)(param_1 + 0x60);
    if (*(byte *)(lVar3 + 1) - 1 < 3) {
      FUN_008b61bc(lVar3,lVar4);
      return;
    }
    bVar2 = *(byte *)(lVar3 + 2);
  }
  else {
    bVar2 = *(byte *)(*(long *)(param_1 + 0x60) + 2);
  }
  *(byte *)(param_2 + 2) = bVar2 & 3 | bVar1;
  return;
}

