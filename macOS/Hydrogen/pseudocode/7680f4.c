
undefined8 FUN_007680f4(void)

{
  long unaff_x19;
  undefined8 *unaff_x20;
  
  (*(code *)*unaff_x20)(*(undefined8 *)(unaff_x19 + 0xf8));
  *(undefined8 *)(unaff_x19 + 0xf8) = 0;
  *(undefined8 *)(unaff_x19 + 0x100) = 0;
  *(byte *)(unaff_x19 + 0x271) = *(byte *)(unaff_x19 + 0x271) & 0xef;
  (*(code *)*unaff_x20)(*(undefined8 *)(unaff_x19 + 0x108));
  *(undefined8 *)(unaff_x19 + 0x108) = 0;
  *(undefined8 *)(unaff_x19 + 0x110) = 0;
  *(byte *)(unaff_x19 + 0x271) = *(byte *)(unaff_x19 + 0x271) & 0xdf;
  (*(code *)*unaff_x20)(*(undefined8 *)(unaff_x19 + 0x118));
  *(undefined8 *)(unaff_x19 + 0x118) = 0;
  *(undefined8 *)(unaff_x19 + 0x120) = 0;
  *(byte *)(unaff_x19 + 0x271) = *(byte *)(unaff_x19 + 0x271) & 0xbf;
  (*(code *)*unaff_x20)();
  return 0;
}

