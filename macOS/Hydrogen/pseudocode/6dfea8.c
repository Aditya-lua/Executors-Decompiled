
void FUN_006dfea8(void)

{
  if ((bRam0000000000a27cb0 & 1) == 0) {
    bRam0000000000a27cb0 = 1;
    iRam0000000000a27ca8 = iRam0000000000a33700 + 1;
    iRam0000000000a33700 = iRam0000000000a27ca8;
  }
  return;
}

