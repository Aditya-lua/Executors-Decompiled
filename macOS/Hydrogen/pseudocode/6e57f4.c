
long FUN_006e57f4(long param_1)

{
  long lVar1;
  long *plVar2;
  
  if (*(ulong *)(*(long *)(param_1 + 0x18) + 0x40) <= *(ulong *)(*(long *)(param_1 + 0x18) + 0x48))
  {
    func_0x006efe90(param_1,1);
  }
  if ((*(byte *)(param_1 + 1) >> 2 & 1) != 0) {
    func_0x006f0ed4(param_1,param_1,param_1 + 0x68);
  }
  lVar1 = func_0x006ea0a0(param_1);
  plVar2 = *(long **)(param_1 + 8);
  *plVar2 = lVar1;
  *(undefined4 *)((long)plVar2 + 0xc) = 10;
  *(long *)(param_1 + 8) = *(long *)(param_1 + 8) + 0x10;
  return lVar1 + 8;
}

