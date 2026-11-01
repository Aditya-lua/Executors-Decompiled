
void FUN_006d58f4(long param_1)

{
  ulong in_x9;
  
  if ((in_x9 & 1) == 0) {
    *(undefined1 *)(param_1 + 0xb00) = 1;
    iRam0000000000a27af8 = iRam0000000000a33700 + 1;
    iRam0000000000a33700 = iRam0000000000a27af8;
  }
  return;
}

