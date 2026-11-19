/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0087b8b8
 */

long FUN_0087b8b8(long *param_1,int *param_2)

{
  long lVar1;
  int *piVar2;
  ulong uVar3;
  long lVar4;
  
  if (param_1[5] == 0) {
    return 0;
  }
  lVar4 = param_1[4];
  lVar1 = FUN_0087337c();
  uVar3 = (ulong)(lVar1 * -0x61c8864680b583eb) >> ((ulong)*(byte *)(param_1 + 6) & 0x3f);
  if ((*(ulong *)(param_1[3] + (uVar3 >> 6) * 8) >> (uVar3 & 0x3f) & 1) != 0) {
    do {
      piVar2 = (int *)(*param_1 + uVar3 * 0x30);
      if ((((*piVar2 == *param_2) && (*(long *)(piVar2 + 2) == *(long *)(param_2 + 2))) &&
          (*(long *)(piVar2 + 4) == *(long *)(param_2 + 4))) &&
         ((*(long *)(piVar2 + 6) == *(long *)(param_2 + 6) &&
          (*(long *)(piVar2 + 8) == *(long *)(param_2 + 8))))) {
        return *param_1 + uVar3 * 0x30;
      }
      uVar3 = uVar3 + 1 & lVar4 - 1U;
    } while ((*(ulong *)(param_1[3] + (uVar3 >> 6) * 8) >> (uVar3 & 0x3f) & 1) != 0);
  }
  return 0;
}

