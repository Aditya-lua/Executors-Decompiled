
/* WARNING: Possible PIC construction at 0x005a2e60: Changing call to branch */
/* WARNING: Possible PIC construction at 0x005a3284: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x005a3288) */
/* WARNING: Removing unreachable block (ram,0x005a2f14) */
/* WARNING: Removing unreachable block (ram,0x005a2ef4) */

void FUN_005a2e40(undefined8 param_1)

{
  undefined8 *****pppppuVar1;
  uint uVar2;
  undefined1 auVar3 [16];
  code *pcVar4;
  long lVar5;
  undefined8 *puVar6;
  dword *pdVar7;
  undefined8 *puVar8;
  undefined8 uVar9;
  long lVar10;
  ulong *extraout_x8;
  ulong uVar11;
  undefined8 *extraout_x8_00;
  undefined8 *puVar12;
  undefined8 *puVar13;
  undefined8 *unaff_x21;
  ulong uVar14;
  dword *pdVar15;
  undefined8 *puVar16;
  ulong uVar17;
  undefined8 unaff_x29;
  undefined8 *****pppppuVar18;
  undefined8 uVar19;
  undefined *puVar20;
  undefined1 auVar21 [16];
  undefined1 auVar22 [16];
  long in_stack_00000008;
  undefined8 in_stack_00000010;
  undefined1 uStack0000000000000020;
  undefined1 auStack_170 [8];
  undefined8 *puStack_168;
  dword *pdStack_160;
  undefined8 *puStack_158;
  undefined8 uStack_150;
  undefined8 *puStack_148;
  undefined8 uStack_140;
  undefined8 *puStack_138;
  undefined8 uStack_128;
  undefined8 uStack_120;
  undefined8 uStack_118;
  ulong uStack_110;
  undefined8 uStack_108;
  undefined8 *puStack_100;
  undefined1 auStack_f8 [16];
  undefined8 *****pppppuStack_d0;
  undefined *puStack_c8;
  undefined1 auStack_c0 [8];
  ulong uStack_b8;
  ulong uStack_b0;
  ulong uStack_a8;
  undefined8 uStack_a0;
  undefined8 uStack_98;
  undefined8 uStack_90;
  undefined8 uStack_88;
  undefined8 uStack_80;
  undefined8 uStack_78;
  undefined8 uStack_70;
  undefined8 uStack_68;
  
  func_0x0059dfd0(&uStack0000000000000020);
  if (in_stack_00000008 != 0) {
    lVar10 = in_stack_00000008 << 3;
    uVar19 = 0x5a2e64;
    uVar9 = in_stack_00000010;
    goto code_r0x00187bd4;
  }
  auVar21 = __Unwind_Resume(param_1);
  auVar21._0_8_ = auVar21._0_8_;
  pppppuVar18 = (undefined8 *****)((long)register0x00000008 + -0x10);
  puVar13 = *(undefined8 **)(auVar21._0_8_ + 4);
  uVar2 = *auVar21._0_8_;
  if (puVar13 == (undefined8 *)0x0) {
    if ((uVar2 & 1) == 0) {
      uVar11 = 0;
      puVar16 = (undefined8 *)0x0;
    }
    else {
      uVar11 = (ulong)(*(long *)(auVar21._0_8_ + 2) != 0);
      puVar16 = (undefined8 *)(uVar11 << 6);
    }
LAB_005a2f2c:
    uVar19 = 0;
    if (puVar16 < (undefined8 *)0x7ffffffffffffff9) {
      if (puVar16 == (undefined8 *)0x0) {
        uStack_b8 = 0;
        uStack_b0 = 8;
        lVar10 = *(long *)(auVar21._0_8_ + 2);
        puVar16 = *(undefined8 **)(auVar21._0_8_ + 6);
        if (puVar13 != (undefined8 *)0x0) goto code_r0x005a2f74;
LAB_005a3030:
        if ((uVar2 & 1) == 0) {
          uVar11 = 0;
          goto LAB_005a3068;
        }
        uVar11 = (ulong)(lVar10 != 0);
        if (uVar11 <= uStack_b8) goto code_r0x005a2f94;
LAB_005a3044:
        uStack_a8 = 0;
        func_0x007af5a0(&uStack_b8,0,uVar11,8,0x40);
        uVar14 = uStack_b0;
        uVar11 = uStack_a8;
      }
      else {
        uVar19 = 8;
        uStack_b0 = func_0x00187bd0(puVar16,8);
        if (uStack_b0 == 0) goto LAB_005a3094;
        lVar10 = *(long *)(auVar21._0_8_ + 2);
        puVar16 = *(undefined8 **)(auVar21._0_8_ + 6);
        uStack_b8 = uVar11;
        if (puVar13 == (undefined8 *)0x0) goto LAB_005a3030;
code_r0x005a2f74:
        uVar14 = (ulong)((long)puVar16 - (long)puVar13) >> 6;
        uVar11 = uVar14;
        if (lVar10 != 0) {
          uVar11 = uVar14 + 1;
        }
        if ((uVar2 & 1) == 0) {
          uVar11 = uVar14;
        }
        if (uStack_b8 < uVar11) goto LAB_005a3044;
code_r0x005a2f94:
        uVar11 = 0;
        uVar14 = uStack_b0;
      }
      uStack_b0 = uVar14;
      uStack_a8 = uVar11;
      if ((puVar13 != (undefined8 *)0x0) && (puVar13 != puVar16)) {
        uVar17 = (ulong)((long)puVar16 - (long)puVar13) >> 6;
        puVar16 = (undefined8 *)(uVar14 + uVar11 * 0x40);
        do {
          func_0x005d36b4(&uStack_a0,puVar13);
          puVar16[5] = uStack_78;
          puVar16[4] = uStack_80;
          puVar16[7] = uStack_68;
          puVar16[6] = uStack_70;
          puVar16[1] = uStack_98;
          *puVar16 = uStack_a0;
          puVar16[3] = uStack_88;
          puVar16[2] = uStack_90;
          uVar11 = uVar11 + 1;
          puVar13 = puVar13 + 8;
          uVar17 = uVar17 - 1;
          puVar16 = puVar16 + 8;
        } while (uVar17 != 0);
      }
      if ((uVar2 & lVar10 != 0) != 0) {
        func_0x005be2c8(&uStack_a0,lVar10);
        puVar13 = (undefined8 *)(uVar14 + uVar11 * 0x40);
        puVar13[1] = uStack_98;
        *puVar13 = uStack_a0;
        puVar13[3] = uStack_88;
        puVar13[2] = uStack_90;
        puVar13[5] = uStack_78;
        puVar13[4] = uStack_80;
        puVar13[7] = uStack_68;
        puVar13[6] = uStack_70;
        uVar11 = uVar11 + 1;
      }
LAB_005a3068:
      extraout_x8[1] = uStack_b0;
      *extraout_x8 = uStack_b8;
      extraout_x8[2] = uVar11;
      return;
    }
  }
  else {
    if ((uVar2 & 1) == 0) {
      uVar11 = (ulong)(*(long *)(auVar21._0_8_ + 6) - (long)puVar13) >> 6;
      puVar16 = (undefined8 *)(uVar11 << 6);
      goto LAB_005a2f2c;
    }
    uVar11 = (ulong)(*(long *)(auVar21._0_8_ + 6) - (long)puVar13) >> 6;
    if (*(long *)(auVar21._0_8_ + 2) != 0) {
      uVar11 = uVar11 + 1;
    }
    uVar19 = 0;
    puVar16 = (undefined8 *)(uVar11 << 6);
    if (uVar11 >> 0x3a == 0) goto LAB_005a2f2c;
  }
LAB_005a3094:
  puVar6 = (undefined8 *)func_0x007a1f00(uVar19,puVar16,auVar21._8_8_);
  func_0x0059e200(&uStack_b8);
  __Unwind_Resume(puVar6);
  auVar22 = func_0x007a2668();
  puVar8 = auVar22._0_8_;
  uStack_110 = (ulong)uVar2;
  uStack_108 = uVar19;
  puStack_100 = puVar16;
  auStack_f8 = auVar21;
  pppppuStack_d0 = pppppuVar18;
  puStack_c8 = &DAT_005a30cc;
  pppppuVar1 = &pppppuStack_d0;
  puVar12 = (undefined8 *)puVar8[1];
  if (puVar12 == (undefined8 *)puVar8[3]) {
    *extraout_x8_00 = 0;
    extraout_x8_00[1] = 8;
    extraout_x8_00[2] = 0;
    puVar20 = &DAT_005a30cc;
    register0x00000008 = (BADSPACEBASE *)auStack_c0;
  }
  else {
    uVar14 = 0;
    puStack_148 = (undefined8 *)*puVar12;
    puVar8[1] = puVar12 + 2;
    uStack_150 = 0x8000000000000000;
    uVar11 = (ulong)((long)puVar8[3] - (long)(puVar12 + 2)) >> 4;
    if (uVar11 < 4) {
      uVar11 = 3;
    }
    puVar13 = (undefined8 *)(uVar11 + 1);
    pdVar15 = (dword *)((long)puVar13 * 0x18);
    auVar3._8_8_ = 0;
    auVar3._0_8_ = puVar13;
    if ((SUB168(auVar3 * ZEXT816(0x18),8) != 0) || ((dword *)0x7ffffffffffffff8 < pdVar15)) {
code_r0x005a3178:
      func_0x007a1f00(uVar14,pdVar15,auVar22._8_8_);
                    /* WARNING: Does not return */
      pcVar4 = (code *)SoftwareBreakpoint(1,0x5a318c);
      (*pcVar4)();
    }
    if (pdVar15 == (dword *)0x0) {
      puVar13 = (undefined8 *)0x0;
      pdVar7 = &MACH_HEADER.cpusubtype;
    }
    else {
      uVar14 = 8;
      pdVar7 = (dword *)func_0x00187bd0(pdVar15,8);
      auVar21 = auStack_f8;
      if (pdVar7 == (dword *)0x0) goto code_r0x005a3178;
    }
    *(undefined8 *)(pdVar7 + 4) = uStack_140;
    *(undefined8 **)(pdVar7 + 2) = puStack_148;
    *(undefined8 *)pdVar7 = uStack_150;
    puStack_168 = puVar13;
    pdStack_160 = pdVar7;
    puStack_158 = (undefined8 *)((long)&MACH_HEADER.magic + 1);
    puVar16 = (undefined8 *)puVar8[1];
    unaff_x21 = (undefined8 *)puVar8[3];
    uStack_150 = *puVar8;
    puStack_138 = unaff_x21;
    uStack_140 = puVar8[2];
    if (puVar16 == unaff_x21) {
      puVar13 = puVar8;
      auStack_f8 = auVar21;
    }
    else {
      uVar14 = (long)unaff_x21 + (-0x10 - (long)puVar16);
      pdVar15 = &MACH_HEADER.flags;
      puVar8 = puVar16;
      puStack_148 = puVar16;
      do {
        puVar13 = puStack_158;
        puVar16 = puVar8 + 2;
        uStack_128 = 0x8000000000000000;
        uStack_120 = *puVar8;
        if (puStack_158 == puStack_168) {
          auStack_f8 = auVar21;
          func_0x007af5a0(&puStack_168,puStack_158,(uVar14 >> 4) + 1,8,0x18);
          pdVar7 = pdStack_160;
          auVar21 = auStack_f8;
        }
        puVar8 = (undefined8 *)((long)pdVar7 + (long)pdVar15);
        puVar8[2] = uStack_118;
        puVar8[1] = uStack_120;
        *puVar8 = uStack_128;
        puStack_158 = (undefined8 *)((long)puVar13 + 1U);
        pdVar15 = pdVar15 + 6;
        uVar14 = uVar14 - 0x10;
        puVar13 = (undefined8 *)((long)puVar13 + 1U);
        puVar8 = puVar16;
        auStack_f8 = auVar21;
      } while (puVar16 != unaff_x21);
    }
    auVar21._8_8_ = uVar14;
    auVar21._0_8_ = pdVar15;
    puStack_148 = puVar16;
    puVar8 = &uStack_150;
    puVar20 = &UNK_005a3288;
    register0x00000008 = (BADSPACEBASE *)auStack_170;
    puVar6 = extraout_x8_00;
    pppppuVar18 = pppppuVar1;
  }
  *(undefined8 **)((long)register0x00000008 + -0x40) = puVar16;
  *(undefined1 (*) [16])((long)register0x00000008 + -0x38) = auVar21;
  *(undefined8 **)((long)register0x00000008 + -0x28) = unaff_x21;
  *(undefined8 **)((long)register0x00000008 + -0x20) = puVar13;
  *(undefined8 **)((long)register0x00000008 + -0x18) = puVar6;
  *(undefined8 ******)((long)register0x00000008 + -0x10) = pppppuVar18;
  *(undefined **)((long)register0x00000008 + -8) = puVar20;
  puVar13 = (undefined8 *)puVar8[1];
  if (puVar8[3] - (long)puVar13 != 0) {
    lVar10 = 1 - ((ulong)(puVar8[3] - (long)puVar13) >> 4);
    do {
      lVar5 = *(long *)*puVar13;
      *(long *)*puVar13 = lVar5 + -1;
      LORelease();
      if (lVar5 == 1) {
        func_0x005d2ac4(puVar13);
      }
      puVar13 = puVar13 + 2;
      lVar10 = lVar10 + 1;
    } while (lVar10 != 1);
  }
  if (puVar8[2] == 0) {
    return;
  }
  uVar9 = *puVar8;
  lVar10 = puVar8[2] << 4;
  unaff_x29 = *(undefined8 *)((long)register0x00000008 + -0x10);
  uVar19 = *(undefined8 *)((long)register0x00000008 + -8);
code_r0x00187bd4:
  *(undefined8 *)((long)register0x00000008 + -0x10) = unaff_x29;
  *(undefined8 *)((long)register0x00000008 + -8) = uVar19;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(uVar9,lVar10,8);
  return;
}

