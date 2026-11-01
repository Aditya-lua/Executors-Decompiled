
undefined8 FUN_006f5a28(void)

{
  int iVar1;
  int in_w8;
  long lVar2;
  int in_w9;
  int in_w10;
  int in_w11;
  int in_w12;
  int in_w13;
  int unaff_w20;
  long unaff_x23;
  long unaff_x24;
  long unaff_x25;
  
  iVar1 = (int)((ulong)((long)in_w10 * (long)in_w13) >> 0x20);
  iVar1 = in_w8 + in_w9 + unaff_w20 + in_w10 * in_w12 + (in_w11 >> 2) +
          ((iVar1 >> 5) - (iVar1 >> 0x1f)) + in_w10 / 400;
  lVar2 = unaff_x24 + unaff_x23 + unaff_x25 + (ulong)(iVar1 - 0x7d2d) * 0x15180;
  if (iVar1 < 0x25bab9 || lVar2 < 0x3118a41200) {
    func_0x006e383c();
  }
  else {
    func_0x006e3850((double)(lVar2 + -0x3118a41200));
  }
  return 1;
}

