
void FUN_006fc2cc(void)

{
  long lVar1;
  bool in_CY;
  uint in_w8;
  int iVar2;
  long in_x9;
  long in_x10;
  long unaff_x19;
  
  if (in_CY) {
    do {
      lVar1 = 0;
      if (*(int *)(in_x10 + (long)((int)in_w8 >> 1) * 0x10 + 0xc) != 0) {
        lVar1 = (long)((ulong)in_w8 << 0x20) >> 0x21;
      }
      in_x10 = in_x10 + lVar1 * 0x10;
      in_w8 = in_w8 - ((int)in_w8 >> 1);
    } while (1 < in_w8);
  }
  iVar2 = (int)((ulong)(in_x10 - in_x9) >> 4);
  if (*(int *)(in_x10 + 0xc) != 0) {
    iVar2 = iVar2 + 1;
  }
  if (*(int *)(unaff_x19 + 0xc) < 1) {
    *(int *)(unaff_x19 + 0xc) = -iVar2;
    return;
  }
  return;
}

