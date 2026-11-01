
void FUN_006df6bc(void)

{
  if ((bRam0000000000a27a40 & 1) == 0) {
    bRam0000000000a27a40 = 1;
    iRam0000000000a27a38 = iRam0000000000a33700 + 1;
    iRam0000000000a33700 = iRam0000000000a27a38;
  }
  return;
}

