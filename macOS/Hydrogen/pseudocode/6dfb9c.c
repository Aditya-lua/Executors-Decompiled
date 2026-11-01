
void FUN_006dfb9c(void)

{
  if ((bRam0000000000a27bc0 & 1) == 0) {
    bRam0000000000a27bc0 = 1;
    iRam0000000000a27bb8 = iRam0000000000a33700 + 1;
    iRam0000000000a33700 = iRam0000000000a27bb8;
  }
  return;
}

