
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

uint FUN_004c7a28(undefined8 param_1)

{
  long *plVar1;
  dword dVar2;
  undefined4 uVar3;
  dword *pdVar4;
  code *pcVar5;
  uint uVar6;
  int iVar7;
  long lVar8;
  long lVar9;
  dword *pdVar10;
  ulong uVar11;
  long lVar12;
  uint uVar13;
  int unaff_w26;
  undefined4 *puVar15;
  undefined4 *puVar14;
  undefined1 auVar16 [16];
  long in_stack_00000018;
  undefined8 in_stack_00000020;
  long in_stack_00000030;
  undefined8 in_stack_00000038;
  long in_stack_00000048;
  undefined8 in_stack_00000050;
  undefined8 uStack00000000000000c0;
  long lStack_1b0;
  ulong uStack_1a8;
  ulong uStack_1a0;
  long *plStack_198;
  long lStack_190;
  dword *pdStack_188;
  undefined8 uStack_180;
  long *plStack_178;
  undefined8 uStack_170;
  undefined8 uStack_168;
  undefined8 uStack_160;
  long lStack_158;
  undefined8 uStack_150;
  long lStack_130;
  ulong uStack_128;
  ulong uStack_120;
  long *plStack_118;
  undefined8 uStack_110;
  undefined8 uStack_108;
  undefined8 uStack_100;
  long lStack_f0;
  ulong uStack_e8;
  ulong uStack_e0;
  long *plStack_d8;
  undefined8 uStack_d0;
  undefined8 uStack_c8;
  undefined8 uStack_c0;
  long lStack_b8;
  undefined4 *puStack_b0;
  long lStack_a8;
  long lStack_a0;
  dword *pdStack_98;
  ulong uStack_90;
  long *plStack_88;
  undefined8 uStack_80;
  undefined8 uStack_78;
  undefined8 uStack_70;
  
  if ((unaff_w26 != 0) && (uStack00000000000000c0 != -0x8000000000000000)) {
    func_0x004bb334(&uStack00000000000000c0);
  }
  if (in_stack_00000048 != 0) {
    func_0x00187bd4(in_stack_00000050,in_stack_00000048 << 2,4);
  }
  if (in_stack_00000030 != 0) {
    func_0x00187bd4(in_stack_00000038,in_stack_00000030 << 2,4);
  }
  if (in_stack_00000018 != 0) {
    func_0x00187bd4(in_stack_00000020,in_stack_00000018 << 2,4);
  }
  lVar8 = __Unwind_Resume(param_1);
  if (*(int *)(lVar8 + 0x78) == 1) {
    lVar12 = lVar8 + 0x18;
    dVar2 = *(dword *)(lVar8 + 0x7c);
    uVar11 = *(long *)(lVar8 + 0x28) << 5;
    do {
      if (uVar11 == 0) {
        lVar9 = 0;
        goto LAB_004c7b80;
      }
      plVar1 = (long *)(*(long *)(lVar8 + 0x20) + -0x20 + uVar11);
      uVar11 = uVar11 - 0x20;
    } while (*plVar1 == -0x8000000000000000);
    lVar9 = (uVar11 >> 5 & 0xffffffff) + 1;
LAB_004c7b80:
    func_0x005e32c0(&plStack_88,lVar9);
    lStack_a0 = 0;
    pdStack_98 = &MACH_HEADER.cputype;
    uStack_90 = 0;
    func_0x005bcf2c(&lStack_a0,&UNK_009e6e70);
    *pdStack_98 = dVar2;
    plStack_178 = plStack_88;
    uStack_180 = 1;
    uStack_168 = uStack_78;
    uStack_170 = uStack_80;
    pdStack_188 = pdStack_98;
    lStack_190 = lStack_a0;
    pdStack_98 = (dword *)_UNK_009e5898;
    lStack_a0 = _UNK_009e5890;
    plStack_88 = _UNK_009e58a8;
    uStack_90 = _UNK_009e58a0;
    uStack_160 = uStack_70;
    lStack_158 = lVar12;
    func_0x004dc6e4(&lStack_190,&lStack_a0);
    uStack_1a8 = (ulong)pdStack_98;
    lStack_1b0 = lStack_a0;
    plStack_198 = plStack_88;
    uStack_1a0 = uStack_90;
    if ((*(uint *)(lVar8 + 0x78) & 1) != 0) {
      func_0x004d6960(&lStack_190,lVar12,*(undefined4 *)(lVar8 + 0x7c));
      if (*(int *)(lVar8 + 0x78) == 1) {
        func_0x004d4468(&lStack_130,lVar12,*(undefined4 *)(lVar8 + 0x7c));
        func_0x004c6904(&lStack_f0,lVar12);
        uVar13 = 0;
        while( true ) {
          auVar16 = func_0x004d6a9c(&lStack_190,lVar12);
          if ((auVar16._0_8_ & 1) == 0) break;
          uVar6 = func_0x004c6b1c(lVar8,auVar16._8_8_,&lStack_130,&lStack_f0);
          if ((uVar6 & 1) == 0) {
            uVar13 = uVar13 | uVar6;
          }
          else {
            if (*(int *)(lVar8 + 0x78) != 1) {
              func_0x007a23bc(&UNK_009e6858);
              goto code_r0x004c7fbc;
            }
            func_0x004d4468(&lStack_a0,lVar12,*(undefined4 *)(lVar8 + 0x7c));
            if ((uStack_128 != 0) && (lVar9 = uStack_128 * 9 + 0x11, lVar9 != 0)) {
              func_0x00187bd4(lStack_130 + uStack_128 * -8 + -8,lVar9,8);
            }
            uStack_128 = (ulong)pdStack_98;
            lStack_130 = lStack_a0;
            plStack_118 = plStack_88;
            uStack_120 = uStack_90;
            uStack_108 = uStack_78;
            uStack_110 = uStack_80;
            uStack_100 = uStack_70;
            func_0x004c6904(&lStack_a0,lVar12);
            if ((uStack_e8 != 0) && (lVar9 = uStack_e8 * 9 + 0x11, lVar9 != 0)) {
              func_0x00187bd4(lStack_f0 + uStack_e8 * -8 + -8,lVar9,8);
            }
            uStack_e8 = (ulong)pdStack_98;
            lStack_f0 = lStack_a0;
            plStack_d8 = plStack_88;
            uStack_e0 = uStack_90;
            uStack_c8 = uStack_78;
            uStack_d0 = uStack_80;
            uStack_c0 = uStack_70;
            uVar13 = uVar13 | uVar6;
          }
        }
        lStack_a0 = *(long *)(lVar8 + 0x20);
        pdStack_98 = (dword *)(lStack_a0 + *(long *)(lVar8 + 0x28) * 0x20);
        plStack_88 = &lStack_1b0;
        uStack_90 = 0;
        func_0x004cf598(&lStack_b8,&lStack_a0,&UNK_009e5910);
        if (lStack_a8 != 0) {
          puVar14 = puStack_b0;
          do {
            puVar15 = puVar14 + 1;
            uVar3 = *puVar14;
            iVar7 = func_0x00584798(lVar8,uVar3);
            if ((iVar7 != 0) &&
               (func_0x0058485c(&lStack_a0,lVar8,uVar3), pdStack_98 <= (uStack_90 & 0xffffffff))) {
              uVar11 = uStack_90 >> 0x20;
              if (uVar11 < pdStack_98) {
                do {
                  lVar12 = lStack_a0 + uVar11 * 0x30;
                  if (*(int *)(lVar12 + 0x28) != (int)plStack_88) goto code_r0x004c7d7c;
                  uVar11 = (ulong)*(uint *)(lVar12 + 0x24);
                } while (uVar11 < pdStack_98);
              }
              lVar12 = func_0x005847cc(lVar8,uVar3);
              if (lVar12 == 0) {
                func_0x007a23bc(&UNK_009e6870);
                goto code_r0x004c7fbc;
              }
              if ((*(long *)(lVar12 + 0x10) == 0) ||
                 (*(long *)(*(long *)(lVar12 + 8) + 0x18) != 0x12)) {
                func_0x00584fc4(&lStack_a0,lVar8,uVar3);
                pdVar4 = pdStack_98;
                lVar12 = lStack_a0;
                if (lStack_a0 != -0x8000000000000000) {
                  lVar9 = uStack_90 + 1;
                  pdVar10 = pdStack_98;
                  while (lVar9 = lVar9 + -1, lVar9 != 0) {
                    func_0x004caae8(pdVar10);
                    pdVar10 = (dword *)((long)pdVar10 + 0x108);
                  }
                  if (lVar12 != 0) {
                    func_0x00187bd4(pdVar4,lVar12 * 0x108,8);
                  }
                }
              }
              else {
                uVar6 = func_0x004c6b1c(lVar8,uVar3,&lStack_130,&lStack_f0);
                uVar13 = uVar13 | uVar6;
              }
            }
code_r0x004c7d7c:
            puVar14 = puVar15;
          } while (puVar15 != puStack_b0 + lStack_a8);
        }
        if (lStack_b8 != 0) {
          func_0x00187bd4(puStack_b0,lStack_b8 << 2,4);
        }
        if ((uStack_e8 != 0) && (lVar8 = uStack_e8 * 9 + 0x11, lVar8 != 0)) {
          func_0x00187bd4(lStack_f0 + uStack_e8 * -8 + -8,lVar8,8);
        }
        if ((uStack_128 != 0) && (lVar8 = uStack_128 * 9 + 0x11, lVar8 != 0)) {
          func_0x00187bd4(lStack_130 + uStack_128 * -8 + -8,lVar8,8);
        }
        if (lStack_190 != 0) {
          func_0x00187bd4(pdStack_188,lStack_190 << 2,4);
        }
        if (plStack_178 != (long *)0x0) {
          func_0x00187bd4(uStack_170,(long)plStack_178 << 2,4);
        }
        if (lStack_158 != 0) {
          func_0x00187bd4(uStack_150,lStack_158 << 2,4);
        }
        if (uStack_1a8 != 0) {
          uVar11 = uStack_1a8 * 4 + 0xb & 0xfffffffffffffff8;
          lVar8 = uStack_1a8 + uVar11 + 9;
          if (lVar8 != 0) {
            func_0x00187bd4(lStack_1b0 - uVar11,lVar8,8);
          }
        }
        return uVar13 & 1;
      }
      func_0x007a23bc(&UNK_009e6840);
      goto code_r0x004c7fbc;
    }
  }
  else {
    func_0x007a23bc(&UNK_009e6810);
  }
  func_0x007a23bc(&UNK_009e6828);
code_r0x004c7fbc:
                    /* WARNING: Does not return */
  pcVar5 = (code *)SoftwareBreakpoint(1,0x4c7fc0);
  (*pcVar5)();
}

