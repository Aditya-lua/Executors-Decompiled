
void FUN_006a2c34(undefined8 param_1,int param_2,int param_3,undefined8 param_4,int param_5,
                 undefined8 param_6,int param_7,int param_8,undefined8 param_9,undefined8 param_10,
                 undefined8 param_11,int *param_12)

{
  uint uVar1;
  uint uVar2;
  uint uVar3;
  uint uVar4;
  uint uVar5;
  int in_w8;
  uint in_w9;
  int in_w10;
  uint in_w11;
  int in_w12;
  int in_w13;
  int in_w14;
  int in_w15;
  int in_w16;
  uint in_w17;
  int unaff_w20;
  int unaff_w22;
  int unaff_w24;
  uint unaff_w25;
  int unaff_w26;
  
  uVar1 = in_w10 + unaff_w20 + (in_w17 ^ in_w9);
  uVar2 = uVar1 >> 0x12 | uVar1 * 0x4000;
  uVar1 = in_w8 + param_2 + (in_w9 ^ in_w11 ^ uVar2);
  uVar3 = uVar1 >> 0x1a | uVar1 * 0x40;
  uVar1 = in_w11 + in_w13 + (uVar2 ^ in_w9 ^ uVar3);
  uVar4 = uVar1 >> 0x12 | uVar1 * 0x4000;
  uVar1 = in_w9 + in_w15 + (uVar3 ^ uVar2 ^ uVar4);
  uVar5 = uVar1 >> 0x1a | uVar1 * 0x40;
  uVar1 = uVar2 + param_8 + (uVar4 ^ uVar3 ^ uVar5);
  uVar2 = uVar1 >> 0x17 | uVar1 * 0x200;
  uVar1 = uVar3 + in_w12 + (uVar5 ^ uVar4 ^ uVar2);
  uVar3 = uVar1 >> 0x14 | uVar1 * 0x1000;
  uVar1 = uVar4 + param_7 + (uVar2 ^ uVar5 ^ uVar3);
  uVar4 = uVar1 >> 0x17 | uVar1 * 0x200;
  uVar1 = uVar5 + param_3 + (uVar3 ^ uVar2 ^ uVar4);
  uVar5 = uVar1 >> 0x14 | uVar1 * 0x1000;
  uVar1 = uVar2 + in_w14 + (uVar4 ^ uVar3 ^ uVar5);
  uVar2 = uVar1 >> 0x1b | uVar1 * 0x20;
  uVar1 = uVar3 + in_w16 + (uVar5 ^ uVar4 ^ uVar2);
  uVar3 = uVar1 >> 0x11 | uVar1 * 0x8000;
  uVar1 = uVar4 + param_5 + (uVar2 ^ uVar5 ^ uVar3);
  param_12[2] = unaff_w22 + (int)param_11 + (uVar1 >> 0x18 | uVar1 * 0x100);
  param_12[3] = (unaff_w25 >> 0x14 | unaff_w25 << 0xc) + param_11._4_4_ + uVar3;
  *param_12 = unaff_w26 + (int)param_10 + uVar2;
  param_12[1] = unaff_w24 + param_10._4_4_ + uVar5;
  return;
}

