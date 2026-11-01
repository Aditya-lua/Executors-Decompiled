
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_00585aa4(undefined8 *param_1,long param_2)

{
  undefined8 uVar1;
  long in_x9;
  long lVar2;
  
  uVar1 = _UNK_007fc2d0;
  lVar2 = *(long *)(param_2 + 0x18);
  param_1[1] = _UNK_007fc2d8;
  *param_1 = uVar1;
  param_1[2] = (ulong)(lVar2 - in_x9) >> 3;
  return;
}

