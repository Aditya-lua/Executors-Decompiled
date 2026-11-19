/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00853390
 */

void FUN_00853390(long param_1)

{
  uint uVar1;
  int iVar2;
  
  iVar2 = -1;
  do {
    uVar1 = iVar2 + 2;
    iVar2 = iVar2 + 1;
  } while (*(char *)(*(long *)(param_1 + 0x18) + (ulong)*(uint *)(param_1 + 0x14) + (ulong)uVar1) !=
           ']');
  return;
}

