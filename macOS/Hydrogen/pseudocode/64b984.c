
long FUN_0064b984(long param_1)

{
  undefined1 *puVar1;
  ulong uVar2;
  undefined8 *puVar3;
  undefined1 *puVar5;
  undefined1 *puVar4;
  ulong uVar6;
  long lVar7;
  undefined8 *puVar8;
  ulong uVar9;
  long *unaff_x19;
  long unaff_x20;
  undefined1 *unaff_x21;
  undefined1 *unaff_x22;
  long unaff_x23;
  long unaff_x24;
  ulong unaff_x26;
  long unaff_x27;
  long unaff_x28;
  undefined8 uVar10;
  undefined8 uVar11;
  undefined8 uVar12;
  undefined8 uVar13;
  undefined8 uVar14;
  undefined8 uVar15;
  undefined8 uVar16;
  
  _memmove(param_1 + unaff_x23);
  if (unaff_x28 != 0x16) {
    __ZdlPv();
  }
  *unaff_x19 = unaff_x24;
  unaff_x19[2] = unaff_x26 | 0x8000000000000000;
  unaff_x19[1] = unaff_x27 + unaff_x23;
  *(undefined1 *)(unaff_x24 + unaff_x27 + unaff_x23) = 0;
  if (unaff_x22 == unaff_x21) goto code_r0x0064bafc;
  puVar1 = (undefined1 *)(unaff_x24 + unaff_x20);
  uVar2 = (long)unaff_x21 - (long)unaff_x22;
  if (uVar2 < 8) {
    puVar5 = unaff_x22;
  }
  else {
    puVar5 = unaff_x22;
    if (0x3f < (ulong)((long)puVar1 - (long)unaff_x22)) {
      if (uVar2 < 0x40) {
        uVar6 = 0;
      }
      else {
        uVar6 = uVar2 & 0xffffffffffffffc0;
        puVar3 = (undefined8 *)(unaff_x20 + unaff_x24 + 0x20);
        puVar8 = (undefined8 *)(unaff_x22 + 0x20);
        uVar9 = uVar6;
        do {
          uVar10 = puVar8[-4];
          uVar12 = puVar8[-1];
          uVar11 = puVar8[-2];
          uVar14 = puVar8[1];
          uVar13 = *puVar8;
          uVar16 = puVar8[3];
          uVar15 = puVar8[2];
          puVar3[-3] = puVar8[-3];
          puVar3[-4] = uVar10;
          puVar3[-1] = uVar12;
          puVar3[-2] = uVar11;
          puVar3[1] = uVar14;
          *puVar3 = uVar13;
          puVar3[3] = uVar16;
          puVar3[2] = uVar15;
          uVar9 = uVar9 - 0x40;
          puVar3 = puVar3 + 8;
          puVar8 = puVar8 + 8;
        } while (uVar9 != 0);
        if (uVar2 == uVar6) goto code_r0x0064bafc;
        if ((uVar2 & 0x38) == 0) {
          puVar5 = unaff_x22 + uVar6;
          puVar1 = puVar1 + uVar6;
          goto code_r0x0064baec;
        }
      }
      uVar9 = uVar2 & 0xfffffffffffffff8;
      puVar1 = puVar1 + uVar9;
      puVar5 = unaff_x22 + uVar9;
      lVar7 = uVar6 - uVar9;
      puVar3 = (undefined8 *)(unaff_x22 + uVar6);
      puVar8 = (undefined8 *)(unaff_x24 + uVar6 + unaff_x20);
      do {
        *puVar8 = *puVar3;
        lVar7 = lVar7 + 8;
        puVar3 = puVar3 + 1;
        puVar8 = puVar8 + 1;
      } while (lVar7 != 0);
      if (uVar2 == uVar9) goto code_r0x0064bafc;
    }
  }
code_r0x0064baec:
  do {
    puVar4 = puVar5 + 1;
    *puVar1 = *puVar5;
    puVar1 = puVar1 + 1;
    puVar5 = puVar4;
  } while (puVar4 != unaff_x21);
code_r0x0064bafc:
  if (*(char *)((long)unaff_x19 + 0x17) < '\0') {
    unaff_x19 = (long *)*unaff_x19;
  }
  return (long)unaff_x19 + unaff_x20;
}

