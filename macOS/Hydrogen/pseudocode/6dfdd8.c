
void FUN_006dfdd8(void)

{
  if ((bRam0000000000a27c70 & 1) == 0) {
    bRam0000000000a27c70 = 1;
    iRam0000000000a27c68 = iRam0000000000a33700 + 1;
    iRam0000000000a33700 = iRam0000000000a27c68;
  }
  return;
}

