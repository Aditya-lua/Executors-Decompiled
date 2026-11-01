
int FUN_00677070(void)

{
  int iVar1;
  int in_w8;
  ulong in_x9;
  int in_w10;
  int in_w11;
  ulong in_x12;
  
  while( true ) {
    iVar1 = (int)in_x12;
    if (in_x9 >> (in_x12 & 0x3f) != 0) {
      iVar1 = in_w10;
      in_w11 = (int)in_x12;
    }
    if ((uint)(iVar1 - in_w11) < 2) break;
    in_x12 = (ulong)((uint)(in_w11 + iVar1) >> 1);
    in_w10 = iVar1;
  }
  return iVar1 - in_w8;
}

