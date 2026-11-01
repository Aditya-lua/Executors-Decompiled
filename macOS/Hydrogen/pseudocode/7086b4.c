
bool FUN_007086b4(void)

{
  int in_w8;
  
  if ((in_w8 == iRam0000000000a27a58 || in_w8 == iRam0000000000a27a68) ||
      in_w8 == iRam0000000000a27a78) {
    return true;
  }
  return in_w8 == iRam0000000000a27a88;
}

