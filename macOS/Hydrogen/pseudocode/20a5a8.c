
void FUN_0020a5a8(long param_1,ulong param_2)

{
  long lVar1;
  long *plVar2;
  long lVar3;
  long lVar4;
  
  plVar2 = *(long **)(param_1 + 0x10);
  lVar3 = *(long *)(param_1 + 0x18);
  lVar4 = *(long *)(param_1 + 0x20);
  lVar1 = lVar4 + lVar3;
  if ((ulong)(*plVar2 - lVar1) < param_2) {
    func_0x0079b61c(plVar2,lVar1,param_2,8,0x40);
  }
  _memmove(plVar2[1] + (lVar3 + param_2) * 0x40,plVar2[1] + lVar3 * 0x40,lVar4 << 6);
  *(ulong *)(param_1 + 0x18) = lVar3 + param_2;
  return;
}

