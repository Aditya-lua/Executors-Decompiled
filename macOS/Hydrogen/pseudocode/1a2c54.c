
void FUN_001a2c54(void)

{
  long *plVar1;
  undefined4 uVar2;
  undefined2 uVar3;
  undefined1 auVar4 [16];
  undefined1 auVar5 [16];
  code *pcVar6;
  long lVar7;
  ulong uVar8;
  long lVar9;
  long *extraout_x8;
  ulong *extraout_x8_00;
  ulong *extraout_x8_01;
  ulong *extraout_x8_02;
  ulong *extraout_x8_03;
  ulong *extraout_x8_04;
  long lVar10;
  long *plVar11;
  undefined8 *unaff_x20;
  ulong uVar12;
  undefined8 uVar13;
  long unaff_x22;
  ulong uVar14;
  undefined8 uVar15;
  undefined8 unaff_x24;
  long lVar16;
  long lVar17;
  byte *pbVar18;
  ulong uVar19;
  ulong uVar20;
  undefined *unaff_x27;
  undefined *unaff_x28;
  long *plVar21;
  undefined8 uStack_2e0;
  ulong uStack_2c8;
  ulong uStack_2c0;
  undefined8 uStack_220;
  ulong uStack_208;
  ulong uStack_200;
  undefined *puStack_1f8;
  undefined *puStack_1f0;
  undefined *puStack_1e8;
  undefined8 uStack_148;
  ulong uStack_138;
  ulong uStack_130;
  undefined8 uStack_c0;
  ulong uStack_b8;
  ulong uStack_b0;
  
  lVar7 = func_0x00187bd0();
  if (lVar7 != 0) {
    _memcpy(lVar7);
    *unaff_x20 = unaff_x24;
    unaff_x20[1] = lVar7;
    unaff_x20[2] = unaff_x24;
    return;
  }
  lVar7 = func_0x007a1f00(2);
  lVar10 = *(long *)(lVar7 + 0x10);
  if (lVar10 < 0) {
    uVar15 = 0;
  }
  else {
    uVar13 = *(undefined8 *)(lVar7 + 8);
    if (lVar10 == 0) {
      lVar7 = 1;
code_r0x001a2d1c:
      _memcpy(lVar7,uVar13,lVar10);
      *extraout_x8 = lVar10;
      extraout_x8[1] = lVar7;
      extraout_x8[2] = lVar10;
      return;
    }
    uVar15 = 1;
    lVar7 = func_0x00187bd0(lVar10,1);
    if (lVar7 != 0) goto code_r0x001a2d1c;
  }
  lVar7 = func_0x007a1f00(uVar15,lVar10,&UNK_009c24c0);
  uVar15 = 0;
  uVar19 = *(ulong *)(lVar7 + 0x10);
  auVar4._8_8_ = 0;
  auVar4._0_8_ = uVar19;
  uVar12 = uVar19 * 0x18;
  if ((SUB168(auVar4 * ZEXT816(0x18),8) == 0) && (uVar12 < 0x7ffffffffffffff9)) {
    if (uVar12 == 0) {
      uStack_b8 = 0;
      uStack_b0 = 8;
LAB_001a2e5c:
      extraout_x8_00[1] = uStack_b0;
      *extraout_x8_00 = uStack_b8;
      extraout_x8_00[2] = uVar19;
      return;
    }
    unaff_x27 = *(undefined **)(lVar7 + 8);
    unaff_x28 = &___rust_no_alloc_shim_is_unstable;
    uVar15 = 8;
    uStack_b0 = func_0x00187bd0(uVar12,8);
    if (uStack_b0 != 0) {
      uStack_b8 = uVar19;
      if (uVar19 != 0) {
        uVar20 = 0;
        uStack_c0 = 1;
        plVar11 = (long *)(uStack_b0 + 0x10);
        do {
          if (uVar12 == 0) break;
          lVar7 = *(long *)(unaff_x27 + 0x10);
          if (lVar7 < 0) {
            uStack_c0 = 0;
code_r0x001a2e94:
            func_0x007a1f00(uStack_c0,unaff_x22,&UNK_009c24c0);
                    /* WARNING: Does not return */
            pcVar6 = (code *)SoftwareBreakpoint(1,0x1a2eac);
            (*pcVar6)();
          }
          uVar15 = *(undefined8 *)(unaff_x27 + 8);
          if (lVar7 == 0) {
            unaff_x22 = 1;
          }
          else {
            unaff_x22 = func_0x00187bd0(lVar7,1);
            if (unaff_x22 == 0) {
              unaff_x22 = lVar7;
              goto code_r0x001a2e94;
            }
          }
          unaff_x27 = unaff_x27 + 0x18;
          uVar20 = uVar20 + 1;
          _memcpy(unaff_x22,uVar15,lVar7);
          plVar11[-2] = lVar7;
          plVar11[-1] = unaff_x22;
          uVar12 = uVar12 - 0x18;
          *plVar11 = lVar7;
          plVar11 = plVar11 + 3;
        } while (uVar19 != uVar20);
      }
      goto LAB_001a2e5c;
    }
  }
  uVar15 = func_0x007a1f00(uVar15,uVar12,&UNK_009c24a8);
  func_0x0016b01c(&uStack_b8);
  lVar7 = __Unwind_Resume(uVar15);
  uVar19 = *(ulong *)(lVar7 + 0x10);
  uVar12 = uVar19 * 0x20;
  if (uVar19 >> 0x3b == 0 && uVar12 < 0x7ffffffffffffff9) {
    if (uVar12 == 0) {
      uStack_138 = 0;
      uStack_130 = 8;
code_r0x001a2fd4:
      extraout_x8_01[1] = uStack_130;
      *extraout_x8_01 = uStack_138;
      extraout_x8_01[2] = uVar19;
      return;
    }
    unaff_x28 = *(undefined **)(lVar7 + 8);
    unaff_x27 = &___rust_no_alloc_shim_is_unstable;
    uVar15 = 8;
    uStack_130 = func_0x00187bd0(uVar12,8);
    if (uStack_130 != 0) {
      uStack_138 = uVar19;
      if (uVar19 != 0) {
        uVar20 = 0;
        plVar11 = (long *)(uStack_130 + 0x10);
        uStack_148 = 1;
        do {
          if (uVar12 == 0) break;
          lVar7 = *(long *)(unaff_x28 + 0x10);
          if (lVar7 < 0) {
            uStack_148 = 0;
LAB_001a3010:
            func_0x007a1f00(uStack_148,unaff_x22,&UNK_009c24c0);
                    /* WARNING: Does not return */
            pcVar6 = (code *)SoftwareBreakpoint(1,0x1a3028);
            (*pcVar6)();
          }
          uVar15 = *(undefined8 *)(unaff_x28 + 8);
          if (lVar7 == 0) {
            unaff_x22 = 1;
          }
          else {
            unaff_x22 = func_0x00187bd0(lVar7,1);
            if (unaff_x22 == 0) {
              unaff_x22 = lVar7;
              goto LAB_001a3010;
            }
          }
          uVar20 = uVar20 + 1;
          _memcpy(unaff_x22,uVar15,lVar7);
          uVar2 = *(undefined4 *)(unaff_x28 + 0x18);
          plVar11[-2] = lVar7;
          plVar11[-1] = unaff_x22;
          *plVar11 = lVar7;
          *(undefined4 *)(plVar11 + 1) = uVar2;
          uVar12 = uVar12 - 0x20;
          plVar11 = plVar11 + 4;
          unaff_x28 = unaff_x28 + 0x20;
        } while (uVar19 != uVar20);
      }
      goto code_r0x001a2fd4;
    }
  }
  else {
    uVar15 = 0;
  }
  uVar15 = func_0x007a1f00(uVar15,uVar12,&UNK_009c24a8);
  func_0x001a0dec(&uStack_138);
  lVar7 = __Unwind_Resume(uVar15);
  uVar19 = *(ulong *)(lVar7 + 0x10);
  uVar12 = uVar19 * 8;
  if (uVar19 >> 0x3d == 0 && uVar12 < 0x7fffffffffffffff) {
    uVar15 = *(undefined8 *)(lVar7 + 8);
    if (uVar12 == 0) {
      uVar20 = 0;
      uVar8 = 2;
code_r0x001a30c8:
      _memcpy(uVar8,uVar15,uVar12);
      *extraout_x8_02 = uVar20;
      extraout_x8_02[1] = uVar8;
      extraout_x8_02[2] = uVar19;
      return;
    }
    lVar7 = 2;
    uVar8 = func_0x00187bd0(uVar12,2);
    if (uVar8 != 0) {
      uVar20 = uVar19;
      goto code_r0x001a30c8;
    }
  }
  else {
    lVar7 = 0;
  }
  lVar10 = func_0x007a1f00(lVar7,uVar12,&UNK_009c24c0);
  uVar12 = *(ulong *)(lVar10 + 0x10);
  uVar19 = uVar12 * 0x20;
  puStack_1f0 = unaff_x28;
  puStack_1e8 = unaff_x27;
  if (uVar12 >> 0x3b == 0 && uVar19 < 0x7ffffffffffffff9) {
    if (uVar19 == 0) {
      uStack_208 = 0;
      uStack_200 = 8;
code_r0x001a3274:
      extraout_x8_03[1] = uStack_200;
      *extraout_x8_03 = uStack_208;
      extraout_x8_03[2] = uVar12;
      return;
    }
    plVar11 = *(long **)(lVar10 + 8);
    uVar15 = 8;
    uVar20 = func_0x00187bd0(uVar19,8);
    if (uVar20 != 0) {
      uStack_208 = uVar12;
      uStack_200 = uVar20;
      if (uVar12 != 0) {
        uVar14 = 0;
        uVar8 = 0;
        uStack_220 = 1;
        plVar21 = plVar11;
        do {
          if (uVar19 == uVar14) break;
          lVar10 = plVar21[3];
          uVar3 = *(undefined2 *)((long)plVar21 + 0x1a);
          if (*plVar21 == -0x8000000000000000) {
            lVar9 = *(long *)((long)plVar11 + uVar14 + 8);
            lVar17 = *(long *)((long)plVar11 + uVar14 + 0x10);
            lVar16 = -0x8000000000000000;
          }
          else {
            lVar17 = *(long *)((long)plVar11 + uVar14 + 0x10);
            if (lVar17 < 0) {
              uStack_220 = 0;
code_r0x001a32b4:
              func_0x007a1f00(uStack_220,lVar7,&UNK_009c24c0);
                    /* WARNING: Does not return */
              pcVar6 = (code *)SoftwareBreakpoint(1,0x1a32c8);
              (*pcVar6)();
            }
            uVar15 = *(undefined8 *)((long)plVar11 + uVar14 + 8);
            if (lVar17 == 0) {
              lVar9 = 1;
            }
            else {
              lVar9 = func_0x00187bd0(lVar17,1);
              if (lVar9 == 0) {
                lVar7 = lVar17;
                goto code_r0x001a32b4;
              }
            }
            _memcpy(lVar9,uVar15,lVar17);
            lVar7 = lVar9;
            lVar16 = lVar17;
          }
          plVar21 = plVar21 + 4;
          uVar8 = uVar8 + 1;
          plVar1 = (long *)(uVar20 + uVar14);
          *plVar1 = lVar16;
          plVar1[1] = lVar9;
          plVar1[2] = lVar17;
          *(short *)(plVar1 + 3) = (short)lVar10;
          uVar14 = uVar14 + 0x20;
          *(undefined2 *)((long)plVar1 + 0x1a) = uVar3;
        } while (uVar12 != uVar8);
      }
      goto code_r0x001a3274;
    }
  }
  else {
    uVar15 = 0;
  }
  uVar15 = func_0x007a1f00(uVar15,uVar19,&UNK_009c24a8);
  puStack_1f8 = unaff_x27;
  func_0x0016b1dc(&uStack_208);
  lVar10 = __Unwind_Resume(uVar15);
  uVar15 = 0;
  uVar19 = *(ulong *)(lVar10 + 0x10);
  auVar5._8_8_ = 0;
  auVar5._0_8_ = uVar19;
  uVar12 = uVar19 * 0x28;
  if ((SUB168(auVar5 * ZEXT816(0x28),8) != 0) || (0x7ffffffffffffff8 < uVar12)) {
code_r0x001a374c:
    func_0x007a1f00(uVar15,uVar12,&UNK_009c24a8);
    func_0x007a1f00(uStack_2e0,lVar7,&UNK_009c24c0);
                    /* WARNING: Does not return */
    pcVar6 = (code *)SoftwareBreakpoint(1,0x1a37ac);
    (*pcVar6)();
  }
  if (uVar12 == 0) {
    uStack_2c8 = 0;
    uStack_2c0 = 8;
  }
  else {
    pbVar18 = *(byte **)(lVar10 + 8);
    uVar15 = 8;
    uStack_2c0 = func_0x00187bd0(uVar12,8);
    if (uStack_2c0 == 0) goto code_r0x001a374c;
    uStack_2c8 = uVar19;
    if ((uVar19 != 0) && (uVar12 != 0)) {
                    /* WARNING: Could not recover jumptable at 0x001a3424. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*(code *)(&UNK_001a33d8 + (ulong)(byte)(&UNK_0081d4c6)[*pbVar18] * 4))();
      return;
    }
  }
  extraout_x8_04[1] = uStack_2c0;
  *extraout_x8_04 = uStack_2c8;
  extraout_x8_04[2] = uVar19;
  return;
}

