/* 7ff70c9e37c0 FUN_7ff70c9e37c0 */

int * FUN_7ff70c9e37c0(int *param_1,ulonglong param_2)

{
  int iVar1;
  int iVar2;
  
  if ((longlong)param_2 < 0 || param_1 == (int *)0x0) {
    return (int *)0x0;
  }
  if (param_2 != 0) {
    iVar2 = (int)(param_2 / 1000);
    iVar1 = 0x7fffffff;
    if (param_2 / 1000 < 0x7fffffff) {
      iVar1 = iVar2;
    }
    *param_1 = iVar1;
    param_1[1] = ((int)param_2 + iVar2 * -1000) * 1000;
    return param_1;
  }
  *param_1 = 0;
  param_1[1] = 0;
  return param_1;
}


