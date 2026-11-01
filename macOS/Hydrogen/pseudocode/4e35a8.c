
void FUN_004e35a8(void)

{
  ulong uVar1;
  undefined4 uVar2;
  undefined1 uVar3;
  undefined1 auVar4 [16];
  undefined1 auVar5 [16];
  code *pcVar6;
  ulong uVar7;
  undefined8 uVar8;
  int iVar9;
  undefined1 *puVar10;
  ulong uVar11;
  ulong uVar12;
  ulong uVar13;
  ulong uVar14;
  ulong uVar15;
  long lVar16;
  ulong uVar17;
  undefined8 *puVar18;
  undefined8 *puVar19;
  undefined8 *puVar20;
  long lVar21;
  ulong unaff_x19;
  undefined8 *puVar22;
  ulong unaff_x20;
  dword *pdVar23;
  dword *pdVar24;
  undefined8 unaff_x21;
  ulong uVar25;
  undefined8 *unaff_x26;
  long unaff_x29;
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
  undefined1 auVar36 [16];
  undefined8 in_stack_00000008;
  undefined8 in_stack_00000010;
  undefined8 *in_stack_00000018;
  undefined8 in_stack_00000020;
  dword *in_stack_00000030;
  ulong in_stack_00000040;
  dword *in_stack_00000050;
  dword *pdStack0000000000000068;
  ulong in_stack_00000070;
  dword *in_stack_00000078;
  dword *in_stack_00000088;
  dword *in_stack_00000098;
  dword *in_stack_000000a0;
  dword *in_stack_000000b0;
  dword *pdStack00000000000000b8;
  dword *in_stack_000000c0;
  dword *in_stack_000000d0;
  dword *pdStack00000000000000d8;
  dword *pdStack00000000000000e0;
  dword *pdStack00000000000000f0;
  dword *pdStack0000000000000100;
  dword *pdStack0000000000000110;
  dword *pdStack0000000000000120;
  undefined8 *in_stack_00000138;
  long in_stack_00000140;
  undefined8 in_stack_00000148;
  undefined8 in_stack_00000150;
  undefined8 in_stack_00000160;
  undefined8 in_stack_00000168;
  dword *in_stack_00000170;
  dword *in_stack_00000178;
  dword *pdStack0000000000000180;
  undefined8 uStack00000000000001a8;
  ulong in_stack_000001d0;
  undefined8 in_stack_000001e0;
  undefined8 in_stack_000001e8;
  undefined4 in_stack_000001f4;
  ulong in_stack_00000200;
  undefined4 in_stack_00000214;
  long in_stack_00000218;
  undefined8 in_stack_00000220;
  undefined8 in_stack_00000228;
  undefined1 in_stack_00000234;
  dword *in_stack_00000238;
  dword *in_stack_00000240;
  ulong in_stack_00000248;
  undefined8 in_stack_00000250;
  long in_stack_00000258;
  ulong in_stack_00000268;
  ulong in_stack_00000270;
  ulong in_stack_00000278;
  ulong in_stack_00000280;
  ulong in_stack_00000288;
  ulong in_stack_00000290;
  ulong in_stack_00000298;
  ulong in_stack_000002a0;
  dword *in_stack_000002a8;
  dword *in_stack_000002b0;
  dword *in_stack_000002b8;
  dword *in_stack_000002c0;
  dword *in_stack_000002c8;
  dword *in_stack_000002d0;
  undefined8 in_stack_000002d8;
  undefined8 in_stack_000002e0;
  
  auVar36._8_8_ = in_stack_00000150;
  auVar36._0_8_ = in_stack_00000148;
  do {
    if (unaff_x20 == 0) {
      uVar15 = 0;
      uVar7 = 4;
    }
    else {
      uVar7 = func_0x00187bd0(unaff_x20,4);
      if (uVar7 == 0) goto code_r0x004e3ed8;
      uVar15 = unaff_x19;
    }
    _memcpy(uVar7,unaff_x21,unaff_x20);
    uVar8 = 0;
    uVar25 = unaff_x26[0x2d];
    pdVar24 = in_stack_00000170;
    if ((uVar25 >> 0x3c != 0) ||
       (pdVar23 = (dword *)(uVar25 * 0x10), (dword *)0x7ffffffffffffff8 < pdVar23)) {
code_r0x004e3d58:
      in_stack_00000170 = pdVar24;
      func_0x007a1f00(uVar8,in_stack_00000170,&UNK_009e7fc8);
      goto code_r0x004e3f08;
    }
    uVar28 = *unaff_x26;
    uVar30 = unaff_x26[1];
    if (pdVar23 == (dword *)0x0) {
      in_stack_00000170 = &MACH_HEADER.cpusubtype;
      uStack00000000000001a8 = unaff_x26[2];
      iVar9 = (int)uStack00000000000001a8;
joined_r0x004e36a8:
      if (iVar9 != 1) goto code_r0x004e36ac;
code_r0x004e3758:
      uVar8 = unaff_x26[3];
      *(undefined8 *)(unaff_x29 + -0x98) = unaff_x26[4];
      *(undefined8 *)(unaff_x29 + -0xa0) = uVar8;
    }
    else {
      puVar22 = (undefined8 *)unaff_x26[0x2c];
      in_stack_00000170 = (dword *)func_0x00187bd0(pdVar23,8);
      uVar8 = 8;
      pdVar24 = pdVar23;
      if (in_stack_00000170 == (dword *)0x0) goto code_r0x004e3d58;
      if (uVar25 == 0) {
        uStack00000000000001a8 = unaff_x26[2];
        iVar9 = (int)uStack00000000000001a8;
        goto joined_r0x004e36a8;
      }
      uVar12 = uVar25 - 1;
      uVar11 = uVar25;
      if (uVar12 <= uVar25) {
        uVar11 = uVar12;
      }
      if (uVar11 < 4) {
code_r0x004e3684:
        lVar16 = 0;
        uVar11 = uVar25;
        puVar19 = puVar22;
      }
      else {
        uVar13 = uVar25;
        if (uVar12 <= uVar25) {
          uVar13 = uVar12;
        }
        if ((in_stack_00000170 < puVar22 + uVar13 * 2 + 2) &&
           (puVar22 < in_stack_00000170 + (uVar13 * 2 + 2) * 2)) goto code_r0x004e3684;
        uVar12 = uVar11 + 1 & 3;
        uVar13 = 4;
        if (uVar12 != 0) {
          uVar13 = uVar12;
        }
        lVar16 = (uVar11 + 1) - uVar13;
        uVar11 = uVar25 - lVar16;
        puVar19 = puVar22 + lVar16 * 2;
        puVar18 = (undefined8 *)(in_stack_00000170 + 8);
        puVar20 = puVar22 + 4;
        lVar21 = lVar16;
        do {
          uVar29 = puVar20[-3];
          uVar8 = puVar20[-2];
          uVar31 = puVar20[-1];
          uVar32 = *puVar20;
          uVar34 = puVar20[1];
          uVar33 = puVar20[2];
          uVar35 = puVar20[3];
          puVar18[-4] = puVar20[-4];
          puVar18[-3] = uVar29;
          puVar18[-2] = uVar8;
          puVar18[-1] = uVar31;
          *puVar18 = uVar32;
          puVar18[1] = uVar34;
          puVar18[2] = uVar33;
          puVar18[3] = uVar35;
          puVar18 = puVar18 + 8;
          puVar20 = puVar20 + 8;
          lVar21 = lVar21 + -4;
        } while (lVar21 != 0);
      }
      pdVar24 = in_stack_00000170 + (lVar16 * 2 + 1) * 2;
      do {
        if (puVar19 == puVar22 + uVar25 * 2) break;
        uVar8 = *puVar19;
        uVar29 = puVar19[1];
        ((mach_header *)(pdVar24 + -2))->magic = (int)uVar8;
        ((mach_header *)(pdVar24 + -2))->cputype = (int)((ulong)uVar8 >> 0x20);
        *(undefined8 *)pdVar24 = uVar29;
        pdVar24 = pdVar24 + 4;
        uVar11 = uVar11 - 1;
        puVar19 = puVar19 + 2;
      } while (uVar11 != 0);
      uStack00000000000001a8 = unaff_x26[2];
      if ((int)uStack00000000000001a8 == 1) goto code_r0x004e3758;
code_r0x004e36ac:
      uStack00000000000001a8 = 0;
    }
    uVar11 = unaff_x26[0x30];
    pdStack0000000000000068 = (dword *)(uVar11 * 0x10);
    if (uVar11 >> 0x3c != 0 || (dword *)0x7ffffffffffffff8 < pdStack0000000000000068) {
      in_stack_00000010 = 0;
      pdStack0000000000000068 = in_stack_00000050;
code_r0x004e3ea0:
      func_0x007a1f00(in_stack_00000010,pdStack0000000000000068,&UNK_009e7fc8);
      goto code_r0x004e3f08;
    }
    uVar2 = *(undefined4 *)((long)unaff_x26 + 0x24c);
    if (pdStack0000000000000068 == (dword *)0x0) {
      in_stack_00000050 = &MACH_HEADER.cpusubtype;
    }
    else {
      puVar22 = (undefined8 *)unaff_x26[0x2f];
      in_stack_00000050 = (dword *)func_0x00187bd0(pdStack0000000000000068,8);
      if (in_stack_00000050 == (dword *)0x0) goto code_r0x004e3ea0;
      if (uVar11 == 0) goto code_r0x004e38b4;
      uVar13 = uVar11 - 1;
      uVar12 = uVar11;
      if (uVar13 <= uVar11) {
        uVar12 = uVar13;
      }
      if (uVar12 < 4) {
code_r0x004e3800:
        lVar16 = 0;
        uVar12 = uVar11;
        puVar19 = puVar22;
      }
      else {
        uVar17 = uVar11;
        if (uVar13 <= uVar11) {
          uVar17 = uVar13;
        }
        if ((in_stack_00000050 < puVar22 + uVar17 * 2 + 2) &&
           (puVar22 < in_stack_00000050 + (uVar17 * 2 + 2) * 2)) goto code_r0x004e3800;
        uVar13 = uVar12 + 1 & 3;
        uVar17 = 4;
        if (uVar13 != 0) {
          uVar17 = uVar13;
        }
        lVar16 = (uVar12 + 1) - uVar17;
        uVar12 = uVar11 - lVar16;
        puVar19 = puVar22 + lVar16 * 2;
        puVar18 = (undefined8 *)(in_stack_00000050 + 8);
        puVar20 = puVar22 + 4;
        lVar21 = lVar16;
        do {
          uVar29 = puVar20[-3];
          uVar8 = puVar20[-2];
          uVar31 = puVar20[-1];
          uVar32 = *puVar20;
          uVar34 = puVar20[1];
          uVar33 = puVar20[2];
          uVar35 = puVar20[3];
          puVar18[-4] = puVar20[-4];
          puVar18[-3] = uVar29;
          puVar18[-2] = uVar8;
          puVar18[-1] = uVar31;
          *puVar18 = uVar32;
          puVar18[1] = uVar34;
          puVar18[2] = uVar33;
          puVar18[3] = uVar35;
          puVar18 = puVar18 + 8;
          puVar20 = puVar20 + 8;
          lVar21 = lVar21 + -4;
        } while (lVar21 != 0);
      }
      pdVar24 = in_stack_00000050 + (lVar16 * 2 + 1) * 2;
      do {
        if (puVar19 == puVar22 + uVar11 * 2) break;
        uVar8 = *puVar19;
        uVar29 = puVar19[1];
        ((mach_header *)(pdVar24 + -2))->magic = (int)uVar8;
        ((mach_header *)(pdVar24 + -2))->cputype = (int)((ulong)uVar8 >> 0x20);
        *(undefined8 *)pdVar24 = uVar29;
        pdVar24 = pdVar24 + 4;
        uVar12 = uVar12 - 1;
        puVar19 = puVar19 + 2;
      } while (uVar12 != 0);
    }
code_r0x004e38b4:
    uVar8 = 0;
    uVar12 = unaff_x26[0x33];
    auVar5._8_8_ = 0;
    auVar5._0_8_ = uVar12;
    if (SUB168(auVar5 * ZEXT816(0x30),8) != 0) {
code_r0x004e3ef8:
      func_0x007a1f00(uVar8,in_stack_00000040,&UNK_009e7fc8);
      goto code_r0x004e3f08;
    }
    uVar13 = uVar12 * 0x30;
    if (0x7ffffffffffffff8 < uVar13) goto code_r0x004e3ef8;
    if (uVar13 == 0) {
      in_stack_00000040 = 8;
    }
    else {
      puVar22 = (undefined8 *)unaff_x26[0x32];
      in_stack_00000040 = func_0x00187bd0(uVar13,8);
      if (in_stack_00000040 == 0) {
        uVar8 = 8;
        in_stack_00000040 = uVar13;
        goto code_r0x004e3ef8;
      }
      if (uVar12 != 0) {
        puVar19 = (undefined8 *)(in_stack_00000040 + 0x18);
        uVar17 = uVar12;
        do {
          if (uVar13 == 0) break;
          puVar18 = puVar22 + 1;
          uVar31 = *puVar22;
          uVar33 = puVar22[3];
          uVar32 = puVar22[2];
          uVar8 = puVar22[4];
          uVar29 = puVar22[5];
          puVar22 = puVar22 + 6;
          puVar19[-2] = *puVar18;
          puVar19[-3] = uVar31;
          *puVar19 = uVar33;
          puVar19[-1] = uVar32;
          puVar19[1] = uVar8;
          puVar19[2] = uVar29;
          uVar13 = uVar13 - 0x30;
          puVar19 = puVar19 + 6;
          uVar17 = uVar17 - 1;
        } while (uVar17 != 0);
      }
    }
    uVar13 = unaff_x26[0x36];
    pdVar24 = (dword *)(uVar13 * 0x10);
    if (uVar13 >> 0x3c != 0 || (dword *)0x7ffffffffffffff8 < pdVar24) {
      in_stack_00000010 = 0;
code_r0x004e3e7c:
      func_0x007a1f00(in_stack_00000010,in_stack_00000030,&UNK_009e7fc8);
      goto code_r0x004e3f08;
    }
    if (pdVar24 == (dword *)0x0) {
      pdStack0000000000000180 = &MACH_HEADER.cpusubtype;
    }
    else {
      puVar22 = (undefined8 *)unaff_x26[0x35];
      pdStack0000000000000180 = (dword *)func_0x00187bd0(pdVar24,8);
      in_stack_00000030 = pdVar24;
      if (pdStack0000000000000180 == (dword *)0x0) goto code_r0x004e3e7c;
      if (uVar13 == 0) goto code_r0x004e3ab0;
      uVar14 = uVar13 - 1;
      uVar17 = uVar13;
      if (uVar14 <= uVar13) {
        uVar17 = uVar14;
      }
      if (uVar17 < 4) {
code_r0x004e3a68:
        lVar16 = 0;
        uVar17 = uVar13;
        puVar19 = puVar22;
      }
      else {
        uVar1 = uVar13;
        if (uVar14 <= uVar13) {
          uVar1 = uVar14;
        }
        if (pdStack0000000000000180 < puVar22 + uVar1 * 2 + 2 &&
            puVar22 < pdStack0000000000000180 + (uVar1 * 2 + 2) * 2) goto code_r0x004e3a68;
        uVar14 = uVar17 + 1 & 3;
        uVar1 = 4;
        if (uVar14 != 0) {
          uVar1 = uVar14;
        }
        lVar16 = (uVar17 + 1) - uVar1;
        uVar17 = uVar13 - lVar16;
        puVar19 = puVar22 + lVar16 * 2;
        puVar18 = (undefined8 *)(pdStack0000000000000180 + 8);
        puVar20 = puVar22 + 4;
        lVar21 = lVar16;
        do {
          uVar29 = puVar20[-3];
          uVar8 = puVar20[-2];
          uVar31 = puVar20[-1];
          uVar32 = *puVar20;
          uVar34 = puVar20[1];
          uVar33 = puVar20[2];
          uVar35 = puVar20[3];
          puVar18[-4] = puVar20[-4];
          puVar18[-3] = uVar29;
          puVar18[-2] = uVar8;
          puVar18[-1] = uVar31;
          *puVar18 = uVar32;
          puVar18[1] = uVar34;
          puVar18[2] = uVar33;
          puVar18[3] = uVar35;
          puVar18 = puVar18 + 8;
          puVar20 = puVar20 + 8;
          lVar21 = lVar21 + -4;
        } while (lVar21 != 0);
      }
      pdVar24 = pdStack0000000000000180 + (lVar16 * 2 + 1) * 2;
      do {
        if (puVar19 == puVar22 + uVar13 * 2) break;
        uVar8 = *puVar19;
        uVar29 = puVar19[1];
        ((mach_header *)(pdVar24 + -2))->magic = (int)uVar8;
        ((mach_header *)(pdVar24 + -2))->cputype = (int)((ulong)uVar8 >> 0x20);
        *(undefined8 *)pdVar24 = uVar29;
        pdVar24 = pdVar24 + 4;
        uVar17 = uVar17 - 1;
        puVar19 = puVar19 + 2;
      } while (uVar17 != 0);
    }
code_r0x004e3ab0:
    uVar35 = unaff_x26[0x47];
    uVar33 = unaff_x26[0x48];
    uVar8 = unaff_x26[5];
    uVar31 = unaff_x26[6];
    uVar29 = unaff_x26[7];
    uVar32 = unaff_x26[8];
    uVar34 = unaff_x26[9];
    func_0x004e97f4(unaff_x29 + -0x90,unaff_x26 + 0x37);
    puVar19 = (undefined8 *)(unaff_x29 + -0x90);
    uVar27 = *(undefined8 *)(unaff_x29 + -0x78);
    uVar26 = *(undefined8 *)(unaff_x29 + -0x80);
    *(undefined8 *)(unaff_x29 + -0x80) = *(undefined8 *)(unaff_x29 + -0xa8);
    puVar22 = (undefined8 *)(in_stack_00000140 + in_stack_00000258 * 600);
    *puVar22 = uVar28;
    puVar22[1] = uVar30;
    puVar22[2] = uStack00000000000001a8;
    puVar22[5] = uVar8;
    puVar22[6] = uVar31;
    puVar22[7] = uVar29;
    puVar22[8] = uVar32;
    puVar22[9] = uVar34;
    puVar22[10] = in_stack_00000248;
    puVar22[0xe] = in_stack_00000240;
    puVar22[0x11] = in_stack_00000238;
    puVar22[0xd] = in_stack_000002a0;
    puVar22[0xf] = in_stack_000002a0;
    puVar22[0x10] = in_stack_00000298;
    puVar22[0x12] = in_stack_00000298;
    puVar22[0x14] = in_stack_000002d0;
    puVar22[0x17] = in_stack_000002c8;
    puVar22[0x13] = in_stack_00000290;
    puVar22[0x15] = in_stack_00000290;
    puVar22[0x16] = in_stack_00000288;
    puVar22[0x18] = in_stack_00000288;
    puVar22[0x1a] = in_stack_000002c0;
    puVar22[0x1d] = in_stack_000002b8;
    puVar22[0x19] = in_stack_00000280;
    puVar22[0x1b] = in_stack_00000280;
    puVar22[0x1c] = in_stack_00000278;
    puVar22[0x1e] = in_stack_00000278;
    puVar22[0x20] = in_stack_000002b0;
    puVar22[0x23] = in_stack_000002a8;
    puVar22[0x1f] = in_stack_00000270;
    puVar22[0x21] = in_stack_00000270;
    puVar22[0x22] = in_stack_00000268;
    puVar22[0x24] = in_stack_00000268;
    puVar22[0x26] = in_stack_00000200;
    puVar22[0x25] = in_stack_000001d0;
    puVar22[0x27] = in_stack_000001d0;
    puVar22[0x28] = uVar15;
    puVar22[0x2a] = unaff_x19;
    puVar22[0x2c] = in_stack_00000170;
    puVar22[0x2f] = in_stack_00000050;
    puVar22[0x2b] = uVar25;
    puVar22[0x2d] = uVar25;
    puVar22[0x2e] = uVar11;
    puVar22[0x30] = uVar11;
    puVar22[0x32] = in_stack_00000040;
    puVar22[0x31] = uVar12;
    puVar22[0x33] = uVar12;
    puVar22[0x34] = uVar13;
    puVar22[0x35] = pdStack0000000000000180;
    puVar22[0x36] = uVar13;
    *(undefined8 *)(unaff_x29 + -0xf8) = *(undefined8 *)(unaff_x29 + -0x88);
    *(undefined8 *)(unaff_x29 + -0x100) = *puVar19;
    *(undefined8 *)(unaff_x29 + -0xe8) = uVar27;
    *(undefined8 *)(unaff_x29 + -0xf0) = uVar26;
    *(undefined8 *)(unaff_x29 + -0xd8) = *(undefined8 *)(unaff_x29 + -0x68);
    *(undefined8 *)(unaff_x29 + -0xe0) = *(undefined8 *)(unaff_x29 + -0x70);
    *(undefined8 *)(unaff_x29 + -0x88) = *(undefined8 *)(unaff_x29 + -0xb0);
    *puVar19 = *(undefined8 *)(unaff_x29 + -0xb8);
    uVar8 = *(undefined8 *)(unaff_x29 + -0xf0);
    uVar30 = *(undefined8 *)(unaff_x29 + -0xd8);
    uVar28 = *(undefined8 *)(unaff_x29 + -0xe0);
    puVar22[0x3a] = *(undefined8 *)(unaff_x29 + -0xe8);
    puVar22[0x39] = uVar8;
    puVar22[0x3c] = uVar30;
    puVar22[0x3b] = uVar28;
    uVar8 = *(undefined8 *)(unaff_x29 + -0x100);
    puVar22[0x38] = *(undefined8 *)(unaff_x29 + -0xf8);
    puVar22[0x37] = uVar8;
    uVar8 = *puVar19;
    puVar22[0x3e] = *(undefined8 *)(unaff_x29 + -0x88);
    puVar22[0x3d] = uVar8;
    puVar22[0x3f] = *(undefined8 *)(unaff_x29 + -0x80);
    puVar22[0x40] = in_stack_00000250;
    puVar22[0x43] = in_stack_00000228;
    puVar22[0x44] = in_stack_00000220;
    puVar22[0x45] = in_stack_000001e8;
    puVar22[0x46] = in_stack_000001e0;
    puVar22[0x47] = uVar35;
    puVar22[0x48] = uVar33;
    *(undefined4 *)(puVar22 + 0x49) = in_stack_000001f4;
    *(undefined4 *)((long)puVar22 + 0x24c) = uVar2;
    *(undefined4 *)(puVar22 + 0x4a) = in_stack_00000214;
    *(undefined1 *)((long)puVar22 + 0x254) = in_stack_00000234;
    puVar22[0x29] = uVar7;
    uVar28 = *(undefined8 *)(unaff_x29 + -0x98);
    uVar8 = *(undefined8 *)(unaff_x29 + -0xa0);
    puVar22[4] = uVar28;
    puVar22[3] = uVar8;
    *(undefined1 (*) [16])(puVar22 + 0xb) = auVar36;
    puVar22[0x41] = in_stack_00000168;
    puVar22[0x42] = in_stack_00000160;
    in_stack_00000258 = in_stack_00000258 + 1;
    *(undefined8 *)(unaff_x29 + -200) = uVar28;
    *(undefined8 *)(unaff_x29 + -0xd0) = uVar8;
    in_stack_00000218 = in_stack_00000218 + -1;
    if ((in_stack_00000218 == 0) || (unaff_x26 + 0x4b == in_stack_00000138)) {
      in_stack_00000018[1] = in_stack_000002e0;
      *in_stack_00000018 = in_stack_000002d8;
      in_stack_00000018[2] = in_stack_00000020;
      return;
    }
    in_stack_00000228 = unaff_x26[0x8e];
    in_stack_00000220 = unaff_x26[0x8f];
    if (unaff_x26[0x88] == -0x8000000000000000) {
      *(undefined8 *)(unaff_x29 + -0xb8) = 0x8000000000000000;
    }
    else {
      func_0x0045cd08(unaff_x29 + -0xb8,unaff_x26 + 0x88);
    }
    in_stack_00000250 = 0x8000000000000000;
    if (unaff_x26[0x8b] != -0x8000000000000000) {
      func_0x0045cd08(unaff_x29 + -0x90,unaff_x26 + 0x8b);
      in_stack_00000250 = *(undefined8 *)(unaff_x29 + -0x90);
      in_stack_00000168 = *(undefined8 *)(unaff_x29 + -0x88);
      in_stack_00000160 = *(undefined8 *)(unaff_x29 + -0x80);
    }
    in_stack_00000234 = *(undefined1 *)((long)unaff_x26 + 0x4ac);
    in_stack_00000248 = unaff_x26[0x55];
    if ((in_stack_00000248 != 5) && (3 < in_stack_00000248)) {
      auVar36 = (**(code **)(unaff_x26[0x57] + 0x38))(unaff_x26[0x56]);
    }
    uVar8 = 0;
    in_stack_000002a0 = unaff_x26[0x5a];
    pdVar24 = in_stack_00000178;
    if ((in_stack_000002a0 >> 0x3c != 0) ||
       (pdVar23 = (dword *)(in_stack_000002a0 * 0x10), (dword *)0x7ffffffffffffff8 < pdVar23)) {
code_r0x004e3d44:
      in_stack_00000178 = pdVar24;
      func_0x007a1f00(uVar8,in_stack_00000178,&UNK_009e7fc8);
      goto code_r0x004e3f08;
    }
    if (pdVar23 == (dword *)0x0) {
      in_stack_00000178 = &MACH_HEADER.cpusubtype;
    }
    else {
      puVar22 = (undefined8 *)unaff_x26[0x59];
      in_stack_00000178 = (dword *)func_0x00187bd0(pdVar23,8);
      uVar8 = 8;
      pdVar24 = pdVar23;
      if (in_stack_00000178 == (dword *)0x0) goto code_r0x004e3d44;
      if (in_stack_000002a0 == 0) goto code_r0x004e2bb8;
      uVar25 = in_stack_000002a0 - 1;
      uVar15 = in_stack_000002a0;
      if (uVar25 <= in_stack_000002a0) {
        uVar15 = uVar25;
      }
      if (uVar15 < 4) {
code_r0x004e2b04:
        lVar16 = 0;
        uVar15 = in_stack_000002a0;
        puVar19 = puVar22;
      }
      else {
        uVar11 = in_stack_000002a0;
        if (uVar25 <= in_stack_000002a0) {
          uVar11 = uVar25;
        }
        if ((in_stack_00000178 < puVar22 + uVar11 * 2 + 2) &&
           (puVar22 < in_stack_00000178 + (uVar11 * 2 + 2) * 2)) goto code_r0x004e2b04;
        uVar25 = uVar15 + 1 & 3;
        uVar11 = 4;
        if (uVar25 != 0) {
          uVar11 = uVar25;
        }
        lVar16 = (uVar15 + 1) - uVar11;
        uVar15 = in_stack_000002a0 - lVar16;
        puVar19 = puVar22 + lVar16 * 2;
        puVar18 = (undefined8 *)(in_stack_00000178 + 8);
        puVar20 = puVar22 + 4;
        lVar21 = lVar16;
        do {
          uVar28 = puVar20[-3];
          uVar8 = puVar20[-2];
          uVar30 = puVar20[-1];
          uVar29 = *puVar20;
          uVar32 = puVar20[1];
          uVar31 = puVar20[2];
          uVar33 = puVar20[3];
          puVar18[-4] = puVar20[-4];
          puVar18[-3] = uVar28;
          puVar18[-2] = uVar8;
          puVar18[-1] = uVar30;
          *puVar18 = uVar29;
          puVar18[1] = uVar32;
          puVar18[2] = uVar31;
          puVar18[3] = uVar33;
          puVar18 = puVar18 + 8;
          puVar20 = puVar20 + 8;
          lVar21 = lVar21 + -4;
        } while (lVar21 != 0);
      }
      pdVar24 = in_stack_00000178 + (lVar16 * 2 + 1) * 2;
      do {
        if (puVar19 == puVar22 + in_stack_000002a0 * 2) break;
        uVar8 = *puVar19;
        uVar28 = puVar19[1];
        ((mach_header *)(pdVar24 + -2))->magic = (int)uVar8;
        ((mach_header *)(pdVar24 + -2))->cputype = (int)((ulong)uVar8 >> 0x20);
        *(undefined8 *)pdVar24 = uVar28;
        pdVar24 = pdVar24 + 4;
        uVar15 = uVar15 - 1;
        puVar19 = puVar19 + 2;
      } while (uVar15 != 0);
    }
code_r0x004e2bb8:
    in_stack_00000298 = unaff_x26[0x5d];
    pdStack0000000000000120 = (dword *)(in_stack_00000298 * 0x10);
    if (in_stack_00000298 >> 0x3c != 0 || (dword *)0x7ffffffffffffff8 < pdStack0000000000000120) {
      in_stack_00000010 = 0;
      pdStack0000000000000120 = in_stack_000000d0;
code_r0x004e3d9c:
      func_0x007a1f00(in_stack_00000010,pdStack0000000000000120,&UNK_009e7fc8);
      goto code_r0x004e3f08;
    }
    in_stack_00000214 = *(undefined4 *)(unaff_x26 + 0x95);
    if (pdStack0000000000000120 == (dword *)0x0) {
      in_stack_000000d0 = &MACH_HEADER.cpusubtype;
    }
    else {
      puVar22 = (undefined8 *)unaff_x26[0x5c];
      in_stack_000000d0 = (dword *)func_0x00187bd0(pdStack0000000000000120,8);
      if (in_stack_000000d0 == (dword *)0x0) goto code_r0x004e3d9c;
      if (in_stack_00000298 == 0) goto code_r0x004e2d08;
      uVar25 = in_stack_00000298 - 1;
      uVar15 = in_stack_00000298;
      if (uVar25 <= in_stack_00000298) {
        uVar15 = uVar25;
      }
      if (uVar15 < 4) {
code_r0x004e2c54:
        lVar16 = 0;
        uVar15 = in_stack_00000298;
        puVar19 = puVar22;
      }
      else {
        uVar11 = in_stack_00000298;
        if (uVar25 <= in_stack_00000298) {
          uVar11 = uVar25;
        }
        if ((in_stack_000000d0 < puVar22 + uVar11 * 2 + 2) &&
           (puVar22 < in_stack_000000d0 + (uVar11 * 2 + 2) * 2)) goto code_r0x004e2c54;
        uVar25 = uVar15 + 1 & 3;
        uVar11 = 4;
        if (uVar25 != 0) {
          uVar11 = uVar25;
        }
        lVar16 = (uVar15 + 1) - uVar11;
        uVar15 = in_stack_00000298 - lVar16;
        puVar19 = puVar22 + lVar16 * 2;
        puVar18 = (undefined8 *)(in_stack_000000d0 + 8);
        puVar20 = puVar22 + 4;
        lVar21 = lVar16;
        do {
          uVar28 = puVar20[-3];
          uVar8 = puVar20[-2];
          uVar30 = puVar20[-1];
          uVar29 = *puVar20;
          uVar32 = puVar20[1];
          uVar31 = puVar20[2];
          uVar33 = puVar20[3];
          puVar18[-4] = puVar20[-4];
          puVar18[-3] = uVar28;
          puVar18[-2] = uVar8;
          puVar18[-1] = uVar30;
          *puVar18 = uVar29;
          puVar18[1] = uVar32;
          puVar18[2] = uVar31;
          puVar18[3] = uVar33;
          puVar18 = puVar18 + 8;
          puVar20 = puVar20 + 8;
          lVar21 = lVar21 + -4;
        } while (lVar21 != 0);
      }
      pdVar24 = in_stack_000000d0 + (lVar16 * 2 + 1) * 2;
      do {
        if (puVar19 == puVar22 + in_stack_00000298 * 2) break;
        uVar8 = *puVar19;
        uVar28 = puVar19[1];
        ((mach_header *)(pdVar24 + -2))->magic = (int)uVar8;
        ((mach_header *)(pdVar24 + -2))->cputype = (int)((ulong)uVar8 >> 0x20);
        *(undefined8 *)pdVar24 = uVar28;
        pdVar24 = pdVar24 + 4;
        uVar15 = uVar15 - 1;
        puVar19 = puVar19 + 2;
      } while (uVar15 != 0);
    }
code_r0x004e2d08:
    in_stack_00000290 = unaff_x26[0x60];
    pdStack0000000000000110 = (dword *)(in_stack_00000290 * 0x10);
    if (in_stack_00000290 >> 0x3c != 0 || (dword *)0x7ffffffffffffff8 < pdStack0000000000000110) {
      in_stack_00000010 = 0;
      pdStack0000000000000110 = in_stack_000000c0;
code_r0x004e3de4:
      func_0x007a1f00(in_stack_00000010,pdStack0000000000000110,&UNK_009e7fc8);
      goto code_r0x004e3f08;
    }
    if (pdStack0000000000000110 == (dword *)0x0) {
      in_stack_000000c0 = &MACH_HEADER.cpusubtype;
    }
    else {
      puVar22 = (undefined8 *)unaff_x26[0x5f];
      in_stack_000000c0 = (dword *)func_0x00187bd0(pdStack0000000000000110,8);
      if (in_stack_000000c0 == (dword *)0x0) goto code_r0x004e3de4;
      if (in_stack_00000290 == 0) goto code_r0x004e2e5c;
      uVar25 = in_stack_00000290 - 1;
      uVar15 = in_stack_00000290;
      if (uVar25 <= in_stack_00000290) {
        uVar15 = uVar25;
      }
      if (uVar15 < 4) {
code_r0x004e2d9c:
        lVar16 = 0;
        uVar15 = in_stack_00000290;
        puVar19 = puVar22;
      }
      else {
        uVar11 = in_stack_00000290;
        if (uVar25 <= in_stack_00000290) {
          uVar11 = uVar25;
        }
        if ((in_stack_000000c0 < puVar22 + uVar11 * 2 + 2) &&
           (puVar22 < in_stack_000000c0 + (uVar11 * 2 + 2) * 2)) goto code_r0x004e2d9c;
        uVar25 = uVar15 + 1 & 3;
        uVar11 = 4;
        if (uVar25 != 0) {
          uVar11 = uVar25;
        }
        lVar16 = (uVar15 + 1) - uVar11;
        uVar15 = in_stack_00000290 - lVar16;
        puVar19 = puVar22 + lVar16 * 2;
        puVar18 = (undefined8 *)(in_stack_000000c0 + 8);
        puVar20 = puVar22 + 4;
        lVar21 = lVar16;
        do {
          uVar28 = puVar20[-3];
          uVar8 = puVar20[-2];
          uVar30 = puVar20[-1];
          uVar29 = *puVar20;
          uVar32 = puVar20[1];
          uVar31 = puVar20[2];
          uVar33 = puVar20[3];
          puVar18[-4] = puVar20[-4];
          puVar18[-3] = uVar28;
          puVar18[-2] = uVar8;
          puVar18[-1] = uVar30;
          *puVar18 = uVar29;
          puVar18[1] = uVar32;
          puVar18[2] = uVar31;
          puVar18[3] = uVar33;
          puVar18 = puVar18 + 8;
          puVar20 = puVar20 + 8;
          lVar21 = lVar21 + -4;
        } while (lVar21 != 0);
      }
      pdVar24 = in_stack_000000c0 + (lVar16 * 2 + 1) * 2;
      do {
        if (puVar19 == puVar22 + in_stack_00000290 * 2) break;
        uVar8 = *puVar19;
        uVar28 = puVar19[1];
        ((mach_header *)(pdVar24 + -2))->magic = (int)uVar8;
        ((mach_header *)(pdVar24 + -2))->cputype = (int)((ulong)uVar8 >> 0x20);
        *(undefined8 *)pdVar24 = uVar28;
        pdVar24 = pdVar24 + 4;
        uVar15 = uVar15 - 1;
        puVar19 = puVar19 + 2;
      } while (uVar15 != 0);
    }
code_r0x004e2e5c:
    in_stack_00000288 = unaff_x26[99];
    pdStack0000000000000100 = (dword *)(in_stack_00000288 * 0x20);
    if (in_stack_00000288 >> 0x3b != 0 || (dword *)0x7ffffffffffffff8 < pdStack0000000000000100) {
      in_stack_00000010 = 0;
      pdStack0000000000000100 = in_stack_000000b0;
code_r0x004e3e38:
      func_0x007a1f00(in_stack_00000010,pdStack0000000000000100,&UNK_009e7fc8);
      goto code_r0x004e3f08;
    }
    if (pdStack0000000000000100 == (dword *)0x0) {
      in_stack_000000b0 = &MACH_HEADER.cpusubtype;
    }
    else {
      puVar22 = (undefined8 *)unaff_x26[0x62];
      in_stack_000000b0 = (dword *)func_0x00187bd0(pdStack0000000000000100,8);
      if (in_stack_000000b0 == (dword *)0x0) goto code_r0x004e3e38;
      if (in_stack_00000288 == 0) goto code_r0x004e2f94;
      uVar25 = in_stack_00000288 - 1;
      uVar15 = in_stack_00000288;
      if (uVar25 <= in_stack_00000288) {
        uVar15 = uVar25;
      }
      if (uVar15 < 2) {
code_r0x004e2f38:
        uVar15 = 0;
        uVar25 = in_stack_00000288;
        puVar19 = puVar22;
      }
      else {
        uVar11 = in_stack_00000288;
        if (uVar25 <= in_stack_00000288) {
          uVar11 = uVar25;
        }
        if (in_stack_000000b0 < puVar22 + uVar11 * 4 + 4 &&
            puVar22 < in_stack_000000b0 + (uVar11 * 4 + 4) * 2) goto code_r0x004e2f38;
        uVar15 = uVar15 & 0x7fffffffffffffe;
        uVar25 = in_stack_00000288 - uVar15;
        puVar19 = puVar22 + uVar15 * 4;
        uVar11 = uVar15;
        puVar18 = puVar22;
        pdVar24 = in_stack_000000b0;
        do {
          uVar29 = puVar18[5];
          uVar30 = puVar18[4];
          uVar28 = puVar18[7];
          uVar8 = puVar18[6];
          uVar33 = puVar18[1];
          uVar32 = puVar18[3];
          uVar31 = puVar18[2];
          *(undefined8 *)pdVar24 = *puVar18;
          *(undefined8 *)(pdVar24 + 2) = uVar33;
          *(undefined8 *)(pdVar24 + 4) = uVar31;
          *(undefined8 *)(pdVar24 + 6) = uVar32;
          *(undefined8 *)(pdVar24 + 8) = uVar30;
          *(undefined8 *)(pdVar24 + 10) = uVar29;
          *(undefined8 *)(pdVar24 + 0xc) = uVar8;
          *(undefined8 *)(pdVar24 + 0xe) = uVar28;
          pdVar24 = pdVar24 + 0x10;
          uVar11 = uVar11 - 2;
          puVar18 = puVar18 + 8;
        } while (uVar11 != 0);
      }
      pdVar24 = in_stack_000000b0 + (uVar15 * 4 + 2) * 2;
      do {
        if (puVar19 == puVar22 + in_stack_00000288 * 4) break;
        uVar29 = puVar19[1];
        uVar30 = *puVar19;
        uVar8 = puVar19[2];
        uVar28 = puVar19[3];
        ((mach_header *)(pdVar24 + -2))->magic = (int)uVar29;
        ((mach_header *)(pdVar24 + -2))->cputype = (int)((ulong)uVar29 >> 0x20);
        *(undefined8 *)(pdVar24 + -4) = uVar30;
        *(undefined8 *)pdVar24 = uVar8;
        *(undefined8 *)(pdVar24 + 2) = uVar28;
        puVar19 = puVar19 + 4;
        uVar25 = uVar25 - 1;
        pdVar24 = pdVar24 + 8;
      } while (uVar25 != 0);
    }
code_r0x004e2f94:
    in_stack_00000280 = unaff_x26[0x66];
    pdStack00000000000000f0 = (dword *)(in_stack_00000280 * 0x20);
    if (in_stack_00000280 >> 0x3b != 0 || (dword *)0x7ffffffffffffff8 < pdStack00000000000000f0) {
      in_stack_00000010 = 0;
      pdStack00000000000000f0 = in_stack_000000a0;
code_r0x004e3e5c:
      func_0x007a1f00(in_stack_00000010,pdStack00000000000000f0,&UNK_009e7fc8);
      goto code_r0x004e3f08;
    }
    if (pdStack00000000000000f0 == (dword *)0x0) {
      in_stack_000000a0 = &MACH_HEADER.cpusubtype;
    }
    else {
      puVar22 = (undefined8 *)unaff_x26[0x65];
      in_stack_000000a0 = (dword *)func_0x00187bd0(pdStack00000000000000f0,8);
      if (in_stack_000000a0 == (dword *)0x0) goto code_r0x004e3e5c;
      if (in_stack_00000280 == 0) goto code_r0x004e30cc;
      uVar25 = in_stack_00000280 - 1;
      uVar15 = in_stack_00000280;
      if (uVar25 <= in_stack_00000280) {
        uVar15 = uVar25;
      }
      if (uVar15 < 2) {
code_r0x004e3070:
        uVar15 = 0;
        uVar25 = in_stack_00000280;
        puVar19 = puVar22;
      }
      else {
        uVar11 = in_stack_00000280;
        if (uVar25 <= in_stack_00000280) {
          uVar11 = uVar25;
        }
        if (in_stack_000000a0 < puVar22 + uVar11 * 4 + 4 &&
            puVar22 < in_stack_000000a0 + (uVar11 * 4 + 4) * 2) goto code_r0x004e3070;
        uVar15 = uVar15 & 0x7fffffffffffffe;
        uVar25 = in_stack_00000280 - uVar15;
        puVar19 = puVar22 + uVar15 * 4;
        uVar11 = uVar15;
        puVar18 = puVar22;
        pdVar24 = in_stack_000000a0;
        do {
          uVar29 = puVar18[5];
          uVar30 = puVar18[4];
          uVar28 = puVar18[7];
          uVar8 = puVar18[6];
          uVar33 = puVar18[1];
          uVar32 = puVar18[3];
          uVar31 = puVar18[2];
          *(undefined8 *)pdVar24 = *puVar18;
          *(undefined8 *)(pdVar24 + 2) = uVar33;
          *(undefined8 *)(pdVar24 + 4) = uVar31;
          *(undefined8 *)(pdVar24 + 6) = uVar32;
          *(undefined8 *)(pdVar24 + 8) = uVar30;
          *(undefined8 *)(pdVar24 + 10) = uVar29;
          *(undefined8 *)(pdVar24 + 0xc) = uVar8;
          *(undefined8 *)(pdVar24 + 0xe) = uVar28;
          pdVar24 = pdVar24 + 0x10;
          uVar11 = uVar11 - 2;
          puVar18 = puVar18 + 8;
        } while (uVar11 != 0);
      }
      pdVar24 = in_stack_000000a0 + (uVar15 * 4 + 2) * 2;
      do {
        if (puVar19 == puVar22 + in_stack_00000280 * 4) break;
        uVar29 = puVar19[1];
        uVar30 = *puVar19;
        uVar8 = puVar19[2];
        uVar28 = puVar19[3];
        ((mach_header *)(pdVar24 + -2))->magic = (int)uVar29;
        ((mach_header *)(pdVar24 + -2))->cputype = (int)((ulong)uVar29 >> 0x20);
        *(undefined8 *)(pdVar24 + -4) = uVar30;
        *(undefined8 *)pdVar24 = uVar8;
        *(undefined8 *)(pdVar24 + 2) = uVar28;
        puVar19 = puVar19 + 4;
        uVar25 = uVar25 - 1;
        pdVar24 = pdVar24 + 8;
      } while (uVar25 != 0);
    }
code_r0x004e30cc:
    in_stack_00000278 = unaff_x26[0x69];
    pdStack00000000000000e0 = (dword *)(in_stack_00000278 * 0x20);
    if (in_stack_00000278 >> 0x3b != 0 || (dword *)0x7ffffffffffffff8 < pdStack00000000000000e0) {
      in_stack_00000010 = 0;
      pdStack00000000000000e0 = in_stack_00000098;
code_r0x004e3d78:
      func_0x007a1f00(in_stack_00000010,pdStack00000000000000e0,&UNK_009e7fc8);
      goto code_r0x004e3f08;
    }
    if (pdStack00000000000000e0 == (dword *)0x0) {
      in_stack_00000098 = &MACH_HEADER.cpusubtype;
    }
    else {
      puVar22 = (undefined8 *)unaff_x26[0x68];
      in_stack_00000098 = (dword *)func_0x00187bd0(pdStack00000000000000e0,8);
      if (in_stack_00000098 == (dword *)0x0) goto code_r0x004e3d78;
      if (in_stack_00000278 == 0) goto code_r0x004e3204;
      uVar25 = in_stack_00000278 - 1;
      uVar15 = in_stack_00000278;
      if (uVar25 <= in_stack_00000278) {
        uVar15 = uVar25;
      }
      if (uVar15 < 2) {
code_r0x004e31a8:
        uVar15 = 0;
        uVar25 = in_stack_00000278;
        puVar19 = puVar22;
      }
      else {
        uVar11 = in_stack_00000278;
        if (uVar25 <= in_stack_00000278) {
          uVar11 = uVar25;
        }
        if (in_stack_00000098 < puVar22 + uVar11 * 4 + 4 &&
            puVar22 < in_stack_00000098 + (uVar11 * 4 + 4) * 2) goto code_r0x004e31a8;
        uVar15 = uVar15 & 0x7fffffffffffffe;
        uVar25 = in_stack_00000278 - uVar15;
        puVar19 = puVar22 + uVar15 * 4;
        uVar11 = uVar15;
        puVar18 = puVar22;
        pdVar24 = in_stack_00000098;
        do {
          uVar29 = puVar18[5];
          uVar30 = puVar18[4];
          uVar28 = puVar18[7];
          uVar8 = puVar18[6];
          uVar33 = puVar18[1];
          uVar32 = puVar18[3];
          uVar31 = puVar18[2];
          *(undefined8 *)pdVar24 = *puVar18;
          *(undefined8 *)(pdVar24 + 2) = uVar33;
          *(undefined8 *)(pdVar24 + 4) = uVar31;
          *(undefined8 *)(pdVar24 + 6) = uVar32;
          *(undefined8 *)(pdVar24 + 8) = uVar30;
          *(undefined8 *)(pdVar24 + 10) = uVar29;
          *(undefined8 *)(pdVar24 + 0xc) = uVar8;
          *(undefined8 *)(pdVar24 + 0xe) = uVar28;
          pdVar24 = pdVar24 + 0x10;
          uVar11 = uVar11 - 2;
          puVar18 = puVar18 + 8;
        } while (uVar11 != 0);
      }
      pdVar24 = in_stack_00000098 + (uVar15 * 4 + 2) * 2;
      do {
        if (puVar19 == puVar22 + in_stack_00000278 * 4) break;
        uVar29 = puVar19[1];
        uVar30 = *puVar19;
        uVar8 = puVar19[2];
        uVar28 = puVar19[3];
        ((mach_header *)(pdVar24 + -2))->magic = (int)uVar29;
        ((mach_header *)(pdVar24 + -2))->cputype = (int)((ulong)uVar29 >> 0x20);
        *(undefined8 *)(pdVar24 + -4) = uVar30;
        *(undefined8 *)pdVar24 = uVar8;
        *(undefined8 *)(pdVar24 + 2) = uVar28;
        puVar19 = puVar19 + 4;
        uVar25 = uVar25 - 1;
        pdVar24 = pdVar24 + 8;
      } while (uVar25 != 0);
    }
code_r0x004e3204:
    in_stack_00000270 = unaff_x26[0x6c];
    pdStack00000000000000d8 = (dword *)(in_stack_00000270 * 0x10);
    if (in_stack_00000270 >> 0x3c != 0 || (dword *)0x7ffffffffffffff8 < pdStack00000000000000d8) {
      in_stack_00000010 = 0;
      pdStack00000000000000d8 = in_stack_00000088;
code_r0x004e3dc0:
      func_0x007a1f00(in_stack_00000010,pdStack00000000000000d8,&UNK_009e7fc8);
      goto code_r0x004e3f08;
    }
    if (pdStack00000000000000d8 == (dword *)0x0) {
      in_stack_00000088 = &MACH_HEADER.cpusubtype;
    }
    else {
      puVar22 = (undefined8 *)unaff_x26[0x6b];
      in_stack_00000088 = (dword *)func_0x00187bd0(pdStack00000000000000d8,8);
      if (in_stack_00000088 == (dword *)0x0) goto code_r0x004e3dc0;
      if (in_stack_00000270 == 0) goto code_r0x004e334c;
      uVar25 = in_stack_00000270 - 1;
      uVar15 = in_stack_00000270;
      if (uVar25 <= in_stack_00000270) {
        uVar15 = uVar25;
      }
      if (uVar15 < 4) {
code_r0x004e3290:
        lVar16 = 0;
        uVar15 = in_stack_00000270;
        puVar19 = puVar22;
      }
      else {
        uVar11 = in_stack_00000270;
        if (uVar25 <= in_stack_00000270) {
          uVar11 = uVar25;
        }
        if ((in_stack_00000088 < puVar22 + uVar11 * 2 + 2) &&
           (puVar22 < in_stack_00000088 + (uVar11 * 2 + 2) * 2)) goto code_r0x004e3290;
        uVar25 = uVar15 + 1 & 3;
        uVar11 = 4;
        if (uVar25 != 0) {
          uVar11 = uVar25;
        }
        lVar16 = (uVar15 + 1) - uVar11;
        uVar15 = in_stack_00000270 - lVar16;
        puVar19 = puVar22 + lVar16 * 2;
        puVar18 = (undefined8 *)(in_stack_00000088 + 8);
        puVar20 = puVar22 + 4;
        lVar21 = lVar16;
        do {
          uVar28 = puVar20[-3];
          uVar8 = puVar20[-2];
          uVar30 = puVar20[-1];
          uVar29 = *puVar20;
          uVar32 = puVar20[1];
          uVar31 = puVar20[2];
          uVar33 = puVar20[3];
          puVar18[-4] = puVar20[-4];
          puVar18[-3] = uVar28;
          puVar18[-2] = uVar8;
          puVar18[-1] = uVar30;
          *puVar18 = uVar29;
          puVar18[1] = uVar32;
          puVar18[2] = uVar31;
          puVar18[3] = uVar33;
          puVar18 = puVar18 + 8;
          puVar20 = puVar20 + 8;
          lVar21 = lVar21 + -4;
        } while (lVar21 != 0);
      }
      pdVar24 = in_stack_00000088 + (lVar16 * 2 + 1) * 2;
      do {
        if (puVar19 == puVar22 + in_stack_00000270 * 2) break;
        uVar8 = *puVar19;
        uVar28 = puVar19[1];
        ((mach_header *)(pdVar24 + -2))->magic = (int)uVar8;
        ((mach_header *)(pdVar24 + -2))->cputype = (int)((ulong)uVar8 >> 0x20);
        *(undefined8 *)pdVar24 = uVar28;
        pdVar24 = pdVar24 + 4;
        uVar15 = uVar15 - 1;
        puVar19 = puVar19 + 2;
      } while (uVar15 != 0);
    }
code_r0x004e334c:
    in_stack_00000268 = unaff_x26[0x6f];
    pdStack00000000000000b8 = (dword *)(in_stack_00000268 * 0x10);
    if (in_stack_00000268 >> 0x3c != 0 || (dword *)0x7ffffffffffffff8 < pdStack00000000000000b8) {
      in_stack_00000010 = 0;
      pdStack00000000000000b8 = in_stack_00000078;
code_r0x004e3e08:
      func_0x007a1f00(in_stack_00000010,pdStack00000000000000b8,&UNK_009e7fc8);
      goto code_r0x004e3f08;
    }
    if (pdStack00000000000000b8 == (dword *)0x0) {
      in_stack_00000078 = &MACH_HEADER.cpusubtype;
    }
    else {
      puVar22 = (undefined8 *)unaff_x26[0x6e];
      in_stack_00000078 = (dword *)func_0x00187bd0(pdStack00000000000000b8,8);
      if (in_stack_00000078 == (dword *)0x0) goto code_r0x004e3e08;
      if (in_stack_00000268 == 0) goto code_r0x004e3498;
      uVar25 = in_stack_00000268 - 1;
      uVar15 = in_stack_00000268;
      if (uVar25 <= in_stack_00000268) {
        uVar15 = uVar25;
      }
      if (uVar15 < 4) {
code_r0x004e33dc:
        lVar16 = 0;
        uVar15 = in_stack_00000268;
        puVar19 = puVar22;
      }
      else {
        uVar11 = in_stack_00000268;
        if (uVar25 <= in_stack_00000268) {
          uVar11 = uVar25;
        }
        if ((in_stack_00000078 < puVar22 + uVar11 * 2 + 2) &&
           (puVar22 < in_stack_00000078 + (uVar11 * 2 + 2) * 2)) goto code_r0x004e33dc;
        uVar25 = uVar15 + 1 & 3;
        uVar11 = 4;
        if (uVar25 != 0) {
          uVar11 = uVar25;
        }
        lVar16 = (uVar15 + 1) - uVar11;
        uVar15 = in_stack_00000268 - lVar16;
        puVar19 = puVar22 + lVar16 * 2;
        puVar18 = (undefined8 *)(in_stack_00000078 + 8);
        puVar20 = puVar22 + 4;
        lVar21 = lVar16;
        do {
          uVar28 = puVar20[-3];
          uVar8 = puVar20[-2];
          uVar30 = puVar20[-1];
          uVar29 = *puVar20;
          uVar32 = puVar20[1];
          uVar31 = puVar20[2];
          uVar33 = puVar20[3];
          puVar18[-4] = puVar20[-4];
          puVar18[-3] = uVar28;
          puVar18[-2] = uVar8;
          puVar18[-1] = uVar30;
          *puVar18 = uVar29;
          puVar18[1] = uVar32;
          puVar18[2] = uVar31;
          puVar18[3] = uVar33;
          puVar18 = puVar18 + 8;
          puVar20 = puVar20 + 8;
          lVar21 = lVar21 + -4;
        } while (lVar21 != 0);
      }
      pdVar24 = in_stack_00000078 + (lVar16 * 2 + 1) * 2;
      do {
        if (puVar19 == puVar22 + in_stack_00000268 * 2) break;
        uVar8 = *puVar19;
        uVar28 = puVar19[1];
        ((mach_header *)(pdVar24 + -2))->magic = (int)uVar8;
        ((mach_header *)(pdVar24 + -2))->cputype = (int)((ulong)uVar8 >> 0x20);
        *(undefined8 *)pdVar24 = uVar28;
        pdVar24 = pdVar24 + 4;
        uVar15 = uVar15 - 1;
        puVar19 = puVar19 + 2;
      } while (uVar15 != 0);
    }
code_r0x004e3498:
    uVar8 = 0;
    in_stack_000001d0 = unaff_x26[0x72];
    auVar4._8_8_ = 0;
    auVar4._0_8_ = in_stack_000001d0;
    if (SUB168(auVar4 * ZEXT816(0x18),8) != 0) {
code_r0x004e3ec0:
      func_0x007a1f00(uVar8,in_stack_00000070,&UNK_009e7fc8);
      goto code_r0x004e3f08;
    }
    uVar15 = in_stack_000001d0 * 0x18;
    if (0x7ffffffffffffff8 < uVar15) goto code_r0x004e3ec0;
    in_stack_000001f4 = *(undefined4 *)(unaff_x26 + 0x94);
    in_stack_000001e8 = unaff_x26[0x90];
    in_stack_000001e0 = unaff_x26[0x91];
    if (uVar15 == 0) {
      in_stack_00000070 = 8;
    }
    else {
      puVar22 = (undefined8 *)unaff_x26[0x71];
      in_stack_00000070 = func_0x00187bd0(uVar15,8);
      if (in_stack_00000070 == 0) {
        uVar8 = 8;
        in_stack_00000070 = uVar15;
        goto code_r0x004e3ec0;
      }
      if (in_stack_000001d0 != 0) {
        puVar10 = (undefined1 *)(in_stack_00000070 + 0x10);
        uVar25 = in_stack_000001d0;
        do {
          if (uVar15 == 0) break;
          uVar8 = *puVar22;
          uVar28 = puVar22[1];
          uVar3 = *(undefined1 *)(puVar22 + 2);
          puVar22 = puVar22 + 3;
          *(undefined8 *)(puVar10 + -0x10) = uVar8;
          *(undefined8 *)(puVar10 + -8) = uVar28;
          *puVar10 = uVar3;
          uVar15 = uVar15 - 0x18;
          uVar25 = uVar25 - 1;
          puVar10 = puVar10 + 0x18;
        } while (uVar25 != 0);
      }
    }
    unaff_x19 = unaff_x26[0x75];
    unaff_x20 = unaff_x19 * 8;
    if (unaff_x19 >> 0x3d != 0 || 0x7ffffffffffffffc < unaff_x20) {
      in_stack_00000008 = 0;
      unaff_x20 = uVar7;
code_r0x004e3ed8:
      func_0x007a1f00(in_stack_00000008,unaff_x20,&UNK_009e7fe0);
code_r0x004e3f08:
                    /* WARNING: Does not return */
      pcVar6 = (code *)SoftwareBreakpoint(1,0x4e3f0c);
      (*pcVar6)();
    }
    unaff_x21 = unaff_x26[0x74];
    unaff_x26 = unaff_x26 + 0x4b;
    in_stack_00000030 = pdStack0000000000000180;
    in_stack_00000200 = in_stack_00000070;
    in_stack_00000238 = in_stack_000000d0;
    in_stack_00000240 = in_stack_00000178;
    in_stack_000002a8 = in_stack_00000078;
    in_stack_000002b0 = in_stack_00000088;
    in_stack_000002b8 = in_stack_00000098;
    in_stack_000002c0 = in_stack_000000a0;
    in_stack_000002c8 = in_stack_000000b0;
    in_stack_000002d0 = in_stack_000000c0;
  } while( true );
}

