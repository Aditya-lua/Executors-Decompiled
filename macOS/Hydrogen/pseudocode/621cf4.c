
undefined8 FUN_00621cf4(undefined1 *param_1,long param_2)

{
  long in_x9;
  ulong in_x10;
  ulong uVar1;
  long lVar2;
  undefined8 *puVar3;
  undefined1 *puVar4;
  undefined8 *puVar5;
  ulong uVar6;
  undefined1 *puVar7;
  long lVar8;
  long unaff_x21;
  undefined1 *unaff_x22;
  long *unaff_x23;
  undefined1 *unaff_x25;
  ulong unaff_x26;
  undefined8 uVar9;
  undefined8 uVar10;
  undefined8 uVar11;
  undefined8 uVar12;
  undefined8 uVar13;
  undefined8 uVar14;
  undefined8 uVar15;
  
  puVar7 = unaff_x25;
  puVar4 = param_1;
  if (0x3f < in_x10) {
    if (unaff_x26 < 0x40) {
      uVar1 = 0;
    }
    else {
      uVar1 = unaff_x26 & 0xffffffffffffffc0;
      puVar3 = (undefined8 *)(unaff_x25 + -0x20);
      puVar5 = (undefined8 *)((long)puVar3 + (param_2 - (long)unaff_x22));
      uVar6 = uVar1;
      do {
        uVar11 = *puVar3;
        uVar10 = puVar3[3];
        uVar9 = puVar3[2];
        uVar15 = puVar3[-3];
        uVar14 = puVar3[-4];
        uVar13 = puVar3[-1];
        uVar12 = puVar3[-2];
        puVar5[1] = puVar3[1];
        *puVar5 = uVar11;
        puVar5[3] = uVar10;
        puVar5[2] = uVar9;
        puVar5[-3] = uVar15;
        puVar5[-4] = uVar14;
        puVar5[-1] = uVar13;
        puVar5[-2] = uVar12;
        puVar5 = puVar5 + -8;
        puVar3 = puVar3 + -8;
        uVar6 = uVar6 - 0x40;
      } while (uVar6 != 0);
      if (unaff_x26 == uVar1) goto LAB_00621db0;
      if ((unaff_x26 & 0x38) == 0) {
        puVar4 = param_1 + -uVar1;
        puVar7 = unaff_x25 + -uVar1;
        goto LAB_00621da0;
      }
    }
    uVar6 = unaff_x26 & 0xfffffffffffffff8;
    puVar7 = unaff_x25 + -uVar6;
    puVar4 = param_1 + -uVar6;
    lVar8 = (long)(unaff_x25 + (-8 - uVar1)) - (long)unaff_x22;
    lVar2 = uVar1 - uVar6;
    puVar5 = (undefined8 *)(unaff_x25 + (-8 - uVar1));
    do {
      *(undefined8 *)(param_2 + lVar8) = *puVar5;
      lVar8 = lVar8 + -8;
      lVar2 = lVar2 + 8;
      puVar5 = puVar5 + -1;
    } while (lVar2 != 0);
    if (unaff_x26 == uVar6) goto LAB_00621db0;
  }
LAB_00621da0:
  do {
    puVar7 = puVar7 + -1;
    puVar4[-1] = *puVar7;
    puVar4 = puVar4 + -1;
  } while (puVar7 != unaff_x22);
LAB_00621db0:
  *unaff_x23 = param_2;
  unaff_x23[1] = (long)param_1;
  unaff_x23[2] = in_x9;
  if (unaff_x22 != (undefined1 *)0x0) {
    __ZdlPv();
  }
  func_0x00026614(*(long *)(unaff_x21 + 0x18),*(undefined8 *)(*(long *)(unaff_x21 + 0x18) + 8));
  return 0;
}

