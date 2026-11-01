
void FUN_00583a74(long param_1,undefined8 param_2,long param_3)

{
  undefined8 *puVar1;
  long in_x9;
  undefined8 uVar2;
  long unaff_x19;
  long unaff_x20;
  undefined8 *unaff_x21;
  undefined8 *puVar3;
  undefined8 *unaff_x22;
  undefined8 uVar4;
  undefined8 uVar5;
  undefined8 uVar6;
  undefined8 uVar7;
  undefined8 uVar8;
  undefined8 uVar9;
  
  puVar1 = (undefined8 *)(param_1 + param_3 * in_x9 + 0x20);
  do {
    uVar2 = unaff_x21[6];
    uVar7 = unaff_x21[3];
    uVar6 = unaff_x21[2];
    uVar5 = unaff_x21[5];
    uVar4 = unaff_x21[4];
    puVar3 = unaff_x21 + 7;
    uVar9 = unaff_x21[1];
    uVar8 = *unaff_x21;
    puVar1[-1] = 0xf;
    puVar1[1] = uVar9;
    *puVar1 = uVar8;
    puVar1[3] = uVar7;
    puVar1[2] = uVar6;
    puVar1[5] = uVar5;
    puVar1[4] = uVar4;
    puVar1[6] = uVar2;
    param_3 = param_3 + 1;
    puVar1 = puVar1 + 0x21;
    unaff_x21 = puVar3;
  } while (puVar3 != unaff_x22);
  *(undefined8 **)(unaff_x19 + 0x30) = puVar3;
  *(long *)(unaff_x20 + 0x10) = param_3;
  return;
}

