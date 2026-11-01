
void FUN_006df78c(void)

{
  if ((bRam0000000000a27a80 & 1) == 0) {
    bRam0000000000a27a80 = 1;
    iRam0000000000a27a78 = iRam0000000000a33700 + 1;
    iRam0000000000a33700 = iRam0000000000a27a78;
  }
  return;
}

