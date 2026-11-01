
void FUN_00619ccc(long param_1,undefined8 param_2,undefined8 param_3,uint *param_4,uint *param_5)

{
  uint uVar1;
  int iVar2;
  int iVar3;
  uint uVar4;
  int iVar5;
  uint uVar6;
  long in_x9;
  uint in_w10;
  uint in_w11;
  uint in_w12;
  int in_w13;
  uint in_w14;
  int in_w15;
  uint in_w16;
  uint in_w17;
  
  uVar6 = in_w17 ^ in_w14 ^
          (in_w15 + in_w13 ^
          *(uint *)(param_1 + (ulong)(in_w16 & 0xffffff00 | in_w12 >> 8 & 0xff) * 4)) +
          *(int *)(param_1 + (ulong)(in_w12 & 0xff | 0x300) * 4);
  iVar2 = *(int *)(param_1 + (ulong)(uVar6 >> 0x18) * 4);
  iVar3 = *(int *)(param_1 + (ulong)(in_w10 & 0xffffff00 | uVar6 >> 0x10 & 0xff) * 4);
  uVar4 = *(uint *)(param_1 + (ulong)(in_w11 & 0xffffff00 | uVar6 >> 8 & 0xff) * 4);
  iVar5 = *(int *)(param_1 + (ulong)(uVar6 & 0xff | 0x300) * 4);
  uVar1 = *(uint *)(in_x9 + 0x40);
  uVar6 = *(uint *)(in_x9 + 0x44) ^ uVar6;
  uVar6 = (uVar6 & 0xff00ff00) >> 8 | (uVar6 & 0xff00ff) << 8;
  uVar6 = uVar6 >> 0x10 | uVar6 << 0x10;
  if (param_4 != (uint *)0x0) {
    uVar6 = *param_4 ^ uVar6;
  }
  if (param_5 != (uint *)0x0) {
    *param_5 = uVar6;
  }
  uVar6 = uVar1 ^ in_w12 ^ (iVar3 + iVar2 ^ uVar4) + iVar5;
  uVar6 = (uVar6 & 0xff00ff00) >> 8 | (uVar6 & 0xff00ff) << 8;
  uVar6 = uVar6 >> 0x10 | uVar6 << 0x10;
  if (param_4 != (uint *)0x0) {
    uVar6 = param_4[1] ^ uVar6;
  }
  param_5[1] = uVar6;
  return;
}

