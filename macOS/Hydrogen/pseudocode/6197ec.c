
void FUN_006197ec(long param_1,undefined8 param_2,undefined8 param_3,uint *param_4)

{
  uint uVar1;
  uint uVar2;
  uint uVar3;
  int iVar4;
  int iVar5;
  uint uVar6;
  int iVar7;
  long in_x9;
  uint in_w10;
  uint in_w11;
  uint in_w12;
  uint in_w13;
  int in_w14;
  int in_w15;
  uint in_w17;
  
  uVar1 = in_w17 ^ in_w12 ^
          (in_w15 + in_w14 ^ *(uint *)(in_x9 + (ulong)(in_w13 >> 8 & 0xff | 0x200) * 4)) +
          *(int *)(in_x9 + (ulong)(in_w13 & 0xff | 0x300) * 4);
  uVar2 = *(uint *)(param_1 + 0x38) ^ in_w13 ^
          (*(int *)(in_x9 + (ulong)(uVar1 >> 0x10 & 0xff | 0x100) * 4) +
           *(int *)(in_x9 + (ulong)(uVar1 >> 0x18) * 4) ^
          *(uint *)(in_x9 + (ulong)(uVar1 >> 8 & 0xff | 0x200) * 4)) +
          *(int *)(in_x9 + (ulong)(uVar1 & 0xff | 0x300) * 4);
  uVar1 = *(uint *)(param_1 + 0x3c) ^ uVar1 ^
          (*(int *)(in_x9 + (ulong)(uVar2 >> 0x10 & 0xff | 0x100) * 4) +
           *(int *)(in_x9 + (ulong)(uVar2 >> 0x18) * 4) ^
          *(uint *)(in_x9 + (ulong)(uVar2 >> 8 & 0xff | 0x200) * 4)) +
          *(int *)(in_x9 + (ulong)(uVar2 & 0xff | 0x300) * 4);
  iVar4 = *(int *)(in_x9 + (ulong)(uVar1 >> 0x18) * 4);
  iVar5 = *(int *)(in_x9 + (ulong)(in_w10 & 0xffffff00 | uVar1 >> 0x10 & 0xff) * 4);
  uVar6 = *(uint *)(in_x9 + (ulong)(in_w11 & 0xffffff00 | uVar1 >> 8 & 0xff) * 4);
  iVar7 = *(int *)(in_x9 + (ulong)(uVar1 & 0xff | 0x300) * 4);
  uVar3 = *(uint *)(param_1 + 0x40);
  *param_4 = *(uint *)(param_1 + 0x44) ^ uVar1;
  param_4[1] = uVar3 ^ uVar2 ^ (iVar5 + iVar4 ^ uVar6) + iVar7;
  return;
}

