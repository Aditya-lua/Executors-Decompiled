
void FUN_00514274(long param_1,ulong param_2)

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
    func_0x007a5594(plVar2,lVar1,param_2,8,0x18);
  }
  _memmove(plVar2[1] + (lVar3 + param_2) * 0x18,plVar2[1] + lVar3 * 0x18,lVar4 * 0x18);
  *(ulong *)(param_1 + 0x18) = lVar3 + param_2;
  return;
}

