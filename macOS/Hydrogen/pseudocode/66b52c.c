
void FUN_0066b52c(long param_1,long param_2,ulong param_3)

{
  long lVar1;
  long lVar2;
  ulong uVar3;
  ulong uVar4;
  
  if (param_3 != 0) {
    lVar1 = *(long *)(param_1 + 0x18) + *(long *)(param_1 + 0x10);
    lVar2 = 0;
    if ((ulong)(lVar1 - *(long *)(param_1 + 0x38)) <= *(ulong *)(param_1 + 0x30)) {
      lVar2 = *(long *)(param_1 + 0x10);
    }
    lVar2 = *(long *)(param_1 + 0x38) + (*(ulong *)(param_1 + 0x30) - lVar2);
    uVar4 = lVar1 - lVar2;
    uVar3 = uVar4;
    if (param_3 <= uVar4) {
      uVar3 = param_3;
    }
    _memcpy(lVar2,param_2,uVar3);
    if (uVar4 <= param_3 && param_3 - uVar4 != 0) {
      _memcpy(*(undefined8 *)(param_1 + 0x18),param_2 + uVar4,param_3 - uVar4);
    }
    *(ulong *)(param_1 + 0x30) = *(long *)(param_1 + 0x30) + param_3;
  }
  return;
}

