
void FUN_006dfd08(void)

{
  if ((bRam0000000000a27c30 & 1) == 0) {
    bRam0000000000a27c30 = 1;
    iRam0000000000a27c28 = iRam0000000000a33700 + 1;
    iRam0000000000a33700 = iRam0000000000a27c28;
  }
  return;
}

