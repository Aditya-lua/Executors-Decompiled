
void FUN_005a7f00(undefined8 *param_1,long param_2,long param_3)

{
  undefined1 in_ZR;
  undefined1 in_CY;
  undefined8 in_x9;
  ulong in_x10;
  ulong in_x11;
  long lVar1;
  long in_x12;
  long in_x13;
  uint uVar2;
  ulong uVar3;
  
  while( true ) {
    uVar2 = (uint)!(bool)in_ZR;
    if (!(bool)in_CY) {
      uVar2 = 0xffffffff;
    }
    lVar1 = in_x12 + 1;
    in_x13 = in_x13 + -8;
    if (uVar2 == 1) goto LAB_005a7ef0;
    if ((uVar2 & 0xff) == 0) break;
    in_x11 = in_x12 - 1;
    do {
      if (param_3 == 0) goto LAB_005a7f40;
      param_2 = *(long *)(param_2 + in_x11 * 8 + 0xc0);
      param_3 = param_3 + -1;
      in_x11 = (ulong)*(ushort *)(param_2 + 0xba);
      in_x13 = in_x11 << 3;
      lVar1 = 1;
LAB_005a7ef0:
    } while (in_x13 == 0);
    uVar3 = **(ulong **)(param_2 + lVar1 * 8);
    in_CY = uVar3 <= in_x10;
    in_ZR = in_x10 == uVar3;
    in_x12 = lVar1;
  }
  in_x9 = 0;
  in_x11 = in_x12 - 1;
LAB_005a7f40:
  param_1[2] = param_3;
  param_1[3] = in_x11;
  *param_1 = in_x9;
  param_1[1] = param_2;
  return;
}

