
void FUN_001b7b14(long param_1,long *param_2)

{
  undefined8 uVar1;
  ulong uVar2;
  long lVar3;
  
  uVar1 = *(undefined8 *)(param_1 + 0x10);
  uVar2 = *(ulong *)(param_1 + 0x18);
  lVar3 = param_2[2];
  if ((ulong)(*param_2 - lVar3) < uVar2) {
    func_0x0079b61c(param_2,lVar3,uVar2,1,1);
    lVar3 = param_2[2];
  }
  _memcpy(param_2[1] + lVar3,uVar1,uVar2);
  param_2[2] = lVar3 + uVar2;
  return;
}

