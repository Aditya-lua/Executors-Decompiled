
void FUN_004063ac(ulong param_1,undefined8 *param_2,undefined8 *param_3,undefined8 param_4,
                 long param_5)

{
  undefined2 uVar1;
  undefined8 in_x10;
  undefined8 in_x11;
  uint in_w12;
  int in_w13;
  
  *param_3 = in_x11;
  param_3[1] = in_x10;
  uVar1 = *(undefined2 *)(param_5 + 8);
  *param_2 = 1;
  param_2[1] = param_1 & 0xffffffff00000000 |
               (ulong)((uint)param_1 & 0xff | (in_w12 & 0xff) << 8 | in_w13 << 0x10);
  param_2[2] = 0x10;
  *(undefined2 *)(param_2 + 3) = uVar1;
  return;
}

