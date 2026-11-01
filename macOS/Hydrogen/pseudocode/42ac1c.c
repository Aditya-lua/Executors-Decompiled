
ulong FUN_0042ac1c(void)

{
  int iVar1;
  uint *puVar2;
  ulong unaff_x19;
  
  do {
    puVar2 = (uint *)___error();
    if (*puVar2 != 4) {
      return unaff_x19 & 0xffffffff | (ulong)*puVar2 << 0x20;
    }
    iVar1 = _chmod();
  } while (iVar1 == -1);
  return 0;
}

