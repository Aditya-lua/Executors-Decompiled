
void FUN_006fc518(void)

{
  uint uVar1;
  long lVar2;
  int in_w8;
  long unaff_x19;
  long lVar3;
  
  if (in_w8 < 1) {
    *(undefined4 *)(unaff_x19 + 0xc) = 0;
  }
  lVar3 = *(long *)(unaff_x19 + 0x20);
  lVar2 = __dyld_get_image_header(0);
  if (lVar3 != lVar2 + 0x4e8dec0) {
    uVar1 = 1 << (ulong)(*(byte *)(unaff_x19 + 6) & 0x1f);
    *(uint *)(unaff_x19 + 0xc) = uVar1;
    if (*(byte *)(unaff_x19 + 6) != 0x1f) {
      lVar2 = 0;
      if ((int)uVar1 < 2) {
        uVar1 = 1;
      }
      do {
        lVar3 = *(long *)(unaff_x19 + 0x20) + lVar2;
        *(undefined4 *)(lVar3 + 0xc) = 0;
        *(undefined4 *)(lVar3 + 0x1c) = 0;
        lVar2 = lVar2 + 0x20;
      } while ((ulong)uVar1 * 0x20 != lVar2);
    }
  }
  *(undefined1 *)(unaff_x19 + 3) = 0xff;
  return;
}

