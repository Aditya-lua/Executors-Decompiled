
undefined8 FUN_00535a28(uint *param_1)

{
  int in_w8;
  uint in_w10;
  
  if (in_w8 < -0x40) {
    *param_1 = *param_1 | (in_w10 & 0x3f) << 0xc;
    *(undefined1 *)(param_1 + 1) = 2;
    return 0;
  }
  *param_1 = 0;
  *(undefined1 *)(param_1 + 1) = 0;
  return 1;
}

