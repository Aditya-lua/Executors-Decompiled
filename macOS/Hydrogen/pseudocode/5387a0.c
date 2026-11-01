
void FUN_005387a0(undefined8 *param_1,long param_2)

{
  uint uVar1;
  long in_x9;
  long in_x10;
  uint in_w11;
  uint in_w12;
  int in_w13;
  
  uVar1 = in_w11 | in_w13 << 6;
  *(long *)(param_2 + 0x20) = (in_x10 - in_x9) + *(long *)(param_2 + 0x20);
  param_1[1] = 0;
  *(uint *)(param_1 + 2) = uVar1 & 0xffe00000 | uVar1 & 0x3ffff | (in_w12 & 7) << 0x12;
  *param_1 = 1;
  return;
}

