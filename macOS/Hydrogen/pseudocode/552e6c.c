
void FUN_00552e6c(long *param_1,long param_2,long param_3)

{
  ulong uVar1;
  long lVar2;
  
  uVar1 = param_3 - param_2;
  lVar2 = param_1[2];
  if ((ulong)(*param_1 - lVar2) < uVar1) {
    func_0x007abb04(param_1,lVar2,uVar1,1,1);
    lVar2 = param_1[2];
  }
  _memcpy(param_1[1] + lVar2,param_2,uVar1);
  param_1[2] = lVar2 + uVar1;
  return;
}

