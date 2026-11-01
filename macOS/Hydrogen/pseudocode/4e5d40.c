
/* WARNING: Possible PIC construction at 0x004e5e30: Changing call to branch */
/* WARNING: Possible PIC construction at 0x004e5ed0: Changing call to branch */
/* WARNING: Possible PIC construction at 0x004e6074: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x004e5ed4) */
/* WARNING: Removing unreachable block (ram,0x004e6078) */

void FUN_004e5d40(void)

{
  long lVar1;
  undefined1 auVar2 [16];
  undefined8 uVar3;
  code *pcVar4;
  ulong *puVar5;
  undefined8 uVar6;
  dword *pdVar7;
  long lVar8;
  ulong *extraout_x8;
  ulong *extraout_x8_00;
  ulong uVar9;
  long *plVar10;
  long *plVar11;
  long lVar12;
  undefined8 ****ppppuVar13;
  undefined *puVar14;
  undefined1 auVar15 [16];
  undefined1 auStack_160 [8];
  ulong uStack_158;
  dword *pdStack_150;
  ulong uStack_148;
  long lStack_140;
  long lStack_138;
  long lStack_130;
  long lStack_128;
  long lStack_118;
  undefined8 uStack_110;
  undefined8 uStack_108;
  undefined8 ****ppppuStack_b0;
  undefined *puStack_a8;
  ulong uStack_a0;
  ulong uStack_98;
  ulong uStack_90;
  long lStack_88;
  long lStack_80;
  long lStack_78;
  long lStack_70;
  ulong *puStack_68;
  undefined8 uStack_60;
  ulong uStack_58;
  
  auVar15 = __Unwind_Resume();
  plVar11 = auVar15._0_8_;
  lStack_88 = *plVar11;
  lStack_80 = plVar11[1];
  uVar9 = lStack_80 - lStack_88;
  if (uVar9 == 0) {
    uStack_a0 = 0;
    uStack_58 = 8;
  }
  else {
    uStack_58 = func_0x00187bd0(uVar9 >> 1,8);
    if (uStack_58 == 0) {
      uVar6 = func_0x007a1f00(8,uVar9 >> 1,auVar15._8_8_);
      if (uStack_a0 != 0) {
        lVar8 = uStack_a0 << 3;
        uVar6 = 8;
        puVar5 = &uStack_a0;
        ppppuVar13 = (undefined8 ****)((long)register0x00000008 + -0x10);
        puVar14 = (undefined *)0x4e5e34;
code_r0x00187bd4:
        *(undefined8 *****)((long)puVar5 + -0x10) = ppppuVar13;
        *(undefined **)((long)puVar5 + -8) = puVar14;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        (*(code *)PTR__free_00a24e58)(uStack_98,lVar8,uVar6);
        return;
      }
      auVar15 = __Unwind_Resume(uVar6);
      plVar11 = auVar15._0_8_;
      puVar5 = (ulong *)auStack_160;
      puStack_a8 = (undefined *)0x4e5e3c;
      ppppuVar13 = &ppppuStack_b0;
      ppppuStack_b0 = (undefined8 ****)((long)register0x00000008 + -0x10);
      func_0x00415368(&lStack_140);
      lVar8 = lStack_140;
      if (lStack_140 == -0x8000000000000000) {
        *extraout_x8_00 = 0;
        extraout_x8_00[1] = 8;
        extraout_x8_00[2] = 0;
        uVar9 = plVar11[3] - plVar11[1];
        if (uVar9 != 0) {
          uVar9 = uVar9 / 0x18;
          plVar10 = (long *)(plVar11[1] + 8);
          do {
            lVar8 = plVar10[-1];
            if (lVar8 != 0) {
              uStack_98 = *plVar10;
              uVar6 = 1;
              puVar5 = (ulong *)auStack_160;
              puVar14 = &UNK_004e5ed4;
              goto code_r0x00187bd4;
            }
            plVar10 = plVar10 + 3;
            uVar9 = uVar9 - 1;
          } while (uVar9 != 0);
        }
        if (plVar11[2] != 0) {
          uStack_98 = *plVar11;
          lVar8 = plVar11[2] * 0x18;
          uVar6 = 8;
          puVar5 = &uStack_a0;
          ppppuVar13 = ppppuStack_b0;
          puVar14 = puStack_a8;
          goto code_r0x00187bd4;
        }
      }
      else {
        func_0x004153b0(&lStack_140,plVar11);
        uVar6 = 0;
        uStack_158 = lStack_140 + 1;
        if (lStack_140 == -1) {
          uStack_158 = 0xffffffffffffffff;
        }
        if (uStack_158 < 5) {
          uStack_158 = 4;
        }
        uVar9 = uStack_158 * 0x18;
        auVar2._8_8_ = 0;
        auVar2._0_8_ = uStack_158;
        if ((SUB168(auVar2 * ZEXT816(0x18),8) != 0) || (0x7ffffffffffffff8 < uVar9)) {
code_r0x004e60c8:
          func_0x007a1f00(uVar6,uVar9,auVar15._8_8_);
                    /* WARNING: Does not return */
          pcVar4 = (code *)SoftwareBreakpoint(1,0x4e60dc);
          (*pcVar4)();
        }
        if (uVar9 == 0) {
          uStack_158 = 0;
          pdVar7 = &MACH_HEADER.cpusubtype;
        }
        else {
          uVar6 = 8;
          pdVar7 = (dword *)func_0x00187bd0(uVar9,8);
          if (pdVar7 == (dword *)0x0) goto code_r0x004e60c8;
        }
        lVar12 = 0;
        *(long *)pdVar7 = lVar8;
        *(long *)(pdVar7 + 2) = lStack_138;
        *(long *)(pdVar7 + 4) = lStack_130;
        uStack_148 = 1;
        lStack_138 = plVar11[1];
        lStack_140 = *plVar11;
        lStack_128 = plVar11[3];
        lStack_130 = plVar11[2];
        pdStack_150 = pdVar7;
        while( true ) {
          uVar9 = uStack_148;
          func_0x00415368(&lStack_118,&lStack_140);
          uVar3 = uStack_108;
          uVar6 = uStack_110;
          lVar8 = lStack_118;
          if (lStack_118 == -0x8000000000000000) break;
          if (uVar9 == uStack_158) {
            func_0x004153b0(&lStack_118,&lStack_140);
            lVar1 = lStack_118 + 1;
            if (lStack_118 == -1) {
              lVar1 = -1;
            }
            func_0x007a5594(&uStack_158,uVar9,lVar1,8,0x18);
            pdVar7 = pdStack_150;
          }
          *(long *)((long)pdVar7 + lVar12 + 0x18) = lVar8;
          *(undefined8 *)((long)pdVar7 + lVar12 + 0x20) = uVar6;
          *(undefined8 *)((long)pdVar7 + lVar12 + 0x28) = uVar3;
          uStack_148 = uVar9 + 1;
          lVar12 = lVar12 + 0x18;
        }
        if (lStack_128 - lStack_138 != 0) {
          uVar9 = (ulong)(lStack_128 - lStack_138) / 0x18;
          plVar11 = (long *)(lStack_138 + 8);
          do {
            lVar8 = plVar11[-1];
            if (lVar8 != 0) {
              uStack_98 = *plVar11;
              uVar6 = 1;
              puVar14 = &UNK_004e6078;
              goto code_r0x00187bd4;
            }
            plVar11 = plVar11 + 3;
            uVar9 = uVar9 - 1;
          } while (uVar9 != 0);
        }
        if (lStack_130 != 0) {
          func_0x00187bd4(lStack_140,lStack_130 * 0x18,8);
        }
        extraout_x8_00[1] = (ulong)pdStack_150;
        *extraout_x8_00 = uStack_158;
        extraout_x8_00[2] = uStack_148;
      }
      return;
    }
    uStack_a0 = uVar9 >> 4;
  }
  puStack_68 = &uStack_90;
  uStack_90 = 0;
  lStack_70 = plVar11[3];
  lStack_78 = plVar11[2];
  uStack_60 = 0;
  uStack_98 = uStack_58;
  func_0x0051f218(&lStack_88,&puStack_68);
  extraout_x8[1] = uStack_98;
  *extraout_x8 = uStack_a0;
  extraout_x8[2] = uStack_90;
  return;
}

