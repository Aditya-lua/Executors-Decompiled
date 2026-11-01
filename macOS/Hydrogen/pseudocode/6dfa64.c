
void FUN_006dfa64(void)

{
  if ((bRam0000000000a27b60 & 1) == 0) {
    bRam0000000000a27b60 = 1;
    iRam0000000000a27b58 = iRam0000000000a33700 + 1;
    iRam0000000000a33700 = iRam0000000000a27b58;
  }
  return;
}

