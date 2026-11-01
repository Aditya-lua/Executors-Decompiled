
void FUN_00705468(void)

{
  if ((bRam0000000000a27c80 & 1) == 0) {
    bRam0000000000a27c80 = 1;
    iRam0000000000a27c78 = iRam0000000000a33700 + 1;
    iRam0000000000a33700 = iRam0000000000a27c78;
  }
  return;
}

