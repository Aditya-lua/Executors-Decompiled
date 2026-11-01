
void FUN_006df85c(void)

{
  if ((bRam0000000000a27ac0 & 1) == 0) {
    bRam0000000000a27ac0 = 1;
    iRam0000000000a27ab8 = iRam0000000000a33700 + 1;
    iRam0000000000a33700 = iRam0000000000a27ab8;
  }
  return;
}

