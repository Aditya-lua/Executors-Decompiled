
/* WARNING: Possible PIC construction at 0x00702b04: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x00702b08) */
/* WARNING: Removing unreachable block (ram,0x00702b10) */
/* WARNING: Removing unreachable block (ram,0x00702b30) */

ulong FUN_006e2974(void)

{
  uint uVar1;
  uint uVar2;
  uint uVar3;
  undefined8 uVar4;
  undefined1 *puVar5;
  bool bVar6;
  int iVar7;
  long lVar9;
  ulong uVar10;
  undefined8 *puVar11;
  undefined8 uVar12;
  int iVar8;
  double *pdVar13;
  undefined8 uVar14;
  undefined8 uVar15;
  float extraout_w8;
  float fVar16;
  long lVar17;
  double dVar18;
  float fVar19;
  double dVar20;
  undefined8 unaff_x19;
  double *unaff_x20;
  double *unaff_x21;
  long unaff_x22;
  undefined8 *puVar21;
  undefined8 unaff_x23;
  long lVar22;
  undefined8 *puVar23;
  undefined8 *unaff_x24;
  long *plVar24;
  undefined8 unaff_x25;
  long *plVar25;
  undefined8 unaff_x26;
  undefined1 auVar26 [16];
  undefined1 auVar27 [16];
  undefined8 in_stack_00000000;
  undefined8 in_stack_00000008;
  undefined8 in_stack_00000010;
  double *in_stack_00000018;
  undefined1 *in_stack_00000020;
  undefined *in_stack_00000028;
  undefined1 uStack0000000000000030;
  
  auVar27._8_8_ = in_stack_00000010;
  auVar27._0_8_ = in_stack_00000008;
  auVar26._8_8_ = unaff_x20;
  auVar26._0_8_ = unaff_x19;
  lVar9 = __dyld_get_image_header(0);
  if ((unaff_x20 == (double *)(lVar9 + unaff_x22)) ||
     (lVar9 = __dyld_get_image_header(0), unaff_x21 == (double *)(lVar9 + unaff_x22))) {
    return 0;
  }
  fVar16 = *(float *)((long)unaff_x20 + 0xc);
  if (fVar16 == *(float *)((long)unaff_x21 + 0xc)) {
    if (fVar16 == 4.2039e-45) {
      return (ulong)(*unaff_x20 < *unaff_x21);
    }
  }
  else {
    auVar26 = func_0x006ed000();
    fVar16 = extraout_w8;
  }
  if (fVar16 == 7.00649e-45) {
    uVar10 = func_0x007027e0(*auVar26._8_8_,*unaff_x21);
    return uVar10 >> 0x1f & 1;
  }
  puVar5 = &uStack0000000000000030;
  uVar12 = 0x10;
  uVar4 = 1;
  while( true ) {
    uVar15 = uVar4;
    uVar14 = uVar12;
    puVar23 = auVar26._8_8_;
    lVar9 = auVar26._0_8_;
    *(undefined8 **)(puVar5 + -0x40) = unaff_x24;
    *(undefined8 *)(puVar5 + -0x38) = unaff_x23;
    *(undefined8 *)(puVar5 + -0x30) = in_stack_00000000;
    *(undefined1 (*) [16])(puVar5 + -0x28) = auVar27;
    *(double **)(puVar5 + -0x18) = in_stack_00000018;
    *(undefined1 **)(puVar5 + -0x10) = in_stack_00000020;
    *(undefined **)(puVar5 + -8) = in_stack_00000028;
    puVar11 = (undefined8 *)func_0x006fe794();
    if (*(int *)((long)puVar11 + 0xc) == 0) {
      if ((int)uVar15 == 0) {
        return 0xffffffff;
      }
    }
    else {
      uVar12 = func_0x006fe794(lVar9,unaff_x21,uVar14);
      iVar7 = func_0x006f4b80(puVar11,uVar12);
      if (iVar7 != 0) {
        puVar21 = *(undefined8 **)(lVar9 + 8);
        lVar22 = *(long *)(lVar9 + 0x30);
        uVar12 = *puVar11;
        puVar21[1] = puVar11[1];
        *puVar21 = uVar12;
        lVar17 = *(long *)(lVar9 + 8);
        uVar12 = *puVar23;
        *(undefined8 *)(lVar17 + 0x18) = puVar23[1];
        *(undefined8 *)(lVar17 + 0x10) = uVar12;
        lVar17 = *(long *)(lVar9 + 8);
        dVar18 = *unaff_x21;
        *(double *)(lVar17 + 0x28) = unaff_x21[1];
        *(double *)(lVar17 + 0x20) = dVar18;
        lVar17 = *(long *)(lVar9 + 8);
        if (*(long *)(lVar9 + 0x28) - lVar17 < 0x31) {
          func_0x006ee1d4(lVar9,3);
          lVar17 = *(long *)(lVar9 + 8);
        }
        *(long *)(lVar9 + 8) = lVar17 + 0x30;
        func_0x006ee550(lVar9,lVar17,1);
        lVar17 = *(long *)(lVar9 + 8);
        *(long *)(lVar9 + 8) = lVar17 + -0x10;
        uVar12 = *(undefined8 *)(lVar17 + -0x10);
        puVar21 = (undefined8 *)((long)puVar21 + (*(long *)(lVar9 + 0x30) - lVar22));
        puVar21[1] = *(undefined8 *)(lVar17 + -8);
        *puVar21 = uVar12;
        uVar1 = (*(int **)(lVar9 + 8))[3];
        uVar10 = (ulong)uVar1;
        if (uVar1 != 0) {
          if (uVar1 != 1) {
            return 1;
          }
          uVar10 = (ulong)(**(int **)(lVar9 + 8) != 0);
        }
        return uVar10;
      }
      unaff_x24 = puVar11;
      if ((int)uVar15 == 0) {
        return 0xffffffff;
      }
    }
    in_stack_00000018 = unaff_x21;
    auVar26 = func_0x006ed000(lVar9,puVar23,unaff_x21,uVar14);
    auVar26._8_8_ = auVar26._8_8_;
    *(undefined8 *)(puVar5 + -0x70) = uVar14;
    *(undefined8 **)(puVar5 + -0x68) = puVar23;
    *(double **)(puVar5 + -0x60) = unaff_x21;
    *(long *)(puVar5 + -0x58) = lVar9;
    *(undefined1 **)(puVar5 + -0x50) = puVar5 + -0x10;
    *(undefined **)(puVar5 + -0x48) = &DAT_00702a2c;
    in_stack_00000020 = puVar5 + -0x50;
    fVar16 = *(float *)((long)auVar26._8_8_ + 0xc);
    if (fVar16 != *(float *)((long)in_stack_00000018 + 0xc)) break;
    if (fVar16 == 7.00649e-45) {
      dVar18 = *auVar26._8_8_;
      dVar20 = *in_stack_00000018;
      if (dVar18 == dVar20) {
        return 1;
      }
      iVar7 = (uint)*(byte *)((long)dVar18 + 0x18) - (uint)*(byte *)((long)dVar20 + 0x18);
      if (iVar7 == 0) {
        uVar2 = *(uint *)((long)dVar18 + 0x14);
        uVar3 = *(uint *)((long)dVar20 + 0x14);
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
        iVar8 = _memcmp((byte *)((long)dVar18 + 0x18),(byte *)((long)dVar20 + 0x18),uVar1);
        if (iVar8 != 0) {
          iVar7 = iVar8;
        }
      }
      return (ulong)(iVar7 < 1);
    }
    if (fVar16 == 4.2039e-45) {
      return (ulong)(*auVar26._8_8_ <= *in_stack_00000018);
    }
    in_stack_00000028 = &UNK_00702b08;
    puVar5 = puVar5 + -0x70;
    unaff_x21 = in_stack_00000018;
    uVar12 = 0x11;
    uVar4 = 0;
    in_stack_00000000 = uVar14;
    unaff_x23 = uVar15;
    auVar27 = auVar26;
  }
  pdVar13 = in_stack_00000018;
  auVar27 = func_0x006ed000(auVar26._0_8_,auVar26._8_8_,in_stack_00000018,0x11);
  auVar26._8_8_ = auVar27._8_8_;
  lVar9 = auVar27._0_8_;
  *(undefined8 *)(puVar5 + -0xc0) = unaff_x26;
  *(undefined8 *)(puVar5 + -0xb8) = unaff_x25;
  *(undefined8 **)(puVar5 + -0xb0) = unaff_x24;
  *(undefined8 *)(puVar5 + -0xa8) = uVar15;
  *(undefined8 *)(puVar5 + -0xa0) = uVar14;
  *(undefined1 (*) [16])(puVar5 + -0x98) = auVar26;
  *(double **)(puVar5 + -0x88) = in_stack_00000018;
  *(undefined1 **)(puVar5 + -0x80) = in_stack_00000020;
  *(undefined **)(puVar5 + -0x78) = &DAT_00702b78;
  switch(*(float *)((long)auVar26._8_8_ + 0xc)) {
  case 0.0:
    return 1;
  case 1.4013e-45:
    fVar16 = *(float *)auVar26._8_8_;
    fVar19 = *(float *)pdVar13;
    goto code_r0x00702dfc;
  case 2.8026e-45:
    if (*auVar26._8_8_ != *pdVar13) {
      return 0;
    }
    fVar16 = *(float *)(auVar26._8_8_ + 1);
    fVar19 = *(float *)(pdVar13 + 1);
code_r0x00702dfc:
    bVar6 = fVar16 == fVar19;
    goto code_r0x00702e00;
  case 4.2039e-45:
    bVar6 = *auVar26._8_8_ == *pdVar13;
    goto code_r0x00702e00;
  case 5.60519e-45:
    if (*(float *)auVar26._8_8_ != *(float *)pdVar13) {
      return 0;
    }
    if (*(float *)((long)auVar26._8_8_ + 4) != *(float *)((long)pdVar13 + 4)) {
      return 0;
    }
    bVar6 = *(float *)(auVar26._8_8_ + 1) == *(float *)(pdVar13 + 1);
    goto code_r0x00702e00;
  case 8.40779e-45:
    lVar17 = *(long *)((long)*auVar26._8_8_ + 0x10);
    if ((lVar17 != 0) && (-1 < *(char *)(lVar17 + 3))) {
      lVar22 = *(long *)((long)*pdVar13 + 0x10);
      puVar11 = (undefined8 *)
                func_0x006fe740(lVar17,7,*(undefined8 *)(*(long *)(lVar9 + 0x18) + 0x410));
      if (puVar11 != (undefined8 *)0x0) {
        if (lVar17 == lVar22) goto code_r0x00702d14;
        if ((lVar22 != 0) && (-1 < *(char *)(lVar22 + 3))) {
          uVar12 = *(undefined8 *)(*(long *)(lVar9 + 0x18) + 0x410);
code_r0x00702cf8:
          lVar17 = func_0x006fe740(lVar22,7,uVar12);
          if ((lVar17 != 0) && (iVar7 = func_0x006f4b80(puVar11,lVar17), iVar7 != 0)) {
code_r0x00702d14:
            puVar23 = *(undefined8 **)(lVar9 + 8);
            lVar22 = *(long *)(lVar9 + 0x30);
            uVar12 = *puVar11;
            puVar23[1] = puVar11[1];
            *puVar23 = uVar12;
            lVar17 = *(long *)(lVar9 + 8);
            dVar18 = *auVar26._8_8_;
            *(double *)(lVar17 + 0x18) = auVar26._8_8_[1];
            *(double *)(lVar17 + 0x10) = dVar18;
            lVar17 = *(long *)(lVar9 + 8);
            dVar18 = *pdVar13;
            *(double *)(lVar17 + 0x28) = pdVar13[1];
            *(double *)(lVar17 + 0x20) = dVar18;
            lVar17 = *(long *)(lVar9 + 8);
            if (*(long *)(lVar9 + 0x28) - lVar17 < 0x31) {
              func_0x006ee1d4(lVar9,3);
              lVar17 = *(long *)(lVar9 + 8);
            }
            *(long *)(lVar9 + 8) = lVar17 + 0x30;
            func_0x006ee550(lVar9,lVar17,1);
            lVar17 = *(long *)(lVar9 + 8);
            *(long *)(lVar9 + 8) = lVar17 + -0x10;
            uVar12 = *(undefined8 *)(lVar17 + -0x10);
            puVar23 = (undefined8 *)((long)puVar23 + (*(long *)(lVar9 + 0x30) - lVar22));
            puVar23[1] = *(undefined8 *)(lVar17 + -8);
            *puVar23 = uVar12;
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
    lVar17 = ((long)*auVar26._8_8_ + 8) - *(long *)((long)*auVar26._8_8_ + 8);
    if ((lVar17 != 0) && (-1 < *(char *)(lVar17 + 3))) {
      plVar24 = (long *)((long)*pdVar13 + 8);
      plVar25 = (long *)*plVar24;
      puVar11 = (undefined8 *)
                func_0x006fe740(lVar17,7,*(undefined8 *)(*(long *)(lVar9 + 0x18) + 0x410));
      if (puVar11 != (undefined8 *)0x0) {
        lVar22 = (long)plVar24 - (long)plVar25;
        if (lVar17 == lVar22) goto code_r0x00702d14;
        if ((plVar24 != plVar25) && (-1 < *(char *)(lVar22 + 3))) {
          uVar12 = *(undefined8 *)(*(long *)(lVar9 + 0x18) + 0x410);
          goto code_r0x00702cf8;
        }
      }
    }
  }
  bVar6 = *auVar26._8_8_ == *pdVar13;
code_r0x00702e00:
  return (ulong)bVar6;
}

