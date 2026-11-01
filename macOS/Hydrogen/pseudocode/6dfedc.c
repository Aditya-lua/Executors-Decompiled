
void FUN_006dfedc(void)

{
  if ((bRam0000000000a27cc0 & 1) == 0) {
    bRam0000000000a27cc0 = 1;
    iRam0000000000a27cb8 = iRam0000000000a33700 + 1;
    iRam0000000000a33700 = iRam0000000000a27cb8;
  }
  return;
}

