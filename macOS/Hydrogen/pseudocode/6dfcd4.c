
void FUN_006dfcd4(void)

{
  if ((bRam0000000000a27c20 & 1) == 0) {
    bRam0000000000a27c20 = 1;
    iRam0000000000a27c18 = iRam0000000000a33700 + 1;
    iRam0000000000a33700 = iRam0000000000a27c18;
  }
  return;
}

