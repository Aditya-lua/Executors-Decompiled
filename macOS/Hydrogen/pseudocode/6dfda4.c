
void FUN_006dfda4(void)

{
  if ((bRam0000000000a27c60 & 1) == 0) {
    bRam0000000000a27c60 = 1;
    iRam0000000000a27c58 = iRam0000000000a33700 + 1;
    iRam0000000000a33700 = iRam0000000000a27c58;
  }
  return;
}

