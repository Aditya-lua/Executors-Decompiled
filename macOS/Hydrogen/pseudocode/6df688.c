
void FUN_006df688(void)

{
  if ((bRam0000000000a27a30 & 1) == 0) {
    bRam0000000000a27a30 = 1;
    iRam0000000000a27a28 = iRam0000000000a33700 + 1;
    iRam0000000000a33700 = iRam0000000000a27a28;
  }
  return;
}

