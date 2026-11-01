
undefined8 FUN_006f5960(void)

{
  int iVar1;
  int iVar2;
  int iVar3;
  int iVar4;
  long lVar5;
  int unaff_w20;
  int unaff_w21;
  int unaff_w22;
  long unaff_x23;
  long unaff_x24;
  long unaff_x25;
  int unaff_w26;
  
  func_0x006e3e04();
  iVar4 = func_0x006e21f8();
  if (iVar4 != 0) {
    func_0x006e2c48();
  }
  func_0x006e1d54();
  iVar4 = (int)((ulong)((long)unaff_w26 * -0x2aaaaaab) >> 0x20);
  iVar4 = (iVar4 >> 1) - (iVar4 >> 0x1f);
  if (unaff_w26 % 0xc < 2) {
    iVar4 = iVar4 + 1;
  }
  iVar1 = (unaff_w22 - iVar4) + 0x12c0;
  iVar2 = (unaff_w22 - iVar4) + 0x12c3;
  if (-1 < iVar1) {
    iVar2 = iVar1;
  }
  iVar3 = (int)((ulong)((long)iVar1 * -0x51eb851f) >> 0x20);
  iVar4 = ((unaff_w21 + iVar4 * 0xc) * 0x99 + -0x1c9) / 5 + unaff_w20 + iVar1 * 0x16d + (iVar2 >> 2)
          + ((iVar3 >> 5) - (iVar3 >> 0x1f)) + iVar1 / 400;
  lVar5 = unaff_x24 + unaff_x23 + unaff_x25 + (ulong)(iVar4 - 0x7d2d) * 0x15180;
  if (iVar4 < 0x25bab9 || lVar5 < 0x3118a41200) {
    func_0x006e383c();
  }
  else {
    func_0x006e3850((double)(lVar5 + -0x3118a41200));
  }
  return 1;
}

