
undefined8 FUN_00090980(long param_1)

{
  undefined8 *puVar1;
  ulong uVar2;
  ulong uVar3;
  undefined8 *puVar4;
  undefined8 *puVar5;
  ulong uVar6;
  undefined8 *unaff_x19;
  undefined8 *puVar7;
  undefined8 unaff_x20;
  long *unaff_x21;
  undefined8 *unaff_x22;
  long unaff_x23;
  undefined8 *puVar8;
  long unaff_x24;
  long unaff_x25;
  undefined8 uVar9;
  undefined8 uVar10;
  undefined8 uVar11;
  undefined8 uVar12;
  undefined8 uVar13;
  undefined8 uVar14;
  undefined8 uVar15;
  
  puVar1 = (undefined8 *)(param_1 + unaff_x24 * 8);
  puVar8 = puVar1 + 1;
  *puVar1 = unaff_x20;
  if ((long)unaff_x19 - (long)unaff_x22 == 0) goto LAB_00090a1c;
  uVar2 = ((long)unaff_x19 - (long)unaff_x22) - 8;
  puVar7 = unaff_x19;
  if ((uVar2 < 0x58) || ((ulong)((long)unaff_x19 - (unaff_x25 + param_1)) < 0x40)) {
LAB_00090a08:
    do {
      puVar7 = puVar7 + -1;
      puVar1 = puVar1 + -1;
      *puVar1 = *puVar7;
    } while (puVar7 != unaff_x22);
  }
  else {
    uVar2 = (uVar2 >> 3) + 1;
    uVar3 = uVar2 & 0x3ffffffffffffff8;
    puVar7 = unaff_x19 + -uVar3;
    puVar1 = puVar1 + -uVar3;
    puVar4 = unaff_x19 + -4;
    puVar5 = (undefined8 *)(param_1 + unaff_x24 * 8 + -0x20);
    uVar6 = uVar3;
    do {
      uVar11 = *puVar4;
      uVar10 = puVar4[3];
      uVar9 = puVar4[2];
      uVar15 = puVar4[-3];
      uVar14 = puVar4[-4];
      uVar13 = puVar4[-1];
      uVar12 = puVar4[-2];
      puVar5[1] = puVar4[1];
      *puVar5 = uVar11;
      puVar5[3] = uVar10;
      puVar5[2] = uVar9;
      puVar5[-3] = uVar15;
      puVar5[-4] = uVar14;
      puVar5[-1] = uVar13;
      puVar5[-2] = uVar12;
      puVar4 = puVar4 + -8;
      puVar5 = puVar5 + -8;
      uVar6 = uVar6 - 8;
    } while (uVar6 != 0);
    if (uVar2 != uVar3) goto LAB_00090a08;
  }
  unaff_x19 = (undefined8 *)*unaff_x21;
LAB_00090a1c:
  *unaff_x21 = (long)puVar1;
  unaff_x21[1] = (long)puVar8;
  unaff_x21[2] = param_1 + unaff_x23 * 8;
  if (unaff_x19 != (undefined8 *)0x0) {
    __ZdlPv(unaff_x19);
  }
  unaff_x21[1] = (long)puVar8;
  return 1;
}

