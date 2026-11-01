
/* WARNING: Removing unreachable block (ram,0x00237f48) */
/* WARNING: Removing unreachable block (ram,0x00237f50) */
/* WARNING: Removing unreachable block (ram,0x00237f58) */
/* WARNING: Removing unreachable block (ram,0x00237f68) */
/* WARNING: Removing unreachable block (ram,0x00237f70) */
/* WARNING: Removing unreachable block (ram,0x00238bdc) */
/* WARNING: Removing unreachable block (ram,0x00239640) */
/* WARNING: Removing unreachable block (ram,0x00238ae0) */
/* WARNING: Removing unreachable block (ram,0x00238b8c) */
/* WARNING: Removing unreachable block (ram,0x00238ba4) */
/* WARNING: Removing unreachable block (ram,0x00238bac) */
/* WARNING: Removing unreachable block (ram,0x00238bbc) */
/* WARNING: Removing unreachable block (ram,0x00238bc8) */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_0023869c(long param_1)

{
  undefined2 uVar1;
  undefined1 auVar2 [16];
  uint uVar3;
  long lVar4;
  undefined1 *puVar5;
  undefined8 *puVar6;
  undefined8 *puVar7;
  undefined8 in_x3;
  undefined8 uVar8;
  undefined *puVar9;
  undefined8 uVar10;
  long unaff_x19;
  long lVar11;
  long lVar12;
  code *pcVar13;
  undefined8 unaff_x21;
  undefined8 uVar14;
  long *unaff_x22;
  ulong uVar15;
  ulong uVar16;
  undefined8 *unaff_x24;
  long lVar17;
  long *plVar18;
  long *unaff_x25;
  ulong uVar19;
  long *unaff_x26;
  long *plVar20;
  ulong uVar21;
  uint uVar22;
  long *unaff_x28;
  long unaff_x29;
  undefined8 uVar23;
  undefined8 uVar24;
  undefined8 uVar25;
  undefined8 uVar26;
  undefined8 uVar27;
  undefined8 uVar28;
  undefined8 uVar29;
  undefined8 uVar30;
  undefined8 uVar31;
  undefined8 uVar32;
  undefined8 uVar33;
  undefined8 uVar34;
  undefined8 uVar35;
  undefined8 uVar36;
  undefined8 uVar37;
  undefined8 uVar38;
  undefined8 uVar39;
  undefined8 uVar40;
  undefined8 uVar41;
  undefined1 auVar42 [16];
  undefined1 *puStack0000000000000000;
  undefined8 uStack0000000000000010;
  undefined8 uStack0000000000000048;
  undefined8 in_stack_00000050;
  long *in_stack_00000068;
  long *in_stack_00000070;
  undefined8 *in_stack_00000078;
  long in_stack_00000088;
  undefined8 in_stack_00000090;
  undefined8 *in_stack_00000098;
  undefined8 uStack00000000000000a0;
  undefined8 uStack00000000000001c0;
  long in_stack_000001c8;
  ulong in_stack_000001d0;
  long in_stack_000001d8;
  ulong in_stack_000001e0;
  undefined8 in_stack_000001e8;
  long in_stack_00000298;
  undefined8 in_stack_000002a0;
  long in_stack_000002b0;
  undefined8 in_stack_000002b8;
  long in_stack_000002e0;
  long in_stack_000002e8;
  long in_stack_000002f0;
  long in_stack_00000320;
  undefined8 in_stack_00000328;
  long in_stack_000003a0;
  undefined1 in_stack_000003a8;
  undefined1 uVar43;
  undefined7 in_stack_000003a9;
  undefined7 uVar44;
  undefined1 in_stack_000003b0;
  undefined1 uVar45;
  undefined7 in_stack_000003b1;
  undefined7 uVar46;
  undefined1 in_stack_000003b8;
  undefined1 uVar47;
  undefined7 in_stack_000003b9;
  undefined7 uVar48;
  undefined1 in_stack_000003c0;
  undefined1 in_stack_000003c1;
  undefined2 in_stack_000003c2;
  undefined4 in_stack_000003c4;
  undefined1 in_stack_000003c8;
  undefined7 in_stack_000003c9;
  long in_stack_000003d0;
  long in_stack_000003e0;
  ulong in_stack_000003e8;
  undefined8 in_stack_00000460;
  undefined6 in_stack_0000047a;
  undefined1 auStack_7ffffffe [2147483646];
  
  uStack0000000000000010 = 0;
  puStack0000000000000000 = auStack_7ffffffe + 0x800002ae;
  func_0x00239cfc(auStack_7ffffffe + 0x8000039e,auStack_7ffffffe + 0x8000031e,param_1 + 0x10,in_x3,
                  &uStack00000000000001c0);
  if (in_stack_000003a0 != -0x7fffffffffffffd9) {
    *(ulong *)((long)unaff_x22 + 0x11) = CONCAT17(in_stack_000003b8,in_stack_000003b1);
    *(ulong *)((long)unaff_x22 + 9) = CONCAT17(in_stack_000003b0,in_stack_000003a9);
    *(ulong *)((long)unaff_x22 + 0x21) =
         CONCAT17(in_stack_000003c8,
                  CONCAT43(in_stack_000003c4,CONCAT21(in_stack_000003c2,in_stack_000003c1)));
    *(ulong *)((long)unaff_x22 + 0x19) = CONCAT17(in_stack_000003c0,in_stack_000003b9);
    unaff_x22[6] = in_stack_000003d0;
    unaff_x22[5] = CONCAT71(in_stack_000003c9,in_stack_000003c8);
    *unaff_x22 = in_stack_000003a0;
    *(undefined1 *)(unaff_x22 + 1) = in_stack_000003a8;
    goto joined_r0x00238820;
  }
  uVar14 = 0;
  *(undefined1 *)(unaff_x19 + 0xc9) = in_stack_000003a8;
  lVar17 = *unaff_x28;
  uVar19 = *(ulong *)(lVar17 + 0x10);
  auVar42._8_8_ = 0;
  auVar42._0_8_ = uVar19;
  uVar21 = uVar19 * 0x18;
  if ((SUB168(auVar42 * ZEXT816(0x18),8) != 0) || (0x7ffffffffffffff8 < uVar21)) {
LAB_0023969c:
    func_0x007a1f00(uVar14,uVar21,&UNK_009c8ce8);
    goto code_r0x00239700;
  }
  if (uVar21 == 0) {
    uStack00000000000001c0 = 0;
    in_stack_000001c8 = 8;
  }
  else {
    lVar11 = *(long *)(lVar17 + 8);
    uVar14 = 8;
    lVar4 = func_0x00187bd0(uVar21,8);
    if (lVar4 == 0) goto LAB_0023969c;
    uStack00000000000001c0 = uVar19;
    in_stack_000001c8 = lVar4;
    if (uVar19 != 0) {
      uVar15 = 0;
      plVar18 = (long *)(lVar4 + 8);
      plVar20 = (long *)(lVar11 + 0x10);
      uStack0000000000000048 = 1;
      do {
        if (uVar21 == 0) break;
        if (plVar20[-2] == -0x8000000000000000) {
          lVar4 = plVar20[-1];
          lVar11 = *plVar20;
          lVar12 = -0x8000000000000000;
        }
        else {
          lVar11 = *plVar20;
          if (lVar11 < 0) {
            uStack0000000000000048 = 0;
LAB_00239684:
            func_0x007a1f00(uStack0000000000000048,lVar11,&UNK_009c24c0);
            goto code_r0x00239700;
          }
          lVar12 = plVar20[-1];
          if (lVar11 == 0) {
            lVar4 = 1;
          }
          else {
            lVar4 = func_0x00187bd0(lVar11,1);
            if (lVar4 == 0) goto LAB_00239684;
          }
          _memcpy(lVar4,lVar12,lVar11);
          lVar12 = lVar11;
        }
        uVar15 = uVar15 + 1;
        plVar18[-1] = lVar12;
        *plVar18 = lVar4;
        plVar18[1] = lVar11;
        plVar18 = plVar18 + 3;
        plVar20 = plVar20 + 3;
        uVar21 = uVar21 - 0x18;
      } while (uVar19 != uVar15);
    }
  }
  uVar45 = (undefined1)in_stack_000001c8;
  uVar46 = (undefined7)((ulong)in_stack_000001c8 >> 8);
  uVar43 = (undefined1)uStack00000000000001c0;
  uVar44 = (undefined7)(uStack00000000000001c0 >> 8);
  uVar47 = (undefined1)uVar19;
  uVar48 = (undefined7)(uVar19 >> 8);
  func_0x0024a370(auStack_7ffffffe + 0x8000031e,auStack_7ffffffe + 0x8000039e);
  lVar4 = _UNK_00829680;
  lVar11 = -0x7ffffffffffffffc;
  if (in_stack_000002b0 != 0) {
    uVar43 = (undefined1)_UNK_00829688;
    uVar44 = (undefined7)((ulong)_UNK_00829688 >> 8);
    uVar45 = (undefined1)in_stack_000002b0;
    uVar46 = (undefined7)((ulong)in_stack_000002b0 >> 8);
    uVar47 = (undefined1)in_stack_000002b8;
    uVar48 = (undefined7)((ulong)in_stack_000002b8 >> 8);
    func_0x0024a370(auStack_7ffffffe + 0x8000031e,auStack_7ffffffe + 0x8000039e);
    lVar11 = lVar4;
  }
  lVar4 = *(long *)(lVar17 + 0x30);
  lVar12 = *(long *)(*(long *)(lVar17 + 0x38) + 0x10);
  pcVar13 = *(code **)(*(long *)(lVar17 + 0x38) + 0x20);
  (**(code **)(in_stack_00000088 + 0x20))(auStack_7ffffffe + 0x8000039e,in_stack_00000090);
  lVar17 = CONCAT71(uVar44,uVar43);
  puVar7 = (undefined8 *)CONCAT71(uVar46,uVar45);
  if (lVar11 == -0x7fffffffffffffd9) {
    func_0x001b6ebc(&uStack00000000000001c0);
    uVar14 = *in_stack_00000078;
    uVar8 = in_stack_00000078[3];
    uVar33 = in_stack_00000078[2];
    *(undefined8 *)(unaff_x29 + -0x98) = in_stack_00000078[1];
    *(undefined8 *)(unaff_x29 + -0xa0) = uVar14;
    *(undefined8 *)(unaff_x29 + -0x88) = uVar8;
    *(undefined8 *)(unaff_x29 + -0x90) = uVar33;
    func_0x0079b61c(auStack_7ffffffe + 0x800002fe,0,0x20,1,1);
    MACH_HEADER._9_8_ = *(undefined8 *)(unaff_x29 + -0x98);
    MACH_HEADER._1_8_ = *(undefined8 *)(unaff_x29 + -0xa0);
    register0x00005028 = *(undefined8 *)(unaff_x29 + -0x88);
    MACH_HEADER._17_8_ = *(undefined8 *)(unaff_x29 + -0x90);
    uVar14 = *(undefined8 *)(unaff_x19 + 0xa8);
    uVar8 = *(undefined8 *)(unaff_x19 + 0xc0);
    uVar33 = *(undefined8 *)(unaff_x19 + 0xb8);
    *(undefined8 *)(unaff_x29 + -0x78) = *(undefined8 *)(unaff_x19 + 0xb0);
    *(undefined8 *)(unaff_x29 + -0x80) = uVar14;
    *(undefined8 *)(unaff_x29 + -0x68) = uVar8;
    *(undefined8 *)(unaff_x29 + -0x70) = uVar33;
    segment_command_00000020.segname._1_8_ = *(undefined8 *)(unaff_x29 + -0x78);
    segment_command_00000020._1_8_ = *(undefined8 *)(unaff_x29 + -0x80);
    segment_command_00000020._25_8_ = *(undefined8 *)(unaff_x29 + -0x68);
    segment_command_00000020._17_8_ = *(undefined8 *)(unaff_x29 + -0x70);
    func_0x001b71c8(&uStack00000000000001c0,auStack_7ffffffe + 0x800002fe);
    auVar42 = (*pcVar13)(lVar4 + (lVar12 - 1U & 0xfffffffffffffff0) + 0x10,in_stack_000002a0,
                         in_stack_00000050);
    puVar6 = auVar42._8_8_;
    lVar11 = auVar42._0_8_;
    in_stack_000003d0 = in_stack_000002f0;
    if (lVar11 == 0) {
      puVar6 = (undefined8 *)func_0x00187bd0(0x18,1);
      uVar14 = _UNK_008294c8;
      if (puVar6 == (undefined8 *)0x0) {
        func_0x007a1f00(1,0x18,&UNK_009c8d00);
        goto code_r0x00239700;
      }
      puVar6[1] = _UNK_008294d0;
      *puVar6 = uVar14;
      puVar6[2] = _UNK_008294d8;
      lVar11 = -0x7fffffffffffffe2;
      lVar4 = 0x18;
      if (uStack00000000000001c0 != 0x8000000000000000) {
        if (uStack00000000000001c0 != 0) {
          func_0x00187bd4(in_stack_000001c8,uStack00000000000001c0,1);
        }
        if (in_stack_000001d8 != 0) {
          func_0x00187bd4(in_stack_000001e0,in_stack_000001d8,1);
        }
        in_stack_00000070 = in_stack_00000068;
      }
      if (*in_stack_00000070 != 0) {
        func_0x00187bd4(in_stack_00000070[1],*in_stack_00000070,1);
      }
      if ((code *)*puVar7 != (code *)0x0) {
        (*(code *)*puVar7)(lVar17);
      }
      if (puVar7[1] != 0) {
        func_0x00187bd4(lVar17,puVar7[1],puVar7[2]);
      }
      lVar17 = 0x18;
      puVar7 = puVar6;
    }
    else {
      (*(code *)puVar6[5])(lVar11);
      (*(code *)puVar6[4])(auStack_7ffffffe + 0x8000039e,lVar11,1,0x40);
      in_stack_000003e8 = in_stack_000001e0;
      in_stack_000003e0 = in_stack_000001d8;
      lVar4 = CONCAT71(uVar48,uVar47);
      func_0x0024a370(auStack_7ffffffe + 0x8000031e,auStack_7ffffffe + 0x8000039e);
      if ((code *)*puVar6 != (code *)0x0) {
        (*(code *)*puVar6)(lVar11);
      }
      if (puVar6[1] != 0) {
        func_0x00187bd4(lVar11,puVar6[1],puVar6[2]);
      }
      lVar11 = -0x7fffffffffffffd9;
    }
  }
  else {
    lVar4 = CONCAT71(uVar48,uVar47);
    in_stack_000002e8 = CONCAT71(in_stack_000003c9,in_stack_000003c8);
    in_stack_000002e0 =
         CONCAT44(in_stack_000003c4,
                  CONCAT22(in_stack_000003c2,CONCAT11(in_stack_000003c1,in_stack_000003c0)));
  }
  if (in_stack_00000298 != 0) {
    func_0x00187bd4(in_stack_000002a0,in_stack_00000298 << 2,2);
  }
  if (lVar11 != -0x7fffffffffffffd9) {
    unaff_x22[5] = in_stack_000002e8;
    unaff_x22[4] = in_stack_000002e0;
    unaff_x22[6] = in_stack_000003d0;
    *unaff_x22 = lVar11;
    unaff_x22[1] = lVar17;
    unaff_x22[2] = (long)puVar7;
    unaff_x22[3] = lVar4;
joined_r0x00238820:
    if (in_stack_00000320 != 0) {
      func_0x00187bd4(in_stack_00000328,in_stack_00000320,1);
    }
    if ((in_stack_000003a0 != -0x7fffffffffffffd9) && (in_stack_00000298 != 0)) {
      func_0x00187bd4(in_stack_000002a0,in_stack_00000298 << 2,2);
    }
    if (uStack00000000000000a0 != -0x8000000000000000) {
      func_0x001bf1c4(&uStack00000000000000a0);
    }
    if (*unaff_x26 != 0) {
      func_0x00187bd4(unaff_x26[1],*unaff_x26 << 2,2);
    }
    lVar17 = **(long **)(unaff_x19 + 0x50);
    **(long **)(unaff_x19 + 0x50) = lVar17 + -1;
    LORelease();
    if (lVar17 == 1) {
      DataMemoryBarrier(2,1);
      func_0x001fa1d4();
    }
    func_0x00230538(unaff_x24);
    return;
  }
  lVar11 = *(long *)(*unaff_x25 + 0xa8);
  lVar4 = *(long *)(*unaff_x25 + 0xa0) + (*(long *)(lVar11 + 0x10) - 1U & 0xfffffffffffffff0);
  uVar3 = (**(code **)(lVar11 + 0x20))(lVar4 + 0x10);
  uVar22 = 0;
  if (uVar3 == 0) goto LAB_00238eac;
  (**(code **)(lVar11 + 0x50))(auStack_7ffffffe + 0x800002fe,lVar4 + 0x10);
  auVar42 = (**(code **)(lVar11 + 0x30))(lVar4 + 0x10);
  uVar19 = auVar42._8_8_;
  lVar4 = auVar42._0_8_;
  uVar14 = 0;
  auVar2._8_8_ = 0;
  auVar2._0_8_ = uVar19;
  uVar21 = uVar19 * 0x18;
  if ((SUB168(auVar2 * ZEXT816(0x18),8) == 0) && (uVar21 < 0x7ffffffffffffff9)) {
    if (uVar21 == 0) {
      uVar43 = 8;
      uVar44 = 0;
      uVar15 = 0;
    }
    else {
      uVar14 = 8;
      lVar11 = func_0x00187bd0(uVar21,8);
      if (lVar11 == 0) goto LAB_002396d4;
      uVar43 = (undefined1)lVar11;
      uVar44 = (undefined7)((ulong)lVar11 >> 8);
      uVar15 = uVar19;
      if (uVar19 != 0) {
        uVar16 = 0;
        in_stack_00000068 = (long *)0x1;
        plVar18 = (long *)(lVar11 + 0x10);
        do {
          if (uVar21 == 0) break;
          lVar11 = *(long *)(lVar4 + 0x10);
          if (lVar11 < 0) {
            in_stack_00000068 = (long *)0x0;
LAB_002396bc:
            func_0x007a1f00(in_stack_00000068,lVar11,&UNK_009c24c0);
            goto code_r0x00239700;
          }
          uVar14 = *(undefined8 *)(lVar4 + 8);
          if (lVar11 == 0) {
            lVar12 = 1;
          }
          else {
            lVar12 = func_0x00187bd0(lVar11,1);
            if (lVar12 == 0) goto LAB_002396bc;
          }
          _memcpy(lVar12,uVar14,lVar11);
          uVar16 = uVar16 + 1;
          lVar4 = lVar4 + 0x18;
          plVar18[-2] = lVar11;
          plVar18[-1] = lVar12;
          *plVar18 = lVar11;
          uVar21 = uVar21 - 0x18;
          plVar18 = plVar18 + 3;
        } while (uVar19 != uVar16);
      }
    }
    uStack00000000000001c0 = uVar15;
    in_stack_000001c8 = CONCAT71(uVar44,uVar43);
    in_stack_000001d0 = uVar19;
    puVar5 = (undefined1 *)func_0x00187bd0(4,1);
    in_stack_000003e8 = in_stack_000001d0;
    in_stack_000003e0 = in_stack_000001c8;
    if (puVar5 != (undefined1 *)0x0) {
      *puVar5 = 0;
      puVar5[2] = 7;
      func_0x0024a370(auStack_7ffffffe + 0x8000031e,auStack_7ffffffe + 0x8000039e);
      uVar22 = uVar3;
LAB_00238eac:
      func_0x0024a370(auStack_7ffffffe + 0x8000031e,auStack_7ffffffe + 0x8000039e);
      func_0x00248ae4(*in_stack_00000098,auStack_7ffffffe + 0x8000039e,0);
      if ((uVar22 & 1) == 0) {
        uVar28 = unaff_x24[1];
        uVar23 = *unaff_x24;
        uVar38 = unaff_x24[3];
        uVar34 = unaff_x24[2];
        uVar29 = unaff_x24[5];
        uVar24 = unaff_x24[4];
        uVar8 = unaff_x24[6];
        uVar30 = in_stack_00000078[1];
        uVar25 = *in_stack_00000078;
        uVar39 = in_stack_00000078[3];
        uVar35 = in_stack_00000078[2];
        uVar31 = in_stack_00000078[5];
        uVar26 = in_stack_00000078[4];
        uVar40 = in_stack_00000078[7];
        uVar36 = in_stack_00000078[6];
        uVar32 = *(undefined8 *)(unaff_x19 + 0x68);
        uVar27 = *(undefined8 *)(unaff_x19 + 0x60);
        uVar41 = *(undefined8 *)(unaff_x19 + 0x78);
        uVar37 = *(undefined8 *)(unaff_x19 + 0x70);
        uVar10 = *(undefined8 *)(unaff_x19 + 0x80);
        uVar14 = *(undefined8 *)(unaff_x19 + 0x50);
        uVar33 = *(undefined8 *)(unaff_x19 + 0x58);
        uVar1 = *(undefined2 *)(unaff_x19 + 200);
        puVar6 = (undefined8 *)func_0x0020a620(0xe0);
        puVar6[0x15] = uVar40;
        puVar6[0x14] = uVar36;
        puVar6[0x17] = uVar32;
        puVar6[0x16] = uVar27;
        puVar6[0x19] = uVar41;
        puVar6[0x18] = uVar37;
        puVar6[0x1b] = CONCAT62(in_stack_0000047a,uVar1);
        puVar6[0x1a] = uVar10;
        puVar6[0xd] = puVar7;
        puVar6[0xc] = lVar17;
        puVar6[0xf] = uVar30;
        puVar6[0xe] = uVar25;
        puVar6[0x11] = uVar39;
        puVar6[0x10] = uVar35;
        puVar6[0x13] = uVar31;
        puVar6[0x12] = uVar26;
        puVar6[5] = uVar29;
        puVar6[4] = uVar24;
        puVar6[7] = 0x8000000000000000;
        puVar6[6] = uVar8;
        puVar6[9] = in_stack_000003e8;
        puVar6[8] = in_stack_000003e0;
        puVar6[0xb] = uVar33;
        puVar6[10] = uVar14;
        puVar9 = &UNK_009c9398;
        puVar6[1] = uVar28;
        *puVar6 = uVar23;
        puVar6[3] = uVar38;
        puVar6[2] = uVar34;
      }
      else {
        uVar28 = unaff_x24[1];
        uVar23 = *unaff_x24;
        uVar38 = unaff_x24[3];
        uVar34 = unaff_x24[2];
        uVar29 = unaff_x24[5];
        uVar24 = unaff_x24[4];
        uVar8 = unaff_x24[6];
        uVar30 = in_stack_00000078[1];
        uVar25 = *in_stack_00000078;
        uVar39 = in_stack_00000078[3];
        uVar35 = in_stack_00000078[2];
        uVar31 = in_stack_00000078[5];
        uVar26 = in_stack_00000078[4];
        uVar40 = in_stack_00000078[7];
        uVar36 = in_stack_00000078[6];
        uVar32 = *(undefined8 *)(unaff_x19 + 0x68);
        uVar27 = *(undefined8 *)(unaff_x19 + 0x60);
        uVar41 = *(undefined8 *)(unaff_x19 + 0x78);
        uVar37 = *(undefined8 *)(unaff_x19 + 0x70);
        uVar10 = *(undefined8 *)(unaff_x19 + 0x80);
        uVar14 = *(undefined8 *)(unaff_x19 + 0x50);
        uVar33 = *(undefined8 *)(unaff_x19 + 0x58);
        uVar1 = *(undefined2 *)(unaff_x19 + 200);
        puVar6 = (undefined8 *)func_0x0020a620(200);
        puVar6[0x15] = uVar37;
        puVar6[0x14] = uVar32;
        puVar6[0x17] = uVar10;
        puVar6[0x16] = uVar41;
        puVar6[0x18] = CONCAT62((int6)((ulong)in_stack_00000460 >> 0x10),uVar1);
        puVar6[0xd] = uVar35;
        puVar6[0xc] = uVar30;
        puVar6[0xf] = uVar26;
        puVar6[0xe] = uVar39;
        puVar6[0x11] = uVar36;
        puVar6[0x10] = uVar31;
        puVar6[0x13] = uVar27;
        puVar6[0x12] = uVar40;
        puVar6[5] = uVar29;
        puVar6[4] = uVar24;
        puVar6[7] = uVar14;
        puVar6[6] = uVar8;
        puVar6[9] = lVar17;
        puVar6[8] = uVar33;
        puVar6[0xb] = uVar25;
        puVar6[10] = puVar7;
        puVar9 = &UNK_009c93e0;
        puVar6[1] = uVar28;
        *puVar6 = uVar23;
        puVar6[3] = uVar38;
        puVar6[2] = uVar34;
      }
      unaff_x22[1] = (long)puVar6;
      unaff_x22[2] = (long)puVar9;
      *unaff_x22 = -0x7fffffffffffffd9;
      if (uStack00000000000000a0 != -0x8000000000000000) {
        func_0x001bf1c4(&uStack00000000000000a0);
      }
      if (*unaff_x26 == 0) {
        return;
      }
      func_0x00187bd4(unaff_x21,*unaff_x26 << 2,2);
      return;
    }
    func_0x007a1f18(1,4);
  }
  else {
LAB_002396d4:
    func_0x007a1f00(uVar14,uVar21,&UNK_009c8ce8);
  }
code_r0x00239700:
                    /* WARNING: Does not return */
  pcVar13 = (code *)SoftwareBreakpoint(1,0x239704);
  (*pcVar13)();
}

