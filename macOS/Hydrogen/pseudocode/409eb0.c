
void FUN_00409eb0(ulong *param_1,undefined8 param_2,undefined8 param_3,ulong param_4,ulong param_5,
                 ulong param_6,ulong param_7)

{
  ulong uVar1;
  undefined2 in_w8;
  uint in_w9;
  uint in_w10;
  undefined4 in_w11;
  ulong in_x12;
  ulong in_x13;
  ulong in_x14;
  ulong in_x15;
  ulong in_x16;
  ulong in_x17;
  long unaff_x20;
  ulong unaff_x21;
  
  uVar1 = (ulong)in_w9 * (ulong)in_w10 * 4;
  if (unaff_x21 < uVar1) {
    param_1[1] = 0x13;
    param_1[2] = param_6;
  }
  else {
    if (uVar1 <= unaff_x21 + (ulong)in_w9 * (ulong)in_w10 * -4) {
      *param_1 = unaff_x20 << 0x38 | (param_7 & 0xff) << 0x20 | (param_5 & 0xff) << 0x18 |
                 (param_4 & 0xff) << 0x10 | (in_x17 & 0xff) << 8 | in_x16 & 0xff;
      param_1[1] = in_x12;
      param_1[2] = in_x14;
      param_1[3] = in_x13;
      param_1[4] = in_x15;
      param_1[5] = param_6;
      param_1[6] = uVar1;
      param_1[7] = param_6 + uVar1;
      param_1[8] = uVar1;
      *(uint *)(param_1 + 9) = in_w9;
      *(uint *)((long)param_1 + 0x4c) = in_w10;
      *(undefined4 *)(param_1 + 10) = in_w11;
      *(undefined2 *)((long)param_1 + 0x54) = in_w8;
      return;
    }
    param_1[1] = 0x13;
    param_1[2] = param_6 + uVar1;
  }
  *(undefined1 *)param_1 = 10;
  return;
}

