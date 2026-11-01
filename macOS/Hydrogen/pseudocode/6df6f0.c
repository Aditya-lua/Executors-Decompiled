
void FUN_006df6f0(void)

{
  if ((bRam0000000000a27a50 & 1) == 0) {
    bRam0000000000a27a50 = 1;
    iRam0000000000a27a48 = iRam0000000000a33700 + 1;
    iRam0000000000a33700 = iRam0000000000a27a48;
  }
  return;
}

