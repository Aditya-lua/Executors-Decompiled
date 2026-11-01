
undefined8 FUN_006dda84(void)

{
  undefined8 unaff_x21;
  undefined1 unaff_w22;
  undefined8 unaff_x23;
  long unaff_x24;
  undefined4 uStack0000000000000000;
  
  if (*(char *)(unaff_x24 + 0x1f) < '\0') {
    __ZdlPv(*(undefined8 *)(unaff_x24 + 8));
  }
  *(undefined8 *)(unaff_x24 + 8) = unaff_x21;
  *(undefined8 *)(unaff_x24 + 0x10) = unaff_x23;
  *(undefined4 *)(unaff_x24 + 0x18) = uStack0000000000000000;
  *(int *)(unaff_x24 + 0x1b) = (int)((ulong)_uStack0000000000000000 >> 0x18);
  *(undefined1 *)(unaff_x24 + 0x1f) = unaff_w22;
  return 1;
}

