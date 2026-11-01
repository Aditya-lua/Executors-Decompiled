
void FUN_00432e58(undefined2 *param_1)

{
  undefined4 uVar1;
  undefined4 uVar2;
  undefined2 in_w9;
  undefined4 in_w10;
  long in_x11;
  long in_x12;
  undefined8 uVar3;
  
  uVar3 = *(undefined8 *)(in_x12 + 0xc);
  uVar1 = *(undefined4 *)(in_x12 + 0x14);
  uVar2 = *(undefined4 *)(in_x12 + 0x18);
  *param_1 = 1;
  *(int *)(param_1 + 1) = (int)(in_x11 << 0x10);
  param_1[3] = (short)((ulong)in_x11 >> 0x10);
  *(undefined8 *)(param_1 + 4) = uVar3;
  *(undefined4 *)(param_1 + 8) = uVar1;
  *(undefined4 *)(param_1 + 10) = in_w10;
  *(undefined4 *)(param_1 + 0xc) = uVar2;
  param_1[0xe] = in_w9;
  return;
}

