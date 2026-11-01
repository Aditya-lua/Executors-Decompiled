
void FUN_006dfbd0(void)

{
  if ((bRam0000000000a27bd0 & 1) == 0) {
    bRam0000000000a27bd0 = 1;
    iRam0000000000a27bc8 = iRam0000000000a33700 + 1;
    iRam0000000000a33700 = iRam0000000000a27bc8;
  }
  return;
}

