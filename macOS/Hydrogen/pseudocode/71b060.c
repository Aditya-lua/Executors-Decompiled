
void FUN_0071b060(undefined8 param_1,undefined8 param_2)

{
  ulong uVar1;
  long lVar2;
  ulong uVar3;
  undefined1 uVar4;
  ulong uVar5;
  undefined1 *puVar6;
  undefined8 in_x9;
  ulong uVar7;
  undefined8 *puVar8;
  byte bVar9;
  int in_w10;
  undefined8 *puVar10;
  undefined1 *puVar11;
  long lVar12;
  long *unaff_x19;
  long unaff_x20;
  long unaff_x21;
  long lVar13;
  undefined8 *unaff_x22;
  int *unaff_x23;
  undefined8 uVar14;
  undefined8 uVar15;
  undefined8 uVar16;
  undefined8 uVar17;
  undefined8 uVar18;
  undefined8 uVar19;
  undefined8 uVar20;
  
  if (-1 < in_w10) {
    in_x9 = param_1;
  }
  *unaff_x22 = param_2;
  unaff_x22[1] = in_x9;
  if ((*unaff_x23 == 0x117) || (*unaff_x23 == 0x10d)) {
    uVar3 = func_0x0070d658();
    if ((uVar3 & 1) == 0) {
      func_0x00710d48();
      uVar4 = 0;
      *(undefined1 *)unaff_x19 = 0;
      goto LAB_0071b1b8;
    }
  }
  else {
    func_0x0070deec();
  }
  bVar9 = *(byte *)(unaff_x20 + 0x417);
  uVar5 = (ulong)bVar9;
  uVar7 = *(ulong *)(unaff_x20 + 0x408);
  uVar3 = uVar7;
  lVar2 = *(long *)(unaff_x20 + 0x400);
  if (-1 < (char)bVar9) {
    uVar3 = uVar5;
    lVar2 = unaff_x21;
  }
  uVar1 = uVar3 + 1;
  if (uVar3 == 0xffffffffffffffff) {
    lVar13 = 0;
  }
  else {
    lVar13 = func_0x00704c24(*(undefined8 *)(unaff_x20 + 0xd8),uVar1);
    uVar7 = 0;
    if ((uVar1 < 8) || ((ulong)(lVar13 - lVar2) < 0x40)) {
LAB_0071b170:
      lVar12 = (uVar3 - uVar7) + 1;
      puVar6 = (undefined1 *)(lVar13 + uVar7);
      puVar11 = (undefined1 *)(lVar2 + uVar7);
      do {
        *puVar6 = *puVar11;
        lVar12 = lVar12 + -1;
        puVar6 = puVar6 + 1;
        puVar11 = puVar11 + 1;
      } while (lVar12 != 0);
    }
    else if (uVar1 < 0x40) {
      uVar5 = 0;
LAB_0071b144:
      uVar7 = uVar1 & 0xfffffffffffffff8;
      lVar12 = uVar5 - uVar7;
      puVar8 = (undefined8 *)(lVar13 + uVar5);
      puVar10 = (undefined8 *)(lVar2 + uVar5);
      do {
        *puVar8 = *puVar10;
        lVar12 = lVar12 + 8;
        puVar8 = puVar8 + 1;
        puVar10 = puVar10 + 1;
      } while (lVar12 != 0);
      if (uVar1 != uVar7) goto LAB_0071b170;
    }
    else {
      uVar7 = uVar1 & 0xffffffffffffffc0;
      puVar8 = (undefined8 *)(lVar2 + 0x20);
      puVar10 = (undefined8 *)(lVar13 + 0x20);
      uVar5 = uVar7;
      do {
        uVar14 = puVar8[-4];
        uVar16 = puVar8[-1];
        uVar15 = puVar8[-2];
        uVar18 = puVar8[1];
        uVar17 = *puVar8;
        uVar20 = puVar8[3];
        uVar19 = puVar8[2];
        puVar10[-3] = puVar8[-3];
        puVar10[-4] = uVar14;
        puVar10[-1] = uVar16;
        puVar10[-2] = uVar15;
        puVar10[1] = uVar18;
        *puVar10 = uVar17;
        puVar10[3] = uVar20;
        puVar10[2] = uVar19;
        uVar5 = uVar5 - 0x40;
        puVar8 = puVar8 + 8;
        puVar10 = puVar10 + 8;
      } while (uVar5 != 0);
      if (uVar1 != uVar7) {
        uVar5 = uVar7;
        if ((uVar1 & 0x38) == 0) goto LAB_0071b170;
        goto LAB_0071b144;
      }
    }
    bVar9 = *(byte *)(unaff_x20 + 0x417);
    uVar5 = (ulong)bVar9;
    uVar7 = *(ulong *)(unaff_x20 + 0x408);
  }
  if (-1 < (char)bVar9) {
    uVar7 = uVar5;
  }
  func_0x00710d48();
  *unaff_x19 = lVar13;
  unaff_x19[1] = uVar7;
  uVar4 = 1;
LAB_0071b1b8:
  *(undefined1 *)(unaff_x19 + 2) = uVar4;
  return;
}

