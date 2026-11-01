
void FUN_006dfe74(void)

{
  if ((bRam0000000000a27ca0 & 1) == 0) {
    bRam0000000000a27ca0 = 1;
    iRam0000000000a27c98 = iRam0000000000a33700 + 1;
    iRam0000000000a33700 = iRam0000000000a27c98;
  }
  return;
}

