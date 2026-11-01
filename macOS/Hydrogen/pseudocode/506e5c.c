
void FUN_00506e5c(void)

{
  undefined4 uVar1;
  undefined4 uVar2;
  undefined1 uVar3;
  code *pcVar4;
  long lVar5;
  long lVar6;
  long lVar7;
  ulong uVar8;
  undefined1 *puVar9;
  ulong uVar10;
  undefined8 uVar11;
  undefined8 uVar12;
  undefined8 uVar13;
  undefined8 *puVar14;
  undefined8 uVar15;
  ulong uVar16;
  ulong uVar17;
  long *plVar18;
  undefined8 *puVar19;
  undefined8 uVar20;
  undefined8 uVar21;
  undefined8 uVar22;
  undefined8 uVar23;
  long lVar24;
  undefined8 uVar25;
  undefined8 uVar26;
  ulong uVar27;
  undefined8 *unaff_x23;
  undefined8 unaff_x24;
  undefined8 uVar28;
  undefined8 *unaff_x28;
  long unaff_x29;
  undefined8 uVar29;
  undefined8 uVar30;
  undefined8 uVar31;
  undefined1 auVar32 [16];
  undefined8 in_stack_00000018;
  undefined8 in_stack_00000020;
  undefined8 in_stack_00000028;
  undefined8 in_stack_00000030;
  undefined8 in_stack_00000038;
  undefined8 in_stack_00000040;
  undefined8 in_stack_00000048;
  undefined8 in_stack_00000050;
  undefined8 in_stack_00000058;
  undefined8 in_stack_00000060;
  undefined8 in_stack_00000068;
  undefined8 in_stack_00000070;
  undefined8 in_stack_00000078;
  undefined8 in_stack_00000080;
  undefined8 in_stack_00000088;
  undefined8 in_stack_00000090;
  undefined8 in_stack_00000098;
  undefined8 in_stack_000000a0;
  undefined8 in_stack_000000a8;
  undefined8 in_stack_000000b0;
  undefined8 in_stack_000000b8;
  undefined8 in_stack_000000c0;
  ulong uStack0000000000000108;
  undefined8 uStack0000000000000118;
  undefined8 uStack0000000000000120;
  long lStack0000000000000128;
  undefined8 uStack0000000000000130;
  undefined8 in_stack_00000138;
  undefined8 uStack0000000000000140;
  undefined8 in_stack_00000150;
  undefined8 in_stack_00000158;
  undefined8 in_stack_00000160;
  undefined8 in_stack_00000168;
  undefined8 uStack0000000000000178;
  undefined8 in_stack_00000180;
  undefined8 in_stack_00000188;
  undefined8 in_stack_00000190;
  undefined8 in_stack_00000198;
  undefined8 in_stack_000001a0;
  undefined8 in_stack_000001a8;
  undefined8 in_stack_000001b0;
  undefined8 in_stack_000001c0;
  undefined8 in_stack_000001d0;
  undefined8 in_stack_000001d8;
  undefined8 in_stack_000001e0;
  undefined8 in_stack_000001e8;
  
  lVar6 = func_0x00187bd0();
  if (lVar6 == 0) {
    func_0x007a1f00();
    goto LAB_00507548;
  }
  _memcpy();
  uVar20 = 0;
  uVar27 = unaff_x23[0xf];
  auVar32._8_8_ = 0;
  auVar32._0_8_ = uVar27;
  uVar8 = uVar27 * 0x18;
  if ((SUB168(auVar32 * ZEXT816(0x18),8) != 0) || (0x7ffffffffffffff8 < uVar8)) {
LAB_005074d4:
    func_0x007a1f00(uVar20,uVar8,&UNK_009e7fc8);
    goto LAB_00507548;
  }
  if (uVar8 == 0) {
    lStack0000000000000128 = 8;
    if (unaff_x23[0x3a] == -0x8000000000000000) goto code_r0x00506f3c;
code_r0x00506fa0:
    func_0x0045cd08(unaff_x29 + -0xd0,unaff_x23 + 0x3a);
    uStack0000000000000178 = *(undefined8 *)(unaff_x29 + -0xd0);
    in_stack_00000048 = *(undefined8 *)(unaff_x29 + -200);
    in_stack_00000028 = *(undefined8 *)(unaff_x29 + -0xc0);
    if (unaff_x23[0x3d] == -0x8000000000000000) goto code_r0x00506f50;
code_r0x00506fcc:
    func_0x0045cd08(unaff_x29 + -0xd0,unaff_x23 + 0x3d);
    uStack0000000000000140 = *(undefined8 *)(unaff_x29 + -0xd0);
    in_stack_00000040 = *(undefined8 *)(unaff_x29 + -200);
    in_stack_00000080 = *(undefined8 *)(unaff_x29 + -0xc0);
    if (unaff_x23[0x40] == -0x8000000000000000) goto code_r0x00506f64;
code_r0x00506ffc:
    func_0x0045cd08(unaff_x29 + -0xd0,unaff_x23 + 0x40);
    uStack0000000000000130 = *(undefined8 *)(unaff_x29 + -0xd0);
    in_stack_00000038 = *(undefined8 *)(unaff_x29 + -200);
    in_stack_00000020 = *(undefined8 *)(unaff_x29 + -0xc0);
    uStack0000000000000120 = *unaff_x23;
    uStack0000000000000118 = unaff_x23[1];
    if (unaff_x23[0x43] == -0x8000000000000000) goto code_r0x00506f80;
code_r0x00507030:
    func_0x0045cd08(unaff_x29 + -0xd0,unaff_x23 + 0x43);
    uVar20 = *(undefined8 *)(unaff_x29 + -0xd0);
    in_stack_00000030 = *(undefined8 *)(unaff_x29 + -200);
    in_stack_00000018 = *(undefined8 *)(unaff_x29 + -0xc0);
  }
  else {
    puVar19 = (undefined8 *)unaff_x23[0xe];
    uVar20 = 8;
    lStack0000000000000128 = func_0x00187bd0(uVar8,8);
    if (lStack0000000000000128 == 0) goto LAB_005074d4;
    if (uVar27 != 0) {
      puVar9 = (undefined1 *)(lStack0000000000000128 + 0x10);
      uVar16 = uVar27;
      do {
        if (uVar8 == 0) break;
        uVar20 = *puVar19;
        uVar21 = puVar19[1];
        uVar3 = *(undefined1 *)(puVar19 + 2);
        puVar19 = puVar19 + 3;
        *(undefined8 *)(puVar9 + -0x10) = uVar20;
        *(undefined8 *)(puVar9 + -8) = uVar21;
        *puVar9 = uVar3;
        uVar8 = uVar8 - 0x18;
        uVar16 = uVar16 - 1;
        puVar9 = puVar9 + 0x18;
      } while (uVar16 != 0);
    }
    if (unaff_x23[0x3a] != -0x8000000000000000) goto code_r0x00506fa0;
code_r0x00506f3c:
    uStack0000000000000178 = 0x8000000000000000;
    if (unaff_x23[0x3d] != -0x8000000000000000) goto code_r0x00506fcc;
code_r0x00506f50:
    uStack0000000000000140 = 0x8000000000000000;
    if (unaff_x23[0x40] != -0x8000000000000000) goto code_r0x00506ffc;
code_r0x00506f64:
    uStack0000000000000130 = 0x8000000000000000;
    uStack0000000000000120 = *unaff_x23;
    uStack0000000000000118 = unaff_x23[1];
    if (unaff_x23[0x43] != -0x8000000000000000) goto code_r0x00507030;
code_r0x00506f80:
    uVar20 = 0x8000000000000000;
  }
  uVar1 = *(undefined4 *)((long)unaff_x23 + 700);
  uVar2 = *(undefined4 *)(unaff_x23 + 0x58);
  func_0x004e2918(unaff_x29 + -0x70,unaff_x23 + 0x10,&UNK_009e8c50);
  uVar21 = 0;
  uVar8 = unaff_x23[0x15];
  uVar16 = uVar8 * 0x20;
  if ((uVar8 >> 0x3b != 0) || (0x7ffffffffffffff8 < uVar16)) {
code_r0x005074e8:
    func_0x007a1f00(uVar21,uVar16,&UNK_009e7fc8);
    goto LAB_00507548;
  }
  if (uVar16 == 0) {
    lVar7 = 8;
  }
  else {
    lVar24 = unaff_x23[0x14];
    uVar21 = 8;
    lVar7 = func_0x00187bd0(uVar16,8);
    if (lVar7 == 0) goto code_r0x005074e8;
    if (uVar8 != 0) {
      uVar10 = 0;
      uVar17 = uVar8;
      do {
        if (uVar16 == uVar10) break;
        puVar19 = (undefined8 *)(lVar24 + uVar10);
        puVar14 = (undefined8 *)(lVar7 + uVar10);
        uVar21 = *puVar19;
        uVar11 = puVar19[3];
        uVar30 = puVar19[2];
        puVar14[1] = puVar19[1];
        *puVar14 = uVar21;
        puVar14[3] = uVar11;
        puVar14[2] = uVar30;
        uVar10 = uVar10 + 0x20;
        uVar17 = uVar17 - 1;
      } while (uVar17 != 0);
    }
  }
  *(undefined8 *)(unaff_x29 + -200) = *(undefined8 *)(unaff_x29 + -0x68);
  *(undefined8 *)(unaff_x29 + -0xd0) = *(undefined8 *)(unaff_x29 + -0x70);
  *(undefined8 *)(unaff_x29 + -0xc0) = *(undefined8 *)(unaff_x29 + -0x60);
  *(ulong *)(unaff_x29 + -0xb8) = uVar8;
  *(long *)(unaff_x29 + -0xb0) = lVar7;
  *(ulong *)(unaff_x29 + -0xa8) = uVar8;
  func_0x004e17b4(unaff_x29 + -0xa0,unaff_x23 + 0x16,&UNK_009e8c38);
  auVar32 = func_0x004e4980(unaff_x29 + -0x88,unaff_x23 + 0x19,&UNK_009e8c38);
  uVar25 = unaff_x23[0x50];
  uVar22 = unaff_x23[0x51];
  uVar21 = unaff_x23[2];
  uVar30 = unaff_x23[3];
  uVar11 = unaff_x23[0x52];
  uVar15 = unaff_x23[0x53];
  uVar12 = unaff_x23[0x54];
  uVar13 = unaff_x23[0x55];
  uVar8 = unaff_x23[4];
  if (uVar8 == 5) {
    *(undefined8 *)(unaff_x29 + -0x70) = 5;
  }
  else {
    if (3 < uVar8) {
      auVar32 = (**(code **)(unaff_x23[6] + 0x38))(unaff_x23[5]);
    }
    *(ulong *)(unaff_x29 + -0x70) = uVar8;
    *(undefined1 (*) [16])(unaff_x29 + -0x68) = auVar32;
  }
  uVar28 = 0;
  uVar8 = unaff_x23[0x1e];
  uVar16 = uVar8 * 0x10;
  if ((uVar8 >> 0x3c == 0) && (uVar16 < 0x7ffffffffffffff9)) {
    uVar3 = *(undefined1 *)((long)unaff_x23 + 0x2c4);
    uVar26 = unaff_x23[0x56];
    uVar23 = unaff_x23[0x1d];
    if (uVar16 == 0) {
      uStack0000000000000108 = 0;
      lVar7 = 8;
    }
    else {
      uVar28 = 8;
      lVar7 = func_0x00187bd0(uVar16,8);
      if (lVar7 == 0) goto code_r0x00507500;
      uStack0000000000000108 = uVar8;
    }
    _memcpy(lVar7,uVar23,uVar16);
    uVar28 = 0;
    uVar16 = unaff_x23[0x21];
    uVar10 = uVar16 * 0x20;
    if ((uVar16 >> 0x3b == 0) && (uVar10 < 0x7ffffffffffffff9)) {
      if (uVar10 == 0) {
        lVar24 = 8;
LAB_005072b8:
        unaff_x28[0x46] = in_stack_00000138;
        unaff_x28[0x47] = in_stack_00000168;
        unaff_x28[0x48] = in_stack_00000160;
        unaff_x28[0x49] = in_stack_00000158;
        *(undefined4 *)(unaff_x28 + 0x57) = in_stack_00000150._4_4_;
        unaff_x28[0x26] = in_stack_000000b0;
        unaff_x28[0x27] = in_stack_00000078;
        unaff_x28[0x4a] = in_stack_00000180;
        unaff_x28[0x4b] = in_stack_000001b0;
        unaff_x28[0x4c] = in_stack_000001a8;
        unaff_x28[0x4d] = in_stack_000001a0;
        unaff_x28[0x4e] = in_stack_00000198;
        unaff_x28[0x4f] = in_stack_00000190;
        unaff_x28[0x28] = *(undefined8 *)(unaff_x29 + -0xf8);
        unaff_x28[0x29] = in_stack_000000a8;
        uVar28 = *(undefined8 *)(unaff_x29 + -0x100);
        unaff_x28[0x2a] = in_stack_00000070;
        unaff_x28[0x2b] = uVar28;
        unaff_x28[0x2c] = in_stack_000000a0;
        unaff_x28[0x2d] = in_stack_00000068;
        unaff_x28[0x2e] = in_stack_000001e8;
        unaff_x28[0x2f] = in_stack_00000098;
        unaff_x28[0x30] = in_stack_00000060;
        unaff_x28[0x31] = in_stack_000001e0;
        unaff_x28[0x32] = in_stack_00000090;
        unaff_x28[0x33] = in_stack_00000058;
        unaff_x28[0x34] = in_stack_000001d8;
        unaff_x28[0x35] = in_stack_00000088;
        unaff_x28[0x36] = in_stack_00000050;
        unaff_x28[0x37] = in_stack_000001d0;
        unaff_x28[0x38] = in_stack_000000c0;
        unaff_x28[0x39] = in_stack_000000b8;
        unaff_x28[10] = unaff_x24;
        unaff_x28[0xb] = lVar6;
        unaff_x28[0x3a] = uStack0000000000000178;
        unaff_x28[0x3b] = in_stack_00000048;
        unaff_x28[0x3c] = in_stack_00000028;
        unaff_x28[0x3d] = uStack0000000000000140;
        uVar23 = *(undefined8 *)(unaff_x29 + -0xd8);
        uVar28 = *(undefined8 *)(unaff_x29 + -0xe8);
        unaff_x28[0x23] = *(undefined8 *)(unaff_x29 + -0xe0);
        unaff_x28[0x22] = uVar28;
        uVar28 = *(undefined8 *)(unaff_x29 + -0xf0);
        unaff_x28[0x24] = uVar23;
        unaff_x28[0x25] = uVar28;
        unaff_x28[8] = in_stack_00000188;
        unaff_x28[9] = in_stack_000001c0;
        unaff_x28[0xc] = unaff_x24;
        unaff_x28[0xd] = uVar27;
        unaff_x28[0xe] = lStack0000000000000128;
        unaff_x28[0xf] = uVar27;
        unaff_x28[0x3e] = in_stack_00000040;
        unaff_x28[0x3f] = in_stack_00000080;
        unaff_x28[0x40] = uStack0000000000000130;
        unaff_x28[0x41] = in_stack_00000038;
        unaff_x28[0x42] = in_stack_00000020;
        *unaff_x28 = uStack0000000000000120;
        unaff_x28[1] = uStack0000000000000118;
        unaff_x28[0x43] = uVar20;
        unaff_x28[0x44] = in_stack_00000030;
        unaff_x28[0x45] = in_stack_00000018;
        *(undefined4 *)((long)unaff_x28 + 700) = uVar1;
        *(undefined4 *)(unaff_x28 + 0x58) = uVar2;
        uVar29 = *(undefined8 *)(unaff_x29 + -0xb8);
        uVar23 = *(undefined8 *)(unaff_x29 + -0xc0);
        uVar28 = *(undefined8 *)(unaff_x29 + -0xa8);
        uVar20 = *(undefined8 *)(unaff_x29 + -0xb0);
        uVar31 = *(undefined8 *)(unaff_x29 + -0xd0);
        unaff_x28[0x11] = *(undefined8 *)(unaff_x29 + -200);
        unaff_x28[0x10] = uVar31;
        unaff_x28[0x13] = uVar29;
        unaff_x28[0x12] = uVar23;
        unaff_x28[0x18] = *(undefined8 *)(unaff_x29 + -0x90);
        uVar29 = *(undefined8 *)(unaff_x29 + -0x98);
        uVar23 = *(undefined8 *)(unaff_x29 + -0xa0);
        unaff_x28[0x15] = uVar28;
        unaff_x28[0x14] = uVar20;
        unaff_x28[0x17] = uVar29;
        unaff_x28[0x16] = uVar23;
        uVar28 = *(undefined8 *)(unaff_x29 + -0x88);
        uVar20 = *(undefined8 *)(unaff_x29 + -0x78);
        unaff_x28[0x1a] = *(undefined8 *)(unaff_x29 + -0x80);
        unaff_x28[0x19] = uVar28;
        unaff_x28[0x50] = uVar25;
        unaff_x28[0x51] = uVar22;
        unaff_x28[2] = uVar21;
        unaff_x28[3] = uVar30;
        unaff_x28[0x52] = uVar11;
        unaff_x28[0x53] = uVar15;
        unaff_x28[0x54] = uVar12;
        unaff_x28[0x55] = uVar13;
        uVar30 = *(undefined8 *)(unaff_x29 + -0x68);
        uVar21 = *(undefined8 *)(unaff_x29 + -0x70);
        unaff_x28[6] = *(undefined8 *)(unaff_x29 + -0x60);
        unaff_x28[7] = in_stack_000001c0;
        unaff_x28[5] = uVar30;
        unaff_x28[4] = uVar21;
        *(undefined1 *)((long)unaff_x28 + 0x2c4) = uVar3;
        unaff_x28[0x56] = uVar26;
        unaff_x28[0x1b] = uVar20;
        unaff_x28[0x1c] = uStack0000000000000108;
        unaff_x28[0x1d] = lVar7;
        unaff_x28[0x1e] = uVar8;
        unaff_x28[0x1f] = uVar16;
        unaff_x28[0x20] = lVar24;
        unaff_x28[0x21] = uVar16;
        return;
      }
      puVar19 = (undefined8 *)unaff_x23[0x20];
      uVar28 = 8;
      lVar24 = func_0x00187bd0(uVar10,8);
      if (lVar24 != 0) {
        if (uVar16 != 0) {
          puVar14 = (undefined8 *)(lVar24 + 0x10);
          uVar17 = uVar16;
          do {
            if (uVar10 == 0) break;
            plVar18 = (long *)*puVar19;
            lVar5 = *plVar18;
            *plVar18 = lVar5 + 1;
            if (lVar5 < 0) goto LAB_00507548;
            uVar28 = puVar19[1];
            uVar29 = puVar19[3];
            uVar23 = puVar19[2];
            puVar19 = puVar19 + 4;
            puVar14[-2] = plVar18;
            puVar14[-1] = uVar28;
            puVar14[1] = uVar29;
            *puVar14 = uVar23;
            uVar10 = uVar10 - 0x20;
            uVar17 = uVar17 - 1;
            puVar14 = puVar14 + 4;
          } while (uVar17 != 0);
        }
        goto LAB_005072b8;
      }
    }
    func_0x007a1f00(uVar28,uVar10,&UNK_009e7fc8);
  }
  else {
code_r0x00507500:
    func_0x007a1f00(uVar28,uVar16,&UNK_009e7fe0);
  }
LAB_00507548:
                    /* WARNING: Does not return */
  pcVar4 = (code *)SoftwareBreakpoint(1,0x50754c);
  (*pcVar4)();
}

