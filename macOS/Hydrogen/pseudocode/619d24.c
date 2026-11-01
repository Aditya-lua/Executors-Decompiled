
void FUN_00619d24(undefined8 param_1,undefined8 param_2,uint *param_3,uint *param_4)

{
  uint in_w8;
  uint uVar1;
  int in_w10;
  uint in_w11;
  uint in_w12;
  int in_w13;
  uint in_w14;
  
  uVar1 = ((in_w8 ^ in_w14) & 0xff00ff00) >> 8 | ((in_w8 ^ in_w14) & 0xff00ff) << 8;
  uVar1 = uVar1 >> 0x10 | uVar1 << 0x10;
  if (param_3 != (uint *)0x0) {
    uVar1 = *param_3 ^ uVar1;
  }
  if (param_4 != (uint *)0x0) {
    *param_4 = uVar1;
  }
  uVar1 = in_w11 ^ in_w12 ^ in_w10 + in_w13;
  uVar1 = (uVar1 & 0xff00ff00) >> 8 | (uVar1 & 0xff00ff) << 8;
  uVar1 = uVar1 >> 0x10 | uVar1 << 0x10;
  if (param_3 != (uint *)0x0) {
    uVar1 = param_3[1] ^ uVar1;
  }
  param_4[1] = uVar1;
  return;
}

