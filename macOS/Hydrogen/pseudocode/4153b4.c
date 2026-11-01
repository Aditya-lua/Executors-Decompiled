
void FUN_004153b4(long *param_1,long param_2)

{
  long lVar1;
  
  lVar1 = ((ulong)(*(long *)(param_2 + 0x18) - *(long *)(param_2 + 8)) >> 3) * -0x5555555555555555;
  *param_1 = lVar1;
  param_1[1] = 1;
  param_1[2] = lVar1;
  return;
}

