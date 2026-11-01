
void FUN_006b26cc(undefined8 param_1,long param_2)

{
  long in_x9;
  undefined4 *puVar1;
  long in_x10;
  ulong uVar2;
  undefined4 *puVar3;
  undefined8 *puVar4;
  undefined8 *puVar5;
  ulong uVar6;
  long unaff_x19;
  undefined4 *unaff_x20;
  long unaff_x21;
  undefined8 unaff_x22;
  long unaff_x23;
  undefined8 uVar7;
  undefined8 uVar8;
  undefined8 uVar9;
  undefined8 uVar10;
  undefined8 uVar11;
  undefined8 uVar12;
  undefined8 uVar13;
  
  uVar2 = in_x10 + 1U & 0x7ffffffffffffff0;
  puVar3 = (undefined4 *)(unaff_x21 + uVar2 * -4);
  puVar1 = (undefined4 *)(in_x9 + uVar2 * -4);
  puVar4 = (undefined8 *)(unaff_x21 + -0x20);
  puVar5 = (undefined8 *)(param_2 + unaff_x23 * 4 + -0x20);
  uVar6 = uVar2;
  do {
    uVar9 = *puVar4;
    uVar8 = puVar4[3];
    uVar7 = puVar4[2];
    uVar13 = puVar4[-3];
    uVar12 = puVar4[-4];
    uVar11 = puVar4[-1];
    uVar10 = puVar4[-2];
    puVar5[1] = puVar4[1];
    *puVar5 = uVar9;
    puVar5[3] = uVar8;
    puVar5[2] = uVar7;
    puVar5[-3] = uVar13;
    puVar5[-4] = uVar12;
    puVar5[-1] = uVar11;
    puVar5[-2] = uVar10;
    puVar4 = puVar4 + -8;
    puVar5 = puVar5 + -8;
    uVar6 = uVar6 - 0x10;
  } while (uVar6 != 0);
  if (in_x10 + 1U != uVar2) {
    do {
      puVar3 = puVar3 + -1;
      puVar1 = puVar1 + -1;
      *puVar1 = *puVar3;
    } while (puVar3 != unaff_x20);
  }
  *(undefined4 **)(unaff_x19 + 0x40) = puVar1;
  *(undefined8 *)(unaff_x19 + 0x48) = unaff_x22;
  *(undefined8 *)(unaff_x19 + 0x50) = param_1;
  if (unaff_x20 != (undefined4 *)0x0) {
    __ZdlPv();
  }
  *(undefined8 *)(unaff_x19 + 0x48) = unaff_x22;
  return;
}

