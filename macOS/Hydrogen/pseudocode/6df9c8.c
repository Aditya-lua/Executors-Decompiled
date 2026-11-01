
void FUN_006df9c8(void)

{
  if ((bRam0000000000a27b30 & 1) == 0) {
    bRam0000000000a27b30 = 1;
    iRam0000000000a27b28 = iRam0000000000a33700 + 1;
    iRam0000000000a33700 = iRam0000000000a27b28;
  }
  return;
}

