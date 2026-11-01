
void FUN_0070c72c(undefined4 *param_1,long param_2)

{
  ulong in_x9;
  undefined8 in_x10;
  int in_w11;
  undefined4 in_register_0000405c;
  int in_w12;
  long in_x13;
  ulong in_x14;
  ulong in_x15;
  uint uVar1;
  ulong uVar2;
  
  uVar1 = (uint)in_x15;
  uVar2 = CONCAT44(in_register_0000405c,in_w11);
  if (uVar2 < in_x14) {
    do {
      uVar1 = (uint)in_x15;
      if (*(byte *)(in_x13 + uVar2) < 0xe &&
          (1 << (ulong)(*(byte *)(in_x13 + uVar2) & 0x1f) & 0x2401U) != 0) break;
      uVar1 = uVar1 + 1;
      in_x15 = (ulong)uVar1;
      *(uint *)(param_2 + 0x10) = uVar1;
      uVar2 = in_x15;
    } while (in_x15 < in_x14);
  }
  *param_1 = 0x11a;
  *(undefined8 *)(param_1 + 1) = in_x10;
  *(ulong *)(param_1 + 3) = in_x9 | (ulong)(uVar1 - in_w12) << 0x20;
  param_1[5] = uVar1 - in_w11;
  *(long *)(param_1 + 6) = in_x13 + CONCAT44(in_register_0000405c,in_w11);
  return;
}

