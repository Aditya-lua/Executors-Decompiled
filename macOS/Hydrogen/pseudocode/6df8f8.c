
void FUN_006df8f8(void)

{
  if ((bRam0000000000a27af0 & 1) == 0) {
    bRam0000000000a27af0 = 1;
    iRam0000000000a27ae8 = iRam0000000000a33700 + 1;
    iRam0000000000a33700 = iRam0000000000a27ae8;
  }
  return;
}

