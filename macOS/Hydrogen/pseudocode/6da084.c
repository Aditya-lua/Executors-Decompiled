
undefined8 FUN_006da084(long param_1)

{
  ulong uVar1;
  long lVar2;
  int in_w8;
  int in_w9;
  ulong uVar3;
  long in_x10;
  long in_x11;
  ulong in_x12;
  long in_x13;
  ulong in_x14;
  ulong in_x15;
  long in_x16;
  
  while (*(long *)(in_x13 + in_x16) != in_x10) {
    in_x12 = in_x12 + 1;
    if (*(long *)(in_x13 + in_x16) == in_x11 || in_x14 < in_x12) goto LAB_006da0b0;
    in_x15 = in_x12 + in_x15 & in_x14;
    in_x16 = in_x15 << 4;
  }
  *(undefined8 *)(in_x13 + in_x15 * 0x10 + 8) = 0;
LAB_006da0b0:
  lVar2 = 1;
  if (in_w8 != in_w9) {
    lVar2 = 2;
  }
  uVar1 = *(long *)(param_1 + 0x40) + lVar2;
  uVar3 = uVar1 & 0x8080808080808080;
  *(ulong *)(param_1 + 0x40) = uVar3 - (uVar3 >> 7) | uVar1 & 0x7f7f7f7f7f7f7f7f;
  *(undefined8 *)(param_1 + 0x48) = 0;
  return 1;
}

