
void FUN_0070c4e0(void)

{
  long lVar1;
  undefined4 *puVar2;
  ulong uVar3;
  ulong uVar4;
  undefined8 *puVar5;
  undefined8 *puVar6;
  ulong uVar7;
  long unaff_x19;
  undefined4 *unaff_x20;
  long unaff_x21;
  undefined4 *puVar8;
  undefined4 *unaff_x22;
  undefined4 *puVar9;
  undefined4 unaff_w23;
  long unaff_x24;
  long unaff_x25;
  undefined8 uVar10;
  undefined8 uVar11;
  undefined8 uVar12;
  undefined8 uVar13;
  undefined8 uVar14;
  undefined8 uVar15;
  undefined8 uVar16;
  
  lVar1 = __Znwm();
  puVar2 = (undefined4 *)(lVar1 + unaff_x24 * 4);
  puVar8 = puVar2 + 1;
  *puVar2 = unaff_w23;
  if ((long)unaff_x22 - (long)unaff_x20 != 0) {
    uVar3 = ((long)unaff_x22 - (long)unaff_x20) - 4;
    puVar9 = unaff_x22;
    if ((0x3b < uVar3) && (0x3f < (ulong)((long)unaff_x22 + (-unaff_x25 - lVar1)))) {
      uVar3 = (uVar3 >> 2) + 1;
      uVar4 = uVar3 & 0x7ffffffffffffff0;
      puVar9 = unaff_x22 + -uVar4;
      puVar2 = puVar2 + -uVar4;
      puVar5 = (undefined8 *)(unaff_x22 + -8);
      puVar6 = (undefined8 *)(lVar1 + unaff_x24 * 4 + -0x20);
      uVar7 = uVar4;
      do {
        uVar12 = *puVar5;
        uVar11 = puVar5[3];
        uVar10 = puVar5[2];
        uVar16 = puVar5[-3];
        uVar15 = puVar5[-4];
        uVar14 = puVar5[-1];
        uVar13 = puVar5[-2];
        puVar6[1] = puVar5[1];
        *puVar6 = uVar12;
        puVar6[3] = uVar11;
        puVar6[2] = uVar10;
        puVar6[-3] = uVar16;
        puVar6[-4] = uVar15;
        puVar6[-1] = uVar14;
        puVar6[-2] = uVar13;
        puVar5 = puVar5 + -8;
        puVar6 = puVar6 + -8;
        uVar7 = uVar7 - 0x10;
      } while (uVar7 != 0);
      if (uVar3 == uVar4) goto LAB_0070c59c;
    }
    do {
      puVar9 = puVar9 + -1;
      puVar2 = puVar2 + -1;
      *puVar2 = *puVar9;
    } while (puVar9 != unaff_x20);
  }
LAB_0070c59c:
  *(undefined4 **)(unaff_x19 + 0x60) = puVar2;
  *(undefined4 **)(unaff_x19 + 0x68) = puVar8;
  *(long *)(unaff_x19 + 0x70) = lVar1 + unaff_x21 * 4;
  if (unaff_x20 != (undefined4 *)0x0) {
    __ZdlPv();
  }
  *(undefined4 **)(unaff_x19 + 0x68) = puVar8;
  return;
}

