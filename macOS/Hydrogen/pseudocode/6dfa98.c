
void FUN_006dfa98(void)

{
  if ((bRam0000000000a27b70 & 1) == 0) {
    bRam0000000000a27b70 = 1;
    iRam0000000000a27b68 = iRam0000000000a33700 + 1;
    iRam0000000000a33700 = iRam0000000000a27b68;
  }
  return;
}

