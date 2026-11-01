
void FUN_004d4014(void)

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
  undefined8 *puVar10;
  long lVar11;
  ulong uVar12;
  ulong unaff_x22;
  long lVar13;
  ulong uVar14;
  ulong uVar15;
  ulong *puVar16;
  ulong uVar17;
  long unaff_x29;
  undefined8 in_stack_00000008;
  undefined8 *in_stack_00000010;
  ulong uVar18;
  undefined8 uStack0000000000000030;
  undefined8 in_stack_00000038;
  long in_stack_00000088;
  long in_stack_00000090;
  ulong in_stack_00000098;
  long in_stack_000000a0;
  long in_stack_000000a8;
  undefined8 uStack00000000000000d8;
  undefined8 in_stack_000000e0;
  undefined8 in_stack_000000e8;
  undefined8 in_stack_000000f0;
  undefined8 in_stack_000000f8;
  undefined8 in_stack_00000100;
  
  if (unaff_x22 == 0) {
    uVar17 = 0;
    uVar15 = 0xffffffffffffffff;
    puVar8 = &UNK_009e6c00;
code_r0x004d42d0:
    func_0x007a2570(uVar15,uVar17,puVar8);
  }
  else {
    lVar13 = unaff_x22 * 8;
    puVar6 = (undefined8 *)func_0x00187bd0(lVar13,8);
    if (puVar6 != (undefined8 *)0x0) {
      lVar11 = unaff_x22 - 1;
      if (lVar11 == 0) {
        puVar10 = puVar6;
        uVar18 = 1;
      }
      else {
        _memset(puVar6,0xff,lVar13 + -8);
        puVar10 = puVar6 + (unaff_x22 - 1);
        uVar18 = unaff_x22;
      }
      uVar17 = in_stack_00000098;
      lVar13 = in_stack_00000090;
      *puVar10 = 0xffffffffffffffff;
      puVar6[lVar11] = lVar11;
      if (lVar11 != 0) {
        uVar15 = unaff_x22 - 2;
        bVar3 = false;
        do {
          bVar2 = bVar3;
          if (uVar17 <= uVar15) {
            puVar8 = &UNK_009e6c18;
            goto code_r0x004d42d0;
          }
          lVar11 = lVar13 + uVar15 * 0x18;
          puVar16 = *(ulong **)(lVar11 + 8);
          lVar11 = *(long *)(lVar11 + 0x10);
          uVar12 = lVar11 * 8;
          puVar1 = puVar16 + lVar11;
          do {
            uVar12 = uVar12 - 8;
            if (puVar16 == puVar1) {
              func_0x007a23d8(&UNK_008a295c,0x9e,&UNK_009e6c30);
              goto code_r0x004d4324;
            }
            uVar7 = *puVar16;
            if (unaff_x22 <= uVar7) goto code_r0x004d42c4;
            puVar16 = puVar16 + 1;
          } while (puVar6[uVar7] == -1);
          if (puVar16 != puVar1) {
            uVar14 = 0;
code_r0x004d4118:
            uVar9 = puVar16[uVar14];
            if (uVar9 < unaff_x22) goto code_r0x004d4124;
            uVar7 = uVar9;
code_r0x004d42c4:
            puVar8 = &UNK_009e6c60;
            uVar15 = uVar7;
            uVar17 = unaff_x22;
            goto code_r0x004d42d0;
          }
code_r0x004d4144:
          if (unaff_x22 <= uVar15) {
            puVar8 = &UNK_009e6c48;
            uVar17 = unaff_x22;
            goto code_r0x004d42d0;
          }
          if (uVar7 != puVar6[uVar15]) {
            puVar6[uVar15] = uVar7;
            bVar2 = true;
          }
          bVar5 = uVar15 != 0;
          uVar15 = uVar15 - 1;
          if (!bVar5) {
            uVar15 = unaff_x22 - 2;
          }
          bVar3 = (bool)(bVar5 & bVar2);
        } while ((bVar5) || (bVar2));
      }
      *(undefined8 **)(unaff_x29 + -0xd0) = puVar6;
      *(undefined8 **)(unaff_x29 + -200) = puVar6;
      *(ulong *)(unaff_x29 + -0xc0) = uVar18;
      *(undefined8 **)(unaff_x29 + -0xb8) = puVar6 + unaff_x22;
      *(undefined8 *)(unaff_x29 + -0xb0) = 0;
      *(undefined8 **)(unaff_x29 + -0xa8) = &uStack0000000000000030;
      func_0x004d7020(&uStack00000000000000d8,unaff_x29 + -0xd0);
      lVar13 = in_stack_00000090;
      *(undefined4 *)(in_stack_00000010 + 6) = in_stack_00000008._4_4_;
      in_stack_00000010[1] = in_stack_000000e0;
      *in_stack_00000010 = uStack00000000000000d8;
      in_stack_00000010[3] = in_stack_000000f0;
      in_stack_00000010[2] = in_stack_000000e8;
      in_stack_00000010[5] = in_stack_00000100;
      in_stack_00000010[4] = in_stack_000000f8;
      if (in_stack_00000098 != 0) {
        puVar6 = (undefined8 *)(in_stack_00000090 + 8);
        uVar15 = in_stack_00000098;
        do {
          if (puVar6[-1] != 0) {
            func_0x00187bd4(*puVar6,puVar6[-1] << 3,8);
          }
          puVar6 = puVar6 + 3;
          uVar15 = uVar15 - 1;
        } while (uVar15 != 0);
      }
      if (in_stack_00000088 != 0) {
        func_0x00187bd4(lVar13,in_stack_00000088 * 0x18,8);
      }
      if ((in_stack_000000a8 != 0) && (lVar13 = in_stack_000000a8 * 0x11 + 0x19, lVar13 != 0)) {
        func_0x00187bd4(in_stack_000000a0 + in_stack_000000a8 * -0x10 + -0x10,lVar13,8);
      }
      if (uStack0000000000000030 != 0) {
        func_0x00187bd4(in_stack_00000038,uStack0000000000000030 << 2,4);
      }
      return;
    }
    func_0x007a1f00(8,lVar13,&UNK_009e6be8);
  }
code_r0x004d4324:
                    /* WARNING: Does not return */
  pcVar4 = (code *)SoftwareBreakpoint(1,0x4d4328);
  (*pcVar4)();
code_r0x004d4124:
  if (puVar6[uVar9] != -1) {
    uVar7 = func_0x005e2978(puVar6);
  }
  uVar14 = uVar14 + 1;
  if (uVar12 >> 3 == uVar14) goto code_r0x004d4144;
  goto code_r0x004d4118;
}

