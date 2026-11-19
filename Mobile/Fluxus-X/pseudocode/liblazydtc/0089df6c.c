/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0089df6c
 */

void FUN_0089df6c(undefined4 *param_1,int param_2,int *param_3)

{
  int iVar1;
  undefined1 uVar2;
  uint uVar3;
  double dVar4;
  
  if (param_2 == 2) {
    if (*param_3 != 6) {
      return;
    }
    uVar3 = param_3[1];
    *param_1 = 3;
    dVar4 = (double)NEON_ucvtf((ulong)uVar3);
  }
  else {
    if (param_2 != 1) {
      if (param_2 != 0) {
        return;
      }
      if (*param_3 == 0) {
        return;
      }
      *param_1 = 2;
      uVar2 = 1;
      if (*param_3 != 1) {
        if (*param_3 == 2) {
          *(bool *)(param_1 + 2) = (char)param_3[2] == '\0';
          return;
        }
        uVar2 = 0;
      }
      *(undefined1 *)(param_1 + 2) = uVar2;
      return;
    }
    iVar1 = *param_3;
    if (iVar1 == 5) {
      *param_1 = 5;
      *(double *)(param_1 + 2) = -*(double *)(param_3 + 2);
      *(double *)(param_1 + 4) = -*(double *)(param_3 + 4);
      *(double *)(param_1 + 6) = -*(double *)(param_3 + 6);
      *(double *)(param_1 + 8) = -*(double *)(param_3 + 8);
      return;
    }
    if (iVar1 == 4) {
      *param_1 = 4;
      param_1[2] = -(float)param_3[2];
      param_1[3] = -(float)param_3[3];
      param_1[4] = -(float)param_3[4];
      param_1[5] = -(float)param_3[5];
      return;
    }
    if (iVar1 != 3) {
      return;
    }
    *param_1 = 3;
    dVar4 = -*(double *)(param_3 + 2);
  }
  *(double *)(param_1 + 2) = dVar4;
  return;
}

