/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a9f1ac
 */

undefined8 OSSL_PARAM_get_double(long param_1,double *param_2)

{
  ulong uVar1;
  int iVar2;
  ulong uVar3;
  double dVar4;
  
  if (param_1 == 0) {
    return 0;
  }
  if (param_2 == (double *)0x0) {
    return 0;
  }
  iVar2 = *(int *)(param_1 + 8);
  if (iVar2 == 1) {
    if (*(long *)(param_1 + 0x18) == 8) {
      uVar3 = **(ulong **)(param_1 + 0x10);
      uVar1 = -uVar3;
      if (-1 < (long)uVar3) {
        uVar1 = uVar3;
      }
      if (uVar1 >> 0x35 != 0) {
        return 0;
      }
      dVar4 = (double)(long)uVar3;
    }
    else {
      if (*(long *)(param_1 + 0x18) != 4) {
        return 0;
      }
      dVar4 = (double)(long)**(int **)(param_1 + 0x10);
    }
  }
  else {
    if (iVar2 != 2) {
      if (iVar2 != 3) {
        return 0;
      }
      if (*(long *)(param_1 + 0x18) == 8) {
        *param_2 = **(double **)(param_1 + 0x10);
        return 1;
      }
      return 0;
    }
    if (*(long *)(param_1 + 0x18) == 8) {
      if (**(ulong **)(param_1 + 0x10) >> 0x35 != 0) {
        return 0;
      }
      dVar4 = (double)**(ulong **)(param_1 + 0x10);
    }
    else {
      if (*(long *)(param_1 + 0x18) != 4) {
        return 0;
      }
      dVar4 = (double)NEON_ucvtf((ulong)**(uint **)(param_1 + 0x10));
    }
  }
  *param_2 = dVar4;
  return 1;
}

