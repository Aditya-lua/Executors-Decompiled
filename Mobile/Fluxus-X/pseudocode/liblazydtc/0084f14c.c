/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0084f14c
 */

bool FUN_0084f14c(long param_1)

{
  bool bVar1;
  long *plVar2;
  long lVar3;
  
  if (*(long *)(param_1 + 0x28) == 0) {
    return false;
  }
  lVar3 = *(long *)(param_1 + 0x28) * 8;
  plVar2 = *(long **)(param_1 + 0x20);
  do {
    lVar3 = lVar3 + -8;
    bVar1 = *(int *)(*plVar2 + 0x1c) == 1;
    plVar2 = plVar2 + 1;
  } while (!bVar1 && lVar3 != 0);
  return bVar1;
}

