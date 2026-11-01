
void FUN_006dfd70(void)

{
  if ((bRam0000000000a27c50 & 1) == 0) {
    bRam0000000000a27c50 = 1;
    iRam0000000000a27c48 = iRam0000000000a33700 + 1;
    iRam0000000000a33700 = iRam0000000000a27c48;
  }
  return;
}

