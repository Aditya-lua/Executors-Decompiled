
undefined8 FUN_006dd744(long param_1)

{
  ulong in_x9;
  ulong in_x10;
  long in_x11;
  long in_x12;
  long in_x13;
  long unaff_x19;
  long unaff_x20;
  undefined4 unaff_w21;
  
  while (in_x12 = in_x12 + 1, in_x13 != in_x11) {
    if (in_x13 == unaff_x19) goto code_r0x006dd764;
    in_x9 = in_x9 + in_x12 & in_x10;
    in_x13 = *(long *)(param_1 + in_x9 * 0x10);
  }
  *(long *)(param_1 + in_x9 * 0x10) = unaff_x19;
  *(long *)(unaff_x20 + 0x10) = *(long *)(unaff_x20 + 0x10) + 1;
code_r0x006dd764:
  *(undefined4 *)(param_1 + in_x9 * 0x10 + 8) = unaff_w21;
  return 0;
}

