
/* WARNING: Possible PIC construction at 0x00702b04: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x00702b08) */
/* WARNING: Removing unreachable block (ram,0x00702b10) */
/* WARNING: Removing unreachable block (ram,0x00702b30) */

ulong FUN_006e28d8(ulong param_1)

{
  uint uVar1;
  uint uVar2;
  uint uVar3;
  undefined8 uVar4;
  undefined1 *puVar5;
  bool bVar6;
  int iVar7;
  long lVar9;
  double *pdVar10;
  ulong uVar11;
  undefined8 *puVar12;
  undefined8 uVar13;
  int iVar8;
  double *pdVar14;
  undefined8 uVar15;
  undefined8 uVar16;
  float extraout_w8;
  float fVar17;
  long lVar18;
  double dVar19;
  float fVar20;
  long in_x9;
  double dVar21;
  double *in_x10;
  long unaff_x19;
  int unaff_w21;
  long unaff_x22;
  undefined8 *puVar22;
  undefined8 unaff_x23;
  long lVar23;
  undefined8 *puVar24;
  undefined8 *unaff_x24;
  long *plVar25;
  undefined8 unaff_x25;
  long *plVar26;
  undefined8 unaff_x26;
  undefined1 auVar27 [16];
  undefined1 auVar28 [16];
  undefined8 in_stack_00000000;
  undefined8 in_stack_00000008;
  undefined8 in_stack_00000010;
  double *in_stack_00000018;
  undefined1 *in_stack_00000020;
  undefined *in_stack_00000028;
  undefined1 uStack0000000000000030;
  
  auVar27._8_8_ = in_stack_00000010;
  auVar27._0_8_ = in_stack_00000008;
  pdVar14 = (double *)(in_x9 + (param_1 & 0xffffffff) * 0x10);
  if (pdVar14 < in_x10) {
    if (0 < unaff_w21) goto LAB_006e2918;
LAB_006e2960:
    if (unaff_w21 < -9999) {
      pdVar10 = (double *)func_0x006e60a0();
      lVar9 = __dyld_get_image_header(0);
      if (pdVar14 == (double *)(lVar9 + unaff_x22)) {
        return 0;
      }
    }
    else {
      pdVar10 = (double *)(*(long *)(unaff_x19 + 8) + (long)unaff_w21 * 0x10);
FUN_006e2974:
      lVar9 = __dyld_get_image_header(0);
      if (pdVar14 == (double *)(lVar9 + unaff_x22)) {
        return 0;
      }
    }
  }
  else {
    lVar9 = __dyld_get_image_header(0);
    pdVar14 = (double *)(lVar9 + unaff_x22);
    if (unaff_w21 < 1) goto LAB_006e2960;
LAB_006e2918:
    pdVar10 = (double *)(*(long *)(unaff_x19 + 0x10) + (ulong)(unaff_w21 - 1) * 0x10);
    if (pdVar10 < *(double **)(unaff_x19 + 8)) goto FUN_006e2974;
    lVar9 = __dyld_get_image_header(0);
    pdVar10 = (double *)(lVar9 + unaff_x22);
    lVar9 = __dyld_get_image_header(0);
    if (pdVar14 == (double *)(lVar9 + unaff_x22)) {
      return 0;
    }
  }
  lVar9 = __dyld_get_image_header(0);
  if (pdVar10 == (double *)(lVar9 + unaff_x22)) {
    return 0;
  }
  fVar17 = *(float *)((long)pdVar14 + 0xc);
  if (fVar17 == *(float *)((long)pdVar10 + 0xc)) {
    if (fVar17 == 4.2039e-45) {
      return (ulong)(*pdVar14 < *pdVar10);
    }
  }
  else {
    auVar28 = func_0x006ed000();
    pdVar14 = auVar28._8_8_;
    unaff_x19 = auVar28._0_8_;
    fVar17 = extraout_w8;
  }
  auVar28._8_8_ = pdVar14;
  auVar28._0_8_ = unaff_x19;
  if (fVar17 == 7.00649e-45) {
    uVar11 = func_0x007027e0(*pdVar14,*pdVar10);
    return uVar11 >> 0x1f & 1;
  }
  puVar5 = &uStack0000000000000030;
  uVar13 = 0x10;
  uVar4 = 1;
  while( true ) {
    uVar16 = uVar4;
    uVar15 = uVar13;
    puVar24 = auVar28._8_8_;
    lVar9 = auVar28._0_8_;
    *(undefined8 **)(puVar5 + -0x40) = unaff_x24;
    *(undefined8 *)(puVar5 + -0x38) = unaff_x23;
    *(undefined8 *)(puVar5 + -0x30) = in_stack_00000000;
    *(undefined1 (*) [16])(puVar5 + -0x28) = auVar27;
    *(double **)(puVar5 + -0x18) = in_stack_00000018;
    *(undefined1 **)(puVar5 + -0x10) = in_stack_00000020;
    *(undefined **)(puVar5 + -8) = in_stack_00000028;
    puVar12 = (undefined8 *)func_0x006fe794();
    if (*(int *)((long)puVar12 + 0xc) == 0) {
      if ((int)uVar16 == 0) {
        return 0xffffffff;
      }
    }
    else {
      uVar13 = func_0x006fe794(lVar9,pdVar10,uVar15);
      iVar7 = func_0x006f4b80(puVar12,uVar13);
      if (iVar7 != 0) {
        puVar22 = *(undefined8 **)(lVar9 + 8);
        lVar23 = *(long *)(lVar9 + 0x30);
        uVar13 = *puVar12;
        puVar22[1] = puVar12[1];
        *puVar22 = uVar13;
        lVar18 = *(long *)(lVar9 + 8);
        uVar13 = *puVar24;
        *(undefined8 *)(lVar18 + 0x18) = puVar24[1];
        *(undefined8 *)(lVar18 + 0x10) = uVar13;
        lVar18 = *(long *)(lVar9 + 8);
        dVar19 = *pdVar10;
        *(double *)(lVar18 + 0x28) = pdVar10[1];
        *(double *)(lVar18 + 0x20) = dVar19;
        lVar18 = *(long *)(lVar9 + 8);
        if (*(long *)(lVar9 + 0x28) - lVar18 < 0x31) {
          func_0x006ee1d4(lVar9,3);
          lVar18 = *(long *)(lVar9 + 8);
        }
        *(long *)(lVar9 + 8) = lVar18 + 0x30;
        func_0x006ee550(lVar9,lVar18,1);
        lVar18 = *(long *)(lVar9 + 8);
        *(long *)(lVar9 + 8) = lVar18 + -0x10;
        uVar13 = *(undefined8 *)(lVar18 + -0x10);
        puVar22 = (undefined8 *)((long)puVar22 + (*(long *)(lVar9 + 0x30) - lVar23));
        puVar22[1] = *(undefined8 *)(lVar18 + -8);
        *puVar22 = uVar13;
        uVar1 = (*(int **)(lVar9 + 8))[3];
        uVar11 = (ulong)uVar1;
        if (uVar1 != 0) {
          if (uVar1 != 1) {
            return 1;
          }
          uVar11 = (ulong)(**(int **)(lVar9 + 8) != 0);
        }
        return uVar11;
      }
      unaff_x24 = puVar12;
      if ((int)uVar16 == 0) {
        return 0xffffffff;
      }
    }
    in_stack_00000018 = pdVar10;
    auVar27 = func_0x006ed000(lVar9,puVar24,pdVar10,uVar15);
    pdVar14 = auVar27._8_8_;
    *(undefined8 *)(puVar5 + -0x70) = uVar15;
    *(undefined8 **)(puVar5 + -0x68) = puVar24;
    *(double **)(puVar5 + -0x60) = pdVar10;
    *(long *)(puVar5 + -0x58) = lVar9;
    *(undefined1 **)(puVar5 + -0x50) = puVar5 + -0x10;
    *(undefined **)(puVar5 + -0x48) = &DAT_00702a2c;
    in_stack_00000020 = puVar5 + -0x50;
    fVar17 = *(float *)((long)pdVar14 + 0xc);
    if (fVar17 != *(float *)((long)in_stack_00000018 + 0xc)) break;
    if (fVar17 == 7.00649e-45) {
      dVar19 = *pdVar14;
      dVar21 = *in_stack_00000018;
      if (dVar19 == dVar21) {
        return 1;
      }
      iVar7 = (uint)*(byte *)((long)dVar19 + 0x18) - (uint)*(byte *)((long)dVar21 + 0x18);
      if (iVar7 == 0) {
        uVar2 = *(uint *)((long)dVar19 + 0x14);
        uVar3 = *(uint *)((long)dVar21 + 0x14);
        uVar1 = uVar2;
        if (uVar3 <= uVar2) {
          uVar1 = uVar3;
        }
        iVar8 = 1;
        if (uVar3 > uVar2) {
          iVar8 = -1;
        }
        iVar7 = 0;
        if (uVar2 != uVar3) {
          iVar7 = iVar8;
        }
        iVar8 = _memcmp((byte *)((long)dVar19 + 0x18),(byte *)((long)dVar21 + 0x18),uVar1);
        if (iVar8 != 0) {
          iVar7 = iVar8;
        }
      }
      return (ulong)(iVar7 < 1);
    }
    if (fVar17 == 4.2039e-45) {
      return (ulong)(*pdVar14 <= *in_stack_00000018);
    }
    in_stack_00000028 = &UNK_00702b08;
    puVar5 = puVar5 + -0x70;
    pdVar10 = in_stack_00000018;
    uVar13 = 0x11;
    uVar4 = 0;
    in_stack_00000000 = uVar15;
    unaff_x23 = uVar16;
    auVar28 = auVar27;
  }
  pdVar10 = in_stack_00000018;
  auVar28 = func_0x006ed000(auVar27._0_8_,pdVar14,in_stack_00000018,0x11);
  pdVar14 = auVar28._8_8_;
  lVar9 = auVar28._0_8_;
  *(undefined8 *)(puVar5 + -0xc0) = unaff_x26;
  *(undefined8 *)(puVar5 + -0xb8) = unaff_x25;
  *(undefined8 **)(puVar5 + -0xb0) = unaff_x24;
  *(undefined8 *)(puVar5 + -0xa8) = uVar16;
  *(undefined8 *)(puVar5 + -0xa0) = uVar15;
  *(undefined1 (*) [16])(puVar5 + -0x98) = auVar27;
  *(double **)(puVar5 + -0x88) = in_stack_00000018;
  *(undefined1 **)(puVar5 + -0x80) = in_stack_00000020;
  *(undefined **)(puVar5 + -0x78) = &DAT_00702b78;
  switch(*(float *)((long)pdVar14 + 0xc)) {
  case 0.0:
    return 1;
  case 1.4013e-45:
    fVar17 = *(float *)pdVar14;
    fVar20 = *(float *)pdVar10;
    goto code_r0x00702dfc;
  case 2.8026e-45:
    if (*pdVar14 != *pdVar10) {
      return 0;
    }
    fVar17 = *(float *)(pdVar14 + 1);
    fVar20 = *(float *)(pdVar10 + 1);
code_r0x00702dfc:
    bVar6 = fVar17 == fVar20;
    goto code_r0x00702e00;
  case 4.2039e-45:
    bVar6 = *pdVar14 == *pdVar10;
    goto code_r0x00702e00;
  case 5.60519e-45:
    if (*(float *)pdVar14 != *(float *)pdVar10) {
      return 0;
    }
    if (*(float *)((long)pdVar14 + 4) != *(float *)((long)pdVar10 + 4)) {
      return 0;
    }
    bVar6 = *(float *)(pdVar14 + 1) == *(float *)(pdVar10 + 1);
    goto code_r0x00702e00;
  case 8.40779e-45:
    lVar18 = *(long *)((long)*pdVar14 + 0x10);
    if ((lVar18 != 0) && (-1 < *(char *)(lVar18 + 3))) {
      lVar23 = *(long *)((long)*pdVar10 + 0x10);
      puVar12 = (undefined8 *)
                func_0x006fe740(lVar18,7,*(undefined8 *)(*(long *)(lVar9 + 0x18) + 0x410));
      if (puVar12 != (undefined8 *)0x0) {
        if (lVar18 == lVar23) goto code_r0x00702d14;
        if ((lVar23 != 0) && (-1 < *(char *)(lVar23 + 3))) {
          uVar13 = *(undefined8 *)(*(long *)(lVar9 + 0x18) + 0x410);
code_r0x00702cf8:
          lVar18 = func_0x006fe740(lVar23,7,uVar13);
          if ((lVar18 != 0) && (iVar7 = func_0x006f4b80(puVar12,lVar18), iVar7 != 0)) {
code_r0x00702d14:
            puVar24 = *(undefined8 **)(lVar9 + 8);
            lVar23 = *(long *)(lVar9 + 0x30);
            uVar13 = *puVar12;
            puVar24[1] = puVar12[1];
            *puVar24 = uVar13;
            lVar18 = *(long *)(lVar9 + 8);
            dVar19 = *pdVar14;
            *(double *)(lVar18 + 0x18) = pdVar14[1];
            *(double *)(lVar18 + 0x10) = dVar19;
            lVar18 = *(long *)(lVar9 + 8);
            dVar19 = *pdVar10;
            *(double *)(lVar18 + 0x28) = pdVar10[1];
            *(double *)(lVar18 + 0x20) = dVar19;
            lVar18 = *(long *)(lVar9 + 8);
            if (*(long *)(lVar9 + 0x28) - lVar18 < 0x31) {
              func_0x006ee1d4(lVar9,3);
              lVar18 = *(long *)(lVar9 + 8);
            }
            *(long *)(lVar9 + 8) = lVar18 + 0x30;
            func_0x006ee550(lVar9,lVar18,1);
            lVar18 = *(long *)(lVar9 + 8);
            *(long *)(lVar9 + 8) = lVar18 + -0x10;
            uVar13 = *(undefined8 *)(lVar18 + -0x10);
            puVar24 = (undefined8 *)((long)puVar24 + (*(long *)(lVar9 + 0x30) - lVar23));
            puVar24[1] = *(undefined8 *)(lVar18 + -8);
            *puVar24 = uVar13;
            iVar7 = (*(int **)(lVar9 + 8))[3];
            if (iVar7 == 0) {
              return 0;
            }
            if (iVar7 == 1) {
              return (ulong)(**(int **)(lVar9 + 8) != 0);
            }
            return 1;
          }
        }
      }
    }
    break;
  case 1.12104e-44:
    lVar18 = ((long)*pdVar14 + 8) - *(long *)((long)*pdVar14 + 8);
    if ((lVar18 != 0) && (-1 < *(char *)(lVar18 + 3))) {
      plVar25 = (long *)((long)*pdVar10 + 8);
      plVar26 = (long *)*plVar25;
      puVar12 = (undefined8 *)
                func_0x006fe740(lVar18,7,*(undefined8 *)(*(long *)(lVar9 + 0x18) + 0x410));
      if (puVar12 != (undefined8 *)0x0) {
        lVar23 = (long)plVar25 - (long)plVar26;
        if (lVar18 == lVar23) goto code_r0x00702d14;
        if ((plVar25 != plVar26) && (-1 < *(char *)(lVar23 + 3))) {
          uVar13 = *(undefined8 *)(*(long *)(lVar9 + 0x18) + 0x410);
          goto code_r0x00702cf8;
        }
      }
    }
  }
  bVar6 = *pdVar14 == *pdVar10;
code_r0x00702e00:
  return (ulong)bVar6;
}

