
void FUN_0050f0c0(long param_1)

{
  code *pcVar1;
  long lVar2;
  long lVar3;
  ulong uVar4;
  undefined8 *puVar5;
  ulong uVar6;
  long lVar7;
  undefined8 *puVar8;
  ulong uVar9;
  long *plVar10;
  undefined8 *puVar11;
  undefined8 *puVar12;
  long unaff_x20;
  undefined8 *puVar13;
  undefined8 unaff_x22;
  ulong uVar14;
  undefined8 uVar15;
  undefined8 uVar16;
  undefined8 *unaff_x25;
  ulong uVar17;
  undefined8 uVar18;
  long unaff_x28;
  long unaff_x29;
  undefined8 uVar19;
  undefined8 uVar20;
  undefined8 uVar21;
  undefined8 uVar22;
  undefined8 uVar23;
  undefined8 uVar24;
  undefined8 uVar25;
  undefined8 uVar26;
  undefined8 in_stack_00000058;
  undefined8 in_stack_00000060;
  ulong uStack00000000000000a0;
  undefined8 in_stack_000000b0;
  undefined8 in_stack_000000b8;
  long lStack00000000000000c0;
  undefined8 in_stack_000000c8;
  undefined8 in_stack_000000d0;
  undefined8 in_stack_000000e0;
  undefined8 in_stack_000000e8;
  undefined8 in_stack_000000f0;
  undefined8 in_stack_000000f8;
  undefined8 in_stack_00000100;
  undefined8 in_stack_00000108;
  undefined8 in_stack_00000110;
  undefined8 in_stack_00000118;
  undefined8 in_stack_00000120;
  undefined8 in_stack_00000128;
  undefined8 in_stack_00000130;
  undefined8 in_stack_00000138;
  undefined8 in_stack_00000140;
  undefined8 in_stack_00000148;
  undefined8 in_stack_00000150;
  undefined8 in_stack_00000158;
  undefined8 in_stack_00000160;
  undefined8 in_stack_00000168;
  undefined8 in_stack_00000170;
  undefined8 in_stack_00000178;
  
  uVar4 = unaff_x20 * 0x30;
  if ((param_1 != 0) || (0x7ffffffffffffff8 < uVar4)) {
LAB_0050f57c:
    func_0x007a1f00(unaff_x22,uVar4,&UNK_009e7fc8);
    goto LAB_0050f6d8;
  }
  if (uVar4 == 0) {
    lStack00000000000000c0 = 8;
  }
  else {
    puVar12 = *(undefined8 **)(unaff_x28 + 400);
    unaff_x22 = 8;
    lStack00000000000000c0 = func_0x00187bd0(uVar4,8);
    if (lStack00000000000000c0 == 0) goto LAB_0050f57c;
    if (unaff_x20 != 0) {
      puVar13 = (undefined8 *)(lStack00000000000000c0 + 0x18);
      lVar7 = unaff_x20;
      do {
        if (uVar4 == 0) break;
        puVar5 = puVar12 + 1;
        uVar22 = *puVar12;
        uVar24 = puVar12[3];
        uVar23 = puVar12[2];
        uVar16 = puVar12[4];
        uVar21 = puVar12[5];
        puVar12 = puVar12 + 6;
        puVar13[-2] = *puVar5;
        puVar13[-3] = uVar22;
        *puVar13 = uVar24;
        puVar13[-1] = uVar23;
        puVar13[1] = uVar16;
        puVar13[2] = uVar21;
        uVar4 = uVar4 - 0x30;
        puVar13 = puVar13 + 6;
        lVar7 = lVar7 + -1;
      } while (lVar7 != 0);
    }
  }
  uVar4 = *(ulong *)(unaff_x28 + 0x1b0);
  uVar14 = uVar4 * 0x10;
  if (uVar4 >> 0x3c != 0 || 0x7ffffffffffffff8 < uVar14) {
    uVar16 = 0;
LAB_0050f6a8:
    func_0x007a1f00(uVar16,uVar14,&UNK_009e7fc8);
    goto LAB_0050f6d8;
  }
  if (uVar14 == 0) {
    puVar12 = (undefined8 *)0x8;
  }
  else {
    puVar13 = *(undefined8 **)(unaff_x28 + 0x1a8);
    uVar16 = 8;
    puVar12 = (undefined8 *)func_0x00187bd0(uVar14,8);
    if (puVar12 == (undefined8 *)0x0) goto LAB_0050f6a8;
    if (uVar4 == 0) goto LAB_0050f270;
    uVar6 = uVar4 - 1;
    uVar14 = uVar4;
    if (uVar6 <= uVar4) {
      uVar14 = uVar6;
    }
    if (uVar14 < 8) {
LAB_0050f230:
      lVar7 = 0;
      uVar14 = uVar4;
      puVar5 = puVar13;
    }
    else {
      uVar17 = uVar4;
      if (uVar6 <= uVar4) {
        uVar17 = uVar6;
      }
      if (puVar12 < puVar13 + uVar17 * 2 + 2 && puVar13 < puVar12 + uVar17 * 2 + 2)
      goto LAB_0050f230;
      uVar6 = uVar14 + 1 & 3;
      uVar17 = 4;
      if (uVar6 != 0) {
        uVar17 = uVar6;
      }
      lVar7 = (uVar14 + 1) - uVar17;
      uVar14 = uVar4 - lVar7;
      puVar5 = puVar13 + lVar7 * 2;
      puVar8 = puVar12 + 4;
      puVar11 = puVar13 + 4;
      lVar3 = lVar7;
      do {
        uVar21 = puVar11[-3];
        uVar16 = puVar11[-2];
        uVar22 = puVar11[-1];
        uVar23 = *puVar11;
        uVar25 = puVar11[1];
        uVar24 = puVar11[2];
        uVar26 = puVar11[3];
        puVar8[-4] = puVar11[-4];
        puVar8[-3] = uVar21;
        puVar8[-2] = uVar16;
        puVar8[-1] = uVar22;
        *puVar8 = uVar23;
        puVar8[1] = uVar25;
        puVar8[2] = uVar24;
        puVar8[3] = uVar26;
        puVar8 = puVar8 + 8;
        puVar11 = puVar11 + 8;
        lVar3 = lVar3 + -4;
      } while (lVar3 != 0);
    }
    puVar8 = puVar12 + lVar7 * 2 + 1;
    do {
      if (puVar5 == puVar13 + uVar4 * 2) break;
      uVar16 = puVar5[1];
      puVar8[-1] = *puVar5;
      *puVar8 = uVar16;
      puVar8 = puVar8 + 2;
      uVar14 = uVar14 - 1;
      puVar5 = puVar5 + 2;
    } while (uVar14 != 0);
  }
LAB_0050f270:
  uVar14 = *(ulong *)(unaff_x28 + 0x1c8);
  uVar6 = uVar14 * 0x10;
  if (uVar14 >> 0x3c == 0 && uVar6 < 0x7ffffffffffffff9) {
    uVar26 = *(undefined8 *)(unaff_x28 + 0x238);
    uVar15 = *(undefined8 *)(unaff_x28 + 0x240);
    uVar21 = *(undefined8 *)(unaff_x28 + 0x28);
    uVar23 = *(undefined8 *)(unaff_x28 + 0x30);
    uVar22 = *(undefined8 *)(unaff_x28 + 0x38);
    uVar24 = *(undefined8 *)(unaff_x28 + 0x40);
    uVar25 = *(undefined8 *)(unaff_x28 + 0x48);
    uVar18 = *(undefined8 *)(unaff_x28 + 0x1c0);
    if (uVar6 == 0) {
      uStack00000000000000a0 = 0;
      lVar7 = 8;
    }
    else {
      uVar16 = 8;
      lVar7 = func_0x00187bd0(uVar6,8);
      if (lVar7 == 0) goto LAB_0050f6c4;
      uStack00000000000000a0 = uVar14;
    }
    _memcpy(lVar7,uVar18,uVar6);
    uVar16 = 0;
    uVar6 = *(ulong *)(unaff_x28 + 0x1e0);
    uVar17 = uVar6 * 0x20;
    if ((uVar6 >> 0x3b == 0) && (uVar17 < 0x7ffffffffffffff9)) {
      if (uVar17 == 0) {
        lVar3 = 8;
        uVar16 = *(undefined8 *)(unaff_x29 + -0xb8);
LAB_0050f390:
        unaff_x25[0x43] = in_stack_00000138;
        unaff_x25[0x44] = in_stack_00000148;
        unaff_x25[0x41] = in_stack_00000060;
        unaff_x25[0x42] = in_stack_00000058;
        *(undefined1 *)((long)unaff_x25 + 0x254) = in_stack_00000158._4_1_;
        unaff_x25[0xe] = *(undefined8 *)(unaff_x29 + -0xf0);
        *(undefined4 *)(unaff_x25 + 0x4a) = in_stack_00000130._4_4_;
        unaff_x25[0x14] = in_stack_00000178;
        unaff_x25[0x1a] = in_stack_00000160;
        unaff_x25[0x20] = in_stack_00000120;
        *(undefined4 *)(unaff_x25 + 0x49) = in_stack_000000f8._4_4_;
        unaff_x25[0x45] = in_stack_000000f0;
        unaff_x25[0x46] = in_stack_000000e8;
        unaff_x25[0x26] = in_stack_00000118;
        unaff_x25[0x28] = in_stack_00000140;
        unaff_x25[0x29] = in_stack_00000108;
        unaff_x25[0x2a] = *(undefined8 *)(unaff_x29 + -0xa8);
        *unaff_x25 = in_stack_000000d0;
        unaff_x25[1] = in_stack_000000c8;
        unaff_x25[0x2c] = uVar16;
        unaff_x25[2] = in_stack_000000b8;
        *(undefined4 *)((long)unaff_x25 + 0x24c) = in_stack_000000b0._4_4_;
        unaff_x25[0x47] = uVar26;
        unaff_x25[0x48] = uVar15;
        unaff_x25[0x32] = lStack00000000000000c0;
        unaff_x25[0x33] = unaff_x20;
        uVar16 = *(undefined8 *)(unaff_x29 + -0x98);
        unaff_x25[0x3e] = *(undefined8 *)(unaff_x29 + -0x90);
        unaff_x25[0x3d] = uVar16;
        uVar16 = *(undefined8 *)(unaff_x29 + -0xd8);
        unaff_x25[0x3f] = *(undefined8 *)(unaff_x29 + -0x88);
        unaff_x25[0x40] = uVar16;
        uVar16 = *(undefined8 *)(unaff_x29 + -0x70);
        unaff_x25[0xb] = *(undefined8 *)(unaff_x29 + -0x68);
        unaff_x25[10] = uVar16;
        uVar16 = *(undefined8 *)(unaff_x29 + -0xd0);
        uVar26 = *(undefined8 *)(unaff_x29 + -200);
        unaff_x25[0xc] = *(undefined8 *)(unaff_x29 + -0x60);
        unaff_x25[0xd] = uVar26;
        unaff_x25[0xf] = uVar26;
        unaff_x25[0x10] = uVar16;
        unaff_x25[0x11] = *(undefined8 *)(unaff_x29 + -0xf8);
        unaff_x25[0x12] = uVar16;
        uVar16 = *(undefined8 *)(unaff_x29 + -0xe8);
        uVar26 = *(undefined8 *)(unaff_x29 + -0xe0);
        unaff_x25[0x13] = uVar26;
        unaff_x25[0x15] = uVar26;
        unaff_x25[0x16] = uVar16;
        unaff_x25[0x17] = in_stack_00000170;
        unaff_x25[0x18] = uVar16;
        uVar26 = *(undefined8 *)(unaff_x29 + -0xa0);
        unaff_x25[0x19] = uVar26;
        uVar16 = *(undefined8 *)(unaff_x29 + -0x100);
        unaff_x25[0x1b] = uVar26;
        unaff_x25[0x1c] = uVar16;
        unaff_x25[0x1d] = *(undefined8 *)(unaff_x29 + -0xb0);
        unaff_x25[0x1e] = uVar16;
        unaff_x25[0x1f] = in_stack_00000168;
        unaff_x25[0x21] = in_stack_00000168;
        unaff_x25[0x22] = in_stack_00000150;
        unaff_x25[0x23] = *(undefined8 *)(unaff_x29 + -0xc0);
        unaff_x25[0x24] = in_stack_00000150;
        unaff_x25[0x25] = in_stack_00000128;
        unaff_x25[0x27] = in_stack_00000128;
        unaff_x25[0x2b] = in_stack_00000110;
        uVar16 = *(undefined8 *)(unaff_x29 + -0x80);
        unaff_x25[4] = *(undefined8 *)(unaff_x29 + -0x78);
        unaff_x25[3] = uVar16;
        unaff_x25[0x2d] = in_stack_00000110;
        unaff_x25[0x2e] = in_stack_00000100;
        unaff_x25[0x2f] = in_stack_000000e0;
        unaff_x25[0x30] = in_stack_00000100;
        unaff_x25[0x31] = unaff_x20;
        unaff_x25[0x34] = uVar4;
        unaff_x25[0x35] = puVar12;
        unaff_x25[5] = uVar21;
        unaff_x25[6] = uVar23;
        unaff_x25[7] = uVar22;
        unaff_x25[8] = uVar24;
        unaff_x25[9] = uVar25;
        unaff_x25[0x36] = uVar4;
        unaff_x25[0x37] = uStack00000000000000a0;
        unaff_x25[0x38] = lVar7;
        unaff_x25[0x39] = uVar14;
        unaff_x25[0x3a] = uVar6;
        unaff_x25[0x3b] = lVar3;
        unaff_x25[0x3c] = uVar6;
        return;
      }
      puVar13 = *(undefined8 **)(unaff_x28 + 0x1d8);
      uVar16 = 8;
      lVar3 = func_0x00187bd0(uVar17,8);
      if (lVar3 != 0) {
        uVar16 = *(undefined8 *)(unaff_x29 + -0xb8);
        if (uVar6 != 0) {
          puVar5 = (undefined8 *)(lVar3 + 0x10);
          uVar9 = uVar6;
          do {
            if (uVar17 == 0) break;
            plVar10 = (long *)*puVar13;
            lVar2 = *plVar10;
            *plVar10 = lVar2 + 1;
            if (lVar2 < 0) goto LAB_0050f6d8;
            uVar18 = puVar13[1];
            uVar20 = puVar13[3];
            uVar19 = puVar13[2];
            puVar13 = puVar13 + 4;
            puVar5[-2] = plVar10;
            puVar5[-1] = uVar18;
            puVar5[1] = uVar20;
            *puVar5 = uVar19;
            uVar17 = uVar17 - 0x20;
            uVar9 = uVar9 - 1;
            puVar5 = puVar5 + 4;
          } while (uVar9 != 0);
        }
        goto LAB_0050f390;
      }
    }
    func_0x007a1f00(uVar16,uVar17,&UNK_009e7fc8);
  }
  else {
    uVar16 = 0;
LAB_0050f6c4:
    func_0x007a1f00(uVar16,uVar6,&UNK_009e7fe0);
  }
LAB_0050f6d8:
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x50f6dc);
  (*pcVar1)();
}

