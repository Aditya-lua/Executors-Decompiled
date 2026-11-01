
void FUN_006dfc04(void)

{
  if ((bRam0000000000a27be0 & 1) == 0) {
    bRam0000000000a27be0 = 1;
    iRam0000000000a27bd8 = iRam0000000000a33700 + 1;
    iRam0000000000a33700 = iRam0000000000a27bd8;
  }
  return;
}

