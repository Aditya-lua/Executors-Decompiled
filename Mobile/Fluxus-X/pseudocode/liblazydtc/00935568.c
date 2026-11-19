/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00935568
 */

long FUN_00935568(long param_1,int param_2)

{
  int *piVar1;
  long lVar2;
  long lVar3;
  
  lVar3 = *(long *)(param_1 + 0x130);
  if (lVar3 == 0) {
    return 0;
  }
  lVar2 = 0;
  do {
    piVar1 = (int *)(lVar3 + 0x18);
    lVar3 = *(long *)(lVar3 + 8);
    if (*piVar1 == param_2) {
      lVar2 = lVar2 + 1;
    }
  } while (lVar3 != 0);
  return lVar2;
}

