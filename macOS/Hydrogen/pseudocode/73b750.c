
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined2 FUN_0073b750(long param_1)

{
  char cVar1;
  undefined2 uVar2;
  
  cVar1 = *(char *)(param_1 + 0xd);
  uVar2 = 0;
  if (((((byte)(cVar1 + 0xa5U) < 0xe6) && ((byte)(cVar1 - 0x3aU) < 0xf6)) &&
      (uVar2 = 0, cVar1 != '-')) && (cVar1 != '_')) {
    uVar2 = _UNK_00a1e238;
  }
  return uVar2;
}

