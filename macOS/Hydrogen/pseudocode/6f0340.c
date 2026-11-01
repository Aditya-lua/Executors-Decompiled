
ulong FUN_006f0340(void)

{
  bool in_ZR;
  long lVar1;
  byte in_w8;
  long unaff_x20;
  ulong unaff_x21;
  ulong unaff_x22;
  
  if (!in_ZR && unaff_x22 != 0) {
    do {
      lVar1 = func_0x006f10b0();
      unaff_x21 = lVar1 + unaff_x21;
      in_w8 = *(long *)(unaff_x20 + 0x28) != 0;
    } while ((bool)in_w8 && unaff_x21 < unaff_x22);
  }
  if ((in_w8 & 1) == 0) {
    *(long *)(&UNK_00001bc8 + unaff_x20) =
         *(long *)(&UNK_00001bb8 + unaff_x20) + *(long *)(&UNK_00001bc0 + unaff_x20);
    *(undefined8 *)(unaff_x20 + 0x28) = *(undefined8 *)(unaff_x20 + 0x30);
    *(undefined8 *)(unaff_x20 + 0x30) = 0;
    *(undefined1 *)(unaff_x20 + 0x21) = 2;
  }
  return unaff_x21;
}

