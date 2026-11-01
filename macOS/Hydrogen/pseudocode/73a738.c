
void FUN_0073a738(void)

{
  long lVar1;
  undefined1 uVar2;
  uint unaff_w19;
  undefined8 *unaff_x20;
  int unaff_w21;
  long unaff_x22;
  long unaff_x25;
  undefined4 unaff_w26;
  undefined8 uVar3;
  
  *(long *)(unaff_x22 + 0x18) = unaff_x22 + 0x30 + unaff_x25;
  *(long *)(unaff_x22 + 0x20) = unaff_x22 + 0x30;
  _memcpy();
  *(int *)(unaff_x22 + 4) = unaff_w21;
  *(undefined4 *)(unaff_x22 + 8) = unaff_w26;
  *(int *)(unaff_x22 + 0x10) = (int)unaff_x25;
  if (unaff_w21 == 0x1e) {
    lVar1 = *(long *)(unaff_x22 + 0x20);
    uVar3 = *unaff_x20;
    *(undefined8 *)(lVar1 + 0x10) = unaff_x20[1];
    *(undefined8 *)(lVar1 + 8) = uVar3;
    uVar2 = 0x1e;
  }
  else {
    if (unaff_w21 != 2) {
      return;
    }
    lVar1 = *(long *)(unaff_x22 + 0x20);
    *(undefined4 *)(lVar1 + 4) = *(undefined4 *)unaff_x20;
    uVar2 = 2;
  }
  *(undefined1 *)(lVar1 + 1) = uVar2;
  *(ushort *)(lVar1 + 2) = (ushort)(unaff_w19 >> 8) & 0xff | (ushort)((unaff_w19 & 0xff00ff) << 8);
  return;
}

