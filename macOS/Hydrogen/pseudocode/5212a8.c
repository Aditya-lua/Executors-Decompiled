
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_005212a8(undefined8 *param_1,long *param_2)

{
  long lVar1;
  long lVar2;
  undefined8 uVar3;
  
  uVar3 = _UNK_007fc2d0;
  lVar1 = *param_2;
  lVar2 = param_2[1];
  param_1[1] = _UNK_007fc2d8;
  *param_1 = uVar3;
  param_1[2] = (ulong)(lVar2 - lVar1) >> 4;
  return;
}

