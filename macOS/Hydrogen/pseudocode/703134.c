
/* WARNING: Type propagation algorithm not settling */

void FUN_00703134(long param_1,undefined8 param_2,undefined8 param_3,double *param_4,dword *param_5)

{
  dword dVar1;
  dword dVar2;
  short sVar3;
  int iVar4;
  uint uVar5;
  undefined8 *puVar6;
  double *pdVar7;
  float *pfVar8;
  dword *pdVar9;
  dword *pdVar10;
  double *pdVar11;
  dword *pdVar12;
  long *plVar13;
  char *pcVar14;
  char *pcVar15;
  double *pdVar16;
  dword *pdVar17;
  long *plVar18;
  undefined8 *puVar19;
  long lVar20;
  undefined8 *puVar21;
  long lVar22;
  long in_x9;
  long *plVar23;
  undefined8 uVar24;
  double *pdVar25;
  long lVar26;
  dword *pdVar27;
  long lVar28;
  dword *pdVar29;
  long lVar30;
  dword *unaff_x24;
  double *pdVar31;
  float fVar32;
  double dVar33;
  float fVar34;
  undefined1 auVar35 [16];
  undefined1 auVar36 [16];
  undefined1 auVar37 [12];
  long lStack_2f8;
  dword *pdStack_2f0;
  long *plStack_2e8;
  double *pdStack_2e0;
  long lStack_2d8;
  undefined8 *******pppppppuStack_2d0;
  undefined *puStack_2c8;
  dword *pdStack_2c0;
  dword *pdStack_2b8;
  dword *pdStack_2b0;
  long *plStack_2a8;
  undefined1 auStack_2a0 [16];
  undefined8 *******pppppppuStack_290;
  undefined *puStack_288;
  double dStack_280;
  double dStack_278;
  dword *pdStack_270;
  dword *pdStack_268;
  dword *pdStack_260;
  dword *pdStack_258;
  undefined8 *puStack_250;
  long lStack_248;
  long ******pppppplStack_240;
  undefined *puStack_238;
  double dStack_230;
  double dStack_228;
  dword *pdStack_220;
  dword *pdStack_218;
  dword *pdStack_210;
  dword *pdStack_208;
  double *pdStack_200;
  long lStack_1f8;
  undefined1 ******ppppppuStack_1f0;
  undefined *puStack_1e8;
  double dStack_1e0;
  double dStack_1d8;
  dword *pdStack_1d0;
  dword *pdStack_1c8;
  dword *pdStack_1c0;
  dword *pdStack_1b8;
  undefined1 auStack_1b0 [16];
  undefined1 *****pppppuStack_1a0;
  undefined *puStack_198;
  double dStack_190;
  double dStack_188;
  dword *pdStack_180;
  double *pdStack_178;
  double *pdStack_170;
  dword *pdStack_168;
  undefined1 auStack_160 [16];
  undefined1 ****ppppuStack_150;
  undefined *puStack_148;
  double dStack_140;
  double dStack_138;
  double *pdStack_130;
  dword *pdStack_128;
  dword *pdStack_120;
  double *pdStack_118;
  undefined1 auStack_110 [16];
  undefined1 ***pppuStack_100;
  undefined *puStack_f8;
  double dStack_f0;
  double dStack_e8;
  dword *pdStack_e0;
  dword *pdStack_d8;
  dword *pdStack_d0;
  dword *pdStack_c8;
  undefined1 auStack_c0 [16];
  undefined1 **ppuStack_b0;
  undefined *puStack_a8;
  double dStack_a0;
  double dStack_98;
  dword *pdStack_90;
  double *pdStack_88;
  double *pdStack_80;
  dword *pdStack_78;
  undefined1 auStack_70 [16];
  undefined1 *puStack_60;
  undefined8 uStack_58;
  double dStack_50;
  double dStack_48;
  undefined1 auStack_6 [6];
  
  if (**(long **)(in_x9 + 0x1e8) == param_1) {
    return;
  }
  auVar35 = ___stack_chk_fail();
  pdVar16 = auVar35._8_8_;
  lVar22 = auVar35._0_8_;
  fVar34 = *(float *)((long)param_4 + 0xc);
  pdVar25 = param_4;
  if (fVar34 != 5.60519e-45) {
    pdVar25 = (double *)0x0;
  }
  dVar1 = param_5[3];
  pdVar29 = param_5;
  if (dVar1 != 4) {
    pdVar29 = (dword *)0x0;
  }
  if (pdVar25 != (double *)0x0 && pdVar29 != (dword *)0x0) {
    *(float *)pdVar16 = *(float *)pdVar25 + (float)*pdVar29;
    *(float *)((long)pdVar16 + 4) = *(float *)((long)pdVar25 + 4) + (float)pdVar29[1];
    *(float *)(pdVar16 + 1) = *(float *)(pdVar25 + 1) + (float)pdVar29[2];
    fVar34 = 5.60519e-45;
    goto LAB_007033a4;
  }
  if (pdVar25 == (double *)0x0) {
    if (((fVar34 != 4.2039e-45 && pdVar29 != (dword *)0x0) && (fVar34 == 7.00649e-45)) &&
       (iVar4 = func_0x006f4d04((long)*param_4 + 0x18,&dStack_48), iVar4 != 0)) {
      dStack_50 = dStack_48;
    }
  }
  else if ((dVar1 != 3) && (dVar1 == 5)) {
    func_0x006f4d04(*(long *)param_5 + 0x18,&dStack_48);
  }
  pdVar25 = param_4;
  if (*(float *)((long)param_4 + 0xc) == 4.2039e-45) {
LAB_0070329c:
    if (param_5[3] == 3) {
      unaff_x24 = param_5;
LAB_00703390:
      *pdVar16 = *pdVar25 + *(double *)unaff_x24;
      fVar34 = 4.2039e-45;
LAB_007033a4:
      *(float *)((long)pdVar16 + 0xc) = fVar34;
      return;
    }
    if (param_5[3] == 5) {
      unaff_x24 = (dword *)&dStack_48;
      iVar4 = func_0x006f4d04(*(long *)param_5 + 0x18,&dStack_48);
      if (iVar4 != 0) goto LAB_00703390;
    }
  }
  else if ((*(float *)((long)param_4 + 0xc) == 7.00649e-45) &&
          (iVar4 = func_0x006f4d04((long)*param_4 + 0x18,&dStack_48), iVar4 != 0)) {
    dStack_50 = dStack_48;
    pdVar25 = &dStack_50;
    goto LAB_0070329c;
  }
  puVar6 = (undefined8 *)func_0x006fe794(lVar22,param_4,8);
  if ((*(int *)((long)puVar6 + 0xc) != 0) ||
     (puVar6 = (undefined8 *)func_0x006fe794(lVar22,param_5,8), *(int *)((long)puVar6 + 0xc) != 0))
  {
    lVar28 = *(long *)(lVar22 + 0x30);
    puVar19 = *(undefined8 **)(lVar22 + 8);
    uVar24 = *puVar6;
    puVar19[1] = puVar6[1];
    *puVar19 = uVar24;
    lVar20 = *(long *)(lVar22 + 8);
    dVar33 = *param_4;
    *(double *)(lVar20 + 0x18) = param_4[1];
    *(double *)(lVar20 + 0x10) = dVar33;
    lVar20 = *(long *)(lVar22 + 8);
    uVar24 = *(undefined8 *)param_5;
    *(undefined8 *)(lVar20 + 0x28) = *(undefined8 *)(param_5 + 2);
    *(undefined8 *)(lVar20 + 0x20) = uVar24;
    lVar20 = *(long *)(lVar22 + 8);
    if (*(long *)(lVar22 + 0x28) - lVar20 < 0x31) {
      func_0x006ee1d4(lVar22,3);
      lVar20 = *(long *)(lVar22 + 8);
    }
    *(long *)(lVar22 + 8) = lVar20 + 0x30;
    func_0x006ee550(lVar22,lVar20,1);
    lVar20 = *(long *)(lVar22 + 8);
    *(long *)(lVar22 + 8) = lVar20 + -0x10;
    uVar24 = *(undefined8 *)(lVar20 + -0x10);
    puVar6 = (undefined8 *)((long)pdVar16 + (*(long *)(lVar22 + 0x30) - lVar28));
    puVar6[1] = *(undefined8 *)(lVar20 + -8);
    *puVar6 = uVar24;
    return;
  }
  pdVar12 = &MACH_HEADER.cpusubtype;
  pdVar9 = param_5;
  auVar36 = func_0x006ecf88(lVar22,param_4);
  pdVar16 = auVar36._8_8_;
  lVar22 = auVar36._0_8_;
  pdStack_90 = unaff_x24;
  pdStack_88 = pdVar25;
  pdStack_80 = param_4;
  pdStack_78 = param_5;
  auStack_70 = auVar35;
  puStack_60 = auStack_6 + -10;
  uStack_58 = 0x7033d4;
  dVar1 = pdVar9[3];
  pdVar29 = pdVar9;
  if (dVar1 != 4) {
    pdVar29 = (dword *)0x0;
  }
  dVar2 = pdVar12[3];
  pdVar10 = pdVar12;
  if (dVar2 != 4) {
    pdVar10 = (dword *)0x0;
  }
  if (pdVar29 != (dword *)0x0 && pdVar10 != (dword *)0x0) {
    *(float *)pdVar16 = (float)*pdVar29 - (float)*pdVar10;
    *(float *)((long)pdVar16 + 4) = (float)pdVar29[1] - (float)pdVar10[1];
    *(float *)(pdVar16 + 1) = (float)pdVar29[2] - (float)pdVar10[2];
    fVar34 = 5.60519e-45;
    goto code_r0x007035f0;
  }
  if (pdVar29 == (dword *)0x0) {
    if ((dVar1 != 3 && pdVar10 != (dword *)0x0) && (dVar1 == 5)) {
      iVar4 = func_0x006f4d04(*(long *)pdVar9 + 0x18,&dStack_98);
      if (iVar4 != 0) {
        dStack_a0 = dStack_98;
      }
    }
  }
  else if ((dVar2 != 3) && (dVar2 == 5)) {
    func_0x006f4d04(*(long *)pdVar12 + 0x18,&dStack_98);
  }
  pdVar29 = pdVar9;
  if (pdVar9[3] == 3) {
code_r0x007034e8:
    if (pdVar12[3] == 3) {
      unaff_x24 = pdVar12;
code_r0x007035dc:
      *pdVar16 = *(double *)pdVar29 - *(double *)unaff_x24;
      fVar34 = 4.2039e-45;
code_r0x007035f0:
      *(float *)((long)pdVar16 + 0xc) = fVar34;
      return;
    }
    if (pdVar12[3] == 5) {
      unaff_x24 = (dword *)&dStack_98;
      iVar4 = func_0x006f4d04(*(long *)pdVar12 + 0x18,&dStack_98);
      if (iVar4 != 0) goto code_r0x007035dc;
    }
  }
  else if (pdVar9[3] == 5) {
    iVar4 = func_0x006f4d04(*(long *)pdVar9 + 0x18,&dStack_98);
    if (iVar4 != 0) {
      dStack_a0 = dStack_98;
      pdVar29 = (dword *)&dStack_a0;
      goto code_r0x007034e8;
    }
  }
  puVar6 = (undefined8 *)func_0x006fe794(lVar22,pdVar9,9);
  if (*(int *)((long)puVar6 + 0xc) != 0) {
code_r0x00703544:
    lVar28 = *(long *)(lVar22 + 0x30);
    puVar19 = *(undefined8 **)(lVar22 + 8);
    uVar24 = *puVar6;
    puVar19[1] = puVar6[1];
    *puVar19 = uVar24;
    lVar20 = *(long *)(lVar22 + 8);
    uVar24 = *(undefined8 *)pdVar9;
    *(undefined8 *)(lVar20 + 0x18) = *(undefined8 *)(pdVar9 + 2);
    *(undefined8 *)(lVar20 + 0x10) = uVar24;
    lVar20 = *(long *)(lVar22 + 8);
    uVar24 = *(undefined8 *)pdVar12;
    *(undefined8 *)(lVar20 + 0x28) = *(undefined8 *)(pdVar12 + 2);
    *(undefined8 *)(lVar20 + 0x20) = uVar24;
    lVar20 = *(long *)(lVar22 + 8);
    if (*(long *)(lVar22 + 0x28) - lVar20 < 0x31) {
      func_0x006ee1d4(lVar22,3);
      lVar20 = *(long *)(lVar22 + 8);
    }
    *(long *)(lVar22 + 8) = lVar20 + 0x30;
    func_0x006ee550(lVar22,lVar20,1);
    lVar20 = *(long *)(lVar22 + 8);
    *(long *)(lVar22 + 8) = lVar20 + -0x10;
    uVar24 = *(undefined8 *)(lVar20 + -0x10);
    puVar6 = (undefined8 *)((long)pdVar16 + (*(long *)(lVar22 + 0x30) - lVar28));
    puVar6[1] = *(undefined8 *)(lVar20 + -8);
    *puVar6 = uVar24;
    return;
  }
  puVar6 = (undefined8 *)func_0x006fe794(lVar22,pdVar12,9);
  if (*(int *)((long)puVar6 + 0xc) != 0) goto code_r0x00703544;
  pdVar16 = (double *)((long)&MACH_HEADER.cpusubtype + 1);
  pdVar10 = pdVar12;
  auVar35 = func_0x006ecf88(lVar22,pdVar9);
  pdVar25 = auVar35._8_8_;
  lVar22 = auVar35._0_8_;
  pdStack_e0 = unaff_x24;
  pdStack_d8 = pdVar29;
  pdStack_d0 = pdVar9;
  pdStack_c8 = pdVar12;
  auStack_c0 = auVar36;
  ppuStack_b0 = &puStack_60;
  puStack_a8 = &DAT_00703620;
  dVar1 = pdVar10[3];
  pdVar29 = pdVar10;
  if (dVar1 != 4) {
    pdVar29 = (dword *)0x0;
  }
  iVar4 = *(int *)((long)pdVar16 + 0xc);
  pdVar31 = pdVar16;
  if (iVar4 != 4) {
    pdVar31 = (double *)0x0;
  }
  if (pdVar29 != (dword *)0x0 && pdVar31 != (double *)0x0) {
    *(float *)pdVar25 = (float)*pdVar29 * *(float *)pdVar31;
    *(float *)((long)pdVar25 + 4) = (float)pdVar29[1] * *(float *)((long)pdVar31 + 4);
    fVar34 = (float)pdVar29[2] * *(float *)(pdVar31 + 1);
code_r0x0070374c:
    *(float *)(pdVar25 + 1) = fVar34;
    fVar34 = 5.60519e-45;
    goto code_r0x00703754;
  }
  if (pdVar29 == (dword *)0x0) {
    if (pdVar31 != (double *)0x0) {
      if (dVar1 == 3) {
        dStack_e8 = *(double *)pdVar10;
code_r0x00703728:
        fVar32 = (float)dStack_e8;
        *(float *)pdVar25 = *(float *)pdVar31 * fVar32;
        *(float *)((long)pdVar25 + 4) = *(float *)((long)pdVar31 + 4) * fVar32;
        fVar34 = *(float *)(pdVar31 + 1);
        goto code_r0x00703748;
      }
      if (dVar1 == 5) {
        iVar4 = func_0x006f4d04(*(long *)pdVar10 + 0x18,&dStack_e8);
        if (iVar4 != 0) goto code_r0x00703728;
      }
    }
  }
  else {
    if (iVar4 == 3) {
      dStack_e8 = *pdVar16;
code_r0x007036e4:
      fVar32 = (float)dStack_e8;
      *(float *)pdVar25 = (float)*pdVar29 * fVar32;
      *(float *)((long)pdVar25 + 4) = (float)pdVar29[1] * fVar32;
      fVar34 = (float)pdVar29[2];
code_r0x00703748:
      fVar34 = fVar34 * fVar32;
      goto code_r0x0070374c;
    }
    if (iVar4 == 5) {
      iVar4 = func_0x006f4d04((long)*pdVar16 + 0x18,&dStack_e8);
      if (iVar4 != 0) goto code_r0x007036e4;
    }
  }
  pdVar29 = pdVar10;
  if (pdVar10[3] == 3) {
code_r0x007037a8:
    if (*(int *)((long)pdVar16 + 0xc) == 3) {
      pdVar31 = pdVar16;
code_r0x0070389c:
      *pdVar25 = *(double *)pdVar29 * *pdVar31;
      fVar34 = 4.2039e-45;
code_r0x00703754:
      *(float *)((long)pdVar25 + 0xc) = fVar34;
      return;
    }
    if (*(int *)((long)pdVar16 + 0xc) == 5) {
      pdVar31 = &dStack_e8;
      iVar4 = func_0x006f4d04((long)*pdVar16 + 0x18,&dStack_e8);
      if (iVar4 != 0) goto code_r0x0070389c;
    }
  }
  else if (pdVar10[3] == 5) {
    iVar4 = func_0x006f4d04(*(long *)pdVar10 + 0x18,&dStack_e8);
    if (iVar4 != 0) {
      dStack_f0 = dStack_e8;
      pdVar29 = (dword *)&dStack_f0;
      goto code_r0x007037a8;
    }
  }
  puVar6 = (undefined8 *)func_0x006fe794(lVar22,pdVar10,10);
  if (*(int *)((long)puVar6 + 0xc) != 0) {
code_r0x00703804:
    lVar28 = *(long *)(lVar22 + 0x30);
    puVar19 = *(undefined8 **)(lVar22 + 8);
    uVar24 = *puVar6;
    puVar19[1] = puVar6[1];
    *puVar19 = uVar24;
    lVar20 = *(long *)(lVar22 + 8);
    uVar24 = *(undefined8 *)pdVar10;
    *(undefined8 *)(lVar20 + 0x18) = *(undefined8 *)(pdVar10 + 2);
    *(undefined8 *)(lVar20 + 0x10) = uVar24;
    lVar20 = *(long *)(lVar22 + 8);
    dVar33 = *pdVar16;
    *(double *)(lVar20 + 0x28) = pdVar16[1];
    *(double *)(lVar20 + 0x20) = dVar33;
    lVar20 = *(long *)(lVar22 + 8);
    if (*(long *)(lVar22 + 0x28) - lVar20 < 0x31) {
      func_0x006ee1d4(lVar22,3);
      lVar20 = *(long *)(lVar22 + 8);
    }
    *(long *)(lVar22 + 8) = lVar20 + 0x30;
    func_0x006ee550(lVar22,lVar20,1);
    lVar20 = *(long *)(lVar22 + 8);
    *(long *)(lVar22 + 8) = lVar20 + -0x10;
    uVar24 = *(undefined8 *)(lVar20 + -0x10);
    puVar6 = (undefined8 *)((long)pdVar25 + (*(long *)(lVar22 + 0x30) - lVar28));
    puVar6[1] = *(undefined8 *)(lVar20 + -8);
    *puVar6 = uVar24;
    return;
  }
  puVar6 = (undefined8 *)func_0x006fe794(lVar22,pdVar16,10);
  if (*(int *)((long)puVar6 + 0xc) != 0) goto code_r0x00703804;
  pdVar9 = (dword *)((long)&MACH_HEADER.cpusubtype + 2);
  pdVar11 = pdVar16;
  auVar36 = func_0x006ecf88(lVar22,pdVar10);
  pdVar7 = auVar36._8_8_;
  lVar22 = auVar36._0_8_;
  pdStack_130 = pdVar31;
  pdStack_128 = pdVar29;
  pdStack_120 = pdVar10;
  pdStack_118 = pdVar16;
  auStack_110 = auVar35;
  pppuStack_100 = &ppuStack_b0;
  puStack_f8 = &DAT_007038c8;
  iVar4 = *(int *)((long)pdVar11 + 0xc);
  pdVar25 = pdVar11;
  if (iVar4 != 4) {
    pdVar25 = (double *)0x0;
  }
  dVar1 = pdVar9[3];
  pdVar29 = pdVar9;
  if (dVar1 != 4) {
    pdVar29 = (dword *)0x0;
  }
  if (pdVar25 != (double *)0x0 && pdVar29 != (dword *)0x0) {
    *(float *)pdVar7 = *(float *)pdVar25 / (float)*pdVar29;
    *(float *)((long)pdVar7 + 4) = *(float *)((long)pdVar25 + 4) / (float)pdVar29[1];
    fVar34 = *(float *)(pdVar25 + 1);
code_r0x0070394c:
    fVar34 = fVar34 / (float)pdVar29[2];
code_r0x007039b0:
    *(float *)(pdVar7 + 1) = fVar34;
    fVar34 = 5.60519e-45;
    goto code_r0x007039b8;
  }
  if (pdVar25 == (double *)0x0) {
    if (pdVar29 != (dword *)0x0) {
      if (iVar4 == 3) {
        dStack_138 = *pdVar11;
code_r0x007039f4:
        fVar34 = (float)dStack_138;
        *(float *)pdVar7 = fVar34 / (float)*pdVar29;
        *(float *)((long)pdVar7 + 4) = fVar34 / (float)pdVar29[1];
        goto code_r0x0070394c;
      }
      if (iVar4 == 5) {
        iVar4 = func_0x006f4d04((long)*pdVar11 + 0x18,&dStack_138);
        if (iVar4 != 0) goto code_r0x007039f4;
      }
    }
  }
  else {
    if (dVar1 == 3) {
      dStack_138 = *(double *)pdVar9;
code_r0x0070398c:
      fVar34 = (float)dStack_138;
      *(float *)pdVar7 = *(float *)pdVar25 / fVar34;
      *(float *)((long)pdVar7 + 4) = *(float *)((long)pdVar25 + 4) / fVar34;
      fVar34 = *(float *)(pdVar25 + 1) / fVar34;
      goto code_r0x007039b0;
    }
    if (dVar1 == 5) {
      iVar4 = func_0x006f4d04(*(long *)pdVar9 + 0x18,&dStack_138);
      if (iVar4 != 0) goto code_r0x0070398c;
    }
  }
  pdVar25 = pdVar11;
  if (*(int *)((long)pdVar11 + 0xc) == 3) {
code_r0x00703a4c:
    if (pdVar9[3] == 3) {
      pdVar29 = pdVar9;
code_r0x00703b40:
      *pdVar7 = *pdVar25 / *(double *)pdVar29;
      fVar34 = 4.2039e-45;
code_r0x007039b8:
      *(float *)((long)pdVar7 + 0xc) = fVar34;
      return;
    }
    if (pdVar9[3] == 5) {
      pdVar29 = (dword *)&dStack_138;
      iVar4 = func_0x006f4d04(*(long *)pdVar9 + 0x18,&dStack_138);
      if (iVar4 != 0) goto code_r0x00703b40;
    }
  }
  else if (*(int *)((long)pdVar11 + 0xc) == 5) {
    iVar4 = func_0x006f4d04((long)*pdVar11 + 0x18,&dStack_138);
    if (iVar4 != 0) {
      dStack_140 = dStack_138;
      pdVar25 = &dStack_140;
      goto code_r0x00703a4c;
    }
  }
  puVar6 = (undefined8 *)func_0x006fe794(lVar22,pdVar11,0xb);
  if (*(int *)((long)puVar6 + 0xc) != 0) {
code_r0x00703aa8:
    lVar28 = *(long *)(lVar22 + 0x30);
    puVar19 = *(undefined8 **)(lVar22 + 8);
    uVar24 = *puVar6;
    puVar19[1] = puVar6[1];
    *puVar19 = uVar24;
    lVar20 = *(long *)(lVar22 + 8);
    dVar33 = *pdVar11;
    *(double *)(lVar20 + 0x18) = pdVar11[1];
    *(double *)(lVar20 + 0x10) = dVar33;
    lVar20 = *(long *)(lVar22 + 8);
    uVar24 = *(undefined8 *)pdVar9;
    *(undefined8 *)(lVar20 + 0x28) = *(undefined8 *)(pdVar9 + 2);
    *(undefined8 *)(lVar20 + 0x20) = uVar24;
    lVar20 = *(long *)(lVar22 + 8);
    if (*(long *)(lVar22 + 0x28) - lVar20 < 0x31) {
      func_0x006ee1d4(lVar22,3);
      lVar20 = *(long *)(lVar22 + 8);
    }
    *(long *)(lVar22 + 8) = lVar20 + 0x30;
    func_0x006ee550(lVar22,lVar20,1);
    lVar20 = *(long *)(lVar22 + 8);
    *(long *)(lVar22 + 8) = lVar20 + -0x10;
    uVar24 = *(undefined8 *)(lVar20 + -0x10);
    puVar6 = (undefined8 *)((long)pdVar7 + (*(long *)(lVar22 + 0x30) - lVar28));
    puVar6[1] = *(undefined8 *)(lVar20 + -8);
    *puVar6 = uVar24;
    return;
  }
  puVar6 = (undefined8 *)func_0x006fe794(lVar22,pdVar9,0xb);
  if (*(int *)((long)puVar6 + 0xc) != 0) goto code_r0x00703aa8;
  pdVar10 = (dword *)((long)&MACH_HEADER.cpusubtype + 3);
  pdVar12 = pdVar9;
  auVar35 = func_0x006ecf88(lVar22,pdVar11);
  pfVar8 = auVar35._8_8_;
  lVar22 = auVar35._0_8_;
  pdStack_180 = pdVar29;
  pdStack_178 = pdVar25;
  pdStack_170 = pdVar11;
  pdStack_168 = pdVar9;
  auStack_160 = auVar36;
  ppppuStack_150 = &pppuStack_100;
  puStack_148 = &DAT_00703b6c;
  dVar1 = pdVar12[3];
  pdVar29 = pdVar12;
  if (dVar1 != 4) {
    pdVar29 = (dword *)0x0;
  }
  dVar2 = pdVar10[3];
  pdVar9 = pdVar10;
  if (dVar2 != 4) {
    pdVar9 = (dword *)0x0;
  }
  if (pdVar29 != (dword *)0x0 && pdVar9 != (dword *)0x0) {
    *pfVar8 = (float)(double)(long)((float)*pdVar29 / (float)*pdVar9);
    pfVar8[1] = (float)(double)(long)((float)pdVar29[1] / (float)pdVar9[1]);
    fVar34 = (float)pdVar29[2];
code_r0x00703c14:
    fVar34 = fVar34 / (float)pdVar9[2];
code_r0x00703c9c:
    pfVar8[2] = (float)(double)(long)fVar34;
    fVar34 = 5.60519e-45;
    goto code_r0x00703cac;
  }
  if (pdVar29 == (dword *)0x0) {
    if (pdVar9 != (dword *)0x0) {
      if (dVar1 == 3) {
        dStack_188 = *(double *)pdVar12;
code_r0x00703ce8:
        fVar34 = (float)dStack_188;
        *pfVar8 = (float)(double)(long)(fVar34 / (float)*pdVar9);
        pfVar8[1] = (float)(double)(long)(fVar34 / (float)pdVar9[1]);
        goto code_r0x00703c14;
      }
      if (dVar1 == 5) {
        iVar4 = func_0x006f4d04(*(long *)pdVar12 + 0x18,&dStack_188);
        if (iVar4 != 0) goto code_r0x00703ce8;
      }
    }
  }
  else {
    if (dVar2 == 3) {
      dStack_188 = *(double *)pdVar10;
code_r0x00703c58:
      fVar34 = (float)dStack_188;
      *pfVar8 = (float)(double)(long)((float)*pdVar29 / fVar34);
      pfVar8[1] = (float)(double)(long)((float)pdVar29[1] / fVar34);
      fVar34 = (float)pdVar29[2] / fVar34;
      goto code_r0x00703c9c;
    }
    if (dVar2 == 5) {
      iVar4 = func_0x006f4d04(*(long *)pdVar10 + 0x18,&dStack_188);
      if (iVar4 != 0) goto code_r0x00703c58;
    }
  }
  pdVar9 = pdVar12;
  if (pdVar12[3] == 3) {
code_r0x00703d5c:
    if (pdVar10[3] == 3) {
      pdVar29 = pdVar10;
code_r0x00703e50:
      *(long *)pfVar8 = (long)(*(double *)pdVar9 / *(double *)pdVar29);
      fVar34 = 4.2039e-45;
code_r0x00703cac:
      pfVar8[3] = fVar34;
      return;
    }
    if (pdVar10[3] == 5) {
      pdVar29 = (dword *)&dStack_188;
      iVar4 = func_0x006f4d04(*(long *)pdVar10 + 0x18,&dStack_188);
      if (iVar4 != 0) goto code_r0x00703e50;
    }
  }
  else if (pdVar12[3] == 5) {
    iVar4 = func_0x006f4d04(*(long *)pdVar12 + 0x18,&dStack_188);
    if (iVar4 != 0) {
      dStack_190 = dStack_188;
      pdVar9 = (dword *)&dStack_190;
      goto code_r0x00703d5c;
    }
  }
  puVar6 = (undefined8 *)func_0x006fe794(lVar22,pdVar12,0xc);
  if (*(int *)((long)puVar6 + 0xc) != 0) {
code_r0x00703db8:
    lVar28 = *(long *)(lVar22 + 0x30);
    puVar19 = *(undefined8 **)(lVar22 + 8);
    uVar24 = *puVar6;
    puVar19[1] = puVar6[1];
    *puVar19 = uVar24;
    lVar20 = *(long *)(lVar22 + 8);
    uVar24 = *(undefined8 *)pdVar12;
    *(undefined8 *)(lVar20 + 0x18) = *(undefined8 *)(pdVar12 + 2);
    *(undefined8 *)(lVar20 + 0x10) = uVar24;
    lVar20 = *(long *)(lVar22 + 8);
    uVar24 = *(undefined8 *)pdVar10;
    *(undefined8 *)(lVar20 + 0x28) = *(undefined8 *)(pdVar10 + 2);
    *(undefined8 *)(lVar20 + 0x20) = uVar24;
    lVar20 = *(long *)(lVar22 + 8);
    if (*(long *)(lVar22 + 0x28) - lVar20 < 0x31) {
      func_0x006ee1d4(lVar22,3);
      lVar20 = *(long *)(lVar22 + 8);
    }
    *(long *)(lVar22 + 8) = lVar20 + 0x30;
    func_0x006ee550(lVar22,lVar20,1);
    lVar20 = *(long *)(lVar22 + 8);
    *(long *)(lVar22 + 8) = lVar20 + -0x10;
    uVar24 = *(undefined8 *)(lVar20 + -0x10);
    puVar6 = (undefined8 *)((long)pfVar8 + (*(long *)(lVar22 + 0x30) - lVar28));
    puVar6[1] = *(undefined8 *)(lVar20 + -8);
    *puVar6 = uVar24;
    return;
  }
  puVar6 = (undefined8 *)func_0x006fe794(lVar22,pdVar10,0xc);
  if (*(int *)((long)puVar6 + 0xc) != 0) goto code_r0x00703db8;
  pdVar17 = &MACH_HEADER.filetype;
  pdVar27 = pdVar10;
  auVar36 = func_0x006ecf88(lVar22,pdVar12);
  pdVar25 = auVar36._8_8_;
  lVar22 = auVar36._0_8_;
  pdStack_1d0 = pdVar29;
  pdStack_1c8 = pdVar9;
  pdStack_1c0 = pdVar12;
  pdStack_1b8 = pdVar10;
  auStack_1b0 = auVar35;
  pppppuStack_1a0 = &ppppuStack_150;
  puStack_198 = &DAT_00703e80;
  dVar1 = pdVar27[3];
  dVar2 = pdVar17[3];
  if ((pdVar27 == (dword *)0x0 || dVar1 != 4) || (pdVar17 == (dword *)0x0 || dVar2 != 4)) {
    if (pdVar27 == (dword *)0x0 || dVar1 != 4) {
      if ((dVar1 != 3 && (pdVar17 != (dword *)0x0 && dVar2 == 4)) && (dVar1 == 5)) {
        iVar4 = func_0x006f4d04(*(long *)pdVar27 + 0x18,&dStack_1d8);
        if (iVar4 != 0) {
          dStack_1e0 = dStack_1d8;
        }
      }
    }
    else if ((dVar2 != 3) && (dVar2 == 5)) {
      func_0x006f4d04(*(long *)pdVar17 + 0x18,&dStack_1d8);
    }
  }
  pdVar9 = pdVar27;
  if (pdVar27[3] == 3) {
code_r0x00703f68:
    if (pdVar17[3] == 3) {
      pdVar29 = pdVar17;
code_r0x0070405c:
      *pdVar25 = *(double *)pdVar9 -
                 *(double *)pdVar29 * (double)(long)(*(double *)pdVar9 / *(double *)pdVar29);
      *(undefined4 *)((long)pdVar25 + 0xc) = 3;
      return;
    }
    if (pdVar17[3] == 5) {
      pdVar29 = (dword *)&dStack_1d8;
      iVar4 = func_0x006f4d04(*(long *)pdVar17 + 0x18,&dStack_1d8);
      if (iVar4 != 0) goto code_r0x0070405c;
    }
  }
  else if (pdVar27[3] == 5) {
    iVar4 = func_0x006f4d04(*(long *)pdVar27 + 0x18,&dStack_1d8);
    if (iVar4 != 0) {
      dStack_1e0 = dStack_1d8;
      pdVar9 = (dword *)&dStack_1e0;
      goto code_r0x00703f68;
    }
  }
  puVar6 = (undefined8 *)func_0x006fe794(lVar22,pdVar27,0xd);
  if (*(int *)((long)puVar6 + 0xc) != 0) {
code_r0x00703fc4:
    lVar28 = *(long *)(lVar22 + 0x30);
    puVar19 = *(undefined8 **)(lVar22 + 8);
    uVar24 = *puVar6;
    puVar19[1] = puVar6[1];
    *puVar19 = uVar24;
    lVar20 = *(long *)(lVar22 + 8);
    uVar24 = *(undefined8 *)pdVar27;
    *(undefined8 *)(lVar20 + 0x18) = *(undefined8 *)(pdVar27 + 2);
    *(undefined8 *)(lVar20 + 0x10) = uVar24;
    lVar20 = *(long *)(lVar22 + 8);
    uVar24 = *(undefined8 *)pdVar17;
    *(undefined8 *)(lVar20 + 0x28) = *(undefined8 *)(pdVar17 + 2);
    *(undefined8 *)(lVar20 + 0x20) = uVar24;
    lVar20 = *(long *)(lVar22 + 8);
    if (*(long *)(lVar22 + 0x28) - lVar20 < 0x31) {
      func_0x006ee1d4(lVar22,3);
      lVar20 = *(long *)(lVar22 + 8);
    }
    *(long *)(lVar22 + 8) = lVar20 + 0x30;
    func_0x006ee550(lVar22,lVar20,1);
    lVar20 = *(long *)(lVar22 + 8);
    *(long *)(lVar22 + 8) = lVar20 + -0x10;
    uVar24 = *(undefined8 *)(lVar20 + -0x10);
    puVar6 = (undefined8 *)((long)pdVar25 + (*(long *)(lVar22 + 0x30) - lVar28));
    puVar6[1] = *(undefined8 *)(lVar20 + -8);
    *puVar6 = uVar24;
    return;
  }
  puVar6 = (undefined8 *)func_0x006fe794(lVar22,pdVar17,0xd);
  if (*(int *)((long)puVar6 + 0xc) != 0) goto code_r0x00703fc4;
  pdVar10 = (dword *)((long)&MACH_HEADER.filetype + 1);
  pdVar12 = pdVar17;
  auVar35 = func_0x006ecf88(lVar22,pdVar27);
  puVar6 = auVar35._8_8_;
  lVar20 = auVar35._0_8_;
  pdStack_220 = pdVar29;
  pdStack_218 = pdVar9;
  pdStack_210 = pdVar27;
  pdStack_208 = pdVar17;
  pdStack_200 = pdVar25;
  lStack_1f8 = lVar22;
  ppppppuStack_1f0 = &pppppuStack_1a0;
  puStack_1e8 = &DAT_007040a8;
  dVar1 = pdVar12[3];
  dVar2 = pdVar10[3];
  if ((pdVar12 == (dword *)0x0 || dVar1 != 4) || (pdVar10 == (dword *)0x0 || dVar2 != 4)) {
    if (pdVar12 == (dword *)0x0 || dVar1 != 4) {
      if ((dVar1 != 3 && (pdVar10 != (dword *)0x0 && dVar2 == 4)) && (dVar1 == 5)) {
        iVar4 = func_0x006f4d04(*(long *)pdVar12 + 0x18,&dStack_228);
        if (iVar4 != 0) {
          dStack_230 = dStack_228;
        }
      }
    }
    else if ((dVar2 != 3) && (dVar2 == 5)) {
      func_0x006f4d04(*(long *)pdVar10 + 0x18,&dStack_228);
    }
  }
  pdVar9 = pdVar12;
  if (pdVar12[3] == 3) {
code_r0x00704190:
    if (pdVar10[3] == 3) {
      pdVar29 = pdVar10;
code_r0x00704284:
      uVar24 = _pow(*(undefined8 *)pdVar9,*(undefined8 *)pdVar29);
      *puVar6 = uVar24;
      *(undefined4 *)((long)puVar6 + 0xc) = 3;
      return;
    }
    if (pdVar10[3] == 5) {
      pdVar29 = (dword *)&dStack_228;
      iVar4 = func_0x006f4d04(*(long *)pdVar10 + 0x18,&dStack_228);
      if (iVar4 != 0) goto code_r0x00704284;
    }
  }
  else if (pdVar12[3] == 5) {
    iVar4 = func_0x006f4d04(*(long *)pdVar12 + 0x18,&dStack_228);
    if (iVar4 != 0) {
      dStack_230 = dStack_228;
      pdVar9 = (dword *)&dStack_230;
      goto code_r0x00704190;
    }
  }
  puVar19 = (undefined8 *)func_0x006fe794(lVar20,pdVar12,0xe);
  if (*(int *)((long)puVar19 + 0xc) != 0) {
code_r0x007041ec:
    lVar28 = *(long *)(lVar20 + 0x30);
    puVar21 = *(undefined8 **)(lVar20 + 8);
    uVar24 = *puVar19;
    puVar21[1] = puVar19[1];
    *puVar21 = uVar24;
    lVar22 = *(long *)(lVar20 + 8);
    uVar24 = *(undefined8 *)pdVar12;
    *(undefined8 *)(lVar22 + 0x18) = *(undefined8 *)(pdVar12 + 2);
    *(undefined8 *)(lVar22 + 0x10) = uVar24;
    lVar22 = *(long *)(lVar20 + 8);
    uVar24 = *(undefined8 *)pdVar10;
    *(undefined8 *)(lVar22 + 0x28) = *(undefined8 *)(pdVar10 + 2);
    *(undefined8 *)(lVar22 + 0x20) = uVar24;
    lVar22 = *(long *)(lVar20 + 8);
    if (*(long *)(lVar20 + 0x28) - lVar22 < 0x31) {
      func_0x006ee1d4(lVar20,3);
      lVar22 = *(long *)(lVar20 + 8);
    }
    *(long *)(lVar20 + 8) = lVar22 + 0x30;
    func_0x006ee550(lVar20,lVar22,1);
    lVar22 = *(long *)(lVar20 + 8);
    *(long *)(lVar20 + 8) = lVar22 + -0x10;
    uVar24 = *(undefined8 *)(lVar22 + -0x10);
    puVar6 = (undefined8 *)((long)puVar6 + (*(long *)(lVar20 + 0x30) - lVar28));
    puVar6[1] = *(undefined8 *)(lVar22 + -8);
    *puVar6 = uVar24;
    return;
  }
  puVar19 = (undefined8 *)func_0x006fe794(lVar20,pdVar10,0xe);
  if (*(int *)((long)puVar19 + 0xc) != 0) goto code_r0x007041ec;
  plVar23 = (long *)((long)&MACH_HEADER.filetype + 2);
  pdVar27 = pdVar10;
  auVar35 = func_0x006ecf88(lVar20,pdVar12);
  pdVar25 = auVar35._8_8_;
  lVar22 = auVar35._0_8_;
  pdStack_270 = pdVar29;
  pdStack_268 = pdVar9;
  pdStack_260 = pdVar12;
  pdStack_258 = pdVar10;
  puStack_250 = puVar6;
  lStack_248 = lVar20;
  pppppplStack_240 = (long ******)&ppppppuStack_1f0;
  puStack_238 = &DAT_007042c8;
  dVar1 = pdVar27[3];
  pdVar9 = pdVar27;
  if (dVar1 != 4) {
    pdVar9 = (dword *)0x0;
  }
  iVar4 = *(int *)((long)plVar23 + 0xc);
  if (pdVar9 != (dword *)0x0 && (plVar23 != (long *)0x0 && iVar4 == 4)) {
    *(float *)pdVar25 = -(float)*pdVar9;
    *(float *)((long)pdVar25 + 4) = -(float)pdVar9[1];
    *(float *)(pdVar25 + 1) = -(float)pdVar9[2];
    fVar34 = 5.60519e-45;
    goto code_r0x00704410;
  }
  if (pdVar9 == (dword *)0x0) {
    if ((dVar1 != 3 && (plVar23 != (long *)0x0 && iVar4 == 4)) && (dVar1 == 5)) {
      iVar4 = func_0x006f4d04(*(long *)pdVar27 + 0x18,&dStack_278);
      if (iVar4 != 0) {
        dStack_280 = dStack_278;
      }
    }
  }
  else if ((iVar4 != 3) && (iVar4 == 5)) {
    func_0x006f4d04(*plVar23 + 0x18,&dStack_278);
  }
  pdVar9 = pdVar27;
  if (pdVar27[3] == 3) {
code_r0x007043d8:
    if (*(int *)((long)plVar23 + 0xc) == 3) {
code_r0x00704400:
      *pdVar25 = -*(double *)pdVar9;
      fVar34 = 4.2039e-45;
code_r0x00704410:
      *(float *)((long)pdVar25 + 0xc) = fVar34;
      return;
    }
    if (*(int *)((long)plVar23 + 0xc) == 5) {
      iVar4 = func_0x006f4d04(*plVar23 + 0x18,&dStack_278);
      if (iVar4 != 0) goto code_r0x00704400;
    }
  }
  else if (pdVar27[3] == 5) {
    iVar4 = func_0x006f4d04(*(long *)pdVar27 + 0x18,&dStack_278);
    if (iVar4 != 0) {
      dStack_280 = dStack_278;
      pdVar9 = (dword *)&dStack_280;
      goto code_r0x007043d8;
    }
  }
  puVar6 = (undefined8 *)func_0x006fe794(lVar22,pdVar27,0xf);
  if (*(int *)((long)puVar6 + 0xc) != 0) {
code_r0x0070445c:
    lVar28 = *(long *)(lVar22 + 0x30);
    puVar19 = *(undefined8 **)(lVar22 + 8);
    uVar24 = *puVar6;
    puVar19[1] = puVar6[1];
    *puVar19 = uVar24;
    lVar20 = *(long *)(lVar22 + 8);
    uVar24 = *(undefined8 *)pdVar27;
    *(undefined8 *)(lVar20 + 0x18) = *(undefined8 *)(pdVar27 + 2);
    *(undefined8 *)(lVar20 + 0x10) = uVar24;
    lVar20 = *(long *)(lVar22 + 8);
    lVar26 = *plVar23;
    *(long *)(lVar20 + 0x28) = plVar23[1];
    *(long *)(lVar20 + 0x20) = lVar26;
    lVar20 = *(long *)(lVar22 + 8);
    if (*(long *)(lVar22 + 0x28) - lVar20 < 0x31) {
      func_0x006ee1d4(lVar22,3);
      lVar20 = *(long *)(lVar22 + 8);
    }
    *(long *)(lVar22 + 8) = lVar20 + 0x30;
    func_0x006ee550(lVar22,lVar20,1);
    lVar20 = *(long *)(lVar22 + 8);
    *(long *)(lVar22 + 8) = lVar20 + -0x10;
    uVar24 = *(undefined8 *)(lVar20 + -0x10);
    puVar6 = (undefined8 *)((long)pdVar25 + (*(long *)(lVar22 + 0x30) - lVar28));
    puVar6[1] = *(undefined8 *)(lVar20 + -8);
    *puVar6 = uVar24;
    return;
  }
  puVar6 = (undefined8 *)func_0x006fe794(lVar22,plVar23,0xf);
  if (*(int *)((long)puVar6 + 0xc) != 0) goto code_r0x0070445c;
  plVar18 = (long *)((long)&MACH_HEADER.filetype + 3);
  plVar13 = plVar23;
  auVar36 = func_0x006ecf88(lVar22,pdVar27);
  pdVar25 = auVar36._8_8_;
  lVar22 = auVar36._0_8_;
  puStack_288 = &DAT_00704504;
  if (*(int *)((long)plVar13 + 0xc) == 5) {
    dVar33 = (double)NEON_ucvtf((ulong)*(uint *)(*plVar13 + 0x14));
    goto code_r0x00704580;
  }
  pdStack_2c0 = pdVar29;
  pdStack_2b8 = pdVar9;
  pdStack_2b0 = pdVar27;
  plStack_2a8 = plVar23;
  pppppppuStack_290 = &pppppplStack_240;
  auStack_2a0 = auVar35;
  if (*(int *)((long)plVar13 + 0xc) == 6) {
    pdVar27 = (dword *)*plVar13;
    lVar20 = *(long *)(pdVar27 + 4);
    if ((lVar20 != 0) && ((*(byte *)(lVar20 + 3) >> 6 & 1) == 0)) {
      puVar6 = (undefined8 *)
               func_0x006fe740(lVar20,6,*(undefined8 *)(*(long *)(lVar22 + 0x18) + 0x408));
      if (puVar6 != (undefined8 *)0x0) goto code_r0x007045b4;
    }
    iVar4 = func_0x006fc150(pdVar27);
    dVar33 = (double)iVar4;
code_r0x00704580:
    *pdVar25 = dVar33;
    *(undefined4 *)((long)pdVar25 + 0xc) = 3;
    return;
  }
  puVar6 = (undefined8 *)func_0x006fe794(lVar22,plVar13,6);
code_r0x007045b4:
  if (*(int *)((long)puVar6 + 0xc) == 0) {
    pcVar14 = "get length of";
    func_0x006ece80(lVar22,plVar13);
  }
  else {
    lVar20 = __dyld_get_image_header(0);
    pdVar27 = *(dword **)(lVar22 + 0x30);
    puVar19 = *(undefined8 **)(lVar22 + 8);
    uVar24 = *puVar6;
    puVar19[1] = puVar6[1];
    *puVar19 = uVar24;
    lVar28 = *(long *)(lVar22 + 8);
    lVar26 = *plVar13;
    *(long *)(lVar28 + 0x18) = plVar13[1];
    *(long *)(lVar28 + 0x10) = lVar26;
    uVar24 = *(undefined8 *)(lVar20 + 0x4e8dd08);
    lVar28 = *(long *)(lVar22 + 8);
    *(undefined8 *)(lVar28 + 0x28) = *(undefined8 *)(lVar20 + 0x4e8dd10);
    *(undefined8 *)(lVar28 + 0x20) = uVar24;
    lVar20 = *(long *)(lVar22 + 8);
    if (*(long *)(lVar22 + 0x28) - lVar20 < 0x31) {
      func_0x006ee1d4(lVar22,3);
      lVar20 = *(long *)(lVar22 + 8);
    }
    pdVar25 = (double *)((long)pdVar25 - (long)pdVar27);
    *(long *)(lVar22 + 8) = lVar20 + 0x30;
    pcVar14 = (char *)((long)&MACH_HEADER.magic + 1);
    func_0x006ee550(lVar22);
    puVar6 = (undefined8 *)(*(long *)(lVar22 + 0x30) + (long)pdVar25);
    lVar20 = *(long *)(lVar22 + 8);
    *(long *)(lVar22 + 8) = lVar20 + -0x10;
    uVar24 = *(undefined8 *)(lVar20 + -0x10);
    puVar6[1] = *(undefined8 *)(lVar20 + -8);
    *puVar6 = uVar24;
    if (*(int *)((long)puVar6 + 0xc) == 3) {
      return;
    }
  }
  auVar35 = func_0x006eceb0(lVar22,"\'__len\' must return a number");
  plVar23 = auVar35._8_8_;
  uVar24 = auVar35._0_8_;
  puStack_2c8 = &DAT_00704690;
  pdStack_2f0 = pdVar27;
  plStack_2e8 = plVar13;
  pdStack_2e0 = pdVar25;
  lStack_2d8 = lVar22;
  pppppppuStack_2d0 = &pppppppuStack_290;
  if (*(int *)((long)plVar18 + 0xc) == 3) {
code_r0x007046ec:
    if (*(int *)((long)plVar23 + 0xc) != 3) {
      if (*(int *)((long)plVar23 + 0xc) == 5) {
        iVar4 = func_0x006f4d04(*plVar23 + 0x18,&lStack_2f8);
        if (iVar4 != 0) {
          *plVar23 = lStack_2f8;
          *(undefined4 *)((long)plVar23 + 0xc) = 3;
          goto code_r0x00704724;
        }
      }
      goto code_r0x00704784;
    }
code_r0x00704724:
    if (*(int *)((long)pcVar14 + 0xc) == 3) {
      return;
    }
    if (*(int *)((long)pcVar14 + 0xc) == 5) {
      iVar4 = func_0x006f4d04(*(long *)pcVar14 + 0x18,&lStack_2f8);
      if (iVar4 != 0) {
        *(long *)pcVar14 = lStack_2f8;
        pcVar14 = (char *)((long)pcVar14 + 0xc);
        pcVar14[0] = '\x03';
        pcVar14[1] = '\0';
        pcVar14[2] = '\0';
        pcVar14[3] = '\0';
        return;
      }
    }
  }
  else {
    if (*(int *)((long)plVar18 + 0xc) == 5) {
      iVar4 = func_0x006f4d04(*plVar18 + 0x18,&lStack_2f8);
      if (iVar4 != 0) {
        *plVar18 = lStack_2f8;
        *(undefined4 *)((long)plVar18 + 0xc) = 3;
        goto code_r0x007046ec;
      }
    }
    func_0x006ecf14(uVar24,plVar18,"initial value");
code_r0x00704784:
    func_0x006ecf14(uVar24,plVar23,"limit");
  }
  pcVar15 = "step";
  auVar37 = func_0x006ecf14(uVar24,pcVar14);
  lVar22 = auVar37._0_8_;
  sVar3 = *(short *)(lVar22 + 0x52);
  *(short *)(lVar22 + 0x52) = sVar3 + 1;
  if ((ushort)(sVar3 + 1U) < 200) {
    lVar20 = *(long *)(lVar22 + 8);
    if (0x140 < *(long *)(lVar22 + 0x28) - lVar20) goto code_r0x007047f8;
code_r0x00704838:
    func_0x006ee1d4(lVar22,0x14);
    lVar20 = *(long *)(lVar22 + 8);
    lVar26 = lVar20 + (long)auVar37._8_4_ * -0x10;
    lVar30 = lVar26 + -0x10;
    lVar28 = *(long *)(lVar22 + 0x20);
    if (lVar28 == *(long *)(lVar22 + 0x38)) {
code_r0x00704860:
      plVar23 = (long *)func_0x006ee1f8(lVar22);
      goto code_r0x00704868;
    }
  }
  else {
    func_0x006ee2cc(lVar22);
    lVar20 = *(long *)(lVar22 + 8);
    if (*(long *)(lVar22 + 0x28) - lVar20 < 0x141) goto code_r0x00704838;
code_r0x007047f8:
    lVar26 = lVar20 + (long)auVar37._8_4_ * -0x10;
    lVar30 = lVar26 + -0x10;
    lVar28 = *(long *)(lVar22 + 0x20);
    if (lVar28 == *(long *)(lVar22 + 0x38)) goto code_r0x00704860;
  }
  plVar23 = (long *)(lVar28 + 0x28);
  *(long **)(lVar22 + 0x20) = plVar23;
code_r0x00704868:
  *plVar23 = lVar26;
  plVar23[1] = lVar30;
  plVar23[2] = lVar20 + 0x140;
  plVar23[3] = 0;
  *(uint *)(plVar23 + 4) = ~(uint)pcVar15 >> 0x1f;
  *(undefined4 *)((long)plVar23 + 0x24) = 0;
  *(long *)(lVar22 + 0x10) = lVar26;
  uVar5 = (**(code **)(*(long *)(lVar26 + -0x10) + 0x18))(lVar22);
  lVar20 = *(long *)(lVar22 + 0x20);
  plVar23 = (long *)(lVar20 + -0x28);
  if (-1 < (int)(uint)pcVar15) {
    if ((int)uVar5 < 1) {
      *(undefined4 *)(*plVar23 + ((ulong)pcVar15 & 0xffffffff) * 0x10 + 0xc) = 0;
    }
    else {
      puVar19 = (undefined8 *)(*(long *)(lVar22 + 8) + (ulong)uVar5 * -0x10);
      uVar24 = *puVar19;
      puVar6 = (undefined8 *)(*plVar23 + ((ulong)pcVar15 & 0xffffffff) * 0x10);
      puVar6[1] = puVar19[1];
      *puVar6 = uVar24;
    }
  }
  *(long **)(lVar22 + 0x20) = plVar23;
  uVar24 = *(undefined8 *)(lVar20 + -0x28);
  *(undefined8 *)(lVar22 + 8) = *(undefined8 *)(lVar20 + -0x18);
  *(undefined8 *)(lVar22 + 0x10) = uVar24;
  *(short *)(lVar22 + 0x52) = *(short *)(lVar22 + 0x52) + -1;
  return;
}

