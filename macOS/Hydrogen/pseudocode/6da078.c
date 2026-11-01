
undefined8 FUN_006da078(long param_1)

{
  long lVar1;
  int in_w8;
  int in_w9;
  ulong in_x10;
  ulong in_x11;
  ulong in_x12;
  long in_x13;
  ulong in_x14;
  ulong in_x15;
  ulong uVar2;
  ulong uVar3;
  
  uVar2 = in_x15 ^ in_x10 >> 9;
  do {
    uVar2 = uVar2 & in_x14;
    uVar3 = *(ulong *)(in_x13 + uVar2 * 0x10);
    if (uVar3 == in_x10) {
      *(undefined8 *)(in_x13 + uVar2 * 0x10 + 8) = 0;
      break;
    }
    in_x12 = in_x12 + 1;
    uVar2 = in_x12 + uVar2;
  } while (uVar3 != in_x11 && in_x12 <= in_x14);
  lVar1 = 1;
  if (in_w8 != in_w9) {
    lVar1 = 2;
  }
  uVar2 = *(long *)(param_1 + 0x40) + lVar1;
  uVar3 = uVar2 & 0x8080808080808080;
  *(ulong *)(param_1 + 0x40) = uVar3 - (uVar3 >> 7) | uVar2 & 0x7f7f7f7f7f7f7f7f;
  *(undefined8 *)(param_1 + 0x48) = 0;
  return 1;
}

