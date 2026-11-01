
long * FUN_0070244c(long *param_1,undefined8 param_2,undefined8 param_3,long *param_4)

{
  uint uVar1;
  uint uVar2;
  uint uVar3;
  uint uVar4;
  long *plVar5;
  long *plVar6;
  long lVar7;
  undefined8 *puVar8;
  byte in_w8;
  int iVar9;
  uint uVar10;
  undefined8 *puVar11;
  long unaff_x19;
  long *unaff_x20;
  undefined8 *unaff_x21;
  long *unaff_x22;
  long *unaff_x23;
  long lVar12;
  long **pplVar13;
  long **pplVar14;
  int unaff_w25;
  int iVar15;
  long unaff_x26;
  long lVar16;
  undefined8 uVar17;
  undefined1 auVar18 [16];
  long *plStack_60;
  undefined8 uStack_58;
  
  while ((in_w8 & 1) == 0) {
    plVar5 = (long *)func_0x006fe740(param_1,0,*(undefined8 *)(*(long *)(unaff_x19 + 0x18) + 0x3d8))
    ;
    param_1 = (long *)0x0;
    if (plVar5 == (long *)0x0) break;
    iVar15 = *(int *)((long)plVar5 + 0xc);
    plVar6 = unaff_x22;
    while( true ) {
      unaff_x22 = plVar5;
      if (iVar15 == 7) {
        lVar7 = *(long *)(unaff_x19 + 0x30);
        plVar5 = *(long **)(unaff_x19 + 8);
        lVar12 = *unaff_x22;
        plVar5[1] = unaff_x22[1];
        *plVar5 = lVar12;
        lVar12 = *(long *)(unaff_x19 + 8);
        lVar16 = *plVar6;
        *(long *)(lVar12 + 0x18) = plVar6[1];
        *(long *)(lVar12 + 0x10) = lVar16;
        lVar12 = *(long *)(unaff_x19 + 8);
        uVar17 = *unaff_x21;
        *(undefined8 *)(lVar12 + 0x28) = unaff_x21[1];
        *(undefined8 *)(lVar12 + 0x20) = uVar17;
        lVar12 = *(long *)(unaff_x19 + 8);
        if (*(long *)(unaff_x19 + 0x28) - lVar12 < 0x31) {
          func_0x006ee1d4();
          lVar12 = *(long *)(unaff_x19 + 8);
        }
        *(long *)(unaff_x19 + 8) = lVar12 + 0x30;
        plVar5 = (long *)func_0x006ee550();
        lVar12 = *(long *)(unaff_x19 + 8);
        *(long *)(unaff_x19 + 8) = lVar12 + -0x10;
        uVar17 = *(undefined8 *)(lVar12 + -0x10);
        puVar8 = (undefined8 *)((long)unaff_x20 + (*(long *)(unaff_x19 + 0x30) - lVar7));
        puVar8[1] = *(undefined8 *)(lVar12 + -8);
        *puVar8 = uVar17;
        return plVar5;
      }
      unaff_w25 = unaff_w25 + -1;
      if (unaff_w25 == 0) {
        param_1 = (long *)func_0x006eceb0();
        goto LAB_007024a8;
      }
      if (iVar15 == 6) break;
      plVar5 = (long *)func_0x006fe794();
      iVar15 = *(int *)((long)plVar5 + 0xc);
      plVar6 = unaff_x22;
      if (iVar15 == 0) {
        auVar18 = func_0x006ed074();
        pplVar14 = auVar18._8_8_;
        lVar12 = auVar18._0_8_;
        if (*(int *)((long)pplVar14 + 0xc) == 6) {
          plVar5 = *pplVar14;
          unaff_x23 = (long *)func_0x006fb89c(plVar5,unaff_x21);
          if (*(int *)((long)unaff_x23 + 0xc) == 0) goto code_r0x0070270c;
          goto code_r0x007025c0;
        }
        puVar8 = (undefined8 *)func_0x006fe794(lVar12,pplVar14,1);
        if (*(int *)((long)puVar8 + 0xc) == 0) goto code_r0x007027c8;
        pplVar13 = pplVar14;
        if (*(int *)((long)puVar8 + 0xc) != 7) goto code_r0x00702668;
        goto code_r0x00702744;
      }
    }
    lVar12 = *unaff_x22;
    unaff_x23 = (long *)func_0x006fb89c(lVar12);
    param_1 = (long *)__dyld_get_image_header(0);
    if (unaff_x23 != (long *)((long)param_1 + unaff_x26)) {
      *(int *)(unaff_x19 + 0x54) = (int)((ulong)((long)unaff_x23 - *(long *)(lVar12 + 0x20)) >> 5);
    }
    if ((*(int *)((long)unaff_x23 + 0xc) != 0) ||
       (param_1 = *(long **)(lVar12 + 0x10), param_1 == (long *)0x0)) break;
    in_w8 = *(byte *)((long)param_1 + 3);
  }
LAB_007024a8:
  lVar12 = *unaff_x23;
  unaff_x20[1] = unaff_x23[1];
  *unaff_x20 = lVar12;
  return param_1;
code_r0x00702668:
  uStack_58 = puVar8[1];
  plStack_60 = (long *)*puVar8;
  iVar15 = 99;
  do {
    plVar5 = plStack_60;
    if (uStack_58._4_4_ == 6) {
      unaff_x23 = (long *)func_0x006fb89c(plStack_60,unaff_x21);
      if ((((*(int *)((long)unaff_x23 + 0xc) != 0) || (lVar7 = plVar5[2], lVar7 == 0)) ||
          ((*(byte *)(lVar7 + 3) >> 1 & 1) != 0)) ||
         (puVar8 = (undefined8 *)
                   func_0x006fe740(lVar7,1,*(undefined8 *)(*(long *)(lVar12 + 0x18) + 0x3e0)),
         puVar8 == (undefined8 *)0x0)) goto code_r0x007025c0;
      iVar9 = *(int *)((long)puVar8 + 0xc);
      unaff_x22 = plVar5;
    }
    else {
      puVar8 = (undefined8 *)func_0x006fe794(lVar12,&plStack_60,1);
      iVar9 = *(int *)((long)puVar8 + 0xc);
      pplVar14 = &plStack_60;
      pplVar13 = &plStack_60;
      if (iVar9 == 0) goto code_r0x007027c8;
    }
    if (iVar9 == 7) {
      pplVar14 = &plStack_60;
      goto code_r0x00702744;
    }
    uStack_58 = puVar8[1];
    plStack_60 = (long *)*puVar8;
    iVar15 = iVar15 + -1;
  } while (iVar15 != 0);
  func_0x006eceb0(lVar12,"\'__newindex\' chain too long; possible loop");
  plVar5 = unaff_x22;
  pplVar14 = pplVar13;
code_r0x0070270c:
  lVar7 = plVar5[2];
  if (((lVar7 == 0) || ((*(byte *)(lVar7 + 3) >> 1 & 1) != 0)) ||
     (puVar8 = (undefined8 *)
               func_0x006fe740(lVar7,1,*(undefined8 *)(*(long *)(lVar12 + 0x18) + 0x3e0)),
     puVar8 == (undefined8 *)0x0)) goto code_r0x007025c0;
  unaff_x22 = plVar5;
  pplVar13 = pplVar14;
  if (*(int *)((long)puVar8 + 0xc) == 7) {
code_r0x00702744:
    puVar11 = *(undefined8 **)(lVar12 + 8);
    uVar17 = *puVar8;
    puVar11[1] = puVar8[1];
    *puVar11 = uVar17;
    lVar7 = *(long *)(lVar12 + 8);
    lVar16 = (long)*pplVar14;
    *(long **)(lVar7 + 0x18) = pplVar14[1];
    *(long *)(lVar7 + 0x10) = lVar16;
    lVar7 = *(long *)(lVar12 + 8);
    uVar17 = *unaff_x21;
    *(undefined8 *)(lVar7 + 0x28) = unaff_x21[1];
    *(undefined8 *)(lVar7 + 0x20) = uVar17;
    lVar7 = *(long *)(lVar12 + 8);
    lVar16 = *param_4;
    *(long *)(lVar7 + 0x38) = param_4[1];
    *(long *)(lVar7 + 0x30) = lVar16;
    lVar7 = *(long *)(lVar12 + 8);
    if (*(long *)(lVar12 + 0x28) - lVar7 < 0x41) {
      func_0x006ee1d4(lVar12,4);
      lVar7 = *(long *)(lVar12 + 8);
    }
    *(long *)(lVar12 + 8) = lVar7 + 0x40;
    plVar5 = (long *)func_0x006ee550(lVar12,lVar7,0);
    return plVar5;
  }
  goto code_r0x00702668;
code_r0x007027c8:
  func_0x006ed074(lVar12,pplVar14,unaff_x21);
  goto code_r0x007027d8;
code_r0x007025c0:
  if (*(char *)((long)plVar5 + 4) == '\0') {
    *(undefined1 *)((long)plVar5 + 3) = 0;
    plVar6 = (long *)__dyld_get_image_header(0);
    if (unaff_x23 == plVar6 + 0x9d1ba1) {
      plVar6 = (long *)func_0x006fbbdc(lVar12,plVar5,unaff_x21);
      unaff_x23 = plVar6;
    }
    *(int *)(lVar12 + 0x54) = (int)((ulong)((long)unaff_x23 - plVar5[4]) >> 5);
    lVar7 = *param_4;
    unaff_x23[1] = param_4[1];
    *unaff_x23 = lVar7;
    if (*(int *)((long)param_4 + 0xc) < 5) {
      return plVar6;
    }
    if ((*(byte *)((long)plVar5 + 1) >> 2 & 1) == 0) {
      return plVar6;
    }
    if ((*(byte *)(*param_4 + 1) & 3) == 0) {
      return plVar6;
    }
    plVar5 = (long *)func_0x006f0ea0(lVar12,plVar5);
    return plVar5;
  }
code_r0x007027d8:
  auVar18 = func_0x006ed124(lVar12);
  lVar7 = auVar18._8_8_;
  lVar12 = auVar18._0_8_;
  if (lVar12 == lVar7) {
    return (long *)0x0;
  }
  uVar3 = (uint)*(byte *)(lVar12 + 0x18) - (uint)*(byte *)(lVar7 + 0x18);
  if (uVar3 == 0) {
    uVar1 = *(uint *)(lVar12 + 0x14);
    uVar2 = *(uint *)(lVar7 + 0x14);
    uVar4 = uVar1;
    if (uVar2 <= uVar1) {
      uVar4 = uVar2;
    }
    uVar10 = 1;
    if (uVar2 > uVar1) {
      uVar10 = 0xffffffff;
    }
    uVar3 = 0;
    if (uVar1 != uVar2) {
      uVar3 = uVar10;
    }
    uVar4 = _memcmp((byte *)(lVar12 + 0x18),(byte *)(lVar7 + 0x18),uVar4);
    if (uVar4 != 0) {
      uVar3 = uVar4;
    }
  }
  return (long *)(ulong)uVar3;
}

