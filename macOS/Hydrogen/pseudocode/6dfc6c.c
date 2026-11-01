
void FUN_006dfc6c(void)

{
  if ((bRam0000000000a27c00 & 1) == 0) {
    bRam0000000000a27c00 = 1;
    iRam0000000000a27bf8 = iRam0000000000a33700 + 1;
    iRam0000000000a33700 = iRam0000000000a27bf8;
  }
  return;
}

