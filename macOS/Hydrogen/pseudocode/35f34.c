
void FUN_00035f34(undefined8 *param_1,long param_2)

{
  ulong uVar1;
  long lVar2;
  bool in_ZR;
  long in_x9;
  ulong in_x10;
  undefined8 *puVar3;
  ulong uVar4;
  undefined8 *puVar5;
  undefined8 *puVar6;
  ulong uVar7;
  long *unaff_x19;
  undefined8 *unaff_x20;
  long unaff_x21;
  undefined8 *unaff_x22;
  undefined8 *puVar8;
  undefined8 *unaff_x24;
  long unaff_x25;
  undefined8 uVar9;
  undefined8 uVar10;
  undefined8 uVar11;
  undefined8 uVar12;
  undefined8 uVar13;
  undefined8 uVar14;
  undefined8 uVar15;
  
  if (!in_ZR) {
    unaff_x24 = (undefined8 *)((long)param_1 + (in_x10 & 0xfffffffffffffff8));
    puVar8 = unaff_x22;
    if (in_x10 - 8 < 0x38) {
      puVar3 = param_1;
    }
    else {
      lVar2 = unaff_x25 * 8 + param_2;
      puVar3 = param_1;
      if (0x3f < (ulong)(lVar2 - (long)unaff_x22)) {
        uVar1 = (in_x10 - 8 >> 3) + 1;
        uVar4 = uVar1 & 0x3ffffffffffffff8;
        puVar3 = param_1 + uVar4;
        puVar8 = unaff_x22 + uVar4;
        puVar5 = (undefined8 *)(lVar2 + 0x20);
        puVar6 = unaff_x22 + 4;
        uVar7 = uVar4;
        do {
          uVar9 = puVar6[-4];
          uVar11 = puVar6[-1];
          uVar10 = puVar6[-2];
          uVar13 = puVar6[1];
          uVar12 = *puVar6;
          uVar15 = puVar6[3];
          uVar14 = puVar6[2];
          puVar5[-3] = puVar6[-3];
          puVar5[-4] = uVar9;
          puVar5[-1] = uVar11;
          puVar5[-2] = uVar10;
          puVar5[1] = uVar13;
          *puVar5 = uVar12;
          puVar5[3] = uVar15;
          puVar5[2] = uVar14;
          uVar7 = uVar7 - 8;
          puVar5 = puVar5 + 8;
          puVar6 = puVar6 + 8;
        } while (uVar7 != 0);
        if (uVar1 == uVar4) goto LAB_00035fc4;
      }
    }
    do {
      puVar5 = puVar3 + 1;
      *puVar3 = *puVar8;
      puVar3 = puVar5;
      puVar8 = puVar8 + 1;
    } while (puVar5 != unaff_x24);
  }
LAB_00035fc4:
  *unaff_x19 = param_2;
  unaff_x19[1] = (long)param_1;
  unaff_x19[2] = (long)unaff_x24;
  unaff_x19[3] = in_x9;
  if (unaff_x21 != 0) {
    __ZdlPv();
    unaff_x24 = (undefined8 *)unaff_x19[2];
  }
  *unaff_x24 = *unaff_x20;
  unaff_x19[2] = unaff_x19[2] + 8;
  return;
}

