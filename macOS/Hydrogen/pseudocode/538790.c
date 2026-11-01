
void FUN_00538790(undefined8 *param_1,long param_2)

{
  byte bVar1;
  long in_x9;
  uint in_w12;
  int in_w13;
  
  *(long *)(param_2 + 0x10) = in_x9 + 4;
  bVar1 = *(byte *)(in_x9 + 3);
  *(long *)(param_2 + 0x20) = ((in_x9 + 4) - in_x9) + *(long *)(param_2 + 0x20);
  param_1[1] = 0;
  *(uint *)(param_1 + 2) =
       in_w13 << 6 & 0xffe00000U | bVar1 & 0x3f | in_w13 << 6 & 0x3ffffU | (in_w12 & 7) << 0x12;
  *param_1 = 1;
  return;
}

