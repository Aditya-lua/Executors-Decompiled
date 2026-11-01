
void FUN_00619d04(long param_1,undefined8 param_2,undefined8 param_3,uint *param_4,uint *param_5)

{
  uint uVar1;
  int iVar2;
  uint uVar3;
  int iVar4;
  uint uVar5;
  long in_x9;
  ulong in_x10;
  uint in_w11;
  uint in_w12;
  int in_w13;
  uint in_w14;
  uint in_w15;
  
  iVar2 = *(int *)(param_1 + (in_x10 & 0xffffffff) * 4);
  uVar3 = *(uint *)(param_1 + (ulong)(in_w11 & 0xffffff00 | in_w14 >> 8 & 0xff) * 4);
  iVar4 = *(int *)(param_1 + (ulong)(in_w15 & 0xffffff00 | in_w14 & 0xff) * 4);
  uVar1 = *(uint *)(in_x9 + 0x40);
  uVar5 = *(uint *)(in_x9 + 0x44) ^ in_w14;
  uVar5 = (uVar5 & 0xff00ff00) >> 8 | (uVar5 & 0xff00ff) << 8;
  uVar5 = uVar5 >> 0x10 | uVar5 << 0x10;
  if (param_4 != (uint *)0x0) {
    uVar5 = *param_4 ^ uVar5;
  }
  if (param_5 != (uint *)0x0) {
    *param_5 = uVar5;
  }
  uVar5 = uVar1 ^ in_w12 ^ (iVar2 + in_w13 ^ uVar3) + iVar4;
  uVar5 = (uVar5 & 0xff00ff00) >> 8 | (uVar5 & 0xff00ff) << 8;
  uVar5 = uVar5 >> 0x10 | uVar5 << 0x10;
  if (param_4 != (uint *)0x0) {
    uVar5 = param_4[1] ^ uVar5;
  }
  param_5[1] = uVar5;
  return;
}

