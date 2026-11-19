/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008c8948
 */

void FUN_008c8948(long param_1)

{
  int iVar1;
  int iVar2;
  long lVar3;
  long lVar4;
  
  lVar3 = *(long *)(param_1 + 0x50);
  lVar4 = *(long *)(lVar3 + 0x20);
  *(uint *)(lVar3 + 0x2c) = *(uint *)(lVar3 + 0x2c) & 0xfffffff7;
  iVar2 = *(int *)(lVar4 + -4);
  iVar1 = iVar2 >> 0x10;
  lVar3 = *(long *)(param_1 + 0x70) + (ulong)(byte)((uint)iVar2 >> 8) * 0x10;
  *(undefined8 *)(lVar3 + 0x28) = *(undefined8 *)(lVar3 + 0x38);
  *(undefined8 *)(lVar3 + 0x20) = *(undefined8 *)(lVar3 + 0x30);
  if (*(int *)(lVar3 + 0x3c) == 0) {
    iVar1 = 1;
  }
  *(long *)(*(long *)(param_1 + 0x50) + 0x20) = lVar4 + (long)iVar1 * 4;
  return;
}

