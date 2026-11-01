
void FUN_00534afc(long param_1,long param_2,undefined8 param_3)

{
  bool in_CY;
  undefined8 *puVar1;
  undefined8 *puVar2;
  ulong uVar3;
  long lVar4;
  undefined8 *in_x10;
  ulong uVar5;
  ulong uVar6;
  long unaff_x19;
  
  if (in_CY) {
    uVar5 = unaff_x19 - 1U & 0xfffffffffffffff8;
    puVar2 = in_x10 + uVar5;
    uVar3 = uVar5 | 1;
    puVar1 = in_x10 + 4;
    uVar6 = uVar5;
    do {
      puVar1[-3] = param_3;
      puVar1[-4] = param_3;
      puVar1[-1] = param_3;
      puVar1[-2] = param_3;
      puVar1[1] = param_3;
      *puVar1 = param_3;
      puVar1[3] = param_3;
      puVar1[2] = param_3;
      uVar6 = uVar6 - 8;
      puVar1 = puVar1 + 8;
    } while (uVar6 != 0);
    if (unaff_x19 - 1U == uVar5) goto LAB_00534b50;
  }
  else {
    uVar3 = 1;
    puVar2 = in_x10;
  }
  lVar4 = unaff_x19 - uVar3;
  puVar1 = puVar2;
  do {
    puVar2 = puVar1 + 1;
    *puVar1 = param_3;
    lVar4 = lVar4 + -1;
    puVar1 = puVar2;
  } while (lVar4 != 0);
LAB_00534b50:
  *puVar2 = param_3;
  *(long *)(param_1 + 0x10) = unaff_x19 + param_2;
  return;
}

