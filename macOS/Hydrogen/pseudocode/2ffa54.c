
undefined8 FUN_002ffa54(undefined4 *param_1,long param_2,undefined8 param_3)

{
  uint uVar1;
  undefined4 in_w8;
  
  *param_1 = in_w8;
  uVar1 = (*(uint *)(param_2 + 4) & 0xff00ff00) >> 8 | (*(uint *)(param_2 + 4) & 0xff00ff) << 8;
  param_1[1] = uVar1 >> 0x10 | uVar1 << 0x10;
  uVar1 = (*(uint *)(param_2 + 8) & 0xff00ff00) >> 8 | (*(uint *)(param_2 + 8) & 0xff00ff) << 8;
  param_1[2] = uVar1 >> 0x10 | uVar1 << 0x10;
  uVar1 = (*(uint *)(param_2 + 0xc) & 0xff00ff00) >> 8 | (*(uint *)(param_2 + 0xc) & 0xff00ff) << 8;
  param_1[3] = uVar1 >> 0x10 | uVar1 << 0x10;
  uVar1 = (*(uint *)(param_2 + 0x10) & 0xff00ff00) >> 8 |
          (*(uint *)(param_2 + 0x10) & 0xff00ff) << 8;
  param_1[5] = (int)param_3;
  param_1[6] = (int)((ulong)param_3 >> 0x20);
  param_1[4] = uVar1 >> 0x10 | uVar1 << 0x10;
  return 1;
}

