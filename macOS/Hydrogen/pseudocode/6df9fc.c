
void FUN_006df9fc(void)

{
  if ((bRam0000000000a27b40 & 1) == 0) {
    bRam0000000000a27b40 = 1;
    iRam0000000000a27b38 = iRam0000000000a33700 + 1;
    iRam0000000000a33700 = iRam0000000000a27b38;
  }
  return;
}

