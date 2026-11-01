
void FUN_00035ce8(undefined8 *param_1,long param_2)

{
  ulong uVar1;
  long lVar2;
  long in_x9;
  undefined8 *puVar3;
  ulong in_x11;
  ulong uVar4;
  undefined8 *puVar5;
  ulong uVar6;
  long *unaff_x19;
  undefined8 *unaff_x20;
  long unaff_x21;
  undefined8 unaff_x23;
  undefined8 *unaff_x24;
  long unaff_x25;
  long unaff_x26;
  undefined8 uVar7;
  undefined8 uVar8;
  undefined8 uVar9;
  undefined8 uVar10;
  undefined8 uVar11;
  undefined8 uVar12;
  undefined8 uVar13;
  
  lVar2 = unaff_x26 * 8 + param_2;
  puVar3 = param_1;
  if (0x3f < (ulong)(lVar2 - (long)unaff_x20)) {
    uVar1 = (in_x11 >> 3) + 1;
    uVar4 = uVar1 & 0x3ffffffffffffff8;
    puVar3 = (undefined8 *)(lVar2 + 0x20);
    puVar5 = (undefined8 *)(unaff_x25 + 0x28);
    uVar6 = uVar4;
    do {
      uVar7 = puVar5[-4];
      uVar9 = puVar5[-1];
      uVar8 = puVar5[-2];
      uVar11 = puVar5[1];
      uVar10 = *puVar5;
      uVar13 = puVar5[3];
      uVar12 = puVar5[2];
      puVar3[-3] = puVar5[-3];
      puVar3[-4] = uVar7;
      puVar3[-1] = uVar9;
      puVar3[-2] = uVar8;
      puVar3[1] = uVar11;
      *puVar3 = uVar10;
      puVar3[3] = uVar13;
      puVar3[2] = uVar12;
      uVar6 = uVar6 - 8;
      puVar3 = puVar3 + 8;
      puVar5 = puVar5 + 8;
    } while (uVar6 != 0);
    puVar3 = param_1 + uVar4;
    unaff_x20 = unaff_x20 + uVar4;
    if (uVar1 == uVar4) goto LAB_00035d54;
  }
  do {
    puVar5 = puVar3 + 1;
    *puVar3 = *unaff_x20;
    puVar3 = puVar5;
    unaff_x20 = unaff_x20 + 1;
  } while (puVar5 != unaff_x24);
LAB_00035d54:
  *unaff_x19 = param_2;
  unaff_x19[1] = (long)param_1;
  unaff_x19[2] = (long)unaff_x24;
  unaff_x19[3] = in_x9;
  if (unaff_x21 != 0) {
    __ZdlPv();
    unaff_x24 = (undefined8 *)unaff_x19[2];
  }
  *unaff_x24 = unaff_x23;
  unaff_x19[2] = unaff_x19[2] + 8;
  return;
}

