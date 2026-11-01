
long FUN_00280fd8(long param_1)

{
  char cVar1;
  undefined1 uVar2;
  int iVar3;
  int iVar4;
  int iVar5;
  long *plVar6;
  undefined8 uVar7;
  char *pcVar8;
  uint uVar9;
  long in_x9;
  ulong in_x10;
  ulong in_x11;
  ulong uVar10;
  bool bVar11;
  ulong uVar12;
  ulong uVar13;
  long *unaff_x19;
  long lVar14;
  long unaff_x20;
  long *plVar15;
  long lVar16;
  char *unaff_x22;
  long lVar17;
  uint uVar18;
  uint uVar19;
  char *pcVar20;
  char *pcVar21;
  long unaff_x26;
  long lVar22;
  long lVar23;
  undefined1 auVar24 [16];
  ulong uStack_100;
  ulong uStack_f8;
  undefined1 auStack_f0 [48];
  long lStack_c0;
  char *pcStack_b8;
  ulong uStack_b0;
  char *pcStack_a8;
  ulong uStack_a0;
  long *plStack_98;
  long lStack_90;
  long *plStack_88;
  undefined1 *puStack_80;
  undefined *puStack_78;
  byte bStack_61;
  undefined1 auStack_6 [6];
  
code_r0x00280fd8:
  unaff_x22[1] = *(char *)(in_x9 + (in_x11 & 0xf));
  unaff_x22 = unaff_x22 + 2;
  uVar10 = *(ulong *)(*unaff_x19 + in_x10 * 8);
  uVar12 = 1;
code_r0x00280ff4:
  uVar13 = uVar10 >> 0x18 & 0xff;
  if (((uVar12 & 1) == 0) && ((int)uVar13 == 0)) {
    uVar12 = uVar10 >> 0x10 & 0xff;
    if ((int)uVar12 != 0) goto LAB_00281040;
  }
  else {
    *unaff_x22 = *(char *)(in_x9 + (uVar13 >> 4));
    unaff_x22[1] = *(char *)(in_x9 + (uVar10 >> 0x18 & 0xf));
    unaff_x22 = unaff_x22 + 2;
    uVar10 = *(ulong *)(*unaff_x19 + in_x10 * 8);
    uVar12 = uVar10 >> 0x10 & 0xff;
LAB_00281040:
    *unaff_x22 = *(char *)(in_x9 + (uVar12 >> 4));
    unaff_x22[1] = *(char *)(in_x9 + (uVar10 >> 0x10 & 0xf));
    unaff_x22 = unaff_x22 + 2;
    uVar10 = *(ulong *)(*unaff_x19 + in_x10 * 8);
    uVar12 = 1;
  }
  uVar9 = (uint)uVar10;
  uVar19 = uVar9 >> 8 & 0xff;
  if (((uVar12 & 1) != 0) || (uVar19 != 0)) {
    *unaff_x22 = *(char *)(in_x9 + (ulong)(uVar19 >> 4));
    unaff_x22[1] = *(char *)(in_x9 + (uVar10 >> 8 & 0xf));
    unaff_x22 = unaff_x22 + 2;
    uVar10 = *(ulong *)(*unaff_x19 + in_x10 * 8);
    uVar9 = (uint)uVar10;
LAB_00280ed0:
    *unaff_x22 = *(char *)(in_x9 + (ulong)((uVar9 & 0xff) >> 4));
    unaff_x22[1] = *(char *)(in_x9 + (uVar10 & 0xf));
    unaff_x22 = unaff_x22 + 2;
    bVar11 = true;
    if (param_1 - 1U < 2) goto code_r0x00281090;
LAB_00280f00:
    param_1 = param_1 + -1;
    in_x10 = (ulong)((int)param_1 - 2);
    uVar10 = *(ulong *)(*unaff_x19 + in_x10 * 8);
    if ((bVar11) || (uVar10 >> 0x38 != 0)) {
      *unaff_x22 = *(char *)(in_x9 + (uVar10 >> 0x3c));
      unaff_x22[1] = *(char *)(in_x9 + (uVar10 >> 0x38 & 0xf));
      uVar10 = *(ulong *)(*unaff_x19 + in_x10 * 8);
      unaff_x22 = unaff_x22 + 2;
      uVar12 = uVar10 >> 0x30;
      uVar10 = uVar10 >> 0x30 & 0xff;
code_r0x00280f54:
      *unaff_x22 = *(char *)(in_x9 + (uVar10 >> 4));
      unaff_x22[1] = *(char *)(in_x9 + (uVar12 & 0xf));
      unaff_x22 = unaff_x22 + 2;
      uVar10 = *(ulong *)(*unaff_x19 + in_x10 * 8);
      bVar11 = true;
    }
    else {
      uVar12 = uVar10 >> 0x30;
      bVar11 = false;
      if (uVar12 != 0) {
        uVar10 = uVar12;
        goto code_r0x00280f54;
      }
    }
    uVar12 = uVar10 >> 0x28 & 0xff;
    if ((bVar11) || ((int)uVar12 != 0)) {
      *unaff_x22 = *(char *)(in_x9 + (uVar12 >> 4));
      unaff_x22[1] = *(char *)(in_x9 + (uVar10 >> 0x28 & 0xf));
      unaff_x22 = unaff_x22 + 2;
      uVar10 = *(ulong *)(*unaff_x19 + in_x10 * 8);
      uVar12 = uVar10 >> 0x20 & 0xff;
      goto code_r0x00280fc8;
    }
    uVar12 = uVar10 >> 0x20 & 0xff;
    if ((int)uVar12 != 0) goto code_r0x00280fc8;
    goto code_r0x00280ff4;
  }
  if ((uVar10 & 0xff) != 0) goto LAB_00280ed0;
  bVar11 = false;
  if (1 < param_1 - 1U) goto LAB_00280f00;
code_r0x00281090:
  if (*unaff_x22 == '\0') {
    return unaff_x20;
  }
  auVar24 = func_0x0079d10c();
  pcVar8 = auVar24._8_8_;
  plVar6 = auVar24._0_8_;
  if (pcVar8 == (char *)0x0) {
    return 0;
  }
  cVar1 = *pcVar8;
  if (cVar1 == '\0') {
    return 0;
  }
  uVar19 = (uint)(cVar1 == '-');
  uVar10 = (ulong)uVar19;
  if (cVar1 == '-') {
    pcVar8 = pcVar8 + 1;
  }
  pcVar20 = (char *)0xfffffffc;
  uVar12 = 0;
  do {
    uVar13 = uVar12;
    iVar4 = func_0x0036e8a8(pcVar8[uVar13]);
    uVar9 = (int)pcVar20 + 4;
    pcVar20 = (char *)(ulong)uVar9;
    uVar12 = uVar13 + 1;
  } while (iVar4 != 0 && (uVar10 ^ 0x7fffffff) != uVar13);
  if ((int)(uVar13 + 1) == 1) {
    func_0x0028f83c(3,0,0x77,"/aws-lc/crypto/bn_extra/convert.c",0xc5);
    return 0;
  }
  lVar14 = uVar13 + uVar10;
  if (plVar6 == (long *)0x0) {
    return lVar14;
  }
  plVar15 = (long *)*plVar6;
  if (plVar15 == (long *)0x0) {
    plVar15 = (long *)func_0x0029bbb8();
    if (plVar15 == (long *)0x0) {
      return 0;
    }
  }
  else {
    func_0x0029c0a4(plVar15);
  }
  if (0x1fffffff < (int)uVar13) {
    func_0x0028f83c(3,0,0x66,"/aws-lc/crypto/bn_extra/convert.c",0x74);
LAB_00281244:
    if (*plVar6 == 0) {
      func_0x0029bc0c(plVar15);
    }
    return 0;
  }
  iVar4 = func_0x0029c388(plVar15,(long)(int)uVar9);
  if (iVar4 == 0) goto LAB_00281244;
  if (0 < (int)uVar13) {
    unaff_x26 = 0;
    do {
      uVar12 = 0;
      uVar18 = (uint)uVar13;
      uVar9 = uVar18;
      if (0xf < uVar18) {
        uVar9 = 0x10;
      }
      lVar23 = (ulong)uVar9 + 1;
      pcVar21 = pcVar8 + ((uVar13 & 0xffffffff) - (ulong)uVar9);
      do {
        bStack_61 = 0;
        pcVar20 = pcVar21 + 1;
        iVar4 = func_0x0036e8c4(&bStack_61,(long)*pcVar21);
        if (iVar4 == 0) {
          func_0x0079d134();
          goto code_r0x00281290;
        }
        uVar12 = (ulong)bStack_61 | uVar12 << 4;
        lVar23 = lVar23 + -1;
        pcVar21 = pcVar20;
      } while (1 < lVar23);
      lVar23 = unaff_x26 + 1;
      *(ulong *)(*plVar15 + unaff_x26 * 8) = uVar12;
      uVar9 = 0;
      if (0xf < uVar18) {
        uVar9 = uVar18 - 0x10;
      }
      uVar13 = (ulong)uVar9;
      unaff_x26 = lVar23;
      if ((int)uVar9 < 1) goto code_r0x0028125c;
    } while( true );
  }
  lVar23 = 0;
code_r0x0028125c:
  if ((int)lVar23 <= *(int *)((long)plVar15 + 0xc)) {
    *(int *)(plVar15 + 1) = (int)lVar23;
    func_0x0029b09c(plVar15);
    iVar4 = func_0x0029b308(plVar15);
    if (iVar4 == 0) {
      *(uint *)(plVar15 + 2) = uVar19;
    }
    *plVar6 = (long)plVar15;
    return lVar14;
  }
code_r0x00281290:
  uVar7 = func_0x0079d15c();
  puStack_78 = &_aws_lc_0_24_0_BN_bn2dec;
  lStack_c0 = unaff_x26;
  pcStack_b8 = pcVar20;
  uStack_b0 = uVar13;
  pcStack_a8 = pcVar8;
  uStack_a0 = uVar10;
  plStack_98 = plVar15;
  lStack_90 = lVar14;
  plStack_88 = plVar6;
  puStack_80 = auStack_6 + -10;
  iVar4 = func_0x00281e30(auStack_f0,0x10);
  if ((iVar4 == 0) || (iVar4 = func_0x002824fc(auStack_f0,0), iVar4 == 0)) {
    lVar14 = 0;
    goto LAB_00281380;
  }
  iVar4 = func_0x0029b308(uVar7);
  if (iVar4 == 0) {
    lVar14 = func_0x0029bca4(uVar7);
    if (lVar14 == 0) goto LAB_00281380;
    while (iVar4 = func_0x0029b308(lVar14), iVar4 == 0) {
      uVar10 = func_0x002a12e8(lVar14,10000000000000000000);
      if (uVar10 == 0xffffffffffffffff) goto LAB_00281380;
      iVar4 = func_0x0029b308(lVar14);
      if ((iVar4 == 0) || (uVar10 != 0)) {
        uVar19 = 0;
        do {
          uVar12 = uVar10 / 10;
          iVar5 = func_0x002824fc(auStack_f0,(int)uVar10 + (int)uVar12 * -10 & 0xffU | 0x30);
          if (iVar5 == 0) goto LAB_00281380;
          bVar11 = 9 < uVar10;
          if (0x11 < uVar19) break;
          uVar19 = uVar19 + 1;
          uVar10 = uVar12;
        } while (iVar4 == 0 || bVar11);
      }
      else {
        uVar12 = 0;
      }
      if (uVar12 != 0) {
        auVar24 = func_0x0079d184();
        pcVar8 = auVar24._8_8_;
        plVar6 = auVar24._0_8_;
        if (pcVar8 != (char *)0x0) {
          cVar1 = *pcVar8;
          if (cVar1 == '\0') {
            return 0;
          }
          uVar19 = (uint)(cVar1 == '-');
          if (cVar1 == '-') {
            pcVar8 = pcVar8 + 1;
          }
          uVar10 = 0xffffffffffffffff;
          lVar14 = 0;
          do {
            lVar23 = lVar14;
            iVar4 = func_0x0036e898(pcVar8[lVar23]);
            uVar10 = uVar10 + 1;
            lVar14 = lVar23 + 1;
          } while (iVar4 != 0 && ((ulong)uVar19 - 0x7fffffff) + lVar23 != 0);
          iVar4 = (int)(lVar23 + 1);
          if (iVar4 != 1) {
            lVar14 = lVar23 + (ulong)uVar19;
            if (plVar6 == (long *)0x0) {
              return lVar14;
            }
            lVar16 = *plVar6;
            if (lVar16 == 0) {
              lVar16 = func_0x0029bbb8();
              if (lVar16 == 0) {
                return 0;
              }
            }
            else {
              func_0x0029c0a4(lVar16);
            }
            if (0 < (int)lVar23) {
              lVar22 = 0;
              lVar17 = 0;
              iVar3 = (int)(uVar10 / 0x13) * 0x13;
              iVar5 = 0;
              if (iVar3 + 1 != iVar4) {
                iVar5 = (iVar3 - iVar4) + 0x14;
              }
              do {
                lVar17 = (long)pcVar8[lVar22] + lVar17 * 10 + -0x30;
                iVar5 = iVar5 + 1;
                if (iVar5 == 0x13) {
                  iVar4 = func_0x002ac060(lVar16,10000000000000000000);
                  if ((iVar4 == 0) || (iVar4 = func_0x0029b0e4(lVar16,lVar17), iVar4 == 0)) {
                    if (*plVar6 == 0) {
                      func_0x0029bc0c(lVar16);
                      return 0;
                    }
                    return 0;
                  }
                  iVar5 = 0;
                  lVar17 = 0;
                }
                lVar22 = lVar22 + 1;
              } while (lVar23 != lVar22);
            }
            func_0x0029b09c(lVar16);
            iVar4 = func_0x0029b308(lVar16);
            if (iVar4 == 0) {
              *(uint *)(lVar16 + 0x10) = uVar19;
            }
            *plVar6 = lVar16;
            return lVar14;
          }
          func_0x0028f83c(3,0,0x77,"/aws-lc/crypto/bn_extra/convert.c",0xc5);
        }
        return 0;
      }
    }
  }
  else {
    iVar4 = func_0x002824fc(auStack_f0,0x30);
    lVar14 = 0;
    if (iVar4 == 0) goto LAB_00281380;
  }
  iVar4 = func_0x0029c378(uVar7);
  if (((iVar4 == 0) || (iVar4 = func_0x002824fc(auStack_f0,0x2d), iVar4 != 0)) &&
     (iVar4 = func_0x00281efc(auStack_f0,&uStack_f8,&uStack_100), iVar4 != 0)) {
    if (1 < uStack_100) {
      uVar10 = 0;
      lVar23 = -1;
      do {
        uVar2 = *(undefined1 *)(uStack_f8 + uVar10);
        *(undefined1 *)(uStack_f8 + uVar10) = *(undefined1 *)(uStack_f8 + uStack_100 + lVar23);
        *(undefined1 *)(uStack_f8 + uStack_100 + lVar23) = uVar2;
        uVar10 = uVar10 + 1;
        lVar23 = lVar23 + -1;
      } while (uVar10 < uStack_100 >> 1);
    }
    func_0x0029bc0c(lVar14);
    return uStack_f8;
  }
LAB_00281380:
  func_0x0029bc0c(lVar14);
  func_0x00281ecc(auStack_f0);
  return 0;
code_r0x00280fc8:
  in_x11 = uVar10 >> 0x20;
  *unaff_x22 = *(char *)(in_x9 + (uVar12 >> 4));
  goto code_r0x00280fd8;
}

