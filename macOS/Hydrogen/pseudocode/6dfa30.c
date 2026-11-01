
void FUN_006dfa30(void)

{
  if ((bRam0000000000a27b50 & 1) == 0) {
    bRam0000000000a27b50 = 1;
    iRam0000000000a27b48 = iRam0000000000a33700 + 1;
    iRam0000000000a33700 = iRam0000000000a27b48;
  }
  return;
}

