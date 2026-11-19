/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0084f188
 */

bool FUN_0084f188(long param_1,int param_2)

{
  long *plVar1;
  long lVar2;
  long lVar3;
  
  if (*(long *)(param_1 + 0x28) == 0) {
    return false;
  }
  plVar1 = *(long **)(param_1 + 0x20);
  lVar2 = *(long *)(param_1 + 0x28) << 3;
  do {
    lVar3 = *plVar1;
    if (*(int *)(lVar3 + 0x1c) == param_2) goto LAB_0084f1b8;
    lVar2 = lVar2 + -8;
    plVar1 = plVar1 + 1;
  } while (lVar2 != 0);
  lVar3 = 0;
LAB_0084f1b8:
  return lVar3 != 0;
}

