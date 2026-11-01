
undefined8 FUN_00740498(void)

{
  int iVar1;
  bool in_ZR;
  long in_x5;
  long lVar2;
  long unaff_x19;
  int unaff_w20;
  
  if (!in_ZR) {
    return 6;
  }
  iVar1 = *(int *)(in_x5 + 0x260);
  if (iVar1 < 0x18) {
    lVar2 = in_x5 + (long)iVar1 * 0x14;
    *(undefined4 *)(lVar2 + 0x80) = 1;
    *(undefined4 *)(lVar2 + 0x84) = *(undefined4 *)(unaff_x19 + unaff_w20);
    *(int *)(in_x5 + 0x260) = iVar1 + 1;
    return 0;
  }
  return 0;
}

