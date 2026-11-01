
/* WARNING: Possible PIC construction at 0x001a278c: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x001a2790) */

void FUN_001a253c(undefined8 param_1)

{
  undefined1 *puVar1;
  undefined4 uVar2;
  undefined1 uVar3;
  undefined2 uVar4;
  undefined2 uVar5;
  ushort uVar6;
  ushort uVar7;
  undefined1 auVar8 [16];
  undefined1 auVar9 [16];
  undefined1 auVar10 [16];
  code *pcVar11;
  ulong *puVar12;
  ulong uVar13;
  undefined8 ****ppppuVar14;
  undefined8 ****ppppuVar15;
  long lVar16;
  undefined *puVar17;
  ulong uVar18;
  ulong *extraout_x8;
  ulong *extraout_x8_00;
  ulong *extraout_x8_01;
  long *extraout_x8_02;
  ulong *extraout_x8_03;
  ulong *extraout_x8_04;
  ulong *extraout_x8_05;
  undefined8 *****extraout_x8_06;
  undefined8 *****pppppuVar19;
  undefined8 *puVar20;
  undefined8 extraout_x8_07;
  long lVar21;
  long *plVar22;
  ulong *puVar23;
  ulong uVar24;
  undefined2 *puVar25;
  undefined8 uVar26;
  undefined8 ****unaff_x22;
  undefined8 ****ppppuVar27;
  ulong uVar28;
  ulong uVar29;
  ulong unaff_x24;
  ulong uVar30;
  ulong uVar31;
  byte *pbVar32;
  ulong unaff_x25;
  undefined8 ****unaff_x26;
  undefined8 uVar33;
  undefined *unaff_x27;
  ulong uVar34;
  undefined *unaff_x28;
  long *plVar35;
  undefined8 *****unaff_x29;
  undefined *puVar36;
  undefined8 in_stack_00000000;
  ulong *in_stack_00000008;
  undefined8 ****in_stack_00000010;
  ulong in_stack_00000028;
  undefined8 in_stack_00000038;
  undefined8 in_stack_00000040;
  undefined8 in_stack_00000048;
  undefined8 in_stack_00000050;
  undefined8 ****in_stack_00000058;
  undefined8 uStack0000000000000068;
  undefined8 in_stack_00000080;
  undefined8 in_stack_00000088;
  undefined8 in_stack_00000090;
  undefined8 in_stack_00000098;
  undefined4 uStack00000000000000a0;
  undefined8 uStack00000000000000a4;
  ulong uStack_2e0;
  undefined8 uStack_2d8;
  undefined8 *****pppppuStack_2b0;
  undefined *puStack_2a8;
  undefined8 uStack_298;
  ulong *puStack_290;
  ulong uStack_288;
  ulong uStack_280;
  long ****pppplStack_220;
  undefined *puStack_218;
  undefined8 uStack_210;
  ulong uStack_208;
  ulong uStack_200;
  undefined1 ****ppppuStack_1a0;
  undefined *puStack_198;
  ulong uStack_190;
  undefined8 uStack_188;
  undefined1 ***pppuStack_160;
  undefined *puStack_158;
  undefined1 **ppuStack_120;
  undefined *puStack_118;
  undefined8 uStack_110;
  ulong uStack_108;
  ulong uStack_100;
  undefined1 *puStack_a0;
  undefined *puStack_98;
  undefined8 uStack_88;
  ulong *puStack_80;
  ulong uStack_78;
  ulong uStack_70;
  undefined1 auStack_6 [6];
  
  uVar13 = func_0x00187bd0(param_1,8);
  if (uVar13 != 0) {
    uStack0000000000000068 = unaff_x25;
    if (unaff_x25 != 0) {
      uVar24 = 0;
      uVar29 = 0;
      in_stack_00000000 = 1;
      do {
        if (unaff_x24 == uVar24) break;
        if (*(long *)(unaff_x27 + uVar24) != -0x8000000000000000) {
          unaff_x26 = *(undefined8 *****)(unaff_x27 + uVar24 + 0x10);
          if ((long)unaff_x26 < 0) {
            in_stack_00000000 = 0;
            in_stack_00000010 = in_stack_00000058;
LAB_001a2854:
            func_0x007a1f00(in_stack_00000000,in_stack_00000010,&UNK_009c24c0);
code_r0x001a2868:
                    /* WARNING: Does not return */
            pcVar11 = (code *)SoftwareBreakpoint(1,0x1a286c);
            (*pcVar11)();
          }
          uVar3 = unaff_x27[uVar24 + 0x34];
          uVar6 = *(ushort *)(unaff_x27 + uVar24 + 0x30);
          puVar23 = (ulong *)(ulong)uVar6;
          uVar7 = *(ushort *)(unaff_x27 + uVar24 + 0x32);
          uVar13 = (ulong)uVar7;
          uVar33 = *(undefined8 *)(unaff_x27 + uVar24 + 8);
          if (unaff_x26 == (undefined8 ****)0x0) {
            ppppuVar27 = (undefined8 ****)0x1;
          }
          else {
            ppppuVar27 = (undefined8 ****)func_0x00187bd0(unaff_x26,1);
            if (ppppuVar27 == (undefined8 ****)0x0) {
              in_stack_00000010 = unaff_x26;
              goto LAB_001a2854;
            }
          }
          _memcpy(ppppuVar27,uVar33,unaff_x26);
          uVar33 = 0;
          ppppuVar14 = *(undefined8 *****)(unaff_x27 + uVar24 + 0x28);
          if ((ulong)ppppuVar14 >> 0x3d == 0) {
            uVar34 = (long)ppppuVar14 * 8;
            if (uVar34 < 0x7fffffffffffffff) {
              unaff_x28 = *(undefined **)(unaff_x27 + uVar24 + 0x20);
              if (uVar34 == 0) {
                unaff_x22 = (undefined8 ****)0x0;
                ppppuVar15 = (undefined8 ****)0x2;
              }
              else {
                ppppuVar15 = (undefined8 ****)func_0x00187bd0(uVar34,2);
                if (ppppuVar15 == (undefined8 ****)0x0) {
                  uVar33 = 2;
                  in_stack_00000028 = uVar34;
                  goto LAB_001a283c;
                }
                unaff_x22 = ppppuVar14;
              }
              _memcpy(ppppuVar15,unaff_x28,uVar34);
              *(undefined1 *)((long)unaff_x29 + -0x74) = uVar3;
              *(ushort *)(unaff_x29 + -0xf) = uVar6;
              *(ushort *)((long)unaff_x29 + -0x76) = uVar7;
              unaff_x29[-0x15] = unaff_x26;
              unaff_x29[-0x14] = ppppuVar27;
              unaff_x29[-0x13] = unaff_x26;
              unaff_x29[-0x12] = unaff_x22;
              unaff_x29[-0x11] = ppppuVar15;
              unaff_x29[-0x10] = ppppuVar14;
              if (*(long *)(unaff_x27 + uVar24 + 0x50) != -0x8000000000000000) {
                func_0x0045cd08(unaff_x29 + -0xe);
              }
              pppppuVar19 = unaff_x29 + -0xe;
              puVar17 = unaff_x27 + uVar24 + 0x38;
              puVar36 = (undefined *)0x1a2790;
              puVar12 = (ulong *)register0x00000008;
              goto code_r0x001a310c;
            }
          }
LAB_001a283c:
          func_0x007a1f00(uVar33,in_stack_00000028,&UNK_009c24c0);
          goto code_r0x001a2868;
        }
        ppppuVar27 = *(undefined8 *****)(unaff_x27 + uVar24 + 0x18);
        if ((long)ppppuVar27 < 0) {
          in_stack_00000000 = 0;
          goto LAB_001a2854;
        }
        uVar4 = *(undefined2 *)(unaff_x27 + uVar24 + 0x20);
        uVar5 = *(undefined2 *)(unaff_x27 + uVar24 + 0x22);
        uVar33 = *(undefined8 *)(unaff_x27 + uVar24 + 0x10);
        if (ppppuVar27 == (undefined8 ****)0x0) {
          ppppuVar14 = (undefined8 ****)0x1;
        }
        else {
          ppppuVar14 = (undefined8 ****)func_0x00187bd0(ppppuVar27,1);
          if (ppppuVar14 == (undefined8 ****)0x0) {
            in_stack_00000010 = ppppuVar27;
            goto LAB_001a2854;
          }
        }
        _memcpy(ppppuVar14,uVar33,ppppuVar27);
        puVar20 = (undefined8 *)(uVar13 + uVar24);
        *(undefined8 *)((long)puVar20 + 0x2c) = in_stack_00000088;
        *(undefined8 *)((long)puVar20 + 0x24) = in_stack_00000080;
        uVar29 = uVar29 + 1;
        *puVar20 = 0x8000000000000000;
        puVar20[1] = ppppuVar27;
        puVar20[2] = ppppuVar14;
        puVar20[3] = ppppuVar27;
        *(undefined2 *)(puVar20 + 4) = uVar4;
        *(undefined2 *)((long)puVar20 + 0x22) = uVar5;
        *(undefined8 *)((long)puVar20 + 0x3c) = in_stack_00000098;
        *(undefined8 *)((long)puVar20 + 0x34) = in_stack_00000090;
        puVar20[9] = uStack00000000000000a4;
        puVar20[8] = CONCAT44(uStack00000000000000a0,in_stack_00000098._4_4_);
        puVar20[10] = in_stack_00000050;
        puVar20[0xb] = in_stack_00000040;
        puVar20[0xc] = in_stack_00000038;
        uVar24 = uVar24 + 0x70;
        *(undefined1 *)(puVar20 + 0xd) = in_stack_00000048._4_1_;
        in_stack_00000010 = ppppuVar14;
      } while (unaff_x25 != uVar29);
    }
    in_stack_00000008[1] = uVar13;
    *in_stack_00000008 = uStack0000000000000068;
    in_stack_00000008[2] = unaff_x25;
    return;
  }
  uVar33 = func_0x007a1f00();
  func_0x001a0874(unaff_x29 + -0x15);
  func_0x001a10ac(&uStack0000000000000068);
  uVar33 = __Unwind_Resume(uVar33);
  if (unaff_x26 != (undefined8 ****)0x0) {
    func_0x00187bd4(in_stack_00000058);
    func_0x001a10ac(&uStack0000000000000068);
    uVar33 = __Unwind_Resume(uVar33);
  }
  func_0x001a10ac(&uStack0000000000000068);
  lVar16 = __Unwind_Resume(uVar33);
  puVar1 = auStack_6 + -10;
  uVar29 = *(ulong *)(lVar16 + 0x10);
  uVar13 = uVar29 * 0x20;
  if (uVar29 >> 0x3b == 0 && uVar13 < 0x7ffffffffffffff9) {
    puStack_80 = extraout_x8;
    if (uVar13 == 0) {
      uStack_78 = 0;
      uStack_70 = 8;
code_r0x001a2a18:
      puStack_80[1] = uStack_70;
      *puStack_80 = uStack_78;
      puStack_80[2] = uVar29;
      return;
    }
    unaff_x27 = *(undefined **)(lVar16 + 8);
    uVar33 = 8;
    uStack_70 = func_0x00187bd0(uVar13,8);
    if (uStack_70 != 0) {
      uStack_78 = uVar29;
      if (uVar29 != 0) {
        uVar24 = 0;
        uStack_88 = 1;
        puVar25 = (undefined2 *)(uStack_70 + 0x1a);
        do {
          if (uVar13 == 0) break;
          ppppuVar27 = *(undefined8 *****)(unaff_x27 + 0x10);
          if ((long)ppppuVar27 < 0) {
            uStack_88 = 0;
code_r0x001a2a54:
            func_0x007a1f00(uStack_88,unaff_x22,&UNK_009c24c0);
                    /* WARNING: Does not return */
            pcVar11 = (code *)SoftwareBreakpoint(1,0x1a2a6c);
            (*pcVar11)();
          }
          uVar4 = *(undefined2 *)(unaff_x27 + 0x18);
          uVar5 = *(undefined2 *)(unaff_x27 + 0x1a);
          uVar33 = *(undefined8 *)(unaff_x27 + 8);
          if (ppppuVar27 == (undefined8 ****)0x0) {
            unaff_x22 = (undefined8 ****)0x1;
          }
          else {
            unaff_x22 = (undefined8 ****)func_0x00187bd0(ppppuVar27,1);
            if (unaff_x22 == (undefined8 ****)0x0) {
              unaff_x22 = ppppuVar27;
              goto code_r0x001a2a54;
            }
          }
          unaff_x27 = unaff_x27 + 0x20;
          uVar24 = uVar24 + 1;
          _memcpy(unaff_x22,uVar33,ppppuVar27);
          *(undefined8 *****)(puVar25 + -0xd) = ppppuVar27;
          *(undefined8 *****)(puVar25 + -9) = unaff_x22;
          *(undefined8 *****)(puVar25 + -5) = ppppuVar27;
          uVar13 = uVar13 - 0x20;
          puVar25[-1] = uVar4;
          *puVar25 = uVar5;
          puVar25 = puVar25 + 0x10;
        } while (uVar29 != uVar24);
      }
      goto code_r0x001a2a18;
    }
  }
  else {
    uVar33 = 0;
  }
  uVar33 = func_0x007a1f00(uVar33,uVar13,&UNK_009c24a8);
  func_0x001a0dec(&uStack_78);
  lVar16 = __Unwind_Resume(uVar33);
  puStack_98 = &DAT_001a2a9c;
  uVar33 = 0;
  uVar29 = *(ulong *)(lVar16 + 0x10);
  auVar8._8_8_ = 0;
  auVar8._0_8_ = uVar29;
  uVar13 = uVar29 * 0x18;
  puStack_a0 = puVar1;
  if ((SUB168(auVar8 * ZEXT816(0x18),8) == 0) && (uVar13 < 0x7ffffffffffffff9)) {
    if (uVar13 == 0) {
      uStack_108 = 0;
      uStack_100 = 8;
code_r0x001a2b98:
      extraout_x8_00[1] = uStack_100;
      *extraout_x8_00 = uStack_108;
      extraout_x8_00[2] = uVar29;
      return;
    }
    unaff_x27 = *(undefined **)(lVar16 + 8);
    unaff_x28 = &___rust_no_alloc_shim_is_unstable;
    uVar33 = 8;
    uStack_100 = func_0x00187bd0(uVar13,8);
    if (uStack_100 != 0) {
      uStack_108 = uVar29;
      if (uVar29 != 0) {
        uVar24 = 0;
        uStack_110 = 1;
        puVar20 = (undefined8 *)(uStack_100 + 0x10);
        do {
          if (uVar13 == 0) break;
          ppppuVar27 = *(undefined8 *****)(unaff_x27 + 0x10);
          if ((long)ppppuVar27 < 0) {
            uStack_110 = 0;
code_r0x001a2bd0:
            func_0x007a1f00(uStack_110,unaff_x22,&UNK_009c24c0);
                    /* WARNING: Does not return */
            pcVar11 = (code *)SoftwareBreakpoint(1,0x1a2be8);
            (*pcVar11)();
          }
          uVar33 = *(undefined8 *)(unaff_x27 + 8);
          if (ppppuVar27 == (undefined8 ****)0x0) {
            unaff_x22 = (undefined8 ****)0x1;
          }
          else {
            unaff_x22 = (undefined8 ****)func_0x00187bd0(ppppuVar27,1);
            if (unaff_x22 == (undefined8 ****)0x0) {
              unaff_x22 = ppppuVar27;
              goto code_r0x001a2bd0;
            }
          }
          unaff_x27 = unaff_x27 + 0x18;
          uVar24 = uVar24 + 1;
          _memcpy(unaff_x22,uVar33,ppppuVar27);
          puVar20[-2] = ppppuVar27;
          puVar20[-1] = unaff_x22;
          uVar13 = uVar13 - 0x18;
          *puVar20 = ppppuVar27;
          puVar20 = puVar20 + 3;
        } while (uVar29 != uVar24);
      }
      goto code_r0x001a2b98;
    }
  }
  uVar33 = func_0x007a1f00(uVar33,uVar13,&UNK_009c24a8);
  func_0x0016b01c(&uStack_108);
  lVar16 = __Unwind_Resume(uVar33);
  puStack_118 = &DAT_001a2c14;
  uVar29 = *(ulong *)(lVar16 + 0x10);
  uVar13 = uVar29 * 4;
  ppuStack_120 = &puStack_a0;
  if (uVar29 >> 0x3e == 0 && uVar13 < 0x7fffffffffffffff) {
    uVar26 = *(undefined8 *)(lVar16 + 8);
    if (uVar13 == 0) {
      uVar24 = 0;
      uVar34 = 2;
LAB_001a2c84:
      _memcpy(uVar34,uVar26,uVar13);
      *extraout_x8_01 = uVar24;
      extraout_x8_01[1] = uVar34;
      extraout_x8_01[2] = uVar29;
      return;
    }
    uVar33 = 2;
    uVar34 = func_0x00187bd0(uVar13,2);
    if (uVar34 != 0) {
      uVar24 = uVar29;
      goto LAB_001a2c84;
    }
  }
  else {
    uVar33 = 0;
  }
  lVar16 = func_0x007a1f00(uVar33,uVar13,&UNK_009c24c0);
  puStack_158 = &DAT_001a2cc8;
  lVar21 = *(long *)(lVar16 + 0x10);
  uStack_190 = uVar29;
  uStack_188 = uVar33;
  pppuStack_160 = &ppuStack_120;
  if (lVar21 < 0) {
    uVar33 = 0;
  }
  else {
    uVar26 = *(undefined8 *)(lVar16 + 8);
    if (lVar21 == 0) {
      lVar16 = 1;
code_r0x001a2d1c:
      _memcpy(lVar16,uVar26,lVar21);
      *extraout_x8_02 = lVar21;
      extraout_x8_02[1] = lVar16;
      extraout_x8_02[2] = lVar21;
      return;
    }
    uVar33 = 1;
    lVar16 = func_0x00187bd0(lVar21,1);
    if (lVar16 != 0) {
      goto code_r0x001a2d1c;
    }
  }
  lVar16 = func_0x007a1f00(uVar33,lVar21,&UNK_009c24c0);
  puStack_198 = &DAT_001a2d60;
  uVar26 = 0;
  uVar24 = *(ulong *)(lVar16 + 0x10);
  auVar9._8_8_ = 0;
  auVar9._0_8_ = uVar24;
  uVar13 = uVar24 * 0x18;
  ppppuStack_1a0 = &pppuStack_160;
  if ((SUB168(auVar9 * ZEXT816(0x18),8) == 0) && (uVar13 < 0x7ffffffffffffff9)) {
    if (uVar13 == 0) {
      uStack_208 = 0;
      uStack_200 = 8;
LAB_001a2e5c:
      extraout_x8_03[1] = uStack_200;
      *extraout_x8_03 = uStack_208;
      extraout_x8_03[2] = uVar24;
      return;
    }
    unaff_x27 = *(undefined **)(lVar16 + 8);
    unaff_x28 = &___rust_no_alloc_shim_is_unstable;
    uVar26 = 8;
    uStack_200 = func_0x00187bd0(uVar13,8);
    if (uStack_200 != 0) {
      uStack_208 = uVar24;
      if (uVar24 != 0) {
        uVar29 = 0;
        uStack_210 = 1;
        puVar20 = (undefined8 *)(uStack_200 + 0x10);
        do {
          if (uVar13 == 0) break;
          ppppuVar27 = *(undefined8 *****)(unaff_x27 + 0x10);
          if ((long)ppppuVar27 < 0) {
            uStack_210 = 0;
code_r0x001a2e94:
            func_0x007a1f00(uStack_210,unaff_x22,&UNK_009c24c0);
                    /* WARNING: Does not return */
            pcVar11 = (code *)SoftwareBreakpoint(1,0x1a2eac);
            (*pcVar11)();
          }
          uVar33 = *(undefined8 *)(unaff_x27 + 8);
          if (ppppuVar27 == (undefined8 ****)0x0) {
            unaff_x22 = (undefined8 ****)0x1;
          }
          else {
            unaff_x22 = (undefined8 ****)func_0x00187bd0(ppppuVar27,1);
            if (unaff_x22 == (undefined8 ****)0x0) {
              unaff_x22 = ppppuVar27;
              goto code_r0x001a2e94;
            }
          }
          unaff_x27 = unaff_x27 + 0x18;
          uVar29 = uVar29 + 1;
          _memcpy(unaff_x22,uVar33,ppppuVar27);
          puVar20[-2] = ppppuVar27;
          puVar20[-1] = unaff_x22;
          uVar13 = uVar13 - 0x18;
          *puVar20 = ppppuVar27;
          puVar20 = puVar20 + 3;
        } while (uVar24 != uVar29);
      }
      goto LAB_001a2e5c;
    }
  }
  uVar26 = func_0x007a1f00(uVar26,uVar13,&UNK_009c24a8);
  func_0x0016b01c(&uStack_208);
  lVar16 = __Unwind_Resume(uVar26);
  puStack_218 = &DAT_001a2ed8;
  unaff_x25 = *(ulong *)(lVar16 + 0x10);
  uVar13 = unaff_x25 * 0x20;
  pppplStack_220 = (long ****)&ppppuStack_1a0;
  if (unaff_x25 >> 0x3b == 0 && uVar13 < 0x7ffffffffffffff9) {
    puStack_290 = extraout_x8_04;
    if (uVar13 == 0) {
      uStack_288 = 0;
      uStack_280 = 8;
code_r0x001a2fd4:
      puStack_290[1] = uStack_280;
      *puStack_290 = uStack_288;
      puStack_290[2] = unaff_x25;
      return;
    }
    unaff_x28 = *(undefined **)(lVar16 + 8);
    unaff_x27 = &___rust_no_alloc_shim_is_unstable;
    uVar24 = 8;
    uStack_280 = func_0x00187bd0(uVar13,8);
    if (uStack_280 != 0) {
      uStack_288 = unaff_x25;
      if (unaff_x25 != 0) {
        uVar29 = 0;
        puVar20 = (undefined8 *)(uStack_280 + 0x10);
        uStack_298 = 1;
        do {
          if (uVar13 == 0) break;
          ppppuVar27 = *(undefined8 *****)(unaff_x28 + 0x10);
          if ((long)ppppuVar27 < 0) {
            uStack_298 = 0;
LAB_001a3010:
            func_0x007a1f00(uStack_298,unaff_x22,&UNK_009c24c0);
                    /* WARNING: Does not return */
            pcVar11 = (code *)SoftwareBreakpoint(1,0x1a3028);
            (*pcVar11)();
          }
          uVar33 = *(undefined8 *)(unaff_x28 + 8);
          if (ppppuVar27 == (undefined8 ****)0x0) {
            unaff_x22 = (undefined8 ****)0x1;
          }
          else {
            unaff_x22 = (undefined8 ****)func_0x00187bd0(ppppuVar27,1);
            if (unaff_x22 == (undefined8 ****)0x0) {
              unaff_x22 = ppppuVar27;
              goto LAB_001a3010;
            }
          }
          uVar29 = uVar29 + 1;
          _memcpy(unaff_x22,uVar33,ppppuVar27);
          uVar2 = *(undefined4 *)(unaff_x28 + 0x18);
          puVar20[-2] = ppppuVar27;
          puVar20[-1] = unaff_x22;
          *puVar20 = ppppuVar27;
          *(undefined4 *)(puVar20 + 1) = uVar2;
          uVar13 = uVar13 - 0x20;
          puVar20 = puVar20 + 4;
          unaff_x28 = unaff_x28 + 0x20;
        } while (unaff_x25 != uVar29);
      }
      goto code_r0x001a2fd4;
    }
  }
  else {
    uVar24 = 0;
  }
  uVar26 = func_0x007a1f00(uVar24,uVar13,&UNK_009c24a8);
  func_0x001a0dec(&uStack_288);
  lVar16 = __Unwind_Resume(uVar26);
  puVar12 = &uStack_2e0;
  puStack_2a8 = &DAT_001a3058;
  unaff_x29 = &pppppuStack_2b0;
  unaff_x24 = *(ulong *)(lVar16 + 0x10);
  uVar13 = unaff_x24 * 8;
  uStack_2e0 = uVar29;
  uStack_2d8 = uVar33;
  pppppuStack_2b0 = &pppplStack_220;
  if (unaff_x24 >> 0x3d == 0 && uVar13 < 0x7fffffffffffffff) {
    uVar24 = *(ulong *)(lVar16 + 8);
    if (uVar13 == 0) {
      uVar29 = 0;
      uVar34 = 2;
code_r0x001a30c8:
      _memcpy(uVar34,uVar24,uVar13);
      *extraout_x8_05 = uVar29;
      extraout_x8_05[1] = uVar34;
      extraout_x8_05[2] = unaff_x24;
      return;
    }
    uVar29 = 2;
    uVar34 = func_0x00187bd0(uVar13,2);
    if (uVar34 != 0) {
      uVar29 = unaff_x24;
      goto code_r0x001a30c8;
    }
  }
  else {
    uVar29 = 0;
  }
  puVar36 = &SUB_001a310c;
  puVar17 = (undefined *)func_0x007a1f00(uVar29,uVar13,&UNK_009c24c0);
  pppppuVar19 = extraout_x8_06;
  puVar23 = extraout_x8_05;
code_r0x001a310c:
  *(undefined **)((long)puVar12 + -0x60) = unaff_x28;
  *(undefined **)((long)puVar12 + -0x58) = unaff_x27;
  *(undefined8 *****)((long)puVar12 + -0x50) = unaff_x26;
  *(ulong *)((long)puVar12 + -0x48) = unaff_x25;
  *(ulong *)((long)puVar12 + -0x40) = unaff_x24;
  *(ulong *)((long)puVar12 + -0x38) = uVar29;
  *(undefined8 *****)((long)puVar12 + -0x30) = unaff_x22;
  *(ulong *)((long)puVar12 + -0x28) = uVar24;
  *(ulong **)((long)puVar12 + -0x20) = puVar23;
  *(ulong *)((long)puVar12 + -0x18) = uVar13;
  *(undefined8 ******)((long)puVar12 + -0x10) = unaff_x29;
  *(undefined **)((long)puVar12 + -8) = puVar36;
  uVar13 = *(ulong *)(puVar17 + 0x10);
  uVar34 = uVar13 * 0x20;
  if (uVar13 >> 0x3b == 0 && uVar34 < 0x7ffffffffffffff9) {
    *(undefined8 ******)((long)puVar12 + -0x88) = pppppuVar19;
    if (uVar34 == 0) {
      *(undefined8 *)((long)puVar12 + -0x78) = 0;
      *(undefined8 *)((long)puVar12 + -0x70) = 8;
code_r0x001a3274:
      uVar33 = *(undefined8 *)((long)puVar12 + -0x78);
      puVar20 = *(undefined8 **)((long)puVar12 + -0x88);
      puVar20[1] = *(undefined8 *)((long)puVar12 + -0x70);
      *puVar20 = uVar33;
      puVar20[2] = uVar13;
      return;
    }
    plVar22 = *(long **)(puVar17 + 8);
    uVar33 = 8;
    lVar16 = func_0x00187bd0(uVar34,8);
    if (lVar16 != 0) {
      *(ulong *)((long)puVar12 + -0x78) = uVar13;
      *(long *)((long)puVar12 + -0x70) = lVar16;
      if (uVar13 != 0) {
        uVar28 = 0;
        uVar24 = 0;
        *(undefined8 *)((long)puVar12 + -0x90) = 1;
        *(long *)((long)puVar12 + -0x80) = lVar16;
        plVar35 = plVar22;
        do {
          if (uVar34 == uVar28) break;
          lVar21 = plVar35[3];
          uVar4 = *(undefined2 *)((long)plVar35 + 0x1a);
          if (*plVar35 == -0x8000000000000000) {
            uVar18 = *(ulong *)((long)plVar22 + uVar28 + 8);
            uVar31 = *(ulong *)((long)plVar22 + uVar28 + 0x10);
            uVar30 = 0x8000000000000000;
          }
          else {
            uVar31 = *(ulong *)((long)plVar22 + uVar28 + 0x10);
            if ((long)uVar31 < 0) {
              *(undefined8 *)((long)puVar12 + -0x90) = 0;
code_r0x001a32b4:
              func_0x007a1f00(*(undefined8 *)((long)puVar12 + -0x90),uVar29,&UNK_009c24c0);
                    /* WARNING: Does not return */
              pcVar11 = (code *)SoftwareBreakpoint(1,0x1a32c8);
              (*pcVar11)();
            }
            uVar33 = *(undefined8 *)((long)plVar22 + uVar28 + 8);
            if (uVar31 == 0) {
              uVar18 = 1;
            }
            else {
              uVar18 = func_0x00187bd0(uVar31,1);
              if (uVar18 == 0) {
                uVar29 = uVar31;
                goto code_r0x001a32b4;
              }
            }
            _memcpy(uVar18,uVar33,uVar31);
            lVar16 = *(long *)((long)puVar12 + -0x80);
            uVar29 = uVar18;
            uVar30 = uVar31;
          }
          plVar35 = plVar35 + 4;
          uVar24 = uVar24 + 1;
          puVar23 = (ulong *)(lVar16 + uVar28);
          *puVar23 = uVar30;
          puVar23[1] = uVar18;
          puVar23[2] = uVar31;
          *(short *)(puVar23 + 3) = (short)lVar21;
          uVar28 = uVar28 + 0x20;
          *(undefined2 *)((long)puVar23 + 0x1a) = uVar4;
        } while (uVar13 != uVar24);
      }
      goto code_r0x001a3274;
    }
  }
  else {
    uVar33 = 0;
  }
  uVar26 = func_0x007a1f00(uVar33,uVar34,&UNK_009c24a8);
  *(undefined **)((long)puVar12 + -0x68) = unaff_x27;
  func_0x0016b1dc((undefined1 *)((long)puVar12 + -0x78));
  lVar16 = __Unwind_Resume(uVar26);
  *(undefined **)((long)puVar12 + -0xf0) = unaff_x28;
  *(undefined **)((long)puVar12 + -0xe8) = unaff_x27;
  *(undefined8 *****)((long)puVar12 + -0xe0) = unaff_x26;
  *(ulong *)((long)puVar12 + -0xd8) = uVar34;
  *(ulong *)((long)puVar12 + -0xd0) = unaff_x24;
  *(ulong *)((long)puVar12 + -200) = uVar29;
  *(undefined8 *)((long)puVar12 + -0xc0) = uVar33;
  *(ulong *)((long)puVar12 + -0xb8) = uVar24;
  *(ulong *)((long)puVar12 + -0xb0) = uVar13;
  *(undefined8 *)((long)puVar12 + -0xa8) = uVar26;
  *(undefined1 **)((long)puVar12 + -0xa0) = (undefined1 *)((long)puVar12 + -0x10);
  *(undefined **)((long)puVar12 + -0x98) = &DAT_001a32f8;
  uVar33 = 0;
  uVar24 = *(ulong *)(lVar16 + 0x10);
  auVar10._8_8_ = 0;
  auVar10._0_8_ = uVar24;
  uVar13 = uVar24 * 0x28;
  if ((SUB168(auVar10 * ZEXT816(0x28),8) != 0) || (0x7ffffffffffffff8 < uVar13)) {
code_r0x001a374c:
    func_0x007a1f00(uVar33,uVar13,&UNK_009c24a8);
    *(ulong *)((long)puVar12 + -0x158) = uVar29;
    func_0x007a1f00(*(undefined8 *)((long)puVar12 + -0x150),*(undefined8 *)((long)puVar12 + -0x158),
                    &UNK_009c24c0);
                    /* WARNING: Does not return */
    pcVar11 = (code *)SoftwareBreakpoint(1,0x1a37ac);
    (*pcVar11)();
  }
  *(undefined8 *)((long)puVar12 + -0x140) = extraout_x8_07;
  if (uVar13 == 0) {
    *(undefined8 *)((long)puVar12 + -0x138) = 0;
    *(undefined8 *)((long)puVar12 + -0x130) = 8;
  }
  else {
    pbVar32 = *(byte **)(lVar16 + 8);
    uVar33 = 8;
    lVar16 = func_0x00187bd0(uVar13,8);
    if (lVar16 == 0) goto code_r0x001a374c;
    *(ulong *)((long)puVar12 + -0x138) = uVar24;
    *(long *)((long)puVar12 + -0x130) = lVar16;
    *(undefined8 *)((long)puVar12 + -0x128) = 0;
    if ((uVar24 != 0) && (*(undefined8 *)((long)puVar12 + -0x150) = 1, uVar13 != 0)) {
                    /* WARNING: Could not recover jumptable at 0x001a3424. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*(code *)(&UNK_001a33d8 + (ulong)(byte)(&UNK_0081d4c6)[*pbVar32] * 4))();
      return;
    }
  }
  uVar33 = *(undefined8 *)((long)puVar12 + -0x138);
  puVar20 = *(undefined8 **)((long)puVar12 + -0x140);
  puVar20[1] = *(undefined8 *)((long)puVar12 + -0x130);
  *puVar20 = uVar33;
  puVar20[2] = uVar24;
  return;
}

