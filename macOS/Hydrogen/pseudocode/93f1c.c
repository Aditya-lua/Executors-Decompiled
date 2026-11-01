
undefined8 * FUN_00093f1c(long param_1)

{
  ulong uVar1;
  undefined8 *puVar2;
  undefined8 uVar3;
  long lVar4;
  ulong uVar5;
  ulong uVar6;
  long lVar7;
  ulong uVar8;
  ulong uVar9;
  ulong uVar10;
  long lVar11;
  ulong uVar12;
  ulong *unaff_x19;
  long unaff_x20;
  ulong unaff_x21;
  undefined8 *puVar13;
  long unaff_x22;
  uint uVar14;
  undefined8 unaff_x24;
  ulong unaff_x26;
  ulong uVar15;
  ulong uVar16;
  
  uVar16 = 0x400 - param_1 * unaff_x26;
  uVar1 = 0;
  if (unaff_x26 != 0) {
    uVar1 = uVar16 / unaff_x26;
  }
  *unaff_x19 = uVar1;
  lVar4 = uVar1 << 3;
  if (uVar1 >> 0x3d != 0) {
    lVar4 = -1;
  }
  puVar2 = (undefined8 *)__Znam(lVar4);
  uVar14 = *(uint *)(unaff_x22 + 0x2c0);
  if (unaff_x26 <= uVar16) {
    uVar16 = 0;
    uVar15 = uVar1;
    if (uVar1 < 2) {
      uVar15 = 1;
    }
    do {
      uVar3 = __Znam((ulong)uVar14 << 3);
      puVar2[uVar16] = uVar3;
      uVar16 = uVar16 + 1;
    } while (uVar15 != uVar16);
    uVar14 = *(uint *)(unaff_x22 + 0x2c0);
    if (uVar14 != 0) {
      lVar4 = *(long *)(unaff_x22 + 0x2f8);
      if (lVar4 == 0) {
        puVar13 = puVar2;
        do {
          _bzero(*puVar13,(ulong)uVar14 << 3);
          uVar15 = uVar15 - 1;
          puVar13 = puVar13 + 1;
        } while (uVar15 != 0);
      }
      else {
        uVar5 = 0;
        uVar16 = 0;
        do {
          uVar6 = 0;
          lVar7 = puVar2[uVar16];
          uVar8 = uVar5;
          do {
            uVar9 = 0;
            uVar10 = uVar8;
            lVar11 = lVar4;
            do {
              while (uVar10 < unaff_x21) {
                uVar9 = (ulong)*(byte *)(unaff_x20 + uVar10) | uVar9 << 8;
                uVar10 = uVar10 + 1;
                lVar11 = lVar11 + -1;
                if (lVar11 == 0) goto LAB_00093fb8;
              }
              uVar12 = uVar9 << 8;
              uVar9 = uVar9 << 8 | 0x80;
              if (unaff_x21 != uVar10) {
                uVar9 = uVar12;
              }
              uVar10 = uVar10 + 1;
              lVar11 = lVar11 + -1;
            } while (lVar11 != 0);
LAB_00093fb8:
            *(ulong *)(lVar7 + uVar6 * 8) = uVar9;
            uVar6 = uVar6 + 1;
            uVar8 = uVar8 + 8;
          } while (uVar6 != uVar14);
          uVar16 = uVar16 + 1;
          uVar5 = uVar5 + 0x80;
        } while (uVar16 != uVar15);
      }
    }
  }
  lVar4 = puVar2[uVar1 - 1];
  *(undefined8 *)(lVar4 + (ulong)(uVar14 - 1) * 8) = unaff_x24;
  *(undefined8 *)(lVar4 + (ulong)(uVar14 - 2) * 8) = 0;
  return puVar2;
}

