
undefined8 FUN_00700920(long param_1)

{
  undefined1 in_CY;
  ulong in_x9;
  ulong in_x10;
  ulong in_x11;
  long unaff_x19;
  long unaff_x21;
  
  while (!(bool)in_CY) {
    in_x10 = in_x11 + 0x10;
    *(undefined4 *)(in_x11 + 0xc) = 0;
    in_x11 = in_x10;
    in_CY = in_x9 <= in_x10;
  }
  if (*(char *)(param_1 + 5) == '\0') {
    in_x10 = *(ulong *)(unaff_x21 + 0x10);
  }
  *(ulong *)(unaff_x19 + 8) = in_x10;
  *(undefined8 *)(unaff_x21 + 0x18) = *(undefined8 *)(param_1 + 0x10);
  return 0;
}

