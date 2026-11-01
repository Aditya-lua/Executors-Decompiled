
void FUN_006df758(void)

{
  if ((bRam0000000000a27a70 & 1) == 0) {
    bRam0000000000a27a70 = 1;
    iRam0000000000a27a68 = iRam0000000000a33700 + 1;
    iRam0000000000a33700 = iRam0000000000a27a68;
  }
  return;
}

