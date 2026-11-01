
ulong FUN_007335b8(void)

{
  int iVar1;
  long lVar2;
  undefined8 uVar3;
  byte in_w8;
  code *unaff_x19;
  long unaff_x21;
  code *unaff_x22;
  ulong uVar4;
  
  *(byte *)(unaff_x21 + 0x98) = in_w8 | 1;
  lVar2 = func_0x0074dc7c();
  if (lVar2 == 0) {
    uVar4 = 0;
  }
  else {
    lVar2 = func_0x00740a58();
    do {
      uVar4 = (ulong)(lVar2 != 0);
      if (lVar2 == 0) goto joined_r0x0073366c;
      uVar3 = func_0x00156654(lVar2);
      lVar2 = func_0x006f4058(lVar2);
      iVar1 = (*unaff_x22)(uVar3);
    } while (iVar1 == 0);
    uVar4 = 1;
  }
joined_r0x0073366c:
  if (unaff_x19 != (code *)0x0) {
    uVar4 = (*unaff_x19)(uVar4);
  }
  *(byte *)(unaff_x21 + 0x98) = *(byte *)(unaff_x21 + 0x98) & 0xfe;
  if ((*(long *)(unaff_x21 + 0x88) == 0) ||
     ((*(byte *)(*(long *)(unaff_x21 + 0x88) + 4) >> 5 & 1) == 0)) {
    return uVar4;
  }
  func_0x00779d40(*(undefined8 *)(unaff_x21 + 0x78),5);
  return uVar4;
}

