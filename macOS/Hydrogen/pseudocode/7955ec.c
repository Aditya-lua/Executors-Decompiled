
undefined8 FUN_007955ec(undefined8 *param_1,long param_2)

{
  long lVar1;
  ulong uVar2;
  long lVar3;
  ulong uVar4;
  int iVar5;
  
  param_1[4] = 0;
  param_1[1] = 0;
  *param_1 = 0;
  param_1[3] = 0;
  param_1[2] = 0;
  if ((param_2 == 0) || (*(long *)(param_2 + 0x20) == 0)) {
    iVar5 = 0;
  }
  else {
    uVar4 = 0;
    iVar5 = 0;
    lVar3 = param_2;
    do {
      uVar2 = _strlen(lVar3);
      if ((9 < uVar2) || (0x1f < iVar5 + (int)uVar2)) {
        return 2;
      }
      lVar1 = (long)iVar5 + 1;
      *(char *)((long)param_1 + (long)iVar5) = (char)uVar2;
      _memcpy((long)param_1 + lVar1,lVar3,uVar2);
      iVar5 = (int)lVar1 + (int)uVar2;
      uVar4 = uVar4 + 1;
      lVar3 = lVar3 + 10;
    } while (uVar4 < *(ulong *)(param_2 + 0x20));
  }
  *(int *)((long)param_1 + 0x24) = iVar5;
  return 0;
}

