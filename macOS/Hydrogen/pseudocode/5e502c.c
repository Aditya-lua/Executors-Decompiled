
void FUN_005e502c(long param_1,long param_2,long param_3,undefined4 param_4)

{
  bool bVar1;
  undefined4 *puVar2;
  undefined4 *puVar3;
  ulong in_x11;
  long in_x12;
  undefined8 *puVar4;
  ulong uVar5;
  ulong uVar6;
  long unaff_x19;
  long unaff_x20;
  
  uVar5 = in_x11 & 0xfffffffffffffff0;
  puVar3 = (undefined4 *)(in_x12 + uVar5 * 4);
  puVar4 = (undefined8 *)(in_x12 + 0x20);
  uVar6 = uVar5;
  do {
    puVar4[-3] = CONCAT44(param_4,param_4);
    puVar4[-4] = CONCAT44(param_4,param_4);
    puVar4[-1] = CONCAT44(param_4,param_4);
    puVar4[-2] = CONCAT44(param_4,param_4);
    puVar4[1] = CONCAT44(param_4,param_4);
    *puVar4 = CONCAT44(param_4,param_4);
    puVar4[3] = CONCAT44(param_4,param_4);
    puVar4[2] = CONCAT44(param_4,param_4);
    uVar6 = uVar6 - 0x10;
    puVar4 = puVar4 + 8;
  } while (uVar6 != 0);
  if (in_x11 != uVar5) {
    param_3 = ((uVar5 | 1) + unaff_x20) - param_3;
    puVar2 = puVar3;
    do {
      puVar3 = puVar2 + 1;
      *puVar2 = param_4;
      bVar1 = param_3 != -1;
      param_3 = param_3 + 1;
      puVar2 = puVar3;
    } while (bVar1);
  }
  *puVar3 = param_4;
  *(long *)(param_2 + 0x10) = unaff_x19 + param_1;
  return;
}

