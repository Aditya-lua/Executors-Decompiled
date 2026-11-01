
void FUN_004e0524(long param_1,long param_2,long param_3)

{
  undefined8 *puVar1;
  long in_x9;
  long lVar2;
  long in_x11;
  undefined8 *puVar3;
  long unaff_x19;
  long unaff_x20;
  undefined8 uVar4;
  undefined8 uVar5;
  undefined8 uVar6;
  undefined8 uVar7;
  undefined8 uVar8;
  undefined8 uVar9;
  undefined8 uVar10;
  
  param_3 = param_3 + in_x9;
  puVar1 = (undefined8 *)(unaff_x19 + 0x20);
  puVar3 = (undefined8 *)(in_x11 + 0x20);
  lVar2 = in_x9;
  do {
    uVar5 = puVar1[-3];
    uVar4 = puVar1[-2];
    uVar6 = puVar1[-1];
    uVar7 = *puVar1;
    uVar9 = puVar1[1];
    uVar8 = puVar1[2];
    uVar10 = puVar1[3];
    puVar3[-4] = puVar1[-4];
    puVar3[-3] = uVar5;
    puVar3[-2] = uVar4;
    puVar3[-1] = uVar6;
    *puVar3 = uVar7;
    puVar3[1] = uVar9;
    puVar3[2] = uVar8;
    puVar3[3] = uVar10;
    puVar1 = puVar1 + 8;
    puVar3 = puVar3 + 8;
    lVar2 = lVar2 + -4;
  } while (lVar2 != 0);
  if (unaff_x20 != in_x9) {
    puVar1 = (undefined8 *)(param_1 + param_3 * 0x10 + 8);
    lVar2 = unaff_x20 - in_x9;
    puVar3 = (undefined8 *)(unaff_x19 + in_x9 * 0x10 + 8);
    param_3 = (param_3 + unaff_x20) - in_x9;
    do {
      uVar4 = *puVar3;
      puVar1[-1] = puVar3[-1];
      *puVar1 = uVar4;
      puVar1 = puVar1 + 2;
      puVar3 = puVar3 + 2;
      lVar2 = lVar2 + -1;
    } while (lVar2 != 0);
  }
  *(long *)(param_2 + 0x10) = param_3;
  return;
}

