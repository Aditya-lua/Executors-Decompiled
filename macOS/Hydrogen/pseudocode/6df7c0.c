
void FUN_006df7c0(void)

{
  if ((bRam0000000000a27a90 & 1) == 0) {
    bRam0000000000a27a90 = 1;
    iRam0000000000a27a88 = iRam0000000000a33700 + 1;
    iRam0000000000a33700 = iRam0000000000a27a88;
  }
  return;
}

