
void FUN_006dfca0(void)

{
  if ((bRam0000000000a27c10 & 1) == 0) {
    bRam0000000000a27c10 = 1;
    iRam0000000000a27c08 = iRam0000000000a33700 + 1;
    iRam0000000000a33700 = iRam0000000000a27c08;
  }
  return;
}

