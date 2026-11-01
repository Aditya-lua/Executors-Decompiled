
/* WARNING: Type propagation algorithm not settling */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_00501244(undefined8 param_1,long param_2)

{
  ulong uVar1;
  undefined1 uVar2;
  uint uVar3;
  undefined1 auVar4 [16];
  undefined1 auVar5 [16];
  code *pcVar6;
  bool bVar7;
  int iVar8;
  undefined8 *puVar9;
  long lVar10;
  uint uVar11;
  undefined1 *puVar12;
  ulong uVar13;
  ulong *puVar14;
  uint uVar15;
  ulong uVar16;
  undefined8 *puVar17;
  undefined8 *puVar18;
  long lVar19;
  long lVar20;
  undefined8 *puVar21;
  long lVar22;
  ulong uVar23;
  int *piVar24;
  long unaff_x19;
  long lVar25;
  undefined8 *puVar26;
  undefined8 uVar27;
  undefined8 uVar28;
  undefined8 *unaff_x20;
  long lVar29;
  undefined8 uVar30;
  undefined8 uVar31;
  long lVar32;
  long unaff_x23;
  long *plVar33;
  long lVar34;
  undefined8 uVar35;
  undefined8 uVar36;
  undefined8 uVar37;
  undefined8 uStack0000000000000000;
  undefined8 uStack0000000000000008;
  uint uStack0000000000000014;
  uint *in_stack_00000028;
  uint in_stack_00000220;
  long in_stack_00000230;
  ulong in_stack_00000df0;
  ulong in_stack_00000df8;
  long in_stack_00000fd8;
  undefined8 in_stack_00000fe0;
  ulong in_stack_00001100;
  ulong in_stack_00001108;
  uint6 in_stack_0000114a;
  long in_stack_000011a0;
  long in_stack_000011a8;
  long in_stack_000011b0;
  undefined1 auStack_7ffffffe [6];
  undefined8 auStack_7ffffff8 [268435455];
  
  _memcpy(param_1,param_2 + 0x3c0,600);
  *(long *)(unaff_x23 + 0x90) = unaff_x19 + 1;
  uVar11 = *(uint *)(unaff_x23 + 700);
  uVar15 = *(uint *)(unaff_x23 + 0x2c0);
  if ((((uVar11 | uVar15) >> 0x15 & 1) == 0) &&
     (*(long *)(unaff_x23 + 0x260) != 0 || *(long *)(unaff_x23 + 0x270) != 0)) {
    unaff_x20[0xf] = 0;
    unaff_x20[0x10] = 0;
    unaff_x20[0x15] = 0;
    unaff_x20[0x16] = 0;
    unaff_x20[0x1b] = 0;
    unaff_x20[0x1c] = 0;
    unaff_x20[0x21] = 0;
    unaff_x20[0x22] = 0;
    unaff_x20[0x27] = 0;
    unaff_x20[0x28] = 0;
    unaff_x20[0x33] = 0;
    unaff_x20[0x34] = 0;
    unaff_x20[0x39] = 0;
    unaff_x20[0x3a] = 0;
    unaff_x20[0x2d] = 0;
    unaff_x20[0x2e] = 0;
    *unaff_x20 = 0;
    unaff_x20[2] = 0;
    unaff_x20[5] = 0;
    unaff_x20[7] = 0;
    unaff_x20[10] = 5;
    unaff_x20[0xd] = 0;
    unaff_x20[0xe] = 8;
    unaff_x20[0x11] = 8;
    unaff_x20[0x12] = 0;
    unaff_x20[0x13] = 0;
    unaff_x20[0x14] = 8;
    unaff_x20[0x17] = 8;
    unaff_x20[0x18] = 0;
    unaff_x20[0x19] = 0;
    unaff_x20[0x1a] = 8;
    unaff_x20[0x1d] = 8;
    unaff_x20[0x1e] = 0;
    unaff_x20[0x1f] = 0;
    unaff_x20[0x20] = 8;
    unaff_x20[0x23] = 8;
    unaff_x20[0x24] = 0;
    unaff_x20[0x25] = 0;
    unaff_x20[0x26] = 8;
    unaff_x20[0x29] = 4;
    unaff_x20[0x2a] = 0;
    unaff_x20[0x2b] = 0;
    unaff_x20[0x2c] = 8;
    unaff_x20[0x2f] = 8;
    unaff_x20[0x30] = 0;
    unaff_x20[0x31] = 0;
    unaff_x20[0x32] = 8;
    unaff_x20[0x35] = 8;
    unaff_x20[0x36] = 0;
    unaff_x20[0x37] = 0;
    unaff_x20[0x38] = 8;
    unaff_x20[0x3b] = 8;
    uVar27 = _UNK_007fc110;
    unaff_x20[0x3d] = _UNK_007fc118;
    unaff_x20[0x3c] = uVar27;
    unaff_x20[0x40] = 0x8000000000000000;
    unaff_x20[0x43] = &UNK_008a4666;
    unaff_x20[0x44] = 7;
    unaff_x20[0x45] = &UNK_008a4666;
    unaff_x20[0x46] = 7;
    unaff_x20[0x47] = 0;
    unaff_x20[0x49] = _UNK_008a4350;
    *(undefined1 *)((long)unaff_x20 + 0x254) = 8;
    in_stack_00000df0 = 1;
    func_0x007a5594(auStack_7ffffffe + 0x800010ee,0,0xd,1,1);
    MACH_HEADER._1_5_ = _UNK_008a466d;
    MACH_HEADER.cputype._2_2_ = (undefined2)_UNK_008a4672;
    MACH_HEADER.cpusubtype._0_1_ = (undefined1)((uint3)_UNK_008a4672 >> 0x10);
    MACH_HEADER._9_5_ = _UNK_008a4675;
    in_stack_00000df8 = 0xd;
    unaff_x20 = (undefined8 *)(auStack_7ffffffe + 0x800013be);
    _memcpy(auStack_7ffffffe + 0x8000031e,auStack_7ffffffe + 0x800013be,600);
    lVar25 = *(long *)(unaff_x23 + 0x90);
    if (lVar25 == *(long *)(unaff_x23 + 0x80)) {
      func_0x0050c440((long *)(unaff_x23 + 0x80),&UNK_009e93a0);
    }
    _memcpy(*(long *)(unaff_x23 + 0x88) + lVar25 * 600,auStack_7ffffffe + 0x8000031e,600);
    *(long *)(unaff_x23 + 0x90) = lVar25 + 1;
    uVar11 = *(uint *)(unaff_x23 + 700);
    uVar15 = *(uint *)(unaff_x23 + 0x2c0);
    in_stack_00001100 = in_stack_00000df8;
  }
  if ((uVar11 >> 0x14 & 1) == 0) {
    if ((uVar15 >> 0x14 & 1) == 0) {
      if ((in_stack_00000220 & 1) == 0) {
        unaff_x20[0x46] = &UNK_008a4611;
        func_0x007a5488(auStack_7ffffffe + 0x800010ee,auStack_7ffffffe + 0x800013be);
        func_0x0050cf54(auStack_7ffffffe + 0x80000dee,auStack_7ffffffe + 0x800013be,
                        auStack_7ffffffe + 0x80000b1e);
        func_0x00516984(auStack_7ffffffe + 0x800013be,&UNK_008a46c4,0x20);
        if ((in_stack_00000fd8 != -0x8000000000000000) && (in_stack_00000fd8 != 0)) {
          func_0x00187bd4(in_stack_00000fe0,in_stack_00000fd8,1);
        }
        _memcpy(auStack_7ffffffe + 0x80000b1e,auStack_7ffffffe + 0x80000e3e,0x1d8);
        _memcpy(auStack_7ffffffe + 0x8000140e,auStack_7ffffffe + 0x80000b1e,0x1d8);
        func_0x005101bc(auStack_7ffffffe + 0x8000116e,auStack_7ffffffe + 0x800013be);
        _memcpy(auStack_7ffffffe + 0x8000057e,auStack_7ffffffe + 0x800010ee,0x2c8);
      }
      else {
        unaff_x20[0x46] = &UNK_008a4611;
        unaff_x20[0x47] = 4;
        unaff_x20[0x48] = 0;
        func_0x007a5488(auStack_7ffffffe + 0x80000b1e,auStack_7ffffffe + 0x800013be);
        func_0x004fe658(auStack_7ffffffe + 0x8000084e,auStack_7ffffffe + 0x80000b1e,
                        *(long *)(in_stack_00000230 + 0xb8),
                        *(long *)(in_stack_00000230 + 0xb8) +
                        *(long *)(in_stack_00000230 + 0xc0) * 0x2c8);
        func_0x007a5488(auStack_7ffffffe + 0x80000dee,auStack_7ffffffe + 0x800013be);
        _memcpy(auStack_7ffffffe + 0x800010ee,auStack_7ffffffe + 0x8000084e,0x2c8);
        if ((int)in_stack_00001100 == 1) {
          if ((in_stack_00000df0 & 1) == 0) {
            in_stack_00000df8 = in_stack_00001108;
          }
          in_stack_00000df0 = 1;
        }
        _memcpy(auStack_7ffffffe + 0x800013ce,auStack_7ffffffe + 0x80000dfe,0x2b8);
        if (in_stack_000011b0 == in_stack_000011a0) {
          func_0x0050c5c4(auStack_7ffffffe + 0x8000119e,&UNK_009e8978);
        }
        puVar14 = (ulong *)(in_stack_000011a8 + in_stack_000011b0 * 0x2c8);
        *puVar14 = in_stack_00000df0;
        puVar14[1] = in_stack_00000df8;
        _memcpy(puVar14 + 2,auStack_7ffffffe + 0x80000dfe,0x2b8);
        _memcpy(auStack_7ffffffe + 0x8000057e,auStack_7ffffffe + 0x800010ee,0x2c8);
      }
      func_0x005166fc(auStack_7ffffffe + 0x8000065e,in_stack_00000230 + 0xe0);
      _memcpy(auStack_7ffffffe + 0x800013be,auStack_7ffffffe + 0x8000057e,0x2c8);
      lVar25 = *(long *)(in_stack_00000230 + 0xc0);
      if (lVar25 == *(long *)(in_stack_00000230 + 0xb0)) {
        func_0x0050c5c4(in_stack_00000230 + 0xb0,&UNK_009e8b00);
      }
      _memcpy(*(long *)(in_stack_00000230 + 0xb8) + lVar25 * 0x2c8,auStack_7ffffffe + 0x800013be,
              0x2c8);
      *(long *)(in_stack_00000230 + 0xc0) = lVar25 + 1;
      uVar11 = *(uint *)(in_stack_00000230 + 700);
      uVar15 = *(uint *)(in_stack_00000230 + 0x2c0);
      uStack0000000000000014 = (uint)((uVar11 & 0x100000) == 0);
      lVar25 = *(long *)(in_stack_00000230 + 0xc0);
      unaff_x23 = in_stack_00000230;
    }
    else {
      uStack0000000000000014 = 1;
      lVar25 = *(long *)(unaff_x23 + 0xc0);
    }
  }
  else {
    uStack0000000000000014 = 0;
    lVar25 = *(long *)(unaff_x23 + 0xc0);
  }
  if (lVar25 == 0) {
    lVar25 = *(long *)(unaff_x23 + 0x90);
  }
  else {
    lVar19 = *(long *)(unaff_x23 + 0xb8);
    lVar20 = lVar19 + lVar25 * 0x2c8;
    lVar25 = *(long *)(unaff_x23 + 0x88);
    lVar22 = *(long *)(unaff_x23 + 0x90);
    uStack0000000000000008 = 8;
    uStack0000000000000000 = 4;
    do {
      if (*(long *)(lVar19 + 0x238) == 4) {
        uVar11 = (**(uint **)(lVar19 + 0x230) & 0xff00ff00) >> 8 |
                 (**(uint **)(lVar19 + 0x230) & 0xff00ff) << 8;
        uVar3 = uVar11 >> 0x10 | uVar11 << 0x10;
        uVar11 = (uint)(0x68656c70 < uVar3);
        if (uVar3 < 0x68656c70) {
          uVar11 = 0xffffffff;
        }
        uVar3 = 0;
        if (uVar11 == 0 && (uVar15 & 0x100000) == 0) {
          uVar3 = uStack0000000000000014;
        }
        if (uVar3 != 1) goto LAB_00501514;
      }
      else {
LAB_00501514:
        lVar32 = lVar25;
LAB_00501554:
        lVar10 = lVar32;
        if (lVar10 != lVar25 + lVar22 * 600) {
          lVar32 = lVar10 + 600;
          if ((*(byte *)(lVar10 + 0x250) >> 1 & 1) != 0) {
            lVar34 = *(long *)(lVar10 + 0x220);
            if (*(long *)(lVar19 + 0x90) != 0) {
              plVar33 = (long *)(*(long *)(lVar19 + 0x88) + 0x220);
              lVar29 = *(long *)(lVar19 + 0x90) * 600;
              do {
                if ((*plVar33 == lVar34) &&
                   (iVar8 = _memcmp(plVar33[-1],*(undefined8 *)(lVar10 + 0x218),lVar34), iVar8 == 0)
                   ) {
                  goto LAB_00501554;
                }
                plVar33 = plVar33 + 0x4b;
                lVar29 = lVar29 + -600;
              } while (lVar29 != 0);
            }
            if (*(long *)(lVar10 + 0x1e8) == -0x8000000000000000) {
              if (*(long *)(lVar10 + 0x200) != -0x8000000000000000) goto LAB_005015e8;
LAB_00501650:
              uVar13 = *(ulong *)(lVar10 + 0x50);
            }
            else {
              func_0x0045cd08(auStack_7ffffffe + 0x80000dee,lVar10 + 0x1e8);
              if (*(long *)(lVar10 + 0x200) == -0x8000000000000000) goto LAB_00501650;
LAB_005015e8:
              func_0x0045cd08(auStack_7ffffffe + 0x800010ee,lVar10 + 0x200);
              uVar13 = *(ulong *)(lVar10 + 0x50);
            }
            if ((uVar13 != 5) && (3 < uVar13)) {
              (**(code **)(*(long *)(lVar10 + 0x60) + 0x38))(*(undefined8 *)(lVar10 + 0x58));
            }
            uVar27 = 0;
            uVar13 = *(ulong *)(lVar10 + 0x78);
            uVar23 = uVar13 * 0x10;
            if ((uVar13 >> 0x3c != 0) || (0x7ffffffffffffff8 < uVar23)) {
LAB_00503614:
              func_0x007a1f00(uVar27,uVar23,&UNK_009e7fc8);
              goto code_r0x005037ac;
            }
            if (uVar23 != 0) {
              puVar26 = *(undefined8 **)(lVar10 + 0x70);
              puVar9 = (undefined8 *)func_0x00187bd0(uVar23,8);
              uVar27 = 8;
              if (puVar9 == (undefined8 *)0x0) goto LAB_00503614;
              if (uVar13 == 0) goto LAB_0050178c;
              uVar16 = uVar13 - 1;
              uVar23 = uVar13;
              if (uVar16 <= uVar13) {
                uVar23 = uVar16;
              }
              if (uVar23 < 4) {
LAB_005016fc:
                lVar34 = 0;
                uVar23 = uVar13;
                puVar18 = puVar26;
              }
              else {
                uVar1 = uVar13;
                if (uVar16 <= uVar13) {
                  uVar1 = uVar16;
                }
                if ((puVar9 < puVar26 + uVar1 * 2 + 2) && (puVar26 < puVar9 + uVar1 * 2 + 2))
                goto LAB_005016fc;
                uVar16 = uVar23 + 1 & 3;
                uVar1 = 4;
                if (uVar16 != 0) {
                  uVar1 = uVar16;
                }
                lVar34 = (uVar23 + 1) - uVar1;
                uVar23 = uVar13 - lVar34;
                puVar18 = puVar26 + lVar34 * 2;
                puVar21 = puVar9 + 4;
                puVar17 = puVar26 + 4;
                lVar29 = lVar34;
                do {
                  uVar27 = puVar17[-3];
                  uVar30 = puVar17[-2];
                  uVar28 = puVar17[-1];
                  uVar31 = *puVar17;
                  uVar36 = puVar17[1];
                  uVar35 = puVar17[2];
                  uVar37 = puVar17[3];
                  puVar21[-4] = puVar17[-4];
                  puVar21[-3] = uVar27;
                  puVar21[-2] = uVar30;
                  puVar21[-1] = uVar28;
                  *puVar21 = uVar31;
                  puVar21[1] = uVar36;
                  puVar21[2] = uVar35;
                  puVar21[3] = uVar37;
                  puVar21 = puVar21 + 8;
                  puVar17 = puVar17 + 8;
                  lVar29 = lVar29 + -4;
                } while (lVar29 != 0);
              }
              puVar9 = puVar9 + lVar34 * 2 + 1;
              do {
                if (puVar18 == puVar26 + uVar13 * 2) break;
                uVar27 = puVar18[1];
                puVar9[-1] = *puVar18;
                *puVar9 = uVar27;
                puVar9 = puVar9 + 2;
                uVar23 = uVar23 - 1;
                puVar18 = puVar18 + 2;
              } while (uVar23 != 0);
            }
LAB_0050178c:
            uVar23 = *(ulong *)(lVar10 + 0x90);
            uVar13 = uVar23 * 0x10;
            if (uVar23 >> 0x3c != 0 || 0x7ffffffffffffff8 < uVar13) {
              uStack0000000000000008 = 0;
LAB_005036ec:
              func_0x007a1f00(uStack0000000000000008,uVar13,&UNK_009e7fc8);
              goto code_r0x005037ac;
            }
            if (uVar13 != 0) {
              puVar26 = *(undefined8 **)(lVar10 + 0x88);
              puVar9 = (undefined8 *)func_0x00187bd0(uVar13,8);
              if (puVar9 == (undefined8 *)0x0) goto LAB_005036ec;
              if (uVar23 == 0) goto LAB_005018ac;
              uVar16 = uVar23 - 1;
              uVar13 = uVar23;
              if (uVar16 <= uVar23) {
                uVar13 = uVar16;
              }
              if (uVar13 < 4) {
LAB_00501878:
                lVar34 = 0;
                uVar13 = uVar23;
                puVar18 = puVar26;
              }
              else {
                uVar1 = uVar23;
                if (uVar16 <= uVar23) {
                  uVar1 = uVar16;
                }
                if (puVar9 < puVar26 + uVar1 * 2 + 2 && puVar26 < puVar9 + uVar1 * 2 + 2)
                goto LAB_00501878;
                uVar16 = uVar13 + 1 & 3;
                uVar1 = 4;
                if (uVar16 != 0) {
                  uVar1 = uVar16;
                }
                lVar34 = (uVar13 + 1) - uVar1;
                uVar13 = uVar23 - lVar34;
                puVar18 = puVar26 + lVar34 * 2;
                puVar21 = puVar9 + 4;
                puVar17 = puVar26 + 4;
                lVar29 = lVar34;
                do {
                  uVar27 = puVar17[-3];
                  uVar30 = puVar17[-2];
                  uVar28 = puVar17[-1];
                  uVar31 = *puVar17;
                  uVar36 = puVar17[1];
                  uVar35 = puVar17[2];
                  uVar37 = puVar17[3];
                  puVar21[-4] = puVar17[-4];
                  puVar21[-3] = uVar27;
                  puVar21[-2] = uVar30;
                  puVar21[-1] = uVar28;
                  *puVar21 = uVar31;
                  puVar21[1] = uVar36;
                  puVar21[2] = uVar35;
                  puVar21[3] = uVar37;
                  puVar21 = puVar21 + 8;
                  puVar17 = puVar17 + 8;
                  lVar29 = lVar29 + -4;
                } while (lVar29 != 0);
              }
              puVar9 = puVar9 + lVar34 * 2 + 1;
              do {
                if (puVar18 == puVar26 + uVar23 * 2) break;
                uVar27 = puVar18[1];
                puVar9[-1] = *puVar18;
                *puVar9 = uVar27;
                puVar9 = puVar9 + 2;
                uVar13 = uVar13 - 1;
                puVar18 = puVar18 + 2;
              } while (uVar13 != 0);
            }
LAB_005018ac:
            uVar23 = *(ulong *)(lVar10 + 0xa8);
            uVar13 = uVar23 * 0x10;
            if (uVar23 >> 0x3c != 0 || 0x7ffffffffffffff8 < uVar13) {
              uStack0000000000000008 = 0;
LAB_005036b4:
              func_0x007a1f00(uStack0000000000000008,uVar13,&UNK_009e7fc8);
              goto code_r0x005037ac;
            }
            if (uVar13 != 0) {
              puVar26 = *(undefined8 **)(lVar10 + 0xa0);
              puVar9 = (undefined8 *)func_0x00187bd0(uVar13,8);
              if (puVar9 == (undefined8 *)0x0) goto LAB_005036b4;
              if (uVar23 == 0) goto LAB_005019d8;
              uVar16 = uVar23 - 1;
              uVar13 = uVar23;
              if (uVar16 <= uVar23) {
                uVar13 = uVar16;
              }
              if (uVar13 < 4) {
LAB_005019a0:
                lVar34 = 0;
                uVar13 = uVar23;
                puVar18 = puVar26;
              }
              else {
                uVar1 = uVar23;
                if (uVar16 <= uVar23) {
                  uVar1 = uVar16;
                }
                if (puVar9 < puVar26 + uVar1 * 2 + 2 && puVar26 < puVar9 + uVar1 * 2 + 2)
                goto LAB_005019a0;
                uVar16 = uVar13 + 1 & 3;
                uVar1 = 4;
                if (uVar16 != 0) {
                  uVar1 = uVar16;
                }
                lVar34 = (uVar13 + 1) - uVar1;
                puVar18 = puVar9 + 4;
                puVar21 = puVar26 + 4;
                lVar29 = lVar34;
                do {
                  uVar27 = puVar21[-3];
                  uVar30 = puVar21[-2];
                  uVar28 = puVar21[-1];
                  uVar31 = *puVar21;
                  uVar36 = puVar21[1];
                  uVar35 = puVar21[2];
                  uVar37 = puVar21[3];
                  puVar18[-4] = puVar21[-4];
                  puVar18[-3] = uVar27;
                  puVar18[-2] = uVar30;
                  puVar18[-1] = uVar28;
                  *puVar18 = uVar31;
                  puVar18[1] = uVar36;
                  puVar18[2] = uVar35;
                  puVar18[3] = uVar37;
                  puVar18 = puVar18 + 8;
                  puVar21 = puVar21 + 8;
                  lVar29 = lVar29 + -4;
                } while (lVar29 != 0);
                uVar13 = uVar23 - lVar34;
                puVar18 = puVar26 + lVar34 * 2;
              }
              puVar9 = puVar9 + lVar34 * 2 + 1;
              do {
                if (puVar18 == puVar26 + uVar23 * 2) break;
                uVar27 = puVar18[1];
                puVar9[-1] = *puVar18;
                *puVar9 = uVar27;
                puVar9 = puVar9 + 2;
                uVar13 = uVar13 - 1;
                puVar18 = puVar18 + 2;
              } while (uVar13 != 0);
            }
LAB_005019d8:
            uVar23 = *(ulong *)(lVar10 + 0xc0);
            uVar13 = uVar23 * 0x20;
            if (uVar23 >> 0x3b != 0 || 0x7ffffffffffffff8 < uVar13) {
              uStack0000000000000008 = 0;
LAB_00503740:
              func_0x007a1f00(uStack0000000000000008,uVar13,&UNK_009e7fc8);
              goto code_r0x005037ac;
            }
            if (uVar13 != 0) {
              puVar26 = *(undefined8 **)(lVar10 + 0xb8);
              puVar9 = (undefined8 *)func_0x00187bd0(uVar13,8);
              if (puVar9 == (undefined8 *)0x0) goto LAB_00503740;
              if (uVar23 == 0) goto LAB_00501af4;
              uVar16 = uVar23 - 1;
              uVar13 = uVar23;
              if (uVar16 <= uVar23) {
                uVar13 = uVar16;
              }
              if (uVar13 < 2) {
LAB_00501ab4:
                uVar13 = 0;
                uVar16 = uVar23;
                puVar18 = puVar26;
              }
              else {
                uVar1 = uVar23;
                if (uVar16 <= uVar23) {
                  uVar1 = uVar16;
                }
                if (puVar9 < puVar26 + uVar1 * 4 + 4 && puVar26 < puVar9 + uVar1 * 4 + 4)
                goto LAB_00501ab4;
                uVar13 = uVar13 & 0x7fffffffffffffe;
                uVar16 = uVar13;
                puVar18 = puVar26;
                puVar21 = puVar9;
                do {
                  uVar31 = puVar18[5];
                  uVar30 = puVar18[4];
                  uVar28 = puVar18[7];
                  uVar27 = puVar18[6];
                  uVar37 = puVar18[1];
                  uVar36 = puVar18[3];
                  uVar35 = puVar18[2];
                  *puVar21 = *puVar18;
                  puVar21[1] = uVar37;
                  puVar21[2] = uVar35;
                  puVar21[3] = uVar36;
                  puVar21[4] = uVar30;
                  puVar21[5] = uVar31;
                  puVar21[6] = uVar27;
                  puVar21[7] = uVar28;
                  puVar21 = puVar21 + 8;
                  uVar16 = uVar16 - 2;
                  puVar18 = puVar18 + 8;
                } while (uVar16 != 0);
                uVar16 = uVar23 - uVar13;
                puVar18 = puVar26 + uVar13 * 4;
              }
              puVar9 = puVar9 + uVar13 * 4 + 2;
              do {
                if (puVar18 == puVar26 + uVar23 * 4) break;
                uVar28 = *puVar18;
                uVar27 = puVar18[2];
                uVar30 = puVar18[3];
                puVar9[-1] = puVar18[1];
                puVar9[-2] = uVar28;
                *puVar9 = uVar27;
                puVar9[1] = uVar30;
                puVar18 = puVar18 + 4;
                uVar16 = uVar16 - 1;
                puVar9 = puVar9 + 4;
              } while (uVar16 != 0);
            }
LAB_00501af4:
            uVar23 = *(ulong *)(lVar10 + 0xd8);
            uVar13 = uVar23 * 0x20;
            if (uVar23 >> 0x3b != 0 || 0x7ffffffffffffff8 < uVar13) {
              uStack0000000000000008 = 0;
LAB_00503708:
              func_0x007a1f00(uStack0000000000000008,uVar13,&UNK_009e7fc8);
              goto code_r0x005037ac;
            }
            if (uVar13 != 0) {
              puVar26 = *(undefined8 **)(lVar10 + 0xd0);
              puVar9 = (undefined8 *)func_0x00187bd0(uVar13,8);
              if (puVar9 == (undefined8 *)0x0) goto LAB_00503708;
              if (uVar23 == 0) goto LAB_00501c10;
              uVar16 = uVar23 - 1;
              uVar13 = uVar23;
              if (uVar16 <= uVar23) {
                uVar13 = uVar16;
              }
              if (uVar13 < 2) {
LAB_00501bd0:
                uVar13 = 0;
                uVar16 = uVar23;
                puVar18 = puVar26;
              }
              else {
                uVar1 = uVar23;
                if (uVar16 <= uVar23) {
                  uVar1 = uVar16;
                }
                if (puVar9 < puVar26 + uVar1 * 4 + 4 && puVar26 < puVar9 + uVar1 * 4 + 4)
                goto LAB_00501bd0;
                uVar13 = uVar13 & 0x7fffffffffffffe;
                uVar16 = uVar13;
                puVar18 = puVar26;
                puVar21 = puVar9;
                do {
                  uVar31 = puVar18[5];
                  uVar30 = puVar18[4];
                  uVar28 = puVar18[7];
                  uVar27 = puVar18[6];
                  uVar37 = puVar18[1];
                  uVar36 = puVar18[3];
                  uVar35 = puVar18[2];
                  *puVar21 = *puVar18;
                  puVar21[1] = uVar37;
                  puVar21[2] = uVar35;
                  puVar21[3] = uVar36;
                  puVar21[4] = uVar30;
                  puVar21[5] = uVar31;
                  puVar21[6] = uVar27;
                  puVar21[7] = uVar28;
                  puVar21 = puVar21 + 8;
                  uVar16 = uVar16 - 2;
                  puVar18 = puVar18 + 8;
                } while (uVar16 != 0);
                uVar16 = uVar23 - uVar13;
                puVar18 = puVar26 + uVar13 * 4;
              }
              puVar9 = puVar9 + uVar13 * 4 + 2;
              do {
                if (puVar18 == puVar26 + uVar23 * 4) break;
                uVar28 = *puVar18;
                uVar27 = puVar18[2];
                uVar30 = puVar18[3];
                puVar9[-1] = puVar18[1];
                puVar9[-2] = uVar28;
                *puVar9 = uVar27;
                puVar9[1] = uVar30;
                puVar18 = puVar18 + 4;
                uVar16 = uVar16 - 1;
                puVar9 = puVar9 + 4;
              } while (uVar16 != 0);
            }
LAB_00501c10:
            uVar23 = *(ulong *)(lVar10 + 0xf0);
            uVar13 = uVar23 * 0x20;
            if (uVar23 >> 0x3b != 0 || 0x7ffffffffffffff8 < uVar13) {
              uStack0000000000000008 = 0;
LAB_00503698:
              func_0x007a1f00(uStack0000000000000008,uVar13,&UNK_009e7fc8);
              goto code_r0x005037ac;
            }
            if (uVar13 != 0) {
              puVar26 = *(undefined8 **)(lVar10 + 0xe8);
              puVar9 = (undefined8 *)func_0x00187bd0(uVar13,8);
              if (puVar9 == (undefined8 *)0x0) goto LAB_00503698;
              if (uVar23 == 0) goto LAB_00501d2c;
              uVar16 = uVar23 - 1;
              uVar13 = uVar23;
              if (uVar16 <= uVar23) {
                uVar13 = uVar16;
              }
              if (uVar13 < 2) {
LAB_00501cec:
                uVar13 = 0;
                uVar16 = uVar23;
                puVar18 = puVar26;
              }
              else {
                uVar1 = uVar23;
                if (uVar16 <= uVar23) {
                  uVar1 = uVar16;
                }
                if (puVar9 < puVar26 + uVar1 * 4 + 4 && puVar26 < puVar9 + uVar1 * 4 + 4)
                goto LAB_00501cec;
                uVar13 = uVar13 & 0x7fffffffffffffe;
                uVar16 = uVar13;
                puVar18 = puVar26;
                puVar21 = puVar9;
                do {
                  uVar31 = puVar18[5];
                  uVar30 = puVar18[4];
                  uVar28 = puVar18[7];
                  uVar27 = puVar18[6];
                  uVar37 = puVar18[1];
                  uVar36 = puVar18[3];
                  uVar35 = puVar18[2];
                  *puVar21 = *puVar18;
                  puVar21[1] = uVar37;
                  puVar21[2] = uVar35;
                  puVar21[3] = uVar36;
                  puVar21[4] = uVar30;
                  puVar21[5] = uVar31;
                  puVar21[6] = uVar27;
                  puVar21[7] = uVar28;
                  puVar21 = puVar21 + 8;
                  uVar16 = uVar16 - 2;
                  puVar18 = puVar18 + 8;
                } while (uVar16 != 0);
                uVar16 = uVar23 - uVar13;
                puVar18 = puVar26 + uVar13 * 4;
              }
              puVar9 = puVar9 + uVar13 * 4 + 2;
              do {
                if (puVar18 == puVar26 + uVar23 * 4) break;
                uVar28 = *puVar18;
                uVar27 = puVar18[2];
                uVar30 = puVar18[3];
                puVar9[-1] = puVar18[1];
                puVar9[-2] = uVar28;
                *puVar9 = uVar27;
                puVar9[1] = uVar30;
                puVar18 = puVar18 + 4;
                uVar16 = uVar16 - 1;
                puVar9 = puVar9 + 4;
              } while (uVar16 != 0);
            }
LAB_00501d2c:
            uVar13 = *(ulong *)(lVar10 + 0x108);
            uVar23 = uVar13 * 0x10;
            if (uVar13 >> 0x3c != 0 || 0x7ffffffffffffff8 < uVar23) {
              uStack0000000000000008 = 0;
LAB_00503760:
              func_0x007a1f00(uStack0000000000000008,uVar23,&UNK_009e7fc8);
              goto code_r0x005037ac;
            }
            if (uVar23 != 0) {
              puVar26 = *(undefined8 **)(lVar10 + 0x100);
              puVar9 = (undefined8 *)func_0x00187bd0(uVar23,8);
              if (puVar9 == (undefined8 *)0x0) goto LAB_00503760;
              if (uVar13 == 0) goto LAB_00501e68;
              uVar16 = uVar13 - 1;
              uVar23 = uVar13;
              if (uVar16 <= uVar13) {
                uVar23 = uVar16;
              }
              if (uVar23 < 4) {
LAB_00501e28:
                lVar34 = 0;
                uVar23 = uVar13;
                puVar18 = puVar26;
              }
              else {
                uVar1 = uVar13;
                if (uVar16 <= uVar13) {
                  uVar1 = uVar16;
                }
                if (puVar9 < puVar26 + uVar1 * 2 + 2 && puVar26 < puVar9 + uVar1 * 2 + 2)
                goto LAB_00501e28;
                uVar16 = uVar23 + 1 & 3;
                uVar1 = 4;
                if (uVar16 != 0) {
                  uVar1 = uVar16;
                }
                lVar34 = (uVar23 + 1) - uVar1;
                puVar18 = puVar9 + 4;
                puVar21 = puVar26 + 4;
                lVar29 = lVar34;
                do {
                  uVar27 = puVar21[-3];
                  uVar30 = puVar21[-2];
                  uVar28 = puVar21[-1];
                  uVar31 = *puVar21;
                  uVar36 = puVar21[1];
                  uVar35 = puVar21[2];
                  uVar37 = puVar21[3];
                  puVar18[-4] = puVar21[-4];
                  puVar18[-3] = uVar27;
                  puVar18[-2] = uVar30;
                  puVar18[-1] = uVar28;
                  *puVar18 = uVar31;
                  puVar18[1] = uVar36;
                  puVar18[2] = uVar35;
                  puVar18[3] = uVar37;
                  puVar18 = puVar18 + 8;
                  puVar21 = puVar21 + 8;
                  lVar29 = lVar29 + -4;
                } while (lVar29 != 0);
                uVar23 = uVar13 - lVar34;
                puVar18 = puVar26 + lVar34 * 2;
              }
              puVar9 = puVar9 + lVar34 * 2 + 1;
              do {
                if (puVar18 == puVar26 + uVar13 * 2) break;
                uVar27 = puVar18[1];
                puVar9[-1] = *puVar18;
                *puVar9 = uVar27;
                puVar9 = puVar9 + 2;
                uVar23 = uVar23 - 1;
                puVar18 = puVar18 + 2;
              } while (uVar23 != 0);
            }
LAB_00501e68:
            uVar23 = *(ulong *)(lVar10 + 0x120);
            uVar13 = uVar23 * 0x10;
            if (uVar23 >> 0x3c != 0 || 0x7ffffffffffffff8 < uVar13) {
              uStack0000000000000008 = 0;
LAB_005036d0:
              func_0x007a1f00(uStack0000000000000008,uVar13,&UNK_009e7fc8);
              goto code_r0x005037ac;
            }
            if (uVar13 != 0) {
              puVar26 = *(undefined8 **)(lVar10 + 0x118);
              puVar9 = (undefined8 *)func_0x00187bd0(uVar13,8);
              if (puVar9 == (undefined8 *)0x0) goto LAB_005036d0;
              if (uVar23 == 0) goto LAB_00501f98;
              uVar16 = uVar23 - 1;
              uVar13 = uVar23;
              if (uVar16 <= uVar23) {
                uVar13 = uVar16;
              }
              if (uVar13 < 4) {
LAB_00501f60:
                lVar34 = 0;
                uVar13 = uVar23;
                puVar18 = puVar26;
              }
              else {
                uVar1 = uVar23;
                if (uVar16 <= uVar23) {
                  uVar1 = uVar16;
                }
                if (puVar9 < puVar26 + uVar1 * 2 + 2 && puVar26 < puVar9 + uVar1 * 2 + 2)
                goto LAB_00501f60;
                uVar16 = uVar13 + 1 & 3;
                uVar1 = 4;
                if (uVar16 != 0) {
                  uVar1 = uVar16;
                }
                lVar34 = (uVar13 + 1) - uVar1;
                puVar18 = puVar9 + 4;
                puVar21 = puVar26 + 4;
                lVar29 = lVar34;
                do {
                  uVar27 = puVar21[-3];
                  uVar30 = puVar21[-2];
                  uVar28 = puVar21[-1];
                  uVar31 = *puVar21;
                  uVar36 = puVar21[1];
                  uVar35 = puVar21[2];
                  uVar37 = puVar21[3];
                  puVar18[-4] = puVar21[-4];
                  puVar18[-3] = uVar27;
                  puVar18[-2] = uVar30;
                  puVar18[-1] = uVar28;
                  *puVar18 = uVar31;
                  puVar18[1] = uVar36;
                  puVar18[2] = uVar35;
                  puVar18[3] = uVar37;
                  puVar18 = puVar18 + 8;
                  puVar21 = puVar21 + 8;
                  lVar29 = lVar29 + -4;
                } while (lVar29 != 0);
                uVar13 = uVar23 - lVar34;
                puVar18 = puVar26 + lVar34 * 2;
              }
              puVar9 = puVar9 + lVar34 * 2 + 1;
              do {
                if (puVar18 == puVar26 + uVar23 * 2) break;
                uVar27 = puVar18[1];
                puVar9[-1] = *puVar18;
                *puVar9 = uVar27;
                puVar9 = puVar9 + 2;
                uVar13 = uVar13 - 1;
                puVar18 = puVar18 + 2;
              } while (uVar13 != 0);
            }
LAB_00501f98:
            uVar27 = 0;
            uVar23 = *(ulong *)(lVar10 + 0x138);
            auVar4._8_8_ = 0;
            auVar4._0_8_ = uVar23;
            uVar13 = uVar23 * 0x18;
            if ((SUB168(auVar4 * ZEXT816(0x18),8) != 0) || (0x7ffffffffffffff8 < uVar13)) {
LAB_0050364c:
              func_0x007a1f00(uVar27,uVar13,&UNK_009e7fc8);
              goto code_r0x005037ac;
            }
            if (uVar13 != 0) {
              puVar9 = *(undefined8 **)(lVar10 + 0x130);
              lVar34 = func_0x00187bd0(uVar13,8);
              uVar27 = 8;
              if (lVar34 == 0) goto LAB_0050364c;
              if (uVar23 != 0) {
                puVar12 = (undefined1 *)(lVar34 + 0x10);
                do {
                  if (uVar13 == 0) break;
                  uVar27 = *puVar9;
                  uVar30 = puVar9[1];
                  uVar2 = *(undefined1 *)(puVar9 + 2);
                  puVar9 = puVar9 + 3;
                  *(undefined8 *)(puVar12 + -0x10) = uVar27;
                  *(undefined8 *)(puVar12 + -8) = uVar30;
                  *puVar12 = uVar2;
                  uVar13 = uVar13 - 0x18;
                  uVar23 = uVar23 - 1;
                  puVar12 = puVar12 + 0x18;
                } while (uVar23 != 0);
              }
            }
            uVar13 = *(ulong *)(lVar10 + 0x150) * 8;
            if (*(ulong *)(lVar10 + 0x150) >> 0x3d != 0 || 0x7ffffffffffffffc < uVar13) {
              uStack0000000000000000 = 0;
LAB_00503724:
              func_0x007a1f00(uStack0000000000000000,uVar13,&UNK_009e7fe0);
              goto code_r0x005037ac;
            }
            uVar27 = *(undefined8 *)(lVar10 + 0x148);
            if (uVar13 == 0) {
              lVar34 = 4;
            }
            else {
              lVar34 = func_0x00187bd0(uVar13,4);
              if (lVar34 == 0) goto LAB_00503724;
            }
            _memcpy(lVar34,uVar27,uVar13);
            uVar27 = 0;
            uVar23 = *(ulong *)(lVar10 + 0x168);
            uVar13 = uVar23 * 0x10;
            if ((uVar23 >> 0x3c != 0) || (0x7ffffffffffffff8 < uVar13)) {
LAB_0050363c:
              func_0x007a1f00(uVar27,uVar13,&UNK_009e7fc8);
              goto code_r0x005037ac;
            }
            if (uVar13 != 0) {
              puVar26 = *(undefined8 **)(lVar10 + 0x160);
              puVar9 = (undefined8 *)func_0x00187bd0(uVar13,8);
              uVar27 = 8;
              if (puVar9 == (undefined8 *)0x0) goto LAB_0050363c;
              if (uVar23 == 0) goto LAB_00502208;
              uVar16 = uVar23 - 1;
              uVar13 = uVar23;
              if (uVar16 <= uVar23) {
                uVar13 = uVar16;
              }
              if (uVar13 < 4) {
LAB_00502170:
                lVar34 = 0;
                uVar13 = uVar23;
                puVar18 = puVar26;
              }
              else {
                uVar1 = uVar23;
                if (uVar16 <= uVar23) {
                  uVar1 = uVar16;
                }
                if ((puVar9 < puVar26 + uVar1 * 2 + 2) && (puVar26 < puVar9 + uVar1 * 2 + 2))
                goto LAB_00502170;
                uVar16 = uVar13 + 1 & 3;
                uVar1 = 4;
                if (uVar16 != 0) {
                  uVar1 = uVar16;
                }
                lVar34 = (uVar13 + 1) - uVar1;
                uVar13 = uVar23 - lVar34;
                puVar18 = puVar26 + lVar34 * 2;
                puVar21 = puVar9 + 4;
                puVar17 = puVar26 + 4;
                lVar29 = lVar34;
                do {
                  uVar27 = puVar17[-3];
                  uVar30 = puVar17[-2];
                  uVar28 = puVar17[-1];
                  uVar31 = *puVar17;
                  uVar36 = puVar17[1];
                  uVar35 = puVar17[2];
                  uVar37 = puVar17[3];
                  puVar21[-4] = puVar17[-4];
                  puVar21[-3] = uVar27;
                  puVar21[-2] = uVar30;
                  puVar21[-1] = uVar28;
                  *puVar21 = uVar31;
                  puVar21[1] = uVar36;
                  puVar21[2] = uVar35;
                  puVar21[3] = uVar37;
                  puVar21 = puVar21 + 8;
                  puVar17 = puVar17 + 8;
                  lVar29 = lVar29 + -4;
                } while (lVar29 != 0);
              }
              puVar9 = puVar9 + lVar34 * 2 + 1;
              do {
                if (puVar18 == puVar26 + uVar23 * 2) break;
                uVar27 = puVar18[1];
                puVar9[-1] = *puVar18;
                *puVar9 = uVar27;
                puVar9 = puVar9 + 2;
                uVar13 = uVar13 - 1;
                puVar18 = puVar18 + 2;
              } while (uVar13 != 0);
            }
LAB_00502208:
            uVar23 = *(ulong *)(lVar10 + 0x180);
            uVar13 = uVar23 * 0x10;
            if (uVar23 >> 0x3c != 0 || 0x7ffffffffffffff8 < uVar13) {
              uStack0000000000000008 = 0;
LAB_0050367c:
              func_0x007a1f00(uStack0000000000000008,uVar13,&UNK_009e7fc8);
              goto code_r0x005037ac;
            }
            if (uVar13 != 0) {
              puVar26 = *(undefined8 **)(lVar10 + 0x178);
              puVar9 = (undefined8 *)func_0x00187bd0(uVar13,8);
              if (puVar9 == (undefined8 *)0x0) goto LAB_0050367c;
              if (uVar23 == 0) goto LAB_0050237c;
              uVar16 = uVar23 - 1;
              uVar13 = uVar23;
              if (uVar16 <= uVar23) {
                uVar13 = uVar16;
              }
              if (uVar13 < 4) {
LAB_005022ec:
                lVar29 = 0;
                uVar13 = uVar23;
                puVar17 = puVar26;
              }
              else {
                uVar1 = uVar23;
                if (uVar16 <= uVar23) {
                  uVar1 = uVar16;
                }
                if ((puVar9 < puVar26 + uVar1 * 2 + 2) && (puVar26 < puVar9 + uVar1 * 2 + 2))
                goto LAB_005022ec;
                uVar16 = uVar13 + 1 & 3;
                uVar1 = 4;
                if (uVar16 != 0) {
                  uVar1 = uVar16;
                }
                lVar29 = (uVar13 + 1) - uVar1;
                uVar13 = uVar23 - lVar29;
                puVar17 = puVar26 + lVar29 * 2;
                puVar18 = puVar9 + 4;
                puVar21 = puVar26 + 4;
                lVar34 = lVar29;
                do {
                  uVar27 = puVar21[-3];
                  uVar30 = puVar21[-2];
                  uVar28 = puVar21[-1];
                  uVar31 = *puVar21;
                  uVar36 = puVar21[1];
                  uVar35 = puVar21[2];
                  uVar37 = puVar21[3];
                  puVar18[-4] = puVar21[-4];
                  puVar18[-3] = uVar27;
                  puVar18[-2] = uVar30;
                  puVar18[-1] = uVar28;
                  *puVar18 = uVar31;
                  puVar18[1] = uVar36;
                  puVar18[2] = uVar35;
                  puVar18[3] = uVar37;
                  puVar18 = puVar18 + 8;
                  puVar21 = puVar21 + 8;
                  lVar34 = lVar34 + -4;
                } while (lVar34 != 0);
              }
              puVar9 = puVar9 + lVar29 * 2 + 1;
              do {
                if (puVar17 == puVar26 + uVar23 * 2) break;
                uVar27 = puVar17[1];
                puVar9[-1] = *puVar17;
                *puVar9 = uVar27;
                puVar9 = puVar9 + 2;
                uVar13 = uVar13 - 1;
                puVar17 = puVar17 + 2;
              } while (uVar13 != 0);
            }
LAB_0050237c:
            uVar27 = 0;
            uVar23 = *(ulong *)(lVar10 + 0x198);
            auVar5._8_8_ = 0;
            auVar5._0_8_ = uVar23;
            uVar13 = uVar23 * 0x30;
            if ((SUB168(auVar5 * ZEXT816(0x30),8) != 0) || (0x7ffffffffffffff8 < uVar13)) {
code_r0x00503628:
              func_0x007a1f00(uVar27,uVar13,&UNK_009e7fc8);
              goto code_r0x005037ac;
            }
            if (uVar13 != 0) {
              puVar9 = *(undefined8 **)(lVar10 + 400);
              lVar34 = func_0x00187bd0(uVar13,8);
              uVar27 = 8;
              if (lVar34 == 0) goto code_r0x00503628;
              if (uVar23 != 0) {
                puVar26 = (undefined8 *)(lVar34 + 0x18);
                do {
                  if (uVar13 == 0) break;
                  puVar18 = puVar9 + 1;
                  uVar28 = *puVar9;
                  uVar35 = puVar9[3];
                  uVar31 = puVar9[2];
                  uVar27 = puVar9[4];
                  uVar30 = puVar9[5];
                  puVar9 = puVar9 + 6;
                  puVar26[-2] = *puVar18;
                  puVar26[-3] = uVar28;
                  *puVar26 = uVar35;
                  puVar26[-1] = uVar31;
                  puVar26[1] = uVar27;
                  puVar26[2] = uVar30;
                  uVar13 = uVar13 - 0x30;
                  puVar26 = puVar26 + 6;
                  uVar23 = uVar23 - 1;
                } while (uVar23 != 0);
              }
            }
            uVar23 = *(ulong *)(lVar10 + 0x1b0);
            uVar13 = uVar23 * 0x10;
            if (uVar23 >> 0x3c != 0 || 0x7ffffffffffffff8 < uVar13) {
              uStack0000000000000008 = 0;
code_r0x00503798:
              func_0x007a1f00(uStack0000000000000008,uVar13,&UNK_009e7fc8);
              goto code_r0x005037ac;
            }
            if (uVar13 != 0) {
              puVar26 = *(undefined8 **)(lVar10 + 0x1a8);
              puVar9 = (undefined8 *)func_0x00187bd0(uVar13,8);
              if (puVar9 == (undefined8 *)0x0) goto code_r0x00503798;
              if (uVar23 == 0) goto code_r0x0050253c;
              uVar16 = uVar23 - 1;
              uVar13 = uVar23;
              if (uVar16 <= uVar23) {
                uVar13 = uVar16;
              }
              if (uVar13 < 4) {
code_r0x00502508:
                lVar34 = 0;
                uVar13 = uVar23;
                puVar18 = puVar26;
              }
              else {
                uVar1 = uVar23;
                if (uVar16 <= uVar23) {
                  uVar1 = uVar16;
                }
                if (puVar9 < puVar26 + uVar1 * 2 + 2 && puVar26 < puVar9 + uVar1 * 2 + 2)
                goto code_r0x00502508;
                uVar16 = uVar13 + 1 & 3;
                uVar1 = 4;
                if (uVar16 != 0) {
                  uVar1 = uVar16;
                }
                lVar34 = (uVar13 + 1) - uVar1;
                uVar13 = uVar23 - lVar34;
                puVar18 = puVar26 + lVar34 * 2;
                puVar21 = puVar9 + 4;
                puVar17 = puVar26 + 4;
                lVar29 = lVar34;
                do {
                  uVar27 = puVar17[-3];
                  uVar30 = puVar17[-2];
                  uVar28 = puVar17[-1];
                  uVar31 = *puVar17;
                  uVar36 = puVar17[1];
                  uVar35 = puVar17[2];
                  uVar37 = puVar17[3];
                  puVar21[-4] = puVar17[-4];
                  puVar21[-3] = uVar27;
                  puVar21[-2] = uVar30;
                  puVar21[-1] = uVar28;
                  *puVar21 = uVar31;
                  puVar21[1] = uVar36;
                  puVar21[2] = uVar35;
                  puVar21[3] = uVar37;
                  puVar21 = puVar21 + 8;
                  puVar17 = puVar17 + 8;
                  lVar29 = lVar29 + -4;
                } while (lVar29 != 0);
              }
              puVar9 = puVar9 + lVar34 * 2 + 1;
              do {
                if (puVar18 == puVar26 + uVar23 * 2) break;
                uVar27 = puVar18[1];
                puVar9[-1] = *puVar18;
                *puVar9 = uVar27;
                puVar9 = puVar9 + 2;
                uVar13 = uVar13 - 1;
                puVar18 = puVar18 + 2;
              } while (uVar13 != 0);
            }
code_r0x0050253c:
            uVar13 = *(ulong *)(lVar10 + 0x1c8) * 0x10;
            if (*(ulong *)(lVar10 + 0x1c8) >> 0x3c != 0 || 0x7ffffffffffffff8 < uVar13) {
              uStack0000000000000008 = 0;
code_r0x0050377c:
              func_0x007a1f00(uStack0000000000000008,uVar13,&UNK_009e7fe0);
              goto code_r0x005037ac;
            }
            uVar27 = *(undefined8 *)(lVar10 + 0x1c0);
            if (uVar13 == 0) {
              lVar34 = 8;
            }
            else {
              lVar34 = func_0x00187bd0(uVar13,8);
              if (lVar34 == 0) goto code_r0x0050377c;
            }
            _memcpy(lVar34,uVar27,uVar13);
            uVar27 = 0;
            uVar13 = *(ulong *)(lVar10 + 0x1e0);
            uVar23 = uVar13 * 0x20;
            if ((uVar13 >> 0x3b != 0) || (0x7ffffffffffffff8 < uVar23)) {
code_r0x00503660:
              func_0x007a1f00(uVar27,uVar23,&UNK_009e7fc8);
code_r0x005037ac:
                    /* WARNING: Does not return */
              pcVar6 = (code *)SoftwareBreakpoint(1,0x5037b0);
              (*pcVar6)();
            }
            if (uVar23 != 0) {
              puVar9 = *(undefined8 **)(lVar10 + 0x1d8);
              lVar10 = func_0x00187bd0(uVar23,8);
              uVar27 = 8;
              if (lVar10 == 0) goto code_r0x00503660;
              if (uVar13 != 0) {
                puVar26 = (undefined8 *)(lVar10 + 0x10);
                do {
                  if (uVar23 == 0) break;
                  plVar33 = (long *)*puVar9;
                  lVar10 = *plVar33;
                  *plVar33 = lVar10 + 1;
                  if (lVar10 < 0) goto code_r0x005037ac;
                  uVar30 = puVar9[1];
                  uVar28 = puVar9[3];
                  uVar27 = puVar9[2];
                  puVar9 = puVar9 + 4;
                  puVar26[-2] = plVar33;
                  puVar26[-1] = uVar30;
                  puVar26[1] = uVar28;
                  *puVar26 = uVar27;
                  uVar23 = uVar23 - 0x20;
                  uVar13 = uVar13 - 1;
                  puVar26 = puVar26 + 4;
                } while (uVar13 != 0);
              }
            }
            lVar10 = *(long *)(lVar19 + 0x90);
            if (lVar10 == *(long *)(lVar19 + 0x80)) {
              func_0x0050c440(lVar19 + 0x80,&UNK_009e93a0);
            }
            _memcpy(*(long *)(lVar19 + 0x88) + lVar10 * 600,auStack_7ffffffe + 0x800013be,600);
            *(long *)(lVar19 + 0x90) = lVar10 + 1;
          }
          goto LAB_00501554;
        }
        unaff_x23 = in_stack_00000230;
      }
      lVar19 = lVar19 + 0x2c8;
    } while (lVar19 != lVar20);
    uVar11 = *(uint *)(unaff_x23 + 700);
    uVar15 = *(uint *)(unaff_x23 + 0x2c0);
    lVar25 = *(long *)(unaff_x23 + 0x90);
  }
  if (lVar25 != 0) {
    lVar32 = *(long *)(unaff_x23 + 0x88);
    lVar19 = 1;
    lVar22 = lVar32 + 600;
    lVar20 = lVar32;
    do {
      lVar10 = lVar22;
      if (*(long *)(lVar20 + 0xa8) != 0) {
        puVar26 = *(undefined8 **)(lVar20 + 0xa0);
        puVar9 = puVar26 + *(long *)(lVar20 + 0xa8) * 2;
        puVar18 = puVar26 + 2;
code_r0x0050294c:
        do {
          if (*(long *)(unaff_x23 + 0xd8) != 0) {
            plVar33 = *(long **)(in_stack_00000230 + 0xd0);
            lVar34 = puVar26[1];
            lVar22 = *(long *)(unaff_x23 + 0xd8) * 0x60;
            do {
              if ((plVar33[10] == lVar34) &&
                 (iVar8 = _memcmp(plVar33[9],*puVar26,lVar34), iVar8 == 0)) {
                uVar27 = *(undefined8 *)(lVar20 + 0x218);
                uVar30 = *(undefined8 *)(lVar20 + 0x220);
                lVar22 = plVar33[2];
                if (lVar22 == *plVar33) {
                  func_0x0050c0c0(plVar33,&UNK_009e8a18);
                }
                puVar26 = (undefined8 *)(plVar33[1] + lVar22 * 0x10);
                *puVar26 = uVar27;
                puVar26[1] = uVar30;
                plVar33[2] = lVar22 + 1;
                bVar7 = puVar18 != puVar9;
                puVar26 = puVar18;
                unaff_x23 = in_stack_00000230;
                puVar18 = puVar18 + (ulong)bVar7 * 2;
                if (bVar7) goto code_r0x0050294c;
                goto code_r0x00502a98;
              }
              plVar33 = plVar33 + 0xc;
              lVar22 = lVar22 + -0x60;
            } while (lVar22 != 0);
          }
          uVar27 = *puVar26;
          uVar30 = puVar26[1];
          uVar28 = *(undefined8 *)(lVar20 + 0x218);
          uVar31 = *(undefined8 *)(lVar20 + 0x220);
          func_0x0050c0c0(auStack_7ffffffe + 0x800010ee,&UNK_009e8a30);
          MACH_HEADER.cpusubtype._0_1_ = (undefined1)uVar28;
          MACH_HEADER._9_5_ = SUB85((ulong)uVar28 >> 8,0);
          MACH_HEADER.filetype._2_2_ = (undefined2)((ulong)uVar28 >> 0x30);
          lVar22 = *(long *)(in_stack_00000230 + 0xd8);
          MACH_HEADER._16_8_ = uVar31;
          if (lVar22 == *(long *)(in_stack_00000230 + 200)) {
            func_0x0050c500(in_stack_00000230 + 200,&UNK_009e8a48);
          }
          puVar26 = (undefined8 *)(*(long *)(in_stack_00000230 + 0xd0) + lVar22 * 0x60);
          puVar26[5] = 0;
          puVar26[4] = 8;
          puVar26[7] = 8;
          puVar26[6] = 0;
          puVar26[9] = uVar27;
          puVar26[8] = 0;
          puVar26[0xb] = (ulong)in_stack_0000114a << 0x10;
          puVar26[10] = uVar30;
          puVar26[1] = 8;
          *puVar26 = 0;
          puVar26[3] = 0;
          puVar26[2] = 1;
          *(long *)(in_stack_00000230 + 0xd8) = lVar22 + 1;
          bVar7 = puVar18 != puVar9;
          puVar26 = puVar18;
          unaff_x23 = in_stack_00000230;
          puVar18 = puVar18 + (ulong)bVar7 * 2;
        } while (bVar7);
      }
code_r0x00502a98:
      func_0x0050d2e0(lVar20);
      if ((((uVar11 | uVar15) >> 0x18 & 1) != 0) &&
         (((*(uint *)(lVar20 + 0x10) & 1) == 0 || (*(long *)(lVar20 + 0x20) != 0)))) {
        *(uint *)(lVar20 + 0x250) = *(uint *)(lVar20 + 0x250) | 0x10;
      }
      if (((*(long *)(lVar20 + 0x228) == 0) && (*(int *)(lVar20 + 0x248) == 0x110000)) &&
         (*(long *)(lVar20 + 0x28) == 0)) {
        *(undefined8 *)(lVar20 + 0x28) = 1;
        *(long *)(lVar20 + 0x30) = lVar19;
        lVar19 = lVar19 + 1;
      }
      bVar7 = lVar10 != lVar32 + lVar25 * 600;
      lVar22 = 0;
      if (bVar7) {
        lVar22 = 600;
      }
      lVar22 = lVar10 + lVar22;
      lVar20 = lVar10;
    } while (bVar7);
  }
  func_0x00510488(unaff_x23 + 0x80);
  lVar25 = 0;
  lVar19 = *(long *)(unaff_x23 + 0xa0);
  lVar22 = *(long *)(unaff_x23 + 0xa8) * 0x20;
  do {
    if (lVar22 == lVar25) {
      uVar13 = 0;
      goto code_r0x00502b4c;
    }
    piVar24 = (int *)(lVar19 + lVar25);
    lVar25 = lVar25 + 0x20;
  } while (*piVar24 != 2);
  uVar13 = *(ulong *)(lVar19 + lVar25 + -0x18);
  uVar23 = lVar22 - lVar25;
  if (uVar23 != 0) {
    if ((uVar23 >> 5) - 1 < 7) {
      lVar22 = 0;
    }
    else {
      lVar22 = 0;
      piVar24 = (int *)(lVar19 + lVar25 + 0x80);
      do {
        if (piVar24[-0x20] == 2) {
          uVar16 = *(ulong *)(piVar24 + -0x1e);
          if (*(ulong *)(piVar24 + -0x1e) <= uVar13) {
            uVar16 = uVar13;
          }
          uVar13 = uVar16;
          if (piVar24[-0x18] != 2) goto code_r0x00502c88;
code_r0x00502d04:
          uVar16 = *(ulong *)(piVar24 + -0x16);
          if (*(ulong *)(piVar24 + -0x16) <= uVar13) {
            uVar16 = uVar13;
          }
          if (piVar24[-0x10] != 2) goto code_r0x00502d1c;
code_r0x00502c94:
          uVar13 = *(ulong *)(piVar24 + -0xe);
          if (*(ulong *)(piVar24 + -0xe) <= uVar16) {
            uVar13 = uVar16;
          }
          uVar16 = uVar13;
          if (piVar24[-8] != 2) goto code_r0x00502cac;
code_r0x00502d28:
          uVar13 = *(ulong *)(piVar24 + -6);
          if (*(ulong *)(piVar24 + -6) <= uVar16) {
            uVar13 = uVar16;
          }
          if (*piVar24 != 2) goto code_r0x00502d40;
code_r0x00502cb8:
          uVar16 = *(ulong *)(piVar24 + 2);
          if (*(ulong *)(piVar24 + 2) <= uVar13) {
            uVar16 = uVar13;
          }
          uVar13 = uVar16;
          if (piVar24[8] != 2) goto code_r0x00502cd0;
code_r0x00502d4c:
          uVar16 = *(ulong *)(piVar24 + 10);
          if (*(ulong *)(piVar24 + 10) <= uVar13) {
            uVar16 = uVar13;
          }
          if (piVar24[0x10] != 2) goto code_r0x00502d64;
code_r0x00502cdc:
          uVar1 = *(ulong *)(piVar24 + 0x12);
          if (*(ulong *)(piVar24 + 0x12) <= uVar16) {
            uVar1 = uVar16;
          }
          iVar8 = piVar24[0x18];
        }
        else {
          uVar16 = uVar13;
          if (piVar24[-0x18] == 2) goto code_r0x00502d04;
code_r0x00502c88:
          if (piVar24[-0x10] == 2) goto code_r0x00502c94;
code_r0x00502d1c:
          uVar13 = uVar16;
          if (piVar24[-8] == 2) goto code_r0x00502d28;
code_r0x00502cac:
          if (*piVar24 == 2) goto code_r0x00502cb8;
code_r0x00502d40:
          uVar16 = uVar13;
          if (piVar24[8] == 2) goto code_r0x00502d4c;
code_r0x00502cd0:
          if (piVar24[0x10] == 2) goto code_r0x00502cdc;
code_r0x00502d64:
          iVar8 = piVar24[0x18];
          uVar1 = uVar16;
        }
        uVar13 = uVar1;
        if ((iVar8 == 2) &&
           (uVar13 = *(ulong *)(piVar24 + 0x1a), *(ulong *)(piVar24 + 0x1a) <= uVar1)) {
          uVar13 = uVar1;
        }
        piVar24 = piVar24 + 0x40;
        lVar22 = lVar22 + -8;
      } while (-lVar22 != (uVar23 >> 8) * 8);
      lVar22 = -lVar22;
    }
    if ((uVar23 >> 5 & 7) != 0) {
      lVar22 = lVar22 << 5;
      uVar23 = uVar23 & 0xe0;
      uVar16 = uVar13;
      do {
        uVar13 = uVar16;
        if ((*(int *)(lVar19 + lVar22 + lVar25) == 2) &&
           (uVar13 = *(ulong *)(lVar19 + lVar22 + lVar25 + 8), uVar13 <= uVar16)) {
          uVar13 = uVar16;
        }
        lVar22 = lVar22 + 0x20;
        uVar23 = uVar23 - 0x20;
        uVar16 = uVar13;
      } while (uVar23 != 0);
    }
  }
code_r0x00502b4c:
  uVar11 = *(uint *)(unaff_x23 + 700);
  lVar25 = *(long *)(unaff_x23 + 0x90);
  if (lVar25 != 0) {
    lVar19 = 0;
    uVar11 = uVar11 | *(uint *)(unaff_x23 + 0x2c0);
    lVar22 = *(long *)(unaff_x23 + 0x88);
    do {
      if (((uVar11 >> 1 & 1) != 0) &&
         ((lVar20 = lVar22 + lVar19, (*(uint *)(lVar20 + 0x10) & 1) == 0 ||
          (*(long *)(lVar20 + 0x20) != 0)))) {
        *(uint *)(lVar20 + 0x250) = *(uint *)(lVar20 + 0x250) | 0x20;
      }
      if (((uVar11 >> 2 & 1) != 0) &&
         ((lVar20 = lVar22 + lVar19, (*(uint *)(lVar20 + 0x10) & 1) == 0 ||
          (*(long *)(lVar20 + 0x20) != 0)))) {
        *(uint *)(lVar20 + 0x250) = *(uint *)(lVar20 + 0x250) | 0x40;
      }
      if (((uVar11 >> 5 & 1) != 0) &&
         (lVar20 = lVar22 + lVar19,
         *(int *)(lVar20 + 0x28) == 1 && *(ulong *)(lVar20 + 0x30) == uVar13)) {
        *(uint *)(lVar20 + 0x250) = *(uint *)(lVar20 + 0x250) | 0x200;
      }
      lVar19 = lVar19 + 600;
    } while (lVar25 * 600 != lVar19);
    uVar11 = *in_stack_00000028;
  }
  *in_stack_00000028 = uVar11 | 0x40000000;
  return;
}

