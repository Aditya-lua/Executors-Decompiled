
void FUN_006dfacc(void)

{
  if ((bRam0000000000a27b80 & 1) == 0) {
    bRam0000000000a27b80 = 1;
    iRam0000000000a27b78 = iRam0000000000a33700 + 1;
    iRam0000000000a33700 = iRam0000000000a27b78;
  }
  return;
}

