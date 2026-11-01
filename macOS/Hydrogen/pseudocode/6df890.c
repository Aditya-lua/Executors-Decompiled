
void FUN_006df890(void)

{
  if ((bRam0000000000a27ad0 & 1) == 0) {
    bRam0000000000a27ad0 = 1;
    iRam0000000000a27ac8 = iRam0000000000a33700 + 1;
    iRam0000000000a33700 = iRam0000000000a27ac8;
  }
  return;
}

