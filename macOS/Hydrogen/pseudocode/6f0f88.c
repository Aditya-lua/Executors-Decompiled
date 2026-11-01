
long FUN_006f0f88(long param_1)

{
  long *plVar1;
  long lVar2;
  double dVar3;
  
  lVar2 = *(long *)(param_1 + 0x18);
  if (*(byte *)(lVar2 + 0x21) < 4) {
    dVar3 = (double)func_0x006f5d58();
    dVar3 = dVar3 - *(double *)(&UNK_00001a10 + lVar2);
    if (dVar3 < 0.001) {
      return -1;
    }
    plVar1 = (long *)(lVar2 + 0x48);
  }
  else {
    dVar3 = *(double *)(&UNK_00001a08 + lVar2) - *(double *)(&UNK_00001a10 + lVar2);
    if (dVar3 < 0.001) {
      return -1;
    }
    plVar1 = (long *)(&UNK_000019e8 + lVar2);
  }
  return (long)((double)(ulong)(*plVar1 - *(long *)(&UNK_000019f0 + lVar2)) / dVar3);
}

