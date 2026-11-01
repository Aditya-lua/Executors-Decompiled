
void FUN_00704094(void)

{
  int iVar1;
  short sVar2;
  int iVar3;
  uint uVar4;
  undefined8 *puVar5;
  undefined8 *puVar6;
  double dVar7;
  double *pdVar8;
  long *plVar9;
  char *pcVar10;
  char *pcVar11;
  double *pdVar12;
  long *plVar13;
  float fVar14;
  undefined8 *puVar15;
  long lVar16;
  long lVar17;
  long *plVar18;
  undefined8 uVar19;
  double *pdVar20;
  long *unaff_x21;
  long lVar21;
  double *pdVar22;
  long lVar23;
  long lVar24;
  double *unaff_x24;
  undefined1 auVar25 [16];
  undefined1 auVar26 [16];
  undefined1 auVar27 [12];
  long lStack_118;
  double *pdStack_110;
  long *plStack_108;
  double *pdStack_100;
  long lStack_f8;
  undefined1 ***pppuStack_f0;
  undefined *puStack_e8;
  double *pdStack_e0;
  double *pdStack_d8;
  double *pdStack_d0;
  long *plStack_c8;
  undefined1 auStack_c0 [16];
  undefined1 **ppuStack_b0;
  undefined *puStack_a8;
  double dStack_a0;
  double dStack_98;
  double *pdStack_90;
  long *plStack_88;
  long *plStack_80;
  double *pdStack_78;
  undefined8 *puStack_70;
  long lStack_68;
  undefined1 *puStack_60;
  undefined8 uStack_58;
  double dStack_50;
  double dStack_48;
  undefined1 auStack_6 [6];
  
  pdVar12 = (double *)((long)&MACH_HEADER.filetype + 1);
  auVar25 = func_0x006ecf88();
  puVar6 = auVar25._8_8_;
  lVar17 = auVar25._0_8_;
  iVar3 = *(int *)((long)unaff_x21 + 0xc);
  iVar1 = *(int *)((long)pdVar12 + 0xc);
  if ((unaff_x21 == (long *)0x0 || iVar3 != 4) || (pdVar12 == (double *)0x0 || iVar1 != 4)) {
    if (unaff_x21 == (long *)0x0 || iVar3 != 4) {
      if (((iVar3 != 3 && (pdVar12 != (double *)0x0 && iVar1 == 4)) && (iVar3 == 5)) &&
         (iVar3 = func_0x006f4d04(*unaff_x21 + 0x18,&dStack_48), iVar3 != 0)) {
        dStack_50 = dStack_48;
      }
    }
    else if ((iVar1 != 3) && (iVar1 == 5)) {
      func_0x006f4d04((long)*pdVar12 + 0x18,&dStack_48);
    }
  }
  pdVar20 = (double *)unaff_x21;
  if (*(int *)((long)unaff_x21 + 0xc) == 3) {
LAB_00704190:
    if (*(int *)((long)pdVar12 + 0xc) == 3) {
      unaff_x24 = pdVar12;
LAB_00704284:
      uVar19 = _pow(*pdVar20,*unaff_x24);
      *puVar6 = uVar19;
      *(undefined4 *)((long)puVar6 + 0xc) = 3;
      return;
    }
    if (*(int *)((long)pdVar12 + 0xc) == 5) {
      unaff_x24 = &dStack_48;
      iVar3 = func_0x006f4d04((long)*pdVar12 + 0x18,&dStack_48);
      if (iVar3 != 0) goto LAB_00704284;
    }
  }
  else if ((*(int *)((long)unaff_x21 + 0xc) == 5) &&
          (iVar3 = func_0x006f4d04(*unaff_x21 + 0x18,&dStack_48), iVar3 != 0)) {
    dStack_50 = dStack_48;
    pdVar20 = &dStack_50;
    goto LAB_00704190;
  }
  puVar5 = (undefined8 *)func_0x006fe794(lVar17,unaff_x21,0xe);
  if ((*(int *)((long)puVar5 + 0xc) != 0) ||
     (puVar5 = (undefined8 *)func_0x006fe794(lVar17,pdVar12,0xe), *(int *)((long)puVar5 + 0xc) != 0)
     ) {
    lVar23 = *(long *)(lVar17 + 0x30);
    puVar15 = *(undefined8 **)(lVar17 + 8);
    uVar19 = *puVar5;
    puVar15[1] = puVar5[1];
    *puVar15 = uVar19;
    lVar16 = *(long *)(lVar17 + 8);
    lVar21 = *unaff_x21;
    *(long *)(lVar16 + 0x18) = unaff_x21[1];
    *(long *)(lVar16 + 0x10) = lVar21;
    lVar16 = *(long *)(lVar17 + 8);
    dVar7 = *pdVar12;
    *(double *)(lVar16 + 0x28) = pdVar12[1];
    *(double *)(lVar16 + 0x20) = dVar7;
    lVar16 = *(long *)(lVar17 + 8);
    if (*(long *)(lVar17 + 0x28) - lVar16 < 0x31) {
      func_0x006ee1d4(lVar17,3);
      lVar16 = *(long *)(lVar17 + 8);
    }
    *(long *)(lVar17 + 8) = lVar16 + 0x30;
    func_0x006ee550(lVar17,lVar16,1);
    lVar16 = *(long *)(lVar17 + 8);
    *(long *)(lVar17 + 8) = lVar16 + -0x10;
    uVar19 = *(undefined8 *)(lVar16 + -0x10);
    puVar6 = (undefined8 *)((long)puVar6 + (*(long *)(lVar17 + 0x30) - lVar23));
    puVar6[1] = *(undefined8 *)(lVar16 + -8);
    *puVar6 = uVar19;
    return;
  }
  plVar18 = (long *)((long)&MACH_HEADER.filetype + 2);
  pdVar22 = pdVar12;
  auVar25 = func_0x006ecf88(lVar17,unaff_x21);
  pdVar8 = auVar25._8_8_;
  lVar16 = auVar25._0_8_;
  pdStack_90 = unaff_x24;
  plStack_88 = (long *)pdVar20;
  plStack_80 = unaff_x21;
  pdStack_78 = pdVar12;
  puStack_70 = puVar6;
  lStack_68 = lVar17;
  puStack_60 = auStack_6 + -10;
  uStack_58 = 0x7042c8;
  iVar3 = *(int *)((long)pdVar22 + 0xc);
  pdVar12 = pdVar22;
  if (iVar3 != 4) {
    pdVar12 = (double *)0x0;
  }
  iVar1 = *(int *)((long)plVar18 + 0xc);
  if (pdVar12 != (double *)0x0 && (plVar18 != (long *)0x0 && iVar1 == 4)) {
    *(float *)pdVar8 = -*(float *)pdVar12;
    *(float *)((long)pdVar8 + 4) = -*(float *)((long)pdVar12 + 4);
    *(float *)(pdVar8 + 1) = -*(float *)(pdVar12 + 1);
    fVar14 = 5.60519e-45;
    goto code_r0x00704410;
  }
  if (pdVar12 == (double *)0x0) {
    if (((iVar3 != 3 && (plVar18 != (long *)0x0 && iVar1 == 4)) && (iVar3 == 5)) &&
       (iVar3 = func_0x006f4d04((long)*pdVar22 + 0x18,&dStack_98), iVar3 != 0)) {
      dStack_a0 = dStack_98;
    }
  }
  else if ((iVar1 != 3) && (iVar1 == 5)) {
    func_0x006f4d04(*plVar18 + 0x18,&dStack_98);
  }
  pdVar12 = pdVar22;
  if (*(int *)((long)pdVar22 + 0xc) == 3) {
code_r0x007043d8:
    if ((*(int *)((long)plVar18 + 0xc) == 3) ||
       ((*(int *)((long)plVar18 + 0xc) == 5 &&
        (iVar3 = func_0x006f4d04(*plVar18 + 0x18,&dStack_98), iVar3 != 0)))) {
      *pdVar8 = -*pdVar12;
      fVar14 = 4.2039e-45;
code_r0x00704410:
      *(float *)((long)pdVar8 + 0xc) = fVar14;
      return;
    }
  }
  else if ((*(int *)((long)pdVar22 + 0xc) == 5) &&
          (iVar3 = func_0x006f4d04((long)*pdVar22 + 0x18,&dStack_98), iVar3 != 0)) {
    dStack_a0 = dStack_98;
    pdVar12 = &dStack_a0;
    goto code_r0x007043d8;
  }
  puVar6 = (undefined8 *)func_0x006fe794(lVar16,pdVar22,0xf);
  if ((*(int *)((long)puVar6 + 0xc) != 0) ||
     (puVar6 = (undefined8 *)func_0x006fe794(lVar16,plVar18,0xf), *(int *)((long)puVar6 + 0xc) != 0)
     ) {
    lVar23 = *(long *)(lVar16 + 0x30);
    puVar5 = *(undefined8 **)(lVar16 + 8);
    uVar19 = *puVar6;
    puVar5[1] = puVar6[1];
    *puVar5 = uVar19;
    lVar17 = *(long *)(lVar16 + 8);
    dVar7 = *pdVar22;
    *(double *)(lVar17 + 0x18) = pdVar22[1];
    *(double *)(lVar17 + 0x10) = dVar7;
    lVar17 = *(long *)(lVar16 + 8);
    lVar21 = *plVar18;
    *(long *)(lVar17 + 0x28) = plVar18[1];
    *(long *)(lVar17 + 0x20) = lVar21;
    lVar17 = *(long *)(lVar16 + 8);
    if (*(long *)(lVar16 + 0x28) - lVar17 < 0x31) {
      func_0x006ee1d4(lVar16,3);
      lVar17 = *(long *)(lVar16 + 8);
    }
    *(long *)(lVar16 + 8) = lVar17 + 0x30;
    func_0x006ee550(lVar16,lVar17,1);
    lVar17 = *(long *)(lVar16 + 8);
    *(long *)(lVar16 + 8) = lVar17 + -0x10;
    uVar19 = *(undefined8 *)(lVar17 + -0x10);
    puVar6 = (undefined8 *)((long)pdVar8 + (*(long *)(lVar16 + 0x30) - lVar23));
    puVar6[1] = *(undefined8 *)(lVar17 + -8);
    *puVar6 = uVar19;
    return;
  }
  plVar13 = (long *)((long)&MACH_HEADER.filetype + 3);
  plVar9 = plVar18;
  auVar26 = func_0x006ecf88(lVar16,pdVar22);
  pdVar20 = auVar26._8_8_;
  lVar17 = auVar26._0_8_;
  puStack_a8 = &DAT_00704504;
  if (*(int *)((long)plVar9 + 0xc) == 5) {
    dVar7 = (double)NEON_ucvtf((ulong)*(uint *)(*plVar9 + 0x14));
    goto code_r0x00704580;
  }
  pdStack_e0 = unaff_x24;
  pdStack_d8 = pdVar12;
  pdStack_d0 = pdVar22;
  plStack_c8 = plVar18;
  ppuStack_b0 = &puStack_60;
  auStack_c0 = auVar25;
  if (*(int *)((long)plVar9 + 0xc) == 6) {
    pdVar22 = (double *)*plVar9;
    dVar7 = pdVar22[2];
    if ((dVar7 != 0.0) && ((*(byte *)((long)dVar7 + 3) >> 6 & 1) == 0)) {
      puVar6 = (undefined8 *)
               func_0x006fe740(dVar7,6,*(undefined8 *)(*(long *)(lVar17 + 0x18) + 0x408));
      if (puVar6 != (undefined8 *)0x0) goto code_r0x007045b4;
    }
    iVar3 = func_0x006fc150(pdVar22);
    dVar7 = (double)iVar3;
code_r0x00704580:
    *pdVar20 = dVar7;
    *(undefined4 *)((long)pdVar20 + 0xc) = 3;
    return;
  }
  puVar6 = (undefined8 *)func_0x006fe794(lVar17,plVar9,6);
code_r0x007045b4:
  if (*(int *)((long)puVar6 + 0xc) == 0) {
    pcVar10 = "get length of";
    func_0x006ece80(lVar17,plVar9);
  }
  else {
    lVar16 = __dyld_get_image_header(0);
    pdVar22 = *(double **)(lVar17 + 0x30);
    puVar5 = *(undefined8 **)(lVar17 + 8);
    uVar19 = *puVar6;
    puVar5[1] = puVar6[1];
    *puVar5 = uVar19;
    lVar23 = *(long *)(lVar17 + 8);
    lVar21 = *plVar9;
    *(long *)(lVar23 + 0x18) = plVar9[1];
    *(long *)(lVar23 + 0x10) = lVar21;
    uVar19 = *(undefined8 *)(lVar16 + 0x4e8dd08);
    lVar23 = *(long *)(lVar17 + 8);
    *(undefined8 *)(lVar23 + 0x28) = *(undefined8 *)(lVar16 + 0x4e8dd10);
    *(undefined8 *)(lVar23 + 0x20) = uVar19;
    lVar16 = *(long *)(lVar17 + 8);
    if (*(long *)(lVar17 + 0x28) - lVar16 < 0x31) {
      func_0x006ee1d4(lVar17,3);
      lVar16 = *(long *)(lVar17 + 8);
    }
    pdVar20 = (double *)((long)pdVar20 - (long)pdVar22);
    *(long *)(lVar17 + 8) = lVar16 + 0x30;
    pcVar10 = (char *)((long)&MACH_HEADER.magic + 1);
    func_0x006ee550(lVar17);
    puVar6 = (undefined8 *)(*(long *)(lVar17 + 0x30) + (long)pdVar20);
    lVar16 = *(long *)(lVar17 + 8);
    *(long *)(lVar17 + 8) = lVar16 + -0x10;
    uVar19 = *(undefined8 *)(lVar16 + -0x10);
    puVar6[1] = *(undefined8 *)(lVar16 + -8);
    *puVar6 = uVar19;
    if (*(int *)((long)puVar6 + 0xc) == 3) {
      return;
    }
  }
  auVar25 = func_0x006eceb0(lVar17,"\'__len\' must return a number");
  plVar18 = auVar25._8_8_;
  uVar19 = auVar25._0_8_;
  puStack_e8 = &DAT_00704690;
  pdStack_110 = pdVar22;
  plStack_108 = plVar9;
  pdStack_100 = pdVar20;
  lStack_f8 = lVar17;
  pppuStack_f0 = &ppuStack_b0;
  if (*(int *)((long)plVar13 + 0xc) == 3) {
code_r0x007046ec:
    if (*(int *)((long)plVar18 + 0xc) != 3) {
      if (*(int *)((long)plVar18 + 0xc) == 5) {
        iVar3 = func_0x006f4d04(*plVar18 + 0x18,&lStack_118);
        if (iVar3 != 0) {
          *plVar18 = lStack_118;
          *(undefined4 *)((long)plVar18 + 0xc) = 3;
          goto code_r0x00704724;
        }
      }
      goto code_r0x00704784;
    }
code_r0x00704724:
    if (*(int *)((long)pcVar10 + 0xc) == 3) {
      return;
    }
    if (*(int *)((long)pcVar10 + 0xc) == 5) {
      iVar3 = func_0x006f4d04(*(long *)pcVar10 + 0x18,&lStack_118);
      if (iVar3 != 0) {
        *(long *)pcVar10 = lStack_118;
        pcVar10 = (char *)((long)pcVar10 + 0xc);
        pcVar10[0] = '\x03';
        pcVar10[1] = '\0';
        pcVar10[2] = '\0';
        pcVar10[3] = '\0';
        return;
      }
    }
  }
  else {
    if (*(int *)((long)plVar13 + 0xc) == 5) {
      iVar3 = func_0x006f4d04(*plVar13 + 0x18,&lStack_118);
      if (iVar3 != 0) {
        *plVar13 = lStack_118;
        *(undefined4 *)((long)plVar13 + 0xc) = 3;
        goto code_r0x007046ec;
      }
    }
    func_0x006ecf14(uVar19,plVar13,"initial value");
code_r0x00704784:
    func_0x006ecf14(uVar19,plVar18,"limit");
  }
  pcVar11 = "step";
  auVar27 = func_0x006ecf14(uVar19,pcVar10);
  lVar17 = auVar27._0_8_;
  sVar2 = *(short *)(lVar17 + 0x52);
  *(short *)(lVar17 + 0x52) = sVar2 + 1;
  if ((ushort)(sVar2 + 1U) < 200) {
    lVar16 = *(long *)(lVar17 + 8);
    if (*(long *)(lVar17 + 0x28) - lVar16 < 0x141) goto code_r0x00704838;
code_r0x007047f8:
    lVar21 = lVar16 + (long)auVar27._8_4_ * -0x10;
    lVar24 = lVar21 + -0x10;
    lVar23 = *(long *)(lVar17 + 0x20);
    if (lVar23 == *(long *)(lVar17 + 0x38)) goto code_r0x00704860;
  }
  else {
    func_0x006ee2cc(lVar17);
    lVar16 = *(long *)(lVar17 + 8);
    if (0x140 < *(long *)(lVar17 + 0x28) - lVar16) goto code_r0x007047f8;
code_r0x00704838:
    func_0x006ee1d4(lVar17,0x14);
    lVar16 = *(long *)(lVar17 + 8);
    lVar21 = lVar16 + (long)auVar27._8_4_ * -0x10;
    lVar24 = lVar21 + -0x10;
    lVar23 = *(long *)(lVar17 + 0x20);
    if (lVar23 == *(long *)(lVar17 + 0x38)) {
code_r0x00704860:
      plVar18 = (long *)func_0x006ee1f8(lVar17);
      goto code_r0x00704868;
    }
  }
  plVar18 = (long *)(lVar23 + 0x28);
  *(long **)(lVar17 + 0x20) = plVar18;
code_r0x00704868:
  *plVar18 = lVar21;
  plVar18[1] = lVar24;
  plVar18[2] = lVar16 + 0x140;
  plVar18[3] = 0;
  *(uint *)(plVar18 + 4) = ~(uint)pcVar11 >> 0x1f;
  *(undefined4 *)((long)plVar18 + 0x24) = 0;
  *(long *)(lVar17 + 0x10) = lVar21;
  uVar4 = (**(code **)(*(long *)(lVar21 + -0x10) + 0x18))(lVar17);
  lVar16 = *(long *)(lVar17 + 0x20);
  plVar18 = (long *)(lVar16 + -0x28);
  if (-1 < (int)(uint)pcVar11) {
    if ((int)uVar4 < 1) {
      *(undefined4 *)(*plVar18 + ((ulong)pcVar11 & 0xffffffff) * 0x10 + 0xc) = 0;
    }
    else {
      puVar5 = (undefined8 *)(*(long *)(lVar17 + 8) + (ulong)uVar4 * -0x10);
      uVar19 = *puVar5;
      puVar6 = (undefined8 *)(*plVar18 + ((ulong)pcVar11 & 0xffffffff) * 0x10);
      puVar6[1] = puVar5[1];
      *puVar6 = uVar19;
    }
  }
  *(long **)(lVar17 + 0x20) = plVar18;
  uVar19 = *(undefined8 *)(lVar16 + -0x28);
  *(undefined8 *)(lVar17 + 8) = *(undefined8 *)(lVar16 + -0x18);
  *(undefined8 *)(lVar17 + 0x10) = uVar19;
  *(short *)(lVar17 + 0x52) = *(short *)(lVar17 + 0x52) + -1;
  return;
}

