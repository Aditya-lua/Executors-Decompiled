
void FUN_006df7f4(void)

{
  if ((bRam0000000000a27aa0 & 1) == 0) {
    bRam0000000000a27aa0 = 1;
    iRam0000000000a27a98 = iRam0000000000a33700 + 1;
    iRam0000000000a33700 = iRam0000000000a27a98;
  }
  return;
}

