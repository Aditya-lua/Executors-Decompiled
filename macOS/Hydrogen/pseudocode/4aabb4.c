
void FUN_004aabb4(ulong *param_1,long *param_2)

{
  ulong uVar1;
  long lVar2;
  
  lVar2 = param_2[2];
  if (*param_2 != 0) {
    uVar1 = (ulong)(param_2[1] - *param_2) >> 3;
    if (lVar2 != 0) {
      uVar1 = uVar1 + ((ulong)(param_2[3] - lVar2) >> 3);
    }
    *param_1 = uVar1;
    param_1[1] = 1;
    param_1[2] = uVar1;
    return;
  }
  if (lVar2 == 0) {
    *param_1 = 0;
    param_1[1] = 1;
    param_1[2] = 0;
    return;
  }
  uVar1 = (ulong)(param_2[3] - lVar2) >> 3;
  *param_1 = uVar1;
  param_1[1] = 1;
  param_1[2] = uVar1;
  return;
}

