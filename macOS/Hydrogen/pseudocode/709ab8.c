
void FUN_00709ab8(void)

{
  if ((bRam0000000000a27b00 & 1) == 0) {
    bRam0000000000a27b00 = 1;
    iRam0000000000a27af8 = iRam0000000000a33700 + 1;
    iRam0000000000a33700 = iRam0000000000a27af8;
  }
  return;
}

