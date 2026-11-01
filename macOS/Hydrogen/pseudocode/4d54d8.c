
void FUN_004d54d8(undefined8 *param_1,long param_2,ulong param_3,long param_4,uint *param_5)

{
  ulong in_x9;
  undefined8 *in_x10;
  ulong in_x11;
  long in_x12;
  uint in_w13;
  ulong in_x14;
  ulong uVar1;
  ulong in_x15;
  uint *puVar2;
  long in_x16;
  uint in_w17;
  undefined8 uVar3;
  undefined8 uVar4;
  undefined8 uVar5;
  
  while (param_3 != in_x9) {
    if (in_x11 <= param_3) goto code_r0x004d54e4;
    param_5 = (uint *)(in_x12 + param_3 * param_4 + 0x20);
    param_3 = (ulong)*param_5;
  }
  *param_5 = in_w17;
code_r0x004d54e4:
  if (in_x15 < in_x14) {
    puVar2 = (uint *)(in_x16 + in_x15 * 0x20 + 0x1c);
    uVar1 = (ulong)*puVar2;
    if (uVar1 == in_x9) {
      *puVar2 = in_w13;
    }
    else {
      do {
        if (in_x11 <= uVar1) goto LAB_004d5524;
        puVar2 = (uint *)(in_x12 + uVar1 * 0x30 + 0x24);
        uVar1 = (ulong)*puVar2;
      } while (uVar1 != in_x9);
      *puVar2 = in_w13;
    }
  }
LAB_004d5524:
  *(undefined4 *)(in_x10 + 4) = *(undefined4 *)(param_2 + 0x44);
  *(undefined8 *)((long)in_x10 + 0x24) = 0xffffffffffffffff;
  *(undefined4 *)((long)in_x10 + 0x2c) = 0xffffffff;
  *(int *)(param_2 + 0x44) = (int)in_x9;
  *(long *)(param_2 + 0x38) = *(long *)(param_2 + 0x38) + -1;
  uVar3 = *in_x10;
  uVar5 = in_x10[3];
  uVar4 = in_x10[2];
  param_1[1] = in_x10[1];
  *param_1 = uVar3;
  param_1[3] = uVar5;
  param_1[2] = uVar4;
  *in_x10 = 0x8000000000000000;
  return;
}

