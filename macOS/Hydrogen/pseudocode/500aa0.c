
/* WARNING: Removing unreachable block (ram,0x00503028) */
/* WARNING: Removing unreachable block (ram,0x00503418) */
/* WARNING: Type propagation algorithm not settling */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_00500aa0(undefined1 param_1 [16])

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
  uint uVar14;
  ulong uVar15;
  undefined8 *puVar16;
  undefined8 *puVar17;
  long lVar18;
  long lVar19;
  undefined8 *puVar20;
  long lVar21;
  ulong uVar22;
  long in_x13;
  int *piVar23;
  long lVar24;
  undefined8 *puVar25;
  undefined8 uVar26;
  undefined8 uVar27;
  long unaff_x20;
  long lVar28;
  undefined8 uVar29;
  undefined8 uVar30;
  long lVar31;
  long *plVar32;
  long lVar33;
  undefined8 uVar34;
  undefined8 uVar35;
  undefined8 uVar36;
  undefined8 uStack0000000000000000;
  undefined8 uStack0000000000000008;
  uint uStack0000000000000014;
  uint *in_stack_00000028;
  uint in_stack_00000220;
  long in_stack_00000230;
  undefined8 in_stack_00000250;
  undefined8 in_stack_00000258;
  long in_stack_00000fd8;
  undefined8 in_stack_00000fe0;
  long in_stack_000010f8;
  long in_stack_00001100;
  uint6 in_stack_0000114a;
  long in_stack_000011a0;
  long in_stack_000011a8;
  long in_stack_000011b0;
  long in_stack_000012f0;
  undefined8 in_stack_000012f8;
  undefined1 auStack_7ffffffe [2147483646];
  
  *(long *)(unaff_x20 + 0x1e8) = param_1._8_8_;
  *(long *)(unaff_x20 + 0x1e0) = param_1._0_8_;
  *(undefined8 *)(unaff_x20 + 0x1f8) = in_stack_00000258;
  *(undefined8 *)(unaff_x20 + 0x1f0) = in_stack_00000250;
  *(undefined8 *)(in_x13 + 0xe30) = 0;
  *(undefined8 *)(in_x13 + 0xe38) = 1;
  *(undefined8 *)(in_x13 + 0xe40) = 0;
  func_0x007a5594(auStack_7ffffffe + 0x800010ee,0,0x23,1,1);
  puVar9 = (undefined8 *)(in_stack_000010f8 + in_stack_00001100);
  *(undefined4 *)((long)puVar9 + 0x1f) = 0x2927706c;
  uVar27 = _UNK_008a4637;
  uVar29 = _UNK_008a462f;
  uVar26 = _UNK_008a461f;
  puVar9[1] = _UNK_008a4627;
  *puVar9 = uVar26;
  puVar9[3] = uVar27;
  puVar9[2] = uVar29;
  _memcpy(auStack_7ffffffe + 0x800010ee,auStack_7ffffffe + 0x800013be,600);
  func_0x007a5594(auStack_7ffffffe + 0x800013be,0,0x24,1,1);
  segment_command_00000020._1_4_ = 0x2927682d;
  MACH_HEADER._9_5_ = SUB85(_UNK_008a464a,0);
  MACH_HEADER.filetype._2_2_ = (undefined2)((ulong)_UNK_008a464a >> 0x28);
  MACH_HEADER.ncmds._0_1_ = (undefined1)((ulong)_UNK_008a464a >> 0x38);
  MACH_HEADER._1_5_ = SUB85(_UNK_008a4642,0);
  MACH_HEADER.cputype._2_2_ = (undefined2)((ulong)_UNK_008a4642 >> 0x28);
  MACH_HEADER.cpusubtype._0_1_ = (undefined1)((ulong)_UNK_008a4642 >> 0x38);
  ram0x00000019 = _UNK_008a465a;
  MACH_HEADER._17_7_ = SUB87(_UNK_008a4652,0);
  MACH_HEADER.flags._0_1_ = (undefined1)((ulong)_UNK_008a4652 >> 0x38);
  uVar13 = 0x24;
  if ((in_stack_000012f0 != -0x8000000000000000) && (in_stack_000012f0 != 0)) {
    func_0x00187bd4(in_stack_000012f8,in_stack_000012f0,1);
  }
  lVar24 = *(long *)(in_stack_00000230 + 0x90);
  if (lVar24 == *(long *)(in_stack_00000230 + 0x80)) {
    func_0x0050c440((long *)(in_stack_00000230 + 0x80),&UNK_009e93a0);
  }
  _memcpy(*(long *)(in_stack_00000230 + 0x88) + lVar24 * 600,auStack_7ffffffe + 0x800013be,600);
  *(long *)(in_stack_00000230 + 0x90) = lVar24 + 1;
  uVar11 = *(uint *)(in_stack_00000230 + 700);
  uVar14 = *(uint *)(in_stack_00000230 + 0x2c0);
  if ((((uVar11 | uVar14) >> 0x15 & 1) == 0) &&
     (*(long *)(in_stack_00000230 + 0x260) != 0 || *(long *)(in_stack_00000230 + 0x270) != 0)) {
    func_0x007a5594(auStack_7ffffffe + 0x800010ee,0,0xd,1,1);
    MACH_HEADER._1_5_ = _UNK_008a466d;
    MACH_HEADER.cputype._2_2_ = (undefined2)_UNK_008a4672;
    MACH_HEADER.cpusubtype._0_1_ = (undefined1)((uint3)_UNK_008a4672 >> 0x10);
    MACH_HEADER._9_5_ = _UNK_008a4675;
    uVar13 = 0xd;
    _memcpy(auStack_7ffffffe + 0x8000031e,auStack_7ffffffe + 0x800013be,600);
    lVar24 = *(long *)(in_stack_00000230 + 0x90);
    if (lVar24 == *(long *)(in_stack_00000230 + 0x80)) {
      func_0x0050c440((long *)(in_stack_00000230 + 0x80),&UNK_009e93a0);
    }
    _memcpy(*(long *)(in_stack_00000230 + 0x88) + lVar24 * 600,auStack_7ffffffe + 0x8000031e,600);
    *(long *)(in_stack_00000230 + 0x90) = lVar24 + 1;
    uVar11 = *(uint *)(in_stack_00000230 + 700);
    uVar14 = *(uint *)(in_stack_00000230 + 0x2c0);
  }
  if ((uVar11 >> 0x14 & 1) == 0) {
    if ((uVar14 >> 0x14 & 1) == 0) {
      if ((in_stack_00000220 & 1) == 0) {
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
        func_0x007a5488(auStack_7ffffffe + 0x80000b1e,auStack_7ffffffe + 0x800013be);
        func_0x004fe658(auStack_7ffffffe + 0x8000084e,auStack_7ffffffe + 0x80000b1e,
                        *(long *)(in_stack_00000230 + 0xb8),
                        *(long *)(in_stack_00000230 + 0xb8) +
                        *(long *)(in_stack_00000230 + 0xc0) * 0x2c8);
        func_0x007a5488(auStack_7ffffffe + 0x80000dee,auStack_7ffffffe + 0x800013be);
        _memcpy(auStack_7ffffffe + 0x800010ee,auStack_7ffffffe + 0x8000084e,0x2c8);
        _memcpy(auStack_7ffffffe + 0x800013ce,auStack_7ffffffe + 0x80000dfe,0x2b8);
        if (in_stack_000011b0 == in_stack_000011a0) {
          func_0x0050c5c4(auStack_7ffffffe + 0x8000119e,&UNK_009e8978);
        }
        puVar9 = (undefined8 *)(in_stack_000011a8 + in_stack_000011b0 * 0x2c8);
        *puVar9 = 1;
        puVar9[1] = uVar13;
        _memcpy(puVar9 + 2,auStack_7ffffffe + 0x80000dfe,0x2b8);
        _memcpy(auStack_7ffffffe + 0x8000057e,auStack_7ffffffe + 0x800010ee,0x2c8);
      }
      func_0x005166fc(auStack_7ffffffe + 0x8000065e,in_stack_00000230 + 0xe0);
      _memcpy(auStack_7ffffffe + 0x800013be,auStack_7ffffffe + 0x8000057e,0x2c8);
      lVar24 = *(long *)(in_stack_00000230 + 0xc0);
      if (lVar24 == *(long *)(in_stack_00000230 + 0xb0)) {
        func_0x0050c5c4(in_stack_00000230 + 0xb0,&UNK_009e8b00);
      }
      _memcpy(*(long *)(in_stack_00000230 + 0xb8) + lVar24 * 0x2c8,auStack_7ffffffe + 0x800013be,
              0x2c8);
      *(long *)(in_stack_00000230 + 0xc0) = lVar24 + 1;
      uVar11 = *(uint *)(in_stack_00000230 + 700);
      uVar14 = *(uint *)(in_stack_00000230 + 0x2c0);
      uStack0000000000000014 = (uint)((uVar11 & 0x100000) == 0);
      lVar24 = *(long *)(in_stack_00000230 + 0xc0);
    }
    else {
      uStack0000000000000014 = 1;
      lVar24 = *(long *)(in_stack_00000230 + 0xc0);
    }
  }
  else {
    uStack0000000000000014 = 0;
    lVar24 = *(long *)(in_stack_00000230 + 0xc0);
  }
  if (lVar24 == 0) {
    lVar24 = *(long *)(in_stack_00000230 + 0x90);
  }
  else {
    lVar18 = *(long *)(in_stack_00000230 + 0xb8);
    lVar19 = lVar18 + lVar24 * 0x2c8;
    lVar24 = *(long *)(in_stack_00000230 + 0x88);
    lVar21 = *(long *)(in_stack_00000230 + 0x90);
    uStack0000000000000008 = 8;
    uStack0000000000000000 = 4;
    do {
      if (*(long *)(lVar18 + 0x238) == 4) {
        uVar11 = (**(uint **)(lVar18 + 0x230) & 0xff00ff00) >> 8 |
                 (**(uint **)(lVar18 + 0x230) & 0xff00ff) << 8;
        uVar3 = uVar11 >> 0x10 | uVar11 << 0x10;
        uVar11 = (uint)(0x68656c70 < uVar3);
        if (uVar3 < 0x68656c70) {
          uVar11 = 0xffffffff;
        }
        uVar3 = 0;
        if (uVar11 == 0 && (uVar14 & 0x100000) == 0) {
          uVar3 = uStack0000000000000014;
        }
        if (uVar3 != 1) goto code_r0x00501514;
      }
      else {
code_r0x00501514:
        lVar31 = lVar24;
code_r0x00501554:
        lVar10 = lVar31;
        if (lVar10 != lVar24 + lVar21 * 600) {
          lVar31 = lVar10 + 600;
          if ((*(byte *)(lVar10 + 0x250) >> 1 & 1) != 0) {
            lVar33 = *(long *)(lVar10 + 0x220);
            if (*(long *)(lVar18 + 0x90) != 0) {
              plVar32 = (long *)(*(long *)(lVar18 + 0x88) + 0x220);
              lVar28 = *(long *)(lVar18 + 0x90) * 600;
              do {
                if ((*plVar32 == lVar33) &&
                   (iVar8 = _memcmp(plVar32[-1],*(undefined8 *)(lVar10 + 0x218),lVar33), iVar8 == 0)
                   ) {
                  goto code_r0x00501554;
                }
                plVar32 = plVar32 + 0x4b;
                lVar28 = lVar28 + -600;
              } while (lVar28 != 0);
            }
            if (*(long *)(lVar10 + 0x1e8) == -0x8000000000000000) {
              if (*(long *)(lVar10 + 0x200) != -0x8000000000000000) goto code_r0x005015e8;
code_r0x00501650:
              uVar13 = *(ulong *)(lVar10 + 0x50);
            }
            else {
              func_0x0045cd08(auStack_7ffffffe + 0x80000dee,lVar10 + 0x1e8);
              if (*(long *)(lVar10 + 0x200) == -0x8000000000000000) goto code_r0x00501650;
code_r0x005015e8:
              func_0x0045cd08(auStack_7ffffffe + 0x800010ee,lVar10 + 0x200);
              uVar13 = *(ulong *)(lVar10 + 0x50);
            }
            if ((uVar13 != 5) && (3 < uVar13)) {
              (**(code **)(*(long *)(lVar10 + 0x60) + 0x38))(*(undefined8 *)(lVar10 + 0x58));
            }
            uVar26 = 0;
            uVar13 = *(ulong *)(lVar10 + 0x78);
            uVar22 = uVar13 * 0x10;
            if ((uVar13 >> 0x3c != 0) || (0x7ffffffffffffff8 < uVar22)) {
code_r0x00503614:
              func_0x007a1f00(uVar26,uVar22,&UNK_009e7fc8);
              goto LAB_005037ac;
            }
            if (uVar22 != 0) {
              puVar25 = *(undefined8 **)(lVar10 + 0x70);
              puVar9 = (undefined8 *)func_0x00187bd0(uVar22,8);
              uVar26 = 8;
              if (puVar9 == (undefined8 *)0x0) goto code_r0x00503614;
              if (uVar13 == 0) goto code_r0x0050178c;
              uVar15 = uVar13 - 1;
              uVar22 = uVar13;
              if (uVar15 <= uVar13) {
                uVar22 = uVar15;
              }
              if (uVar22 < 4) {
code_r0x005016fc:
                lVar33 = 0;
                uVar22 = uVar13;
                puVar17 = puVar25;
              }
              else {
                uVar1 = uVar13;
                if (uVar15 <= uVar13) {
                  uVar1 = uVar15;
                }
                if ((puVar9 < puVar25 + uVar1 * 2 + 2) && (puVar25 < puVar9 + uVar1 * 2 + 2))
                goto code_r0x005016fc;
                uVar15 = uVar22 + 1 & 3;
                uVar1 = 4;
                if (uVar15 != 0) {
                  uVar1 = uVar15;
                }
                lVar33 = (uVar22 + 1) - uVar1;
                uVar22 = uVar13 - lVar33;
                puVar17 = puVar25 + lVar33 * 2;
                puVar20 = puVar9 + 4;
                puVar16 = puVar25 + 4;
                lVar28 = lVar33;
                do {
                  uVar26 = puVar16[-3];
                  uVar29 = puVar16[-2];
                  uVar27 = puVar16[-1];
                  uVar30 = *puVar16;
                  uVar35 = puVar16[1];
                  uVar34 = puVar16[2];
                  uVar36 = puVar16[3];
                  puVar20[-4] = puVar16[-4];
                  puVar20[-3] = uVar26;
                  puVar20[-2] = uVar29;
                  puVar20[-1] = uVar27;
                  *puVar20 = uVar30;
                  puVar20[1] = uVar35;
                  puVar20[2] = uVar34;
                  puVar20[3] = uVar36;
                  puVar20 = puVar20 + 8;
                  puVar16 = puVar16 + 8;
                  lVar28 = lVar28 + -4;
                } while (lVar28 != 0);
              }
              puVar9 = puVar9 + lVar33 * 2 + 1;
              do {
                if (puVar17 == puVar25 + uVar13 * 2) break;
                uVar26 = puVar17[1];
                puVar9[-1] = *puVar17;
                *puVar9 = uVar26;
                puVar9 = puVar9 + 2;
                uVar22 = uVar22 - 1;
                puVar17 = puVar17 + 2;
              } while (uVar22 != 0);
            }
code_r0x0050178c:
            uVar22 = *(ulong *)(lVar10 + 0x90);
            uVar13 = uVar22 * 0x10;
            if (uVar22 >> 0x3c != 0 || 0x7ffffffffffffff8 < uVar13) {
              uStack0000000000000008 = 0;
code_r0x005036ec:
              func_0x007a1f00(uStack0000000000000008,uVar13,&UNK_009e7fc8);
              goto LAB_005037ac;
            }
            if (uVar13 != 0) {
              puVar25 = *(undefined8 **)(lVar10 + 0x88);
              puVar9 = (undefined8 *)func_0x00187bd0(uVar13,8);
              if (puVar9 == (undefined8 *)0x0) goto code_r0x005036ec;
              if (uVar22 == 0) goto code_r0x005018ac;
              uVar15 = uVar22 - 1;
              uVar13 = uVar22;
              if (uVar15 <= uVar22) {
                uVar13 = uVar15;
              }
              if (uVar13 < 4) {
code_r0x00501878:
                lVar33 = 0;
                uVar13 = uVar22;
                puVar17 = puVar25;
              }
              else {
                uVar1 = uVar22;
                if (uVar15 <= uVar22) {
                  uVar1 = uVar15;
                }
                if (puVar9 < puVar25 + uVar1 * 2 + 2 && puVar25 < puVar9 + uVar1 * 2 + 2)
                goto code_r0x00501878;
                uVar15 = uVar13 + 1 & 3;
                uVar1 = 4;
                if (uVar15 != 0) {
                  uVar1 = uVar15;
                }
                lVar33 = (uVar13 + 1) - uVar1;
                uVar13 = uVar22 - lVar33;
                puVar17 = puVar25 + lVar33 * 2;
                puVar20 = puVar9 + 4;
                puVar16 = puVar25 + 4;
                lVar28 = lVar33;
                do {
                  uVar26 = puVar16[-3];
                  uVar29 = puVar16[-2];
                  uVar27 = puVar16[-1];
                  uVar30 = *puVar16;
                  uVar35 = puVar16[1];
                  uVar34 = puVar16[2];
                  uVar36 = puVar16[3];
                  puVar20[-4] = puVar16[-4];
                  puVar20[-3] = uVar26;
                  puVar20[-2] = uVar29;
                  puVar20[-1] = uVar27;
                  *puVar20 = uVar30;
                  puVar20[1] = uVar35;
                  puVar20[2] = uVar34;
                  puVar20[3] = uVar36;
                  puVar20 = puVar20 + 8;
                  puVar16 = puVar16 + 8;
                  lVar28 = lVar28 + -4;
                } while (lVar28 != 0);
              }
              puVar9 = puVar9 + lVar33 * 2 + 1;
              do {
                if (puVar17 == puVar25 + uVar22 * 2) break;
                uVar26 = puVar17[1];
                puVar9[-1] = *puVar17;
                *puVar9 = uVar26;
                puVar9 = puVar9 + 2;
                uVar13 = uVar13 - 1;
                puVar17 = puVar17 + 2;
              } while (uVar13 != 0);
            }
code_r0x005018ac:
            uVar22 = *(ulong *)(lVar10 + 0xa8);
            uVar13 = uVar22 * 0x10;
            if (uVar22 >> 0x3c != 0 || 0x7ffffffffffffff8 < uVar13) {
              uStack0000000000000008 = 0;
code_r0x005036b4:
              func_0x007a1f00(uStack0000000000000008,uVar13,&UNK_009e7fc8);
              goto LAB_005037ac;
            }
            if (uVar13 != 0) {
              puVar25 = *(undefined8 **)(lVar10 + 0xa0);
              puVar9 = (undefined8 *)func_0x00187bd0(uVar13,8);
              if (puVar9 == (undefined8 *)0x0) goto code_r0x005036b4;
              if (uVar22 == 0) goto code_r0x005019d8;
              uVar15 = uVar22 - 1;
              uVar13 = uVar22;
              if (uVar15 <= uVar22) {
                uVar13 = uVar15;
              }
              if (uVar13 < 4) {
code_r0x005019a0:
                lVar33 = 0;
                uVar13 = uVar22;
                puVar17 = puVar25;
              }
              else {
                uVar1 = uVar22;
                if (uVar15 <= uVar22) {
                  uVar1 = uVar15;
                }
                if (puVar9 < puVar25 + uVar1 * 2 + 2 && puVar25 < puVar9 + uVar1 * 2 + 2)
                goto code_r0x005019a0;
                uVar15 = uVar13 + 1 & 3;
                uVar1 = 4;
                if (uVar15 != 0) {
                  uVar1 = uVar15;
                }
                lVar33 = (uVar13 + 1) - uVar1;
                puVar17 = puVar9 + 4;
                puVar20 = puVar25 + 4;
                lVar28 = lVar33;
                do {
                  uVar26 = puVar20[-3];
                  uVar29 = puVar20[-2];
                  uVar27 = puVar20[-1];
                  uVar30 = *puVar20;
                  uVar35 = puVar20[1];
                  uVar34 = puVar20[2];
                  uVar36 = puVar20[3];
                  puVar17[-4] = puVar20[-4];
                  puVar17[-3] = uVar26;
                  puVar17[-2] = uVar29;
                  puVar17[-1] = uVar27;
                  *puVar17 = uVar30;
                  puVar17[1] = uVar35;
                  puVar17[2] = uVar34;
                  puVar17[3] = uVar36;
                  puVar17 = puVar17 + 8;
                  puVar20 = puVar20 + 8;
                  lVar28 = lVar28 + -4;
                } while (lVar28 != 0);
                uVar13 = uVar22 - lVar33;
                puVar17 = puVar25 + lVar33 * 2;
              }
              puVar9 = puVar9 + lVar33 * 2 + 1;
              do {
                if (puVar17 == puVar25 + uVar22 * 2) break;
                uVar26 = puVar17[1];
                puVar9[-1] = *puVar17;
                *puVar9 = uVar26;
                puVar9 = puVar9 + 2;
                uVar13 = uVar13 - 1;
                puVar17 = puVar17 + 2;
              } while (uVar13 != 0);
            }
code_r0x005019d8:
            uVar22 = *(ulong *)(lVar10 + 0xc0);
            uVar13 = uVar22 * 0x20;
            if (uVar22 >> 0x3b != 0 || 0x7ffffffffffffff8 < uVar13) {
              uStack0000000000000008 = 0;
code_r0x00503740:
              func_0x007a1f00(uStack0000000000000008,uVar13,&UNK_009e7fc8);
              goto LAB_005037ac;
            }
            if (uVar13 != 0) {
              puVar25 = *(undefined8 **)(lVar10 + 0xb8);
              puVar9 = (undefined8 *)func_0x00187bd0(uVar13,8);
              if (puVar9 == (undefined8 *)0x0) goto code_r0x00503740;
              if (uVar22 == 0) goto code_r0x00501af4;
              uVar15 = uVar22 - 1;
              uVar13 = uVar22;
              if (uVar15 <= uVar22) {
                uVar13 = uVar15;
              }
              if (uVar13 < 2) {
code_r0x00501ab4:
                uVar13 = 0;
                uVar15 = uVar22;
                puVar17 = puVar25;
              }
              else {
                uVar1 = uVar22;
                if (uVar15 <= uVar22) {
                  uVar1 = uVar15;
                }
                if (puVar9 < puVar25 + uVar1 * 4 + 4 && puVar25 < puVar9 + uVar1 * 4 + 4)
                goto code_r0x00501ab4;
                uVar13 = uVar13 & 0x7fffffffffffffe;
                uVar15 = uVar13;
                puVar17 = puVar25;
                puVar20 = puVar9;
                do {
                  uVar30 = puVar17[5];
                  uVar29 = puVar17[4];
                  uVar27 = puVar17[7];
                  uVar26 = puVar17[6];
                  uVar36 = puVar17[1];
                  uVar35 = puVar17[3];
                  uVar34 = puVar17[2];
                  *puVar20 = *puVar17;
                  puVar20[1] = uVar36;
                  puVar20[2] = uVar34;
                  puVar20[3] = uVar35;
                  puVar20[4] = uVar29;
                  puVar20[5] = uVar30;
                  puVar20[6] = uVar26;
                  puVar20[7] = uVar27;
                  puVar20 = puVar20 + 8;
                  uVar15 = uVar15 - 2;
                  puVar17 = puVar17 + 8;
                } while (uVar15 != 0);
                uVar15 = uVar22 - uVar13;
                puVar17 = puVar25 + uVar13 * 4;
              }
              puVar9 = puVar9 + uVar13 * 4 + 2;
              do {
                if (puVar17 == puVar25 + uVar22 * 4) break;
                uVar27 = *puVar17;
                uVar26 = puVar17[2];
                uVar29 = puVar17[3];
                puVar9[-1] = puVar17[1];
                puVar9[-2] = uVar27;
                *puVar9 = uVar26;
                puVar9[1] = uVar29;
                puVar17 = puVar17 + 4;
                uVar15 = uVar15 - 1;
                puVar9 = puVar9 + 4;
              } while (uVar15 != 0);
            }
code_r0x00501af4:
            uVar22 = *(ulong *)(lVar10 + 0xd8);
            uVar13 = uVar22 * 0x20;
            if (uVar22 >> 0x3b != 0 || 0x7ffffffffffffff8 < uVar13) {
              uStack0000000000000008 = 0;
code_r0x00503708:
              func_0x007a1f00(uStack0000000000000008,uVar13,&UNK_009e7fc8);
              goto LAB_005037ac;
            }
            if (uVar13 != 0) {
              puVar25 = *(undefined8 **)(lVar10 + 0xd0);
              puVar9 = (undefined8 *)func_0x00187bd0(uVar13,8);
              if (puVar9 == (undefined8 *)0x0) goto code_r0x00503708;
              if (uVar22 == 0) goto code_r0x00501c10;
              uVar15 = uVar22 - 1;
              uVar13 = uVar22;
              if (uVar15 <= uVar22) {
                uVar13 = uVar15;
              }
              if (uVar13 < 2) {
code_r0x00501bd0:
                uVar13 = 0;
                uVar15 = uVar22;
                puVar17 = puVar25;
              }
              else {
                uVar1 = uVar22;
                if (uVar15 <= uVar22) {
                  uVar1 = uVar15;
                }
                if (puVar9 < puVar25 + uVar1 * 4 + 4 && puVar25 < puVar9 + uVar1 * 4 + 4)
                goto code_r0x00501bd0;
                uVar13 = uVar13 & 0x7fffffffffffffe;
                uVar15 = uVar13;
                puVar17 = puVar25;
                puVar20 = puVar9;
                do {
                  uVar30 = puVar17[5];
                  uVar29 = puVar17[4];
                  uVar27 = puVar17[7];
                  uVar26 = puVar17[6];
                  uVar36 = puVar17[1];
                  uVar35 = puVar17[3];
                  uVar34 = puVar17[2];
                  *puVar20 = *puVar17;
                  puVar20[1] = uVar36;
                  puVar20[2] = uVar34;
                  puVar20[3] = uVar35;
                  puVar20[4] = uVar29;
                  puVar20[5] = uVar30;
                  puVar20[6] = uVar26;
                  puVar20[7] = uVar27;
                  puVar20 = puVar20 + 8;
                  uVar15 = uVar15 - 2;
                  puVar17 = puVar17 + 8;
                } while (uVar15 != 0);
                uVar15 = uVar22 - uVar13;
                puVar17 = puVar25 + uVar13 * 4;
              }
              puVar9 = puVar9 + uVar13 * 4 + 2;
              do {
                if (puVar17 == puVar25 + uVar22 * 4) break;
                uVar27 = *puVar17;
                uVar26 = puVar17[2];
                uVar29 = puVar17[3];
                puVar9[-1] = puVar17[1];
                puVar9[-2] = uVar27;
                *puVar9 = uVar26;
                puVar9[1] = uVar29;
                puVar17 = puVar17 + 4;
                uVar15 = uVar15 - 1;
                puVar9 = puVar9 + 4;
              } while (uVar15 != 0);
            }
code_r0x00501c10:
            uVar22 = *(ulong *)(lVar10 + 0xf0);
            uVar13 = uVar22 * 0x20;
            if (uVar22 >> 0x3b != 0 || 0x7ffffffffffffff8 < uVar13) {
              uStack0000000000000008 = 0;
code_r0x00503698:
              func_0x007a1f00(uStack0000000000000008,uVar13,&UNK_009e7fc8);
              goto LAB_005037ac;
            }
            if (uVar13 != 0) {
              puVar25 = *(undefined8 **)(lVar10 + 0xe8);
              puVar9 = (undefined8 *)func_0x00187bd0(uVar13,8);
              if (puVar9 == (undefined8 *)0x0) goto code_r0x00503698;
              if (uVar22 == 0) goto code_r0x00501d2c;
              uVar15 = uVar22 - 1;
              uVar13 = uVar22;
              if (uVar15 <= uVar22) {
                uVar13 = uVar15;
              }
              if (uVar13 < 2) {
code_r0x00501cec:
                uVar13 = 0;
                uVar15 = uVar22;
                puVar17 = puVar25;
              }
              else {
                uVar1 = uVar22;
                if (uVar15 <= uVar22) {
                  uVar1 = uVar15;
                }
                if (puVar9 < puVar25 + uVar1 * 4 + 4 && puVar25 < puVar9 + uVar1 * 4 + 4)
                goto code_r0x00501cec;
                uVar13 = uVar13 & 0x7fffffffffffffe;
                uVar15 = uVar13;
                puVar17 = puVar25;
                puVar20 = puVar9;
                do {
                  uVar30 = puVar17[5];
                  uVar29 = puVar17[4];
                  uVar27 = puVar17[7];
                  uVar26 = puVar17[6];
                  uVar36 = puVar17[1];
                  uVar35 = puVar17[3];
                  uVar34 = puVar17[2];
                  *puVar20 = *puVar17;
                  puVar20[1] = uVar36;
                  puVar20[2] = uVar34;
                  puVar20[3] = uVar35;
                  puVar20[4] = uVar29;
                  puVar20[5] = uVar30;
                  puVar20[6] = uVar26;
                  puVar20[7] = uVar27;
                  puVar20 = puVar20 + 8;
                  uVar15 = uVar15 - 2;
                  puVar17 = puVar17 + 8;
                } while (uVar15 != 0);
                uVar15 = uVar22 - uVar13;
                puVar17 = puVar25 + uVar13 * 4;
              }
              puVar9 = puVar9 + uVar13 * 4 + 2;
              do {
                if (puVar17 == puVar25 + uVar22 * 4) break;
                uVar27 = *puVar17;
                uVar26 = puVar17[2];
                uVar29 = puVar17[3];
                puVar9[-1] = puVar17[1];
                puVar9[-2] = uVar27;
                *puVar9 = uVar26;
                puVar9[1] = uVar29;
                puVar17 = puVar17 + 4;
                uVar15 = uVar15 - 1;
                puVar9 = puVar9 + 4;
              } while (uVar15 != 0);
            }
code_r0x00501d2c:
            uVar13 = *(ulong *)(lVar10 + 0x108);
            uVar22 = uVar13 * 0x10;
            if (uVar13 >> 0x3c != 0 || 0x7ffffffffffffff8 < uVar22) {
              uStack0000000000000008 = 0;
code_r0x00503760:
              func_0x007a1f00(uStack0000000000000008,uVar22,&UNK_009e7fc8);
              goto LAB_005037ac;
            }
            if (uVar22 != 0) {
              puVar25 = *(undefined8 **)(lVar10 + 0x100);
              puVar9 = (undefined8 *)func_0x00187bd0(uVar22,8);
              if (puVar9 == (undefined8 *)0x0) goto code_r0x00503760;
              if (uVar13 == 0) goto code_r0x00501e68;
              uVar15 = uVar13 - 1;
              uVar22 = uVar13;
              if (uVar15 <= uVar13) {
                uVar22 = uVar15;
              }
              if (uVar22 < 4) {
code_r0x00501e28:
                lVar33 = 0;
                uVar22 = uVar13;
                puVar17 = puVar25;
              }
              else {
                uVar1 = uVar13;
                if (uVar15 <= uVar13) {
                  uVar1 = uVar15;
                }
                if (puVar9 < puVar25 + uVar1 * 2 + 2 && puVar25 < puVar9 + uVar1 * 2 + 2)
                goto code_r0x00501e28;
                uVar15 = uVar22 + 1 & 3;
                uVar1 = 4;
                if (uVar15 != 0) {
                  uVar1 = uVar15;
                }
                lVar33 = (uVar22 + 1) - uVar1;
                puVar17 = puVar9 + 4;
                puVar20 = puVar25 + 4;
                lVar28 = lVar33;
                do {
                  uVar26 = puVar20[-3];
                  uVar29 = puVar20[-2];
                  uVar27 = puVar20[-1];
                  uVar30 = *puVar20;
                  uVar35 = puVar20[1];
                  uVar34 = puVar20[2];
                  uVar36 = puVar20[3];
                  puVar17[-4] = puVar20[-4];
                  puVar17[-3] = uVar26;
                  puVar17[-2] = uVar29;
                  puVar17[-1] = uVar27;
                  *puVar17 = uVar30;
                  puVar17[1] = uVar35;
                  puVar17[2] = uVar34;
                  puVar17[3] = uVar36;
                  puVar17 = puVar17 + 8;
                  puVar20 = puVar20 + 8;
                  lVar28 = lVar28 + -4;
                } while (lVar28 != 0);
                uVar22 = uVar13 - lVar33;
                puVar17 = puVar25 + lVar33 * 2;
              }
              puVar9 = puVar9 + lVar33 * 2 + 1;
              do {
                if (puVar17 == puVar25 + uVar13 * 2) break;
                uVar26 = puVar17[1];
                puVar9[-1] = *puVar17;
                *puVar9 = uVar26;
                puVar9 = puVar9 + 2;
                uVar22 = uVar22 - 1;
                puVar17 = puVar17 + 2;
              } while (uVar22 != 0);
            }
code_r0x00501e68:
            uVar22 = *(ulong *)(lVar10 + 0x120);
            uVar13 = uVar22 * 0x10;
            if (uVar22 >> 0x3c != 0 || 0x7ffffffffffffff8 < uVar13) {
              uStack0000000000000008 = 0;
code_r0x005036d0:
              func_0x007a1f00(uStack0000000000000008,uVar13,&UNK_009e7fc8);
              goto LAB_005037ac;
            }
            if (uVar13 != 0) {
              puVar25 = *(undefined8 **)(lVar10 + 0x118);
              puVar9 = (undefined8 *)func_0x00187bd0(uVar13,8);
              if (puVar9 == (undefined8 *)0x0) goto code_r0x005036d0;
              if (uVar22 == 0) goto code_r0x00501f98;
              uVar15 = uVar22 - 1;
              uVar13 = uVar22;
              if (uVar15 <= uVar22) {
                uVar13 = uVar15;
              }
              if (uVar13 < 4) {
code_r0x00501f60:
                lVar33 = 0;
                uVar13 = uVar22;
                puVar17 = puVar25;
              }
              else {
                uVar1 = uVar22;
                if (uVar15 <= uVar22) {
                  uVar1 = uVar15;
                }
                if (puVar9 < puVar25 + uVar1 * 2 + 2 && puVar25 < puVar9 + uVar1 * 2 + 2)
                goto code_r0x00501f60;
                uVar15 = uVar13 + 1 & 3;
                uVar1 = 4;
                if (uVar15 != 0) {
                  uVar1 = uVar15;
                }
                lVar33 = (uVar13 + 1) - uVar1;
                puVar17 = puVar9 + 4;
                puVar20 = puVar25 + 4;
                lVar28 = lVar33;
                do {
                  uVar26 = puVar20[-3];
                  uVar29 = puVar20[-2];
                  uVar27 = puVar20[-1];
                  uVar30 = *puVar20;
                  uVar35 = puVar20[1];
                  uVar34 = puVar20[2];
                  uVar36 = puVar20[3];
                  puVar17[-4] = puVar20[-4];
                  puVar17[-3] = uVar26;
                  puVar17[-2] = uVar29;
                  puVar17[-1] = uVar27;
                  *puVar17 = uVar30;
                  puVar17[1] = uVar35;
                  puVar17[2] = uVar34;
                  puVar17[3] = uVar36;
                  puVar17 = puVar17 + 8;
                  puVar20 = puVar20 + 8;
                  lVar28 = lVar28 + -4;
                } while (lVar28 != 0);
                uVar13 = uVar22 - lVar33;
                puVar17 = puVar25 + lVar33 * 2;
              }
              puVar9 = puVar9 + lVar33 * 2 + 1;
              do {
                if (puVar17 == puVar25 + uVar22 * 2) break;
                uVar26 = puVar17[1];
                puVar9[-1] = *puVar17;
                *puVar9 = uVar26;
                puVar9 = puVar9 + 2;
                uVar13 = uVar13 - 1;
                puVar17 = puVar17 + 2;
              } while (uVar13 != 0);
            }
code_r0x00501f98:
            uVar26 = 0;
            uVar22 = *(ulong *)(lVar10 + 0x138);
            auVar4._8_8_ = 0;
            auVar4._0_8_ = uVar22;
            uVar13 = uVar22 * 0x18;
            if ((SUB168(auVar4 * ZEXT816(0x18),8) != 0) || (0x7ffffffffffffff8 < uVar13)) {
code_r0x0050364c:
              func_0x007a1f00(uVar26,uVar13,&UNK_009e7fc8);
              goto LAB_005037ac;
            }
            if (uVar13 != 0) {
              puVar9 = *(undefined8 **)(lVar10 + 0x130);
              lVar33 = func_0x00187bd0(uVar13,8);
              uVar26 = 8;
              if (lVar33 == 0) goto code_r0x0050364c;
              if (uVar22 != 0) {
                puVar12 = (undefined1 *)(lVar33 + 0x10);
                do {
                  if (uVar13 == 0) break;
                  uVar26 = *puVar9;
                  uVar29 = puVar9[1];
                  uVar2 = *(undefined1 *)(puVar9 + 2);
                  puVar9 = puVar9 + 3;
                  *(undefined8 *)(puVar12 + -0x10) = uVar26;
                  *(undefined8 *)(puVar12 + -8) = uVar29;
                  *puVar12 = uVar2;
                  uVar13 = uVar13 - 0x18;
                  uVar22 = uVar22 - 1;
                  puVar12 = puVar12 + 0x18;
                } while (uVar22 != 0);
              }
            }
            uVar13 = *(ulong *)(lVar10 + 0x150) * 8;
            if (*(ulong *)(lVar10 + 0x150) >> 0x3d != 0 || 0x7ffffffffffffffc < uVar13) {
              uStack0000000000000000 = 0;
code_r0x00503724:
              func_0x007a1f00(uStack0000000000000000,uVar13,&UNK_009e7fe0);
              goto LAB_005037ac;
            }
            uVar26 = *(undefined8 *)(lVar10 + 0x148);
            if (uVar13 == 0) {
              lVar33 = 4;
            }
            else {
              lVar33 = func_0x00187bd0(uVar13,4);
              if (lVar33 == 0) goto code_r0x00503724;
            }
            _memcpy(lVar33,uVar26,uVar13);
            uVar26 = 0;
            uVar22 = *(ulong *)(lVar10 + 0x168);
            uVar13 = uVar22 * 0x10;
            if ((uVar22 >> 0x3c != 0) || (0x7ffffffffffffff8 < uVar13)) {
code_r0x0050363c:
              func_0x007a1f00(uVar26,uVar13,&UNK_009e7fc8);
              goto LAB_005037ac;
            }
            if (uVar13 != 0) {
              puVar25 = *(undefined8 **)(lVar10 + 0x160);
              puVar9 = (undefined8 *)func_0x00187bd0(uVar13,8);
              uVar26 = 8;
              if (puVar9 == (undefined8 *)0x0) goto code_r0x0050363c;
              if (uVar22 == 0) goto code_r0x00502208;
              uVar15 = uVar22 - 1;
              uVar13 = uVar22;
              if (uVar15 <= uVar22) {
                uVar13 = uVar15;
              }
              if (uVar13 < 4) {
code_r0x00502170:
                lVar33 = 0;
                uVar13 = uVar22;
                puVar17 = puVar25;
              }
              else {
                uVar1 = uVar22;
                if (uVar15 <= uVar22) {
                  uVar1 = uVar15;
                }
                if ((puVar9 < puVar25 + uVar1 * 2 + 2) && (puVar25 < puVar9 + uVar1 * 2 + 2))
                goto code_r0x00502170;
                uVar15 = uVar13 + 1 & 3;
                uVar1 = 4;
                if (uVar15 != 0) {
                  uVar1 = uVar15;
                }
                lVar33 = (uVar13 + 1) - uVar1;
                uVar13 = uVar22 - lVar33;
                puVar17 = puVar25 + lVar33 * 2;
                puVar20 = puVar9 + 4;
                puVar16 = puVar25 + 4;
                lVar28 = lVar33;
                do {
                  uVar26 = puVar16[-3];
                  uVar29 = puVar16[-2];
                  uVar27 = puVar16[-1];
                  uVar30 = *puVar16;
                  uVar35 = puVar16[1];
                  uVar34 = puVar16[2];
                  uVar36 = puVar16[3];
                  puVar20[-4] = puVar16[-4];
                  puVar20[-3] = uVar26;
                  puVar20[-2] = uVar29;
                  puVar20[-1] = uVar27;
                  *puVar20 = uVar30;
                  puVar20[1] = uVar35;
                  puVar20[2] = uVar34;
                  puVar20[3] = uVar36;
                  puVar20 = puVar20 + 8;
                  puVar16 = puVar16 + 8;
                  lVar28 = lVar28 + -4;
                } while (lVar28 != 0);
              }
              puVar9 = puVar9 + lVar33 * 2 + 1;
              do {
                if (puVar17 == puVar25 + uVar22 * 2) break;
                uVar26 = puVar17[1];
                puVar9[-1] = *puVar17;
                *puVar9 = uVar26;
                puVar9 = puVar9 + 2;
                uVar13 = uVar13 - 1;
                puVar17 = puVar17 + 2;
              } while (uVar13 != 0);
            }
code_r0x00502208:
            uVar22 = *(ulong *)(lVar10 + 0x180);
            uVar13 = uVar22 * 0x10;
            if (uVar22 >> 0x3c != 0 || 0x7ffffffffffffff8 < uVar13) {
              uStack0000000000000008 = 0;
code_r0x0050367c:
              func_0x007a1f00(uStack0000000000000008,uVar13,&UNK_009e7fc8);
              goto LAB_005037ac;
            }
            if (uVar13 != 0) {
              puVar25 = *(undefined8 **)(lVar10 + 0x178);
              puVar9 = (undefined8 *)func_0x00187bd0(uVar13,8);
              if (puVar9 == (undefined8 *)0x0) goto code_r0x0050367c;
              if (uVar22 == 0) goto code_r0x0050237c;
              uVar15 = uVar22 - 1;
              uVar13 = uVar22;
              if (uVar15 <= uVar22) {
                uVar13 = uVar15;
              }
              if (uVar13 < 4) {
code_r0x005022ec:
                lVar28 = 0;
                uVar13 = uVar22;
                puVar16 = puVar25;
              }
              else {
                uVar1 = uVar22;
                if (uVar15 <= uVar22) {
                  uVar1 = uVar15;
                }
                if ((puVar9 < puVar25 + uVar1 * 2 + 2) && (puVar25 < puVar9 + uVar1 * 2 + 2))
                goto code_r0x005022ec;
                uVar15 = uVar13 + 1 & 3;
                uVar1 = 4;
                if (uVar15 != 0) {
                  uVar1 = uVar15;
                }
                lVar28 = (uVar13 + 1) - uVar1;
                uVar13 = uVar22 - lVar28;
                puVar16 = puVar25 + lVar28 * 2;
                puVar17 = puVar9 + 4;
                puVar20 = puVar25 + 4;
                lVar33 = lVar28;
                do {
                  uVar26 = puVar20[-3];
                  uVar29 = puVar20[-2];
                  uVar27 = puVar20[-1];
                  uVar30 = *puVar20;
                  uVar35 = puVar20[1];
                  uVar34 = puVar20[2];
                  uVar36 = puVar20[3];
                  puVar17[-4] = puVar20[-4];
                  puVar17[-3] = uVar26;
                  puVar17[-2] = uVar29;
                  puVar17[-1] = uVar27;
                  *puVar17 = uVar30;
                  puVar17[1] = uVar35;
                  puVar17[2] = uVar34;
                  puVar17[3] = uVar36;
                  puVar17 = puVar17 + 8;
                  puVar20 = puVar20 + 8;
                  lVar33 = lVar33 + -4;
                } while (lVar33 != 0);
              }
              puVar9 = puVar9 + lVar28 * 2 + 1;
              do {
                if (puVar16 == puVar25 + uVar22 * 2) break;
                uVar26 = puVar16[1];
                puVar9[-1] = *puVar16;
                *puVar9 = uVar26;
                puVar9 = puVar9 + 2;
                uVar13 = uVar13 - 1;
                puVar16 = puVar16 + 2;
              } while (uVar13 != 0);
            }
code_r0x0050237c:
            uVar26 = 0;
            uVar22 = *(ulong *)(lVar10 + 0x198);
            auVar5._8_8_ = 0;
            auVar5._0_8_ = uVar22;
            uVar13 = uVar22 * 0x30;
            if ((SUB168(auVar5 * ZEXT816(0x30),8) != 0) || (0x7ffffffffffffff8 < uVar13)) {
code_r0x00503628:
              func_0x007a1f00(uVar26,uVar13,&UNK_009e7fc8);
              goto LAB_005037ac;
            }
            if (uVar13 != 0) {
              puVar9 = *(undefined8 **)(lVar10 + 400);
              lVar33 = func_0x00187bd0(uVar13,8);
              uVar26 = 8;
              if (lVar33 == 0) goto code_r0x00503628;
              if (uVar22 != 0) {
                puVar25 = (undefined8 *)(lVar33 + 0x18);
                do {
                  if (uVar13 == 0) break;
                  puVar17 = puVar9 + 1;
                  uVar27 = *puVar9;
                  uVar34 = puVar9[3];
                  uVar30 = puVar9[2];
                  uVar26 = puVar9[4];
                  uVar29 = puVar9[5];
                  puVar9 = puVar9 + 6;
                  puVar25[-2] = *puVar17;
                  puVar25[-3] = uVar27;
                  *puVar25 = uVar34;
                  puVar25[-1] = uVar30;
                  puVar25[1] = uVar26;
                  puVar25[2] = uVar29;
                  uVar13 = uVar13 - 0x30;
                  puVar25 = puVar25 + 6;
                  uVar22 = uVar22 - 1;
                } while (uVar22 != 0);
              }
            }
            uVar22 = *(ulong *)(lVar10 + 0x1b0);
            uVar13 = uVar22 * 0x10;
            if (uVar22 >> 0x3c != 0 || 0x7ffffffffffffff8 < uVar13) {
              uStack0000000000000008 = 0;
code_r0x00503798:
              func_0x007a1f00(uStack0000000000000008,uVar13,&UNK_009e7fc8);
              goto LAB_005037ac;
            }
            if (uVar13 != 0) {
              puVar25 = *(undefined8 **)(lVar10 + 0x1a8);
              puVar9 = (undefined8 *)func_0x00187bd0(uVar13,8);
              if (puVar9 == (undefined8 *)0x0) goto code_r0x00503798;
              if (uVar22 == 0) goto code_r0x0050253c;
              uVar15 = uVar22 - 1;
              uVar13 = uVar22;
              if (uVar15 <= uVar22) {
                uVar13 = uVar15;
              }
              if (uVar13 < 4) {
code_r0x00502508:
                lVar33 = 0;
                uVar13 = uVar22;
                puVar17 = puVar25;
              }
              else {
                uVar1 = uVar22;
                if (uVar15 <= uVar22) {
                  uVar1 = uVar15;
                }
                if (puVar9 < puVar25 + uVar1 * 2 + 2 && puVar25 < puVar9 + uVar1 * 2 + 2)
                goto code_r0x00502508;
                uVar15 = uVar13 + 1 & 3;
                uVar1 = 4;
                if (uVar15 != 0) {
                  uVar1 = uVar15;
                }
                lVar33 = (uVar13 + 1) - uVar1;
                uVar13 = uVar22 - lVar33;
                puVar17 = puVar25 + lVar33 * 2;
                puVar20 = puVar9 + 4;
                puVar16 = puVar25 + 4;
                lVar28 = lVar33;
                do {
                  uVar26 = puVar16[-3];
                  uVar29 = puVar16[-2];
                  uVar27 = puVar16[-1];
                  uVar30 = *puVar16;
                  uVar35 = puVar16[1];
                  uVar34 = puVar16[2];
                  uVar36 = puVar16[3];
                  puVar20[-4] = puVar16[-4];
                  puVar20[-3] = uVar26;
                  puVar20[-2] = uVar29;
                  puVar20[-1] = uVar27;
                  *puVar20 = uVar30;
                  puVar20[1] = uVar35;
                  puVar20[2] = uVar34;
                  puVar20[3] = uVar36;
                  puVar20 = puVar20 + 8;
                  puVar16 = puVar16 + 8;
                  lVar28 = lVar28 + -4;
                } while (lVar28 != 0);
              }
              puVar9 = puVar9 + lVar33 * 2 + 1;
              do {
                if (puVar17 == puVar25 + uVar22 * 2) break;
                uVar26 = puVar17[1];
                puVar9[-1] = *puVar17;
                *puVar9 = uVar26;
                puVar9 = puVar9 + 2;
                uVar13 = uVar13 - 1;
                puVar17 = puVar17 + 2;
              } while (uVar13 != 0);
            }
code_r0x0050253c:
            uVar13 = *(ulong *)(lVar10 + 0x1c8) * 0x10;
            if (*(ulong *)(lVar10 + 0x1c8) >> 0x3c != 0 || 0x7ffffffffffffff8 < uVar13) {
              uStack0000000000000008 = 0;
code_r0x0050377c:
              func_0x007a1f00(uStack0000000000000008,uVar13,&UNK_009e7fe0);
              goto LAB_005037ac;
            }
            uVar26 = *(undefined8 *)(lVar10 + 0x1c0);
            if (uVar13 == 0) {
              lVar33 = 8;
            }
            else {
              lVar33 = func_0x00187bd0(uVar13,8);
              if (lVar33 == 0) goto code_r0x0050377c;
            }
            _memcpy(lVar33,uVar26,uVar13);
            uVar26 = 0;
            uVar13 = *(ulong *)(lVar10 + 0x1e0);
            uVar22 = uVar13 * 0x20;
            if ((uVar13 >> 0x3b != 0) || (0x7ffffffffffffff8 < uVar22)) {
LAB_00503660:
              func_0x007a1f00(uVar26,uVar22,&UNK_009e7fc8);
LAB_005037ac:
                    /* WARNING: Does not return */
              pcVar6 = (code *)SoftwareBreakpoint(1,0x5037b0);
              (*pcVar6)();
            }
            if (uVar22 != 0) {
              puVar9 = *(undefined8 **)(lVar10 + 0x1d8);
              lVar10 = func_0x00187bd0(uVar22,8);
              uVar26 = 8;
              if (lVar10 == 0) goto LAB_00503660;
              if (uVar13 != 0) {
                puVar25 = (undefined8 *)(lVar10 + 0x10);
                do {
                  if (uVar22 == 0) break;
                  plVar32 = (long *)*puVar9;
                  lVar10 = *plVar32;
                  *plVar32 = lVar10 + 1;
                  if (lVar10 < 0) goto LAB_005037ac;
                  uVar29 = puVar9[1];
                  uVar27 = puVar9[3];
                  uVar26 = puVar9[2];
                  puVar9 = puVar9 + 4;
                  puVar25[-2] = plVar32;
                  puVar25[-1] = uVar29;
                  puVar25[1] = uVar27;
                  *puVar25 = uVar26;
                  uVar22 = uVar22 - 0x20;
                  uVar13 = uVar13 - 1;
                  puVar25 = puVar25 + 4;
                } while (uVar13 != 0);
              }
            }
            lVar10 = *(long *)(lVar18 + 0x90);
            if (lVar10 == *(long *)(lVar18 + 0x80)) {
              func_0x0050c440(lVar18 + 0x80,&UNK_009e93a0);
            }
            _memcpy(*(long *)(lVar18 + 0x88) + lVar10 * 600,auStack_7ffffffe + 0x800013be,600);
            *(long *)(lVar18 + 0x90) = lVar10 + 1;
          }
          goto code_r0x00501554;
        }
      }
      lVar18 = lVar18 + 0x2c8;
    } while (lVar18 != lVar19);
    uVar11 = *(uint *)(in_stack_00000230 + 700);
    uVar14 = *(uint *)(in_stack_00000230 + 0x2c0);
    lVar24 = *(long *)(in_stack_00000230 + 0x90);
  }
  if (lVar24 != 0) {
    lVar31 = *(long *)(in_stack_00000230 + 0x88);
    lVar18 = 1;
    lVar21 = lVar31 + 600;
    lVar19 = lVar31;
    do {
      lVar10 = lVar21;
      if (*(long *)(lVar19 + 0xa8) != 0) {
        puVar25 = *(undefined8 **)(lVar19 + 0xa0);
        puVar9 = puVar25 + *(long *)(lVar19 + 0xa8) * 2;
        puVar17 = puVar25 + 2;
code_r0x0050294c:
        do {
          if (*(long *)(in_stack_00000230 + 0xd8) != 0) {
            plVar32 = *(long **)(in_stack_00000230 + 0xd0);
            lVar33 = puVar25[1];
            lVar21 = *(long *)(in_stack_00000230 + 0xd8) * 0x60;
            do {
              if ((plVar32[10] == lVar33) &&
                 (iVar8 = _memcmp(plVar32[9],*puVar25,lVar33), iVar8 == 0)) {
                uVar26 = *(undefined8 *)(lVar19 + 0x218);
                uVar29 = *(undefined8 *)(lVar19 + 0x220);
                lVar21 = plVar32[2];
                if (lVar21 == *plVar32) {
                  func_0x0050c0c0(plVar32,&UNK_009e8a18);
                }
                puVar25 = (undefined8 *)(plVar32[1] + lVar21 * 0x10);
                *puVar25 = uVar26;
                puVar25[1] = uVar29;
                plVar32[2] = lVar21 + 1;
                bVar7 = puVar17 != puVar9;
                puVar25 = puVar17;
                puVar17 = puVar17 + (ulong)bVar7 * 2;
                if (bVar7) goto code_r0x0050294c;
                goto code_r0x00502a98;
              }
              plVar32 = plVar32 + 0xc;
              lVar21 = lVar21 + -0x60;
            } while (lVar21 != 0);
          }
          uVar26 = *puVar25;
          uVar29 = puVar25[1];
          uVar27 = *(undefined8 *)(lVar19 + 0x218);
          uVar30 = *(undefined8 *)(lVar19 + 0x220);
          func_0x0050c0c0(auStack_7ffffffe + 0x800010ee,&UNK_009e8a30);
          MACH_HEADER.cpusubtype._0_1_ = (undefined1)uVar27;
          MACH_HEADER._9_5_ = SUB85((ulong)uVar27 >> 8,0);
          MACH_HEADER.filetype._2_2_ = (undefined2)((ulong)uVar27 >> 0x30);
          MACH_HEADER.ncmds._0_1_ = (undefined1)uVar30;
          MACH_HEADER._17_7_ = SUB87((ulong)uVar30 >> 8,0);
          lVar21 = *(long *)(in_stack_00000230 + 0xd8);
          if (lVar21 == *(long *)(in_stack_00000230 + 200)) {
            func_0x0050c500(in_stack_00000230 + 200,&UNK_009e8a48);
          }
          puVar25 = (undefined8 *)(*(long *)(in_stack_00000230 + 0xd0) + lVar21 * 0x60);
          puVar25[5] = 0;
          puVar25[4] = 8;
          puVar25[7] = 8;
          puVar25[6] = 0;
          puVar25[9] = uVar26;
          puVar25[8] = 0;
          puVar25[0xb] = (ulong)in_stack_0000114a << 0x10;
          puVar25[10] = uVar29;
          puVar25[1] = 8;
          *puVar25 = 0;
          puVar25[3] = 0;
          puVar25[2] = 1;
          *(long *)(in_stack_00000230 + 0xd8) = lVar21 + 1;
          bVar7 = puVar17 != puVar9;
          puVar25 = puVar17;
          puVar17 = puVar17 + (ulong)bVar7 * 2;
        } while (bVar7);
      }
code_r0x00502a98:
      func_0x0050d2e0(lVar19);
      if ((((uVar11 | uVar14) >> 0x18 & 1) != 0) &&
         (((*(uint *)(lVar19 + 0x10) & 1) == 0 || (*(long *)(lVar19 + 0x20) != 0)))) {
        *(uint *)(lVar19 + 0x250) = *(uint *)(lVar19 + 0x250) | 0x10;
      }
      if (((*(long *)(lVar19 + 0x228) == 0) && (*(int *)(lVar19 + 0x248) == 0x110000)) &&
         (*(long *)(lVar19 + 0x28) == 0)) {
        *(undefined8 *)(lVar19 + 0x28) = 1;
        *(long *)(lVar19 + 0x30) = lVar18;
        lVar18 = lVar18 + 1;
      }
      bVar7 = lVar10 != lVar31 + lVar24 * 600;
      lVar21 = 0;
      if (bVar7) {
        lVar21 = 600;
      }
      lVar21 = lVar10 + lVar21;
      lVar19 = lVar10;
    } while (bVar7);
  }
  func_0x00510488(in_stack_00000230 + 0x80);
  lVar24 = 0;
  lVar18 = *(long *)(in_stack_00000230 + 0xa0);
  lVar21 = *(long *)(in_stack_00000230 + 0xa8) * 0x20;
  do {
    if (lVar21 == lVar24) {
      uVar13 = 0;
      goto code_r0x00502b4c;
    }
    piVar23 = (int *)(lVar18 + lVar24);
    lVar24 = lVar24 + 0x20;
  } while (*piVar23 != 2);
  uVar13 = *(ulong *)(lVar18 + lVar24 + -0x18);
  uVar22 = lVar21 - lVar24;
  if (uVar22 != 0) {
    if ((uVar22 >> 5) - 1 < 7) {
      lVar21 = 0;
    }
    else {
      lVar21 = 0;
      piVar23 = (int *)(lVar18 + lVar24 + 0x80);
      do {
        if (piVar23[-0x20] == 2) {
          uVar15 = *(ulong *)(piVar23 + -0x1e);
          if (*(ulong *)(piVar23 + -0x1e) <= uVar13) {
            uVar15 = uVar13;
          }
          uVar13 = uVar15;
          if (piVar23[-0x18] != 2) goto code_r0x00502c88;
code_r0x00502d04:
          uVar15 = *(ulong *)(piVar23 + -0x16);
          if (*(ulong *)(piVar23 + -0x16) <= uVar13) {
            uVar15 = uVar13;
          }
          if (piVar23[-0x10] != 2) goto code_r0x00502d1c;
code_r0x00502c94:
          uVar13 = *(ulong *)(piVar23 + -0xe);
          if (*(ulong *)(piVar23 + -0xe) <= uVar15) {
            uVar13 = uVar15;
          }
          uVar15 = uVar13;
          if (piVar23[-8] != 2) goto code_r0x00502cac;
code_r0x00502d28:
          uVar13 = *(ulong *)(piVar23 + -6);
          if (*(ulong *)(piVar23 + -6) <= uVar15) {
            uVar13 = uVar15;
          }
          if (*piVar23 != 2) goto code_r0x00502d40;
code_r0x00502cb8:
          uVar15 = *(ulong *)(piVar23 + 2);
          if (*(ulong *)(piVar23 + 2) <= uVar13) {
            uVar15 = uVar13;
          }
          uVar13 = uVar15;
          if (piVar23[8] != 2) goto code_r0x00502cd0;
code_r0x00502d4c:
          uVar15 = *(ulong *)(piVar23 + 10);
          if (*(ulong *)(piVar23 + 10) <= uVar13) {
            uVar15 = uVar13;
          }
          if (piVar23[0x10] != 2) goto code_r0x00502d64;
code_r0x00502cdc:
          uVar1 = *(ulong *)(piVar23 + 0x12);
          if (*(ulong *)(piVar23 + 0x12) <= uVar15) {
            uVar1 = uVar15;
          }
          iVar8 = piVar23[0x18];
        }
        else {
          uVar15 = uVar13;
          if (piVar23[-0x18] == 2) goto code_r0x00502d04;
code_r0x00502c88:
          if (piVar23[-0x10] == 2) goto code_r0x00502c94;
code_r0x00502d1c:
          uVar13 = uVar15;
          if (piVar23[-8] == 2) goto code_r0x00502d28;
code_r0x00502cac:
          if (*piVar23 == 2) goto code_r0x00502cb8;
code_r0x00502d40:
          uVar15 = uVar13;
          if (piVar23[8] == 2) goto code_r0x00502d4c;
code_r0x00502cd0:
          if (piVar23[0x10] == 2) goto code_r0x00502cdc;
code_r0x00502d64:
          iVar8 = piVar23[0x18];
          uVar1 = uVar15;
        }
        uVar13 = uVar1;
        if ((iVar8 == 2) &&
           (uVar13 = *(ulong *)(piVar23 + 0x1a), *(ulong *)(piVar23 + 0x1a) <= uVar1)) {
          uVar13 = uVar1;
        }
        piVar23 = piVar23 + 0x40;
        lVar21 = lVar21 + -8;
      } while (-lVar21 != (uVar22 >> 8) * 8);
      lVar21 = -lVar21;
    }
    if ((uVar22 >> 5 & 7) != 0) {
      lVar21 = lVar21 << 5;
      uVar22 = uVar22 & 0xe0;
      uVar15 = uVar13;
      do {
        uVar13 = uVar15;
        if ((*(int *)(lVar18 + lVar21 + lVar24) == 2) &&
           (uVar13 = *(ulong *)(lVar18 + lVar21 + lVar24 + 8), uVar13 <= uVar15)) {
          uVar13 = uVar15;
        }
        lVar21 = lVar21 + 0x20;
        uVar22 = uVar22 - 0x20;
        uVar15 = uVar13;
      } while (uVar22 != 0);
    }
  }
code_r0x00502b4c:
  uVar11 = *(uint *)(in_stack_00000230 + 700);
  lVar24 = *(long *)(in_stack_00000230 + 0x90);
  if (lVar24 != 0) {
    lVar18 = 0;
    uVar11 = uVar11 | *(uint *)(in_stack_00000230 + 0x2c0);
    lVar21 = *(long *)(in_stack_00000230 + 0x88);
    do {
      if (((uVar11 >> 1 & 1) != 0) &&
         ((lVar19 = lVar21 + lVar18, (*(uint *)(lVar19 + 0x10) & 1) == 0 ||
          (*(long *)(lVar19 + 0x20) != 0)))) {
        *(uint *)(lVar19 + 0x250) = *(uint *)(lVar19 + 0x250) | 0x20;
      }
      if (((uVar11 >> 2 & 1) != 0) &&
         ((lVar19 = lVar21 + lVar18, (*(uint *)(lVar19 + 0x10) & 1) == 0 ||
          (*(long *)(lVar19 + 0x20) != 0)))) {
        *(uint *)(lVar19 + 0x250) = *(uint *)(lVar19 + 0x250) | 0x40;
      }
      if (((uVar11 >> 5 & 1) != 0) &&
         (lVar19 = lVar21 + lVar18,
         *(int *)(lVar19 + 0x28) == 1 && *(ulong *)(lVar19 + 0x30) == uVar13)) {
        *(uint *)(lVar19 + 0x250) = *(uint *)(lVar19 + 0x250) | 0x200;
      }
      lVar18 = lVar18 + 600;
    } while (lVar24 * 600 != lVar18);
    uVar11 = *in_stack_00000028;
  }
  *in_stack_00000028 = uVar11 | 0x40000000;
  return;
}

