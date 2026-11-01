
void FUN_006f0d68(long param_1,long param_2)

{
  byte in_w8;
  
  *(byte *)(param_2 + 1) = in_w8 & 0xf8 | *(byte *)(param_1 + 0x20) & 3;
  return;
}

