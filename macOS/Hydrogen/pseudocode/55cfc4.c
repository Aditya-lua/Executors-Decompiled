
void FUN_0055cfc4(void)

{
  short unaff_w19;
  undefined8 *unaff_x20;
  undefined8 unaff_x21;
  undefined8 *unaff_x22;
  long unaff_x23;
  long unaff_x24;
  long *unaff_x25;
  long unaff_x26;
  long unaff_x27;
  long unaff_x28;
  undefined8 uVar1;
  
  _memmove();
  uVar1 = *unaff_x22;
  unaff_x20[1] = unaff_x22[1];
  *unaff_x20 = uVar1;
  unaff_x20[2] = unaff_x22[2];
  _memmove(unaff_x28 + 0x110 + unaff_x23 * 8,unaff_x28 + 0x110 + unaff_x26 * 8,unaff_x24 << 3);
  *(undefined8 *)(unaff_x28 + unaff_x26 * 8 + 0x110) = unaff_x21;
  *(short *)(unaff_x28 + 0x16a) = unaff_w19 + 1;
  *unaff_x25 = unaff_x28;
  unaff_x25[1] = unaff_x27;
  unaff_x25[2] = unaff_x26;
  return;
}

