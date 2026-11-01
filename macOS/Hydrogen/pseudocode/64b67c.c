
long FUN_0064b67c(ulong param_1)

{
  long lVar1;
  undefined1 *puVar2;
  ulong in_x9;
  ulong uVar3;
  long in_x10;
  undefined8 *puVar4;
  undefined1 *puVar6;
  undefined1 *puVar5;
  long in_x11;
  ulong uVar7;
  long lVar8;
  undefined8 *puVar9;
  ulong uVar10;
  long *unaff_x19;
  long unaff_x20;
  undefined1 *unaff_x21;
  undefined1 *unaff_x22;
  long unaff_x23;
  long unaff_x25;
  long unaff_x27;
  long unaff_x28;
  undefined8 uVar11;
  undefined8 uVar12;
  undefined8 uVar13;
  undefined8 uVar14;
  undefined8 uVar15;
  undefined8 uVar16;
  undefined8 uVar17;
  
  if (in_x11 != 0x17) {
    in_x10 = in_x11;
  }
  if (0x16 < param_1) {
    in_x9 = in_x10 + 1;
  }
  lVar1 = __Znwm(in_x9);
  if (unaff_x20 != 0) {
    _memmove(lVar1);
  }
  if (unaff_x27 - unaff_x20 != 0) {
    _memmove(lVar1 + unaff_x20 + unaff_x23,unaff_x25 + unaff_x20,unaff_x27 - unaff_x20);
  }
  if (unaff_x28 != 0x16) {
    __ZdlPv();
  }
  *unaff_x19 = lVar1;
  unaff_x19[2] = in_x9 | 0x8000000000000000;
  unaff_x19[1] = unaff_x27 + unaff_x23;
  *(undefined1 *)(lVar1 + unaff_x27 + unaff_x23) = 0;
  if (unaff_x22 == unaff_x21) goto code_r0x0064b838;
  puVar2 = (undefined1 *)(lVar1 + unaff_x20);
  uVar3 = (long)unaff_x21 - (long)unaff_x22;
  if (uVar3 < 8) {
    puVar6 = unaff_x22;
  }
  else if ((ulong)((long)puVar2 - (long)unaff_x22) < 0x40) {
    puVar6 = unaff_x22;
  }
  else {
    if (uVar3 < 0x40) {
      uVar7 = 0;
    }
    else {
      uVar7 = uVar3 & 0xffffffffffffffc0;
      puVar4 = (undefined8 *)(unaff_x22 + 0x20);
      puVar9 = (undefined8 *)(unaff_x20 + lVar1 + 0x20);
      uVar10 = uVar7;
      do {
        uVar11 = puVar4[-4];
        uVar13 = puVar4[-1];
        uVar12 = puVar4[-2];
        uVar15 = puVar4[1];
        uVar14 = *puVar4;
        uVar17 = puVar4[3];
        uVar16 = puVar4[2];
        puVar9[-3] = puVar4[-3];
        puVar9[-4] = uVar11;
        puVar9[-1] = uVar13;
        puVar9[-2] = uVar12;
        puVar9[1] = uVar15;
        *puVar9 = uVar14;
        puVar9[3] = uVar17;
        puVar9[2] = uVar16;
        uVar10 = uVar10 - 0x40;
        puVar4 = puVar4 + 8;
        puVar9 = puVar9 + 8;
      } while (uVar10 != 0);
      if (uVar3 == uVar7) goto code_r0x0064b838;
      if ((uVar3 & 0x38) == 0) {
        puVar2 = puVar2 + uVar7;
        puVar6 = unaff_x22 + uVar7;
        goto code_r0x0064b828;
      }
    }
    uVar10 = uVar3 & 0xfffffffffffffff8;
    puVar6 = unaff_x22 + uVar10;
    puVar2 = puVar2 + uVar10;
    lVar8 = uVar7 - uVar10;
    puVar4 = (undefined8 *)(lVar1 + uVar7 + unaff_x20);
    puVar9 = (undefined8 *)(unaff_x22 + uVar7);
    do {
      *puVar4 = *puVar9;
      lVar8 = lVar8 + 8;
      puVar4 = puVar4 + 1;
      puVar9 = puVar9 + 1;
    } while (lVar8 != 0);
    if (uVar3 == uVar10) goto code_r0x0064b838;
  }
code_r0x0064b828:
  do {
    puVar5 = puVar6 + 1;
    *puVar2 = *puVar6;
    puVar2 = puVar2 + 1;
    puVar6 = puVar5;
  } while (puVar5 != unaff_x21);
code_r0x0064b838:
  if (*(char *)((long)unaff_x19 + 0x17) < '\0') {
    unaff_x19 = (long *)*unaff_x19;
  }
  return (long)unaff_x19 + unaff_x20;
}

