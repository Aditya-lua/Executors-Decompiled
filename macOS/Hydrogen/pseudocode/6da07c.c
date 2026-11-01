
undefined8 FUN_006da07c(long param_1)

{
  int in_w8;
  int in_w9;
  ulong uVar1;
  long in_x10;
  long in_x11;
  ulong in_x12;
  long in_x13;
  ulong in_x14;
  ulong in_x15;
  ulong uVar2;
  long lVar3;
  
  do {
    uVar2 = in_x15 & in_x14;
    lVar3 = *(long *)(in_x13 + uVar2 * 0x10);
    if (lVar3 == in_x10) {
      *(undefined8 *)(in_x13 + uVar2 * 0x10 + 8) = 0;
      break;
    }
    in_x12 = in_x12 + 1;
    in_x15 = in_x12 + uVar2;
  } while (lVar3 != in_x11 && in_x12 <= in_x14);
  lVar3 = 1;
  if (in_w8 != in_w9) {
    lVar3 = 2;
  }
  uVar2 = *(long *)(param_1 + 0x40) + lVar3;
  uVar1 = uVar2 & 0x8080808080808080;
  *(ulong *)(param_1 + 0x40) = uVar1 - (uVar1 >> 7) | uVar2 & 0x7f7f7f7f7f7f7f7f;
  *(undefined8 *)(param_1 + 0x48) = 0;
  return 1;
}

