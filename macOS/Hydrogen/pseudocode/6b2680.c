
void FUN_006b2680(void)

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
  undefined4 *unaff_x21;
  undefined4 *puVar8;
  long unaff_x22;
  undefined4 *puVar9;
  long unaff_x23;
  long unaff_x24;
  undefined8 uVar10;
  undefined8 uVar11;
  undefined8 uVar12;
  undefined8 uVar13;
  undefined8 uVar14;
  undefined8 uVar15;
  undefined8 uVar16;
  
  lVar1 = __Znwm(unaff_x22 << 2);
  puVar2 = (undefined4 *)(lVar1 + unaff_x23 * 4);
  puVar9 = puVar2 + 1;
  *puVar2 = *(undefined4 *)(unaff_x19 + 0x1b8);
  if ((long)unaff_x21 - (long)unaff_x20 != 0) {
    uVar3 = ((long)unaff_x21 - (long)unaff_x20) - 4;
    puVar8 = unaff_x21;
    if ((0x3b < uVar3) && (0x3f < (ulong)((long)unaff_x21 + (-unaff_x24 - lVar1)))) {
      uVar3 = (uVar3 >> 2) + 1;
      uVar4 = uVar3 & 0x7ffffffffffffff0;
      puVar8 = unaff_x21 + -uVar4;
      puVar2 = puVar2 + -uVar4;
      puVar5 = (undefined8 *)(unaff_x21 + -8);
      puVar6 = (undefined8 *)(lVar1 + unaff_x23 * 4 + -0x20);
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
      if (uVar3 == uVar4) goto code_r0x006b272c;
    }
    do {
      puVar8 = puVar8 + -1;
      puVar2 = puVar2 + -1;
      *puVar2 = *puVar8;
    } while (puVar8 != unaff_x20);
  }
code_r0x006b272c:
  *(undefined4 **)(unaff_x19 + 0x40) = puVar2;
  *(undefined4 **)(unaff_x19 + 0x48) = puVar9;
  *(long *)(unaff_x19 + 0x50) = lVar1 + unaff_x22 * 4;
  if (unaff_x20 != (undefined4 *)0x0) {
    __ZdlPv();
  }
  *(undefined4 **)(unaff_x19 + 0x48) = puVar9;
  return;
}

