
bool FUN_00770af0(void)

{
  ulong uVar1;
  uint in_w8;
  long lVar2;
  long lVar3;
  int in_w12;
  long unaff_x19;
  long unaff_x20;
  long unaff_x22;
  long unaff_x23;
  long *unaff_x24;
  
  if (in_w12 < 5) {
    in_w8 = 0;
  }
  uVar1 = func_0x00782dc4();
  if (uVar1 < 2) {
    uVar1 = 1;
  }
  lVar3 = *unaff_x24 - *(long *)(unaff_x23 + (ulong)in_w8 * 8 + 0x118);
  if (lVar3 < 0x418938) {
    lVar2 = 0;
    if (uVar1 != 0) {
      lVar2 = (lVar3 * 1000) / (long)uVar1;
    }
  }
  else {
    lVar2 = (long)((double)lVar3 / ((double)(long)uVar1 / 1000.0));
  }
  *(long *)(unaff_x20 + 0xaa8) = lVar2;
  return unaff_x22 != unaff_x19;
}

