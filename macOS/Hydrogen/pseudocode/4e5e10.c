
/* WARNING: Possible PIC construction at 0x004e5e30: Changing call to branch */
/* WARNING: Possible PIC construction at 0x004e5ed0: Changing call to branch */
/* WARNING: Possible PIC construction at 0x004e6074: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x004e5ed4) */
/* WARNING: Removing unreachable block (ram,0x004e6078) */

void FUN_004e5e10(void)

{
  long lVar1;
  undefined1 auVar2 [16];
  undefined8 uVar3;
  code *pcVar4;
  undefined1 *puVar5;
  undefined8 uVar6;
  long lVar7;
  dword *pdVar8;
  long lVar9;
  ulong *extraout_x8;
  ulong uVar10;
  long *plVar11;
  long *plVar12;
  long lVar13;
  long unaff_x29;
  undefined1 auVar14 [16];
  long in_stack_00000000;
  long in_stack_00000008;
  undefined1 auStack_c0 [8];
  ulong uStack_b8;
  dword *pdStack_b0;
  ulong uStack_a8;
  long lStack_a0;
  long lStack_98;
  long lStack_90;
  long lStack_88;
  long lStack_78;
  undefined8 uStack_70;
  undefined8 uStack_68;
  undefined *puStack_8;
  
  uVar6 = func_0x007a1f00();
  if (in_stack_00000000 != 0) {
    lVar9 = in_stack_00000000 << 3;
    uVar6 = 8;
    puStack_8 = (undefined *)0x4e5e34;
    puVar5 = (undefined1 *)register0x00000008;
    lVar7 = in_stack_00000008;
    lVar13 = unaff_x29;
code_r0x00187bd4:
    *(long *)(puVar5 + -0x10) = lVar13;
    *(undefined **)(puVar5 + -8) = puStack_8;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)PTR__free_00a24e58)(lVar7,lVar9,uVar6);
    return;
  }
  auVar14 = __Unwind_Resume(uVar6);
  plVar12 = auVar14._0_8_;
  puVar5 = auStack_c0;
  puStack_8 = (undefined *)0x4e5e3c;
  lVar13 = (long)register0x00000008 + -0x10;
  func_0x00415368(&lStack_a0);
  lVar9 = lStack_a0;
  if (lStack_a0 == -0x8000000000000000) {
    *extraout_x8 = 0;
    extraout_x8[1] = 8;
    extraout_x8[2] = 0;
    uVar10 = plVar12[3] - plVar12[1];
    if (uVar10 != 0) {
      uVar10 = uVar10 / 0x18;
      plVar11 = (long *)(plVar12[1] + 8);
      do {
        lVar9 = plVar11[-1];
        if (lVar9 != 0) {
          lVar7 = *plVar11;
          uVar6 = 1;
          puStack_8 = &UNK_004e5ed4;
          puVar5 = auStack_c0;
          goto code_r0x00187bd4;
        }
        plVar11 = plVar11 + 3;
        uVar10 = uVar10 - 1;
      } while (uVar10 != 0);
    }
    if (plVar12[2] != 0) {
      lVar7 = *plVar12;
      lVar9 = plVar12[2] * 0x18;
      uVar6 = 8;
      puVar5 = (undefined1 *)register0x00000008;
      lVar13 = unaff_x29;
      goto code_r0x00187bd4;
    }
  }
  else {
    func_0x004153b0(&lStack_a0,plVar12);
    uVar6 = 0;
    uStack_b8 = lStack_a0 + 1;
    if (lStack_a0 == -1) {
      uStack_b8 = 0xffffffffffffffff;
    }
    if (uStack_b8 < 5) {
      uStack_b8 = 4;
    }
    uVar10 = uStack_b8 * 0x18;
    auVar2._8_8_ = 0;
    auVar2._0_8_ = uStack_b8;
    if ((SUB168(auVar2 * ZEXT816(0x18),8) != 0) || (0x7ffffffffffffff8 < uVar10)) {
code_r0x004e60c8:
      func_0x007a1f00(uVar6,uVar10,auVar14._8_8_);
                    /* WARNING: Does not return */
      pcVar4 = (code *)SoftwareBreakpoint(1,0x4e60dc);
      (*pcVar4)();
    }
    if (uVar10 == 0) {
      uStack_b8 = 0;
      pdVar8 = &MACH_HEADER.cpusubtype;
    }
    else {
      uVar6 = 8;
      pdVar8 = (dword *)func_0x00187bd0(uVar10,8);
      if (pdVar8 == (dword *)0x0) goto code_r0x004e60c8;
    }
    lVar7 = 0;
    *(long *)pdVar8 = lVar9;
    *(long *)(pdVar8 + 2) = lStack_98;
    *(long *)(pdVar8 + 4) = lStack_90;
    uStack_a8 = 1;
    lStack_98 = plVar12[1];
    lStack_a0 = *plVar12;
    lStack_88 = plVar12[3];
    lStack_90 = plVar12[2];
    pdStack_b0 = pdVar8;
    while( true ) {
      uVar10 = uStack_a8;
      func_0x00415368(&lStack_78,&lStack_a0);
      uVar3 = uStack_68;
      uVar6 = uStack_70;
      lVar9 = lStack_78;
      if (lStack_78 == -0x8000000000000000) break;
      if (uVar10 == uStack_b8) {
        func_0x004153b0(&lStack_78,&lStack_a0);
        lVar1 = lStack_78 + 1;
        if (lStack_78 == -1) {
          lVar1 = -1;
        }
        func_0x007a5594(&uStack_b8,uVar10,lVar1,8,0x18);
        pdVar8 = pdStack_b0;
      }
      *(long *)((long)pdVar8 + lVar7 + 0x18) = lVar9;
      *(undefined8 *)((long)pdVar8 + lVar7 + 0x20) = uVar6;
      *(undefined8 *)((long)pdVar8 + lVar7 + 0x28) = uVar3;
      uStack_a8 = uVar10 + 1;
      lVar7 = lVar7 + 0x18;
    }
    if (lStack_88 - lStack_98 != 0) {
      uVar10 = (ulong)(lStack_88 - lStack_98) / 0x18;
      plVar12 = (long *)(lStack_98 + 8);
      do {
        lVar9 = plVar12[-1];
        if (lVar9 != 0) {
          lVar7 = *plVar12;
          uVar6 = 1;
          puStack_8 = &UNK_004e6078;
          goto code_r0x00187bd4;
        }
        plVar12 = plVar12 + 3;
        uVar10 = uVar10 - 1;
      } while (uVar10 != 0);
    }
    if (lStack_90 != 0) {
      func_0x00187bd4(lStack_a0,lStack_90 * 0x18,8);
    }
    extraout_x8[1] = (ulong)pdStack_b0;
    *extraout_x8 = uStack_b8;
    extraout_x8[2] = uStack_a8;
  }
  return;
}

