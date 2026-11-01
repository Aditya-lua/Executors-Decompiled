
bool _aws_lc_0_24_0_SHAKE_Init(undefined8 *param_1,ulong param_2)

{
  param_1[0x19] = param_2;
  *(undefined1 *)((long)param_1 + 0x189) = 0;
  if (param_2 < 0xa9) {
    param_1[0x15] = 0;
    param_1[0x14] = 0;
    param_1[0x17] = 0;
    param_1[0x16] = 0;
    param_1[0x11] = 0;
    param_1[0x10] = 0;
    param_1[0x13] = 0;
    param_1[0x12] = 0;
    param_1[0xd] = 0;
    param_1[0xc] = 0;
    param_1[0xf] = 0;
    param_1[0xe] = 0;
    param_1[9] = 0;
    param_1[8] = 0;
    param_1[0xb] = 0;
    param_1[10] = 0;
    param_1[5] = 0;
    param_1[4] = 0;
    param_1[7] = 0;
    param_1[6] = 0;
    param_1[1] = 0;
    *param_1 = 0;
    param_1[3] = 0;
    param_1[2] = 0;
    param_1[0x18] = 0;
    param_1[0x19] = param_2;
    *(undefined2 *)(param_1 + 0x31) = 0x1f;
    param_1[0x1a] = 0;
    param_1[0x1b] = 0;
  }
  return param_2 < 0xa9;
}

