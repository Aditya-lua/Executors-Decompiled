
undefined8 FUN_005c89c0(long param_1,undefined8 param_2)

{
  undefined1 in_ZR;
  undefined1 in_CY;
  long in_x9;
  ulong in_x10;
  ulong in_x11;
  undefined8 *in_x12;
  ulong in_x13;
  long in_x14;
  uint uVar1;
  
  while( true ) {
    uVar1 = (uint)!(bool)in_ZR;
    if (!(bool)in_CY) {
      uVar1 = 0xffffffff;
    }
    in_x12 = in_x12 + 1;
    in_x14 = in_x14 + -8;
    in_x11 = in_x11 + 1;
    if (uVar1 == 1) goto code_r0x005c89b0;
    if ((uVar1 & 0xff) == 0) break;
    while( true ) {
      if (in_x9 == 0) {
        return param_2;
      }
      param_1 = *(long *)(param_1 + in_x11 * 8 + 0xc0);
      in_x9 = in_x9 + -1;
      in_x13 = (ulong)*(ushort *)(param_1 + 0xba);
      in_x12 = (undefined8 *)(param_1 + 0x58);
      in_x14 = in_x13 << 3;
      in_x11 = 0xffffffffffffffff;
code_r0x005c89b0:
      if (in_x14 != 0) break;
      in_x11 = in_x13;
    }
    in_CY = *(ulong *)in_x12[-10] <= in_x10;
    in_ZR = in_x10 == *(ulong *)in_x12[-10];
  }
  return *in_x12;
}

