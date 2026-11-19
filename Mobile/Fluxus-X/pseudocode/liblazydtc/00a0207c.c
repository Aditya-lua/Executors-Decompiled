/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a0207c
 */

void bn_correct_top(long *param_1)

{
  bool bVar1;
  int iVar2;
  int iVar3;
  long *plVar4;
  
  iVar3 = (int)param_1[1];
  if (0 < iVar3) {
    plVar4 = (long *)(*param_1 + (long)iVar3 * 8);
    iVar2 = iVar3;
    do {
      plVar4 = plVar4 + -1;
      iVar3 = iVar2;
      if (*plVar4 != 0) break;
      iVar3 = iVar2 + -1;
      bVar1 = 0 < iVar2;
      iVar2 = iVar3;
    } while (iVar3 != 0 && bVar1);
    *(int *)(param_1 + 1) = iVar3;
  }
  if (iVar3 == 0) {
    *(undefined4 *)(param_1 + 2) = 0;
    return;
  }
  return;
}

