
void FUN_00619d0c(long param_1,undefined8 param_2,undefined8 param_3,uint *param_4,uint *param_5)

{
  uint uVar1;
  uint uVar2;
  int iVar3;
  uint uVar4;
  long in_x9;
  int in_w10;
  ulong in_x11;
  uint in_w12;
  int in_w13;
  uint in_w14;
  uint in_w15;
  
  uVar2 = *(uint *)(param_1 + (in_x11 & 0xffffffff) * 4);
  iVar3 = *(int *)(param_1 + (ulong)(in_w15 & 0xffffff00 | in_w14 & 0xff) * 4);
  uVar1 = *(uint *)(in_x9 + 0x40);
  uVar4 = *(uint *)(in_x9 + 0x44) ^ in_w14;
  uVar4 = (uVar4 & 0xff00ff00) >> 8 | (uVar4 & 0xff00ff) << 8;
  uVar4 = uVar4 >> 0x10 | uVar4 << 0x10;
  if (param_4 != (uint *)0x0) {
    uVar4 = *param_4 ^ uVar4;
  }
  if (param_5 != (uint *)0x0) {
    *param_5 = uVar4;
  }
  uVar4 = uVar1 ^ in_w12 ^ (in_w10 + in_w13 ^ uVar2) + iVar3;
  uVar4 = (uVar4 & 0xff00ff00) >> 8 | (uVar4 & 0xff00ff) << 8;
  uVar4 = uVar4 >> 0x10 | uVar4 << 0x10;
  if (param_4 != (uint *)0x0) {
    uVar4 = param_4[1] ^ uVar4;
  }
  param_5[1] = uVar4;
  return;
}

