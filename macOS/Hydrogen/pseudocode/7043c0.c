
void FUN_007043c0(undefined8 param_1)

{
  undefined1 *puVar1;
  short sVar2;
  int iVar3;
  uint uVar4;
  undefined8 *puVar5;
  long *plVar6;
  char *pcVar7;
  char *pcVar8;
  undefined8 *puVar9;
  long lVar10;
  long lVar11;
  long *plVar12;
  undefined8 uVar13;
  double *unaff_x19;
  long unaff_x20;
  double *pdVar14;
  long *unaff_x21;
  long lVar15;
  undefined8 *unaff_x22;
  long lVar16;
  long lVar17;
  double dVar18;
  undefined1 auVar19 [12];
  undefined1 auVar20 [16];
  undefined8 uStack0000000000000008;
  long lStack_78;
  undefined8 *puStack_70;
  double *pdStack_60;
  long lStack_58;
  undefined1 *puStack_50;
  undefined8 uStack_48;
  undefined1 auStack_6 [6];
  
  iVar3 = func_0x006f4d04(param_1,&uStack0000000000000008);
  dVar18 = uStack0000000000000008;
  if ((iVar3 != 0) &&
     ((*(int *)((long)unaff_x21 + 0xc) == 3 ||
      ((*(int *)((long)unaff_x21 + 0xc) == 5 &&
       (iVar3 = func_0x006f4d04(*unaff_x21 + 0x18,&uStack0000000000000008), iVar3 != 0)))))) {
    *unaff_x19 = -dVar18;
    *(undefined4 *)((long)unaff_x19 + 0xc) = 3;
    return;
  }
  puVar5 = (undefined8 *)func_0x006fe794();
  if ((*(int *)((long)puVar5 + 0xc) != 0) ||
     (puVar5 = (undefined8 *)func_0x006fe794(), *(int *)((long)puVar5 + 0xc) != 0)) {
    lVar16 = *(long *)(unaff_x20 + 0x30);
    puVar9 = *(undefined8 **)(unaff_x20 + 8);
    uVar13 = *puVar5;
    puVar9[1] = puVar5[1];
    *puVar9 = uVar13;
    lVar10 = *(long *)(unaff_x20 + 8);
    uVar13 = *unaff_x22;
    *(undefined8 *)(lVar10 + 0x18) = unaff_x22[1];
    *(undefined8 *)(lVar10 + 0x10) = uVar13;
    lVar10 = *(long *)(unaff_x20 + 8);
    lVar11 = *unaff_x21;
    *(long *)(lVar10 + 0x28) = unaff_x21[1];
    *(long *)(lVar10 + 0x20) = lVar11;
    lVar10 = *(long *)(unaff_x20 + 8);
    if (*(long *)(unaff_x20 + 0x28) - lVar10 < 0x31) {
      func_0x006ee1d4();
      lVar10 = *(long *)(unaff_x20 + 8);
    }
    *(long *)(unaff_x20 + 8) = lVar10 + 0x30;
    func_0x006ee550();
    lVar10 = *(long *)(unaff_x20 + 8);
    *(long *)(unaff_x20 + 8) = lVar10 + -0x10;
    uVar13 = *(undefined8 *)(lVar10 + -0x10);
    puVar5 = (undefined8 *)((long)unaff_x19 + (*(long *)(unaff_x20 + 0x30) - lVar16));
    puVar5[1] = *(undefined8 *)(lVar10 + -8);
    *puVar5 = uVar13;
    return;
  }
  plVar12 = (long *)((long)&MACH_HEADER.filetype + 3);
  auVar20 = func_0x006ecf88();
  pdVar14 = auVar20._8_8_;
  lVar10 = auVar20._0_8_;
  puVar1 = auStack_6 + -10;
  if (*(int *)((long)unaff_x21 + 0xc) == 5) {
    dVar18 = (double)NEON_ucvtf((ulong)*(uint *)(*unaff_x21 + 0x14));
LAB_00704580:
    *pdVar14 = dVar18;
    *(undefined4 *)((long)pdVar14 + 0xc) = 3;
    return;
  }
  if (*(int *)((long)unaff_x21 + 0xc) == 6) {
    unaff_x22 = (undefined8 *)*unaff_x21;
    lVar16 = unaff_x22[2];
    if (((lVar16 == 0) || ((*(byte *)(lVar16 + 3) >> 6 & 1) != 0)) ||
       (puVar5 = (undefined8 *)
                 func_0x006fe740(lVar16,6,*(undefined8 *)(*(long *)(lVar10 + 0x18) + 0x408)),
       puVar5 == (undefined8 *)0x0)) {
      iVar3 = func_0x006fc150(unaff_x22);
      dVar18 = (double)iVar3;
      goto LAB_00704580;
    }
  }
  else {
    puVar5 = (undefined8 *)func_0x006fe794(lVar10,unaff_x21,6);
  }
  if (*(int *)((long)puVar5 + 0xc) == 0) {
    pcVar7 = "get length of";
    func_0x006ece80(lVar10,unaff_x21);
  }
  else {
    lVar16 = __dyld_get_image_header(0);
    unaff_x22 = *(undefined8 **)(lVar10 + 0x30);
    puVar9 = *(undefined8 **)(lVar10 + 8);
    uVar13 = *puVar5;
    puVar9[1] = puVar5[1];
    *puVar9 = uVar13;
    lVar11 = *(long *)(lVar10 + 8);
    lVar15 = *unaff_x21;
    *(long *)(lVar11 + 0x18) = unaff_x21[1];
    *(long *)(lVar11 + 0x10) = lVar15;
    uVar13 = *(undefined8 *)(lVar16 + 0x4e8dd08);
    lVar11 = *(long *)(lVar10 + 8);
    *(undefined8 *)(lVar11 + 0x28) = *(undefined8 *)(lVar16 + 0x4e8dd10);
    *(undefined8 *)(lVar11 + 0x20) = uVar13;
    lVar16 = *(long *)(lVar10 + 8);
    if (*(long *)(lVar10 + 0x28) - lVar16 < 0x31) {
      func_0x006ee1d4(lVar10,3);
      lVar16 = *(long *)(lVar10 + 8);
    }
    pdVar14 = (double *)((long)pdVar14 - (long)unaff_x22);
    *(long *)(lVar10 + 8) = lVar16 + 0x30;
    pcVar7 = (char *)((long)&MACH_HEADER.magic + 1);
    func_0x006ee550(lVar10);
    puVar5 = (undefined8 *)(*(long *)(lVar10 + 0x30) + (long)pdVar14);
    lVar16 = *(long *)(lVar10 + 8);
    *(long *)(lVar10 + 8) = lVar16 + -0x10;
    uVar13 = *(undefined8 *)(lVar16 + -0x10);
    puVar5[1] = *(undefined8 *)(lVar16 + -8);
    *puVar5 = uVar13;
    if (*(int *)((long)puVar5 + 0xc) == 3) {
      return;
    }
  }
  auVar20 = func_0x006eceb0(lVar10,"\'__len\' must return a number");
  plVar6 = auVar20._8_8_;
  uVar13 = auVar20._0_8_;
  uStack_48 = 0x704690;
  puStack_70 = unaff_x22;
  pdStack_60 = pdVar14;
  lStack_58 = lVar10;
  puStack_50 = puVar1;
  if (*(int *)((long)plVar12 + 0xc) == 3) {
LAB_007046ec:
    if (*(int *)((long)plVar6 + 0xc) != 3) {
      if ((*(int *)((long)plVar6 + 0xc) != 5) ||
         (iVar3 = func_0x006f4d04(*plVar6 + 0x18,&lStack_78), iVar3 == 0)) goto LAB_00704784;
      *plVar6 = lStack_78;
      *(undefined4 *)((long)plVar6 + 0xc) = 3;
    }
    if (*(int *)((long)pcVar7 + 0xc) == 3) {
      return;
    }
    if ((*(int *)((long)pcVar7 + 0xc) == 5) &&
       (iVar3 = func_0x006f4d04(*(long *)pcVar7 + 0x18,&lStack_78), iVar3 != 0)) {
      *(long *)pcVar7 = lStack_78;
      pcVar7 = (char *)((long)pcVar7 + 0xc);
      pcVar7[0] = '\x03';
      pcVar7[1] = '\0';
      pcVar7[2] = '\0';
      pcVar7[3] = '\0';
      return;
    }
  }
  else {
    if ((*(int *)((long)plVar12 + 0xc) == 5) &&
       (iVar3 = func_0x006f4d04(*plVar12 + 0x18,&lStack_78), iVar3 != 0)) {
      *plVar12 = lStack_78;
      *(undefined4 *)((long)plVar12 + 0xc) = 3;
      goto LAB_007046ec;
    }
    func_0x006ecf14(uVar13,plVar12,"initial value");
LAB_00704784:
    func_0x006ecf14(uVar13,plVar6,"limit");
  }
  pcVar8 = "step";
  auVar19 = func_0x006ecf14(uVar13,pcVar7);
  lVar10 = auVar19._0_8_;
  sVar2 = *(short *)(lVar10 + 0x52);
  *(short *)(lVar10 + 0x52) = sVar2 + 1;
  if ((ushort)(sVar2 + 1U) < 200) {
    lVar16 = *(long *)(lVar10 + 8);
    if (*(long *)(lVar10 + 0x28) - lVar16 < 0x141) goto LAB_00704838;
LAB_007047f8:
    lVar15 = lVar16 + (long)auVar19._8_4_ * -0x10;
    lVar17 = lVar15 + -0x10;
    lVar11 = *(long *)(lVar10 + 0x20);
    if (lVar11 == *(long *)(lVar10 + 0x38)) goto LAB_00704860;
  }
  else {
    func_0x006ee2cc(lVar10);
    lVar16 = *(long *)(lVar10 + 8);
    if (0x140 < *(long *)(lVar10 + 0x28) - lVar16) goto LAB_007047f8;
LAB_00704838:
    func_0x006ee1d4(lVar10,0x14);
    lVar16 = *(long *)(lVar10 + 8);
    lVar15 = lVar16 + (long)auVar19._8_4_ * -0x10;
    lVar17 = lVar15 + -0x10;
    lVar11 = *(long *)(lVar10 + 0x20);
    if (lVar11 == *(long *)(lVar10 + 0x38)) {
LAB_00704860:
      plVar12 = (long *)func_0x006ee1f8(lVar10);
      goto LAB_00704868;
    }
  }
  plVar12 = (long *)(lVar11 + 0x28);
  *(long **)(lVar10 + 0x20) = plVar12;
LAB_00704868:
  *plVar12 = lVar15;
  plVar12[1] = lVar17;
  plVar12[2] = lVar16 + 0x140;
  plVar12[3] = 0;
  *(uint *)(plVar12 + 4) = ~(uint)pcVar8 >> 0x1f;
  *(undefined4 *)((long)plVar12 + 0x24) = 0;
  *(long *)(lVar10 + 0x10) = lVar15;
  uVar4 = (**(code **)(*(long *)(lVar15 + -0x10) + 0x18))(lVar10);
  lVar16 = *(long *)(lVar10 + 0x20);
  plVar12 = (long *)(lVar16 + -0x28);
  if (-1 < (int)(uint)pcVar8) {
    if ((int)uVar4 < 1) {
      *(undefined4 *)(*plVar12 + ((ulong)pcVar8 & 0xffffffff) * 0x10 + 0xc) = 0;
    }
    else {
      puVar9 = (undefined8 *)(*(long *)(lVar10 + 8) + (ulong)uVar4 * -0x10);
      uVar13 = *puVar9;
      puVar5 = (undefined8 *)(*plVar12 + ((ulong)pcVar8 & 0xffffffff) * 0x10);
      puVar5[1] = puVar9[1];
      *puVar5 = uVar13;
    }
  }
  *(long **)(lVar10 + 0x20) = plVar12;
  uVar13 = *(undefined8 *)(lVar16 + -0x28);
  *(undefined8 *)(lVar10 + 8) = *(undefined8 *)(lVar16 + -0x18);
  *(undefined8 *)(lVar10 + 0x10) = uVar13;
  *(short *)(lVar10 + 0x52) = *(short *)(lVar10 + 0x52) + -1;
  return;
}

