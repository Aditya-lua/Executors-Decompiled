
undefined8 _aws_lc_0_24_0_SHA256_get_state(uint *param_1,uint *param_2,undefined8 *param_3)

{
  uint uVar1;
  
  if ((param_1[8] & 0x1ff) == 0) {
    uVar1 = (*param_1 & 0xff00ff00) >> 8 | (*param_1 & 0xff00ff) << 8;
    *param_2 = uVar1 >> 0x10 | uVar1 << 0x10;
    uVar1 = (param_1[1] & 0xff00ff00) >> 8 | (param_1[1] & 0xff00ff) << 8;
    param_2[1] = uVar1 >> 0x10 | uVar1 << 0x10;
    uVar1 = (param_1[2] & 0xff00ff00) >> 8 | (param_1[2] & 0xff00ff) << 8;
    param_2[2] = uVar1 >> 0x10 | uVar1 << 0x10;
    uVar1 = (param_1[3] & 0xff00ff00) >> 8 | (param_1[3] & 0xff00ff) << 8;
    param_2[3] = uVar1 >> 0x10 | uVar1 << 0x10;
    uVar1 = (param_1[4] & 0xff00ff00) >> 8 | (param_1[4] & 0xff00ff) << 8;
    param_2[4] = uVar1 >> 0x10 | uVar1 << 0x10;
    uVar1 = (param_1[5] & 0xff00ff00) >> 8 | (param_1[5] & 0xff00ff) << 8;
    param_2[5] = uVar1 >> 0x10 | uVar1 << 0x10;
    uVar1 = (param_1[6] & 0xff00ff00) >> 8 | (param_1[6] & 0xff00ff) << 8;
    param_2[6] = uVar1 >> 0x10 | uVar1 << 0x10;
    uVar1 = (param_1[7] & 0xff00ff00) >> 8 | (param_1[7] & 0xff00ff) << 8;
    param_2[7] = uVar1 >> 0x10 | uVar1 << 0x10;
    *param_3 = *(undefined8 *)(param_1 + 8);
    return 1;
  }
  return 0;
}

