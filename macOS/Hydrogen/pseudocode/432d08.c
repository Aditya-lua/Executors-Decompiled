
ulong FUN_00432d08(void)

{
  uint uVar1;
  char cVar2;
  int iVar3;
  uint *puVar4;
  ulong uVar5;
  
  func_0x004037b4();
  iVar3 = _unlinkat();
  if (iVar3 == -1) {
    puVar4 = (uint *)___error();
    uVar1 = *puVar4;
    cVar2 = func_0x004307b8();
    uVar5 = 0;
    if (cVar2 != '\0') {
      uVar5 = (ulong)uVar1 << 0x20 | 2;
    }
  }
  else {
    uVar5 = 0;
  }
  return uVar5;
}

