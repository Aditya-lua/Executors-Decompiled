
void FUN_00037118(long param_1)

{
  long unaff_x19;
  undefined8 *unaff_x20;
  
  if (param_1 != 0) {
    *(long *)(unaff_x19 + 0x28) = param_1;
    __ZdlPv();
    *unaff_x20 = 0;
    unaff_x20[1] = 0;
    unaff_x20[2] = 0;
  }
  *(undefined1 *)(unaff_x19 + 0x80) = 0;
  unaff_x20[1] = 0;
  *unaff_x20 = 0;
  unaff_x20[3] = 0;
  unaff_x20[2] = 0;
  *(undefined8 *)((long)unaff_x20 + 0x21) = 0;
  *(undefined8 *)((long)unaff_x20 + 0x19) = 0;
  *(undefined8 *)(unaff_x19 + 0x50) = 0;
  *(undefined8 *)(unaff_x19 + 0x58) = 0;
  *(undefined1 *)(unaff_x19 + 0x60) = 0;
  *(undefined8 *)(unaff_x19 + 0x68) = 0;
  *(undefined8 *)(unaff_x19 + 0x70) = 0;
  *(undefined1 *)(unaff_x19 + 0x78) = 0;
  *(undefined8 *)(unaff_x19 + 0x88) = 0;
  return;
}

