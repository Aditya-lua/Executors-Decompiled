
void FUN_006df654(void)

{
  if ((bRam0000000000a27a20 & 1) == 0) {
    bRam0000000000a27a20 = 1;
    iRam0000000000a27a18 = iRam0000000000a33700 + 1;
    iRam0000000000a33700 = iRam0000000000a27a18;
  }
  return;
}

