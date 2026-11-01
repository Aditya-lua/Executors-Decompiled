
void FUN_006df960(void)

{
  if ((bRam0000000000a27b10 & 1) == 0) {
    bRam0000000000a27b10 = 1;
    iRam0000000000a27b08 = iRam0000000000a33700 + 1;
    iRam0000000000a33700 = iRam0000000000a27b08;
  }
  return;
}

