
void FUN_007050fc(long param_1)

{
  ulong in_x9;
  
  if ((in_x9 & 1) == 0) {
    *(undefined1 *)(param_1 + 0xb70) = 1;
    iRam0000000000a27b68 = iRam0000000000a33700 + 1;
    iRam0000000000a33700 = iRam0000000000a27b68;
  }
  return;
}

