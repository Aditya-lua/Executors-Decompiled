
void FUN_00538778(undefined8 *param_1,long param_2)

{
  uint uVar1;
  long in_x9;
  long in_x10;
  uint in_w11;
  uint uVar2;
  uint in_w12;
  int in_w13;
  
  *(long *)(param_2 + 0x10) = in_x10;
  uVar1 = *(byte *)(in_x9 + 2) & 0x3f;
  uVar2 = in_w13 << 6;
  if (in_w11 < 0xf0) {
    uVar2 = uVar1 | uVar2 | in_w12 << 0xc;
  }
  else {
    in_x10 = in_x9 + 4;
    *(long *)(param_2 + 0x10) = in_x10;
    uVar2 = (uVar2 & 0x3ff8000) << 6 |
            *(byte *)(in_x9 + 3) & 0x3f | (uVar1 | uVar2 & 0xfff) << 6 | (in_w12 & 7) << 0x12;
  }
  *(long *)(param_2 + 0x20) = (in_x10 - in_x9) + *(long *)(param_2 + 0x20);
  param_1[1] = 0;
  *(uint *)(param_1 + 2) = uVar2;
  *param_1 = 1;
  return;
}

