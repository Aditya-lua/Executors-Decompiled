
void FUN_006df994(void)

{
  if ((bRam0000000000a27b20 & 1) == 0) {
    bRam0000000000a27b20 = 1;
    iRam0000000000a27b18 = iRam0000000000a33700 + 1;
    iRam0000000000a33700 = iRam0000000000a27b18;
  }
  return;
}

