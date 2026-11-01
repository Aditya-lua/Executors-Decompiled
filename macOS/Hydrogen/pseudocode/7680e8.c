
undefined8 FUN_007680e8(void)

{
  long unaff_x19;
  
  _close();
  (*pcRam0000000000a2b5f0)(*(undefined8 *)(unaff_x19 + 0xf8));
  *(undefined8 *)(unaff_x19 + 0xf8) = 0;
  *(undefined8 *)(unaff_x19 + 0x100) = 0;
  *(byte *)(unaff_x19 + 0x271) = *(byte *)(unaff_x19 + 0x271) & 0xef;
  (*pcRam0000000000a2b5f0)(*(undefined8 *)(unaff_x19 + 0x108));
  *(undefined8 *)(unaff_x19 + 0x108) = 0;
  *(undefined8 *)(unaff_x19 + 0x110) = 0;
  *(byte *)(unaff_x19 + 0x271) = *(byte *)(unaff_x19 + 0x271) & 0xdf;
  (*pcRam0000000000a2b5f0)(*(undefined8 *)(unaff_x19 + 0x118));
  *(undefined8 *)(unaff_x19 + 0x118) = 0;
  *(undefined8 *)(unaff_x19 + 0x120) = 0;
  *(byte *)(unaff_x19 + 0x271) = *(byte *)(unaff_x19 + 0x271) & 0xbf;
  (*pcRam0000000000a2b5f0)();
  return 0;
}

