
void FUN_006df8c4(void)

{
  if ((bRam0000000000a27ae0 & 1) == 0) {
    bRam0000000000a27ae0 = 1;
    iRam0000000000a27ad8 = iRam0000000000a33700 + 1;
    iRam0000000000a33700 = iRam0000000000a27ad8;
  }
  return;
}

