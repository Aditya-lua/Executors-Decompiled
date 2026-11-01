
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined8
FUN_00121768(ulong param_1,ulong param_2,ulong param_3,ulong param_4,float param_5,ulong param_6,
            float param_7)

{
  bool bVar1;
  uint uVar2;
  int iVar3;
  uint uVar4;
  int iVar5;
  ulong uVar6;
  undefined2 *puVar7;
  undefined8 uVar8;
  long unaff_x20;
  uint uVar9;
  ulong unaff_x24;
  ulong *unaff_x25;
  ulong unaff_x26;
  int *unaff_x27;
  byte bVar10;
  uint uVar11;
  uint unaff_w28;
  long lVar12;
  long unaff_x29;
  float fVar13;
  float fVar14;
  float fVar15;
  undefined4 uVar16;
  float fVar17;
  byte bVar18;
  undefined4 uVar19;
  float fVar20;
  float unaff_s9;
  float fVar21;
  float fVar22;
  float unaff_s11;
  float fVar23;
  float unaff_s12;
  float unaff_s13;
  float unaff_s14;
  float fVar24;
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
  float fStack00000000000000d0;
  float fStack00000000000000d4;
  undefined1 uStack00000000000000d8;
  undefined1 uStack00000000000000e0;
  undefined4 uStack00000000000000e4;
  float fStack00000000000000e8;
  float fStack00000000000000ec;
  undefined8 uStack00000000000000f0;
  undefined8 uStack00000000000000f8;
  undefined8 uStack0000000000000100;
  undefined8 uStack0000000000000108;
  
  do {
    param_1 = param_1 ^ (param_1 ^ param_2) & param_6;
    _uStack00000000000000d8 = param_1 ^ (param_1 ^ param_3) & param_4;
    param_7 = param_7 / 6.0;
    _uStack00000000000000e0 = CONCAT44(param_5 + unaff_s11 * param_7,unaff_s14);
    fStack00000000000000d4 = param_7 + param_5;
    fStack00000000000000d0 = unaff_s9;
    func_0x000f3ce4();
    _uStack00000000000000e0 = CONCAT44(param_7 + *(float *)(unaff_x29 + -0xd4),unaff_s14);
    fStack00000000000000d4 = *(float *)(unaff_x29 + -0xd4) + param_7 * 2.0;
    fStack00000000000000d0 = unaff_s9;
    func_0x000f3ce4();
    _uStack00000000000000e0 = CONCAT44(*(float *)(unaff_x29 + -0xd4) + param_7 * 2.0,unaff_s14);
    fStack00000000000000d4 = *(float *)(unaff_x29 + -0xd4) + param_7 * 3.0;
    fStack00000000000000d0 = unaff_s9;
    func_0x000f3ce4();
    _uStack00000000000000e0 = CONCAT44(*(float *)(unaff_x29 + -0xd4) + param_7 * 3.0,unaff_s14);
    fStack00000000000000d4 = *(float *)(unaff_x29 + -0xd4) + param_7 * 4.0;
    fStack00000000000000d0 = unaff_s9;
    func_0x000f3ce4();
    _uStack00000000000000e0 = CONCAT44(*(float *)(unaff_x29 + -0xd4) + param_7 * 4.0,unaff_s14);
    fStack00000000000000d4 = *(float *)(unaff_x29 + -0xd4) + param_7 * 5.0;
    fStack00000000000000d0 = unaff_s9;
    func_0x000f3ce4();
    _uStack00000000000000e0 = CONCAT44(*(float *)(unaff_x29 + -0xd4) + param_7 * 5.0,unaff_s14);
    fStack00000000000000d4 = *(float *)(unaff_x29 + -0xd4) + param_7 * 6.0;
    fStack00000000000000d0 = unaff_s9;
    func_0x000f3ce4();
    fVar17 = *(float *)(unaff_x29 + -0xd4);
    fVar24 = (float)(int)(fVar17 + in_stack_00000080 * *(float *)(unaff_x29 + -0xfc) + unaff_s12);
    func_0x000bd124(unaff_s14,fVar17,unaff_s9,in_stack_00000080 + fVar17,0);
    fVar22 = fStack0000000000000040 + 1.0;
    uVar6 = (ulong)(uint)fVar22;
    fVar13 = *(float *)(&UNK_000038e8 + in_stack_00000078);
    fVar17 = 1.0;
    if (fVar13 <= 1.0) {
      fVar17 = fVar13;
    }
    fVar21 = 0.0;
    if (0.0 <= fVar13) {
      fVar21 = fVar17;
    }
    uVar9 = (uint)(unaff_s12 + fVar21 * 255.0);
    fVar17 = fVar22 + unaff_s14 + -1.0;
    func_0x00106cb8(fVar17 + 1.0,fVar24,fVar22 + 2.0,fVar22);
    uVar4 = uVar9 << 0x18 | 0xffffff;
    func_0x00106cb8(fVar17,fVar24,fVar22,fStack0000000000000040);
    unaff_s12 = (in_stack_00000048 + 2.0 + unaff_s14 + -1.0) - fVar22;
    func_0x00106cb8(unaff_s12 + -1.0,fVar24,fVar22 + 2.0,fVar22);
    func_0x00106cb8(unaff_s12,fVar24,fVar22,fStack0000000000000040);
    unaff_s14 = fVar24;
    fVar17 = fStack0000000000000040;
LAB_00121dd8:
    do {
      fVar22 = (float)uVar6;
      fVar13 = 0.55;
      if (uStack0000000000000068 == 0) {
        fVar13 = 0.4;
      }
      fVar13 = unaff_s15 * fVar13;
      func_0x000f0898(fVar13);
      func_0x000f47e0(fVar13);
      fVar24 = 1.0;
      func_0x000f46fc(fVar13 + 1.0,0x3f800000);
      func_0x000f46fc(fVar13,0x3f800000);
      if (iStack000000000000006c == 0x10000) {
        fVar13 = *(float *)((long)in_stack_00000070 + 0xc);
        fVar17 = 0.0;
        if (fVar13 <= 1.0) {
          fVar17 = 1.0 - fVar13;
        }
        fStack00000000000000e8 = in_stack_00000048 + unaff_s13;
        fStack00000000000000ec = in_stack_00000080 + *(float *)(unaff_x29 + -0xd4);
        _uStack00000000000000e0 = CONCAT44(*(float *)(unaff_x29 + -0xd4),unaff_s13);
        unaff_s12 = 0.5;
        func_0x0010778c(unaff_s13);
        func_0x000f3ce4();
        fVar22 = 1.0;
        if (0.0 <= fVar13) {
          fVar22 = fVar17;
        }
        fVar21 = (float)(int)(*(float *)(unaff_x29 + -0xd4) + in_stack_00000080 * fVar22 + 0.5);
        func_0x000bd124(_uStack00000000000000e0 & 0xffffffff,uStack00000000000000e4,
                        fStack00000000000000e8,fStack00000000000000ec,0);
        unaff_s14 = unaff_s13 + -1.0;
        fVar22 = fStack0000000000000040 + 1.0;
        unaff_s15 = in_stack_00000048 + 2.0;
        fVar13 = *(float *)(&UNK_000038e8 + in_stack_00000078);
        fVar17 = 1.0;
        if (fVar13 <= 1.0) {
          fVar17 = fVar13;
        }
        fVar24 = 0.0;
        if (0.0 <= fVar13) {
          fVar24 = fVar17;
        }
        uVar9 = (uint)(fVar24 * 255.0 + 0.5);
        fVar24 = fVar22 + 2.0;
        func_0x00106cb8(fVar22 + unaff_s14 + 1.0,fVar21,fVar24,fVar22);
        uVar4 = uVar9 << 0x18 | 0xffffff;
        func_0x00106cb8(fVar22 + unaff_s14,fVar21,fVar22,fStack0000000000000040);
        fVar17 = (unaff_s15 + unaff_s14) - fVar22;
        func_0x00106cb8(fVar17 + -1.0,fVar21,fVar24,fVar22);
        func_0x00106cb8(fVar17,fVar21,fVar22,fStack0000000000000040);
        unaff_s13 = fStack0000000000000040;
      }
      func_0x000d818c();
      if (((int)unaff_x25 == 0) ||
         (iVar5 = _memcmp(unaff_x29 + -0xb0,in_stack_00000070,in_stack_00000030), iVar5 == 0)) {
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
      unaff_s9 = fVar24 + unaff_s14;
      func_0x000d35a8(8,1);
      if ((uVar9 >> 0x1a & 1) == 0) {
        if ((uVar9 >> 0x19 & 1) == 0) {
          uStack0000000000000064 = 0;
          uStack0000000000000068 = 0;
          uVar11 = 0;
        }
        else {
          *(float *)(unaff_x29 + -0xd0) = in_stack_00000080;
          *(float *)(unaff_x29 + -0xcc) = in_stack_00000080;
          func_0x0010bf08("sv",unaff_x29 + -0xd0,0);
          uVar2 = func_0x000cfa5c();
          uVar11 = (unaff_w28 & 0x80) >> 7;
          if (((uVar2 ^ 1) & 1) == 0 && uVar11 == 0) {
            fVar21 = (*(float *)(in_stack_00000078 + 0xe40) - fStack0000000000000090) /
                     (in_stack_00000080 + -1.0);
            fVar13 = 1.0;
            if (fVar21 <= 1.0) {
              fVar13 = fVar21;
            }
            fVar14 = 0.0;
            if (0.0 <= fVar21) {
              fVar14 = fVar13;
            }
            *(float *)(unaff_x29 + -0x100) = fVar14;
            lVar12 = lRam0000000000a334c0;
            fVar21 = (*(float *)(in_stack_00000078 + 0xe44) - in_stack_000000a0) /
                     (in_stack_00000080 + -1.0);
            fVar13 = 0.0;
            if (fVar21 <= 1.0) {
              fVar13 = 1.0 - fVar21;
            }
            uStack0000000000000108._4_4_ = 1.0;
            if (0.0 <= fVar21) {
              uStack0000000000000108._4_4_ = fVar13;
            }
            if (*(int *)(&UNK_00005e24 + lRam0000000000a334c0) ==
                *(int *)(&UNK_00005e20 + lRam0000000000a334c0)) {
              iVar5 = *(int *)(&UNK_00005e30 + lRam0000000000a334c0);
              uVar16 = *(undefined4 *)(in_stack_00000070 + 1);
              *(undefined8 *)(unaff_x29 + -0xd0) = *in_stack_00000070;
              *(undefined4 *)(unaff_x29 + -200) = uVar16;
              *(undefined4 *)(unaff_x29 + -0xc4) = 0;
              iVar3 = func_0x000b9344(unaff_x29 + -0xd0);
              if (iVar5 == iVar3) {
                *(undefined4 *)(unaff_x29 + -0xfc) = *(undefined4 *)(&UNK_00005e28 + lVar12);
              }
            }
          }
          uStack0000000000000068 = (uVar2 ^ 1 | uVar11) ^ 1;
          if ((uVar9 >> 3 & 1) == 0) {
            func_0x000da0a8("context",1);
          }
          *(float *)(unaff_x29 + -0xd0) = unaff_s14;
          *(uint *)(unaff_x29 + -0xcc) = uVar4;
          func_0x000d84e8(unaff_x29 + -0xd0);
          *(float *)(unaff_x29 + -0xd0) = fVar24;
          *(float *)(unaff_x29 + -0xcc) = in_stack_00000080;
          func_0x0010bf08("hue",unaff_x29 + -0xd0,0);
          iVar5 = func_0x000cfa5c();
          uStack0000000000000064 = 0;
          if ((iVar5 == 0) || ((unaff_w28 >> 7 & 1) != 0)) {
            uVar11 = uStack0000000000000068;
          }
          else {
            fVar21 = (*(float *)(in_stack_00000078 + 0xe44) - in_stack_000000a0) /
                     (in_stack_00000080 + -1.0);
            fVar13 = 1.0;
            if (fVar21 <= 1.0) {
              fVar13 = fVar21;
            }
            fVar14 = 0.0;
            if (0.0 <= fVar21) {
              fVar14 = fVar13;
            }
            *(float *)(unaff_x29 + -0xfc) = fVar14;
            uStack0000000000000064 = 1;
            uVar11 = 1;
          }
        }
      }
      else {
        *(float *)(unaff_x29 + -0xd0) =
             fVar24 + in_stack_00000080 + *(float *)(&UNK_0000393c + in_stack_00000078);
        *(float *)(unaff_x29 + -0xcc) = in_stack_00000080;
        func_0x0010bf08("hsv",unaff_x29 + -0xd0,0);
        iVar5 = func_0x000cfa5c();
        bVar18 = 0;
        uStack0000000000000068 = 0;
        bVar10 = 0;
        if (iVar5 == 0) {
          uStack0000000000000064 = 0;
          uVar11 = 0;
        }
        else {
          if ((unaff_w28 >> 7 & 1) == 0) {
            fVar21 = *(float *)(&UNK_00003810 + in_stack_00000078) - unaff_s12;
            fVar14 = *(float *)(&UNK_00003814 + in_stack_00000078) - unaff_s13;
            fVar15 = *(float *)(in_stack_00000078 + 0xe40) - unaff_s12;
            fVar20 = *(float *)(in_stack_00000078 + 0xe44) - unaff_s13;
            fVar13 = fVar14 * fVar14 + fVar21 * fVar21;
            if ((fVar13 < (fVar17 + -1.0) * (fVar17 + -1.0)) ||
               ((in_stack_00000020 + 1.0) * (in_stack_00000020 + 1.0) < fVar13)) {
              bVar10 = 0;
            }
            else {
              fVar13 = (float)_atan2f(fVar20,fVar15);
              fVar23 = (fVar13 / 3.1415927) * 0.5;
              fVar13 = fVar23 + 1.0;
              if (0.0 <= fVar23) {
                fVar13 = fVar23;
              }
              *(float *)(unaff_x29 + -0xfc) = fVar13;
              bVar10 = 1;
            }
            fVar23 = 3.1415927;
            fVar13 = (float)___sincosf_stret(*(float *)(unaff_x29 + -0xfc) * -2.0 * 3.1415927);
            *(float *)(unaff_x29 + -0xd0) = -(fVar14 * fVar13) + fVar23 * fVar21;
            *(float *)(unaff_x29 + -0xcc) = fVar14 * fVar23 + fVar13 * fVar21;
            iVar5 = func_0x000b7c8c(unaff_x29 + -0xe8,unaff_x29 + -0xf0,unaff_x29 + -0xf8,
                                    unaff_x29 + -0xd0);
            if (iVar5 == 0) {
              uStack0000000000000064 = (uint)bVar10;
              uStack0000000000000068 = 0;
              uVar11 = (uint)bVar10;
              goto joined_r0x001214b8;
            }
            fVar21 = fVar20 * fVar23 + fVar13 * fVar15;
            *(float *)(unaff_x29 + -0xd0) = -(fVar20 * fVar13) + fVar23 * fVar15;
            *(float *)(unaff_x29 + -0xcc) = fVar21;
            uVar6 = func_0x000b7c8c(unaff_x29 + -0xe8,unaff_x29 + -0xf0,unaff_x29 + -0xf8,
                                    unaff_x29 + -0xd0);
            if ((uVar6 & 1) == 0) {
              uVar16 = func_0x000b7d84(unaff_x29 + -0xe8,unaff_x29 + -0xf0,unaff_x29 + -0xf8,
                                       unaff_x29 + -0xd0);
              *(undefined4 *)(unaff_x29 + -0xd0) = uVar16;
              *(float *)(unaff_x29 + -0xcc) = fVar21;
            }
            func_0x000b7d1c(unaff_x29 + -0xe8,unaff_x29 + -0xf0,unaff_x29 + -0xf8,unaff_x29 + -0xd0,
                            &uStack00000000000000f0,&uStack00000000000000e0,&uStack00000000000000d8)
            ;
            fVar21 = 1.0 - _uStack00000000000000e0;
            fVar13 = 1.0;
            if (fVar21 <= 1.0) {
              fVar13 = fVar21;
            }
            uStack0000000000000108._4_4_ = 0.0001;
            if (0.0001 <= fVar21) {
              uStack0000000000000108._4_4_ = fVar13;
            }
            fVar21 = (float)uStack00000000000000f0 / uStack0000000000000108._4_4_;
            fVar13 = 1.0;
            if (fVar21 <= 1.0) {
              fVar13 = fVar21;
            }
            fVar14 = 0.0001;
            if (0.0001 <= fVar21) {
              fVar14 = fVar13;
            }
            *(float *)(unaff_x29 + -0x100) = fVar14;
            bVar18 = 1;
            uStack0000000000000068 = 1;
          }
          uStack0000000000000064 = (uint)bVar10;
          uVar11 = (uint)bVar18;
        }
joined_r0x001214b8:
        if ((uVar9 >> 3 & 1) == 0) {
          func_0x000da0a8("context",1);
        }
      }
      unaff_s13 = fVar22 + unaff_s9;
      if (iStack000000000000006c == 0x10000) {
        *(float *)(unaff_x29 + -0xd0) = unaff_s13;
        *(uint *)(unaff_x29 + -0xcc) = uVar4;
        func_0x000d84e8(unaff_x29 + -0xd0);
        *(float *)(unaff_x29 + -0xd0) = fVar24;
        *(float *)(unaff_x29 + -0xcc) = in_stack_00000080;
        func_0x0010bf08("alpha",unaff_x29 + -0xd0,0);
        iVar5 = func_0x000cfa5c();
        if (iVar5 != 0) {
          fVar22 = (*(float *)(in_stack_00000078 + 0xe44) - in_stack_000000a0) /
                   (in_stack_00000080 + -1.0);
          fVar13 = 0.0;
          if (fVar22 <= 1.0) {
            fVar13 = 1.0 - fVar22;
          }
          fVar21 = 1.0;
          if (0.0 <= fVar22) {
            fVar21 = fVar13;
          }
          *(float *)((long)in_stack_00000070 + 0xc) = fVar21;
          uVar11 = 1;
        }
      }
      func_0x000d3644();
      if ((uVar9 >> 8 & 1) == 0) {
        func_0x000d8444(0,*(undefined4 *)(&UNK_0000393c + in_stack_00000078));
        func_0x000d8a9c();
      }
      if (((uVar9 >> 7 & 1) == 0) && (uVar6 = func_0x000bc0e8(unaff_x26,0), uVar6 != unaff_x26)) {
        if ((uVar9 >> 8 & 1) != 0) {
          func_0x000d8444(0,*(undefined4 *)(&UNK_0000393c + in_stack_00000078));
        }
        func_0x0010aa24(unaff_x26,uVar6,0);
      }
      if ((uVar9 >> 8 & 1) == 0) {
        func_0x000d35a8(0x10,1);
        uVar16 = *(undefined4 *)(in_stack_00000070 + 1);
        uVar19 = 0x3f800000;
        if ((uVar9 >> 1 & 1) == 0) {
          uVar19 = *(undefined4 *)((long)in_stack_00000070 + 0xc);
        }
        *(undefined8 *)(unaff_x29 + -0xd0) = *in_stack_00000070;
        *(undefined4 *)(unaff_x29 + -200) = uVar16;
        *(undefined4 *)(unaff_x29 + -0xc4) = uVar19;
        if ((uVar9 >> 7 & 1) != 0) {
          func_0x0010adc0("Current");
        }
        uStack00000000000000f0 = CONCAT44(fVar24 + fVar24,fVar24 * 3.0);
        func_0x001204a8("##current",unaff_x29 + -0xd0,uVar9 & 0x180e0040,&uStack00000000000000f0);
        if (unaff_x25 != (ulong *)0x0) {
          func_0x0010adc0("Original");
          uStack00000000000000f0 = *unaff_x25;
          uStack00000000000000f8._0_4_ = (undefined4)unaff_x25[1];
          uStack00000000000000f8._4_4_ = 1.0;
          if ((uVar9 >> 1 & 1) == 0) {
            uStack00000000000000f8._4_4_ = *(float *)((long)unaff_x25 + 0xc);
          }
          _uStack00000000000000e0 = CONCAT44(fVar24 + fVar24,fVar24 * 3.0);
          iVar5 = func_0x001204a8("##original",&uStack00000000000000f0,uVar9 & 0x180e0040,
                                  &uStack00000000000000e0);
          if (iVar5 != 0) {
            _memcpy(in_stack_00000070,unaff_x25,in_stack_00000030);
            uVar11 = 1;
          }
        }
        func_0x000d3644();
        func_0x000d818c();
      }
      if ((uStack0000000000000068 | uStack0000000000000064) == 1) {
        if ((uVar9 >> 0x1b & 1) == 0) {
          if ((uVar9 >> 0x1c & 1) != 0) {
            uVar16 = *(undefined4 *)(unaff_x29 + -0x100);
            *(undefined4 *)in_stack_00000070 = *(undefined4 *)(unaff_x29 + -0xfc);
            *(undefined4 *)((long)in_stack_00000070 + 4) = uVar16;
            *(float *)(in_stack_00000070 + 1) = uStack0000000000000108._4_4_;
          }
        }
        else {
          func_0x000b9458(*(undefined4 *)(unaff_x29 + -0xfc),*(undefined4 *)(unaff_x29 + -0x100),
                          uStack0000000000000108._4_4_,in_stack_00000070,in_stack_00000048,unaff_x24
                         );
          in_stack_00000058[0x520] = *(int *)(unaff_x29 + -0xfc);
          in_stack_00000058[0x521] = *(int *)(unaff_x29 + -0x100);
          in_stack_00000058[0x51f] = in_stack_00000058[0x51e];
          uVar16 = *(undefined4 *)(in_stack_00000070 + 1);
          *(undefined8 *)(unaff_x29 + -0xd0) = *in_stack_00000070;
          *(undefined4 *)(unaff_x29 + -200) = uVar16;
          *(undefined4 *)(unaff_x29 + -0xc4) = 0;
          iVar5 = func_0x000b9344(unaff_x29 + -0xd0);
          in_stack_00000058[0x522] = iVar5;
        }
      }
      if ((uVar9 >> 5 & 1) == 0) {
        fVar13 = unaff_s13;
        if (iStack000000000000006c != 0x10000) {
          fVar13 = unaff_s14;
        }
        func_0x000d86b8((fVar24 + fVar13) - fStack0000000000000090);
        uVar4 = uVar9 & 0x198e005a;
        if ((((uVar9 >> 0x14 & 1) == 0) && ((uVar9 & 0x700000) != 0)) ||
           (iVar5 = func_0x0011f500("##rgb",in_stack_00000070,uVar4 | 0x100004), iVar5 == 0)) {
joined_r0x0012139c:
          bVar1 = false;
          if ((uVar9 >> 0x15 & 1) != 0) goto code_r0x001213a4;
code_r0x001213a0:
          if ((uVar9 & 0x700000) == 0) goto code_r0x001213a4;
        }
        else {
          if (*(int *)CONCAT44(uStack0000000000000044,fStack0000000000000040) == 0) {
            uVar11 = 1;
            goto joined_r0x0012139c;
          }
          bVar1 = *(char *)((long)CONCAT44(uStack0000000000000044,fStack0000000000000040) + 0xd) ==
                  '\0';
          uVar11 = 1;
          if ((uVar9 >> 0x15 & 1) == 0) goto code_r0x001213a0;
code_r0x001213a4:
          uVar2 = func_0x0011f500("##hsv",in_stack_00000070,uVar4 | 0x200004);
          uVar11 = uVar11 | uVar2;
        }
        if (((uVar9 >> 0x16 & 1) == 0) && ((uVar9 & 0x700000) != 0)) {
          func_0x000d88dc();
          bVar1 = (bool)(bVar1 ^ 1);
          if ((uVar9 & 0x8000000) == 0) {
            bVar1 = true;
          }
        }
        else {
          uVar4 = func_0x0011f500("##hex",in_stack_00000070,uVar4 | 0x400004);
          uVar11 = uVar11 | uVar4;
          func_0x000d88dc();
          bVar1 = (bool)(bVar1 ^ 1);
          if ((uVar9 & 0x8000000) == 0) {
            bVar1 = true;
          }
        }
        if (bVar1) goto joined_r0x00121390;
        func_0x000b93d8(*(undefined4 *)in_stack_00000070,
                        *(undefined4 *)((long)in_stack_00000070 + 4),
                        *(undefined4 *)(in_stack_00000070 + 1),unaff_x29 + -0xd0,
                        &uStack00000000000000f0,&uStack00000000000000e0);
        if ((*(float *)(unaff_x29 + -0xd0) <= 0.0) && (0.0 < *(float *)(unaff_x29 + -0xfc))) {
          if ((0.0 < _uStack00000000000000e0) ||
             (uStack0000000000000108._4_4_ == _uStack00000000000000e0)) {
            if (0.0 < (float)uStack00000000000000f0) goto code_r0x001214e8;
            fVar22 = *(float *)(unaff_x29 + -0x100) * 0.5;
            fVar13 = _uStack00000000000000e0;
          }
          else {
            fVar22 = *(float *)(unaff_x29 + -0x100);
            fVar13 = uStack0000000000000108._4_4_ * 0.5;
          }
          func_0x000b9458(*(float *)(unaff_x29 + -0xfc),fVar22,fVar13,in_stack_00000070,
                          in_stack_00000048,unaff_x24);
        }
code_r0x001214e8:
        if ((uVar11 & 1) != 0) goto code_r0x001214ec;
code_r0x00121588:
        unaff_x25 = (ulong *)0x0;
      }
      else {
        uVar11 = uVar11 & 1;
joined_r0x00121390:
        if (uVar11 == 0) goto code_r0x00121588;
        if ((uVar9 >> 0x1b & 1) == 0) {
          if ((uVar9 >> 0x1c & 1) != 0) {
            uVar16 = *(undefined4 *)in_stack_00000070;
            *(undefined4 *)(unaff_x29 + -0x100) = *(undefined4 *)((long)in_stack_00000070 + 4);
            *(undefined4 *)(unaff_x29 + -0xfc) = uVar16;
            uStack0000000000000108._4_4_ = *(float *)(in_stack_00000070 + 1);
            func_0x000b9458(&uStack0000000000000108,(long)&uStack0000000000000100 + 4,
                            &uStack0000000000000100);
          }
        }
        else {
code_r0x001214ec:
          uStack0000000000000108._0_4_ = *(undefined4 *)in_stack_00000070;
          uStack0000000000000100._4_4_ = *(undefined4 *)((long)in_stack_00000070 + 4);
          uStack0000000000000100._0_4_ = *(float *)(in_stack_00000070 + 1);
          func_0x000b93d8(unaff_x29 + -0xfc,unaff_x29 + -0x100,(long)&uStack0000000000000108 + 4);
          lVar12 = lRam0000000000a334c0;
          if (*(int *)(&UNK_00005e24 + lRam0000000000a334c0) ==
              *(int *)(&UNK_00005e20 + lRam0000000000a334c0)) {
            iVar5 = *(int *)(&UNK_00005e30 + lRam0000000000a334c0);
            uVar16 = *(undefined4 *)(in_stack_00000070 + 1);
            *(undefined8 *)(unaff_x29 + -0xd0) = *in_stack_00000070;
            *(undefined4 *)(unaff_x29 + -200) = uVar16;
            *(undefined4 *)(unaff_x29 + -0xc4) = 0;
            iVar3 = func_0x000b9344(unaff_x29 + -0xd0);
            if (iVar5 == iVar3) {
              if (*(float *)(unaff_x29 + -0x100) == 0.0) {
                uVar16 = *(undefined4 *)(&UNK_00005e28 + lVar12);
code_r0x00121568:
                *(undefined4 *)(unaff_x29 + -0xfc) = uVar16;
              }
              else if ((*(float *)(unaff_x29 + -0xfc) == 0.0) &&
                      (uVar16 = 0x3f800000, *(float *)(&UNK_00005e28 + lVar12) == 1.0))
              goto code_r0x00121568;
              if (uStack0000000000000108._4_4_ == 0.0) {
                *(undefined4 *)(unaff_x29 + -0x100) = *(undefined4 *)(&UNK_00005e2c + lVar12);
              }
            }
          }
        }
        unaff_x25 = (ulong *)((long)&MACH_HEADER.magic + 1);
      }
      fStack0000000000000040 = (float)(int)(fVar24 * 0.2);
      uStack00000000000000f8._4_4_ = *(float *)(&UNK_000038e8 + in_stack_00000078);
      fVar13 = 1.0;
      if (uStack00000000000000f8._4_4_ <= 1.0) {
        fVar13 = uStack00000000000000f8._4_4_;
      }
      fVar22 = 0.0;
      if (0.0 <= uStack00000000000000f8._4_4_) {
        fVar22 = fVar13;
      }
      unaff_s12 = 0.5;
      iVar5 = (int)(fVar22 * 255.0 + 0.5);
      unaff_w28 = 0;
      uVar11 = iVar5 << 0x18 | 0x808080;
      unaff_x26 = (ulong)uVar11;
      uVar2 = iVar5 << 0x18 | 0xff;
      uVar4 = iVar5 << 0x18 | 0xffff;
      *(uint *)(unaff_x29 + -0xd0) = uVar2;
      *(uint *)(unaff_x29 + -0xcc) = uVar4;
      bVar18 = (byte)iVar5;
      _fStack0000000000000090 =
           CONCAT17(bVar18 | (byte)((ulong)_UNK_008133c0 >> 0x38),
                    CONCAT16((char)((ulong)_UNK_008133c0 >> 0x30),
                             CONCAT15((char)((ulong)_UNK_008133c0 >> 0x28),
                                      CONCAT14((char)((ulong)_UNK_008133c0 >> 0x20),
                                               CONCAT13(bVar18 | (byte)((ulong)_UNK_008133c0 >> 0x18
                                                                       ),(int3)_UNK_008133c0)))));
      *(ulong *)(unaff_x29 + -0xc0) =
           CONCAT17(bVar18 | (byte)((ulong)_UNK_008133c8 >> 0x38),
                    CONCAT16((char)((ulong)_UNK_008133c8 >> 0x30),
                             CONCAT15((char)((ulong)_UNK_008133c8 >> 0x28),
                                      CONCAT14((char)((ulong)_UNK_008133c8 >> 0x20),
                                               CONCAT13(bVar18 | (byte)((ulong)_UNK_008133c8 >> 0x18
                                                                       ),(int3)_UNK_008133c8)))));
      *(ulong *)(unaff_x29 + -200) = _fStack0000000000000090;
      *(uint *)(unaff_x29 + -0xb8) = uVar2;
      uVar6 = NEON_fmov(0x3f800000,4);
      uStack00000000000000f8._0_4_ = 0x3f800000;
      uStack00000000000000f0 = uVar6;
      func_0x000b9458(*(undefined4 *)(unaff_x29 + -0xfc),0x3f800000,0x3f800000,
                      &uStack00000000000000f0,(ulong)&uStack00000000000000f0 | 4,
                      &uStack00000000000000f8);
      uVar16 = func_0x000b9344(&uStack00000000000000f0);
      fStack00000000000000ec = *(float *)(&UNK_000038e8 + in_stack_00000078);
      _uStack00000000000000e0 =
           CONCAT44(uStack0000000000000100._4_4_,(undefined4)uStack0000000000000108);
      fStack00000000000000e8 = (float)uStack0000000000000100;
      unaff_x24 = func_0x000b9344(&uStack00000000000000e0);
      _uStack00000000000000d8 = 0;
      unaff_x27 = in_stack_00000058;
      in_stack_00000048 = fVar24;
      if ((uVar9 >> 0x1a & 1) != 0) {
        lVar12 = 0;
        fVar13 = 0.5 / in_stack_00000020;
        fVar22 = -fVar13;
        _fStack0000000000000090 = (ulong)(uint)fVar22;
        in_stack_00000020 = in_stack_00000020 + fVar17;
        do {
          fVar24 = (float)(int)lVar12 / 6.0;
          fVar21 = fVar22 + (fVar24 + fVar24) * 3.1415927;
          fVar24 = ((float)(int)lVar12 + 1.0) / 6.0;
          unaff_s14 = fVar13 + (fVar24 + fVar24) * 3.1415927;
          uVar9 = *(uint *)(unaff_x20 + 0x20);
          fVar24 = fVar21;
          func_0x000f249c(in_stack_00000020 * 0.5,fVar21,unaff_s14);
          func_0x000f0ff4(unaff_s15);
          *(undefined4 *)(unaff_x20 + 0x78) = 0;
          fVar23 = *(float *)(unaff_x29 + -0xe0);
          fVar14 = (float)___sincosf_stret(fVar21);
          fVar20 = *(float *)(unaff_x29 + -0xdc);
          fVar21 = fVar17;
          fVar15 = (float)___sincosf_stret(unaff_s14);
          lVar12 = lVar12 + 1;
          func_0x000f6ff4(fVar23 + fVar17 * fVar24,fVar20 + fVar17 * fVar14,fVar23 + fVar17 * fVar21
                          ,fVar20 + fVar17 * fVar15);
        } while (lVar12 != 6);
        fVar22 = 3.1415927;
        in_stack_000000a0 =
             (float)___sincosf_stret((*(float *)(unaff_x29 + -0xfc) + *(float *)(unaff_x29 + -0xfc))
                                     * 3.1415927);
        _uStack00000000000000e0 =
             CONCAT44((float)((ulong)*(undefined8 *)(unaff_x29 + -0xe0) >> 0x20) +
                      in_stack_000000a0 * in_stack_00000020 * 0.5,
                      (float)*(undefined8 *)(unaff_x29 + -0xe0) + fVar22 * in_stack_00000020 * 0.5);
        fVar13 = 0.65;
        if (uStack0000000000000064 == 0) {
          fVar13 = 0.55;
        }
        fVar13 = unaff_s15 * fVar13;
        uVar4 = func_0x000f0898(fVar13);
        func_0x000f47e0(fVar13);
        unaff_x26 = (ulong)uVar11;
        func_0x000f46fc(fVar13 + 1.0,0x3f800000);
        func_0x000f46fc(fVar13,0x3f800000);
        fVar14 = *(float *)(unaff_x29 + -0xe0);
        fVar21 = *(float *)(unaff_x29 + -0xdc);
        fStack00000000000000d0 =
             fVar14 + -(*(float *)(unaff_x29 + -0xe4) * in_stack_000000a0) +
                      fVar22 * *(float *)(unaff_x29 + -0xe8);
        fStack00000000000000d4 =
             fVar21 + fVar22 * *(float *)(unaff_x29 + -0xe4) +
                      in_stack_000000a0 * *(float *)(unaff_x29 + -0xe8);
        fVar15 = fVar14 + -(*(float *)(unaff_x29 + -0xec) * in_stack_000000a0) +
                          fVar22 * *(float *)(unaff_x29 + -0xf0);
        fVar24 = fVar21 + fVar22 * *(float *)(unaff_x29 + -0xec) +
                          in_stack_000000a0 * *(float *)(unaff_x29 + -0xf0);
        fVar14 = fVar14 + -(*(float *)(unaff_x29 + -0xf4) * in_stack_000000a0) +
                          fVar22 * *(float *)(unaff_x29 + -0xf8);
        fVar21 = fVar21 + fVar22 * *(float *)(unaff_x29 + -0xf4) +
                          in_stack_000000a0 * *(float *)(unaff_x29 + -0xf8);
        unaff_s12 = fVar14;
        uVar6 = func_0x000d4330();
        uVar19 = (undefined4)uVar6;
        uVar6 = uVar6 & 0xffffffff;
        func_0x000f0c38();
        puVar7 = *(undefined2 **)(unaff_x20 + 0x50);
        *puVar7 = (short)*(undefined4 *)(unaff_x20 + 0x34);
        *(undefined2 **)(unaff_x20 + 0x50) = puVar7 + 1;
        **(undefined8 **)(unaff_x20 + 0x48) =
             CONCAT44(fStack00000000000000d4,fStack00000000000000d0);
        lVar12 = *(long *)(unaff_x20 + 0x48);
        *(undefined4 *)(lVar12 + 8) = uVar19;
        *(float *)(lVar12 + 0xc) = unaff_s12;
        *(undefined4 *)(lVar12 + 0x10) = uVar16;
        *(long *)(unaff_x20 + 0x48) = lVar12 + 0x14;
        iVar3 = *(int *)(unaff_x20 + 0x34) + 1;
        *(int *)(unaff_x20 + 0x34) = iVar3;
        puVar7 = *(undefined2 **)(unaff_x20 + 0x50);
        *puVar7 = (short)iVar3;
        *(undefined2 **)(unaff_x20 + 0x50) = puVar7 + 1;
        *(ulong *)(lVar12 + 0x14) = CONCAT44(fVar24,fVar15);
        lVar12 = *(long *)(unaff_x20 + 0x48);
        *(undefined4 *)(lVar12 + 8) = uVar19;
        *(float *)(lVar12 + 0xc) = unaff_s12;
        *(int *)(lVar12 + 0x10) = iVar5 << 0x18;
        *(long *)(unaff_x20 + 0x48) = lVar12 + 0x14;
        iVar3 = *(int *)(unaff_x20 + 0x34) + 1;
        *(int *)(unaff_x20 + 0x34) = iVar3;
        puVar7 = *(undefined2 **)(unaff_x20 + 0x50);
        *puVar7 = (short)iVar3;
        *(undefined2 **)(unaff_x20 + 0x50) = puVar7 + 1;
        *(ulong *)(lVar12 + 0x14) = CONCAT44(fVar21,fVar14);
        lVar12 = *(long *)(unaff_x20 + 0x48);
        *(undefined4 *)(lVar12 + 8) = uVar19;
        *(float *)(lVar12 + 0xc) = unaff_s12;
        *(uint *)(lVar12 + 0x10) = iVar5 << 0x18 | 0xffffff;
        *(long *)(unaff_x20 + 0x48) = lVar12 + 0x14;
        *(int *)(unaff_x20 + 0x34) = *(int *)(unaff_x20 + 0x34) + 1;
        func_0x000f4320(0x3fc00000);
        fVar22 = *(float *)(unaff_x29 + -0x100);
        fVar13 = 1.0;
        if (fVar22 <= 1.0) {
          fVar13 = fVar22;
        }
        fVar20 = 0.0;
        if (0.0 <= fVar22) {
          fVar20 = fVar13;
        }
        fVar22 = 1.0 - uStack0000000000000108._4_4_;
        fVar13 = 1.0;
        if (fVar22 <= 1.0) {
          fVar13 = fVar22;
        }
        fVar23 = 0.0;
        if (0.0 <= fVar22) {
          fVar23 = fVar13;
        }
        fVar14 = fVar14 + (fStack00000000000000d0 - fVar14) * fVar20;
        fVar21 = fVar21 + (fStack00000000000000d4 - fVar21) * fVar20;
        _uStack00000000000000d8 =
             CONCAT44(fVar21 + (fVar24 - fVar21) * fVar23,fVar14 + (fVar15 - fVar14) * fVar23);
        unaff_x24 = unaff_x24 & 0xffffffff;
        unaff_w28 = 0;
        in_stack_00000018._4_4_ = unaff_s13;
        goto LAB_00121dd8;
      }
    } while ((uVar9 >> 0x19 & 1) == 0);
    _uStack00000000000000e0 =
         CONCAT44(in_stack_00000080 + in_stack_000000a0,in_stack_00000018._4_4_);
    func_0x000f3ce4();
    _uStack00000000000000e0 =
         CONCAT44(in_stack_00000080 + (float)((ulong)*(undefined8 *)(unaff_x29 + -0xd8) >> 0x20),
                  in_stack_00000080 + (float)*(undefined8 *)(unaff_x29 + -0xd8));
    func_0x000f3ce4();
    unaff_s11 = 0.0;
    func_0x000bd124(*(float *)(unaff_x29 + -0xd8),*(float *)(unaff_x29 + -0xd4),
                    in_stack_00000080 + *(float *)(unaff_x29 + -0xd8),
                    in_stack_00000080 + *(float *)(unaff_x29 + -0xd4),0);
    fVar17 = *(float *)(unaff_x29 + -0x100);
    fVar13 = 1.0 - uStack0000000000000108._4_4_;
    iVar5 = -(uint)(fVar17 < 0.0);
    iVar3 = -(uint)(fVar13 < 0.0);
    uVar6 = CONCAT44(fVar13,fVar17) ^
            (CONCAT44(fVar13,fVar17) ^ uVar6) &
            CONCAT44(-(uint)((float)(uVar6 >> 0x20) < fVar13),-(uint)((float)uVar6 < fVar17));
    fVar17 = (float)CONCAT13((byte)(uVar6 >> 0x18) & ~(byte)((uint)iVar5 >> 0x18),
                             CONCAT12((byte)(uVar6 >> 0x10) & ~(byte)((uint)iVar5 >> 0x10),
                                      CONCAT11((byte)(uVar6 >> 8) & ~(byte)((uint)iVar5 >> 8),
                                               (byte)uVar6 & ~(byte)iVar5)));
    fVar13 = (float)*(undefined8 *)(unaff_x29 + -0xd8);
    param_5 = (float)((ulong)*(undefined8 *)(unaff_x29 + -0xd8) >> 0x20);
    param_3 = CONCAT44(param_5 + 2.0,fVar13 + 2.0);
    param_1 = NEON_scvtf(CONCAT44((int)(param_5 + (float)(CONCAT17((byte)(uVar6 >> 0x38) &
                                                                   ~(byte)((uint)iVar3 >> 0x18),
                                                                   CONCAT16((byte)(uVar6 >> 0x30) &
                                                                            ~(byte)((uint)iVar3 >>
                                                                                   0x10),
                                                                            CONCAT15((byte)(uVar6 >>
                                                                                           0x28) &
                                                                                     ~(byte)((uint)
                                                  iVar3 >> 8),
                                                  CONCAT14((byte)(uVar6 >> 0x20) & ~(byte)iVar3,
                                                           fVar17)))) >> 0x20) * in_stack_00000080 +
                                       0.5),(int)(fVar13 + fVar17 * in_stack_00000080 + 0.5)),4);
    fVar22 = in_stack_00000080 + fVar13 + -2.0;
    fVar24 = in_stack_00000080 + param_5 + -2.0;
    param_2 = CONCAT44(fVar24,fVar22);
    fVar17 = (float)(param_1 >> 0x20);
    param_4 = CONCAT44(-(uint)(fVar17 < param_5 + 2.0),-(uint)((float)param_1 < fVar13 + 2.0));
    param_6 = CONCAT44(-(uint)(fVar24 < fVar17),-(uint)(fVar22 < (float)param_1));
    param_7 = in_stack_00000080;
  } while( true );
}

