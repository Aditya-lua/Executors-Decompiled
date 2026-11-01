
void FUN_006dfb00(void)

{
  if ((bRam0000000000a27b90 & 1) == 0) {
    bRam0000000000a27b90 = 1;
    iRam0000000000a27b88 = iRam0000000000a33700 + 1;
    iRam0000000000a33700 = iRam0000000000a27b88;
  }
  return;
}

