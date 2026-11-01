
void FUN_006dfb34(void)

{
  if ((bRam0000000000a27ba0 & 1) == 0) {
    bRam0000000000a27ba0 = 1;
    iRam0000000000a27b98 = iRam0000000000a33700 + 1;
    iRam0000000000a33700 = iRam0000000000a27b98;
  }
  return;
}

