
void FUN_007154bc(long param_1)

{
  undefined1 in_ZR;
  ulong in_x9;
  ulong in_x10;
  long in_x11;
  long in_x12;
  long in_x13;
  long unaff_x19;
  long unaff_x20;
  undefined8 unaff_x21;
  
  while (!(bool)in_ZR) {
    if (in_x13 == unaff_x20) goto code_r0x007154d4;
    in_x9 = in_x9 + in_x12 & in_x10;
    in_x13 = *(long *)(param_1 + in_x9 * 0x10);
    in_x12 = in_x12 + 1;
    in_ZR = in_x13 == in_x11;
  }
  *(long *)(param_1 + in_x9 * 0x10) = unaff_x20;
  *(long *)(unaff_x19 + 0x428) = *(long *)(unaff_x19 + 0x428) + 1;
code_r0x007154d4:
  *(undefined8 *)(param_1 + in_x9 * 0x10 + 8) = unaff_x21;
  return;
}

