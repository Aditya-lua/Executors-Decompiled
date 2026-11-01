
void FUN_0073b88c(ulong param_1,long param_2,undefined8 param_3,long param_4)

{
  uint uVar1;
  
  *(undefined4 *)(param_2 + 8) = 0;
  *(undefined8 *)(param_2 + 0x10) = 0;
  *(undefined2 *)(param_2 + 0x18) = 0;
  *(undefined2 *)(param_2 + 0x1a) = *(undefined2 *)(param_4 + 0x38);
  *(undefined2 *)(param_2 + 0x1c) = 0;
  *(byte *)(param_2 + 0x1e) = *(byte *)(param_2 + 0x1e) & 0xf8 | 1;
  if (param_1 != 1) {
    uVar1 = 0;
    if ((param_1 & 1) != 0) {
      uVar1 = 3;
    }
    uVar1 = uVar1 | ((uint)(param_1 >> 1) & 1) << 3 | ((uint)(param_1 >> 3) & 1) << 6;
    if ((param_1 & 0x40) != 0) {
      uVar1 = uVar1 | 0x180;
    }
    uVar1 = uVar1 & 0xffffffe0 | uVar1 & 0x1f | ((uint)(param_1 >> 2) & 1) << 4;
    if (uVar1 != 0) {
      *(short *)(param_2 + 0x1a) = (short)uVar1;
    }
  }
  return;
}

