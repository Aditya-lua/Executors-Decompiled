
void FUN_006dfe40(void)

{
  if ((bRam0000000000a27c90 & 1) == 0) {
    bRam0000000000a27c90 = 1;
    iRam0000000000a27c88 = iRam0000000000a33700 + 1;
    iRam0000000000a33700 = iRam0000000000a27c88;
  }
  return;
}

