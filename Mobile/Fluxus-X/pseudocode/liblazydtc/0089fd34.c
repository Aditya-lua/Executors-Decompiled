/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0089fd34
 */

bool FUN_0089fd34(int *param_1,int *param_2)

{
  bool bVar1;
  int iVar2;
  
  iVar2 = *param_1;
  bVar1 = false;
  if (iVar2 < 4) {
    if (iVar2 == 1) {
      return *param_2 == 1;
    }
    if (iVar2 == 2) {
      return *param_2 == 2 && (char)param_1[2] == (char)param_2[2];
    }
    if (iVar2 == 3) {
      return *(double *)(param_1 + 2) == *(double *)(param_2 + 2) && *param_2 == 3;
    }
  }
  else {
    if (iVar2 < 6) {
      if (iVar2 == 4) {
        if ((((*param_2 == 4) && ((float)param_1[2] == (float)param_2[2])) &&
            ((float)param_1[3] == (float)param_2[3])) && ((float)param_1[4] == (float)param_2[4])) {
          return (float)param_1[5] == (float)param_2[5];
        }
      }
      else {
        if (iVar2 != 5) {
          return false;
        }
        if (((*param_2 == 5) && (*(double *)(param_1 + 2) == *(double *)(param_2 + 2))) &&
           ((*(double *)(param_1 + 4) == *(double *)(param_2 + 4) &&
            (*(double *)(param_1 + 6) == *(double *)(param_2 + 6))))) {
          return *(double *)(param_1 + 8) == *(double *)(param_2 + 8);
        }
      }
      return false;
    }
    if (iVar2 == 6) {
      if (*param_2 != 6) {
        return false;
      }
      if (param_1[1] != param_2[1]) {
        return false;
      }
      iVar2 = memcmp(*(void **)(param_1 + 2),*(void **)(param_2 + 2),(ulong)(uint)param_1[1]);
      bVar1 = iVar2 == 0;
    }
    else if (iVar2 == 7) {
      return *param_2 == 7 && *(long *)(param_1 + 2) == *(long *)(param_2 + 2);
    }
  }
  return bVar1;
}

