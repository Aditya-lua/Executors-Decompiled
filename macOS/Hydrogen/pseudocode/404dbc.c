
void FUN_00404dbc(void)

{
  undefined8 in_x9;
  ulong in_x11;
  undefined8 *unaff_x19;
  
  *unaff_x19 = 6;
  unaff_x19[1] = in_x11 & 0xffffffff00000000 |
                 (ulong)((uint)in_x11 & 0xff | ((uint)(in_x11 >> 8) & 0xff) << 8 |
                        (int)(in_x11 >> 0x10) << 0x10);
  unaff_x19[2] = in_x9;
  return;
}

