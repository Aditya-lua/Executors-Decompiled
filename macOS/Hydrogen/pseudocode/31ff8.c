
void FUN_00031ff8(undefined8 param_1,long param_2)

{
  ulong uVar1;
  undefined2 *in_x9;
  ulong in_x10;
  ulong in_x11;
  ulong uVar2;
  undefined8 *puVar3;
  undefined8 *puVar4;
  ulong uVar5;
  long unaff_x19;
  long *unaff_x20;
  undefined2 *unaff_x21;
  undefined2 *puVar6;
  long lVar7;
  undefined2 *unaff_x23;
  undefined8 unaff_x24;
  long unaff_x25;
  undefined8 uVar8;
  undefined8 uVar9;
  undefined8 uVar10;
  undefined8 uVar11;
  undefined8 uVar12;
  undefined8 uVar13;
  undefined8 uVar14;
  
  puVar6 = unaff_x21;
  if (0x3f < in_x11) {
    uVar1 = (in_x10 >> 1) + 1;
    uVar2 = uVar1 & 0xffffffffffffffe0;
    puVar6 = unaff_x21 + -uVar2;
    in_x9 = in_x9 + -uVar2;
    puVar3 = (undefined8 *)(unaff_x21 + -0x10);
    puVar4 = (undefined8 *)(param_2 + unaff_x25 * 2 + -0x20);
    uVar5 = uVar2;
    do {
      uVar10 = *puVar3;
      uVar9 = puVar3[3];
      uVar8 = puVar3[2];
      uVar14 = puVar3[-3];
      uVar13 = puVar3[-4];
      uVar12 = puVar3[-1];
      uVar11 = puVar3[-2];
      puVar4[1] = puVar3[1];
      *puVar4 = uVar10;
      puVar4[3] = uVar9;
      puVar4[2] = uVar8;
      puVar4[-3] = uVar14;
      puVar4[-4] = uVar13;
      puVar4[-1] = uVar12;
      puVar4[-2] = uVar11;
      puVar3 = puVar3 + -8;
      puVar4 = puVar4 + -8;
      uVar5 = uVar5 - 0x20;
    } while (uVar5 != 0);
    if (uVar1 == uVar2) goto LAB_00032064;
  }
  do {
    puVar6 = puVar6 + -1;
    in_x9 = in_x9 + -1;
    *in_x9 = *puVar6;
  } while (puVar6 != unaff_x23);
LAB_00032064:
  lVar7 = *unaff_x20;
  *(undefined2 **)(unaff_x19 + 0x70) = in_x9;
  *(undefined8 *)(unaff_x19 + 0x78) = unaff_x24;
  *(undefined8 *)(unaff_x19 + 0x80) = param_1;
  if (lVar7 != 0) {
    __ZdlPv(lVar7);
  }
  *(undefined8 *)(unaff_x19 + 0x78) = unaff_x24;
  return;
}

