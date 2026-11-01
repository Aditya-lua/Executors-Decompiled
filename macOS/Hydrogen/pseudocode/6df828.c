
void FUN_006df828(void)

{
  if ((bRam0000000000a27ab0 & 1) == 0) {
    bRam0000000000a27ab0 = 1;
    iRam0000000000a27aa8 = iRam0000000000a33700 + 1;
    iRam0000000000a33700 = iRam0000000000a27aa8;
  }
  return;
}

