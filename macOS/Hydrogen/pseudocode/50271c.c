
/* WARNING: Type propagation algorithm not settling */

void FUN_0050271c(long param_1)

{
  ulong uVar1;
  undefined1 uVar2;
  uint uVar3;
  undefined1 auVar4 [16];
  undefined1 auVar5 [16];
  code *pcVar6;
  bool bVar7;
  int iVar8;
  undefined8 uVar9;
  uint uVar10;
  undefined1 *puVar11;
  long lVar12;
  long lVar13;
  ulong uVar14;
  ulong uVar15;
  undefined8 *puVar16;
  dword *pdVar17;
  long *plVar18;
  undefined1 *in_x10;
  undefined8 *puVar19;
  ulong in_x12;
  ulong in_x14;
  int *piVar20;
  undefined1 *in_x15;
  ulong in_x16;
  dword *in_x17;
  ulong uVar21;
  undefined8 *puVar22;
  undefined8 *puVar23;
  ulong unaff_x19;
  long lVar24;
  undefined8 *puVar25;
  long lVar26;
  ulong unaff_x20;
  long lVar27;
  ulong unaff_x22;
  long lVar28;
  long unaff_x24;
  long lVar29;
  ulong unaff_x26;
  long lVar30;
  long unaff_x28;
  undefined8 uVar31;
  undefined8 uVar32;
  undefined8 uVar33;
  undefined8 uVar34;
  undefined8 uVar35;
  undefined8 uVar36;
  undefined1 auVar37 [16];
  undefined1 auVar38 [16];
  undefined8 in_stack_00000000;
  undefined8 in_stack_00000008;
  int iStack0000000000000010;
  int iStack0000000000000014;
  long in_stack_00000018;
  long in_stack_00000020;
  uint *in_stack_00000028;
  long in_stack_00000078;
  undefined8 *in_stack_00000080;
  long in_stack_00000088;
  undefined8 in_stack_00000090;
  undefined8 in_stack_00000098;
  undefined8 in_stack_000000b0;
  undefined8 in_stack_000000b8;
  undefined8 in_stack_000000c0;
  undefined8 in_stack_000000c8;
  undefined8 in_stack_000000d0;
  undefined8 in_stack_000000d8;
  undefined8 in_stack_000000e0;
  ulong in_stack_000000e8;
  dword *in_stack_000000f0;
  dword *in_stack_000000f8;
  ulong in_stack_00000110;
  long in_stack_00000130;
  ulong in_stack_00000150;
  long in_stack_00000168;
  dword *in_stack_000001a8;
  dword *pdStack00000000000001b0;
  dword *in_stack_000001c0;
  dword *in_stack_000001d0;
  dword *in_stack_000001e0;
  ulong in_stack_000001e8;
  ulong in_stack_000001f0;
  ulong in_stack_000001f8;
  ulong in_stack_00000200;
  ulong in_stack_00000208;
  ulong in_stack_00000210;
  ulong in_stack_00000218;
  long in_stack_00000220;
  long in_stack_00000230;
  undefined8 in_stack_000010f8;
  undefined8 in_stack_00001100;
  uint6 in_stack_0000114a;
  undefined1 auStack_7ffffffe [2147483646];
  
  auVar5._8_8_ = in_stack_00000090;
  auVar5._0_8_ = in_stack_00000098;
  auVar38._8_8_ = in_stack_00001100;
  auVar38._0_8_ = in_stack_000010f8;
  pdStack00000000000001b0 = in_x17;
  do {
    *(dword **)(in_x10 + 0x178) = in_stack_000001a8;
    *(dword **)(in_x10 + 0x1a8) = in_stack_000000f0;
    *(ulong *)(in_x10 + 0x1b0) = unaff_x26;
    *(undefined8 *)(in_x10 + 0x238) = in_stack_000000b8;
    *(undefined8 *)(in_x10 + 0x240) = in_stack_000000b0;
    in_stack_00000080[2] = *(undefined8 *)(in_x15 + 0xb40);
    uVar9 = *(undefined8 *)(in_x15 + 0xb30);
    in_stack_00000080[1] = *(undefined8 *)(in_x15 + 0xb38);
    *in_stack_00000080 = uVar9;
    *(undefined1 (*) [16])(in_x10 + 0x208) = auVar5;
    *(ulong *)(in_x10 + 0x68) = in_stack_00000110;
    *(dword **)(in_x10 + 0x70) = in_stack_000000f8;
    *(ulong *)(in_x10 + 0x78) = in_stack_00000110;
    *(ulong *)(in_x10 + 0x80) = in_x12;
    *(ulong *)(in_x10 + 0x90) = in_x12;
    *(ulong *)(in_x10 + 0x98) = in_stack_00000210;
    *(dword **)(in_x10 + 0xa0) = in_stack_000001e0;
    *(ulong *)(in_x10 + 0xa8) = in_stack_00000210;
    *(ulong *)(in_x10 + 0xb0) = in_stack_00000208;
    *(ulong *)(in_x10 + 0xc0) = in_stack_00000208;
    *(ulong *)(in_x10 + 200) = in_stack_00000200;
    *(dword **)(in_x10 + 0xd0) = in_stack_000001d0;
    *(ulong *)(in_x10 + 0xd8) = in_stack_00000200;
    *(ulong *)(in_x10 + 0xe0) = in_stack_000001f8;
    *(ulong *)(in_x10 + 0xf0) = in_stack_000001f8;
    *(ulong *)(in_x10 + 0xf8) = in_stack_000001f0;
    *(dword **)(in_x10 + 0x100) = in_stack_000001c0;
    *(ulong *)(in_x10 + 0x108) = in_stack_000001f0;
    *(ulong *)(in_x10 + 0x110) = in_stack_000001e8;
    *(ulong *)(in_x10 + 0x120) = in_stack_000001e8;
    *(ulong *)(in_x10 + 0x128) = in_x14;
    *(long *)(in_x10 + 0x130) = in_stack_00000168;
    *(ulong *)(in_x10 + 0x138) = in_x14;
    *(ulong *)(in_x10 + 0x140) = in_x16;
    *(ulong *)(in_x10 + 0x158) = in_stack_00000150;
    *(dword **)(in_x10 + 0x160) = pdStack00000000000001b0;
    *(ulong *)(in_x10 + 0x168) = in_stack_00000150;
    *(ulong *)(in_x10 + 0x170) = in_stack_00000218;
    *(ulong *)(in_x10 + 0x180) = in_stack_00000218;
    *(ulong *)(in_x10 + 0x188) = unaff_x19;
    *(long *)(in_x10 + 400) = in_stack_00000130;
    *(ulong *)(in_x10 + 0x198) = unaff_x19;
    *(ulong *)(in_x10 + 0x1a0) = unaff_x26;
    *(undefined8 *)(in_x10 + 0x28) = in_stack_000000e0;
    *(undefined8 *)(in_x10 + 0x30) = in_stack_000000d8;
    *(undefined8 *)(in_x10 + 0x38) = in_stack_000000d0;
    *(undefined8 *)(in_x10 + 0x40) = in_stack_000000c8;
    *(undefined8 *)(in_x10 + 0x48) = in_stack_000000c0;
    *(ulong *)(in_x10 + 0x1b8) = in_stack_000000e8;
    *(long *)(in_x10 + 0x1c0) = unaff_x24;
    *(ulong *)(in_x10 + 0x1c8) = unaff_x22;
    *(ulong *)(in_x10 + 0x1d0) = unaff_x20;
    *(long *)(in_x10 + 0x1d8) = param_1;
    *(ulong *)(in_x10 + 0x1e0) = unaff_x20;
    lVar24 = *(long *)(in_stack_00000088 + 0x90);
    if (lVar24 == *(long *)(in_stack_00000088 + 0x80)) {
      func_0x0050c440(in_stack_00000088 + 0x80,&UNK_009e93a0);
    }
    auVar37 = _memcpy(*(long *)(in_stack_00000088 + 0x88) + lVar24 * 600,
                      auStack_7ffffffe + 0x800013be,600);
    *(long *)(in_stack_00000088 + 0x90) = lVar24 + 1;
    lVar24 = in_stack_00000088;
code_r0x00501554:
    do {
      while( true ) {
        lVar13 = in_stack_00000220;
        lVar30 = lVar24;
        if (lVar13 != in_stack_00000078) break;
        do {
          lVar24 = lVar30 + 0x2c8;
          if (lVar24 == in_stack_00000020) {
            uVar10 = *(uint *)(in_stack_00000230 + 700);
            uVar3 = *(uint *)(in_stack_00000230 + 0x2c0);
            lVar24 = *(long *)(in_stack_00000230 + 0x90);
            if (lVar24 == 0) goto code_r0x00502aec;
            lVar28 = *(long *)(in_stack_00000230 + 0x88);
            lVar30 = 1;
            lVar13 = lVar28 + 600;
            lVar26 = lVar28;
            goto code_r0x005028dc;
          }
          if (*(long *)(lVar30 + 0x500) != 4) break;
          uVar10 = (**(uint **)(lVar30 + 0x4f8) & 0xff00ff00) >> 8 |
                   (**(uint **)(lVar30 + 0x4f8) & 0xff00ff) << 8;
          uVar3 = uVar10 >> 0x10 | uVar10 << 0x10;
          uVar10 = (uint)(0x68656c70 < uVar3);
          if (uVar3 < 0x68656c70) {
            uVar10 = 0xffffffff;
          }
          iVar8 = 0;
          if (uVar10 == 0 && iStack0000000000000010 == 0) {
            iVar8 = iStack0000000000000014;
          }
          lVar30 = lVar24;
        } while (iVar8 == 1);
        in_stack_00000220 = in_stack_00000018;
        in_stack_00000088 = lVar24;
      }
      in_stack_00000220 = lVar13 + 600;
    } while ((*(byte *)(lVar13 + 0x250) >> 1 & 1) == 0);
    lVar30 = *(long *)(lVar13 + 0x220);
    if (*(long *)(lVar24 + 0x90) != 0) {
      plVar18 = (long *)(*(long *)(lVar24 + 0x88) + 0x220);
      lVar26 = *(long *)(lVar24 + 0x90) * 600;
      while ((*plVar18 != lVar30 ||
             (auVar37 = _memcmp(plVar18[-1],*(undefined8 *)(lVar13 + 0x218),lVar30),
             auVar37._0_4_ != 0))) {
        plVar18 = plVar18 + 0x4b;
        lVar26 = lVar26 + -600;
        if (lVar26 == 0) goto code_r0x005015c0;
      }
      goto code_r0x00501554;
    }
code_r0x005015c0:
    if (*(long *)(lVar13 + 0x1e8) == unaff_x28) {
      if (*(long *)(lVar13 + 0x200) == -0x8000000000000000) goto code_r0x00501650;
code_r0x005015e8:
      auVar37 = func_0x0045cd08(auStack_7ffffffe + 0x800010ee,lVar13 + 0x200);
      uVar21 = *(ulong *)(lVar13 + 0x50);
      auVar5 = auVar38;
    }
    else {
      auVar37 = func_0x0045cd08(auStack_7ffffffe + 0x80000dee,lVar13 + 0x1e8);
      if (*(long *)(lVar13 + 0x200) != -0x8000000000000000) goto code_r0x005015e8;
code_r0x00501650:
      uVar21 = *(ulong *)(lVar13 + 0x50);
    }
    if ((uVar21 != 5) && (auVar38 = auVar37, 3 < uVar21)) {
      auVar38 = (**(code **)(*(long *)(lVar13 + 0x60) + 0x38))(*(undefined8 *)(lVar13 + 0x58));
    }
    uVar9 = 0;
    in_stack_00000110 = *(ulong *)(lVar13 + 0x78);
    uVar21 = in_stack_00000110 * 0x10;
    if ((in_stack_00000110 >> 0x3c != 0) || (0x7ffffffffffffff8 < uVar21)) {
code_r0x00503614:
      func_0x007a1f00(uVar9,uVar21,&UNK_009e7fc8);
      goto code_r0x005037ac;
    }
    if (uVar21 == 0) {
      in_stack_000000f8 = &MACH_HEADER.cpusubtype;
    }
    else {
      puVar22 = *(undefined8 **)(lVar13 + 0x70);
      in_stack_000000f8 = (dword *)func_0x00187bd0(uVar21,8);
      uVar9 = 8;
      if (in_stack_000000f8 == (dword *)0x0) goto code_r0x00503614;
      if (in_stack_00000110 == 0) goto code_r0x0050178c;
      uVar15 = in_stack_00000110 - 1;
      uVar21 = in_stack_00000110;
      if (uVar15 <= in_stack_00000110) {
        uVar21 = uVar15;
      }
      if (uVar21 < 4) {
code_r0x005016fc:
        lVar24 = 0;
        uVar21 = in_stack_00000110;
        puVar23 = puVar22;
      }
      else {
        uVar14 = in_stack_00000110;
        if (uVar15 <= in_stack_00000110) {
          uVar14 = uVar15;
        }
        if ((in_stack_000000f8 < puVar22 + uVar14 * 2 + 2) &&
           (puVar22 < in_stack_000000f8 + (uVar14 * 2 + 2) * 2)) goto code_r0x005016fc;
        uVar15 = uVar21 + 1 & 3;
        uVar14 = 4;
        if (uVar15 != 0) {
          uVar14 = uVar15;
        }
        lVar24 = (uVar21 + 1) - uVar14;
        uVar21 = in_stack_00000110 - lVar24;
        puVar23 = puVar22 + lVar24 * 2;
        puVar25 = (undefined8 *)(in_stack_000000f8 + 8);
        puVar16 = puVar22 + 4;
        lVar30 = lVar24;
        do {
          uVar31 = puVar16[-3];
          uVar9 = puVar16[-2];
          uVar32 = puVar16[-1];
          uVar33 = *puVar16;
          uVar35 = puVar16[1];
          uVar34 = puVar16[2];
          uVar36 = puVar16[3];
          puVar25[-4] = puVar16[-4];
          puVar25[-3] = uVar31;
          puVar25[-2] = uVar9;
          puVar25[-1] = uVar32;
          *puVar25 = uVar33;
          puVar25[1] = uVar35;
          puVar25[2] = uVar34;
          puVar25[3] = uVar36;
          puVar25 = puVar25 + 8;
          puVar16 = puVar16 + 8;
          lVar30 = lVar30 + -4;
        } while (lVar30 != 0);
      }
      pdVar17 = in_stack_000000f8 + (lVar24 * 2 + 1) * 2;
      do {
        if (puVar23 == puVar22 + in_stack_00000110 * 2) break;
        uVar9 = *puVar23;
        uVar31 = puVar23[1];
        ((mach_header *)(pdVar17 + -2))->magic = (int)uVar9;
        ((mach_header *)(pdVar17 + -2))->cputype = (int)((ulong)uVar9 >> 0x20);
        *(undefined8 *)pdVar17 = uVar31;
        pdVar17 = pdVar17 + 4;
        uVar21 = uVar21 - 1;
        puVar23 = puVar23 + 2;
      } while (uVar21 != 0);
    }
code_r0x0050178c:
    in_x12 = *(ulong *)(lVar13 + 0x90);
    uVar21 = in_x12 * 0x10;
    if (in_x12 >> 0x3c != 0 || 0x7ffffffffffffff8 < uVar21) {
      in_stack_00000008 = 0;
code_r0x005036ec:
      func_0x007a1f00(in_stack_00000008,uVar21,&UNK_009e7fc8);
      goto code_r0x005037ac;
    }
    if (uVar21 != 0) {
      puVar23 = *(undefined8 **)(lVar13 + 0x88);
      puVar22 = (undefined8 *)func_0x00187bd0(uVar21,8);
      if (puVar22 == (undefined8 *)0x0) goto code_r0x005036ec;
      if (in_x12 == 0) goto code_r0x005018ac;
      uVar15 = in_x12 - 1;
      uVar21 = in_x12;
      if (uVar15 <= in_x12) {
        uVar21 = uVar15;
      }
      if (uVar21 < 4) {
code_r0x00501878:
        lVar24 = 0;
        uVar21 = in_x12;
        puVar25 = puVar23;
      }
      else {
        uVar14 = in_x12;
        if (uVar15 <= in_x12) {
          uVar14 = uVar15;
        }
        if (puVar22 < puVar23 + uVar14 * 2 + 2 && puVar23 < puVar22 + uVar14 * 2 + 2)
        goto code_r0x00501878;
        uVar15 = uVar21 + 1 & 3;
        uVar14 = 4;
        if (uVar15 != 0) {
          uVar14 = uVar15;
        }
        lVar24 = (uVar21 + 1) - uVar14;
        uVar21 = in_x12 - lVar24;
        puVar25 = puVar23 + lVar24 * 2;
        puVar16 = puVar22 + 4;
        puVar19 = puVar23 + 4;
        lVar30 = lVar24;
        do {
          uVar31 = puVar19[-3];
          uVar9 = puVar19[-2];
          uVar32 = puVar19[-1];
          uVar33 = *puVar19;
          uVar35 = puVar19[1];
          uVar34 = puVar19[2];
          uVar36 = puVar19[3];
          puVar16[-4] = puVar19[-4];
          puVar16[-3] = uVar31;
          puVar16[-2] = uVar9;
          puVar16[-1] = uVar32;
          *puVar16 = uVar33;
          puVar16[1] = uVar35;
          puVar16[2] = uVar34;
          puVar16[3] = uVar36;
          puVar16 = puVar16 + 8;
          puVar19 = puVar19 + 8;
          lVar30 = lVar30 + -4;
        } while (lVar30 != 0);
      }
      puVar22 = puVar22 + lVar24 * 2 + 1;
      do {
        if (puVar25 == puVar23 + in_x12 * 2) break;
        uVar9 = puVar25[1];
        puVar22[-1] = *puVar25;
        *puVar22 = uVar9;
        puVar22 = puVar22 + 2;
        uVar21 = uVar21 - 1;
        puVar25 = puVar25 + 2;
      } while (uVar21 != 0);
    }
code_r0x005018ac:
    in_stack_00000210 = *(ulong *)(lVar13 + 0xa8);
    uVar21 = in_stack_00000210 * 0x10;
    if (in_stack_00000210 >> 0x3c != 0 || 0x7ffffffffffffff8 < uVar21) {
      in_stack_00000008 = 0;
code_r0x005036b4:
      func_0x007a1f00(in_stack_00000008,uVar21,&UNK_009e7fc8);
      goto code_r0x005037ac;
    }
    if (uVar21 == 0) {
      in_stack_000001e0 = &MACH_HEADER.cpusubtype;
    }
    else {
      puVar22 = *(undefined8 **)(lVar13 + 0xa0);
      in_stack_000001e0 = (dword *)func_0x00187bd0(uVar21,8);
      if (in_stack_000001e0 == (dword *)0x0) goto code_r0x005036b4;
      if (in_stack_00000210 == 0) goto code_r0x005019d8;
      uVar15 = in_stack_00000210 - 1;
      uVar21 = in_stack_00000210;
      if (uVar15 <= in_stack_00000210) {
        uVar21 = uVar15;
      }
      if (uVar21 < 4) {
code_r0x005019a0:
        lVar24 = 0;
        uVar21 = in_stack_00000210;
        puVar23 = puVar22;
      }
      else {
        uVar14 = in_stack_00000210;
        if (uVar15 <= in_stack_00000210) {
          uVar14 = uVar15;
        }
        if (in_stack_000001e0 < puVar22 + uVar14 * 2 + 2 &&
            puVar22 < in_stack_000001e0 + (uVar14 * 2 + 2) * 2) goto code_r0x005019a0;
        uVar15 = uVar21 + 1 & 3;
        uVar14 = 4;
        if (uVar15 != 0) {
          uVar14 = uVar15;
        }
        lVar24 = (uVar21 + 1) - uVar14;
        puVar23 = (undefined8 *)(in_stack_000001e0 + 8);
        puVar25 = puVar22 + 4;
        lVar30 = lVar24;
        do {
          uVar31 = puVar25[-3];
          uVar9 = puVar25[-2];
          uVar32 = puVar25[-1];
          uVar33 = *puVar25;
          uVar35 = puVar25[1];
          uVar34 = puVar25[2];
          uVar36 = puVar25[3];
          puVar23[-4] = puVar25[-4];
          puVar23[-3] = uVar31;
          puVar23[-2] = uVar9;
          puVar23[-1] = uVar32;
          *puVar23 = uVar33;
          puVar23[1] = uVar35;
          puVar23[2] = uVar34;
          puVar23[3] = uVar36;
          puVar23 = puVar23 + 8;
          puVar25 = puVar25 + 8;
          lVar30 = lVar30 + -4;
        } while (lVar30 != 0);
        uVar21 = in_stack_00000210 - lVar24;
        puVar23 = puVar22 + lVar24 * 2;
      }
      pdVar17 = in_stack_000001e0 + (lVar24 * 2 + 1) * 2;
      do {
        if (puVar23 == puVar22 + in_stack_00000210 * 2) break;
        uVar9 = *puVar23;
        uVar31 = puVar23[1];
        ((mach_header *)(pdVar17 + -2))->magic = (int)uVar9;
        ((mach_header *)(pdVar17 + -2))->cputype = (int)((ulong)uVar9 >> 0x20);
        *(undefined8 *)pdVar17 = uVar31;
        pdVar17 = pdVar17 + 4;
        uVar21 = uVar21 - 1;
        puVar23 = puVar23 + 2;
      } while (uVar21 != 0);
    }
code_r0x005019d8:
    in_stack_00000208 = *(ulong *)(lVar13 + 0xc0);
    uVar21 = in_stack_00000208 * 0x20;
    if (in_stack_00000208 >> 0x3b != 0 || 0x7ffffffffffffff8 < uVar21) {
      in_stack_00000008 = 0;
code_r0x00503740:
      func_0x007a1f00(in_stack_00000008,uVar21,&UNK_009e7fc8);
      goto code_r0x005037ac;
    }
    if (uVar21 != 0) {
      puVar23 = *(undefined8 **)(lVar13 + 0xb8);
      puVar22 = (undefined8 *)func_0x00187bd0(uVar21,8);
      if (puVar22 == (undefined8 *)0x0) goto code_r0x00503740;
      if (in_stack_00000208 == 0) goto code_r0x00501af4;
      uVar15 = in_stack_00000208 - 1;
      uVar21 = in_stack_00000208;
      if (uVar15 <= in_stack_00000208) {
        uVar21 = uVar15;
      }
      if (uVar21 < 2) {
code_r0x00501ab4:
        uVar21 = 0;
        uVar15 = in_stack_00000208;
        puVar25 = puVar23;
      }
      else {
        uVar14 = in_stack_00000208;
        if (uVar15 <= in_stack_00000208) {
          uVar14 = uVar15;
        }
        if (puVar22 < puVar23 + uVar14 * 4 + 4 && puVar23 < puVar22 + uVar14 * 4 + 4)
        goto code_r0x00501ab4;
        uVar21 = uVar21 & 0x7fffffffffffffe;
        uVar15 = uVar21;
        puVar25 = puVar23;
        puVar16 = puVar22;
        do {
          uVar33 = puVar25[5];
          uVar32 = puVar25[4];
          uVar31 = puVar25[7];
          uVar9 = puVar25[6];
          uVar36 = puVar25[1];
          uVar35 = puVar25[3];
          uVar34 = puVar25[2];
          *puVar16 = *puVar25;
          puVar16[1] = uVar36;
          puVar16[2] = uVar34;
          puVar16[3] = uVar35;
          puVar16[4] = uVar32;
          puVar16[5] = uVar33;
          puVar16[6] = uVar9;
          puVar16[7] = uVar31;
          puVar16 = puVar16 + 8;
          uVar15 = uVar15 - 2;
          puVar25 = puVar25 + 8;
        } while (uVar15 != 0);
        uVar15 = in_stack_00000208 - uVar21;
        puVar25 = puVar23 + uVar21 * 4;
      }
      puVar22 = puVar22 + uVar21 * 4 + 2;
      do {
        if (puVar25 == puVar23 + in_stack_00000208 * 4) break;
        uVar32 = *puVar25;
        uVar9 = puVar25[2];
        uVar31 = puVar25[3];
        puVar22[-1] = puVar25[1];
        puVar22[-2] = uVar32;
        *puVar22 = uVar9;
        puVar22[1] = uVar31;
        puVar25 = puVar25 + 4;
        uVar15 = uVar15 - 1;
        puVar22 = puVar22 + 4;
      } while (uVar15 != 0);
    }
code_r0x00501af4:
    in_stack_00000200 = *(ulong *)(lVar13 + 0xd8);
    uVar21 = in_stack_00000200 * 0x20;
    if (in_stack_00000200 >> 0x3b != 0 || 0x7ffffffffffffff8 < uVar21) {
      in_stack_00000008 = 0;
code_r0x00503708:
      func_0x007a1f00(in_stack_00000008,uVar21,&UNK_009e7fc8);
      goto code_r0x005037ac;
    }
    if (uVar21 == 0) {
      in_stack_000001d0 = &MACH_HEADER.cpusubtype;
    }
    else {
      puVar22 = *(undefined8 **)(lVar13 + 0xd0);
      in_stack_000001d0 = (dword *)func_0x00187bd0(uVar21,8);
      if (in_stack_000001d0 == (dword *)0x0) goto code_r0x00503708;
      if (in_stack_00000200 == 0) goto code_r0x00501c10;
      uVar15 = in_stack_00000200 - 1;
      uVar21 = in_stack_00000200;
      if (uVar15 <= in_stack_00000200) {
        uVar21 = uVar15;
      }
      if (uVar21 < 2) {
code_r0x00501bd0:
        uVar21 = 0;
        uVar15 = in_stack_00000200;
        puVar23 = puVar22;
      }
      else {
        uVar14 = in_stack_00000200;
        if (uVar15 <= in_stack_00000200) {
          uVar14 = uVar15;
        }
        if (in_stack_000001d0 < puVar22 + uVar14 * 4 + 4 &&
            puVar22 < in_stack_000001d0 + (uVar14 * 4 + 4) * 2) goto code_r0x00501bd0;
        uVar21 = uVar21 & 0x7fffffffffffffe;
        uVar15 = uVar21;
        puVar23 = puVar22;
        pdVar17 = in_stack_000001d0;
        do {
          uVar33 = puVar23[5];
          uVar32 = puVar23[4];
          uVar31 = puVar23[7];
          uVar9 = puVar23[6];
          uVar36 = puVar23[1];
          uVar35 = puVar23[3];
          uVar34 = puVar23[2];
          *(undefined8 *)pdVar17 = *puVar23;
          *(undefined8 *)(pdVar17 + 2) = uVar36;
          *(undefined8 *)(pdVar17 + 4) = uVar34;
          *(undefined8 *)(pdVar17 + 6) = uVar35;
          *(undefined8 *)(pdVar17 + 8) = uVar32;
          *(undefined8 *)(pdVar17 + 10) = uVar33;
          *(undefined8 *)(pdVar17 + 0xc) = uVar9;
          *(undefined8 *)(pdVar17 + 0xe) = uVar31;
          pdVar17 = pdVar17 + 0x10;
          uVar15 = uVar15 - 2;
          puVar23 = puVar23 + 8;
        } while (uVar15 != 0);
        uVar15 = in_stack_00000200 - uVar21;
        puVar23 = puVar22 + uVar21 * 4;
      }
      pdVar17 = in_stack_000001d0 + (uVar21 * 4 + 2) * 2;
      do {
        if (puVar23 == puVar22 + in_stack_00000200 * 4) break;
        uVar33 = puVar23[1];
        uVar32 = *puVar23;
        uVar9 = puVar23[2];
        uVar31 = puVar23[3];
        ((mach_header *)(pdVar17 + -2))->magic = (int)uVar33;
        ((mach_header *)(pdVar17 + -2))->cputype = (int)((ulong)uVar33 >> 0x20);
        *(undefined8 *)(pdVar17 + -4) = uVar32;
        *(undefined8 *)pdVar17 = uVar9;
        *(undefined8 *)(pdVar17 + 2) = uVar31;
        puVar23 = puVar23 + 4;
        uVar15 = uVar15 - 1;
        pdVar17 = pdVar17 + 8;
      } while (uVar15 != 0);
    }
code_r0x00501c10:
    in_stack_000001f8 = *(ulong *)(lVar13 + 0xf0);
    uVar21 = in_stack_000001f8 * 0x20;
    if (in_stack_000001f8 >> 0x3b != 0 || 0x7ffffffffffffff8 < uVar21) {
      in_stack_00000008 = 0;
code_r0x00503698:
      func_0x007a1f00(in_stack_00000008,uVar21,&UNK_009e7fc8);
      goto code_r0x005037ac;
    }
    if (uVar21 != 0) {
      puVar23 = *(undefined8 **)(lVar13 + 0xe8);
      puVar22 = (undefined8 *)func_0x00187bd0(uVar21,8);
      if (puVar22 == (undefined8 *)0x0) goto code_r0x00503698;
      if (in_stack_000001f8 == 0) goto code_r0x00501d2c;
      uVar15 = in_stack_000001f8 - 1;
      uVar21 = in_stack_000001f8;
      if (uVar15 <= in_stack_000001f8) {
        uVar21 = uVar15;
      }
      if (uVar21 < 2) {
code_r0x00501cec:
        uVar21 = 0;
        uVar15 = in_stack_000001f8;
        puVar25 = puVar23;
      }
      else {
        uVar14 = in_stack_000001f8;
        if (uVar15 <= in_stack_000001f8) {
          uVar14 = uVar15;
        }
        if (puVar22 < puVar23 + uVar14 * 4 + 4 && puVar23 < puVar22 + uVar14 * 4 + 4)
        goto code_r0x00501cec;
        uVar21 = uVar21 & 0x7fffffffffffffe;
        uVar15 = uVar21;
        puVar25 = puVar23;
        puVar16 = puVar22;
        do {
          uVar33 = puVar25[5];
          uVar32 = puVar25[4];
          uVar31 = puVar25[7];
          uVar9 = puVar25[6];
          uVar36 = puVar25[1];
          uVar35 = puVar25[3];
          uVar34 = puVar25[2];
          *puVar16 = *puVar25;
          puVar16[1] = uVar36;
          puVar16[2] = uVar34;
          puVar16[3] = uVar35;
          puVar16[4] = uVar32;
          puVar16[5] = uVar33;
          puVar16[6] = uVar9;
          puVar16[7] = uVar31;
          puVar16 = puVar16 + 8;
          uVar15 = uVar15 - 2;
          puVar25 = puVar25 + 8;
        } while (uVar15 != 0);
        uVar15 = in_stack_000001f8 - uVar21;
        puVar25 = puVar23 + uVar21 * 4;
      }
      puVar22 = puVar22 + uVar21 * 4 + 2;
      do {
        if (puVar25 == puVar23 + in_stack_000001f8 * 4) break;
        uVar32 = *puVar25;
        uVar9 = puVar25[2];
        uVar31 = puVar25[3];
        puVar22[-1] = puVar25[1];
        puVar22[-2] = uVar32;
        *puVar22 = uVar9;
        puVar22[1] = uVar31;
        puVar25 = puVar25 + 4;
        uVar15 = uVar15 - 1;
        puVar22 = puVar22 + 4;
      } while (uVar15 != 0);
    }
code_r0x00501d2c:
    in_stack_000001f0 = *(ulong *)(lVar13 + 0x108);
    uVar21 = in_stack_000001f0 * 0x10;
    if (in_stack_000001f0 >> 0x3c != 0 || 0x7ffffffffffffff8 < uVar21) {
      in_stack_00000008 = 0;
code_r0x00503760:
      func_0x007a1f00(in_stack_00000008,uVar21,&UNK_009e7fc8);
      goto code_r0x005037ac;
    }
    if (uVar21 == 0) {
      in_stack_000001c0 = &MACH_HEADER.cpusubtype;
    }
    else {
      puVar22 = *(undefined8 **)(lVar13 + 0x100);
      in_stack_000001c0 = (dword *)func_0x00187bd0(uVar21,8);
      if (in_stack_000001c0 == (dword *)0x0) goto code_r0x00503760;
      if (in_stack_000001f0 == 0) goto code_r0x00501e68;
      uVar15 = in_stack_000001f0 - 1;
      uVar21 = in_stack_000001f0;
      if (uVar15 <= in_stack_000001f0) {
        uVar21 = uVar15;
      }
      if (uVar21 < 4) {
code_r0x00501e28:
        lVar24 = 0;
        uVar21 = in_stack_000001f0;
        puVar23 = puVar22;
      }
      else {
        uVar14 = in_stack_000001f0;
        if (uVar15 <= in_stack_000001f0) {
          uVar14 = uVar15;
        }
        if (in_stack_000001c0 < puVar22 + uVar14 * 2 + 2 &&
            puVar22 < in_stack_000001c0 + (uVar14 * 2 + 2) * 2) goto code_r0x00501e28;
        uVar15 = uVar21 + 1 & 3;
        uVar14 = 4;
        if (uVar15 != 0) {
          uVar14 = uVar15;
        }
        lVar24 = (uVar21 + 1) - uVar14;
        puVar23 = (undefined8 *)(in_stack_000001c0 + 8);
        puVar25 = puVar22 + 4;
        lVar30 = lVar24;
        do {
          uVar31 = puVar25[-3];
          uVar9 = puVar25[-2];
          uVar32 = puVar25[-1];
          uVar33 = *puVar25;
          uVar35 = puVar25[1];
          uVar34 = puVar25[2];
          uVar36 = puVar25[3];
          puVar23[-4] = puVar25[-4];
          puVar23[-3] = uVar31;
          puVar23[-2] = uVar9;
          puVar23[-1] = uVar32;
          *puVar23 = uVar33;
          puVar23[1] = uVar35;
          puVar23[2] = uVar34;
          puVar23[3] = uVar36;
          puVar23 = puVar23 + 8;
          puVar25 = puVar25 + 8;
          lVar30 = lVar30 + -4;
        } while (lVar30 != 0);
        uVar21 = in_stack_000001f0 - lVar24;
        puVar23 = puVar22 + lVar24 * 2;
      }
      pdVar17 = in_stack_000001c0 + (lVar24 * 2 + 1) * 2;
      do {
        if (puVar23 == puVar22 + in_stack_000001f0 * 2) break;
        uVar9 = *puVar23;
        uVar31 = puVar23[1];
        ((mach_header *)(pdVar17 + -2))->magic = (int)uVar9;
        ((mach_header *)(pdVar17 + -2))->cputype = (int)((ulong)uVar9 >> 0x20);
        *(undefined8 *)pdVar17 = uVar31;
        pdVar17 = pdVar17 + 4;
        uVar21 = uVar21 - 1;
        puVar23 = puVar23 + 2;
      } while (uVar21 != 0);
    }
code_r0x00501e68:
    in_stack_000001e8 = *(ulong *)(lVar13 + 0x120);
    uVar21 = in_stack_000001e8 * 0x10;
    if (in_stack_000001e8 >> 0x3c != 0 || 0x7ffffffffffffff8 < uVar21) {
      in_stack_00000008 = 0;
code_r0x005036d0:
      func_0x007a1f00(in_stack_00000008,uVar21,&UNK_009e7fc8);
      goto code_r0x005037ac;
    }
    if (uVar21 != 0) {
      puVar23 = *(undefined8 **)(lVar13 + 0x118);
      puVar22 = (undefined8 *)func_0x00187bd0(uVar21,8);
      if (puVar22 == (undefined8 *)0x0) goto code_r0x005036d0;
      if (in_stack_000001e8 == 0) goto code_r0x00501f98;
      uVar15 = in_stack_000001e8 - 1;
      uVar21 = in_stack_000001e8;
      if (uVar15 <= in_stack_000001e8) {
        uVar21 = uVar15;
      }
      if (uVar21 < 4) {
code_r0x00501f60:
        lVar24 = 0;
        uVar21 = in_stack_000001e8;
        puVar25 = puVar23;
      }
      else {
        uVar14 = in_stack_000001e8;
        if (uVar15 <= in_stack_000001e8) {
          uVar14 = uVar15;
        }
        if (puVar22 < puVar23 + uVar14 * 2 + 2 && puVar23 < puVar22 + uVar14 * 2 + 2)
        goto code_r0x00501f60;
        uVar15 = uVar21 + 1 & 3;
        uVar14 = 4;
        if (uVar15 != 0) {
          uVar14 = uVar15;
        }
        lVar24 = (uVar21 + 1) - uVar14;
        puVar25 = puVar22 + 4;
        puVar16 = puVar23 + 4;
        lVar30 = lVar24;
        do {
          uVar31 = puVar16[-3];
          uVar9 = puVar16[-2];
          uVar32 = puVar16[-1];
          uVar33 = *puVar16;
          uVar35 = puVar16[1];
          uVar34 = puVar16[2];
          uVar36 = puVar16[3];
          puVar25[-4] = puVar16[-4];
          puVar25[-3] = uVar31;
          puVar25[-2] = uVar9;
          puVar25[-1] = uVar32;
          *puVar25 = uVar33;
          puVar25[1] = uVar35;
          puVar25[2] = uVar34;
          puVar25[3] = uVar36;
          puVar25 = puVar25 + 8;
          puVar16 = puVar16 + 8;
          lVar30 = lVar30 + -4;
        } while (lVar30 != 0);
        uVar21 = in_stack_000001e8 - lVar24;
        puVar25 = puVar23 + lVar24 * 2;
      }
      puVar22 = puVar22 + lVar24 * 2 + 1;
      do {
        if (puVar25 == puVar23 + in_stack_000001e8 * 2) break;
        uVar9 = puVar25[1];
        puVar22[-1] = *puVar25;
        *puVar22 = uVar9;
        puVar22 = puVar22 + 2;
        uVar21 = uVar21 - 1;
        puVar25 = puVar25 + 2;
      } while (uVar21 != 0);
    }
code_r0x00501f98:
    uVar9 = 0;
    in_x14 = *(ulong *)(lVar13 + 0x138);
    auVar37._8_8_ = 0;
    auVar37._0_8_ = in_x14;
    uVar21 = in_x14 * 0x18;
    if ((SUB168(auVar37 * ZEXT816(0x18),8) != 0) || (0x7ffffffffffffff8 < uVar21)) {
code_r0x0050364c:
      func_0x007a1f00(uVar9,uVar21,&UNK_009e7fc8);
      goto code_r0x005037ac;
    }
    if (uVar21 == 0) {
      in_stack_00000168 = 8;
    }
    else {
      puVar22 = *(undefined8 **)(lVar13 + 0x130);
      in_stack_00000168 = func_0x00187bd0(uVar21,8);
      uVar9 = 8;
      if (in_stack_00000168 == 0) goto code_r0x0050364c;
      if (in_x14 != 0) {
        puVar11 = (undefined1 *)(in_stack_00000168 + 0x10);
        uVar15 = in_x14;
        do {
          if (uVar21 == 0) break;
          uVar9 = *puVar22;
          uVar31 = puVar22[1];
          uVar2 = *(undefined1 *)(puVar22 + 2);
          puVar22 = puVar22 + 3;
          *(undefined8 *)(puVar11 + -0x10) = uVar9;
          *(undefined8 *)(puVar11 + -8) = uVar31;
          *puVar11 = uVar2;
          uVar21 = uVar21 - 0x18;
          uVar15 = uVar15 - 1;
          puVar11 = puVar11 + 0x18;
        } while (uVar15 != 0);
      }
    }
    in_x16 = *(ulong *)(lVar13 + 0x150);
    uVar21 = in_x16 * 8;
    if (in_x16 >> 0x3d != 0 || 0x7ffffffffffffffc < uVar21) {
      in_stack_00000000 = 0;
code_r0x00503724:
      func_0x007a1f00(in_stack_00000000,uVar21,&UNK_009e7fe0);
      goto code_r0x005037ac;
    }
    uVar9 = *(undefined8 *)(lVar13 + 0x148);
    if (uVar21 == 0) {
      in_x16 = 0;
      lVar24 = 4;
    }
    else {
      lVar24 = func_0x00187bd0(uVar21,4);
      if (lVar24 == 0) goto code_r0x00503724;
    }
    _memcpy(lVar24,uVar9,uVar21);
    uVar9 = 0;
    in_stack_00000150 = *(ulong *)(lVar13 + 0x168);
    uVar21 = in_stack_00000150 * 0x10;
    if ((in_stack_00000150 >> 0x3c != 0) || (0x7ffffffffffffff8 < uVar21)) {
code_r0x0050363c:
      func_0x007a1f00(uVar9,uVar21,&UNK_009e7fc8);
      goto code_r0x005037ac;
    }
    if (uVar21 == 0) {
      pdStack00000000000001b0 = &MACH_HEADER.cpusubtype;
    }
    else {
      puVar22 = *(undefined8 **)(lVar13 + 0x160);
      pdStack00000000000001b0 = (dword *)func_0x00187bd0(uVar21,8);
      uVar9 = 8;
      if (pdStack00000000000001b0 == (dword *)0x0) goto code_r0x0050363c;
      if (in_stack_00000150 == 0) goto code_r0x00502208;
      uVar15 = in_stack_00000150 - 1;
      uVar21 = in_stack_00000150;
      if (uVar15 <= in_stack_00000150) {
        uVar21 = uVar15;
      }
      if (uVar21 < 4) {
code_r0x00502170:
        lVar24 = 0;
        uVar21 = in_stack_00000150;
        puVar23 = puVar22;
      }
      else {
        uVar14 = in_stack_00000150;
        if (uVar15 <= in_stack_00000150) {
          uVar14 = uVar15;
        }
        if ((pdStack00000000000001b0 < puVar22 + uVar14 * 2 + 2) &&
           (puVar22 < pdStack00000000000001b0 + (uVar14 * 2 + 2) * 2)) goto code_r0x00502170;
        uVar15 = uVar21 + 1 & 3;
        uVar14 = 4;
        if (uVar15 != 0) {
          uVar14 = uVar15;
        }
        lVar24 = (uVar21 + 1) - uVar14;
        uVar21 = in_stack_00000150 - lVar24;
        puVar23 = puVar22 + lVar24 * 2;
        puVar25 = (undefined8 *)(pdStack00000000000001b0 + 8);
        puVar16 = puVar22 + 4;
        lVar30 = lVar24;
        do {
          uVar31 = puVar16[-3];
          uVar9 = puVar16[-2];
          uVar32 = puVar16[-1];
          uVar33 = *puVar16;
          uVar35 = puVar16[1];
          uVar34 = puVar16[2];
          uVar36 = puVar16[3];
          puVar25[-4] = puVar16[-4];
          puVar25[-3] = uVar31;
          puVar25[-2] = uVar9;
          puVar25[-1] = uVar32;
          *puVar25 = uVar33;
          puVar25[1] = uVar35;
          puVar25[2] = uVar34;
          puVar25[3] = uVar36;
          puVar25 = puVar25 + 8;
          puVar16 = puVar16 + 8;
          lVar30 = lVar30 + -4;
        } while (lVar30 != 0);
      }
      pdVar17 = pdStack00000000000001b0 + (lVar24 * 2 + 1) * 2;
      do {
        if (puVar23 == puVar22 + in_stack_00000150 * 2) break;
        uVar9 = *puVar23;
        uVar31 = puVar23[1];
        ((mach_header *)(pdVar17 + -2))->magic = (int)uVar9;
        ((mach_header *)(pdVar17 + -2))->cputype = (int)((ulong)uVar9 >> 0x20);
        *(undefined8 *)pdVar17 = uVar31;
        pdVar17 = pdVar17 + 4;
        uVar21 = uVar21 - 1;
        puVar23 = puVar23 + 2;
      } while (uVar21 != 0);
    }
code_r0x00502208:
    in_stack_00000218 = *(ulong *)(lVar13 + 0x180);
    uVar21 = in_stack_00000218 * 0x10;
    if (in_stack_00000218 >> 0x3c != 0 || 0x7ffffffffffffff8 < uVar21) {
      in_stack_00000008 = 0;
code_r0x0050367c:
      func_0x007a1f00(in_stack_00000008,uVar21,&UNK_009e7fc8);
      goto code_r0x005037ac;
    }
    if (uVar21 == 0) {
      in_stack_000001a8 = &MACH_HEADER.cpusubtype;
    }
    else {
      puVar22 = *(undefined8 **)(lVar13 + 0x178);
      in_stack_000001a8 = (dword *)func_0x00187bd0(uVar21,8);
      if (in_stack_000001a8 == (dword *)0x0) goto code_r0x0050367c;
      if (in_stack_00000218 == 0) goto code_r0x0050237c;
      uVar15 = in_stack_00000218 - 1;
      uVar21 = in_stack_00000218;
      if (uVar15 <= in_stack_00000218) {
        uVar21 = uVar15;
      }
      if (uVar21 < 4) {
code_r0x005022ec:
        lVar30 = 0;
        uVar21 = in_stack_00000218;
        puVar16 = puVar22;
      }
      else {
        uVar14 = in_stack_00000218;
        if (uVar15 <= in_stack_00000218) {
          uVar14 = uVar15;
        }
        if ((in_stack_000001a8 < puVar22 + uVar14 * 2 + 2) &&
           (puVar22 < in_stack_000001a8 + (uVar14 * 2 + 2) * 2)) goto code_r0x005022ec;
        uVar15 = uVar21 + 1 & 3;
        uVar14 = 4;
        if (uVar15 != 0) {
          uVar14 = uVar15;
        }
        lVar30 = (uVar21 + 1) - uVar14;
        uVar21 = in_stack_00000218 - lVar30;
        puVar16 = puVar22 + lVar30 * 2;
        puVar23 = (undefined8 *)(in_stack_000001a8 + 8);
        puVar25 = puVar22 + 4;
        lVar24 = lVar30;
        do {
          uVar31 = puVar25[-3];
          uVar9 = puVar25[-2];
          uVar32 = puVar25[-1];
          uVar33 = *puVar25;
          uVar35 = puVar25[1];
          uVar34 = puVar25[2];
          uVar36 = puVar25[3];
          puVar23[-4] = puVar25[-4];
          puVar23[-3] = uVar31;
          puVar23[-2] = uVar9;
          puVar23[-1] = uVar32;
          *puVar23 = uVar33;
          puVar23[1] = uVar35;
          puVar23[2] = uVar34;
          puVar23[3] = uVar36;
          puVar23 = puVar23 + 8;
          puVar25 = puVar25 + 8;
          lVar24 = lVar24 + -4;
        } while (lVar24 != 0);
      }
      pdVar17 = in_stack_000001a8 + (lVar30 * 2 + 1) * 2;
      do {
        if (puVar16 == puVar22 + in_stack_00000218 * 2) break;
        uVar9 = *puVar16;
        uVar31 = puVar16[1];
        ((mach_header *)(pdVar17 + -2))->magic = (int)uVar9;
        ((mach_header *)(pdVar17 + -2))->cputype = (int)((ulong)uVar9 >> 0x20);
        *(undefined8 *)pdVar17 = uVar31;
        pdVar17 = pdVar17 + 4;
        uVar21 = uVar21 - 1;
        puVar16 = puVar16 + 2;
      } while (uVar21 != 0);
    }
code_r0x0050237c:
    uVar9 = 0;
    unaff_x19 = *(ulong *)(lVar13 + 0x198);
    auVar4._8_8_ = 0;
    auVar4._0_8_ = unaff_x19;
    uVar21 = unaff_x19 * 0x30;
    if ((SUB168(auVar4 * ZEXT816(0x30),8) != 0) || (0x7ffffffffffffff8 < uVar21)) {
code_r0x00503628:
      func_0x007a1f00(uVar9,uVar21,&UNK_009e7fc8);
      goto code_r0x005037ac;
    }
    if (uVar21 == 0) {
      in_stack_00000130 = 8;
    }
    else {
      puVar22 = *(undefined8 **)(lVar13 + 400);
      in_stack_00000130 = func_0x00187bd0(uVar21,8);
      uVar9 = 8;
      if (in_stack_00000130 == 0) goto code_r0x00503628;
      if (unaff_x19 != 0) {
        puVar23 = (undefined8 *)(in_stack_00000130 + 0x18);
        uVar15 = unaff_x19;
        do {
          if (uVar21 == 0) break;
          puVar25 = puVar22 + 1;
          uVar32 = *puVar22;
          uVar34 = puVar22[3];
          uVar33 = puVar22[2];
          uVar9 = puVar22[4];
          uVar31 = puVar22[5];
          puVar22 = puVar22 + 6;
          puVar23[-2] = *puVar25;
          puVar23[-3] = uVar32;
          *puVar23 = uVar34;
          puVar23[-1] = uVar33;
          puVar23[1] = uVar9;
          puVar23[2] = uVar31;
          uVar21 = uVar21 - 0x30;
          puVar23 = puVar23 + 6;
          uVar15 = uVar15 - 1;
        } while (uVar15 != 0);
      }
    }
    unaff_x26 = *(ulong *)(lVar13 + 0x1b0);
    uVar21 = unaff_x26 * 0x10;
    if (unaff_x26 >> 0x3c != 0 || 0x7ffffffffffffff8 < uVar21) {
      in_stack_00000008 = 0;
code_r0x00503798:
      func_0x007a1f00(in_stack_00000008,uVar21,&UNK_009e7fc8);
      goto code_r0x005037ac;
    }
    if (uVar21 == 0) {
      in_stack_000000f0 = &MACH_HEADER.cpusubtype;
    }
    else {
      puVar22 = *(undefined8 **)(lVar13 + 0x1a8);
      in_stack_000000f0 = (dword *)func_0x00187bd0(uVar21,8);
      if (in_stack_000000f0 == (dword *)0x0) goto code_r0x00503798;
      if (unaff_x26 == 0) goto code_r0x0050253c;
      uVar15 = unaff_x26 - 1;
      uVar21 = unaff_x26;
      if (uVar15 <= unaff_x26) {
        uVar21 = uVar15;
      }
      if (uVar21 < 4) {
code_r0x00502508:
        lVar24 = 0;
        uVar21 = unaff_x26;
        puVar23 = puVar22;
      }
      else {
        uVar14 = unaff_x26;
        if (uVar15 <= unaff_x26) {
          uVar14 = uVar15;
        }
        if (in_stack_000000f0 < puVar22 + uVar14 * 2 + 2 &&
            puVar22 < in_stack_000000f0 + (uVar14 * 2 + 2) * 2) goto code_r0x00502508;
        uVar15 = uVar21 + 1 & 3;
        uVar14 = 4;
        if (uVar15 != 0) {
          uVar14 = uVar15;
        }
        lVar24 = (uVar21 + 1) - uVar14;
        uVar21 = unaff_x26 - lVar24;
        puVar23 = puVar22 + lVar24 * 2;
        puVar25 = (undefined8 *)(in_stack_000000f0 + 8);
        puVar16 = puVar22 + 4;
        lVar30 = lVar24;
        do {
          uVar31 = puVar16[-3];
          uVar9 = puVar16[-2];
          uVar32 = puVar16[-1];
          uVar33 = *puVar16;
          uVar35 = puVar16[1];
          uVar34 = puVar16[2];
          uVar36 = puVar16[3];
          puVar25[-4] = puVar16[-4];
          puVar25[-3] = uVar31;
          puVar25[-2] = uVar9;
          puVar25[-1] = uVar32;
          *puVar25 = uVar33;
          puVar25[1] = uVar35;
          puVar25[2] = uVar34;
          puVar25[3] = uVar36;
          puVar25 = puVar25 + 8;
          puVar16 = puVar16 + 8;
          lVar30 = lVar30 + -4;
        } while (lVar30 != 0);
      }
      pdVar17 = in_stack_000000f0 + (lVar24 * 2 + 1) * 2;
      do {
        if (puVar23 == puVar22 + unaff_x26 * 2) break;
        uVar9 = *puVar23;
        uVar31 = puVar23[1];
        ((mach_header *)(pdVar17 + -2))->magic = (int)uVar9;
        ((mach_header *)(pdVar17 + -2))->cputype = (int)((ulong)uVar9 >> 0x20);
        *(undefined8 *)pdVar17 = uVar31;
        pdVar17 = pdVar17 + 4;
        uVar21 = uVar21 - 1;
        puVar23 = puVar23 + 2;
      } while (uVar21 != 0);
    }
code_r0x0050253c:
    unaff_x22 = *(ulong *)(lVar13 + 0x1c8);
    uVar21 = unaff_x22 * 0x10;
    if (unaff_x22 >> 0x3c != 0 || 0x7ffffffffffffff8 < uVar21) {
      in_stack_00000008 = 0;
code_r0x0050377c:
      func_0x007a1f00(in_stack_00000008,uVar21,&UNK_009e7fe0);
      goto code_r0x005037ac;
    }
    in_stack_000000b8 = *(undefined8 *)(lVar13 + 0x238);
    in_stack_000000b0 = *(undefined8 *)(lVar13 + 0x240);
    in_stack_000000e0 = *(undefined8 *)(lVar13 + 0x28);
    in_stack_000000d8 = *(undefined8 *)(lVar13 + 0x30);
    in_stack_000000d0 = *(undefined8 *)(lVar13 + 0x38);
    in_stack_000000c8 = *(undefined8 *)(lVar13 + 0x40);
    in_stack_000000c0 = *(undefined8 *)(lVar13 + 0x48);
    uVar9 = *(undefined8 *)(lVar13 + 0x1c0);
    if (uVar21 == 0) {
      in_stack_000000e8 = 0;
      unaff_x24 = 8;
    }
    else {
      unaff_x24 = func_0x00187bd0(uVar21,8);
      if (unaff_x24 == 0) goto code_r0x0050377c;
      in_stack_000000e8 = unaff_x22;
    }
    _memcpy(unaff_x24,uVar9,uVar21);
    uVar9 = 0;
    unaff_x20 = *(ulong *)(lVar13 + 0x1e0);
    uVar21 = unaff_x20 * 0x20;
    if ((unaff_x20 >> 0x3b != 0) || (0x7ffffffffffffff8 < uVar21)) {
code_r0x00503660:
      func_0x007a1f00(uVar9,uVar21,&UNK_009e7fc8);
code_r0x005037ac:
                    /* WARNING: Does not return */
      pcVar6 = (code *)SoftwareBreakpoint(1,0x5037b0);
      (*pcVar6)();
    }
    if (uVar21 == 0) {
      param_1 = 8;
    }
    else {
      puVar22 = *(undefined8 **)(lVar13 + 0x1d8);
      param_1 = func_0x00187bd0(uVar21,8);
      uVar9 = 8;
      if (param_1 == 0) goto code_r0x00503660;
      if (unaff_x20 != 0) {
        puVar23 = (undefined8 *)(param_1 + 0x10);
        uVar15 = unaff_x20;
        do {
          if (uVar21 == 0) break;
          plVar18 = (long *)*puVar22;
          lVar24 = *plVar18;
          *plVar18 = lVar24 + 1;
          if (lVar24 < 0) goto code_r0x005037ac;
          uVar9 = puVar22[1];
          uVar32 = puVar22[3];
          uVar31 = puVar22[2];
          puVar22 = puVar22 + 4;
          puVar23[-2] = plVar18;
          puVar23[-1] = uVar9;
          puVar23[1] = uVar32;
          *puVar23 = uVar31;
          uVar21 = uVar21 - 0x20;
          uVar15 = uVar15 - 1;
          puVar23 = puVar23 + 4;
        } while (uVar15 != 0);
      }
    }
    unaff_x28 = -0x8000000000000000;
    in_x15 = auStack_7ffffffe + 0x800002be;
    in_x10 = auStack_7ffffffe + 0x800013be;
  } while( true );
  while( true ) {
    func_0x0050d2e0(lVar26);
    if ((((uVar10 | uVar3) >> 0x18 & 1) != 0) &&
       (((*(uint *)(lVar26 + 0x10) & 1) == 0 || (*(long *)(lVar26 + 0x20) != 0)))) {
      *(uint *)(lVar26 + 0x250) = *(uint *)(lVar26 + 0x250) | 0x10;
    }
    if (((*(long *)(lVar26 + 0x228) == 0) && (*(int *)(lVar26 + 0x248) == 0x110000)) &&
       (*(long *)(lVar26 + 0x28) == 0)) {
      *(undefined8 *)(lVar26 + 0x28) = 1;
      *(long *)(lVar26 + 0x30) = lVar30;
      lVar30 = lVar30 + 1;
    }
    bVar7 = lVar12 != lVar28 + lVar24 * 600;
    lVar13 = 0;
    if (bVar7) {
      lVar13 = 600;
    }
    lVar13 = lVar12 + lVar13;
    lVar26 = lVar12;
    if (!bVar7) break;
code_r0x005028dc:
    lVar12 = lVar13;
    lVar13 = *(long *)(lVar26 + 0xa8);
    if (lVar13 != 0) {
      puVar25 = *(undefined8 **)(lVar26 + 0xa0);
      puVar22 = puVar25;
      puVar23 = puVar25 + 2;
      do {
        if (*(long *)(in_stack_00000230 + 0xd8) != 0) {
          plVar18 = *(long **)(in_stack_00000230 + 0xd0);
          lVar29 = puVar22[1];
          lVar27 = *(long *)(in_stack_00000230 + 0xd8) * 0x60;
          do {
            if ((plVar18[10] == lVar29) && (iVar8 = _memcmp(plVar18[9],*puVar22,lVar29), iVar8 == 0)
               ) {
              uVar9 = *(undefined8 *)(lVar26 + 0x218);
              uVar31 = *(undefined8 *)(lVar26 + 0x220);
              lVar27 = plVar18[2];
              if (lVar27 == *plVar18) {
                func_0x0050c0c0(plVar18,&UNK_009e8a18);
              }
              puVar22 = (undefined8 *)(plVar18[1] + lVar27 * 0x10);
              *puVar22 = uVar9;
              puVar22[1] = uVar31;
              plVar18[2] = lVar27 + 1;
              goto joined_r0x005029e8;
            }
            plVar18 = plVar18 + 0xc;
            lVar27 = lVar27 + -0x60;
          } while (lVar27 != 0);
        }
        uVar9 = *puVar22;
        uVar31 = puVar22[1];
        uVar32 = *(undefined8 *)(lVar26 + 0x218);
        uVar33 = *(undefined8 *)(lVar26 + 0x220);
        func_0x0050c0c0(auStack_7ffffffe + 0x800010ee,&UNK_009e8a30);
        lVar27 = *(long *)(in_stack_00000230 + 0xd8);
        MACH_HEADER._8_8_ = uVar32;
        MACH_HEADER._16_8_ = uVar33;
        if (lVar27 == *(long *)(in_stack_00000230 + 200)) {
          func_0x0050c500(in_stack_00000230 + 200,&UNK_009e8a48);
        }
        puVar22 = (undefined8 *)(*(long *)(in_stack_00000230 + 0xd0) + lVar27 * 0x60);
        puVar22[5] = 0;
        puVar22[4] = 8;
        puVar22[7] = 8;
        puVar22[6] = 0;
        puVar22[9] = uVar9;
        puVar22[8] = 0;
        puVar22[0xb] = (ulong)in_stack_0000114a << 0x10;
        puVar22[10] = uVar31;
        puVar22[1] = 8;
        *puVar22 = 0;
        puVar22[3] = 0;
        puVar22[2] = 1;
        *(long *)(in_stack_00000230 + 0xd8) = lVar27 + 1;
joined_r0x005029e8:
        bVar7 = puVar23 != puVar25 + lVar13 * 2;
        puVar22 = puVar23;
        puVar23 = puVar23 + (ulong)(puVar23 != puVar25 + lVar13 * 2) * 2;
      } while (bVar7);
    }
  }
code_r0x00502aec:
  func_0x00510488(in_stack_00000230 + 0x80);
  lVar24 = 0;
  lVar30 = *(long *)(in_stack_00000230 + 0xa0);
  lVar13 = *(long *)(in_stack_00000230 + 0xa8) * 0x20;
  do {
    if (lVar13 == lVar24) {
      uVar21 = 0;
      goto code_r0x00502b4c;
    }
    piVar20 = (int *)(lVar30 + lVar24);
    lVar24 = lVar24 + 0x20;
  } while (*piVar20 != 2);
  uVar21 = *(ulong *)(lVar30 + lVar24 + -0x18);
  uVar15 = lVar13 - lVar24;
  if (uVar15 != 0) {
    if ((uVar15 >> 5) - 1 < 7) {
      lVar13 = 0;
    }
    else {
      lVar13 = 0;
      piVar20 = (int *)(lVar30 + lVar24 + 0x80);
      do {
        if (piVar20[-0x20] == 2) {
          uVar14 = *(ulong *)(piVar20 + -0x1e);
          if (*(ulong *)(piVar20 + -0x1e) <= uVar21) {
            uVar14 = uVar21;
          }
          uVar21 = uVar14;
          if (piVar20[-0x18] == 2) goto code_r0x00502d04;
code_r0x00502c88:
          if (piVar20[-0x10] != 2) goto code_r0x00502d1c;
code_r0x00502c94:
          uVar21 = *(ulong *)(piVar20 + -0xe);
          if (*(ulong *)(piVar20 + -0xe) <= uVar14) {
            uVar21 = uVar14;
          }
          uVar14 = uVar21;
          if (piVar20[-8] == 2) goto code_r0x00502d28;
code_r0x00502cac:
          if (*piVar20 != 2) goto code_r0x00502d40;
code_r0x00502cb8:
          uVar14 = *(ulong *)(piVar20 + 2);
          if (*(ulong *)(piVar20 + 2) <= uVar21) {
            uVar14 = uVar21;
          }
          uVar21 = uVar14;
          if (piVar20[8] == 2) goto code_r0x00502d4c;
code_r0x00502cd0:
          if (piVar20[0x10] != 2) goto code_r0x00502d64;
code_r0x00502cdc:
          uVar1 = *(ulong *)(piVar20 + 0x12);
          if (*(ulong *)(piVar20 + 0x12) <= uVar14) {
            uVar1 = uVar14;
          }
          iVar8 = piVar20[0x18];
        }
        else {
          uVar14 = uVar21;
          if (piVar20[-0x18] != 2) goto code_r0x00502c88;
code_r0x00502d04:
          uVar14 = *(ulong *)(piVar20 + -0x16);
          if (*(ulong *)(piVar20 + -0x16) <= uVar21) {
            uVar14 = uVar21;
          }
          if (piVar20[-0x10] == 2) goto code_r0x00502c94;
code_r0x00502d1c:
          uVar21 = uVar14;
          if (piVar20[-8] != 2) goto code_r0x00502cac;
code_r0x00502d28:
          uVar21 = *(ulong *)(piVar20 + -6);
          if (*(ulong *)(piVar20 + -6) <= uVar14) {
            uVar21 = uVar14;
          }
          if (*piVar20 == 2) goto code_r0x00502cb8;
code_r0x00502d40:
          uVar14 = uVar21;
          if (piVar20[8] != 2) goto code_r0x00502cd0;
code_r0x00502d4c:
          uVar14 = *(ulong *)(piVar20 + 10);
          if (*(ulong *)(piVar20 + 10) <= uVar21) {
            uVar14 = uVar21;
          }
          if (piVar20[0x10] == 2) goto code_r0x00502cdc;
code_r0x00502d64:
          iVar8 = piVar20[0x18];
          uVar1 = uVar14;
        }
        uVar21 = uVar1;
        if ((iVar8 == 2) &&
           (uVar21 = *(ulong *)(piVar20 + 0x1a), *(ulong *)(piVar20 + 0x1a) <= uVar1)) {
          uVar21 = uVar1;
        }
        piVar20 = piVar20 + 0x40;
        lVar13 = lVar13 + -8;
      } while (-lVar13 != (uVar15 >> 8) * 8);
      lVar13 = -lVar13;
    }
    if ((uVar15 >> 5 & 7) != 0) {
      lVar13 = lVar13 << 5;
      uVar15 = uVar15 & 0xe0;
      uVar14 = uVar21;
      do {
        uVar21 = uVar14;
        if ((*(int *)(lVar30 + lVar13 + lVar24) == 2) &&
           (uVar21 = *(ulong *)(lVar30 + lVar13 + lVar24 + 8), uVar21 <= uVar14)) {
          uVar21 = uVar14;
        }
        lVar13 = lVar13 + 0x20;
        uVar15 = uVar15 - 0x20;
        uVar14 = uVar21;
      } while (uVar15 != 0);
    }
  }
code_r0x00502b4c:
  uVar10 = *(uint *)(in_stack_00000230 + 700);
  lVar24 = *(long *)(in_stack_00000230 + 0x90);
  if (lVar24 != 0) {
    lVar30 = 0;
    uVar10 = uVar10 | *(uint *)(in_stack_00000230 + 0x2c0);
    lVar13 = *(long *)(in_stack_00000230 + 0x88);
    do {
      if (((uVar10 >> 1 & 1) != 0) &&
         ((lVar26 = lVar13 + lVar30, (*(uint *)(lVar26 + 0x10) & 1) == 0 ||
          (*(long *)(lVar26 + 0x20) != 0)))) {
        *(uint *)(lVar26 + 0x250) = *(uint *)(lVar26 + 0x250) | 0x20;
      }
      if (((uVar10 >> 2 & 1) != 0) &&
         ((lVar26 = lVar13 + lVar30, (*(uint *)(lVar26 + 0x10) & 1) == 0 ||
          (*(long *)(lVar26 + 0x20) != 0)))) {
        *(uint *)(lVar26 + 0x250) = *(uint *)(lVar26 + 0x250) | 0x40;
      }
      if (((uVar10 >> 5 & 1) != 0) &&
         (lVar26 = lVar13 + lVar30,
         *(int *)(lVar26 + 0x28) == 1 && *(ulong *)(lVar26 + 0x30) == uVar21)) {
        *(uint *)(lVar26 + 0x250) = *(uint *)(lVar26 + 0x250) | 0x200;
      }
      lVar30 = lVar30 + 600;
    } while (lVar24 * 600 != lVar30);
    uVar10 = *in_stack_00000028;
  }
  *in_stack_00000028 = uVar10 | 0x40000000;
  return;
}

