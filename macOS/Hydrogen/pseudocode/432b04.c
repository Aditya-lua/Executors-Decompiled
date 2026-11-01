
ulong FUN_00432b04(void)

{
  int iVar1;
  uint *unaff_x20;
  ulong uVar2;
  
  iVar1 = _unlinkat();
  if (iVar1 == -1) {
    uVar2 = (ulong)*unaff_x20 << 0x20 | 2;
  }
  else {
    uVar2 = 0;
  }
  return uVar2;
}

