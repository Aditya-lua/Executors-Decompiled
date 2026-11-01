
void FUN_0058b4ac(undefined1 param_1 [16])

{
  ulong *puVar1;
  bool bVar2;
  bool bVar3;
  code *pcVar4;
  bool bVar5;
  undefined8 *puVar6;
  ulong uVar7;
  undefined *puVar8;
  ulong uVar9;
  long lVar10;
  ulong uVar11;
  ulong uVar12;
  undefined8 *puVar13;
  ulong uVar14;
  undefined8 uVar15;
  ulong uVar16;
  ulong *puVar17;
  ulong uVar18;
  long unaff_x29;
  long lVar19;
  undefined8 in_stack_00000000;
  long *in_stack_00000008;
  ulong uStack0000000000000018;
  undefined1 uStack0000000000000040;
  long lStack0000000000000048;
  ulong uStack0000000000000050;
  long lStack0000000000000060;
  long lStack0000000000000068;
  ulong in_stack_00000070;
  undefined8 uStack0000000000000078;
  undefined8 uStack0000000000000080;
  undefined8 uStack0000000000000088;
  undefined8 uStack0000000000000098;
  long in_stack_000000a0;
  ulong in_stack_000000a8;
  undefined8 uStack00000000000000b0;
  long in_stack_000000b8;
  undefined8 in_stack_000000c0;
  undefined8 in_stack_000000c8;
  undefined8 in_stack_000000d0;
  undefined8 in_stack_000000d8;
  undefined8 uStack00000000000000e0;
  long in_stack_000000e8;
  long in_stack_000000f0;
  long in_stack_000000f8;
  long in_stack_00000100;
  long in_stack_00000108;
  
  uVar12 = in_stack_00000070;
  lVar19 = param_1._8_8_;
  _uStack0000000000000040 = param_1._0_8_;
  *(long *)(unaff_x29 + -200) = lVar19;
  *(long *)(unaff_x29 + -0xd0) = _uStack0000000000000040;
  *(long *)(unaff_x29 + -0xb0) = in_stack_000000b8;
  *(long *)(unaff_x29 + -0xb8) = uStack00000000000000b0;
  *(undefined8 *)(unaff_x29 + -0xa0) = in_stack_000000c8;
  *(undefined8 *)(unaff_x29 + -0xa8) = in_stack_000000c0;
  *(undefined8 *)(unaff_x29 + -0x90) = in_stack_000000d8;
  *(undefined8 *)(unaff_x29 + -0x98) = in_stack_000000d0;
  uStack0000000000000050 = in_stack_00000070;
  lStack0000000000000068 = in_stack_000000b8;
  lStack0000000000000060 = uStack00000000000000b0;
  uStack0000000000000078 = in_stack_000000c8;
  in_stack_00000070 = in_stack_000000c0;
  uStack0000000000000088 = in_stack_000000d8;
  uStack0000000000000080 = in_stack_000000d0;
  lVar10 = lVar19 + uVar12 * 4;
  *(long *)(unaff_x29 + -0xd0) = lVar19;
  *(long *)(unaff_x29 + -200) = lVar10;
  *(ulong *)(unaff_x29 + -0xc0) = uVar12;
  *(undefined8 *)(unaff_x29 + -0xc0) = 0;
  puVar13 = &uStack00000000000000b0;
  lStack0000000000000048 = lVar19;
  func_0x00574a0c(&uStack00000000000000b0,unaff_x29 + -0xd0);
  *(long *)(unaff_x29 + -200) = lStack0000000000000068;
  *(long *)(unaff_x29 + -0xd0) = lStack0000000000000060;
  *(undefined8 *)(unaff_x29 + -0xb8) = uStack0000000000000078;
  *(ulong *)(unaff_x29 + -0xc0) = in_stack_00000070;
  *(undefined8 *)(unaff_x29 + -0xa8) = uStack0000000000000088;
  *(undefined8 *)(unaff_x29 + -0xb0) = uStack0000000000000080;
  *(undefined8 **)(unaff_x29 + -0x68) = puVar13;
  in_stack_000000f8 = unaff_x29 + -0x68;
  uStack00000000000000e0 = lVar19;
  in_stack_000000e8 = lVar10;
  in_stack_000000f0 = unaff_x29 + -0xd0;
  func_0x0055c098(&uStack0000000000000098,&uStack00000000000000e0,&UNK_009f0dd0);
  func_0x00490eb8(unaff_x29 + -0xd0);
  if (uVar12 >> 0x3c == 0) {
    if (uVar12 == 0) {
      uVar18 = 0;
      uVar16 = 0xffffffffffffffff;
      puVar8 = &UNK_009f0e18;
LAB_0058b800:
      func_0x007a2570(uVar16,uVar18,puVar8);
      goto LAB_0058b854;
    }
    puVar13 = (undefined8 *)(uVar12 * 8);
    uVar15 = 8;
    puVar6 = (undefined8 *)func_0x00187bd0(puVar13,8);
    if (puVar6 != (undefined8 *)0x0) {
      lVar10 = uVar12 - 1;
      if (lVar10 == 0) {
        uStack0000000000000018 = 1;
        puVar13 = puVar6;
      }
      else {
        _memset(puVar6,0xff,puVar13 + -1);
        puVar13 = (undefined8 *)((long)puVar6 + (long)(puVar13 + -1));
        uStack0000000000000018 = uVar12;
      }
      uVar18 = in_stack_000000a8;
      lVar19 = in_stack_000000a0;
      *puVar13 = 0xffffffffffffffff;
      puVar6[lVar10] = lVar10;
      if (lVar10 != 0) {
        uVar16 = uVar12 - 2;
        bVar3 = false;
        do {
          bVar2 = bVar3;
          if (uVar18 <= uVar16) {
            puVar8 = &UNK_009f0e30;
            goto LAB_0058b800;
          }
          lVar10 = lVar19 + uVar16 * 0x18;
          puVar17 = *(ulong **)(lVar10 + 8);
          lVar10 = *(long *)(lVar10 + 0x10);
          uVar11 = lVar10 * 8;
          puVar1 = puVar17 + lVar10;
          do {
            uVar11 = uVar11 - 8;
            if (puVar17 == puVar1) {
              func_0x007a23d8(&UNK_008ad8c1,0x9e,&UNK_009f0e48);
              goto LAB_0058b854;
            }
            uVar7 = *puVar17;
            if (uVar12 <= uVar7) goto LAB_0058b7f4;
            puVar17 = puVar17 + 1;
          } while (puVar6[uVar7] == -1);
          if (puVar17 != puVar1) {
            uVar14 = 0;
LAB_0058b64c:
            uVar9 = puVar17[uVar14];
            if (uVar9 < uVar12) goto code_r0x0058b658;
            uVar7 = uVar9;
LAB_0058b7f4:
            puVar8 = &UNK_009f0e78;
            uVar16 = uVar7;
            uVar18 = uVar12;
            goto LAB_0058b800;
          }
LAB_0058b678:
          if (uVar12 <= uVar16) {
            puVar8 = &UNK_009f0e60;
            uVar18 = uVar12;
            goto LAB_0058b800;
          }
          if (uVar7 != puVar6[uVar16]) {
            puVar6[uVar16] = uVar7;
            bVar2 = true;
          }
          bVar5 = uVar16 != 0;
          uVar16 = uVar16 - 1;
          if (!bVar5) {
            uVar16 = uVar12 - 2;
          }
          bVar3 = (bool)(bVar5 & bVar2);
        } while ((bVar5) || (bVar2));
      }
      *(undefined8 **)(unaff_x29 + -0xd0) = puVar6;
      *(undefined8 **)(unaff_x29 + -200) = puVar6;
      *(ulong *)(unaff_x29 + -0xc0) = uStack0000000000000018;
      *(undefined8 **)(unaff_x29 + -0xb8) = puVar6 + uVar12;
      *(undefined8 *)(unaff_x29 + -0xb0) = 0;
      *(undefined1 **)(unaff_x29 + -0xa8) = &uStack0000000000000040;
      func_0x00574bf0(&uStack00000000000000e0,unaff_x29 + -0xd0);
      lVar10 = in_stack_000000a0;
      *(undefined4 *)(in_stack_00000008 + 6) = in_stack_00000000._4_4_;
      in_stack_00000008[1] = in_stack_000000e8;
      *in_stack_00000008 = uStack00000000000000e0;
      in_stack_00000008[3] = in_stack_000000f8;
      in_stack_00000008[2] = in_stack_000000f0;
      in_stack_00000008[5] = in_stack_00000108;
      in_stack_00000008[4] = in_stack_00000100;
      if (in_stack_000000a8 != 0) {
        puVar13 = (undefined8 *)(in_stack_000000a0 + 8);
        uVar12 = in_stack_000000a8;
        do {
          if (puVar13[-1] != 0) {
            func_0x00187bd4(*puVar13,puVar13[-1] << 3,8);
          }
          puVar13 = puVar13 + 3;
          uVar12 = uVar12 - 1;
        } while (uVar12 != 0);
      }
      if (uStack0000000000000098 != 0) {
        func_0x00187bd4(lVar10,uStack0000000000000098 * 0x18,8);
      }
      if ((in_stack_000000b8 != 0) && (lVar10 = in_stack_000000b8 * 0x11 + 0x19, lVar10 != 0)) {
        func_0x00187bd4(uStack00000000000000b0 + in_stack_000000b8 * -0x10 + -0x10,lVar10,8);
      }
      if (_uStack0000000000000040 != 0) {
        func_0x00187bd4(lStack0000000000000048,_uStack0000000000000040 << 2,4);
      }
      return;
    }
  }
  else {
    uVar15 = 0;
  }
  func_0x007a1f00(uVar15,puVar13,&UNK_009f0e00);
LAB_0058b854:
                    /* WARNING: Does not return */
  pcVar4 = (code *)SoftwareBreakpoint(1,0x58b858);
  (*pcVar4)();
code_r0x0058b658:
  if (puVar6[uVar9] != -1) {
    uVar7 = func_0x005e2978(puVar6,uVar12);
  }
  uVar14 = uVar14 + 1;
  if (uVar11 >> 3 == uVar14) goto LAB_0058b678;
  goto LAB_0058b64c;
}

