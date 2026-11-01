
void FUN_001d9614(long param_1,long *param_2,long param_3)

{
  ulong uVar1;
  long lVar2;
  
  uVar1 = *(ulong *)(param_3 + param_1);
  lVar2 = param_2[2];
  if ((ulong)(*param_2 - lVar2) < uVar1) {
    func_0x0079b61c(param_2,lVar2,uVar1,1,1);
    lVar2 = param_2[2];
  }
  _memcpy(param_2[1] + lVar2);
  param_2[2] = lVar2 + uVar1;
  return;
}

