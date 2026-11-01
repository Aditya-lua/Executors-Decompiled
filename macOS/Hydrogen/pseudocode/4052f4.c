
void FUN_004052f4(undefined8 *param_1)

{
  undefined8 in_x9;
  ulong in_x11;
  
  *param_1 = 10;
  param_1[1] = in_x11 & 0xffffffff00000000 |
               (ulong)((uint)in_x11 & 0xff | ((uint)(in_x11 >> 8) & 0xff) << 8 |
                      (int)(in_x11 >> 0x10) << 0x10);
  param_1[2] = in_x9;
  return;
}

