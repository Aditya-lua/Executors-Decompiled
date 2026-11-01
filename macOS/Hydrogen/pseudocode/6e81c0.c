
ulong FUN_006e81c0(void)

{
  char cVar1;
  int iVar2;
  long unaff_x19;
  
  func_0x006e2154();
  func_0x006e1fd4();
  func_0x006e1fd4();
  *(uint *)(*(long *)(unaff_x19 + 0x20) + 0x24) = *(uint *)(*(long *)(unaff_x19 + 0x20) + 0x24) | 2;
  iVar2 = func_0x006eefcc();
  if (*(ulong *)(*(long *)(unaff_x19 + 0x20) + 0x10) < *(ulong *)(unaff_x19 + 8)) {
    *(ulong *)(*(long *)(unaff_x19 + 0x20) + 0x10) = *(ulong *)(unaff_x19 + 8);
  }
  if (cRam0000000000a336b8 == '\0') {
    if (iVar2 == 0) {
      if (*(char *)(unaff_x19 + 3) == '\x01') {
        return 0xffffffff;
      }
      if (*(char *)(unaff_x19 + 3) == '\x06') {
        return 0xffffffff;
      }
    }
  }
  else if ((iVar2 == 0) &&
          (((cVar1 = *(char *)(unaff_x19 + 3), cVar1 == '\x01' || (cVar1 == '\x06')) ||
           (cVar1 == '\x7f')))) {
    return 0xffffffff;
  }
  func_0x006e188c();
  func_0x006e3c24();
  func_0x006e1fd4();
  return (ulong)(*(long *)(unaff_x19 + 8) - *(long *)(unaff_x19 + 0x10)) >> 4;
}

