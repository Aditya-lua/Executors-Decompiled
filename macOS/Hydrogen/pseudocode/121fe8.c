
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined8 FUN_00121fe8(void)

{
  bool bVar1;
  uint uVar2;
  uint uVar3;
  int iVar4;
  int iVar5;
  ulong uVar6;
  undefined2 *puVar7;
  undefined8 uVar8;
  long unaff_x20;
  uint unaff_w21;
  uint unaff_w22;
  undefined8 *unaff_x23;
  ulong unaff_x24;
  ulong *unaff_x25;
  ulong unaff_x26;
  int *unaff_x27;
  byte bVar9;
  uint uVar10;
  uint unaff_w28;
  long lVar11;
  long unaff_x29;
  float fVar12;
  float fVar13;
  float fVar14;
  float fVar15;
  undefined4 uVar16;
  byte bVar19;
  float fVar17;
  float fVar18;
  float fVar20;
  undefined4 uVar21;
  float fVar22;
  int iVar23;
  float fVar24;
  float unaff_s8;
  float unaff_s9;
  ulong unaff_d10;
  float fVar25;
  float unaff_s11;
  float unaff_s12;
  float unaff_s13;
  float fVar26;
  float unaff_s14;
  float unaff_s15;
  undefined8 in_stack_00000018;
  float in_stack_00000020;
  undefined8 in_stack_00000030;
  float fStack0000000000000040;
  undefined4 uStack0000000000000044;
  float in_stack_00000048;
  undefined8 in_stack_00000050;
  int *in_stack_00000058;
  uint uStack0000000000000064;
  uint uStack0000000000000068;
  int iStack000000000000006c;
  undefined8 *in_stack_00000070;
  long in_stack_00000078;
  float in_stack_00000080;
  float fStack0000000000000090;
  float in_stack_000000a0;
  undefined8 uStack00000000000000d8;
  undefined8 uStack00000000000000e0;
  float fStack00000000000000e8;
  float fStack00000000000000ec;
  undefined8 uStack00000000000000f0;
  undefined8 uStack00000000000000f8;
  undefined8 uStack0000000000000100;
  undefined8 uStack0000000000000108;
  
  do {
    func_0x00106cb8(unaff_s8,unaff_s9,unaff_d10 & 0xffffffff,unaff_s13);
    do {
      fVar22 = unaff_s11;
      func_0x000d818c();
      if (((int)unaff_x25 == 0) ||
         (iVar5 = _memcmp(unaff_x29 + -0xb0,unaff_x23,in_stack_00000030), iVar5 == 0)) {
        uVar8 = 0;
      }
      else {
        if (*unaff_x27 != 0) {
          func_0x000c255c();
        }
        uVar8 = 1;
      }
      if (in_stack_00000050._4_4_ == 0) {
        unaff_x27[0x51e] = 0;
      }
      func_0x000d53d0();
      if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0xa0)) {
        return uVar8;
      }
      ___stack_chk_fail();
      if ((*(float *)(unaff_x29 + -0xfc) == 0.0) && ((float)unaff_x27[2] == 1.0)) {
        *(undefined4 *)(unaff_x29 + -0xfc) = 0x3f800000;
      }
      if (uStack0000000000000108._4_4_ == 0.0) {
        *(int *)(unaff_x29 + -0x100) = unaff_x27[3];
      }
      func_0x000d35a8(8,1);
      if ((unaff_w22 >> 0x1a & 1) == 0) {
        if ((unaff_w22 >> 0x19 & 1) == 0) {
          uStack0000000000000064 = 0;
          uStack0000000000000068 = 0;
          uVar10 = 0;
        }
        else {
          *(float *)(unaff_x29 + -0xd0) = in_stack_00000080;
          *(float *)(unaff_x29 + -0xcc) = in_stack_00000080;
          func_0x0010bf08("sv",unaff_x29 + -0xd0,0);
          uVar3 = func_0x000cfa5c();
          uVar10 = (unaff_w28 & 0x80) >> 7;
          if (((uVar3 ^ 1) & 1) == 0 && uVar10 == 0) {
            fVar12 = (*(float *)(in_stack_00000078 + 0xe40) - fStack0000000000000090) /
                     (in_stack_00000080 + -1.0);
            fVar13 = 1.0;
            if (fVar12 <= 1.0) {
              fVar13 = fVar12;
            }
            fVar17 = 0.0;
            if (0.0 <= fVar12) {
              fVar17 = fVar13;
            }
            *(float *)(unaff_x29 + -0x100) = fVar17;
            lVar11 = lRam0000000000a334c0;
            fVar12 = (*(float *)(in_stack_00000078 + 0xe44) - in_stack_000000a0) /
                     (in_stack_00000080 + -1.0);
            fVar13 = 0.0;
            if (fVar12 <= 1.0) {
              fVar13 = 1.0 - fVar12;
            }
            uStack0000000000000108._4_4_ = 1.0;
            if (0.0 <= fVar12) {
              uStack0000000000000108._4_4_ = fVar13;
            }
            if (*(int *)(&UNK_00005e24 + lRam0000000000a334c0) ==
                *(int *)(&UNK_00005e20 + lRam0000000000a334c0)) {
              iVar5 = *(int *)(&UNK_00005e30 + lRam0000000000a334c0);
              uVar16 = *(undefined4 *)(in_stack_00000070 + 1);
              *(undefined8 *)(unaff_x29 + -0xd0) = *in_stack_00000070;
              *(undefined4 *)(unaff_x29 + -200) = uVar16;
              *(undefined4 *)(unaff_x29 + -0xc4) = 0;
              iVar4 = func_0x000b9344(unaff_x29 + -0xd0);
              if (iVar5 == iVar4) {
                *(undefined4 *)(unaff_x29 + -0xfc) = *(undefined4 *)(&UNK_00005e28 + lVar11);
              }
            }
          }
          uStack0000000000000068 = (uVar3 ^ 1 | uVar10) ^ 1;
          if ((unaff_w22 >> 3 & 1) == 0) {
            func_0x000da0a8("context",1);
          }
          *(float *)(unaff_x29 + -0xd0) = unaff_s14;
          *(uint *)(unaff_x29 + -0xcc) = unaff_w21;
          func_0x000d84e8(unaff_x29 + -0xd0);
          *(float *)(unaff_x29 + -0xd0) = fVar22;
          *(float *)(unaff_x29 + -0xcc) = in_stack_00000080;
          func_0x0010bf08("hue",unaff_x29 + -0xd0,0);
          iVar5 = func_0x000cfa5c();
          uStack0000000000000064 = 0;
          if ((iVar5 == 0) || ((unaff_w28 >> 7 & 1) != 0)) {
            unaff_x23 = in_stack_00000070;
            uVar10 = uStack0000000000000068;
          }
          else {
            fVar12 = (*(float *)(in_stack_00000078 + 0xe44) - in_stack_000000a0) /
                     (in_stack_00000080 + -1.0);
            fVar13 = 1.0;
            if (fVar12 <= 1.0) {
              fVar13 = fVar12;
            }
            fVar17 = 0.0;
            if (0.0 <= fVar12) {
              fVar17 = fVar13;
            }
            *(float *)(unaff_x29 + -0xfc) = fVar17;
            uStack0000000000000064 = 1;
            unaff_x23 = in_stack_00000070;
            uVar10 = 1;
          }
        }
      }
      else {
        *(float *)(unaff_x29 + -0xd0) =
             fVar22 + in_stack_00000080 + *(float *)(&UNK_0000393c + in_stack_00000078);
        *(float *)(unaff_x29 + -0xcc) = in_stack_00000080;
        func_0x0010bf08("hsv",unaff_x29 + -0xd0,0);
        iVar5 = func_0x000cfa5c();
        bVar19 = 0;
        uStack0000000000000068 = 0;
        bVar9 = 0;
        if (iVar5 == 0) {
          uStack0000000000000064 = 0;
          uVar10 = 0;
        }
        else {
          if ((unaff_w28 >> 7 & 1) == 0) {
            fVar12 = *(float *)(&UNK_00003810 + in_stack_00000078) - unaff_s12;
            fVar17 = *(float *)(&UNK_00003814 + in_stack_00000078) - unaff_s13;
            fVar26 = *(float *)(in_stack_00000078 + 0xe40) - unaff_s12;
            fVar20 = *(float *)(in_stack_00000078 + 0xe44) - unaff_s13;
            fVar13 = fVar17 * fVar17 + fVar12 * fVar12;
            if ((fVar13 < (unaff_s8 + -1.0) * (unaff_s8 + -1.0)) ||
               ((in_stack_00000020 + 1.0) * (in_stack_00000020 + 1.0) < fVar13)) {
              bVar9 = 0;
            }
            else {
              fVar13 = (float)_atan2f(fVar20,fVar26);
              fVar14 = (fVar13 / 3.1415927) * 0.5;
              fVar13 = fVar14 + 1.0;
              if (0.0 <= fVar14) {
                fVar13 = fVar14;
              }
              *(float *)(unaff_x29 + -0xfc) = fVar13;
              bVar9 = 1;
            }
            fVar14 = 3.1415927;
            fVar13 = (float)___sincosf_stret(*(float *)(unaff_x29 + -0xfc) * -2.0 * 3.1415927);
            *(float *)(unaff_x29 + -0xd0) = -(fVar17 * fVar13) + fVar14 * fVar12;
            *(float *)(unaff_x29 + -0xcc) = fVar17 * fVar14 + fVar13 * fVar12;
            iVar5 = func_0x000b7c8c(unaff_x29 + -0xe8,unaff_x29 + -0xf0,unaff_x29 + -0xf8,
                                    unaff_x29 + -0xd0);
            if (iVar5 == 0) {
              uStack0000000000000064 = (uint)bVar9;
              uStack0000000000000068 = 0;
              uVar10 = (uint)bVar9;
              goto joined_r0x001214b8;
            }
            fVar12 = fVar20 * fVar14 + fVar13 * fVar26;
            *(float *)(unaff_x29 + -0xd0) = -(fVar20 * fVar13) + fVar14 * fVar26;
            *(float *)(unaff_x29 + -0xcc) = fVar12;
            uVar6 = func_0x000b7c8c(unaff_x29 + -0xe8,unaff_x29 + -0xf0,unaff_x29 + -0xf8,
                                    unaff_x29 + -0xd0);
            if ((uVar6 & 1) == 0) {
              uVar16 = func_0x000b7d84(unaff_x29 + -0xe8,unaff_x29 + -0xf0,unaff_x29 + -0xf8,
                                       unaff_x29 + -0xd0);
              *(undefined4 *)(unaff_x29 + -0xd0) = uVar16;
              *(float *)(unaff_x29 + -0xcc) = fVar12;
            }
            func_0x000b7d1c(unaff_x29 + -0xe8,unaff_x29 + -0xf0,unaff_x29 + -0xf8,unaff_x29 + -0xd0,
                            &uStack00000000000000f0,&uStack00000000000000e0,&uStack00000000000000d8)
            ;
            fVar12 = 1.0 - (float)uStack00000000000000e0;
            fVar13 = 1.0;
            if (fVar12 <= 1.0) {
              fVar13 = fVar12;
            }
            uStack0000000000000108._4_4_ = 0.0001;
            if (0.0001 <= fVar12) {
              uStack0000000000000108._4_4_ = fVar13;
            }
            fVar12 = (float)uStack00000000000000f0 / uStack0000000000000108._4_4_;
            fVar13 = 1.0;
            if (fVar12 <= 1.0) {
              fVar13 = fVar12;
            }
            fVar17 = 0.0001;
            if (0.0001 <= fVar12) {
              fVar17 = fVar13;
            }
            *(float *)(unaff_x29 + -0x100) = fVar17;
            bVar19 = 1;
            uStack0000000000000068 = 1;
          }
          uStack0000000000000064 = (uint)bVar9;
          uVar10 = (uint)bVar19;
        }
joined_r0x001214b8:
        if ((unaff_w22 >> 3 & 1) == 0) {
          func_0x000da0a8("context",1);
        }
      }
      unaff_s13 = (float)unaff_d10 + fVar22 + unaff_s14;
      if (iStack000000000000006c == 0x10000) {
        *(float *)(unaff_x29 + -0xd0) = unaff_s13;
        *(uint *)(unaff_x29 + -0xcc) = unaff_w21;
        func_0x000d84e8(unaff_x29 + -0xd0);
        *(float *)(unaff_x29 + -0xd0) = fVar22;
        *(float *)(unaff_x29 + -0xcc) = in_stack_00000080;
        func_0x0010bf08("alpha",unaff_x29 + -0xd0,0);
        iVar5 = func_0x000cfa5c();
        if (iVar5 != 0) {
          fVar12 = (*(float *)(in_stack_00000078 + 0xe44) - in_stack_000000a0) /
                   (in_stack_00000080 + -1.0);
          fVar13 = 0.0;
          if (fVar12 <= 1.0) {
            fVar13 = 1.0 - fVar12;
          }
          fVar17 = 1.0;
          if (0.0 <= fVar12) {
            fVar17 = fVar13;
          }
          *(float *)((long)unaff_x23 + 0xc) = fVar17;
          uVar10 = 1;
        }
      }
      func_0x000d3644();
      if ((unaff_w22 >> 8 & 1) == 0) {
        func_0x000d8444(0,*(undefined4 *)(&UNK_0000393c + in_stack_00000078));
        func_0x000d8a9c();
      }
      if (((unaff_w22 >> 7 & 1) == 0) && (uVar6 = func_0x000bc0e8(unaff_x26,0), uVar6 != unaff_x26))
      {
        if ((unaff_w22 >> 8 & 1) != 0) {
          func_0x000d8444(0,*(undefined4 *)(&UNK_0000393c + in_stack_00000078));
        }
        func_0x0010aa24(unaff_x26,uVar6,0);
      }
      if ((unaff_w22 >> 8 & 1) == 0) {
        func_0x000d35a8(0x10,1);
        uVar16 = *(undefined4 *)(unaff_x23 + 1);
        uVar21 = 0x3f800000;
        if ((unaff_w22 >> 1 & 1) == 0) {
          uVar21 = *(undefined4 *)((long)unaff_x23 + 0xc);
        }
        *(undefined8 *)(unaff_x29 + -0xd0) = *unaff_x23;
        *(undefined4 *)(unaff_x29 + -200) = uVar16;
        *(undefined4 *)(unaff_x29 + -0xc4) = uVar21;
        if ((unaff_w22 >> 7 & 1) != 0) {
          func_0x0010adc0("Current");
        }
        uStack00000000000000f0 = CONCAT44(fVar22 + fVar22,fVar22 * 3.0);
        func_0x001204a8("##current",unaff_x29 + -0xd0,unaff_w22 & 0x180e0040,&uStack00000000000000f0
                       );
        if (unaff_x25 != (ulong *)0x0) {
          func_0x0010adc0("Original");
          uStack00000000000000f0 = *unaff_x25;
          uStack00000000000000f8._0_4_ = (undefined4)unaff_x25[1];
          uStack00000000000000f8._4_4_ = 1.0;
          if ((unaff_w22 >> 1 & 1) == 0) {
            uStack00000000000000f8._4_4_ = *(float *)((long)unaff_x25 + 0xc);
          }
          uStack00000000000000e0 = CONCAT44(fVar22 + fVar22,fVar22 * 3.0);
          iVar5 = func_0x001204a8("##original",&uStack00000000000000f0,unaff_w22 & 0x180e0040,
                                  &uStack00000000000000e0);
          if (iVar5 != 0) {
            _memcpy(unaff_x23,unaff_x25,in_stack_00000030);
            uVar10 = 1;
          }
        }
        func_0x000d3644();
        func_0x000d818c();
      }
      if ((uStack0000000000000068 | uStack0000000000000064) == 1) {
        if ((unaff_w22 >> 0x1b & 1) == 0) {
          if ((unaff_w22 >> 0x1c & 1) != 0) {
            uVar16 = *(undefined4 *)(unaff_x29 + -0x100);
            *(undefined4 *)unaff_x23 = *(undefined4 *)(unaff_x29 + -0xfc);
            *(undefined4 *)((long)unaff_x23 + 4) = uVar16;
            *(float *)(unaff_x23 + 1) = uStack0000000000000108._4_4_;
          }
        }
        else {
          func_0x000b9458(*(undefined4 *)(unaff_x29 + -0xfc),*(undefined4 *)(unaff_x29 + -0x100),
                          uStack0000000000000108._4_4_,unaff_x23,in_stack_00000048,unaff_x24);
          in_stack_00000058[0x520] = *(int *)(unaff_x29 + -0xfc);
          in_stack_00000058[0x521] = *(int *)(unaff_x29 + -0x100);
          in_stack_00000058[0x51f] = in_stack_00000058[0x51e];
          uVar16 = *(undefined4 *)(unaff_x23 + 1);
          *(undefined8 *)(unaff_x29 + -0xd0) = *unaff_x23;
          *(undefined4 *)(unaff_x29 + -200) = uVar16;
          *(undefined4 *)(unaff_x29 + -0xc4) = 0;
          iVar5 = func_0x000b9344(unaff_x29 + -0xd0);
          in_stack_00000058[0x522] = iVar5;
        }
      }
      if ((unaff_w22 >> 5 & 1) == 0) {
        fVar13 = unaff_s13;
        if (iStack000000000000006c != 0x10000) {
          fVar13 = unaff_s14;
        }
        func_0x000d86b8((fVar22 + fVar13) - fStack0000000000000090);
        uVar3 = unaff_w22 & 0x198e005a;
        if ((((unaff_w22 >> 0x14 & 1) == 0) && ((unaff_w22 & 0x700000) != 0)) ||
           (iVar5 = func_0x0011f500("##rgb",unaff_x23,uVar3 | 0x100004), iVar5 == 0)) {
joined_r0x0012139c:
          bVar1 = false;
          if ((unaff_w22 >> 0x15 & 1) != 0) goto code_r0x001213a4;
code_r0x001213a0:
          if ((unaff_w22 & 0x700000) == 0) goto code_r0x001213a4;
        }
        else {
          if (*(int *)CONCAT44(uStack0000000000000044,fStack0000000000000040) == 0) {
            uVar10 = 1;
            goto joined_r0x0012139c;
          }
          bVar1 = *(char *)((long)CONCAT44(uStack0000000000000044,fStack0000000000000040) + 0xd) ==
                  '\0';
          uVar10 = 1;
          if ((unaff_w22 >> 0x15 & 1) == 0) goto code_r0x001213a0;
code_r0x001213a4:
          uVar2 = func_0x0011f500("##hsv",unaff_x23,uVar3 | 0x200004);
          uVar10 = uVar10 | uVar2;
        }
        if (((unaff_w22 >> 0x16 & 1) == 0) && ((unaff_w22 & 0x700000) != 0)) {
          func_0x000d88dc();
          bVar1 = (bool)(bVar1 ^ 1);
          if ((unaff_w22 & 0x8000000) == 0) {
            bVar1 = true;
          }
        }
        else {
          uVar3 = func_0x0011f500("##hex",unaff_x23,uVar3 | 0x400004);
          uVar10 = uVar10 | uVar3;
          func_0x000d88dc();
          bVar1 = (bool)(bVar1 ^ 1);
          if ((unaff_w22 & 0x8000000) == 0) {
            bVar1 = true;
          }
        }
        if (bVar1) goto joined_r0x00121390;
        func_0x000b93d8(*(undefined4 *)unaff_x23,*(undefined4 *)((long)unaff_x23 + 4),
                        *(undefined4 *)(unaff_x23 + 1),unaff_x29 + -0xd0,&uStack00000000000000f0,
                        &uStack00000000000000e0);
        if ((*(float *)(unaff_x29 + -0xd0) <= 0.0) && (0.0 < *(float *)(unaff_x29 + -0xfc))) {
          if ((0.0 < (float)uStack00000000000000e0) ||
             (uStack0000000000000108._4_4_ == (float)uStack00000000000000e0)) {
            if (0.0 < (float)uStack00000000000000f0) goto code_r0x001214e8;
            fVar12 = *(float *)(unaff_x29 + -0x100) * 0.5;
            fVar13 = (float)uStack00000000000000e0;
          }
          else {
            fVar12 = *(float *)(unaff_x29 + -0x100);
            fVar13 = uStack0000000000000108._4_4_ * 0.5;
          }
          func_0x000b9458(*(float *)(unaff_x29 + -0xfc),fVar12,fVar13,unaff_x23,in_stack_00000048,
                          unaff_x24);
        }
code_r0x001214e8:
        if ((uVar10 & 1) != 0) goto code_r0x001214ec;
code_r0x00121588:
        unaff_x25 = (ulong *)0x0;
      }
      else {
        uVar10 = uVar10 & 1;
joined_r0x00121390:
        if (uVar10 == 0) goto code_r0x00121588;
        if ((unaff_w22 >> 0x1b & 1) == 0) {
          if ((unaff_w22 >> 0x1c & 1) != 0) {
            uVar16 = *(undefined4 *)unaff_x23;
            *(undefined4 *)(unaff_x29 + -0x100) = *(undefined4 *)((long)unaff_x23 + 4);
            *(undefined4 *)(unaff_x29 + -0xfc) = uVar16;
            uStack0000000000000108._4_4_ = *(float *)(unaff_x23 + 1);
            func_0x000b9458(&uStack0000000000000108,(long)&uStack0000000000000100 + 4,
                            &uStack0000000000000100);
          }
        }
        else {
code_r0x001214ec:
          uStack0000000000000108._0_4_ = *(undefined4 *)unaff_x23;
          uStack0000000000000100._4_4_ = *(undefined4 *)((long)unaff_x23 + 4);
          uStack0000000000000100._0_4_ = *(float *)(unaff_x23 + 1);
          func_0x000b93d8(unaff_x29 + -0xfc,unaff_x29 + -0x100,(long)&uStack0000000000000108 + 4);
          lVar11 = lRam0000000000a334c0;
          if (*(int *)(&UNK_00005e24 + lRam0000000000a334c0) ==
              *(int *)(&UNK_00005e20 + lRam0000000000a334c0)) {
            iVar5 = *(int *)(&UNK_00005e30 + lRam0000000000a334c0);
            uVar16 = *(undefined4 *)(unaff_x23 + 1);
            *(undefined8 *)(unaff_x29 + -0xd0) = *unaff_x23;
            *(undefined4 *)(unaff_x29 + -200) = uVar16;
            *(undefined4 *)(unaff_x29 + -0xc4) = 0;
            iVar4 = func_0x000b9344(unaff_x29 + -0xd0);
            if (iVar5 == iVar4) {
              if (*(float *)(unaff_x29 + -0x100) == 0.0) {
                uVar16 = *(undefined4 *)(&UNK_00005e28 + lVar11);
code_r0x00121568:
                *(undefined4 *)(unaff_x29 + -0xfc) = uVar16;
              }
              else if ((*(float *)(unaff_x29 + -0xfc) == 0.0) &&
                      (uVar16 = 0x3f800000, *(float *)(&UNK_00005e28 + lVar11) == 1.0))
              goto code_r0x00121568;
              if (uStack0000000000000108._4_4_ == 0.0) {
                *(undefined4 *)(unaff_x29 + -0x100) = *(undefined4 *)(&UNK_00005e2c + lVar11);
              }
            }
          }
        }
        unaff_x25 = (ulong *)((long)&MACH_HEADER.magic + 1);
      }
      fStack0000000000000040 = (float)(int)(fVar22 * 0.2);
      uStack00000000000000f8._4_4_ = *(float *)(&UNK_000038e8 + in_stack_00000078);
      fVar13 = 1.0;
      if (uStack00000000000000f8._4_4_ <= 1.0) {
        fVar13 = uStack00000000000000f8._4_4_;
      }
      fVar12 = 0.0;
      if (0.0 <= uStack00000000000000f8._4_4_) {
        fVar12 = fVar13;
      }
      unaff_s12 = 0.5;
      iVar5 = (int)(fVar12 * 255.0 + 0.5);
      uVar10 = iVar5 << 0x18 | 0xff;
      unaff_w21 = iVar5 << 0x18 | 0xffff;
      *(uint *)(unaff_x29 + -0xd0) = uVar10;
      *(uint *)(unaff_x29 + -0xcc) = unaff_w21;
      bVar19 = (byte)iVar5;
      _fStack0000000000000090 =
           CONCAT17(bVar19 | (byte)((ulong)_UNK_008133c0 >> 0x38),
                    CONCAT16((char)((ulong)_UNK_008133c0 >> 0x30),
                             CONCAT15((char)((ulong)_UNK_008133c0 >> 0x28),
                                      CONCAT14((char)((ulong)_UNK_008133c0 >> 0x20),
                                               CONCAT13(bVar19 | (byte)((ulong)_UNK_008133c0 >> 0x18
                                                                       ),(int3)_UNK_008133c0)))));
      *(ulong *)(unaff_x29 + -0xc0) =
           CONCAT17(bVar19 | (byte)((ulong)_UNK_008133c8 >> 0x38),
                    CONCAT16((char)((ulong)_UNK_008133c8 >> 0x30),
                             CONCAT15((char)((ulong)_UNK_008133c8 >> 0x28),
                                      CONCAT14((char)((ulong)_UNK_008133c8 >> 0x20),
                                               CONCAT13(bVar19 | (byte)((ulong)_UNK_008133c8 >> 0x18
                                                                       ),(int3)_UNK_008133c8)))));
      *(ulong *)(unaff_x29 + -200) = _fStack0000000000000090;
      *(uint *)(unaff_x29 + -0xb8) = uVar10;
      unaff_d10 = NEON_fmov(0x3f800000,4);
      uStack00000000000000f8._0_4_ = 0x3f800000;
      uStack00000000000000f0 = unaff_d10;
      func_0x000b9458(*(undefined4 *)(unaff_x29 + -0xfc),0x3f800000,0x3f800000,
                      &uStack00000000000000f0,(ulong)&uStack00000000000000f0 | 4,
                      &uStack00000000000000f8);
      uVar16 = func_0x000b9344(&uStack00000000000000f0);
      fStack00000000000000ec = *(float *)(&UNK_000038e8 + in_stack_00000078);
      uStack00000000000000e0 =
           CONCAT44(uStack0000000000000100._4_4_,(undefined4)uStack0000000000000108);
      fStack00000000000000e8 = (float)uStack0000000000000100;
      unaff_x24 = func_0x000b9344(&uStack00000000000000e0);
      uStack00000000000000d8 = 0;
      if ((unaff_w22 >> 0x1a & 1) == 0) {
        if ((unaff_w22 >> 0x19 & 1) != 0) {
          uStack00000000000000e0 =
               CONCAT44(in_stack_00000080 + in_stack_000000a0,in_stack_00000018._4_4_);
          func_0x000f3ce4();
          uStack00000000000000e0 =
               CONCAT44(in_stack_00000080 +
                        (float)((ulong)*(undefined8 *)(unaff_x29 + -0xd8) >> 0x20),
                        in_stack_00000080 + (float)*(undefined8 *)(unaff_x29 + -0xd8));
          func_0x000f3ce4();
          func_0x000bd124(*(float *)(unaff_x29 + -0xd8),*(float *)(unaff_x29 + -0xd4),
                          in_stack_00000080 + *(float *)(unaff_x29 + -0xd8),
                          in_stack_00000080 + *(float *)(unaff_x29 + -0xd4),0);
          fVar13 = *(float *)(unaff_x29 + -0x100);
          fVar12 = 1.0 - uStack0000000000000108._4_4_;
          iVar4 = -(uint)(fVar13 < 0.0);
          iVar23 = -(uint)(fVar12 < 0.0);
          uVar6 = CONCAT44(fVar12,fVar13) ^
                  (CONCAT44(fVar12,fVar13) ^ unaff_d10) &
                  CONCAT44(-(uint)((float)(unaff_d10 >> 0x20) < fVar12),
                           -(uint)((float)unaff_d10 < fVar13));
          fVar13 = (float)CONCAT13((byte)(uVar6 >> 0x18) & ~(byte)((uint)iVar4 >> 0x18),
                                   CONCAT12((byte)(uVar6 >> 0x10) & ~(byte)((uint)iVar4 >> 0x10),
                                            CONCAT11((byte)(uVar6 >> 8) & ~(byte)((uint)iVar4 >> 8),
                                                     (byte)uVar6 & ~(byte)iVar4)));
          fVar12 = (float)*(undefined8 *)(unaff_x29 + -0xd8);
          fVar26 = (float)((ulong)*(undefined8 *)(unaff_x29 + -0xd8) >> 0x20);
          uVar6 = NEON_scvtf(CONCAT44((int)(fVar26 + (float)(CONCAT17((byte)(uVar6 >> 0x38) &
                                                                      ~(byte)((uint)iVar23 >> 0x18),
                                                                      CONCAT16((byte)(uVar6 >> 0x30)
                                                                               & ~(byte)((uint)
                                                  iVar23 >> 0x10),
                                                  CONCAT15((byte)(uVar6 >> 0x28) &
                                                           ~(byte)((uint)iVar23 >> 8),
                                                           CONCAT14((byte)(uVar6 >> 0x20) &
                                                                    ~(byte)iVar23,fVar13)))) >> 0x20
                                                  ) * in_stack_00000080 + 0.5),
                                      (int)(fVar12 + fVar13 * in_stack_00000080 + 0.5)),4);
          fVar17 = in_stack_00000080 + fVar12 + -2.0;
          fVar20 = in_stack_00000080 + fVar26 + -2.0;
          fVar13 = (float)(uVar6 >> 0x20);
          uStack00000000000000d8 =
               uVar6 ^ (uVar6 ^ CONCAT44(fVar20,fVar17)) &
                       CONCAT44(-(uint)(fVar20 < fVar13),-(uint)(fVar17 < (float)uVar6));
          uStack00000000000000d8 =
               uStack00000000000000d8 ^
               (uStack00000000000000d8 ^ CONCAT44(fVar26 + 2.0,fVar12 + 2.0)) &
               CONCAT44(-(uint)(fVar13 < fVar26 + 2.0),-(uint)((float)uVar6 < fVar12 + 2.0));
          fVar13 = in_stack_00000080 / 6.0;
          uStack00000000000000e0 = CONCAT44(fVar26 + fVar13 * 0.0,unaff_s14);
          func_0x000f3ce4();
          uStack00000000000000e0 = CONCAT44(fVar13 + *(float *)(unaff_x29 + -0xd4),unaff_s14);
          func_0x000f3ce4();
          uStack00000000000000e0 = CONCAT44(*(float *)(unaff_x29 + -0xd4) + fVar13 * 2.0,unaff_s14);
          func_0x000f3ce4();
          uStack00000000000000e0 = CONCAT44(*(float *)(unaff_x29 + -0xd4) + fVar13 * 3.0,unaff_s14);
          func_0x000f3ce4();
          uStack00000000000000e0 = CONCAT44(*(float *)(unaff_x29 + -0xd4) + fVar13 * 4.0,unaff_s14);
          func_0x000f3ce4();
          uStack00000000000000e0 = CONCAT44(*(float *)(unaff_x29 + -0xd4) + fVar13 * 5.0,unaff_s14);
          func_0x000f3ce4();
          fVar13 = *(float *)(unaff_x29 + -0xd4);
          fVar26 = (float)(int)(fVar13 + in_stack_00000080 * *(float *)(unaff_x29 + -0xfc) + 0.5);
          func_0x000bd124(unaff_s14,fVar13,fVar22 + unaff_s14,in_stack_00000080 + fVar13,0);
          fVar17 = fStack0000000000000040 + 1.0;
          unaff_d10 = (ulong)(uint)fVar17;
          fVar12 = *(float *)(&UNK_000038e8 + in_stack_00000078);
          fVar13 = 1.0;
          if (fVar12 <= 1.0) {
            fVar13 = fVar12;
          }
          fVar20 = 0.0;
          if (0.0 <= fVar12) {
            fVar20 = fVar13;
          }
          unaff_w22 = (uint)(fVar20 * 255.0 + 0.5);
          fVar13 = fVar17 + unaff_s14 + -1.0;
          func_0x00106cb8(fVar13 + 1.0,fVar26,fVar17 + 2.0,fVar17);
          unaff_w21 = unaff_w22 << 0x18 | 0xffffff;
          func_0x00106cb8(fVar13,fVar26,fVar17,fStack0000000000000040);
          unaff_s12 = (fVar22 + 2.0 + unaff_s14 + -1.0) - fVar17;
          func_0x00106cb8(unaff_s12 + -1.0,fVar26,fVar17 + 2.0,fVar17);
          func_0x00106cb8(unaff_s12,fVar26,fVar17,fStack0000000000000040);
          unaff_s14 = fVar26;
          unaff_s8 = fStack0000000000000040;
        }
      }
      else {
        lVar11 = 0;
        fVar13 = 0.5 / in_stack_00000020;
        fVar12 = -fVar13;
        _fStack0000000000000090 = (ulong)(uint)fVar12;
        in_stack_00000020 = in_stack_00000020 + unaff_s8;
        do {
          fVar17 = (float)(int)lVar11 / 6.0;
          fVar26 = fVar12 + (fVar17 + fVar17) * 3.1415927;
          fVar17 = ((float)(int)lVar11 + 1.0) / 6.0;
          unaff_s14 = fVar13 + (fVar17 + fVar17) * 3.1415927;
          unaff_w22 = *(uint *)(unaff_x20 + 0x20);
          fVar17 = fVar26;
          func_0x000f249c(in_stack_00000020 * 0.5,fVar26,unaff_s14);
          func_0x000f0ff4(unaff_s15);
          *(undefined4 *)(unaff_x20 + 0x78) = 0;
          fVar25 = *(float *)(unaff_x29 + -0xe0);
          fVar20 = (float)___sincosf_stret(fVar26);
          fVar24 = *(float *)(unaff_x29 + -0xdc);
          fVar26 = unaff_s8;
          fVar14 = (float)___sincosf_stret(unaff_s14);
          lVar11 = lVar11 + 1;
          func_0x000f6ff4(fVar25 + unaff_s8 * fVar17,fVar24 + unaff_s8 * fVar20,
                          fVar25 + unaff_s8 * fVar26,fVar24 + unaff_s8 * fVar14);
        } while (lVar11 != 6);
        fVar12 = 3.1415927;
        in_stack_000000a0 =
             (float)___sincosf_stret((*(float *)(unaff_x29 + -0xfc) + *(float *)(unaff_x29 + -0xfc))
                                     * 3.1415927);
        uStack00000000000000e0 =
             CONCAT44((float)((ulong)*(undefined8 *)(unaff_x29 + -0xe0) >> 0x20) +
                      in_stack_000000a0 * in_stack_00000020 * 0.5,
                      (float)*(undefined8 *)(unaff_x29 + -0xe0) + fVar12 * in_stack_00000020 * 0.5);
        fVar13 = 0.65;
        if (uStack0000000000000064 == 0) {
          fVar13 = 0.55;
        }
        fVar13 = unaff_s15 * fVar13;
        unaff_w21 = func_0x000f0898(fVar13);
        func_0x000f47e0(fVar13);
        func_0x000f46fc(fVar13 + 1.0,0x3f800000);
        func_0x000f46fc(fVar13,0x3f800000);
        fVar14 = *(float *)(unaff_x29 + -0xe0);
        fVar20 = *(float *)(unaff_x29 + -0xdc);
        fVar24 = fVar14 + -(*(float *)(unaff_x29 + -0xe4) * in_stack_000000a0) +
                          fVar12 * *(float *)(unaff_x29 + -0xe8);
        fVar17 = fVar20 + fVar12 * *(float *)(unaff_x29 + -0xe4) +
                          in_stack_000000a0 * *(float *)(unaff_x29 + -0xe8);
        fVar25 = fVar14 + -(*(float *)(unaff_x29 + -0xec) * in_stack_000000a0) +
                          fVar12 * *(float *)(unaff_x29 + -0xf0);
        fVar26 = fVar20 + fVar12 * *(float *)(unaff_x29 + -0xec) +
                          in_stack_000000a0 * *(float *)(unaff_x29 + -0xf0);
        fVar14 = fVar14 + -(*(float *)(unaff_x29 + -0xf4) * in_stack_000000a0) +
                          fVar12 * *(float *)(unaff_x29 + -0xf8);
        fVar20 = fVar20 + fVar12 * *(float *)(unaff_x29 + -0xf4) +
                          in_stack_000000a0 * *(float *)(unaff_x29 + -0xf8);
        unaff_s12 = fVar14;
        uVar6 = func_0x000d4330();
        uVar21 = (undefined4)uVar6;
        unaff_d10 = uVar6 & 0xffffffff;
        func_0x000f0c38();
        puVar7 = *(undefined2 **)(unaff_x20 + 0x50);
        *puVar7 = (short)*(undefined4 *)(unaff_x20 + 0x34);
        *(undefined2 **)(unaff_x20 + 0x50) = puVar7 + 1;
        **(undefined8 **)(unaff_x20 + 0x48) = CONCAT44(fVar17,fVar24);
        lVar11 = *(long *)(unaff_x20 + 0x48);
        *(undefined4 *)(lVar11 + 8) = uVar21;
        *(float *)(lVar11 + 0xc) = unaff_s12;
        *(undefined4 *)(lVar11 + 0x10) = uVar16;
        *(long *)(unaff_x20 + 0x48) = lVar11 + 0x14;
        iVar4 = *(int *)(unaff_x20 + 0x34) + 1;
        *(int *)(unaff_x20 + 0x34) = iVar4;
        puVar7 = *(undefined2 **)(unaff_x20 + 0x50);
        *puVar7 = (short)iVar4;
        *(undefined2 **)(unaff_x20 + 0x50) = puVar7 + 1;
        *(ulong *)(lVar11 + 0x14) = CONCAT44(fVar26,fVar25);
        lVar11 = *(long *)(unaff_x20 + 0x48);
        *(undefined4 *)(lVar11 + 8) = uVar21;
        *(float *)(lVar11 + 0xc) = unaff_s12;
        *(int *)(lVar11 + 0x10) = iVar5 << 0x18;
        *(long *)(unaff_x20 + 0x48) = lVar11 + 0x14;
        iVar4 = *(int *)(unaff_x20 + 0x34) + 1;
        *(int *)(unaff_x20 + 0x34) = iVar4;
        puVar7 = *(undefined2 **)(unaff_x20 + 0x50);
        *puVar7 = (short)iVar4;
        *(undefined2 **)(unaff_x20 + 0x50) = puVar7 + 1;
        *(ulong *)(lVar11 + 0x14) = CONCAT44(fVar20,fVar14);
        lVar11 = *(long *)(unaff_x20 + 0x48);
        *(undefined4 *)(lVar11 + 8) = uVar21;
        *(float *)(lVar11 + 0xc) = unaff_s12;
        *(uint *)(lVar11 + 0x10) = iVar5 << 0x18 | 0xffffff;
        *(long *)(unaff_x20 + 0x48) = lVar11 + 0x14;
        *(int *)(unaff_x20 + 0x34) = *(int *)(unaff_x20 + 0x34) + 1;
        func_0x000f4320(0x3fc00000);
        fVar12 = *(float *)(unaff_x29 + -0x100);
        fVar13 = 1.0;
        if (fVar12 <= 1.0) {
          fVar13 = fVar12;
        }
        fVar18 = 0.0;
        if (0.0 <= fVar12) {
          fVar18 = fVar13;
        }
        fVar12 = 1.0 - uStack0000000000000108._4_4_;
        fVar13 = 1.0;
        if (fVar12 <= 1.0) {
          fVar13 = fVar12;
        }
        fVar15 = 0.0;
        if (0.0 <= fVar12) {
          fVar15 = fVar13;
        }
        fVar14 = fVar14 + (fVar24 - fVar14) * fVar18;
        fVar20 = fVar20 + (fVar17 - fVar20) * fVar18;
        uStack00000000000000d8 =
             CONCAT44(fVar20 + (fVar26 - fVar20) * fVar15,fVar14 + (fVar25 - fVar14) * fVar15);
        unaff_x24 = unaff_x24 & 0xffffffff;
        in_stack_00000018._4_4_ = unaff_s13;
      }
      unaff_w28 = 0;
      unaff_x26 = (ulong)(iVar5 << 0x18 | 0x808080);
      fVar13 = 0.55;
      if (uStack0000000000000068 == 0) {
        fVar13 = 0.4;
      }
      fVar13 = unaff_s15 * fVar13;
      func_0x000f0898(fVar13);
      func_0x000f47e0(fVar13);
      func_0x000f46fc(fVar13 + 1.0,0x3f800000);
      func_0x000f46fc(fVar13,0x3f800000);
      unaff_x23 = in_stack_00000070;
      unaff_x27 = in_stack_00000058;
      unaff_s11 = 1.0;
      in_stack_00000048 = fVar22;
    } while (iStack000000000000006c != 0x10000);
    fVar12 = *(float *)((long)in_stack_00000070 + 0xc);
    fVar13 = 0.0;
    if (fVar12 <= 1.0) {
      fVar13 = 1.0 - fVar12;
    }
    fStack00000000000000e8 = fVar22 + unaff_s13;
    fStack00000000000000ec = in_stack_00000080 + *(float *)(unaff_x29 + -0xd4);
    uStack00000000000000e0 = CONCAT44(*(float *)(unaff_x29 + -0xd4),unaff_s13);
    unaff_s12 = 0.5;
    func_0x0010778c(unaff_s13);
    func_0x000f3ce4();
    fVar17 = 1.0;
    if (0.0 <= fVar12) {
      fVar17 = fVar13;
    }
    unaff_s9 = (float)(int)(*(float *)(unaff_x29 + -0xd4) + in_stack_00000080 * fVar17 + 0.5);
    func_0x000bd124(uStack00000000000000e0 & 0xffffffff,uStack00000000000000e0._4_4_,
                    fStack00000000000000e8,fStack00000000000000ec,0);
    unaff_s14 = unaff_s13 + -1.0;
    fVar12 = fStack0000000000000040 + 1.0;
    unaff_d10 = (ulong)(uint)fVar12;
    unaff_s15 = fVar22 + 2.0;
    fVar13 = *(float *)(&UNK_000038e8 + in_stack_00000078);
    fVar22 = 1.0;
    if (fVar13 <= 1.0) {
      fVar22 = fVar13;
    }
    fVar17 = 0.0;
    if (0.0 <= fVar13) {
      fVar17 = fVar22;
    }
    unaff_w22 = (uint)(fVar17 * 255.0 + 0.5);
    unaff_s11 = fVar12 + 2.0;
    func_0x00106cb8(fVar12 + unaff_s14 + 1.0,unaff_s9,unaff_s11,fVar12);
    unaff_w21 = unaff_w22 << 0x18 | 0xffffff;
    func_0x00106cb8(fVar12 + unaff_s14,unaff_s9,fVar12,fStack0000000000000040);
    unaff_s8 = (unaff_s15 + unaff_s14) - fVar12;
    func_0x00106cb8(unaff_s8 + -1.0,unaff_s9,unaff_s11,fVar12);
    unaff_s13 = fStack0000000000000040;
  } while( true );
}

