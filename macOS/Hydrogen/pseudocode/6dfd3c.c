
void FUN_006dfd3c(void)

{
  if ((bRam0000000000a27c40 & 1) == 0) {
    bRam0000000000a27c40 = 1;
    iRam0000000000a27c38 = iRam0000000000a33700 + 1;
    iRam0000000000a33700 = iRam0000000000a27c38;
  }
  return;
}

