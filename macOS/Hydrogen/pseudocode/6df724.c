
void FUN_006df724(void)

{
  if ((bRam0000000000a27a60 & 1) == 0) {
    bRam0000000000a27a60 = 1;
    iRam0000000000a27a58 = iRam0000000000a33700 + 1;
    iRam0000000000a33700 = iRam0000000000a27a58;
  }
  return;
}

