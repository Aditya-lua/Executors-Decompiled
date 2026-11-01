
void FUN_005c6ce0(undefined8 *param_1,undefined8 param_2,ulong param_3)

{
  long in_x9;
  long in_x10;
  ulong in_x11;
  long in_x12;
  long in_x13;
  uint uVar1;
  uint in_w14;
  ulong uVar2;
  
  while( true ) {
    if (in_w14 == 1) goto LAB_005c6cc0;
    in_x11 = in_x12 - 2;
    if (in_w14 == 0) break;
    do {
      if (in_x10 == 0) {
        param_1[2] = in_x9;
        param_1[3] = 0;
        param_1[4] = in_x11;
        *param_1 = param_2;
        param_1[1] = param_3;
        return;
      }
      in_x9 = *(long *)(in_x9 + in_x11 * 8 + 0x380);
      in_x10 = in_x10 + -1;
      in_x11 = (ulong)*(ushort *)(in_x9 + 0x37a);
      in_x13 = in_x11 << 3;
      in_x12 = 1;
LAB_005c6cc0:
    } while (in_x13 == 0);
    uVar2 = *(ulong *)(in_x9 + in_x12 * 8);
    uVar1 = (uint)(uVar2 < param_3);
    if (param_3 < uVar2) {
      uVar1 = 0xffffffff;
    }
    in_x12 = in_x12 + 1;
    in_x13 = in_x13 + -8;
    in_w14 = uVar1 & 0xff;
  }
  param_1[2] = in_x10;
  param_1[3] = in_x11;
  param_1[4] = param_2;
  *param_1 = 0;
  param_1[1] = in_x9;
  return;
}

