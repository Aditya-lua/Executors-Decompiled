
void FUN_006d8e14(void)

{
  if ((bRam0000000000a27da0 & 1) == 0) {
    bRam0000000000a27da0 = 1;
    iRam0000000000a27d98 = iRam0000000000a33700 + 1;
    iRam0000000000a33700 = iRam0000000000a27d98;
  }
  return;
}

