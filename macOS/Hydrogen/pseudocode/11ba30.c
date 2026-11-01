
uint FUN_0011ba30(int *param_1,float param_2,float param_3,float param_4,float param_5,
                 ushort *param_6)

{
  int iVar1;
  int iVar2;
  int iVar3;
  uint uVar4;
  ushort uVar5;
  float fVar6;
  float fVar7;
  bool bVar8;
  bool bVar9;
  undefined1 in_ZR;
  bool bVar10;
  bool bVar11;
  ushort *puVar12;
  undefined8 uVar13;
  undefined8 uVar14;
  undefined8 uVar15;
  int *piVar16;
  long lVar17;
  float *in_x9;
  float *pfVar18;
  uint in_w10;
  float *pfVar19;
  int unaff_w19;
  int unaff_w20;
  long unaff_x21;
  int unaff_w22;
  ushort *puVar20;
  ushort *puVar21;
  long *unaff_x24;
  long unaff_x25;
  undefined8 *puVar22;
  long unaff_x26;
  ushort *unaff_x27;
  int *unaff_x28;
  long unaff_x29;
  float fVar23;
  undefined4 uVar24;
  float fVar25;
  float fVar26;
  float fVar27;
  float fVar28;
  float fVar29;
  float fVar30;
  float unaff_s8;
  float fVar31;
  float fVar32;
  float unaff_s9;
  float unaff_s12;
  float unaff_s13;
  float unaff_s14;
  undefined8 in_stack_00000018;
  int iStack0000000000000020;
  uint uStack0000000000000024;
  undefined8 in_stack_00000028;
  undefined8 in_stack_00000030;
  uint in_stack_00000038;
  float *in_stack_00000040;
  undefined8 in_stack_00000048;
  float in_stack_00000050;
  undefined8 in_stack_00000070;
  long in_stack_00000078;
  float in_stack_00000080;
  ulong in_stack_00000090;
  float fStack0000000000000098;
  undefined8 in_stack_000000a8;
  float in_stack_000000b0;
  long in_stack_000000c8;
  long in_stack_000000d0;
  long in_stack_000000d8;
  int iStack00000000000000e0;
  uint uStack00000000000000e4;
  long in_stack_000000e8;
  undefined8 in_stack_000000f0;
  undefined8 uStack00000000000000f8;
  undefined8 uStack0000000000000100;
  undefined8 uStack0000000000000108;
  float fStack0000000000000110;
  float fStack0000000000000114;
  
  do {
    if ((bool)in_ZR) {
      if (param_3 < param_5) {
        param_3 = param_5;
      }
      param_5 = 0.0;
    }
    else {
      pfVar18 = in_x9;
      if ((int)in_w10 < *param_1) {
        pfVar18 = (float *)(*(long *)(param_1 + 2) + (ulong)in_w10 * 4);
      }
      param_5 = param_5 + param_4 * *pfVar18;
    }
    do {
      if (unaff_x27 <= param_6) {
        if (param_5 <= param_3) {
          param_5 = param_3;
        }
        fStack0000000000000098 = unaff_s8 * unaff_s12;
        fVar6 = param_2 * (float)unaff_w19;
        if (in_stack_000000f0._4_4_ == 0) {
          fVar6 = unaff_s9;
        }
        if ((iStack00000000000000e0 != 0) && (*(char *)(unaff_x26 + 0xe84) != '\0')) {
          if ((in_stack_00000090._4_4_ >> 0xc & 1) == 0) {
            if (*(float *)(unaff_x26 + 0x50) <= unaff_s14) {
              fVar23 = unaff_s14 - (in_stack_000000b0 - *(float *)(in_stack_000000d8 + 0xc4));
              if (fVar23 < *(float *)(unaff_x26 + 0x50)) goto code_r0x0011bc1c;
              fVar23 = in_stack_000000b0 * 0.25 + fVar23;
            }
            else {
              fVar26 = unaff_s14 - in_stack_000000b0 * 0.25;
              fVar23 = 0.0;
              if (0.0 < fVar26) {
                fVar23 = fVar26;
              }
            }
            *(float *)(unaff_x26 + 0x50) = (float)(int)fVar23;
          }
          else {
            *(undefined4 *)(unaff_x26 + 0x50) = 0;
          }
code_r0x0011bc1c:
          if (in_stack_000000f0._4_4_ != 0) {
            fVar23 = fStack0000000000000098 - param_2;
            if (unaff_s13 <= fVar23) {
              fVar23 = *(float *)(&UNK_00003928 + unaff_x21);
              if (unaff_s13 <= fStack0000000000000098 - (in_stack_00000080 + fVar23 * -2.0)) {
                unaff_s13 = (fStack0000000000000098 - in_stack_00000080) + fVar23 * 2.0;
              }
            }
            else {
              unaff_s13 = 0.0;
              if (0.0 < fVar23) {
                unaff_s13 = fVar23;
              }
              fVar23 = *(float *)(&UNK_00003928 + unaff_x21);
            }
            in_stack_00000080 = (param_2 * (float)unaff_w19 + fVar23 * 2.0) - in_stack_00000080;
            if (in_stack_00000080 < 0.0) {
              in_stack_00000080 = 0.0;
            }
            if (unaff_s13 <= in_stack_00000080) {
              in_stack_00000080 = unaff_s13;
            }
            fVar23 = 0.0;
            if (0.0 <= unaff_s13) {
              fVar23 = in_stack_00000080;
            }
            uStack0000000000000100._4_4_ =
                 uStack0000000000000100._4_4_ + (*(float *)(in_stack_000000c8 + 0x90) - fVar23);
            *(float *)(in_stack_000000c8 + 0x90) = fVar23;
          }
          *(undefined1 *)(unaff_x26 + 0xe84) = 0;
        }
        fVar23 = *(float *)(unaff_x26 + 0x50);
        if (in_stack_00000048._4_4_ == 0) goto code_r0x0011becc;
        iVar2 = *(int *)(unaff_x26 + 0x58);
        iVar3 = *(int *)(unaff_x26 + 0x5c);
        iVar1 = iVar2;
        if (iVar3 <= iVar2) {
          iVar1 = iVar3;
        }
        if (iVar2 <= iVar3) {
          iVar2 = iVar3;
        }
        uVar13 = 0x3f800000;
        if (iStack00000000000000e0 == 0) {
          uVar13 = 0x3f19999a;
        }
        uVar13 = func_0x000bba44(uVar13,0x2f);
        fVar26 = 0.0;
        if (in_stack_000000f0._4_4_ == 0) {
          fVar26 = -1.0;
        }
        fVar27 = 0.0;
        if (in_stack_000000f0._4_4_ == 0) {
          fVar27 = 2.0;
        }
        if (iVar2 <= iVar1) goto code_r0x0011becc;
        puVar12 = (ushort *)(unaff_x25 + (long)iVar2 * 2);
        puVar21 = (ushort *)(unaff_x25 + (long)iVar1 * 2);
        param_5 = param_5 + (float)uStack0000000000000100;
        fVar31 = param_2 * (float)unaff_w20 + uStack0000000000000100._4_4_;
        fVar25 = *(float *)(&UNK_00003d38 + unaff_x21);
        fVar32 = (float)uStack0000000000000100;
        goto code_r0x0011bd5c;
      }
      puVar12 = param_6 + 1;
      uVar5 = *param_6;
      in_w10 = (uint)uVar5;
      param_6 = puVar12;
    } while (uVar5 == 0xd);
    in_ZR = uVar5 == 10;
  } while( true );
code_r0x0011bd5c:
  do {
    if (fStack0000000000000114 + fVar25 < fVar31) break;
    puVar20 = puVar21;
    if (uStack0000000000000108._4_4_ <= fVar31) {
      piVar16 = *(int **)(&UNK_00003d30 + unaff_x21);
      pfVar18 = (float *)(piVar16 + 4);
      fVar28 = 0.0;
      while (puVar21 < puVar12) {
        puVar20 = puVar21 + 1;
        uVar5 = *puVar21;
        puVar21 = puVar20;
        if (uVar5 != 0xd) {
          if (uVar5 == 10) {
            fVar29 = 0.0;
            if (0.0 < fVar28) {
              fVar29 = fVar28;
            }
            fVar28 = 0.0;
            if (0.0 <= fVar29) {
              fVar28 = fVar29;
            }
            goto joined_r0x0011be20;
          }
          pfVar19 = pfVar18;
          if ((int)(uint)uVar5 < *piVar16) {
            pfVar19 = (float *)(*(long *)(piVar16 + 2) + (ulong)(uint)uVar5 * 4);
          }
          fVar28 = fVar28 + (fVar25 / (float)piVar16[5]) * *pfVar19;
        }
      }
      if (fVar28 <= 0.0) {
        fVar28 = 0.0;
      }
joined_r0x0011be20:
      if (fVar28 <= 0.0) {
        if (0x20 < *piVar16) {
          pfVar18 = (float *)(*(long *)(piVar16 + 2) + 0x80);
        }
        fVar28 = (float)(int)(*pfVar18 * 0.5);
      }
      fVar30 = (param_5 - fVar23) + 0.0;
      fVar29 = fVar31 + (fVar26 - fVar25);
      fVar28 = (param_5 - fVar23) + fVar28;
      if (fVar30 < (float)uStack0000000000000108) {
        fVar30 = (float)uStack0000000000000108;
      }
      if (fVar29 < uStack0000000000000108._4_4_) {
        fVar29 = uStack0000000000000108._4_4_;
      }
      *(float *)(unaff_x29 + -0xf8) = fVar30;
      *(float *)(unaff_x29 + -0xf4) = fVar29;
      if (fStack0000000000000110 <= fVar28) {
        fVar28 = fStack0000000000000110;
      }
      fVar7 = fVar27 + fVar31;
      if (fStack0000000000000114 <= fVar27 + fVar31) {
        fVar7 = fStack0000000000000114;
      }
      *(float *)(unaff_x29 + -0xf0) = fVar28;
      *(float *)(unaff_x29 + -0xec) = fVar7;
      bVar8 = false;
      bVar10 = true;
      bVar11 = false;
      if (uStack0000000000000108._4_4_ < fVar7) {
        bVar8 = false;
        bVar10 = false;
        bVar11 = true;
        if (!NAN(fStack0000000000000114) && !NAN(fVar29)) {
          bVar8 = fStack0000000000000114 < fVar29;
          bVar10 = fStack0000000000000114 == fVar29;
          bVar11 = false;
        }
      }
      bVar9 = false;
      if ((!bVar10 && bVar8 == bVar11) &&
         (bVar9 = false, !NAN((float)uStack0000000000000108) && !NAN(fVar28))) {
        bVar9 = (float)uStack0000000000000108 < fVar28;
      }
      bVar8 = false;
      bVar10 = true;
      bVar11 = false;
      if (bVar9) {
        bVar8 = false;
        bVar10 = false;
        bVar11 = true;
        if (!NAN(fStack0000000000000110) && !NAN(fVar30)) {
          bVar8 = fStack0000000000000110 < fVar30;
          bVar10 = fStack0000000000000110 == fVar30;
          bVar11 = false;
        }
      }
      param_5 = fVar32;
      if (!bVar10 && bVar8 == bVar11) {
        func_0x000f3bb0(0,*(undefined8 *)(in_stack_000000c8 + 0x2a8),unaff_x29 + -0xf8,
                        unaff_x29 + -0xf0,uVar13,0);
        fVar25 = *(float *)(&UNK_00003d38 + unaff_x21);
        param_5 = (float)uStack0000000000000100;
      }
    }
    else {
      do {
        puVar21 = puVar20;
        param_5 = fVar32;
        if (puVar12 <= puVar20) break;
        puVar21 = puVar20 + 1;
        uVar5 = *puVar20;
        puVar20 = puVar21;
      } while (uVar5 != 10);
    }
    fVar31 = fVar31 + fVar25;
    fVar32 = param_5;
  } while (puVar21 < puVar12);
code_r0x0011becc:
  if (in_stack_000000f0._4_4_ == 0) {
    if (in_stack_000000d0 - in_stack_000000e8 < 0x200000) {
      puVar22 = &uStack0000000000000108;
      goto code_r0x0011bf08;
    }
  }
  else {
    puVar22 = (undefined8 *)0x0;
code_r0x0011bf08:
    uVar13 = func_0x000bba44(0x3f800000,in_stack_00000070._4_4_);
    uVar14 = *(undefined8 *)(in_stack_000000c8 + 0x2a8);
    uVar15 = *(undefined8 *)(&UNK_00003d30 + unaff_x21);
    uVar24 = *(undefined4 *)(&UNK_00003d38 + unaff_x21);
    *(float *)(unaff_x29 + -0xf8) = (float)uStack0000000000000100 - fVar23;
    *(float *)(unaff_x29 + -0xf4) = uStack0000000000000100._4_4_;
    func_0x000f4e60(uVar24,0,uVar14,uVar15,unaff_x29 + -0xf8,uVar13,in_stack_000000e8,
                    in_stack_000000d0,puVar22);
  }
  if (iStack00000000000000e0 == 0) {
joined_r0x0011bfb0:
    if ((_iStack0000000000000020 & 0x100000000) == 0) goto code_r0x0011bb4c;
code_r0x0011c078:
    if (in_stack_000000f0._4_4_ != 0) goto code_r0x0011c07c;
code_r0x0011c104:
    uStack0000000000000024 = uStack0000000000000024 ^ 1;
    if (*(char *)(in_stack_00000040 + 0x2f) == '\0') {
      uStack0000000000000024 = 1;
    }
    if ((uStack0000000000000024 & 1) != 0) goto LAB_0011c1cc;
LAB_0011c11c:
    func_0x000dc80c("{","}");
    func_0x000bc2c4(&uStack0000000000000100,in_stack_000000e8,in_stack_000000d0);
    if (0.0 < in_stack_000000a8._4_4_) goto LAB_0011c1d4;
LAB_0011c148:
    if (((in_stack_00000030._4_4_ ^ 1) & 1) != 0 || (in_stack_00000090 & 0x800000000000000) != 0)
    goto LAB_0011c160;
  }
  else {
    fVar26 = *(float *)(unaff_x21 + 0x18) + *(float *)(unaff_x26 + 0xe80);
    *(float *)(unaff_x26 + 0xe80) = fVar26;
    bVar8 = true;
    if ((*(char *)(unaff_x21 + 0x5b) != '\0') && (0.0 < fVar26)) {
      fVar26 = (float)_fmodf(fVar26,0x3f99999a);
      bVar8 = fVar26 <= 0.8;
    }
    fVar32 = (float)(int)((unaff_s14 + (float)uStack0000000000000100) - fVar23);
    fVar25 = (float)(int)(fStack0000000000000098 + uStack0000000000000100._4_4_);
    fVar26 = (fVar25 - *(float *)(&UNK_00003d38 + unaff_x21)) + 0.5;
    fVar27 = fVar32 + 1.0;
    *(float *)(unaff_x29 + -0xf8) = fVar32;
    *(float *)(unaff_x29 + -0xf4) = fVar26;
    fVar23 = fVar25 + -1.5;
    *(float *)(unaff_x29 + -0xf0) = fVar27;
    *(float *)(unaff_x29 + -0xec) = fVar23;
    if (bVar8) {
      bVar8 = false;
      bVar10 = true;
      bVar11 = false;
      if (uStack0000000000000108._4_4_ < fVar23) {
        bVar8 = false;
        bVar10 = false;
        bVar11 = true;
        if (!NAN(fStack0000000000000114) && !NAN(fVar26)) {
          bVar8 = fStack0000000000000114 < fVar26;
          bVar10 = fStack0000000000000114 == fVar26;
          bVar11 = false;
        }
      }
      bVar9 = false;
      if ((!bVar10 && bVar8 == bVar11) &&
         (bVar9 = false, !NAN((float)uStack0000000000000108) && !NAN(fVar27))) {
        bVar9 = (float)uStack0000000000000108 < fVar27;
      }
      bVar8 = false;
      bVar10 = true;
      bVar11 = false;
      if (bVar9) {
        bVar8 = false;
        bVar10 = false;
        bVar11 = true;
        if (!NAN(fStack0000000000000110) && !NAN(fVar32)) {
          bVar8 = fStack0000000000000110 < fVar32;
          bVar10 = fStack0000000000000110 == fVar32;
          bVar11 = false;
        }
      }
      if (!bVar10 && bVar8 == bVar11) {
        uVar14 = *(undefined8 *)(in_stack_000000c8 + 0x2a8);
        uStack00000000000000f8._0_4_ = fVar32;
        uStack00000000000000f8._4_4_ = fVar23;
        uVar13 = func_0x000bba44(0x3f800000,0);
        func_0x000f397c(0x3f800000,uVar14,unaff_x29 + -0xf8,&uStack00000000000000f8,uVar13);
      }
    }
    if ((uStack00000000000000e4 >> 0xe & 1) == 0) {
      *(undefined1 *)(in_stack_00000078 + 0x1b0) = 1;
      fVar23 = *(float *)(&UNK_00003d38 + unaff_x21);
      *in_stack_00000040 = fVar32 + -1.0;
      in_stack_00000040[1] = fVar25 - fVar23;
      in_stack_00000040[2] = fVar23;
      goto joined_r0x0011bfb0;
    }
    if ((_iStack0000000000000020 & 0x100000000) != 0) goto code_r0x0011c078;
code_r0x0011bb4c:
    func_0x000d34c4();
    if (in_stack_000000f0._4_4_ == 0) goto code_r0x0011c104;
code_r0x0011c07c:
    uStack00000000000000f8._4_4_ = fVar6 + *(float *)(&UNK_00003928 + unaff_x21);
    uStack00000000000000f8._0_4_ = in_stack_00000050;
    lVar17 = *(long *)(*unaff_x24 + 0x4000);
    *(undefined1 *)(lVar17 + 0xc0) = 1;
    if (*(char *)(lVar17 + 0xc3) == '\0') {
      uVar13 = *(undefined8 *)(lVar17 + 0x110);
      *(undefined8 *)(unaff_x29 + -0xf8) = uVar13;
      *(ulong *)(unaff_x29 + -0xf0) =
           CONCAT44(uStack00000000000000f8._4_4_ + (float)((ulong)uVar13 >> 0x20),
                    in_stack_00000050 + (float)uVar13);
      func_0x000d0d0c(0xbf800000,&uStack00000000000000f8);
      func_0x000d0e24(unaff_x29 + -0xf8,0,0,0);
    }
    *(uint *)("/System/Library/Frameworks/CoreServices.framework/Versions/A/CoreServices" +
             in_stack_000000d8 + 0xc) =
         *(uint *)("/System/Library/Frameworks/CoreServices.framework/Versions/A/CoreServices" +
                  in_stack_000000d8 + 0xc) | 0x401;
    func_0x000d0b80();
    uVar4 = unaff_x28[2];
    func_0x000d818c();
    if (*unaff_x28 != 0) goto code_r0x0011c104;
    *unaff_x28 = unaff_w22;
    unaff_x28[1] = iStack0000000000000020;
    unaff_x28[2] = uVar4 & 0x80 | in_stack_00000018._4_4_;
    uStack0000000000000024 = uStack0000000000000024 ^ 1;
    if (*(char *)(in_stack_00000040 + 0x2f) == '\0') {
      uStack0000000000000024 = 1;
    }
    if ((uStack0000000000000024 & 1) == 0) goto LAB_0011c11c;
LAB_0011c1cc:
    if (in_stack_000000a8._4_4_ <= 0.0) goto LAB_0011c148;
LAB_0011c1d4:
    func_0x000bc130(*(float *)(unaff_x29 + -0xa0) + *(float *)(&UNK_0000393c + unaff_x21),
                    *(float *)(unaff_x29 + -0xa4) + *(float *)(&UNK_00003928 + unaff_x21),
                    in_stack_00000028,0,1);
    if (((in_stack_00000030._4_4_ ^ 1) & 1) != 0 || (in_stack_00000090 & 0x800000000000000) != 0)
    goto LAB_0011c160;
  }
  func_0x000c255c();
LAB_0011c160:
  if ((in_stack_00000090 & 0x2000000000) != 0) {
    in_stack_00000030._4_4_ = in_stack_00000038;
  }
  return in_stack_00000030._4_4_;
}

