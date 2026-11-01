
long FUN_0064ba08(undefined1 *param_1)

{
  ulong uVar1;
  undefined8 *puVar2;
  undefined1 *puVar4;
  undefined1 *puVar3;
  ulong uVar5;
  long lVar6;
  undefined8 *puVar7;
  ulong uVar8;
  undefined8 *unaff_x19;
  long unaff_x20;
  undefined1 *unaff_x21;
  undefined1 *unaff_x22;
  long unaff_x24;
  undefined8 uVar9;
  undefined8 uVar10;
  undefined8 uVar11;
  undefined8 uVar12;
  undefined8 uVar13;
  undefined8 uVar14;
  undefined8 uVar15;
  
  uVar1 = (long)unaff_x21 - (long)unaff_x22;
  if (uVar1 < 8) {
    puVar4 = unaff_x22;
  }
  else {
    puVar4 = unaff_x22;
    if (0x3f < (ulong)((long)param_1 - (long)unaff_x22)) {
      if (uVar1 < 0x40) {
        uVar5 = 0;
      }
      else {
        uVar5 = uVar1 & 0xffffffffffffffc0;
        puVar2 = (undefined8 *)(unaff_x20 + unaff_x24 + 0x20);
        puVar7 = (undefined8 *)(unaff_x22 + 0x20);
        uVar8 = uVar5;
        do {
          uVar9 = puVar7[-4];
          uVar11 = puVar7[-1];
          uVar10 = puVar7[-2];
          uVar13 = puVar7[1];
          uVar12 = *puVar7;
          uVar15 = puVar7[3];
          uVar14 = puVar7[2];
          puVar2[-3] = puVar7[-3];
          puVar2[-4] = uVar9;
          puVar2[-1] = uVar11;
          puVar2[-2] = uVar10;
          puVar2[1] = uVar13;
          *puVar2 = uVar12;
          puVar2[3] = uVar15;
          puVar2[2] = uVar14;
          uVar8 = uVar8 - 0x40;
          puVar2 = puVar2 + 8;
          puVar7 = puVar7 + 8;
        } while (uVar8 != 0);
        if (uVar1 == uVar5) goto LAB_0064bafc;
        if ((uVar1 & 0x38) == 0) {
          puVar4 = unaff_x22 + uVar5;
          param_1 = param_1 + uVar5;
          goto LAB_0064baec;
        }
      }
      uVar8 = uVar1 & 0xfffffffffffffff8;
      param_1 = param_1 + uVar8;
      puVar4 = unaff_x22 + uVar8;
      lVar6 = uVar5 - uVar8;
      puVar2 = (undefined8 *)(unaff_x22 + uVar5);
      puVar7 = (undefined8 *)(unaff_x24 + uVar5 + unaff_x20);
      do {
        *puVar7 = *puVar2;
        lVar6 = lVar6 + 8;
        puVar2 = puVar2 + 1;
        puVar7 = puVar7 + 1;
      } while (lVar6 != 0);
      if (uVar1 == uVar8) goto LAB_0064bafc;
    }
  }
LAB_0064baec:
  do {
    puVar3 = puVar4 + 1;
    *param_1 = *puVar4;
    param_1 = param_1 + 1;
    puVar4 = puVar3;
  } while (puVar3 != unaff_x21);
LAB_0064bafc:
  if (*(char *)((long)unaff_x19 + 0x17) < '\0') {
    unaff_x19 = (undefined8 *)*unaff_x19;
  }
  return (long)unaff_x19 + unaff_x20;
}

