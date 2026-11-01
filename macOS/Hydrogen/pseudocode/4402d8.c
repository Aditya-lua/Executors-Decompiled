
void FUN_004402d8(undefined8 *param_1)

{
  ulong uVar1;
  ulong in_x9;
  ulong in_x10;
  byte in_w11;
  ulong in_x12;
  byte in_w13;
  int in_w15;
  
  if ((in_w15 == 0x2f) &&
     (uVar1 = (((in_x9 & 0xff) * 0x1000 + (in_x10 & 0xff) * 0x40 + (ulong)in_w11) * 0x1000 +
               (in_x12 & 0xff) * 0x40 + (ulong)in_w13) * 0x40 + 0x3f, uVar1 >> 0x20 == 0)) {
    *(undefined4 *)(param_1 + 1) = 1;
    *(int *)((long)param_1 + 0xc) = (int)uVar1;
    *param_1 = 0;
  }
  else {
    *param_1 = &UNK_00888682;
    param_1[1] = 0x28;
  }
  return;
}

